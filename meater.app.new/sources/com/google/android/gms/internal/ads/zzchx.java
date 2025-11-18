package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.InputStream;

/* loaded from: classes2.dex */
public abstract class zzchx implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: f */
    protected final zzbbr<InputStream> f24342f = new zzbbr<>();

    /* renamed from: g */
    protected final Object f24343g = new Object();

    /* renamed from: h */
    protected boolean f24344h = false;

    /* renamed from: i */
    protected boolean f24345i = false;

    /* renamed from: j */
    protected zzarx f24346j;

    /* renamed from: k */
    protected zzarf f24347k;

    /* renamed from: E0 */
    public void mo14286E0(ConnectionResult connectionResult) {
        zzbad.m17349e("Disconnected from remote ad request service.");
        this.f24342f.m17386c(new zzcie(0));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: H */
    public void mo14284H(int i2) {
        zzbad.m17349e("Cannot connect to remote service, fallback to local instance.");
    }

    /* renamed from: a */
    protected final void m18801a() {
        synchronized (this.f24343g) {
            this.f24345i = true;
            if (this.f24347k.isConnected() || this.f24347k.isConnecting()) {
                this.f24347k.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
