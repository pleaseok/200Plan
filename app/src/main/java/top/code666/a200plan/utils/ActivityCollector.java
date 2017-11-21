package top.code666.a200plan.utils;

import android.app.Activity;

import java.util.ArrayList;

/**
 * Created by code666 on 2017/11/19.
 */

public class ActivityCollector {
    private static ArrayList<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finishAll(){
        for (Activity activity :activities){
            if(activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
