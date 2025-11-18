package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbp;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.ads.rq */
/* loaded from: classes2.dex */
final class C7126rq implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: f */
    @VisibleForTesting
    private zzdba f20469f;

    /* renamed from: g */
    private final String f20470g;

    /* renamed from: h */
    private final String f20471h;

    /* renamed from: i */
    private final LinkedBlockingQueue<zzbp.zza> f20472i;

    /* renamed from: j */
    private final HandlerThread f20473j;

    public C7126rq(Context context, String str, String str2) {
        this.f20470g = str;
        this.f20471h = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f20473j = handlerThread;
        handlerThread.start();
        this.f20469f = new zzdba(context, handlerThread.getLooper(), this, this);
        this.f20472i = new LinkedBlockingQueue<>();
        this.f20469f.checkAvailabilityAndConnect();
    }

    /* renamed from: a */
    private final void m15818a() {
        zzdba zzdbaVar = this.f20469f;
        if (zzdbaVar != null) {
            if (zzdbaVar.isConnected() || this.f20469f.isConnecting()) {
                this.f20469f.disconnect();
            }
        }
    }

    /* renamed from: b */
    private final zzdbf m15819b() {
        try {
            return this.f20469f.m19171e();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    private static zzbp.zza m15820c() {
        return (zzbp.zza) ((zzdob) zzbp.zza.m18013k0().m18067N(32768L).mo19736p0());
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    /* renamed from: E0 */
    public final void mo14286E0(ConnectionResult connectionResult) throws InterruptedException {
        try {
            this.f20472i.put(m15820c());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: H */
    public final void mo14284H(int i2) throws InterruptedException {
        try {
            this.f20472i.put(m15820c());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: P */
    public final void mo14285P(Bundle bundle) {
        zzdbf zzdbfVarM15819b = m15819b();
        if (zzdbfVarM15819b != null) {
            try {
                try {
                    this.f20472i.put(zzdbfVarM15819b.mo19174B4(new zzdbb(this.f20470g, this.f20471h)).m19173y());
                    m15818a();
                    this.f20473j.quit();
                } catch (InterruptedException unused) {
                    m15818a();
                    this.f20473j.quit();
                } catch (Throwable th) {
                    m15818a();
                    this.f20473j.quit();
                    throw th;
                }
            } catch (Throwable unused2) {
                this.f20472i.put(m15820c());
                m15818a();
                this.f20473j.quit();
            }
        }
    }

    /* renamed from: d */
    public final zzbp.zza m15821d(int i2) throws InterruptedException {
        zzbp.zza zzaVarPoll;
        try {
            zzaVarPoll = this.f20472i.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzaVarPoll = null;
        }
        return zzaVarPoll == null ? m15820c() : zzaVarPoll;
    }
}
