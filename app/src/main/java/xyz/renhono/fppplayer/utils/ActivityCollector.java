package xyz.renhono.fppplayer.utils;

/**
 * Created by RenHono on 2017/4/20 0020.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Activity管理类
 */
public class ActivityCollector {

    private static final List<Activity> LIST = new ArrayList<>();

    public static void addActivity(Activity activity) {

        LIST.add(activity);
    }

    public static void removeActivity(Activity activity) {

        LIST.remove(activity);
    }

    public static void removeAllActivity(){

        LIST.stream().filter(activity ->!activity.isFinishing()).forEach(Activity::finish); //lambda表达式 JAVA8特性

    }

}
