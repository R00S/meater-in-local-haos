package com.google.firebase.crashlytics.internal.p183n;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.crashlytics.internal.C8179h;

/* compiled from: BatteryState.java */
/* renamed from: com.google.firebase.crashlytics.h.n.p */
/* loaded from: classes2.dex */
class C8222p {

    /* renamed from: a */
    private final Float f30954a;

    /* renamed from: b */
    private final boolean f30955b;

    private C8222p(Float f2, boolean z) {
        this.f30955b = z;
        this.f30954a = f2;
    }

    /* renamed from: a */
    public static C8222p m25304a(Context context) {
        Float fM25305d = null;
        boolean zM25306e = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zM25306e = m25306e(intentRegisterReceiver);
                fM25305d = m25305d(intentRegisterReceiver);
            }
        } catch (IllegalStateException e2) {
            C8179h.m25176f().m25180e("An error occurred getting battery state.", e2);
        }
        return new C8222p(fM25305d, zM25306e);
    }

    /* renamed from: d */
    private static Float m25305d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    /* renamed from: e */
    private static boolean m25306e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    /* renamed from: b */
    public Float m25307b() {
        return this.f30954a;
    }

    /* renamed from: c */
    public int m25308c() {
        Float f2;
        if (!this.f30955b || (f2 = this.f30954a) == null) {
            return 1;
        }
        return ((double) f2.floatValue()) < 0.99d ? 2 : 3;
    }
}
