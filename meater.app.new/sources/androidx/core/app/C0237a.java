package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.C0255a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: ActivityCompat.java */
/* renamed from: androidx.core.app.a */
/* loaded from: classes.dex */
public class C0237a extends C0255a {

    /* renamed from: d */
    private static d f2042d;

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.a$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String[] f2043f;

        /* renamed from: g */
        final /* synthetic */ Activity f2044g;

        /* renamed from: h */
        final /* synthetic */ int f2045h;

        a(String[] strArr, Activity activity, int i2) {
            this.f2043f = strArr;
            this.f2044g = activity;
            this.f2045h = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f2043f.length];
            PackageManager packageManager = this.f2044g.getPackageManager();
            String packageName = this.f2044g.getPackageName();
            int length = this.f2043f.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = packageManager.checkPermission(this.f2043f[i2], packageName);
            }
            ((c) this.f2044g).onRequestPermissionsResult(this.f2045h, this.f2043f, iArr);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.a$b */
    class b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Activity f2046f;

        b(Activity activity) {
            this.f2046f = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2046f.isFinishing() || C0239c.m1543i(this.f2046f)) {
                return;
            }
            this.f2046f.recreate();
        }
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.a$c */
    public interface c {
        void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.a$d */
    public interface d {
        /* renamed from: a */
        boolean m1532a(Activity activity, String[] strArr, int i2);
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.a$e */
    public interface e {
        void validateRequestPermissionsRequestCode(int i2);
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.a$f */
    private static class f extends SharedElementCallback {

        /* compiled from: ActivityCompat.java */
        /* renamed from: androidx.core.app.a$f$a */
        class a {

            /* renamed from: a */
            final /* synthetic */ SharedElementCallback.OnSharedElementsReadyListener f2047a;

            a(SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
                this.f2047a = onSharedElementsReadyListener;
            }
        }

        f(AbstractC0251o abstractC0251o) {
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            new a(onSharedElementsReadyListener);
            throw null;
        }
    }

    /* renamed from: m */
    public static void m1521m(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: n */
    public static void m1522n(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    /* renamed from: o */
    public static void m1523o(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    /* renamed from: p */
    public static void m1524p(Activity activity) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            activity.recreate();
        } else if (i2 <= 23) {
            new Handler(activity.getMainLooper()).post(new b(activity));
        } else {
            if (C0239c.m1543i(activity)) {
                return;
            }
            activity.recreate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static void m1525q(Activity activity, String[] strArr, int i2) {
        d dVar = f2042d;
        if (dVar == null || !dVar.m1532a(activity, strArr, i2)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof e) {
                    ((e) activity).validateRequestPermissionsRequestCode(i2);
                }
                activity.requestPermissions(strArr, i2);
            } else if (activity instanceof c) {
                new Handler(Looper.getMainLooper()).post(new a(strArr, activity, i2));
            }
        }
    }

    /* renamed from: r */
    public static void m1526r(Activity activity, AbstractC0251o abstractC0251o) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setEnterSharedElementCallback(abstractC0251o != null ? new f(abstractC0251o) : null);
        }
    }

    /* renamed from: s */
    public static void m1527s(Activity activity, AbstractC0251o abstractC0251o) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setExitSharedElementCallback(abstractC0251o != null ? new f(abstractC0251o) : null);
        }
    }

    /* renamed from: t */
    public static boolean m1528t(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    /* renamed from: u */
    public static void m1529u(Activity activity, Intent intent, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i2, bundle);
        } else {
            activity.startActivityForResult(intent, i2);
        }
    }

    /* renamed from: v */
    public static void m1530v(Activity activity, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
        }
    }

    /* renamed from: w */
    public static void m1531w(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }
}
