package com.google.android.gms.auth.api.accounttransfer;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.b */
/* loaded from: classes2.dex */
final class C6306b extends Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzu, zzn> {
    C6306b() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    /* renamed from: c */
    public final /* synthetic */ Api.Client mo13600c(Context context, Looper looper, ClientSettings clientSettings, zzn zznVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.internal.auth.zzu(context, looper, clientSettings, zznVar, connectionCallbacks, onConnectionFailedListener);
    }
}
