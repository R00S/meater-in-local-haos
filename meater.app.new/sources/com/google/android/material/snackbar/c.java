package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager.java */
/* loaded from: classes2.dex */
class c {

    /* renamed from: e, reason: collision with root package name */
    private static c f37142e;

    /* renamed from: a, reason: collision with root package name */
    private final Object f37143a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Handler f37144b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c, reason: collision with root package name */
    private C0476c f37145c;

    /* renamed from: d, reason: collision with root package name */
    private C0476c f37146d;

    /* compiled from: SnackbarManager.java */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            c.this.d((C0476c) message.obj);
            return true;
        }
    }

    /* compiled from: SnackbarManager.java */
    interface b {
        void b();

        void c(int i10);
    }

    /* compiled from: SnackbarManager.java */
    /* renamed from: com.google.android.material.snackbar.c$c, reason: collision with other inner class name */
    private static class C0476c {

        /* renamed from: a, reason: collision with root package name */
        final WeakReference<b> f37148a;

        /* renamed from: b, reason: collision with root package name */
        int f37149b;

        /* renamed from: c, reason: collision with root package name */
        boolean f37150c;

        C0476c(int i10, b bVar) {
            this.f37148a = new WeakReference<>(bVar);
            this.f37149b = i10;
        }

        boolean a(b bVar) {
            return bVar != null && this.f37148a.get() == bVar;
        }
    }

    private c() {
    }

    private boolean a(C0476c c0476c, int i10) {
        b bVar = c0476c.f37148a.get();
        if (bVar == null) {
            return false;
        }
        this.f37144b.removeCallbacksAndMessages(c0476c);
        bVar.c(i10);
        return true;
    }

    static c c() {
        if (f37142e == null) {
            f37142e = new c();
        }
        return f37142e;
    }

    private boolean f(b bVar) {
        C0476c c0476c = this.f37145c;
        return c0476c != null && c0476c.a(bVar);
    }

    private boolean g(b bVar) {
        C0476c c0476c = this.f37146d;
        return c0476c != null && c0476c.a(bVar);
    }

    private void l(C0476c c0476c) {
        int i10 = c0476c.f37149b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? ProtocolParameters.MAX_UDP_MSG_LENGTH : 2750;
        }
        this.f37144b.removeCallbacksAndMessages(c0476c);
        Handler handler = this.f37144b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c0476c), i10);
    }

    private void n() {
        C0476c c0476c = this.f37146d;
        if (c0476c != null) {
            this.f37145c = c0476c;
            this.f37146d = null;
            b bVar = c0476c.f37148a.get();
            if (bVar != null) {
                bVar.b();
            } else {
                this.f37145c = null;
            }
        }
    }

    public void b(b bVar, int i10) {
        synchronized (this.f37143a) {
            try {
                if (f(bVar)) {
                    a(this.f37145c, i10);
                } else if (g(bVar)) {
                    a(this.f37146d, i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void d(C0476c c0476c) {
        synchronized (this.f37143a) {
            try {
                if (this.f37145c == c0476c || this.f37146d == c0476c) {
                    a(c0476c, 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(b bVar) {
        boolean z10;
        synchronized (this.f37143a) {
            try {
                z10 = f(bVar) || g(bVar);
            } finally {
            }
        }
        return z10;
    }

    public void h(b bVar) {
        synchronized (this.f37143a) {
            try {
                if (f(bVar)) {
                    this.f37145c = null;
                    if (this.f37146d != null) {
                        n();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.f37143a) {
            try {
                if (f(bVar)) {
                    l(this.f37145c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f37143a) {
            try {
                if (f(bVar)) {
                    C0476c c0476c = this.f37145c;
                    if (!c0476c.f37150c) {
                        c0476c.f37150c = true;
                        this.f37144b.removeCallbacksAndMessages(c0476c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f37143a) {
            try {
                if (f(bVar)) {
                    C0476c c0476c = this.f37145c;
                    if (c0476c.f37150c) {
                        c0476c.f37150c = false;
                        l(c0476c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(int i10, b bVar) {
        synchronized (this.f37143a) {
            try {
                if (f(bVar)) {
                    C0476c c0476c = this.f37145c;
                    c0476c.f37149b = i10;
                    this.f37144b.removeCallbacksAndMessages(c0476c);
                    l(this.f37145c);
                    return;
                }
                if (g(bVar)) {
                    this.f37146d.f37149b = i10;
                } else {
                    this.f37146d = new C0476c(i10, bVar);
                }
                C0476c c0476c2 = this.f37145c;
                if (c0476c2 == null || !a(c0476c2, 4)) {
                    this.f37145c = null;
                    n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
