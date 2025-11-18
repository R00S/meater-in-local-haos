package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;

/* loaded from: classes2.dex */
public final class zaf extends AbstractC6381m0<Void> {

    /* renamed from: c */
    private final RegisterListenerMethod<Api.AnyClient, ?> f17580c;

    /* renamed from: d */
    private final UnregisterListenerMethod<Api.AnyClient, ?> f17581d;

    @Override // com.google.android.gms.common.api.internal.AbstractC6381m0, com.google.android.gms.common.api.internal.zab
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14066b(Status status) {
        super.mo14066b(status);
    }

    @Override // com.google.android.gms.common.api.internal.zab
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo14173d(zaab zaabVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC6381m0, com.google.android.gms.common.api.internal.zab
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo14068e(RuntimeException runtimeException) {
        super.mo14068e(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.zac
    /* renamed from: g */
    public final Feature[] mo14185g(GoogleApiManager.zaa<?> zaaVar) {
        return this.f17580c.m14049c();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    /* renamed from: h */
    public final boolean mo14186h(GoogleApiManager.zaa<?> zaaVar) {
        return this.f17580c.m14051e();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC6381m0
    /* renamed from: i */
    public final void mo14069i(GoogleApiManager.zaa<?> zaaVar) throws RemoteException {
        this.f17580c.m14050d(zaaVar.m14013l(), this.f17428b);
        if (this.f17580c.m14048b() != null) {
            zaaVar.m14016u().put(this.f17580c.m14048b(), new zabw(this.f17580c, this.f17581d));
        }
    }
}
