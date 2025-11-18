package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzctl implements zzcva<zzctk> {

    /* renamed from: a */
    private final zzbbl f25055a;

    /* renamed from: b */
    private final zzcxk f25056b;

    public zzctl(zzbbl zzbblVar, zzcxk zzcxkVar) {
        this.f25055a = zzbblVar;
        this.f25056b = zzcxkVar;
    }

    /* renamed from: a */
    final /* synthetic */ zzctk m18975a() throws Exception {
        return new zzctk(this.f25056b);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzctk> mo14982b() {
        return this.f25055a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.jo

            /* renamed from: f */
            private final zzctl f19495f;

            {
                this.f19495f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f19495f.m18975a();
            }
        });
    }
}
