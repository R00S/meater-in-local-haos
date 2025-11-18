package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.y4 */
/* loaded from: classes2.dex */
final class RunnableC7871y4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ long f29008f;

    /* renamed from: g */
    private final /* synthetic */ zzhc f29009g;

    RunnableC7871y4(zzhc zzhcVar, long j2) {
        this.f29009g = zzhcVar;
        this.f29008f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        zzhc zzhcVar = this.f29009g;
        long j2 = this.f29008f;
        zzhcVar.mo22792d();
        zzhcVar.mo22790b();
        zzhcVar.m22857x();
        zzhcVar.mo22836h().m23144O().m23147a("Resetting analytics data (FE)");
        zzjl zzjlVarMo22799u = zzhcVar.mo22799u();
        zzjlVarMo22799u.mo22792d();
        zzjlVarMo22799u.f29351e.m22877a();
        if (zzhcVar.mo22841n().m23572K(zzhcVar.mo22795q().m23110C())) {
            zzhcVar.mo22840m().f28858k.m23156b(j2);
        }
        if (!TextUtils.isEmpty(zzhcVar.mo22840m().f28850C.m23159a())) {
            zzhcVar.mo22840m().f28850C.m23160b(null);
        }
        boolean zM23236p = zzhcVar.f28874a.m23236p();
        if (!zzhcVar.mo22841n().m23570I()) {
            zzhcVar.mo22840m().m22818D(!zM23236p);
        }
        zzhcVar.mo22796r().m23372X();
        zzhcVar.f29326h = !zM23236p;
        this.f29009g.mo22796r().m23367S(new AtomicReference<>());
    }
}
