package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcww implements zzdti<zzcwu> {

    /* renamed from: a */
    private final zzdtu<zzaqm> f25212a;

    /* renamed from: b */
    private final zzdtu<ScheduledExecutorService> f25213b;

    /* renamed from: c */
    private final zzdtu<Context> f25214c;

    public zzcww(zzdtu<zzaqm> zzdtuVar, zzdtu<ScheduledExecutorService> zzdtuVar2, zzdtu<Context> zzdtuVar3) {
        this.f25212a = zzdtuVar;
        this.f25213b = zzdtuVar2;
        this.f25214c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcwu(this.f25212a.get(), this.f25213b.get(), this.f25214c.get());
    }
}
