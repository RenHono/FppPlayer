package xyz.renhono.fppplayer;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

/**
 * Created by RenHono on 2017/4/20 0020.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class App extends Application {
//    @SuppressLint("StaticFieldLeak")

    private static Context context;

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();
    }
}
