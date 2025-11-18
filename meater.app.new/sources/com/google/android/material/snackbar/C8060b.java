package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager.java */
/* renamed from: com.google.android.material.snackbar.b */
/* loaded from: classes2.dex */
class C8060b {

    /* renamed from: a */
    private static C8060b f30495a;

    /* renamed from: b */
    private final Object f30496b = new Object();

    /* renamed from: c */
    private final Handler f30497c = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: d */
    private c f30498d;

    /* renamed from: e */
    private c f30499e;

    /* compiled from: SnackbarManager.java */
    /* renamed from: com.google.android.material.snackbar.b$a */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C8060b.this.m24781d((c) message.obj);
            return true;
        }
    }

    /* compiled from: SnackbarManager.java */
    /* renamed from: com.google.android.material.snackbar.b$b */
    interface b {
        /* renamed from: a */
        void mo24755a(int i2);

        void show();
    }

    /* compiled from: SnackbarManager.java */
    /* renamed from: com.google.android.material.snackbar.b$c */
    private static class c {

        /* renamed from: a */
        final WeakReference<b> f30501a;

        /* renamed from: b */
        int f30502b;

        /* renamed from: c */
        boolean f30503c;

        c(int i2, b bVar) {
            this.f30501a = new WeakReference<>(bVar);
            this.f30502b = i2;
        }

        /* renamed from: a */
        boolean m24788a(b bVar) {
            return bVar != null && this.f30501a.get() == bVar;
        }
    }

    private C8060b() {
    }

    /* renamed from: a */
    private boolean m24774a(c cVar, int i2) {
        b bVar = cVar.f30501a.get();
        if (bVar == null) {
            return false;
        }
        this.f30497c.removeCallbacksAndMessages(cVar);
        bVar.mo24755a(i2);
        return true;
    }

    /* renamed from: c */
    static C8060b m24775c() {
        if (f30495a == null) {
            f30495a = new C8060b();
        }
        return f30495a;
    }

    /* renamed from: f */
    private boolean m24776f(b bVar) {
        c cVar = this.f30498d;
        return cVar != null && cVar.m24788a(bVar);
    }

    /* renamed from: g */
    private boolean m24777g(b bVar) {
        c cVar = this.f30499e;
        return cVar != null && cVar.m24788a(bVar);
    }

    /* renamed from: l */
    private void m24778l(c cVar) {
        int i2 = cVar.f30502b;
        if (i2 == -2) {
            return;
        }
        if (i2 <= 0) {
            i2 = i2 == -1 ? 1500 : 2750;
        }
        this.f30497c.removeCallbacksAndMessages(cVar);
        Handler handler = this.f30497c;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i2);
    }

    /* renamed from: n */
    private void m24779n() {
        c cVar = this.f30499e;
        if (cVar != null) {
            this.f30498d = cVar;
            this.f30499e = null;
            b bVar = cVar.f30501a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.f30498d = null;
            }
        }
    }

    /* renamed from: b */
    public void m24780b(b bVar, int i2) {
        synchronized (this.f30496b) {
            if (m24776f(bVar)) {
                m24774a(this.f30498d, i2);
            } else if (m24777g(bVar)) {
                m24774a(this.f30499e, i2);
            }
        }
    }

    /* renamed from: d */
    void m24781d(c cVar) {
        synchronized (this.f30496b) {
            if (this.f30498d == cVar || this.f30499e == cVar) {
                m24774a(cVar, 2);
            }
        }
    }

    /* renamed from: e */
    public boolean m24782e(b bVar) {
        boolean z;
        synchronized (this.f30496b) {
            z = m24776f(bVar) || m24777g(bVar);
        }
        return z;
    }

    /* renamed from: h */
    public void m24783h(b bVar) {
        synchronized (this.f30496b) {
            if (m24776f(bVar)) {
                this.f30498d = null;
                if (this.f30499e != null) {
                    m24779n();
                }
            }
        }
    }

    /* renamed from: i */
    public void m24784i(b bVar) {
        synchronized (this.f30496b) {
            if (m24776f(bVar)) {
                m24778l(this.f30498d);
            }
        }
    }

    /* renamed from: j */
    public void m24785j(b bVar) {
        synchronized (this.f30496b) {
            if (m24776f(bVar)) {
                c cVar = this.f30498d;
                if (!cVar.f30503c) {
                    cVar.f30503c = true;
                    this.f30497c.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    /* renamed from: k */
    public void m24786k(b bVar) {
        synchronized (this.f30496b) {
            if (m24776f(bVar)) {
                c cVar = this.f30498d;
                if (cVar.f30503c) {
                    cVar.f30503c = false;
                    m24778l(cVar);
                }
            }
        }
    }

    /* renamed from: m */
    public void m24787m(int i2, b bVar) {
        synchronized (this.f30496b) {
            if (m24776f(bVar)) {
                c cVar = this.f30498d;
                cVar.f30502b = i2;
                this.f30497c.removeCallbacksAndMessages(cVar);
                m24778l(this.f30498d);
                return;
            }
            if (m24777g(bVar)) {
                this.f30499e.f30502b = i2;
            } else {
                this.f30499e = new c(i2, bVar);
            }
            c cVar2 = this.f30498d;
            if (cVar2 == null || !m24774a(cVar2, 4)) {
                this.f30498d = null;
                m24779n();
            }
        }
    }
}
