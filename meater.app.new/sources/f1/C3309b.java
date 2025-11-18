package f1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import g1.C3377a;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: ActivityCompat.java */
/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3309b extends C3377a {

    /* compiled from: ActivityCompat.java */
    /* renamed from: f1.b$a */
    static class a {
        static void a(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        static boolean b(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: f1.b$b, reason: collision with other inner class name */
    static class C0512b {
        static <T> T a(Activity activity, int i10) {
            return (T) activity.requireViewById(i10);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: f1.b$c */
    static class c {
        @SuppressLint({"BanUncheckedReflection"})
        static boolean a(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: f1.b$d */
    static class d {
        static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: f1.b$e */
    public interface e {
        void b(int i10);
    }

    public static void q(Activity activity) {
        activity.finishAffinity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(Activity activity) {
        if (activity.isFinishing() || C3311d.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void s(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: f1.a
                @Override // java.lang.Runnable
                public final void run() {
                    C3309b.r(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(Activity activity, String[] strArr, int i10) {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (TextUtils.isEmpty(strArr[i11])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i11));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < strArr.length; i13++) {
                if (!hashSet.contains(Integer.valueOf(i13))) {
                    strArr2[i12] = strArr[i13];
                    i12++;
                }
            }
        }
        if (activity instanceof e) {
            ((e) activity).b(i10);
        }
        a.a(activity, strArr, i10);
    }

    public static <T extends View> T u(Activity activity, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) C0512b.a(activity, i10);
        }
        T t10 = (T) activity.findViewById(i10);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static boolean v(Activity activity, String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i10 >= 32 ? d.a(activity, str) : i10 == 31 ? c.a(activity, str) : a.b(activity, str);
        }
        return false;
    }

    public static void w(Activity activity, Intent intent, int i10, Bundle bundle) {
        activity.startActivityForResult(intent, i10, bundle);
    }

    public static void x(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
