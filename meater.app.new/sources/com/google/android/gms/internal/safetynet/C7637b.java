package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.safetynet.zzk;

/* renamed from: com.google.android.gms.internal.safetynet.b */
/* loaded from: classes2.dex */
final class C7637b extends zzk.AbstractC7639a {
    C7637b(zzk zzkVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* renamed from: s */
    protected final /* synthetic */ void mo13719s(Api.AnyClient anyClient) throws RemoteException {
        ((zzi) ((zzx) anyClient).getService()).mo22629M1(this.f28422s);
    }
}
