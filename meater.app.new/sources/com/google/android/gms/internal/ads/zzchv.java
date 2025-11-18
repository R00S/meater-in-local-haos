package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.ConnectionResult;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class zzchv extends zzchx {
    public zzchv(Context context) {
        this.f24347k = new zzarf(context, zzk.zzlu().m17276b(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzchx, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    /* renamed from: E0 */
    public final void mo14286E0(ConnectionResult connectionResult) {
        zzbad.m17349e("Cannot connect to remote service, fallback to local instance.");
        this.f24342f.m17386c(new zzcie(0));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: P */
    public final void mo14285P(Bundle bundle) {
        synchronized (this.f24343g) {
            if (!this.f24345i) {
                this.f24345i = true;
                try {
                    this.f24347k.m16891e().mo16892I5(this.f24346j, new zzchy(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f24342f.m17386c(new zzcie(0));
                } catch (Throwable th) {
                    zzk.zzlk().m17052e(th, "RemoteAdRequestClientTask.onConnected");
                    this.f24342f.m17386c(new zzcie(0));
                }
            }
        }
    }

    /* renamed from: b */
    public final zzbbh<InputStream> m18800b(zzarx zzarxVar) {
        synchronized (this.f24343g) {
            if (this.f24344h) {
                return this.f24342f;
            }
            this.f24344h = true;
            this.f24346j = zzarxVar;
            this.f24347k.checkAvailabilityAndConnect();
            this.f24342f.mo14748k(new Runnable(this) { // from class: com.google.android.gms.internal.ads.hj

                /* renamed from: f */
                private final zzchv f19233f;

                {
                    this.f19233f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f19233f.m18801a();
                }
            }, zzbbm.f22758b);
            return this.f24342f;
        }
    }
}
