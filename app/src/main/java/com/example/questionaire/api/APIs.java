package com.example.questionaire.api;

import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface APIs {
    @Headers({"Content-Type:application/json; charset=utf-8"})
    @POST("quest/insert")
    Call<Integer> submit(@Body Map<String, Map<String, String>> answers);
}
