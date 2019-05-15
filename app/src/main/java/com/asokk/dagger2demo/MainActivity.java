package com.asokk.dagger2demo;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Gson mGson;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApplication) getApplication()).getGsonComponent().inject(this);

        DataModel dataModel = new DataModel();
        dataModel.setId(5);
        dataModel.setName("Ashok Nayak");
        String str = mGson.toJson(dataModel);
        Log.d("ASKU", str);
    }

}
