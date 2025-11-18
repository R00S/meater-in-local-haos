package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.t */
/* loaded from: classes2.dex */
final class C7587t extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ Activity f27893j;

    /* renamed from: k */
    private final /* synthetic */ Bundle f27894k;

    /* renamed from: l */
    private final /* synthetic */ zzx.C7635c f27895l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7587t(zzx.C7635c c7635c, Activity activity, Bundle bundle) {
        super(zzx.this);
        this.f27895l = c7635c;
        this.f27893j = activity;
        this.f27894k = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        zzx.this.f28411p.onActivityCreated(ObjectWrapper.m14708E0(this.f27893j), this.f27894k, this.f28413g);
    }
}
