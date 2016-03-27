package com.test.testapplication.network;

import com.test.testapplication.model.UniversalPagerObject;

import java.util.Map;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.QueryMap;


/**
 * Created by bablu on 19/03/16.
 */
public interface ApiCallback {
    @GET("v1/booking/slots/all")
    Call<UniversalPagerObject> loadQuestions(@QueryMap Map<String, String> map);
}
