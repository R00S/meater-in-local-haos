package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: com.google.android.gms.common.internal.e */
/* loaded from: classes2.dex */
final class C6422e implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: f */
    private final /* synthetic */ GoogleApiClient.OnConnectionFailedListener f17811f;

    C6422e(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f17811f = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    /* renamed from: E0 */
    public final void mo14286E0(ConnectionResult connectionResult) {
        this.f17811f.mo13895E0(connectionResult);
    }
}
