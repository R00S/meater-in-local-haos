package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.q */
/* loaded from: classes2.dex */
final class C7569q extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ String f27870j;

    /* renamed from: k */
    private final /* synthetic */ String f27871k;

    /* renamed from: l */
    private final /* synthetic */ Object f27872l;

    /* renamed from: m */
    private final /* synthetic */ boolean f27873m;

    /* renamed from: n */
    private final /* synthetic */ zzx f27874n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7569q(zzx zzxVar, String str, String str2, Object obj, boolean z) {
        super(zzxVar);
        this.f27874n = zzxVar;
        this.f27870j = str;
        this.f27871k = str2;
        this.f27872l = obj;
        this.f27873m = z;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        this.f27874n.f28411p.setUserProperty(this.f27870j, this.f27871k, ObjectWrapper.m14708E0(this.f27872l), this.f27873m, this.f28412f);
    }
}
