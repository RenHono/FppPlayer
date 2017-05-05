package xyz.renhono.fppplayer.utils;

import android.content.Intent;
import android.os.Bundle;

/**
 * Created by RenHono on 2017/5/4 0004.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class ActivityUtils {


    public static void startActivity(Class<?> clz) {
        Intent intent;
        intent = new Intent(UIUtils.getContext(), clz);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        UIUtils.getContext().startActivity(intent);
    }

    public static void startActivity(Class<?> clz, Bundle bundle) {
        Intent intent = new Intent(UIUtils.getContext(), clz);
        intent.putExtras(bundle);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        UIUtils.getContext().startActivity(intent);
    }
}