package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.work.AbstractC0807n;
import androidx.work.C0703b;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ProcessUtils.java */
/* renamed from: androidx.work.impl.utils.f */
/* loaded from: classes.dex */
public class C0787f {

    /* renamed from: a */
    private static final String f4873a = AbstractC0807n.m5223f("ProcessUtils");

    private C0787f() {
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    /* renamed from: a */
    public static String m5166a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object objInvoke;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return Application.getProcessName();
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, C0787f.class.getClassLoader());
            if (i2 >= 18) {
                Method declaredMethod = cls.getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, new Object[0]);
            } else {
                Method declaredMethod2 = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = cls.getDeclaredMethod("getProcessName", new Class[0]);
                declaredMethod3.setAccessible(true);
                objInvoke = declaredMethod3.invoke(declaredMethod2.invoke(null, new Object[0]), new Object[0]);
            }
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable th) {
            AbstractC0807n.m5221c().mo5224a(f4873a, "Unable to check ActivityThread for processName", th);
        }
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m5167b(Context context, C0703b c0703b) {
        String strM5166a = m5166a(context);
        return !TextUtils.isEmpty(c0703b.m4784c()) ? TextUtils.equals(strM5166a, c0703b.m4784c()) : TextUtils.equals(strM5166a, context.getApplicationInfo().processName);
    }
}
