package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.c */
/* loaded from: classes2.dex */
final class C6308c extends Api.AbstractClientBuilder<zzg, GoogleSignInOptions> {
    C6308c() {
    }

    @Override // com.google.android.gms.common.api.Api.BaseClientBuilder
    /* renamed from: a */
    public final /* synthetic */ List mo13613a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.m13683z();
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    /* renamed from: c */
    public final /* synthetic */ Api.Client mo13600c(Context context, Looper looper, ClientSettings clientSettings, GoogleSignInOptions googleSignInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new zzg(context, looper, clientSettings, googleSignInOptions, connectionCallbacks, onConnectionFailedListener);
    }
}
