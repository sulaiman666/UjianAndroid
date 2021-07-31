package id.solo.ujianandroidapp.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit retrofit;
    public static final String URL = "http://8e5eaa5ca521.ngrok.io";

    public static Retrofit getRetrofit(){
        if (retrofit == null) retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
