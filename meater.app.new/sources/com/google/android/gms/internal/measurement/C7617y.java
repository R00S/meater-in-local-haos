package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.y */
/* loaded from: classes2.dex */
final class C7617y extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ Activity f27935j;

    /* renamed from: k */
    private final /* synthetic */ zzx.C7635c f27936k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7617y(zzx.C7635c c7635c, Activity activity) {
        super(zzx.this);
        this.f27936k = c7635c;
        this.f27935j = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        zzx.this.f28411p.onActivityDestroyed(ObjectWrapper.m14708E0(this.f27935j), this.f28413g);
    }
}
