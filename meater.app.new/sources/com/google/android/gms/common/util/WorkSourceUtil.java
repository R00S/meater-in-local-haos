package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class WorkSourceUtil {

    /* renamed from: a */
    private static final int f17994a = Process.myUid();

    /* renamed from: b */
    private static final Method f17995b;

    /* renamed from: c */
    private static final Method f17996c;

    /* renamed from: d */
    private static final Method f17997d;

    /* renamed from: e */
    private static final Method f17998e;

    /* renamed from: f */
    private static final Method f17999f;

    /* renamed from: g */
    private static final Method f18000g;

    /* renamed from: h */
    private static final Method f18001h;

    /* renamed from: i */
    private static final Method f18002i;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8 = null;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f17995b = method;
        if (PlatformVersion.m14641e()) {
            try {
                method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused2) {
            }
        } else {
            method2 = null;
        }
        f17996c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        f17997d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
            method4 = null;
        }
        f17998e = method4;
        if (PlatformVersion.m14641e()) {
            try {
                method5 = WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused5) {
            }
        } else {
            method5 = null;
        }
        f17999f = method5;
        if (PlatformVersion.m14648l()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e2);
            }
        } else {
            method6 = null;
        }
        f18000g = method6;
        if (PlatformVersion.m14648l()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e3) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e3);
            }
        } else {
            method7 = null;
        }
        f18001h = method7;
        if (PlatformVersion.m14648l()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", new Class[0]);
                method8.setAccessible(true);
            } catch (Exception unused6) {
            }
        }
        f18002i = method8;
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static void m14658a(WorkSource workSource, int i2, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f17996c;
        if (method != null) {
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            try {
                method.invoke(workSource, Integer.valueOf(i2), str);
                return;
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return;
            }
        }
        Method method2 = f17995b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i2));
            } catch (Exception e3) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            }
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public static WorkSource m14659b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfoM14669c = Wrappers.m14674a(context).m14669c(str, 0);
                if (applicationInfoM14669c == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i2 = applicationInfoM14669c.uid;
                WorkSource workSource = new WorkSource();
                m14658a(workSource, i2, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    @KeepForSdk
    /* renamed from: c */
    public static String m14660c(WorkSource workSource, int i2) {
        Method method = f17999f;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i2));
        } catch (Exception e2) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            return null;
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public static List<String> m14661d(WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int iM14663f = workSource == null ? 0 : m14663f(workSource);
        if (iM14663f != 0) {
            for (int i2 = 0; i2 < iM14663f; i2++) {
                String strM14660c = m14660c(workSource, i2);
                if (!Strings.m14655a(strM14660c)) {
                    Preconditions.m14372k(strM14660c);
                    arrayList.add(strM14660c);
                }
            }
        }
        return arrayList;
    }

    @KeepForSdk
    /* renamed from: e */
    public static boolean m14662e(Context context) {
        return (context == null || context.getPackageManager() == null || Wrappers.m14674a(context).m14668b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    @KeepForSdk
    /* renamed from: f */
    public static int m14663f(WorkSource workSource) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f17997d;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, new Object[0]);
                Preconditions.m14372k(objInvoke);
                return ((Integer) objInvoke).intValue();
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
        return 0;
    }
}
