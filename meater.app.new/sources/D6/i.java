package D6;

import H6.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.j;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import m6.EnumC3966a;
import o6.InterfaceC4139c;

/* compiled from: SingleRequest.java */
/* loaded from: classes2.dex */
public final class i<R> implements d, E6.h, h {

    /* renamed from: E, reason: collision with root package name */
    private static final boolean f3441E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A, reason: collision with root package name */
    private int f3442A;

    /* renamed from: B, reason: collision with root package name */
    private int f3443B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f3444C;

    /* renamed from: D, reason: collision with root package name */
    private RuntimeException f3445D;

    /* renamed from: a, reason: collision with root package name */
    private int f3446a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3447b;

    /* renamed from: c, reason: collision with root package name */
    private final I6.c f3448c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f3449d;

    /* renamed from: e, reason: collision with root package name */
    private final f<R> f3450e;

    /* renamed from: f, reason: collision with root package name */
    private final e f3451f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f3452g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.d f3453h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f3454i;

    /* renamed from: j, reason: collision with root package name */
    private final Class<R> f3455j;

    /* renamed from: k, reason: collision with root package name */
    private final D6.a<?> f3456k;

    /* renamed from: l, reason: collision with root package name */
    private final int f3457l;

    /* renamed from: m, reason: collision with root package name */
    private final int f3458m;

    /* renamed from: n, reason: collision with root package name */
    private final com.bumptech.glide.g f3459n;

    /* renamed from: o, reason: collision with root package name */
    private final E6.i<R> f3460o;

    /* renamed from: p, reason: collision with root package name */
    private final List<f<R>> f3461p;

    /* renamed from: q, reason: collision with root package name */
    private final F6.c<? super R> f3462q;

    /* renamed from: r, reason: collision with root package name */
    private final Executor f3463r;

    /* renamed from: s, reason: collision with root package name */
    private InterfaceC4139c<R> f3464s;

    /* renamed from: t, reason: collision with root package name */
    private j.d f3465t;

    /* renamed from: u, reason: collision with root package name */
    private long f3466u;

    /* renamed from: v, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.j f3467v;

    /* renamed from: w, reason: collision with root package name */
    private a f3468w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable f3469x;

    /* renamed from: y, reason: collision with root package name */
    private Drawable f3470y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f3471z;

    /* compiled from: SingleRequest.java */
    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private i(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, D6.a<?> aVar, int i10, int i11, com.bumptech.glide.g gVar, E6.i<R> iVar, f<R> fVar, List<f<R>> list, e eVar, com.bumptech.glide.load.engine.j jVar, F6.c<? super R> cVar, Executor executor) {
        this.f3447b = f3441E ? String.valueOf(super.hashCode()) : null;
        this.f3448c = I6.c.a();
        this.f3449d = obj;
        this.f3452g = context;
        this.f3453h = dVar;
        this.f3454i = obj2;
        this.f3455j = cls;
        this.f3456k = aVar;
        this.f3457l = i10;
        this.f3458m = i11;
        this.f3459n = gVar;
        this.f3460o = iVar;
        this.f3450e = fVar;
        this.f3461p = list;
        this.f3451f = eVar;
        this.f3467v = jVar;
        this.f3462q = cVar;
        this.f3463r = executor;
        this.f3468w = a.PENDING;
        if (this.f3445D == null && dVar.g().a(c.C0452c.class)) {
            this.f3445D = new RuntimeException("Glide request origin trace");
        }
    }

    private void A(GlideException glideException, int i10) {
        boolean zB;
        this.f3448c.c();
        synchronized (this.f3449d) {
            try {
                glideException.k(this.f3445D);
                int iH = this.f3453h.h();
                if (iH <= i10) {
                    Log.w("Glide", "Load failed for [" + this.f3454i + "] with dimensions [" + this.f3442A + "x" + this.f3443B + "]", glideException);
                    if (iH <= 4) {
                        glideException.g("Glide");
                    }
                }
                this.f3465t = null;
                this.f3468w = a.FAILED;
                x();
                boolean z10 = true;
                this.f3444C = true;
                try {
                    List<f<R>> list = this.f3461p;
                    if (list != null) {
                        Iterator<f<R>> it = list.iterator();
                        zB = false;
                        while (it.hasNext()) {
                            zB |= it.next().b(glideException, this.f3454i, this.f3460o, t());
                        }
                    } else {
                        zB = false;
                    }
                    f<R> fVar = this.f3450e;
                    if (fVar == null || !fVar.b(glideException, this.f3454i, this.f3460o, t())) {
                        z10 = false;
                    }
                    if (!(zB | z10)) {
                        C();
                    }
                    this.f3444C = false;
                    I6.b.f("GlideRequest", this.f3446a);
                } catch (Throwable th) {
                    this.f3444C = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void B(InterfaceC4139c<R> interfaceC4139c, R r10, EnumC3966a enumC3966a, boolean z10) {
        boolean zD;
        boolean zT = t();
        this.f3468w = a.COMPLETE;
        this.f3464s = interfaceC4139c;
        if (this.f3453h.h() <= 3) {
            Log.d("Glide", "Finished loading " + r10.getClass().getSimpleName() + " from " + enumC3966a + " for " + this.f3454i + " with size [" + this.f3442A + "x" + this.f3443B + "] in " + H6.g.a(this.f3466u) + " ms");
        }
        y();
        boolean z11 = true;
        this.f3444C = true;
        try {
            List<f<R>> list = this.f3461p;
            if (list != null) {
                zD = false;
                for (f<R> fVar : list) {
                    boolean zA = zD | fVar.a(r10, this.f3454i, this.f3460o, enumC3966a, zT);
                    zD = fVar instanceof c ? ((c) fVar).d(r10, this.f3454i, this.f3460o, enumC3966a, zT, z10) | zA : zA;
                }
            } else {
                zD = false;
            }
            f<R> fVar2 = this.f3450e;
            if (fVar2 == null || !fVar2.a(r10, this.f3454i, this.f3460o, enumC3966a, zT)) {
                z11 = false;
            }
            if (!(zD | z11)) {
                this.f3460o.j(r10, this.f3462q.a(enumC3966a, zT));
            }
            this.f3444C = false;
            I6.b.f("GlideRequest", this.f3446a);
        } catch (Throwable th) {
            this.f3444C = false;
            throw th;
        }
    }

    private void C() {
        if (m()) {
            Drawable drawableR = this.f3454i == null ? r() : null;
            if (drawableR == null) {
                drawableR = q();
            }
            if (drawableR == null) {
                drawableR = s();
            }
            this.f3460o.g(drawableR);
        }
    }

    private void e() {
        if (this.f3444C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean l() {
        e eVar = this.f3451f;
        return eVar == null || eVar.e(this);
    }

    private boolean m() {
        e eVar = this.f3451f;
        return eVar == null || eVar.a(this);
    }

    private boolean n() {
        e eVar = this.f3451f;
        return eVar == null || eVar.c(this);
    }

    private void o() {
        e();
        this.f3448c.c();
        this.f3460o.f(this);
        j.d dVar = this.f3465t;
        if (dVar != null) {
            dVar.a();
            this.f3465t = null;
        }
    }

    private void p(Object obj) {
        List<f<R>> list = this.f3461p;
        if (list == null) {
            return;
        }
        for (f<R> fVar : list) {
            if (fVar instanceof c) {
                ((c) fVar).c(obj);
            }
        }
    }

    private Drawable q() {
        if (this.f3469x == null) {
            Drawable drawableM = this.f3456k.m();
            this.f3469x = drawableM;
            if (drawableM == null && this.f3456k.l() > 0) {
                this.f3469x = u(this.f3456k.l());
            }
        }
        return this.f3469x;
    }

    private Drawable r() {
        if (this.f3471z == null) {
            Drawable drawableN = this.f3456k.n();
            this.f3471z = drawableN;
            if (drawableN == null && this.f3456k.o() > 0) {
                this.f3471z = u(this.f3456k.o());
            }
        }
        return this.f3471z;
    }

    private Drawable s() {
        if (this.f3470y == null) {
            Drawable drawableT = this.f3456k.t();
            this.f3470y = drawableT;
            if (drawableT == null && this.f3456k.u() > 0) {
                this.f3470y = u(this.f3456k.u());
            }
        }
        return this.f3470y;
    }

    private boolean t() {
        e eVar = this.f3451f;
        return eVar == null || !eVar.getRoot().g();
    }

    private Drawable u(int i10) {
        return w6.i.a(this.f3452g, i10, this.f3456k.C() != null ? this.f3456k.C() : this.f3452g.getTheme());
    }

    private void v(String str) {
        Log.v("GlideRequest", str + " this: " + this.f3447b);
    }

    private static int w(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    private void x() {
        e eVar = this.f3451f;
        if (eVar != null) {
            eVar.b(this);
        }
    }

    private void y() {
        e eVar = this.f3451f;
        if (eVar != null) {
            eVar.d(this);
        }
    }

    public static <R> i<R> z(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, D6.a<?> aVar, int i10, int i11, com.bumptech.glide.g gVar, E6.i<R> iVar, f<R> fVar, List<f<R>> list, e eVar, com.bumptech.glide.load.engine.j jVar, F6.c<? super R> cVar, Executor executor) {
        return new i<>(context, dVar, obj, obj2, cls, aVar, i10, i11, gVar, iVar, fVar, list, eVar, jVar, cVar, executor);
    }

    @Override // D6.h
    public void a(GlideException glideException) {
        A(glideException, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // D6.h
    public void b(InterfaceC4139c<?> interfaceC4139c, EnumC3966a enumC3966a, boolean z10) {
        this.f3448c.c();
        InterfaceC4139c<?> interfaceC4139c2 = null;
        try {
            synchronized (this.f3449d) {
                try {
                    this.f3465t = null;
                    if (interfaceC4139c == null) {
                        a(new GlideException("Expected to receive a Resource<R> with an object of " + this.f3455j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = interfaceC4139c.get();
                    try {
                        if (obj != null && this.f3455j.isAssignableFrom(obj.getClass())) {
                            if (n()) {
                                B(interfaceC4139c, obj, enumC3966a, z10);
                                return;
                            }
                            this.f3464s = null;
                            this.f3468w = a.COMPLETE;
                            I6.b.f("GlideRequest", this.f3446a);
                            this.f3467v.k(interfaceC4139c);
                            return;
                        }
                        this.f3464s = null;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected to receive an object of ");
                        sb2.append(this.f3455j);
                        sb2.append(" but instead got ");
                        sb2.append(obj != null ? obj.getClass() : "");
                        sb2.append("{");
                        sb2.append(obj);
                        sb2.append("} inside Resource{");
                        sb2.append(interfaceC4139c);
                        sb2.append("}.");
                        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        a(new GlideException(sb2.toString()));
                        this.f3467v.k(interfaceC4139c);
                    } catch (Throwable th) {
                        interfaceC4139c2 = interfaceC4139c;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC4139c2 != null) {
                this.f3467v.k(interfaceC4139c2);
            }
            throw th3;
        }
    }

    @Override // E6.h
    public void c(int i10, int i11) throws Throwable {
        Object obj;
        this.f3448c.c();
        Object obj2 = this.f3449d;
        synchronized (obj2) {
            try {
                try {
                    boolean z10 = f3441E;
                    if (z10) {
                        v("Got onSizeReady in " + H6.g.a(this.f3466u));
                    }
                    if (this.f3468w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.f3468w = aVar;
                        float fB = this.f3456k.B();
                        this.f3442A = w(i10, fB);
                        this.f3443B = w(i11, fB);
                        if (z10) {
                            v("finished setup for calling load in " + H6.g.a(this.f3466u));
                        }
                        obj = obj2;
                        try {
                            this.f3465t = this.f3467v.f(this.f3453h, this.f3454i, this.f3456k.A(), this.f3442A, this.f3443B, this.f3456k.w(), this.f3455j, this.f3459n, this.f3456k.k(), this.f3456k.D(), this.f3456k.P(), this.f3456k.L(), this.f3456k.q(), this.f3456k.I(), this.f3456k.F(), this.f3456k.E(), this.f3456k.p(), this, this.f3463r);
                            if (this.f3468w != aVar) {
                                this.f3465t = null;
                            }
                            if (z10) {
                                v("finished onSizeReady in " + H6.g.a(this.f3466u));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = obj2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // D6.d
    public void clear() {
        synchronized (this.f3449d) {
            try {
                e();
                this.f3448c.c();
                a aVar = this.f3468w;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                o();
                InterfaceC4139c<R> interfaceC4139c = this.f3464s;
                if (interfaceC4139c != null) {
                    this.f3464s = null;
                } else {
                    interfaceC4139c = null;
                }
                if (l()) {
                    this.f3460o.k(s());
                }
                I6.b.f("GlideRequest", this.f3446a);
                this.f3468w = aVar2;
                if (interfaceC4139c != null) {
                    this.f3467v.k(interfaceC4139c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D6.h
    public Object d() {
        this.f3448c.c();
        return this.f3449d;
    }

    @Override // D6.d
    public void f() {
        synchronized (this.f3449d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D6.d
    public boolean g() {
        boolean z10;
        synchronized (this.f3449d) {
            z10 = this.f3468w == a.COMPLETE;
        }
        return z10;
    }

    @Override // D6.d
    public boolean h(d dVar) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        D6.a<?> aVar;
        com.bumptech.glide.g gVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class<R> cls2;
        D6.a<?> aVar2;
        com.bumptech.glide.g gVar2;
        int size2;
        if (!(dVar instanceof i)) {
            return false;
        }
        synchronized (this.f3449d) {
            try {
                i10 = this.f3457l;
                i11 = this.f3458m;
                obj = this.f3454i;
                cls = this.f3455j;
                aVar = this.f3456k;
                gVar = this.f3459n;
                List<f<R>> list = this.f3461p;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        i iVar = (i) dVar;
        synchronized (iVar.f3449d) {
            try {
                i12 = iVar.f3457l;
                i13 = iVar.f3458m;
                obj2 = iVar.f3454i;
                cls2 = iVar.f3455j;
                aVar2 = iVar.f3456k;
                gVar2 = iVar.f3459n;
                List<f<R>> list2 = iVar.f3461p;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i10 == i12 && i11 == i13 && l.c(obj, obj2) && cls.equals(cls2) && l.b(aVar, aVar2) && gVar == gVar2 && size == size2;
    }

    @Override // D6.d
    public boolean i() {
        boolean z10;
        synchronized (this.f3449d) {
            z10 = this.f3468w == a.CLEARED;
        }
        return z10;
    }

    @Override // D6.d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f3449d) {
            try {
                a aVar = this.f3468w;
                z10 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z10;
    }

    @Override // D6.d
    public void j() {
        synchronized (this.f3449d) {
            try {
                e();
                this.f3448c.c();
                this.f3466u = H6.g.b();
                Object obj = this.f3454i;
                if (obj == null) {
                    if (l.t(this.f3457l, this.f3458m)) {
                        this.f3442A = this.f3457l;
                        this.f3443B = this.f3458m;
                    }
                    A(new GlideException("Received null model"), r() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f3468w;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    b(this.f3464s, EnumC3966a.MEMORY_CACHE, false);
                    return;
                }
                p(obj);
                this.f3446a = I6.b.b("GlideRequest");
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f3468w = aVar3;
                if (l.t(this.f3457l, this.f3458m)) {
                    c(this.f3457l, this.f3458m);
                } else {
                    this.f3460o.c(this);
                }
                a aVar4 = this.f3468w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && m()) {
                    this.f3460o.h(s());
                }
                if (f3441E) {
                    v("finished run method in " + H6.g.a(this.f3466u));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D6.d
    public boolean k() {
        boolean z10;
        synchronized (this.f3449d) {
            z10 = this.f3468w == a.COMPLETE;
        }
        return z10;
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f3449d) {
            obj = this.f3454i;
            cls = this.f3455j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
