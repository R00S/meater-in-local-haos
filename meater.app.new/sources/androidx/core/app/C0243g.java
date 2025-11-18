package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* compiled from: NavUtils.java */
/* renamed from: androidx.core.app.g */
/* loaded from: classes.dex */
public final class C0243g {
    /* renamed from: a */
    public static Intent m1550a(Activity activity) {
        Intent parentActivityIntent;
        if (Build.VERSION.SDK_INT >= 16 && (parentActivityIntent = activity.getParentActivityIntent()) != null) {
            return parentActivityIntent;
        }
        String strM1552c = m1552c(activity);
        if (strM1552c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strM1552c);
        try {
            return m1553d(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM1552c + "' in manifest");
            return null;
        }
    }

    /* renamed from: b */
    public static Intent m1551b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM1553d = m1553d(context, componentName);
        if (strM1553d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM1553d);
        return m1553d(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: c */
    public static String m1552c(Activity activity) {
        try {
            return m1553d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: d */
    public static String m1553d(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        String str;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 640;
        if (i2 >= 29) {
            i3 = 269222528;
        } else if (i2 >= 24) {
            i3 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i3);
        if (i2 >= 16 && (str = activityInfo.parentActivityName) != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: e */
    public static void m1554e(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.navigateUpTo(intent);
            return;
        }
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
    }

    /* renamed from: f */
    public static boolean m1555f(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return activity.shouldUpRecreateTask(intent);
        }
        String action = activity.getIntent().getAction();
        return (action == null || action.equals("android.intent.action.MAIN")) ? false : true;
    }
}
