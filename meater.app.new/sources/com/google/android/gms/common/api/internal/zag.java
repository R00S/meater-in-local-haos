package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class zag<ResultT> extends zac {

    /* renamed from: b */
    private final TaskApiCall<Api.AnyClient, ResultT> f17582b;

    /* renamed from: c */
    private final TaskCompletionSource<ResultT> f17583c;

    /* renamed from: d */
    private final StatusExceptionMapper f17584d;

    @Override // com.google.android.gms.common.api.internal.zab
    /* renamed from: b */
    public final void mo14066b(Status status) {
        this.f17583c.m23657d(this.f17584d.mo13920a(status));
    }

    @Override // com.google.android.gms.common.api.internal.zab
    /* renamed from: c */
    public final void mo14067c(GoogleApiManager.zaa<?> zaaVar) throws DeadObjectException {
        try {
            this.f17582b.m14052a(zaaVar.m14013l(), this.f17583c);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            mo14066b(zab.m14171a(e3));
        } catch (RuntimeException e4) {
            mo14068e(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zab
    /* renamed from: d */
    public final void mo14173d(zaab zaabVar, boolean z) {
        zaabVar.m14110c(this.f17583c, z);
    }

    @Override // com.google.android.gms.common.api.internal.zab
    /* renamed from: e */
    public final void mo14068e(RuntimeException runtimeException) {
        this.f17583c.m23657d(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.zac
    /* renamed from: g */
    public final Feature[] mo14185g(GoogleApiManager.zaa<?> zaaVar) {
        return this.f17582b.m14054c();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    /* renamed from: h */
    public final boolean mo14186h(GoogleApiManager.zaa<?> zaaVar) {
        return this.f17582b.m14053b();
    }
}
