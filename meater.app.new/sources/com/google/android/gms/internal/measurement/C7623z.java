package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.z */
/* loaded from: classes2.dex */
final class C7623z extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ Activity f27940j;

    /* renamed from: k */
    private final /* synthetic */ zzk f27941k;

    /* renamed from: l */
    private final /* synthetic */ zzx.C7635c f27942l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7623z(zzx.C7635c c7635c, Activity activity, zzk zzkVar) {
        super(zzx.this);
        this.f27942l = c7635c;
        this.f27940j = activity;
        this.f27941k = zzkVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        zzx.this.f28411p.onActivitySaveInstanceState(ObjectWrapper.m14708E0(this.f27940j), this.f27941k, this.f28413g);
    }
}
