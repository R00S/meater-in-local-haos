package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public class zzby {

    /* renamed from: a */
    private static UserManager f28002a;

    /* renamed from: b */
    private static volatile boolean f28003b = !m22095a();

    /* renamed from: c */
    private static boolean f28004c = false;

    private zzby() {
    }

    /* renamed from: a */
    public static boolean m22095a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: b */
    public static boolean m22096b(Context context) {
        return !m22095a() || m22098d(context);
    }

    @TargetApi(24)
    /* renamed from: c */
    private static boolean m22097c(Context context) {
        boolean z;
        boolean z2 = true;
        int i2 = 1;
        while (true) {
            z = false;
            if (i2 > 2) {
                break;
            }
            if (f28002a == null) {
                f28002a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f28002a;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
            } catch (NullPointerException e2) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e2);
                f28002a = null;
                i2++;
            }
        }
        z = z2;
        if (z) {
            f28002a = null;
        }
        return z;
    }

    @TargetApi(24)
    /* renamed from: d */
    private static boolean m22098d(Context context) {
        if (f28003b) {
            return true;
        }
        synchronized (zzby.class) {
            if (f28003b) {
                return true;
            }
            boolean zM22097c = m22097c(context);
            if (zM22097c) {
                f28003b = zM22097c;
            }
            return zM22097c;
        }
    }
}
