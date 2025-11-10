package com.apptionlabs.meater_app.views;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import com.apptionlabs.meater_app.data.Log;

/* compiled from: MEATERFontSize.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    private static float f10569a = b1.f10466f * 15.5f;

    /* renamed from: b, reason: collision with root package name */
    private static float f10570b = 0.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MEATERFontSize.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum a {
        PHONE_DEVICE,
        TABLET_DEVICE,
        HIGH_RES_DEVICE
    }

    public static void a(Activity activity) {
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        displayMetrics.densityDpi = b(activity);
        displayMetrics.setTo(displayMetrics);
        b1.f10467g = displayMetrics.widthPixels;
        b1.f10469i = displayMetrics.heightPixels;
        b1.f10466f = displayMetrics.density;
        float f10 = displayMetrics.densityDpi / 160.0f;
        if (c(activity) == a.TABLET_DEVICE) {
            if (b1.f10469i > 1600.0f) {
                f10569a = f10 * 30.0f;
                return;
            } else {
                f10569a = f10 * 25.0f;
                return;
            }
        }
        if (c(activity) == a.HIGH_RES_DEVICE) {
            f10569a = f10 * 16.7f;
        } else if (f10 > 3.5d) {
            f10569a = f10 * 17.8f;
        } else {
            f10569a = f10 * 15.5f;
        }
    }

    private static int b(Activity activity) {
        Display g10 = f8.l0.g(activity);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        g10.getRealMetrics(displayMetrics);
        float f10 = displayMetrics.heightPixels / displayMetrics.widthPixels;
        f10570b = f10;
        double sqrt = Math.sqrt((r2 * r2) + (r9 * r9));
        float f11 = displayMetrics.widthPixels / displayMetrics.xdpi;
        float f12 = displayMetrics.heightPixels / displayMetrics.ydpi;
        Log.info("SCREEN_SIZE", " withInPixels =" + displayMetrics.widthPixels + " HeightInPixels =" + displayMetrics.heightPixels + " ratio =" + f10);
        return (int) (sqrt / Math.sqrt(Math.pow(f11, 2.0d) + Math.pow(f12, 2.0d)));
    }

    private static a c(Context context) {
        int i10 = context.getResources().getConfiguration().smallestScreenWidthDp;
        if (i10 < 400) {
            return a.PHONE_DEVICE;
        }
        if (i10 >= 400 && i10 < 600) {
            return a.HIGH_RES_DEVICE;
        }
        if (i10 >= 600) {
            return a.TABLET_DEVICE;
        }
        return a.PHONE_DEVICE;
    }

    public static float d() {
        return f10569a;
    }

    public static float e() {
        return f10570b;
    }
}
