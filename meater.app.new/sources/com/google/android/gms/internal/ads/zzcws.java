package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcws implements zzdti<zzcwq> {

    /* renamed from: a */
    private final zzdtu<zzamg> f25204a;

    /* renamed from: b */
    private final zzdtu<ScheduledExecutorService> f25205b;

    /* renamed from: c */
    private final zzdtu<Boolean> f25206c;

    /* renamed from: d */
    private final zzdtu<ApplicationInfo> f25207d;

    public zzcws(zzdtu<zzamg> zzdtuVar, zzdtu<ScheduledExecutorService> zzdtuVar2, zzdtu<Boolean> zzdtuVar3, zzdtu<ApplicationInfo> zzdtuVar4) {
        this.f25204a = zzdtuVar;
        this.f25205b = zzdtuVar2;
        this.f25206c = zzdtuVar3;
        this.f25207d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcwq(this.f25204a.get(), this.f25205b.get(), this.f25206c.get().booleanValue(), this.f25207d.get());
    }
}
