package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.v */
/* loaded from: classes2.dex */
final class C7599v extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ Activity f27910j;

    /* renamed from: k */
    private final /* synthetic */ zzx.C7635c f27911k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7599v(zzx.C7635c c7635c, Activity activity) {
        super(zzx.this);
        this.f27911k = c7635c;
        this.f27910j = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        zzx.this.f28411p.onActivityStarted(ObjectWrapper.m14708E0(this.f27910j), this.f28413g);
    }
}
