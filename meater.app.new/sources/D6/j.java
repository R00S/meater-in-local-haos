package D6;

import D6.e;

/* compiled from: ThumbnailRequestCoordinator.java */
/* loaded from: classes2.dex */
public class j implements e, d {

    /* renamed from: a, reason: collision with root package name */
    private final e f3479a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3480b;

    /* renamed from: c, reason: collision with root package name */
    private volatile d f3481c;

    /* renamed from: d, reason: collision with root package name */
    private volatile d f3482d;

    /* renamed from: e, reason: collision with root package name */
    private e.a f3483e;

    /* renamed from: f, reason: collision with root package name */
    private e.a f3484f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3485g;

    public j(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f3483e = aVar;
        this.f3484f = aVar;
        this.f3480b = obj;
        this.f3479a = eVar;
    }

    private boolean l() {
        e eVar = this.f3479a;
        return eVar == null || eVar.e(this);
    }

    private boolean m() {
        e eVar = this.f3479a;
        return eVar == null || eVar.a(this);
    }

    private boolean n() {
        e eVar = this.f3479a;
        return eVar == null || eVar.c(this);
    }

    @Override // D6.e
    public boolean a(d dVar) {
        boolean z10;
        synchronized (this.f3480b) {
            try {
                z10 = m() && dVar.equals(this.f3481c) && !g();
            } finally {
            }
        }
        return z10;
    }

    @Override // D6.e
    public void b(d dVar) {
        synchronized (this.f3480b) {
            try {
                if (!dVar.equals(this.f3481c)) {
                    this.f3484f = e.a.FAILED;
                    return;
                }
                this.f3483e = e.a.FAILED;
                e eVar = this.f3479a;
                if (eVar != null) {
                    eVar.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D6.e
    public boolean c(d dVar) {
        boolean z10;
        synchronized (this.f3480b) {
            try {
                z10 = n() && (dVar.equals(this.f3481c) || this.f3483e != e.a.SUCCESS);
            } finally {
            }
        }
        return z10;
    }

    @Override // D6.d
    public void clear() {
        synchronized (this.f3480b) {
            this.f3485g = false;
            e.a aVar = e.a.CLEARED;
            this.f3483e = aVar;
            this.f3484f = aVar;
            this.f3482d.clear();
            this.f3481c.clear();
        }
    }

    @Override // D6.e
    public void d(d dVar) {
        synchronized (this.f3480b) {
            try {
                if (dVar.equals(this.f3482d)) {
                    this.f3484f = e.a.SUCCESS;
                    return;
                }
                this.f3483e = e.a.SUCCESS;
                e eVar = this.f3479a;
                if (eVar != null) {
                    eVar.d(this);
                }
                if (!this.f3484f.j()) {
                    this.f3482d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D6.e
    public boolean e(d dVar) {
        boolean z10;
        synchronized (this.f3480b) {
            try {
                z10 = l() && dVar.equals(this.f3481c) && this.f3483e != e.a.PAUSED;
            } finally {
            }
        }
        return z10;
    }

    @Override // D6.d
    public void f() {
        synchronized (this.f3480b) {
            try {
                if (!this.f3484f.j()) {
                    this.f3484f = e.a.PAUSED;
                    this.f3482d.f();
                }
                if (!this.f3483e.j()) {
                    this.f3483e = e.a.PAUSED;
                    this.f3481c.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D6.e, D6.d
    public boolean g() {
        boolean z10;
        synchronized (this.f3480b) {
            try {
                z10 = this.f3482d.g() || this.f3481c.g();
            } finally {
            }
        }
        return z10;
    }

    @Override // D6.e
    public e getRoot() {
        e root;
        synchronized (this.f3480b) {
            try {
                e eVar = this.f3479a;
                root = eVar != null ? eVar.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // D6.d
    public boolean h(d dVar) {
        if (!(dVar instanceof j)) {
            return false;
        }
        j jVar = (j) dVar;
        if (this.f3481c == null) {
            if (jVar.f3481c != null) {
                return false;
            }
        } else if (!this.f3481c.h(jVar.f3481c)) {
            return false;
        }
        if (this.f3482d == null) {
            if (jVar.f3482d != null) {
                return false;
            }
        } else if (!this.f3482d.h(jVar.f3482d)) {
            return false;
        }
        return true;
    }

    @Override // D6.d
    public boolean i() {
        boolean z10;
        synchronized (this.f3480b) {
            z10 = this.f3483e == e.a.CLEARED;
        }
        return z10;
    }

    @Override // D6.d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f3480b) {
            z10 = this.f3483e == e.a.RUNNING;
        }
        return z10;
    }

    @Override // D6.d
    public void j() {
        synchronized (this.f3480b) {
            try {
                this.f3485g = true;
                try {
                    if (this.f3483e != e.a.SUCCESS) {
                        e.a aVar = this.f3484f;
                        e.a aVar2 = e.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f3484f = aVar2;
                            this.f3482d.j();
                        }
                    }
                    if (this.f3485g) {
                        e.a aVar3 = this.f3483e;
                        e.a aVar4 = e.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f3483e = aVar4;
                            this.f3481c.j();
                        }
                    }
                    this.f3485g = false;
                } catch (Throwable th) {
                    this.f3485g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // D6.d
    public boolean k() {
        boolean z10;
        synchronized (this.f3480b) {
            z10 = this.f3483e == e.a.SUCCESS;
        }
        return z10;
    }

    public void o(d dVar, d dVar2) {
        this.f3481c = dVar;
        this.f3482d = dVar2;
    }
}
