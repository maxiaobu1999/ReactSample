package com.norman.reactsample;

import android.app.Application;
import android.content.Context;

import androidx.annotation.Nullable;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.norman.reactsample.communication.CommPackage;
import com.norman.reactsample.so.SoLoader;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class App extends Application implements ReactApplication {

    private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {

        @Override
        public boolean getUseDeveloperSupport() {
            return BuildConfig.DEBUG;
        }

        @Override
        protected List<ReactPackage> getPackages() {
            return Arrays.<ReactPackage>asList(
                    new MainReactPackage()
            );
        }
    };

    @Override
    public ReactNativeHost getReactNativeHost() {
        return mReactNativeHost;
    }

    @Override
    public void onCreate() {
        super.onCreate();
//        SoLoader.init(this, /* native exopackage */ false);
        SoLoader.load(this, "glog");
        SoLoader.load(this, "glog_init");
        System.loadLibrary( "jsc");
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("glog");
        System.loadLibrary("glog_init");
        System.loadLibrary("folly_json");
        System.loadLibrary("icu_common");

        System.loadLibrary("gnustl_shared");
        System.loadLibrary("reactnativejnifb");
        System.loadLibrary("reactnativejni");
//        System.loadLibrary("fb");
    }

}
