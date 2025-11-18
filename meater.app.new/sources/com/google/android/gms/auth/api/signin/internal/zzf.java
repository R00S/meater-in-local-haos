package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class zzf implements GoogleSignInApi {
    /* renamed from: e */
    private static GoogleSignInOptions m13726e(GoogleApiClient googleApiClient) {
        return ((zzg) googleApiClient.mo13876m(Auth.f16898b)).m13727j();
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    /* renamed from: a */
    public final Intent mo13660a(GoogleApiClient googleApiClient) {
        return zzh.m13729b(googleApiClient.mo13877n(), m13726e(googleApiClient));
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    /* renamed from: b */
    public final GoogleSignInResult mo13661b(Intent intent) {
        return zzh.m13728a(intent);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    /* renamed from: c */
    public final PendingResult<Status> mo13662c(GoogleApiClient googleApiClient) {
        return zzh.m13732e(googleApiClient, googleApiClient.mo13877n(), false);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    /* renamed from: d */
    public final PendingResult<Status> mo13663d(GoogleApiClient googleApiClient) {
        return zzh.m13730c(googleApiClient, googleApiClient.mo13877n(), false);
    }
}
