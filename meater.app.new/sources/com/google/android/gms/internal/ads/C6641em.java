package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.em */
/* loaded from: classes2.dex */
final class C6641em implements zzbvo {

    /* renamed from: a */
    private final /* synthetic */ zzcxu f18823a;

    /* renamed from: b */
    private final /* synthetic */ zzcxm f18824b;

    /* renamed from: c */
    private final /* synthetic */ zzcjy f18825c;

    /* renamed from: d */
    final /* synthetic */ zzcnw f18826d;

    C6641em(zzcnw zzcnwVar, zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy zzcjyVar) {
        this.f18826d = zzcnwVar;
        this.f18823a = zzcxuVar;
        this.f18824b = zzcxmVar;
        this.f18825c = zzcjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    /* renamed from: a */
    public final void mo15112a(int i2) {
        String strValueOf = String.valueOf(this.f18825c.f24421a);
        zzbad.m17353i(strValueOf.length() != 0 ? "Fail to initialize adapter ".concat(strValueOf) : new String("Fail to initialize adapter "));
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void onInitializationSucceeded() {
        Executor executor = this.f18826d.f24794b;
        final zzcxu zzcxuVar = this.f18823a;
        final zzcxm zzcxmVar = this.f18824b;
        final zzcjy zzcjyVar = this.f18825c;
        executor.execute(new Runnable(this, zzcxuVar, zzcxmVar, zzcjyVar) { // from class: com.google.android.gms.internal.ads.fm

            /* renamed from: f */
            private final C6641em f18904f;

            /* renamed from: g */
            private final zzcxu f18905g;

            /* renamed from: h */
            private final zzcxm f18906h;

            /* renamed from: i */
            private final zzcjy f18907i;

            {
                this.f18904f = this;
                this.f18905g = zzcxuVar;
                this.f18906h = zzcxmVar;
                this.f18907i = zzcjyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C6641em c6641em = this.f18904f;
                zzcxu zzcxuVar2 = this.f18905g;
                zzcxm zzcxmVar2 = this.f18906h;
                zzcjy zzcjyVar2 = this.f18907i;
                zzcnw zzcnwVar = c6641em.f18826d;
                zzcnw.m18892e(zzcxuVar2, zzcxmVar2, zzcjyVar2);
            }
        });
    }
}
