package g7;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import c7.C2333b;
import com.google.android.gms.common.internal.zzaj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
final class m0 implements ServiceConnection, q0 {

    /* renamed from: B, reason: collision with root package name */
    private final Map f42081B = new HashMap();

    /* renamed from: C, reason: collision with root package name */
    private int f42082C = 2;

    /* renamed from: D, reason: collision with root package name */
    private boolean f42083D;

    /* renamed from: E, reason: collision with root package name */
    private IBinder f42084E;

    /* renamed from: F, reason: collision with root package name */
    private final l0 f42085F;

    /* renamed from: G, reason: collision with root package name */
    private ComponentName f42086G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ p0 f42087H;

    public m0(p0 p0Var, l0 l0Var) {
        this.f42087H = p0Var;
        this.f42085F = l0Var;
    }

    static /* bridge */ /* synthetic */ C2333b d(m0 m0Var, String str, Executor executor) throws RemoteException {
        C2333b c2333b;
        try {
            Intent intentB = m0Var.f42085F.b(m0Var.f42087H.f42093h);
            m0Var.f42082C = 3;
            StrictMode.VmPolicy vmPolicyA = com.google.android.gms.common.util.v.a();
            try {
                p0 p0Var = m0Var.f42087H;
                boolean zD = p0Var.f42096k.d(p0Var.f42093h, str, intentB, m0Var, 4225, executor);
                m0Var.f42083D = zD;
                if (zD) {
                    m0Var.f42087H.f42094i.sendMessageDelayed(m0Var.f42087H.f42094i.obtainMessage(1, m0Var.f42085F), m0Var.f42087H.f42098m);
                    c2333b = C2333b.f31067F;
                } else {
                    m0Var.f42082C = 2;
                    try {
                        p0 p0Var2 = m0Var.f42087H;
                        p0Var2.f42096k.c(p0Var2.f42093h, m0Var);
                    } catch (IllegalArgumentException unused) {
                    }
                    c2333b = new C2333b(16);
                }
                return c2333b;
            } finally {
                StrictMode.setVmPolicy(vmPolicyA);
            }
        } catch (zzaj e10) {
            return e10.f33518B;
        }
    }

    public final int a() {
        return this.f42082C;
    }

    public final ComponentName b() {
        return this.f42086G;
    }

    public final IBinder c() {
        return this.f42084E;
    }

    public final void e(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f42081B.put(serviceConnection, serviceConnection2);
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f42081B.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f42087H.f42094i.removeMessages(1, this.f42085F);
        p0 p0Var = this.f42087H;
        p0Var.f42096k.c(p0Var.f42093h, this);
        this.f42083D = false;
        this.f42082C = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f42081B.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f42081B.isEmpty();
    }

    public final boolean j() {
        return this.f42083D;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f42087H.f42092g) {
            try {
                this.f42087H.f42094i.removeMessages(1, this.f42085F);
                this.f42084E = iBinder;
                this.f42086G = componentName;
                Iterator it = this.f42081B.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f42082C = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f42087H.f42092g) {
            try {
                this.f42087H.f42094i.removeMessages(1, this.f42085F);
                this.f42084E = null;
                this.f42086G = componentName;
                Iterator it = this.f42081B.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f42082C = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
