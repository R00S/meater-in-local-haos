package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.c */
/* loaded from: classes2.dex */
final class C6321c extends AbstractC6323e<Status> {
    C6321c(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: h */
    protected final /* synthetic */ Result mo13718h(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* renamed from: s */
    protected final /* synthetic */ void mo13719s(Api.AnyClient anyClient) throws RemoteException {
        zzg zzgVar = (zzg) anyClient;
        ((zzu) zzgVar.getService()).mo13740B3(new BinderC6322d(this), zzgVar.m13727j());
    }
}
