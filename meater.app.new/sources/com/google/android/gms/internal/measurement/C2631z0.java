package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2631z0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<Boolean> f34458a = new C2623y0();

    public static SharedPreferences a(Context context, String str, int i10, AbstractC2567r0 abstractC2567r0) {
        SharedPreferencesC2591u0 sharedPreferencesC2591u0 = C2504j0.a().e(str, abstractC2567r0, EnumC2552p0.SHARED_PREFS_TYPE).equals("") ? new SharedPreferencesC2591u0() : null;
        if (sharedPreferencesC2591u0 != null) {
            return sharedPreferencesC2591u0;
        }
        ThreadLocal<Boolean> threadLocal = f34458a;
        l8.m.d(threadLocal.get().booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th) {
            f34458a.set(Boolean.TRUE);
            throw th;
        }
    }
}
