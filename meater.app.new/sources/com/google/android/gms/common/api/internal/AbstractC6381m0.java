package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.m0 */
/* loaded from: classes2.dex */
abstract class AbstractC6381m0<T> extends zac {

    /* renamed from: b */
    protected final TaskCompletionSource<T> f17428b;

    public AbstractC6381m0(int i2, TaskCompletionSource<T> taskCompletionSource) {
        super(i2);
        this.f17428b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.zab
    /* renamed from: b */
    public void mo14066b(Status status) {
        this.f17428b.m23657d(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zab
    /* renamed from: c */
    public final void mo14067c(GoogleApiManager.zaa<?> zaaVar) throws DeadObjectException {
        try {
            mo14069i(zaaVar);
        } catch (DeadObjectException e2) {
            mo14066b(zab.m14171a(e2));
            throw e2;
        } catch (RemoteException e3) {
            mo14066b(zab.m14171a(e3));
        } catch (RuntimeException e4) {
            mo14068e(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zab
    /* renamed from: e */
    public void mo14068e(RuntimeException runtimeException) {
        this.f17428b.m23657d(runtimeException);
    }

    /* renamed from: i */
    protected abstract void mo14069i(GoogleApiManager.zaa<?> zaaVar) throws RemoteException;
}
