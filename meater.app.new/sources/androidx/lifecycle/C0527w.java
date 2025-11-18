package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC0511g;

/* compiled from: ServiceLifecycleDispatcher.java */
/* renamed from: androidx.lifecycle.w */
/* loaded from: classes.dex */
public class C0527w {

    /* renamed from: a */
    private final C0516l f3508a;

    /* renamed from: b */
    private final Handler f3509b = new Handler();

    /* renamed from: c */
    private a f3510c;

    /* compiled from: ServiceLifecycleDispatcher.java */
    /* renamed from: androidx.lifecycle.w$a */
    static class a implements Runnable {

        /* renamed from: f */
        private final C0516l f3511f;

        /* renamed from: g */
        final AbstractC0511g.b f3512g;

        /* renamed from: h */
        private boolean f3513h = false;

        a(C0516l c0516l, AbstractC0511g.b bVar) {
            this.f3511f = c0516l;
            this.f3512g = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3513h) {
                return;
            }
            this.f3511f.m3879h(this.f3512g);
            this.f3513h = true;
        }
    }

    public C0527w(InterfaceC0515k interfaceC0515k) {
        this.f3508a = new C0516l(interfaceC0515k);
    }

    /* renamed from: f */
    private void m3905f(AbstractC0511g.b bVar) {
        a aVar = this.f3510c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f3508a, bVar);
        this.f3510c = aVar2;
        this.f3509b.postAtFrontOfQueue(aVar2);
    }

    /* renamed from: a */
    public AbstractC0511g m3906a() {
        return this.f3508a;
    }

    /* renamed from: b */
    public void m3907b() {
        m3905f(AbstractC0511g.b.ON_START);
    }

    /* renamed from: c */
    public void m3908c() {
        m3905f(AbstractC0511g.b.ON_CREATE);
    }

    /* renamed from: d */
    public void m3909d() {
        m3905f(AbstractC0511g.b.ON_STOP);
        m3905f(AbstractC0511g.b.ON_DESTROY);
    }

    /* renamed from: e */
    public void m3910e() {
        m3905f(AbstractC0511g.b.ON_START);
    }
}
