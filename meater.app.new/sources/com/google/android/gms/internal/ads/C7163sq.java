package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: com.google.android.gms.internal.ads.sq */
/* loaded from: classes2.dex */
final class C7163sq implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: f */
    private final zzdba f20532f;

    /* renamed from: g */
    private final zzdau f20533g;

    /* renamed from: h */
    private final Object f20534h = new Object();

    /* renamed from: i */
    private boolean f20535i = false;

    /* renamed from: j */
    private boolean f20536j = false;

    C7163sq(Context context, Looper looper, zzdau zzdauVar) {
        this.f20533g = zzdauVar;
        this.f20532f = new zzdba(context, looper, this, this);
    }

    /* renamed from: a */
    private final void m15846a() {
        synchronized (this.f20534h) {
            if (this.f20532f.isConnected() || this.f20532f.isConnecting()) {
                this.f20532f.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    /* renamed from: E0 */
    public final void mo14286E0(ConnectionResult connectionResult) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: H */
    public final void mo14284H(int i2) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: P */
    public final void mo14285P(Bundle bundle) {
        synchronized (this.f20534h) {
            if (this.f20536j) {
                return;
            }
            this.f20536j = true;
            try {
                this.f20532f.m19171e().mo19175s3(new zzday(this.f20533g.mo19587g()));
                m15846a();
            } catch (Exception unused) {
                m15846a();
            } catch (Throwable th) {
                m15846a();
                throw th;
            }
        }
    }

    /* renamed from: b */
    final void m15847b() {
        synchronized (this.f20534h) {
            if (!this.f20535i) {
                this.f20535i = true;
                this.f20532f.checkAvailabilityAndConnect();
            }
        }
    }
}
