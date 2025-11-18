package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: com.google.android.gms.internal.ads.s0 */
/* loaded from: classes2.dex */
final class C7137s0 implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: f */
    private final /* synthetic */ zzbbr f20488f;

    /* renamed from: g */
    private final /* synthetic */ zzaii f20489g;

    C7137s0(zzaii zzaiiVar, zzbbr zzbbrVar) {
        this.f20489g = zzaiiVar;
        this.f20488f = zzbbrVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: H */
    public final void mo14284H(int i2) {
        zzbbr zzbbrVar = this.f20488f;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i2);
        zzbbrVar.m17386c(new RuntimeException(sb.toString()));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: P */
    public final void mo14285P(Bundle bundle) {
        try {
            this.f20488f.m17385a(this.f20489g.f22059a.m16583e());
        } catch (DeadObjectException e2) {
            this.f20488f.m17386c(e2);
        }
    }
}
