package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;

/* renamed from: com.google.android.gms.common.internal.service.a */
/* loaded from: classes2.dex */
final class C6433a extends Api.AbstractClientBuilder<zai, Api.ApiOptions.NoOptions> {
    C6433a() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    /* renamed from: c */
    public final /* synthetic */ Api.Client mo13600c(Context context, Looper looper, ClientSettings clientSettings, Api.ApiOptions.NoOptions noOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new zai(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
