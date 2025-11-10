package com.apptionlabs.meater_app.data;

/* loaded from: /tmp/meat/meat/classes.dex */
public class Log {
    public static void debug(String str, String str2) {
        android.util.Log.d(str, str2);
    }

    public static void error(String str, String str2) {
        android.util.Log.e(str, str2);
    }

    public static void info(String str, String str2) {
        android.util.Log.i(str, str2);
    }

    public static void verbose(String str, String str2) {
        android.util.Log.v(str, str2);
    }

    public static void warn(String str, String str2) {
        android.util.Log.w(str, str2);
    }
}
