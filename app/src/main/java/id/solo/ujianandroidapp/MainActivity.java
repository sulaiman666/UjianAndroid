package id.solo.ujianandroidapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.solo.ujianandroidapp.adapter.ProductAdapter;
import id.solo.ujianandroidapp.entity.Product;
import id.solo.ujianandroidapp.entity.Responses;
import id.solo.ujianandroidapp.service.ApiClient;
import id.solo.ujianandroidapp.service.ProductInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Product> productList;
    private ProductAdapter productAdapter;
    private RecyclerView rcProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcProduct = findViewById(R.id.rc_product);

        ProductInterface productInterface = ApiClient.getRetrofit().create(ProductInterface.class);
        Call<Responses> call = productInterface.getAllProduct();
        call.enqueue(new Callback<Responses>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onResponse(Call<Responses> call, Response<Responses> response) {
                productList = (ArrayList<Product>) response.body().getData();
                productAdapter = new ProductAdapter(MainActivity.this, productList);

                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
                rcProduct.setLayoutManager(layoutManager);
                rcProduct.setAdapter(productAdapter);
            }

            @Override
            public void onFailure(Call<Responses> call, Throwable t) {

            }
        });

    }
}