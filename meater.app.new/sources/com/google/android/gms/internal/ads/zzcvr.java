package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcvr implements zzdti<zzcvo> {

    /* renamed from: a */
    private final zzdtu<zzawi> f25161a;

    /* renamed from: b */
    private final zzdtu<Context> f25162b;

    /* renamed from: c */
    private final zzdtu<ScheduledExecutorService> f25163c;

    /* renamed from: d */
    private final zzdtu<Executor> f25164d;

    public zzcvr(zzdtu<zzawi> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<ScheduledExecutorService> zzdtuVar3, zzdtu<Executor> zzdtuVar4) {
        this.f25161a = zzdtuVar;
        this.f25162b = zzdtuVar2;
        this.f25163c = zzdtuVar3;
        this.f25164d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcvo(this.f25161a.get(), this.f25162b.get(), this.f25163c.get(), this.f25164d.get());
    }
}
