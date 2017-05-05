package xyz.renhono.fppplayer.utils;

import android.content.Context;

import xyz.renhono.fppplayer.App;

/**
 * Created by RenHono on 2017/4/20 0020.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class UIUtils {


    public static Context getContext() {
        return App.getContext();
    }

    public static String getString(int id) {

        return getContext().getResources().getString(id);
    }

}
