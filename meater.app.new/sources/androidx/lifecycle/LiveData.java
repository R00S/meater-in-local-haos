package androidx.lifecycle;

import androidx.lifecycle.AbstractC0511g;
import p024c.p033b.p034a.p035a.C0850a;
import p024c.p033b.p034a.p036b.C0854b;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: a */
    static final Object f3423a = new Object();

    /* renamed from: b */
    final Object f3424b = new Object();

    /* renamed from: c */
    private C0854b<InterfaceC0522r<? super T>, LiveData<T>.AbstractC0494c> f3425c = new C0854b<>();

    /* renamed from: d */
    int f3426d = 0;

    /* renamed from: e */
    private boolean f3427e;

    /* renamed from: f */
    private volatile Object f3428f;

    /* renamed from: g */
    volatile Object f3429g;

    /* renamed from: h */
    private int f3430h;

    /* renamed from: i */
    private boolean f3431i;

    /* renamed from: j */
    private boolean f3432j;

    /* renamed from: k */
    private final Runnable f3433k;

    class LifecycleBoundObserver extends LiveData<T>.AbstractC0494c implements InterfaceC0513i {

        /* renamed from: e */
        final InterfaceC0515k f3434e;

        LifecycleBoundObserver(InterfaceC0515k interfaceC0515k, InterfaceC0522r<? super T> interfaceC0522r) {
            super(interfaceC0522r);
            this.f3434e = interfaceC0515k;
        }

        @Override // androidx.lifecycle.InterfaceC0513i
        /* renamed from: a */
        public void mo124a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar) {
            AbstractC0511g.c cVarMo3862b = this.f3434e.getLifecycle().mo3862b();
            if (cVarMo3862b == AbstractC0511g.c.DESTROYED) {
                LiveData.this.mo3821m(this.f3438a);
                return;
            }
            AbstractC0511g.c cVar = null;
            while (cVar != cVarMo3862b) {
                m3826b(mo3825e());
                cVar = cVarMo3862b;
                cVarMo3862b = this.f3434e.getLifecycle().mo3862b();
            }
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0494c
        /* renamed from: c */
        void mo3823c() {
            this.f3434e.getLifecycle().mo3863c(this);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0494c
        /* renamed from: d */
        boolean mo3824d(InterfaceC0515k interfaceC0515k) {
            return this.f3434e == interfaceC0515k;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0494c
        /* renamed from: e */
        boolean mo3825e() {
            return this.f3434e.getLifecycle().mo3862b().m3867g(AbstractC0511g.c.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    class RunnableC0492a implements Runnable {
        RunnableC0492a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f3424b) {
                obj = LiveData.this.f3429g;
                LiveData.this.f3429g = LiveData.f3423a;
            }
            LiveData.this.mo3822n(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    private class C0493b extends LiveData<T>.AbstractC0494c {
        C0493b(InterfaceC0522r<? super T> interfaceC0522r) {
            super(interfaceC0522r);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0494c
        /* renamed from: e */
        boolean mo3825e() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    private abstract class AbstractC0494c {

        /* renamed from: a */
        final InterfaceC0522r<? super T> f3438a;

        /* renamed from: b */
        boolean f3439b;

        /* renamed from: c */
        int f3440c = -1;

        AbstractC0494c(InterfaceC0522r<? super T> interfaceC0522r) {
            this.f3438a = interfaceC0522r;
        }

        /* renamed from: b */
        void m3826b(boolean z) {
            if (z == this.f3439b) {
                return;
            }
            this.f3439b = z;
            LiveData.this.m3812c(z ? 1 : -1);
            if (this.f3439b) {
                LiveData.this.m3813e(this);
            }
        }

        /* renamed from: c */
        void mo3823c() {
        }

        /* renamed from: d */
        boolean mo3824d(InterfaceC0515k interfaceC0515k) {
            return false;
        }

        /* renamed from: e */
        abstract boolean mo3825e();
    }

    public LiveData() {
        Object obj = f3423a;
        this.f3429g = obj;
        this.f3433k = new RunnableC0492a();
        this.f3428f = obj;
        this.f3430h = -1;
    }

    /* renamed from: b */
    static void m3810b(String str) {
        if (C0850a.m5372e().mo5374b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* renamed from: d */
    private void m3811d(LiveData<T>.AbstractC0494c abstractC0494c) {
        if (abstractC0494c.f3439b) {
            if (!abstractC0494c.mo3825e()) {
                abstractC0494c.m3826b(false);
                return;
            }
            int i2 = abstractC0494c.f3440c;
            int i3 = this.f3430h;
            if (i2 >= i3) {
                return;
            }
            abstractC0494c.f3440c = i3;
            abstractC0494c.f3438a.mo3611a((Object) this.f3428f);
        }
    }

    /* renamed from: c */
    void m3812c(int i2) {
        int i3 = this.f3426d;
        this.f3426d = i2 + i3;
        if (this.f3427e) {
            return;
        }
        this.f3427e = true;
        while (true) {
            try {
                int i4 = this.f3426d;
                if (i3 == i4) {
                    return;
                }
                boolean z = i3 == 0 && i4 > 0;
                boolean z2 = i3 > 0 && i4 == 0;
                if (z) {
                    mo3818j();
                } else if (z2) {
                    mo3819k();
                }
                i3 = i4;
            } finally {
                this.f3427e = false;
            }
        }
    }

    /* renamed from: e */
    void m3813e(LiveData<T>.AbstractC0494c abstractC0494c) {
        if (this.f3431i) {
            this.f3432j = true;
            return;
        }
        this.f3431i = true;
        do {
            this.f3432j = false;
            if (abstractC0494c != null) {
                m3811d(abstractC0494c);
                abstractC0494c = null;
            } else {
                C0854b<InterfaceC0522r<? super T>, LiveData<T>.AbstractC0494c>.d dVarM5383h = this.f3425c.m5383h();
                while (dVarM5383h.hasNext()) {
                    m3811d((AbstractC0494c) dVarM5383h.next().getValue());
                    if (this.f3432j) {
                        break;
                    }
                }
            }
        } while (this.f3432j);
        this.f3431i = false;
    }

    /* renamed from: f */
    public T m3814f() {
        T t = (T) this.f3428f;
        if (t != f3423a) {
            return t;
        }
        return null;
    }

    /* renamed from: g */
    public boolean m3815g() {
        return this.f3426d > 0;
    }

    /* renamed from: h */
    public void m3816h(InterfaceC0515k interfaceC0515k, InterfaceC0522r<? super T> interfaceC0522r) {
        m3810b("observe");
        if (interfaceC0515k.getLifecycle().mo3862b() == AbstractC0511g.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(interfaceC0515k, interfaceC0522r);
        LiveData<T>.AbstractC0494c abstractC0494cMo5378o = this.f3425c.mo5378o(interfaceC0522r, lifecycleBoundObserver);
        if (abstractC0494cMo5378o != null && !abstractC0494cMo5378o.mo3824d(interfaceC0515k)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0494cMo5378o != null) {
            return;
        }
        interfaceC0515k.getLifecycle().mo3861a(lifecycleBoundObserver);
    }

    /* renamed from: i */
    public void m3817i(InterfaceC0522r<? super T> interfaceC0522r) {
        m3810b("observeForever");
        C0493b c0493b = new C0493b(interfaceC0522r);
        LiveData<T>.AbstractC0494c abstractC0494cMo5378o = this.f3425c.mo5378o(interfaceC0522r, c0493b);
        if (abstractC0494cMo5378o instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0494cMo5378o != null) {
            return;
        }
        c0493b.m3826b(true);
    }

    /* renamed from: j */
    protected void mo3818j() {
    }

    /* renamed from: k */
    protected void mo3819k() {
    }

    /* renamed from: l */
    protected void mo3820l(T t) {
        boolean z;
        synchronized (this.f3424b) {
            z = this.f3429g == f3423a;
            this.f3429g = t;
        }
        if (z) {
            C0850a.m5372e().mo5375c(this.f3433k);
        }
    }

    /* renamed from: m */
    public void mo3821m(InterfaceC0522r<? super T> interfaceC0522r) {
        m3810b("removeObserver");
        LiveData<T>.AbstractC0494c abstractC0494cMo5379q = this.f3425c.mo5379q(interfaceC0522r);
        if (abstractC0494cMo5379q == null) {
            return;
        }
        abstractC0494cMo5379q.mo3823c();
        abstractC0494cMo5379q.m3826b(false);
    }

    /* renamed from: n */
    protected void mo3822n(T t) {
        m3810b("setValue");
        this.f3430h++;
        this.f3428f = t;
        m3813e(null);
    }
}
