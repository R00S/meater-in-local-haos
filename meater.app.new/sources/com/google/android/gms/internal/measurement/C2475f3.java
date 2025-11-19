package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2475f3 {

    /* renamed from: a, reason: collision with root package name */
    private static UserManager f34112a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f34113b = !a();

    private C2475f3() {
    }

    public static boolean a() {
        return true;
    }

    public static boolean b(Context context) {
        return a() && !d(context);
    }

    public static boolean c(Context context) {
        return !a() || d(context);
    }

    @TargetApi(24)
    private static boolean d(Context context) {
        if (f34113b) {
            return true;
        }
        synchronized (C2475f3.class) {
            try {
                if (f34113b) {
                    return true;
                }
                boolean zE = e(context);
                if (zE) {
                    f34113b = zE;
                }
                return zE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @TargetApi(24)
    private static boolean e(Context context) {
        boolean z10;
        boolean z11 = true;
        int i10 = 1;
        while (true) {
            z10 = false;
            if (i10 > 2) {
                break;
            }
            if (f34112a == null) {
                f34112a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f34112a;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z11 = false;
                }
            } catch (NullPointerException e10) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                f34112a = null;
                i10++;
            }
        }
        z10 = z11;
        if (z10) {
            f34112a = null;
        }
        return z10;
    }
}
