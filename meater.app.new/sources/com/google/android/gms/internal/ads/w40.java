package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes2.dex */
final class w40 implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: f */
    private final /* synthetic */ zzvn f20832f;

    w40(zzvn zzvnVar) {
        this.f20832f = zzvnVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: H */
    public final void mo14284H(int i2) {
        synchronized (this.f20832f.f27225b) {
            this.f20832f.f27228e = null;
            this.f20832f.f27225b.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: P */
    public final void mo14285P(Bundle bundle) {
        synchronized (this.f20832f.f27225b) {
            try {
            } catch (DeadObjectException e2) {
                zzbad.m17347c("Unable to obtain a cache service instance.", e2);
                this.f20832f.m20663b();
            }
            if (this.f20832f.f27226c != null) {
                zzvn zzvnVar = this.f20832f;
                zzvnVar.f27228e = zzvnVar.f27226c.m20677e();
                this.f20832f.f27225b.notifyAll();
            } else {
                this.f20832f.f27225b.notifyAll();
            }
        }
    }
}
