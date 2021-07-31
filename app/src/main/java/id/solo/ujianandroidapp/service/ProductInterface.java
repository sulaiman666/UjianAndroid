package id.solo.ujianandroidapp.service;

import id.solo.ujianandroidapp.entity.Responses;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductInterface {
    @GET("/product/")
    Call<Responses> getAllProduct();
}
