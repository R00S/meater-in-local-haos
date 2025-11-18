package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: BundleCompat.java */
/* renamed from: androidx.core.app.e */
/* loaded from: classes.dex */
public final class C0241e {

    /* compiled from: BundleCompat.java */
    /* renamed from: androidx.core.app.e$a */
    static class a {

        /* renamed from: a */
        private static Method f2069a;

        /* renamed from: b */
        private static boolean f2070b;

        /* renamed from: c */
        private static Method f2071c;

        /* renamed from: d */
        private static boolean f2072d;

        /* renamed from: a */
        public static IBinder m1548a(Bundle bundle, String str) throws NoSuchMethodException, SecurityException {
            if (!f2070b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f2069a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e2);
                }
                f2070b = true;
            }
            Method method2 = f2069a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e3);
                    f2069a = null;
                }
            }
            return null;
        }

        /* renamed from: b */
        public static void m1549b(Bundle bundle, String str, IBinder iBinder) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!f2072d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f2071c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e2);
                }
                f2072d = true;
            }
            Method method2 = f2071c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e3);
                    f2071c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static IBinder m1546a(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : a.m1548a(bundle, str);
    }

    /* renamed from: b */
    public static void m1547b(Bundle bundle, String str, IBinder iBinder) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            a.m1549b(bundle, str, iBinder);
        }
    }
}
