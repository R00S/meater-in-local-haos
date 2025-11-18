package D6;

import D6.a;
import H6.k;
import H6.l;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.n;
import com.bumptech.glide.load.resource.bitmap.q;
import com.bumptech.glide.load.resource.bitmap.s;
import java.util.Map;
import m6.C3971f;
import m6.C3972g;
import m6.InterfaceC3970e;
import m6.InterfaceC3976k;
import o6.AbstractC4137a;
import y6.C5131c;

/* compiled from: BaseRequestOptions.java */
/* loaded from: classes2.dex */
public abstract class a<T extends a<T>> implements Cloneable {

    /* renamed from: B, reason: collision with root package name */
    private int f3402B;

    /* renamed from: F, reason: collision with root package name */
    private Drawable f3406F;

    /* renamed from: G, reason: collision with root package name */
    private int f3407G;

    /* renamed from: H, reason: collision with root package name */
    private Drawable f3408H;

    /* renamed from: I, reason: collision with root package name */
    private int f3409I;

    /* renamed from: N, reason: collision with root package name */
    private boolean f3414N;

    /* renamed from: P, reason: collision with root package name */
    private Drawable f3416P;

    /* renamed from: Q, reason: collision with root package name */
    private int f3417Q;

    /* renamed from: U, reason: collision with root package name */
    private boolean f3421U;

    /* renamed from: V, reason: collision with root package name */
    private Resources.Theme f3422V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f3423W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f3424X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f3425Y;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f3427a0;

    /* renamed from: C, reason: collision with root package name */
    private float f3403C = 1.0f;

    /* renamed from: D, reason: collision with root package name */
    private AbstractC4137a f3404D = AbstractC4137a.f46572e;

    /* renamed from: E, reason: collision with root package name */
    private com.bumptech.glide.g f3405E = com.bumptech.glide.g.NORMAL;

    /* renamed from: J, reason: collision with root package name */
    private boolean f3410J = true;

    /* renamed from: K, reason: collision with root package name */
    private int f3411K = -1;

    /* renamed from: L, reason: collision with root package name */
    private int f3412L = -1;

    /* renamed from: M, reason: collision with root package name */
    private InterfaceC3970e f3413M = G6.c.c();

    /* renamed from: O, reason: collision with root package name */
    private boolean f3415O = true;

    /* renamed from: R, reason: collision with root package name */
    private C3972g f3418R = new C3972g();

    /* renamed from: S, reason: collision with root package name */
    private Map<Class<?>, InterfaceC3976k<?>> f3419S = new H6.b();

    /* renamed from: T, reason: collision with root package name */
    private Class<?> f3420T = Object.class;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f3426Z = true;

    private boolean M(int i10) {
        return N(this.f3402B, i10);
    }

    private static boolean N(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    private T W(n nVar, InterfaceC3976k<Bitmap> interfaceC3976k) {
        return (T) d0(nVar, interfaceC3976k, false);
    }

    private T d0(n nVar, InterfaceC3976k<Bitmap> interfaceC3976k, boolean z10) {
        T t10 = z10 ? (T) n0(nVar, interfaceC3976k) : (T) X(nVar, interfaceC3976k);
        t10.f3426Z = true;
        return t10;
    }

    public final InterfaceC3970e A() {
        return this.f3413M;
    }

    public final float B() {
        return this.f3403C;
    }

    public final Resources.Theme C() {
        return this.f3422V;
    }

    public final Map<Class<?>, InterfaceC3976k<?>> D() {
        return this.f3419S;
    }

    public final boolean E() {
        return this.f3427a0;
    }

    public final boolean F() {
        return this.f3424X;
    }

    protected final boolean G() {
        return this.f3423W;
    }

    public final boolean H(a<?> aVar) {
        return Float.compare(aVar.f3403C, this.f3403C) == 0 && this.f3407G == aVar.f3407G && l.d(this.f3406F, aVar.f3406F) && this.f3409I == aVar.f3409I && l.d(this.f3408H, aVar.f3408H) && this.f3417Q == aVar.f3417Q && l.d(this.f3416P, aVar.f3416P) && this.f3410J == aVar.f3410J && this.f3411K == aVar.f3411K && this.f3412L == aVar.f3412L && this.f3414N == aVar.f3414N && this.f3415O == aVar.f3415O && this.f3424X == aVar.f3424X && this.f3425Y == aVar.f3425Y && this.f3404D.equals(aVar.f3404D) && this.f3405E == aVar.f3405E && this.f3418R.equals(aVar.f3418R) && this.f3419S.equals(aVar.f3419S) && this.f3420T.equals(aVar.f3420T) && l.d(this.f3413M, aVar.f3413M) && l.d(this.f3422V, aVar.f3422V);
    }

    public final boolean I() {
        return this.f3410J;
    }

    public final boolean J() {
        return M(8);
    }

    boolean L() {
        return this.f3426Z;
    }

    public final boolean O() {
        return this.f3415O;
    }

    public final boolean P() {
        return this.f3414N;
    }

    public final boolean Q() {
        return M(2048);
    }

    public final boolean R() {
        return l.t(this.f3412L, this.f3411K);
    }

    public T S() {
        this.f3421U = true;
        return (T) e0();
    }

    public T T() {
        return (T) X(n.f33332e, new com.bumptech.glide.load.resource.bitmap.l());
    }

    public T U() {
        return (T) W(n.f33331d, new m());
    }

    public T V() {
        return (T) W(n.f33330c, new s());
    }

    final T X(n nVar, InterfaceC3976k<Bitmap> interfaceC3976k) {
        if (this.f3423W) {
            return (T) clone().X(nVar, interfaceC3976k);
        }
        h(nVar);
        return (T) q0(interfaceC3976k, false);
    }

    public T Y(int i10, int i11) {
        if (this.f3423W) {
            return (T) clone().Y(i10, i11);
        }
        this.f3412L = i10;
        this.f3411K = i11;
        this.f3402B |= 512;
        return (T) g0();
    }

    public T Z(int i10) {
        if (this.f3423W) {
            return (T) clone().Z(i10);
        }
        this.f3409I = i10;
        int i11 = this.f3402B | 128;
        this.f3408H = null;
        this.f3402B = i11 & (-65);
        return (T) g0();
    }

    public T b(a<?> aVar) {
        if (this.f3423W) {
            return (T) clone().b(aVar);
        }
        if (N(aVar.f3402B, 2)) {
            this.f3403C = aVar.f3403C;
        }
        if (N(aVar.f3402B, 262144)) {
            this.f3424X = aVar.f3424X;
        }
        if (N(aVar.f3402B, 1048576)) {
            this.f3427a0 = aVar.f3427a0;
        }
        if (N(aVar.f3402B, 4)) {
            this.f3404D = aVar.f3404D;
        }
        if (N(aVar.f3402B, 8)) {
            this.f3405E = aVar.f3405E;
        }
        if (N(aVar.f3402B, 16)) {
            this.f3406F = aVar.f3406F;
            this.f3407G = 0;
            this.f3402B &= -33;
        }
        if (N(aVar.f3402B, 32)) {
            this.f3407G = aVar.f3407G;
            this.f3406F = null;
            this.f3402B &= -17;
        }
        if (N(aVar.f3402B, 64)) {
            this.f3408H = aVar.f3408H;
            this.f3409I = 0;
            this.f3402B &= -129;
        }
        if (N(aVar.f3402B, 128)) {
            this.f3409I = aVar.f3409I;
            this.f3408H = null;
            this.f3402B &= -65;
        }
        if (N(aVar.f3402B, 256)) {
            this.f3410J = aVar.f3410J;
        }
        if (N(aVar.f3402B, 512)) {
            this.f3412L = aVar.f3412L;
            this.f3411K = aVar.f3411K;
        }
        if (N(aVar.f3402B, 1024)) {
            this.f3413M = aVar.f3413M;
        }
        if (N(aVar.f3402B, 4096)) {
            this.f3420T = aVar.f3420T;
        }
        if (N(aVar.f3402B, 8192)) {
            this.f3416P = aVar.f3416P;
            this.f3417Q = 0;
            this.f3402B &= -16385;
        }
        if (N(aVar.f3402B, 16384)) {
            this.f3417Q = aVar.f3417Q;
            this.f3416P = null;
            this.f3402B &= -8193;
        }
        if (N(aVar.f3402B, 32768)) {
            this.f3422V = aVar.f3422V;
        }
        if (N(aVar.f3402B, 65536)) {
            this.f3415O = aVar.f3415O;
        }
        if (N(aVar.f3402B, 131072)) {
            this.f3414N = aVar.f3414N;
        }
        if (N(aVar.f3402B, 2048)) {
            this.f3419S.putAll(aVar.f3419S);
            this.f3426Z = aVar.f3426Z;
        }
        if (N(aVar.f3402B, 524288)) {
            this.f3425Y = aVar.f3425Y;
        }
        if (!this.f3415O) {
            this.f3419S.clear();
            int i10 = this.f3402B;
            this.f3414N = false;
            this.f3402B = i10 & (-133121);
            this.f3426Z = true;
        }
        this.f3402B |= aVar.f3402B;
        this.f3418R.d(aVar.f3418R);
        return (T) g0();
    }

    public T b0(com.bumptech.glide.g gVar) {
        if (this.f3423W) {
            return (T) clone().b0(gVar);
        }
        this.f3405E = (com.bumptech.glide.g) k.d(gVar);
        this.f3402B |= 8;
        return (T) g0();
    }

    public T c() {
        if (this.f3421U && !this.f3423W) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f3423W = true;
        return (T) S();
    }

    T c0(C3971f<?> c3971f) {
        if (this.f3423W) {
            return (T) clone().c0(c3971f);
        }
        this.f3418R.e(c3971f);
        return (T) g0();
    }

    @Override // 
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t10 = (T) super.clone();
            C3972g c3972g = new C3972g();
            t10.f3418R = c3972g;
            c3972g.d(this.f3418R);
            H6.b bVar = new H6.b();
            t10.f3419S = bVar;
            bVar.putAll(this.f3419S);
            t10.f3421U = false;
            t10.f3423W = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return H((a) obj);
        }
        return false;
    }

    public T f(Class<?> cls) {
        if (this.f3423W) {
            return (T) clone().f(cls);
        }
        this.f3420T = (Class) k.d(cls);
        this.f3402B |= 4096;
        return (T) g0();
    }

    public T g(AbstractC4137a abstractC4137a) {
        if (this.f3423W) {
            return (T) clone().g(abstractC4137a);
        }
        this.f3404D = (AbstractC4137a) k.d(abstractC4137a);
        this.f3402B |= 4;
        return (T) g0();
    }

    protected final T g0() {
        if (this.f3421U) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) e0();
    }

    public T h(n nVar) {
        return (T) i0(n.f33335h, k.d(nVar));
    }

    public int hashCode() {
        return l.o(this.f3422V, l.o(this.f3413M, l.o(this.f3420T, l.o(this.f3419S, l.o(this.f3418R, l.o(this.f3405E, l.o(this.f3404D, l.p(this.f3425Y, l.p(this.f3424X, l.p(this.f3415O, l.p(this.f3414N, l.n(this.f3412L, l.n(this.f3411K, l.p(this.f3410J, l.o(this.f3416P, l.n(this.f3417Q, l.o(this.f3408H, l.n(this.f3409I, l.o(this.f3406F, l.n(this.f3407G, l.l(this.f3403C)))))))))))))))))))));
    }

    public T i(int i10) {
        if (this.f3423W) {
            return (T) clone().i(i10);
        }
        this.f3407G = i10;
        int i11 = this.f3402B | 32;
        this.f3406F = null;
        this.f3402B = i11 & (-17);
        return (T) g0();
    }

    public <Y> T i0(C3971f<Y> c3971f, Y y10) {
        if (this.f3423W) {
            return (T) clone().i0(c3971f, y10);
        }
        k.d(c3971f);
        k.d(y10);
        this.f3418R.f(c3971f, y10);
        return (T) g0();
    }

    public T j0(InterfaceC3970e interfaceC3970e) {
        if (this.f3423W) {
            return (T) clone().j0(interfaceC3970e);
        }
        this.f3413M = (InterfaceC3970e) k.d(interfaceC3970e);
        this.f3402B |= 1024;
        return (T) g0();
    }

    public final AbstractC4137a k() {
        return this.f3404D;
    }

    public T k0(float f10) {
        if (this.f3423W) {
            return (T) clone().k0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f3403C = f10;
        this.f3402B |= 2;
        return (T) g0();
    }

    public final int l() {
        return this.f3407G;
    }

    public T l0(boolean z10) {
        if (this.f3423W) {
            return (T) clone().l0(true);
        }
        this.f3410J = !z10;
        this.f3402B |= 256;
        return (T) g0();
    }

    public final Drawable m() {
        return this.f3406F;
    }

    public T m0(Resources.Theme theme) {
        if (this.f3423W) {
            return (T) clone().m0(theme);
        }
        this.f3422V = theme;
        if (theme != null) {
            this.f3402B |= 32768;
            return (T) i0(w6.l.f51963b, theme);
        }
        this.f3402B &= -32769;
        return (T) c0(w6.l.f51963b);
    }

    public final Drawable n() {
        return this.f3416P;
    }

    final T n0(n nVar, InterfaceC3976k<Bitmap> interfaceC3976k) {
        if (this.f3423W) {
            return (T) clone().n0(nVar, interfaceC3976k);
        }
        h(nVar);
        return (T) p0(interfaceC3976k);
    }

    public final int o() {
        return this.f3417Q;
    }

    <Y> T o0(Class<Y> cls, InterfaceC3976k<Y> interfaceC3976k, boolean z10) {
        if (this.f3423W) {
            return (T) clone().o0(cls, interfaceC3976k, z10);
        }
        k.d(cls);
        k.d(interfaceC3976k);
        this.f3419S.put(cls, interfaceC3976k);
        int i10 = this.f3402B;
        this.f3415O = true;
        this.f3402B = 67584 | i10;
        this.f3426Z = false;
        if (z10) {
            this.f3402B = i10 | 198656;
            this.f3414N = true;
        }
        return (T) g0();
    }

    public final boolean p() {
        return this.f3425Y;
    }

    public T p0(InterfaceC3976k<Bitmap> interfaceC3976k) {
        return (T) q0(interfaceC3976k, true);
    }

    public final C3972g q() {
        return this.f3418R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    T q0(InterfaceC3976k<Bitmap> interfaceC3976k, boolean z10) {
        if (this.f3423W) {
            return (T) clone().q0(interfaceC3976k, z10);
        }
        q qVar = new q(interfaceC3976k, z10);
        o0(Bitmap.class, interfaceC3976k, z10);
        o0(Drawable.class, qVar, z10);
        o0(BitmapDrawable.class, qVar.c(), z10);
        o0(C5131c.class, new y6.f(interfaceC3976k), z10);
        return (T) g0();
    }

    public final int r() {
        return this.f3411K;
    }

    public final int s() {
        return this.f3412L;
    }

    public T s0(boolean z10) {
        if (this.f3423W) {
            return (T) clone().s0(z10);
        }
        this.f3427a0 = z10;
        this.f3402B |= 1048576;
        return (T) g0();
    }

    public final Drawable t() {
        return this.f3408H;
    }

    public final int u() {
        return this.f3409I;
    }

    public final com.bumptech.glide.g v() {
        return this.f3405E;
    }

    public final Class<?> w() {
        return this.f3420T;
    }

    private T e0() {
        return this;
    }
}
