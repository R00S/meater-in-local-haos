package X1;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: SystemClock.java */
/* loaded from: classes.dex */
public class B implements InterfaceC1807d {
    protected B() {
    }

    @Override // X1.InterfaceC1807d
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // X1.InterfaceC1807d
    public long b() {
        return System.nanoTime();
    }

    @Override // X1.InterfaceC1807d
    public long c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // X1.InterfaceC1807d
    public long d() {
        return SystemClock.uptimeMillis();
    }

    @Override // X1.InterfaceC1807d
    public InterfaceC1813j e(Looper looper, Handler.Callback callback) {
        return new C(new Handler(looper, callback));
    }

    @Override // X1.InterfaceC1807d
    public void f() {
    }
}
