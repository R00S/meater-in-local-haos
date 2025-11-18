package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: com.google.android.gms.common.internal.service.b */
/* loaded from: classes2.dex */
final class C6434b extends AbstractC6437e {
    C6434b(zad zadVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* renamed from: s */
    protected final /* synthetic */ void mo13719s(Api.AnyClient anyClient) throws RemoteException {
        ((zal) ((zai) anyClient).getService()).mo14494N0(new BinderC6435c(this));
    }
}
