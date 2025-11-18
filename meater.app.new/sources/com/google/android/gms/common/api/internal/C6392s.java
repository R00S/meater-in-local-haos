package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.s */
/* loaded from: classes2.dex */
final class C6392s implements GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: f */
    private final /* synthetic */ StatusPendingResult f17457f;

    C6392s(zaaw zaawVar, StatusPendingResult statusPendingResult) {
        this.f17457f = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    /* renamed from: E0 */
    public final void mo13895E0(ConnectionResult connectionResult) {
        this.f17457f.m13940k(new Status(8));
    }
}
