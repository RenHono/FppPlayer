package xyz.renhono.fppplayer.utils;

import android.util.Log;

/**
 * Created by RenHono on 2017/4/20 0020.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class LogUtils {

    private static final boolean DEBUG = true;

    public static void v(String tag, String message) {
        if (DEBUG) {
            Log.v(tag, message);
        }
    }

    public static void d(String tag, String message) {
        if (DEBUG) {
            Log.d(tag, message);
        }
    }

    public static void i(String tag, String message) {
        if (DEBUG) {
            Log.i(tag, message);
        }
    }

    public static void w(String tag, String message) {
        if (DEBUG) {
            Log.w(tag, message);
        }
    }

    public static void e(String tag, String message) {
        if (DEBUG) {
            Log.e(tag, message);
        }
    }
}
