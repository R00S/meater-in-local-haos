package X1;

import X1.InterfaceC1813j;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SystemHandlerWrapper.java */
/* loaded from: classes.dex */
final class C implements InterfaceC1813j {

    /* renamed from: b, reason: collision with root package name */
    private static final List<b> f18612b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f18613a;

    /* compiled from: SystemHandlerWrapper.java */
    private static final class b implements InterfaceC1813j.a {

        /* renamed from: a, reason: collision with root package name */
        private Message f18614a;

        /* renamed from: b, reason: collision with root package name */
        private C f18615b;

        private b() {
        }

        private void b() {
            this.f18614a = null;
            this.f18615b = null;
            C.n(this);
        }

        @Override // X1.InterfaceC1813j.a
        public void a() {
            ((Message) C1804a.e(this.f18614a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) C1804a.e(this.f18614a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        public b d(Message message, C c10) {
            this.f18614a = message;
            this.f18615b = c10;
            return this;
        }
    }

    public C(Handler handler) {
        this.f18613a = handler;
    }

    private static b m() {
        b bVar;
        List<b> list = f18612b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(b bVar) {
        List<b> list = f18612b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // X1.InterfaceC1813j
    public InterfaceC1813j.a a(int i10, int i11, int i12) {
        return m().d(this.f18613a.obtainMessage(i10, i11, i12), this);
    }

    @Override // X1.InterfaceC1813j
    public boolean b(InterfaceC1813j.a aVar) {
        return ((b) aVar).c(this.f18613a);
    }

    @Override // X1.InterfaceC1813j
    public boolean c(Runnable runnable) {
        return this.f18613a.post(runnable);
    }

    @Override // X1.InterfaceC1813j
    public InterfaceC1813j.a d(int i10) {
        return m().d(this.f18613a.obtainMessage(i10), this);
    }

    @Override // X1.InterfaceC1813j
    public boolean e(int i10) {
        C1804a.a(i10 != 0);
        return this.f18613a.hasMessages(i10);
    }

    @Override // X1.InterfaceC1813j
    public boolean f(int i10) {
        return this.f18613a.sendEmptyMessage(i10);
    }

    @Override // X1.InterfaceC1813j
    public boolean g(int i10, long j10) {
        return this.f18613a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // X1.InterfaceC1813j
    public void h(int i10) {
        C1804a.a(i10 != 0);
        this.f18613a.removeMessages(i10);
    }

    @Override // X1.InterfaceC1813j
    public InterfaceC1813j.a i(int i10, Object obj) {
        return m().d(this.f18613a.obtainMessage(i10, obj), this);
    }

    @Override // X1.InterfaceC1813j
    public void j(Object obj) {
        this.f18613a.removeCallbacksAndMessages(obj);
    }

    @Override // X1.InterfaceC1813j
    public Looper k() {
        return this.f18613a.getLooper();
    }
}
