package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: com.google.android.gms.internal.ads.t0 */
/* loaded from: classes2.dex */
final class C7174t0 implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: f */
    private final /* synthetic */ zzbbr f20547f;

    C7174t0(zzaii zzaiiVar, zzbbr zzbbrVar) {
        this.f20547f = zzbbrVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    /* renamed from: E0 */
    public final void mo14286E0(ConnectionResult connectionResult) {
        this.f20547f.m17386c(new RuntimeException("Connection failed."));
    }
}
