package com.example.questionaire.api;

import android.content.Context;
import com.google.gson.Gson;
import okhttp3.*;
import okio.Buffer;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RetrofitHttpRequest {
    private static String base_url = "http://47.92.166.81:8080/";
    private static final long DEFAULT_TIMEOUT = 60;
    private volatile static RetrofitHttpRequest mInstance;
    public Retrofit mRetrofit;
    public APIs mAPIs;

    private RetrofitHttpRequest() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(this.base_url)
                .client(genericClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        mAPIs = mRetrofit.create(APIs.class);
    }
    public static RetrofitHttpRequest getInstance() {
        if (mInstance == null) {
            synchronized (RetrofitHttpRequest.class) {
                if (mInstance == null)
                    mInstance = new RetrofitHttpRequest();
            }
        }
        return mInstance;
    }
    public static OkHttpClient genericClient() {
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public okhttp3.Response intercept(Chain chain) throws IOException {
                        Request request = chain.request();
                        Request.Builder requestBuilder = request.newBuilder();
                        request = requestBuilder
                                .addHeader("Content-Type", "application/json;charset=UTF-8")
                                .post(RequestBody.create(MediaType.parse("application/json;charset=UTF-8"),
                                        bodyToString(request.body())))//关键部分，设置requestBody的编码格式为json
                                .build();
                        return chain.proceed(request);
                    }
                })
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .build();
        return httpClient;
    }
    private static String bodyToString(final RequestBody request) {
        try {
            final RequestBody copy = request;
            final Buffer buffer = new Buffer();
            if (copy != null)
                copy.writeTo(buffer);
            else
                return "";
            return buffer.readUtf8();
        } catch (final IOException e) {
            return "did not work";
        }
    }

}
