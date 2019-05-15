package com.asokk.dagger2demo.components;


import com.asokk.dagger2demo.MainActivity;
import com.asokk.dagger2demo.modules.GsonModule;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={GsonModule.class})
public interface GsonComponent {
    // downstream components need these exposed
    Gson gson();
    void inject(MainActivity activity);
}
