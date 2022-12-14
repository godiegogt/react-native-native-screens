package com.nativescreenapp;

import android.content.Intent;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class NavigationModule  extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;
    private Intent intent;

    NavigationModule(ReactApplicationContext context) {
        super(context);
        reactContext = context;
    }

    @NonNull
    @Override
    public String getName() {
        return "NavigationModule";
    } //The name of the component when it is called in the RN code

    @ReactMethod
    public void navigateToNative(Double amount){
        ReactApplicationContext context = getReactApplicationContext();
        intent = new Intent(context,Main2Activity.class);


        if (intent.resolveActivity(context.getPackageManager()) != null) {
            intent.setFlags((Intent.FLAG_ACTIVITY_NEW_TASK));
            intent.putExtra("amount",amount);
            context.startActivity(intent);
        }
    }
}