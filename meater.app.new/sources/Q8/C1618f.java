package Q8;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: BatteryState.java */
/* renamed from: Q8.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C1618f {

    /* renamed from: a, reason: collision with root package name */
    private final Float f14440a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14441b;

    private C1618f(Float f10, boolean z10) {
        this.f14441b = z10;
        this.f14440a = f10;
    }

    public static C1618f a(Context context) {
        boolean zE = false;
        Float fD = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zE = e(intentRegisterReceiver);
                fD = d(intentRegisterReceiver);
            }
        } catch (IllegalStateException e10) {
            N8.g.f().e("An error occurred getting battery state.", e10);
        }
        return new C1618f(fD, zE);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f14440a;
    }

    public int c() {
        Float f10;
        if (!this.f14441b || (f10 = this.f14440a) == null) {
            return 1;
        }
        return ((double) f10.floatValue()) < 0.99d ? 2 : 3;
    }
}
