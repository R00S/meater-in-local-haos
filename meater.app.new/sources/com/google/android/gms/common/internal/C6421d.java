package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: com.google.android.gms.common.internal.d */
/* loaded from: classes2.dex */
final class C6421d implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: f */
    private final /* synthetic */ GoogleApiClient.ConnectionCallbacks f17810f;

    C6421d(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f17810f = connectionCallbacks;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: H */
    public final void mo14284H(int i2) {
        this.f17810f.mo13893H(i2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: P */
    public final void mo14285P(Bundle bundle) {
        this.f17810f.mo13894P(bundle);
    }
}
