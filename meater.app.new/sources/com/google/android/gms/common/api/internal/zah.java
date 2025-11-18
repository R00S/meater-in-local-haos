package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class zah extends AbstractC6381m0<Boolean> {

    /* renamed from: c */
    private final ListenerHolder.ListenerKey<?> f17585c;

    public zah(ListenerHolder.ListenerKey<?> listenerKey, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f17585c = listenerKey;
    }

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
        zabw zabwVar = zaaVar.m14016u().get(this.f17585c);
        if (zabwVar == null) {
            return null;
        }
        return zabwVar.f17556a.m14049c();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    /* renamed from: h */
    public final boolean mo14186h(GoogleApiManager.zaa<?> zaaVar) {
        zabw zabwVar = zaaVar.m14016u().get(this.f17585c);
        return zabwVar != null && zabwVar.f17556a.m14051e();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC6381m0
    /* renamed from: i */
    public final void mo14069i(GoogleApiManager.zaa<?> zaaVar) throws RemoteException {
        zabw zabwVarRemove = zaaVar.m14016u().remove(this.f17585c);
        if (zabwVarRemove == null) {
            this.f17428b.m23658e(Boolean.FALSE);
        } else {
            zabwVarRemove.f17557b.m14055a(zaaVar.m14013l(), this.f17428b);
            zabwVarRemove.f17556a.m14047a();
        }
    }
}
