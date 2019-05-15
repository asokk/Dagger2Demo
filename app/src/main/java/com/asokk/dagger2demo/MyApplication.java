package com.asokk.dagger2demo;

import android.app.Application;
import android.content.Context;

import com.asokk.dagger2demo.components.DaggerGsonComponent;
import com.asokk.dagger2demo.components.GsonComponent;
import com.asokk.dagger2demo.modules.GsonModule;

import javax.inject.Inject;


public class MyApplication extends Application {
    @Inject
    GsonComponent mGsonComponent;
    @Override
    public void onCreate() {
        super.onCreate();

        // specify the full namespace of the component
        // Dagger_xxxx (where xxxx = component name)
        mGsonComponent = DaggerGsonComponent.builder()
                .gsonModule(new GsonModule("https://api.github.com"))
                .build();

    }
    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    public GsonComponent getGsonComponent() {
        return mGsonComponent;
    }

}
