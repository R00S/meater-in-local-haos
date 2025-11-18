package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.m */
/* loaded from: classes2.dex */
final class C7545m extends zzx.AbstractRunnableC7633a {

    /* renamed from: k */
    private final /* synthetic */ String f27832k;

    /* renamed from: l */
    private final /* synthetic */ Object f27833l;

    /* renamed from: o */
    private final /* synthetic */ zzx f27836o;

    /* renamed from: j */
    private final /* synthetic */ int f27831j = 5;

    /* renamed from: m */
    private final /* synthetic */ Object f27834m = null;

    /* renamed from: n */
    private final /* synthetic */ Object f27835n = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7545m(zzx zzxVar, boolean z, int i2, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f27836o = zzxVar;
        this.f27832k = str;
        this.f27833l = obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        this.f27836o.f28411p.logHealthData(this.f27831j, this.f27832k, ObjectWrapper.m14708E0(this.f27833l), ObjectWrapper.m14708E0(this.f27834m), ObjectWrapper.m14708E0(this.f27835n));
    }
}
