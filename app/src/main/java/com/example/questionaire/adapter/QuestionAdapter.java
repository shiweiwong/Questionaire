package com.example.questionaire.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.questionaire.R;
import com.example.questionaire.models.Question;

import java.util.List;
import java.util.Map;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.ViewHolder>{
    private List<Question> questions;
    private Map<String, String> answers;

    public QuestionAdapter(List<Question> questions, Map<String, String> answers){
        this.questions = questions;
        this.answers = answers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.question_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Question question = questions.get(position);
        holder.question.setText((position+1)+":"+question.getQuesetion());
        holder.symbol.setText(question.getSymbol());
        holder.answers.clearCheck();
        if (0 != question.getCheck()) {
            holder.answers.check(question.getCheck());
        }
        holder.answers.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.item_answerA: answers.put(question.getQuesetion(), question.getAnswerA()+"#1");question.setCheck(R.id.item_answerA);break;
                    case R.id.item_answerB: answers.put(question.getQuesetion(), question.getAnswerB()+"#2");question.setCheck(R.id.item_answerB);break;
                    case R.id.item_answerC: answers.put(question.getQuesetion(), question.getAnswerC()+"#3");question.setCheck(R.id.item_answerC);break;
                    default:break;
                }
            }
        });
        holder.answerA.setText(question.getAnswerA());
        holder.answerB.setText(question.getAnswerB());
        holder.answerC.setText(question.getAnswerC());
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView question;
        TextView symbol;
        RadioButton answerA;
        RadioButton answerB;
        RadioButton answerC;
        RadioGroup answers;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            question = itemView.findViewById(R.id.item_question);
            answerA = itemView.findViewById(R.id.item_answerA);
            answerB = itemView.findViewById(R.id.item_answerB);
            answerC = itemView.findViewById(R.id.item_answerC);
            answers = itemView.findViewById(R.id.item_answers);
            symbol = itemView.findViewById(R.id.item_symbol);
        }
    }

}
