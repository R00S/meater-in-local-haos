package g7;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
final class n0 implements Handler.Callback {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ p0 f42090B;

    /* synthetic */ n0(p0 p0Var, o0 o0Var) {
        this.f42090B = p0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f42090B.f42092g) {
                try {
                    l0 l0Var = (l0) message.obj;
                    m0 m0Var = (m0) this.f42090B.f42092g.get(l0Var);
                    if (m0Var != null && m0Var.i()) {
                        if (m0Var.j()) {
                            m0Var.g("GmsClientSupervisor");
                        }
                        this.f42090B.f42092g.remove(l0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.f42090B.f42092g) {
            try {
                l0 l0Var2 = (l0) message.obj;
                m0 m0Var2 = (m0) this.f42090B.f42092g.get(l0Var2);
                if (m0Var2 != null && m0Var2.a() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(l0Var2), new Exception());
                    ComponentName componentNameB = m0Var2.b();
                    if (componentNameB == null) {
                        componentNameB = l0Var2.a();
                    }
                    if (componentNameB == null) {
                        String strC = l0Var2.c();
                        C3445p.k(strC);
                        componentNameB = new ComponentName(strC, "unknown");
                    }
                    m0Var2.onServiceDisconnected(componentNameB);
                }
            } finally {
            }
        }
        return true;
    }
}
