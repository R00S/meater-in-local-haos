package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcue implements zzcva<zzcud> {

    /* renamed from: a */
    private final zzbbl f25082a;

    /* renamed from: b */
    private final Bundle f25083b;

    public zzcue(zzbbl zzbblVar, Bundle bundle) {
        this.f25082a = zzbblVar;
        this.f25083b = bundle;
    }

    /* renamed from: a */
    final /* synthetic */ zzcud m18984a() throws Exception {
        return new zzcud(this.f25083b);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcud> mo14982b() {
        return this.f25082a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.ro

            /* renamed from: f */
            private final zzcue f20467f;

            {
                this.f20467f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20467f.m18984a();
            }
        });
    }
}
