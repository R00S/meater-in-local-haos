package D6;

import D6.e;

/* compiled from: ErrorRequestCoordinator.java */
/* loaded from: classes2.dex */
public final class b implements e, d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f3428a;

    /* renamed from: b, reason: collision with root package name */
    private final e f3429b;

    /* renamed from: c, reason: collision with root package name */
    private volatile d f3430c;

    /* renamed from: d, reason: collision with root package name */
    private volatile d f3431d;

    /* renamed from: e, reason: collision with root package name */
    private e.a f3432e;

    /* renamed from: f, reason: collision with root package name */
    private e.a f3433f;

    public b(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f3432e = aVar;
        this.f3433f = aVar;
        this.f3428a = obj;
        this.f3429b = eVar;
    }

    private boolean l(d dVar) {
        e.a aVar;
        e.a aVar2 = this.f3432e;
        e.a aVar3 = e.a.FAILED;
        return aVar2 != aVar3 ? dVar.equals(this.f3430c) : dVar.equals(this.f3431d) && ((aVar = this.f3433f) == e.a.SUCCESS || aVar == aVar3);
    }

    private boolean m() {
        e eVar = this.f3429b;
        return eVar == null || eVar.e(this);
    }

    private boolean n() {
        e eVar = this.f3429b;
        return eVar == null || eVar.a(this);
    }

    private boolean o() {
        e eVar = this.f3429b;
        return eVar == null || eVar.c(this);
    }

    @Override // D6.e
    public boolean a(d dVar) {
        boolean z10;
        synchronized (this.f3428a) {
            try {
                z10 = n() && l(dVar);
            } finally {
            }
        }
        return z10;
    }

    @Override // D6.e
    public void b(d dVar) {
        synchronized (this.f3428a) {
            try {
                if (dVar.equals(this.f3431d)) {
                    this.f3433f = e.a.FAILED;
                    e eVar = this.f3429b;
                    if (eVar != null) {
                        eVar.b(this);
                    }
                    return;
                }
                this.f3432e = e.a.FAILED;
                e.a aVar = this.f3433f;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f3433f = aVar2;
                    this.f3431d.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D6.e
    public boolean c(d dVar) {
        boolean zO;
        synchronized (this.f3428a) {
            zO = o();
        }
        return zO;
    }

    @Override // D6.d
    public void clear() {
        synchronized (this.f3428a) {
            try {
                e.a aVar = e.a.CLEARED;
                this.f3432e = aVar;
                this.f3430c.clear();
                if (this.f3433f != aVar) {
                    this.f3433f = aVar;
                    this.f3431d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D6.e
    public void d(d dVar) {
        synchronized (this.f3428a) {
            try {
                if (dVar.equals(this.f3430c)) {
                    this.f3432e = e.a.SUCCESS;
                } else if (dVar.equals(this.f3431d)) {
                    this.f3433f = e.a.SUCCESS;
                }
                e eVar = this.f3429b;
                if (eVar != null) {
                    eVar.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D6.e
    public boolean e(d dVar) {
        boolean z10;
        synchronized (this.f3428a) {
            try {
                z10 = m() && dVar.equals(this.f3430c);
            } finally {
            }
        }
        return z10;
    }

    @Override // D6.d
    public void f() {
        synchronized (this.f3428a) {
            try {
                e.a aVar = this.f3432e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar == aVar2) {
                    this.f3432e = e.a.PAUSED;
                    this.f3430c.f();
                }
                if (this.f3433f == aVar2) {
                    this.f3433f = e.a.PAUSED;
                    this.f3431d.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D6.e, D6.d
    public boolean g() {
        boolean z10;
        synchronized (this.f3428a) {
            try {
                z10 = this.f3430c.g() || this.f3431d.g();
            } finally {
            }
        }
        return z10;
    }

    @Override // D6.e
    public e getRoot() {
        e root;
        synchronized (this.f3428a) {
            try {
                e eVar = this.f3429b;
                root = eVar != null ? eVar.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // D6.d
    public boolean h(d dVar) {
        if (!(dVar instanceof b)) {
            return false;
        }
        b bVar = (b) dVar;
        return this.f3430c.h(bVar.f3430c) && this.f3431d.h(bVar.f3431d);
    }

    @Override // D6.d
    public boolean i() {
        boolean z10;
        synchronized (this.f3428a) {
            try {
                e.a aVar = this.f3432e;
                e.a aVar2 = e.a.CLEARED;
                z10 = aVar == aVar2 && this.f3433f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // D6.d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f3428a) {
            try {
                e.a aVar = this.f3432e;
                e.a aVar2 = e.a.RUNNING;
                z10 = aVar == aVar2 || this.f3433f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // D6.d
    public void j() {
        synchronized (this.f3428a) {
            try {
                e.a aVar = this.f3432e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f3432e = aVar2;
                    this.f3430c.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D6.d
    public boolean k() {
        boolean z10;
        synchronized (this.f3428a) {
            try {
                e.a aVar = this.f3432e;
                e.a aVar2 = e.a.SUCCESS;
                z10 = aVar == aVar2 || this.f3433f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    public void p(d dVar, d dVar2) {
        this.f3430c = dVar;
        this.f3431d = dVar2;
    }
}
