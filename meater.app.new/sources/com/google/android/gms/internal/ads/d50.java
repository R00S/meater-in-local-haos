package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes2.dex */
final class d50 implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: f */
    private final /* synthetic */ zzbbr f18491f;

    /* renamed from: g */
    private final /* synthetic */ zzwb f18492g;

    d50(zzwb zzwbVar, zzbbr zzbbrVar) {
        this.f18492g = zzwbVar;
        this.f18491f = zzbbrVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    /* renamed from: E0 */
    public final void mo14286E0(ConnectionResult connectionResult) {
        synchronized (this.f18492g.f27241d) {
            this.f18491f.m17386c(new RuntimeException("Connection failed."));
        }
    }
}
