package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import g1.C3377a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static final int f33531a = Process.myUid();

    /* renamed from: b, reason: collision with root package name */
    private static final Method f33532b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f33533c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f33534d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f33535e;

    /* renamed from: f, reason: collision with root package name */
    private static final Method f33536f;

    /* renamed from: g, reason: collision with root package name */
    private static final Method f33537g;

    /* renamed from: h, reason: collision with root package name */
    private static final Method f33538h;

    /* renamed from: i, reason: collision with root package name */
    private static final Method f33539i;

    /* renamed from: j, reason: collision with root package name */
    private static Boolean f33540j;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f33532b = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f33533c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f33534d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
            method4 = null;
        }
        f33535e = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
            method5 = null;
        }
        f33536f = method5;
        if (l.f()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e10);
            }
        } else {
            method6 = null;
        }
        f33537g = method6;
        if (l.f()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e11) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e11);
            }
        } else {
            method7 = null;
        }
        f33538h = method7;
        if (l.f()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
            }
        } else {
            method8 = null;
        }
        f33539i = method8;
        f33540j = null;
    }

    public static void a(WorkSource workSource, int i10, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f33533c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = f33532b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfoC = l7.c.a(context).c(str, 0);
                if (applicationInfoC == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i10 = applicationInfoC.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static synchronized boolean c(Context context) {
        Boolean bool = f33540j;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z10 = C3377a.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        f33540j = Boolean.valueOf(z10);
        return z10;
    }
}
