package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcwn implements zzcva<zzcwm> {

    /* renamed from: a */
    zzaci f25196a;

    /* renamed from: b */
    private zzbbl f25197b;

    /* renamed from: c */
    List<String> f25198c;

    public zzcwn(zzaci zzaciVar, zzbbl zzbblVar, List<String> list) {
        this.f25196a = zzaciVar;
        this.f25197b = zzbblVar;
        this.f25198c = list;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcwm> mo14982b() {
        return this.f25197b.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.pp

            /* renamed from: f */
            private final zzcwn f20320f;

            {
                this.f20320f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzcwn zzcwnVar = this.f20320f;
                return new zzcwm(zzcwnVar.f25196a.mo16401A(zzcwnVar.f25198c));
            }
        });
    }
}
