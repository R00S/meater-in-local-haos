package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public interface GoogleSignInApi {
    /* renamed from: a */
    Intent mo13660a(GoogleApiClient googleApiClient);

    /* renamed from: b */
    GoogleSignInResult mo13661b(Intent intent);

    /* renamed from: c */
    PendingResult<Status> mo13662c(GoogleApiClient googleApiClient);

    /* renamed from: d */
    PendingResult<Status> mo13663d(GoogleApiClient googleApiClient);
}
