package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* loaded from: classes2.dex */
public final class zzvn {

    /* renamed from: a */
    private final Runnable f27224a = new u40(this);

    /* renamed from: b */
    private final Object f27225b = new Object();

    /* renamed from: c */
    private zzvu f27226c;

    /* renamed from: d */
    private Context f27227d;

    /* renamed from: e */
    private zzvy f27228e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m20662a() {
        synchronized (this.f27225b) {
            if (this.f27227d != null && this.f27226c == null) {
                zzvu zzvuVarM20664e = m20664e(new w40(this), new x40(this));
                this.f27226c = zzvuVarM20664e;
                zzvuVarM20664e.checkAvailabilityAndConnect();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m20663b() {
        synchronized (this.f27225b) {
            zzvu zzvuVar = this.f27226c;
            if (zzvuVar == null) {
                return;
            }
            if (zzvuVar.isConnected() || this.f27226c.isConnecting()) {
                this.f27226c.disconnect();
            }
            this.f27226c = null;
            this.f27228e = null;
            Binder.flushPendingCommands();
        }
    }

    @VisibleForTesting
    /* renamed from: e */
    private final synchronized zzvu m20664e(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzvu(this.f27227d, zzk.zzlu().m17276b(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    /* renamed from: f */
    static /* synthetic */ zzvu m20665f(zzvn zzvnVar, zzvu zzvuVar) {
        zzvnVar.f27226c = null;
        return null;
    }

    /* renamed from: c */
    public final void m20671c(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f27225b) {
            if (this.f27227d != null) {
                return;
            }
            this.f27227d = context.getApplicationContext();
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21884v3)).booleanValue()) {
                m20662a();
            } else {
                if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21878u3)).booleanValue()) {
                    zzk.zzlj().m20630d(new v40(this));
                }
            }
        }
    }

    /* renamed from: d */
    public final zzvs m20672d(zzvv zzvvVar) {
        synchronized (this.f27225b) {
            zzvy zzvyVar = this.f27228e;
            if (zzvyVar == null) {
                return new zzvs();
            }
            try {
                return zzvyVar.mo20681F4(zzvvVar);
            } catch (RemoteException e2) {
                zzbad.m17347c("Unable to call into cache service.", e2);
                return new zzvs();
            }
        }
    }

    /* renamed from: l */
    public final void m20673l() {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21890w3)).booleanValue()) {
            synchronized (this.f27225b) {
                m20662a();
                zzk.zzlg();
                Handler handler = zzaxi.f22654a;
                handler.removeCallbacks(this.f27224a);
                zzk.zzlg();
                handler.postDelayed(this.f27224a, ((Long) zzyt.m20848e().m16421c(zzacu.f21896x3)).longValue());
            }
        }
    }
}
