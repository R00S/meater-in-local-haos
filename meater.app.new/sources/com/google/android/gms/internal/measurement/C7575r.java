package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.r */
/* loaded from: classes2.dex */
final class C7575r extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ Long f27876j;

    /* renamed from: k */
    private final /* synthetic */ String f27877k;

    /* renamed from: l */
    private final /* synthetic */ String f27878l;

    /* renamed from: m */
    private final /* synthetic */ Bundle f27879m;

    /* renamed from: n */
    private final /* synthetic */ boolean f27880n;

    /* renamed from: o */
    private final /* synthetic */ boolean f27881o;

    /* renamed from: p */
    private final /* synthetic */ zzx f27882p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7575r(zzx zzxVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zzxVar);
        this.f27882p = zzxVar;
        this.f27876j = l;
        this.f27877k = str;
        this.f27878l = str2;
        this.f27879m = bundle;
        this.f27880n = z;
        this.f27881o = z2;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        Long l = this.f27876j;
        this.f27882p.f28411p.logEvent(this.f27877k, this.f27878l, this.f27879m, this.f27880n, this.f27881o, l == null ? this.f28412f : l.longValue());
    }
}
