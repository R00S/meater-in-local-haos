package g7;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import c7.C2333b;
import com.apptionlabs.meater_app.data.Config;
import java.util.HashMap;
import java.util.concurrent.Executor;
import r7.HandlerC4360e;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
final class p0 extends AbstractC3438i {

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f42092g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Context f42093h;

    /* renamed from: i, reason: collision with root package name */
    private volatile Handler f42094i;

    /* renamed from: j, reason: collision with root package name */
    private final n0 f42095j;

    /* renamed from: k, reason: collision with root package name */
    private final j7.b f42096k;

    /* renamed from: l, reason: collision with root package name */
    private final long f42097l;

    /* renamed from: m, reason: collision with root package name */
    private final long f42098m;

    /* renamed from: n, reason: collision with root package name */
    private volatile Executor f42099n;

    p0(Context context, Looper looper, Executor executor) {
        n0 n0Var = new n0(this, null);
        this.f42095j = n0Var;
        this.f42093h = context.getApplicationContext();
        this.f42094i = new HandlerC4360e(looper, n0Var);
        this.f42096k = j7.b.b();
        this.f42097l = Config.MC_BROADCAST_INTERVAL_WIFI;
        this.f42098m = 300000L;
        this.f42099n = executor;
    }

    @Override // g7.AbstractC3438i
    protected final C2333b d(l0 l0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        C2333b c2333bD;
        C3445p.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f42092g) {
            try {
                m0 m0Var = (m0) this.f42092g.get(l0Var);
                if (executor == null) {
                    executor = this.f42099n;
                }
                if (m0Var == null) {
                    m0Var = new m0(this, l0Var);
                    m0Var.e(serviceConnection, serviceConnection, str);
                    c2333bD = m0.d(m0Var, str, executor);
                    this.f42092g.put(l0Var, m0Var);
                } else {
                    this.f42094i.removeMessages(0, l0Var);
                    if (m0Var.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + l0Var.toString());
                    }
                    m0Var.e(serviceConnection, serviceConnection, str);
                    int iA = m0Var.a();
                    if (iA == 1) {
                        serviceConnection.onServiceConnected(m0Var.b(), m0Var.c());
                    } else if (iA == 2) {
                        c2333bD = m0.d(m0Var, str, executor);
                    }
                    c2333bD = null;
                }
                if (m0Var.j()) {
                    return C2333b.f31067F;
                }
                if (c2333bD == null) {
                    c2333bD = new C2333b(-1);
                }
                return c2333bD;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g7.AbstractC3438i
    protected final void e(l0 l0Var, ServiceConnection serviceConnection, String str) {
        C3445p.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f42092g) {
            try {
                m0 m0Var = (m0) this.f42092g.get(l0Var);
                if (m0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + l0Var.toString());
                }
                if (!m0Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + l0Var.toString());
                }
                m0Var.f(serviceConnection, str);
                if (m0Var.i()) {
                    this.f42094i.sendMessageDelayed(this.f42094i.obtainMessage(0, l0Var), this.f42097l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
