package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class zaq implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: f */
    public final Api<?> f17604f;

    /* renamed from: g */
    private final boolean f17605g;

    /* renamed from: h */
    private zar f17606h;

    public zaq(Api<?> api, boolean z) {
        this.f17604f = api;
        this.f17605g = z;
    }

    /* renamed from: b */
    private final void m14219b() {
        Preconditions.m14373l(this.f17606h, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    /* renamed from: E0 */
    public final void mo13895E0(ConnectionResult connectionResult) {
        m14219b();
        this.f17606h.mo14012k0(connectionResult, this.f17604f, this.f17605g);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    /* renamed from: H */
    public final void mo13893H(int i2) {
        m14219b();
        this.f17606h.mo13893H(i2);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    /* renamed from: P */
    public final void mo13894P(Bundle bundle) {
        m14219b();
        this.f17606h.mo13894P(bundle);
    }

    /* renamed from: a */
    public final void m14220a(zar zarVar) {
        this.f17606h = zarVar;
    }
}
