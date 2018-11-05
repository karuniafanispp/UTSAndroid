package com.example.asus.utsandroid;

import android.content.Context;
import android.content.SharedPreferences;

public class UtilsClipcodes  {
    final static String Filename = "MyFileName";
    public static String readSharedSetting(Context ctx, String settingname, String defaultValue){
        SharedPreferences sharedPref = ctx.getSharedPreferences(Filename, Context.MODE_PRIVATE);
        return sharedPref.getString(settingname, defaultValue);
    }
    public static void  saveSharedSetting(Context ctx, String settingName, String settingValue){
        SharedPreferences sharedPref = ctx.getSharedPreferences(Filename, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(settingName, settingValue);
        editor.apply();
    }
    public static void SharedPreferesSAVE(Context ctx, String Name){
        SharedPreferences prefs = ctx.getSharedPreferences("NAME",0);
        SharedPreferences.Editor prefEDIT = prefs.edit();
        prefEDIT.putString("Name", Name);
        prefEDIT.commit();
    }
}
