package com.example.mad_sa02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class add_location extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_location);
        //gets lat and lon of location, this is used to make a 2nd API call to get current weather
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://api.openweathermap.org/geo/1.0/direct?q=London&limit=5&appid=49af6d5ec19eb63baae46f9e4025145b")
                .get()
                .build();

        try {
            Response response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}