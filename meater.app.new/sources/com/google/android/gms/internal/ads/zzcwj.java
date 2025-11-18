package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcwj implements zzcva<zzcwi> {

    /* renamed from: a */
    private zzawe f25189a;

    /* renamed from: b */
    private zzbbl f25190b;

    /* renamed from: c */
    private String f25191c;

    public zzcwj(zzawe zzaweVar, zzbbl zzbblVar, String str) {
        this.f25189a = zzaweVar;
        this.f25190b = zzbblVar;
        this.f25191c = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcwi> mo14982b() {
        new zzbbr();
        final zzbbh<String> zzbbhVarM17378o = zzbar.m17378o(null);
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21621E4)).booleanValue()) {
            zzbbhVarM17378o = this.f25189a.mo17025a(this.f25191c);
        }
        final zzbbh<String> zzbbhVarMo17026b = this.f25189a.mo17026b(this.f25191c);
        return zzbar.m17364a(zzbbhVarM17378o, zzbbhVarMo17026b).m17379a(new Callable(zzbbhVarM17378o, zzbbhVarMo17026b) { // from class: com.google.android.gms.internal.ads.op

            /* renamed from: f */
            private final zzbbh f20207f;

            /* renamed from: g */
            private final zzbbh f20208g;

            {
                this.f20207f = zzbbhVarM17378o;
                this.f20208g = zzbbhVarMo17026b;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzcwi((String) this.f20207f.get(), (String) this.f20208g.get());
            }
        }, zzaxg.f22651a);
    }
}
