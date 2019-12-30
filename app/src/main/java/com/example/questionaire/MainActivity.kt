package com.example.questionaire

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.questionaire.adapter.QuestionAdapter
import com.example.questionaire.api.APIs
import com.example.questionaire.models.getQuestions;
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject
import com.example.questionaire.utils.HTTPHelper;
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException

class MainActivity : AppCompatActivity() {
    val answers = HashMap<String, String>()
    val questions = getQuestions()
    val baseUrl = "http://47.92.166.81:8080/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layoutManager = LinearLayoutManager(this)
        questionaire_list.layoutManager = layoutManager
        val questionAdapter = QuestionAdapter(questions, answers)
        questionaire_list.adapter = questionAdapter
        val retrofit = Retrofit
            .Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient())
            .build()
        submit.setOnClickListener{
            var score = 0
            val values = answers.values;
            values.forEach{
                if(it=="") {
                    AlertDialog.Builder(this).setTitle("有问题未填写").setMessage("请核对")
                        .setPositiveButton("确定", { dialogInterface, i -> }).show()
                    return@setOnClickListener
                }
            }

            val json = JSONObject(answers as Map<String, String>)
            answers.values.forEach{
                if(!it.equals("")){
                    score += it.split("#")[1].toInt()
                }
            }
            AlertDialog.Builder(this).setTitle("得分结果").setMessage("${score}分").setPositiveButton("确定",{ dialogInterface: DialogInterface, i: Int -> }).show();
            Log.i("data", json.toString())
            val apis = retrofit.create(APIs::class.java)
            val message = HashMap<String, Map<String, String>>()
            message.put("postdata", answers)
            val callback = apis.submit(message)
            callback.enqueue(object : retrofit2.Callback<Int> {
                override fun onFailure(p0: retrofit2.Call<Int>, p1: Throwable) {
                    Log.i("data","插入失败")
                    p1.printStackTrace()
                }

                override fun onResponse(p0: retrofit2.Call<Int>, p1: retrofit2.Response<Int>) {
                    Log.i("data", "插入${p1.body()}")
                }


            })
        }
    }

    override fun onStart() {
        super.onStart()
        questions.forEach{
            answers.put(it.quesetion, "")
        }
    }
}
