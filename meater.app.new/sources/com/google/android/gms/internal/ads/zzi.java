package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzi implements zzab {

    /* renamed from: a */
    private final Executor f26248a;

    public zzi(Handler handler) {
        this.f26248a = new a00(this, handler);
    }

    @Override // com.google.android.gms.internal.ads.zzab
    /* renamed from: a */
    public final void mo16225a(zzr<?> zzrVar, zzaf zzafVar) {
        zzrVar.m20418I("post-error");
        this.f26248a.execute(new k00(zzrVar, zzy.m20818b(zzafVar), null));
    }

    @Override // com.google.android.gms.internal.ads.zzab
    /* renamed from: b */
    public final void mo16226b(zzr<?> zzrVar, zzy<?> zzyVar, Runnable runnable) {
        zzrVar.m20426S();
        zzrVar.m20418I("post-response");
        this.f26248a.execute(new k00(zzrVar, zzyVar, runnable));
    }

    @Override // com.google.android.gms.internal.ads.zzab
    /* renamed from: c */
    public final void mo16227c(zzr<?> zzrVar, zzy<?> zzyVar) {
        mo16226b(zzrVar, zzyVar, null);
    }
}
