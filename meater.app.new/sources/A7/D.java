package A7;

import B7.C0892c;
import B7.C0903f1;
import B7.C0906g1;
import B7.C0910i;
import B7.H0;
import B7.H1;
import B7.L0;
import B7.M1;
import B7.P1;
import B7.W0;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;
import z7.AbstractC5208j;
import z7.InterfaceC5203e;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class D extends L0 {

    /* renamed from: B, reason: collision with root package name */
    private volatile int f953B = -1;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ AbstractServiceC0867v f954C;

    /* synthetic */ D(AbstractServiceC0867v abstractServiceC0867v, E e10) {
        this.f954C = abstractServiceC0867v;
    }

    static final /* synthetic */ void k(H0 h02, AbstractC5208j abstractC5208j) {
        if (abstractC5208j.o()) {
            v1(h02, true, (byte[]) abstractC5208j.k());
        } else {
            Log.e("WearableLS", "Failed to resolve future, sending null response", abstractC5208j.j());
            v1(h02, false, null);
        }
    }

    private final boolean u1(Runnable runnable, String str, Object obj) {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", String.format("%s: %s %s", str, this.f954C.f1031B.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f953B) {
            if ((!M1.a(this.f954C).b() || !com.google.android.gms.common.util.q.b(this.f954C, callingUid, "com.google.android.wearable.app.cn")) && !com.google.android.gms.common.util.q.a(this.f954C, callingUid)) {
                Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                return false;
            }
            this.f953B = callingUid;
        }
        synchronized (this.f954C.f1036G) {
            try {
                AbstractServiceC0867v abstractServiceC0867v = this.f954C;
                if (abstractServiceC0867v.f1037H) {
                    return false;
                }
                abstractServiceC0867v.f1032C.post(runnable);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static final void v1(H0 h02, boolean z10, byte[] bArr) {
        try {
            h02.u1(z10, bArr);
        } catch (RemoteException e10) {
            Log.e("WearableLS", "Failed to send a response back", e10);
        }
    }

    @Override // B7.M0
    public final void H(H1 h12) {
        u1(new B(this, h12), "onEntityUpdate", h12);
    }

    @Override // B7.M0
    public final void P0(P1 p12) {
        u1(new A(this, p12), "onNotificationReceived", p12);
    }

    @Override // B7.M0
    public final void Q0(DataHolder dataHolder) {
        try {
            if (u1(new Y(this, dataHolder), "onDataItemChanged", String.valueOf(dataHolder) + ", rows=" + dataHolder.getCount())) {
            }
        } finally {
            dataHolder.close();
        }
    }

    @Override // B7.M0
    public final void d0(W0 w02) {
        u1(new Z(this, w02), "onMessageReceived", w02);
    }

    @Override // B7.M0
    public final void e0(final W0 w02, final H0 h02) {
        u1(new Runnable() { // from class: A7.V
            @Override // java.lang.Runnable
            public final void run() {
                this.f995B.g(w02, h02);
            }
        }, "onRequestReceived", w02);
    }

    final /* synthetic */ void g(W0 w02, final H0 h02) {
        AbstractC5208j<byte[]> abstractC5208jV = this.f954C.v(w02.f0(), w02.h(), w02.f());
        if (abstractC5208jV == null) {
            v1(h02, false, null);
        } else {
            abstractC5208jV.c(new InterfaceC5203e(this) { // from class: A7.W
                @Override // z7.InterfaceC5203e
                public final void a(AbstractC5208j abstractC5208j) {
                    D.k(h02, abstractC5208j);
                }
            });
        }
    }

    @Override // B7.M0
    public final void m1(List list) {
        u1(new RunnableC0870y(this, list), "onConnectedNodes", list);
    }

    @Override // B7.M0
    public final void n0(C0892c c0892c) {
        u1(new RunnableC0871z(this, c0892c), "onConnectedCapabilityChanged", c0892c);
    }

    @Override // B7.M0
    public final void o0(C0906g1 c0906g1) {
        u1(new a0(this, c0906g1), "onPeerConnected", c0906g1);
    }

    @Override // B7.M0
    public final void q1(C0910i c0910i) {
        u1(new C(this, c0910i), "onChannelEvent", c0910i);
    }

    @Override // B7.M0
    public final void v(C0906g1 c0906g1) {
        u1(new b0(this, c0906g1), "onPeerDisconnected", c0906g1);
    }

    @Override // B7.M0
    public final void z0(final C0903f1 c0903f1) {
        if (u1(new Runnable() { // from class: A7.X
            @Override // java.lang.Runnable
            public final void run() {
                C0903f1 c0903f12 = c0903f1;
                C0857k c0857k = new C0857k(c0903f12.f1827C);
                try {
                    this.f999B.f954C.q(c0903f12.f1826B, c0857k);
                    c0857k.close();
                } catch (Throwable th) {
                    try {
                        c0857k.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, "onNodeMigrated", "DataHolder[rows=" + c0903f1.f1827C.getCount() + "]")) {
            return;
        }
        c0903f1.f1827C.close();
    }
}
