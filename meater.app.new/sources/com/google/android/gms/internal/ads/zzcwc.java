package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcwc implements zzcva<zzcwb> {

    /* renamed from: a */
    zzvx f25180a;

    /* renamed from: b */
    private zzbbl f25181b;

    /* renamed from: c */
    Context f25182c;

    public zzcwc(zzvx zzvxVar, zzbbl zzbblVar, Context context) {
        this.f25180a = zzvxVar;
        this.f25181b = zzbblVar;
        this.f25182c = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcwb> mo14982b() {
        return this.f25181b.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.lp

            /* renamed from: f */
            private final zzcwc f19848f;

            {
                this.f19848f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzcwc zzcwcVar = this.f19848f;
                return new zzcwb(zzcwcVar.f25180a.mo20680a(zzcwcVar.f25182c));
            }
        });
    }
}
