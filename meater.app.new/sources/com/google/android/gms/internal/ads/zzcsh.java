package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcsh implements zzcva<zzcsg> {

    /* renamed from: a */
    private final zzbbl f25020a;

    /* renamed from: b */
    private final Context f25021b;

    public zzcsh(zzbbl zzbblVar, Context context) {
        this.f25020a = zzbblVar;
        this.f25021b = context;
    }

    /* renamed from: a */
    final /* synthetic */ zzcsg m18966a() throws Exception {
        double d2;
        Intent intentRegisterReceiver = this.f25021b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            double intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
            double intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
            Double.isNaN(intExtra2);
            Double.isNaN(intExtra3);
            d2 = intExtra2 / intExtra3;
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d2 = -1.0d;
        }
        return new zzcsg(d2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcsg> mo14982b() {
        return this.f25020a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zn

            /* renamed from: f */
            private final zzcsh f21470f;

            {
                this.f21470f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f21470f.m18966a();
            }
        });
    }
}
