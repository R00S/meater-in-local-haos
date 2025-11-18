package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
final class z40 implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: f */
    private final /* synthetic */ zzvv f21365f;

    /* renamed from: g */
    private final /* synthetic */ zzbbr f21366g;

    /* renamed from: h */
    final /* synthetic */ zzwb f21367h;

    z40(zzwb zzwbVar, zzvv zzvvVar, zzbbr zzbbrVar) {
        this.f21367h = zzwbVar;
        this.f21365f = zzvvVar;
        this.f21366g = zzbbrVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: H */
    public final void mo14284H(int i2) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: P */
    public final void mo14285P(Bundle bundle) {
        synchronized (this.f21367h.f27241d) {
            if (this.f21367h.f27239b) {
                return;
            }
            zzwb.m20685c(this.f21367h, true);
            final zzvu zzvuVar = this.f21367h.f27238a;
            if (zzvuVar == null) {
                return;
            }
            final zzvv zzvvVar = this.f21365f;
            final zzbbr zzbbrVar = this.f21366g;
            final zzbbh<?> zzbbhVarM17119b = zzaxg.m17119b(new Runnable(this, zzvuVar, zzvvVar, zzbbrVar) { // from class: com.google.android.gms.internal.ads.a50

                /* renamed from: f */
                private final z40 f18082f;

                /* renamed from: g */
                private final zzvu f18083g;

                /* renamed from: h */
                private final zzvv f18084h;

                /* renamed from: i */
                private final zzbbr f18085i;

                {
                    this.f18082f = this;
                    this.f18083g = zzvuVar;
                    this.f18084h = zzvvVar;
                    this.f18085i = zzbbrVar;
                }

                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    z40 z40Var = this.f18082f;
                    zzvu zzvuVar2 = this.f18083g;
                    zzvv zzvvVar2 = this.f18084h;
                    zzbbr zzbbrVar2 = this.f18085i;
                    try {
                        zzvs zzvsVarMo20681F4 = zzvuVar2.m20677e().mo20681F4(zzvvVar2);
                        if (!zzvsVarMo20681F4.m20675y()) {
                            zzbbrVar2.m17386c(new RuntimeException("No entry contents."));
                            z40Var.f21367h.m20683a();
                            return;
                        }
                        c50 c50Var = new c50(z40Var, zzvsVarMo20681F4.m20676z(), 1);
                        int i2 = c50Var.read();
                        if (i2 == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        c50Var.unread(i2);
                        zzbbrVar2.m17385a(c50Var);
                    } catch (RemoteException | IOException e2) {
                        zzbad.m17347c("Unable to obtain a cache service instance.", e2);
                        zzbbrVar2.m17386c(e2);
                        z40Var.f21367h.m20683a();
                    }
                }
            });
            final zzbbr zzbbrVar2 = this.f21366g;
            zzbbrVar2.mo14748k(new Runnable(zzbbrVar2, zzbbhVarM17119b) { // from class: com.google.android.gms.internal.ads.b50

                /* renamed from: f */
                private final zzbbr f18248f;

                /* renamed from: g */
                private final Future f18249g;

                {
                    this.f18248f = zzbbrVar2;
                    this.f18249g = zzbbhVarM17119b;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbbr zzbbrVar3 = this.f18248f;
                    Future future = this.f18249g;
                    if (zzbbrVar3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, zzbbm.f22758b);
        }
    }
}
