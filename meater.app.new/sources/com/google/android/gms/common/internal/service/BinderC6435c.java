package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* renamed from: com.google.android.gms.common.internal.service.c */
/* loaded from: classes2.dex */
final class BinderC6435c extends zaa {

    /* renamed from: f */
    private final BaseImplementation.ResultHolder<Status> f17841f;

    public BinderC6435c(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f17841f = resultHolder;
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zaj
    /* renamed from: z2 */
    public final void mo14492z2(int i2) throws RemoteException {
        this.f17841f.mo13929a(new Status(i2));
    }
}
