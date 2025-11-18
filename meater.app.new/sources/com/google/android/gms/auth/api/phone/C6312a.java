package com.google.android.gms.auth.api.phone;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.p476authapiphone.zzi;

/* renamed from: com.google.android.gms.auth.api.phone.a */
/* loaded from: classes2.dex */
final class C6312a extends Api.AbstractClientBuilder<zzi, Api.ApiOptions.NoOptions> {
    C6312a() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    /* renamed from: c */
    public final /* synthetic */ Api.Client mo13600c(Context context, Looper looper, ClientSettings clientSettings, Api.ApiOptions.NoOptions noOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new zzi(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
