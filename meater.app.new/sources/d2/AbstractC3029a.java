package d2;

import U1.G;
import X1.C1804a;
import android.util.Pair;

/* compiled from: AbstractConcatenatedTimeline.java */
/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3029a extends U1.G {

    /* renamed from: e, reason: collision with root package name */
    private final int f39688e;

    /* renamed from: f, reason: collision with root package name */
    private final n2.t f39689f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f39690g;

    public AbstractC3029a(boolean z10, n2.t tVar) {
        this.f39690g = z10;
        this.f39689f = tVar;
        this.f39688e = tVar.a();
    }

    private int B(int i10, boolean z10) {
        if (z10) {
            return this.f39689f.e(i10);
        }
        if (i10 < this.f39688e - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int C(int i10, boolean z10) {
        if (z10) {
            return this.f39689f.d(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    protected abstract int A(int i10);

    protected abstract U1.G D(int i10);

    @Override // U1.G
    public int a(boolean z10) {
        if (this.f39688e == 0) {
            return -1;
        }
        if (this.f39690g) {
            z10 = false;
        }
        int iC = z10 ? this.f39689f.c() : 0;
        while (D(iC).q()) {
            iC = B(iC, z10);
            if (iC == -1) {
                return -1;
            }
        }
        return A(iC) + D(iC).a(z10);
    }

    @Override // U1.G
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        if (iS == -1 || (iB = D(iS).b(objV)) == -1) {
            return -1;
        }
        return z(iS) + iB;
    }

    @Override // U1.G
    public int c(boolean z10) {
        int i10 = this.f39688e;
        if (i10 == 0) {
            return -1;
        }
        if (this.f39690g) {
            z10 = false;
        }
        int iG = z10 ? this.f39689f.g() : i10 - 1;
        while (D(iG).q()) {
            iG = C(iG, z10);
            if (iG == -1) {
                return -1;
            }
        }
        return A(iG) + D(iG).c(z10);
    }

    @Override // U1.G
    public int e(int i10, int i11, boolean z10) {
        if (this.f39690g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iU = u(i10);
        int iA = A(iU);
        int iE = D(iU).e(i10 - iA, i11 != 2 ? i11 : 0, z10);
        if (iE != -1) {
            return iA + iE;
        }
        int iB = B(iU, z10);
        while (iB != -1 && D(iB).q()) {
            iB = B(iB, z10);
        }
        if (iB != -1) {
            return A(iB) + D(iB).a(z10);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // U1.G
    public final G.b g(int i10, G.b bVar, boolean z10) {
        int iT = t(i10);
        int iA = A(iT);
        D(iT).g(i10 - z(iT), bVar, z10);
        bVar.f16823c += iA;
        if (z10) {
            bVar.f16822b = y(x(iT), C1804a.e(bVar.f16822b));
        }
        return bVar;
    }

    @Override // U1.G
    public final G.b h(Object obj, G.b bVar) {
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        int iA = A(iS);
        D(iS).h(objV, bVar);
        bVar.f16823c += iA;
        bVar.f16822b = obj;
        return bVar;
    }

    @Override // U1.G
    public int l(int i10, int i11, boolean z10) {
        if (this.f39690g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iU = u(i10);
        int iA = A(iU);
        int iL = D(iU).l(i10 - iA, i11 != 2 ? i11 : 0, z10);
        if (iL != -1) {
            return iA + iL;
        }
        int iC = C(iU, z10);
        while (iC != -1 && D(iC).q()) {
            iC = C(iC, z10);
        }
        if (iC != -1) {
            return A(iC) + D(iC).c(z10);
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    @Override // U1.G
    public final Object m(int i10) {
        int iT = t(i10);
        return y(x(iT), D(iT).m(i10 - z(iT)));
    }

    @Override // U1.G
    public final G.c o(int i10, G.c cVar, long j10) {
        int iU = u(i10);
        int iA = A(iU);
        int iZ = z(iU);
        D(iU).o(i10 - iA, cVar, j10);
        Object objX = x(iU);
        if (!G.c.f16834q.equals(cVar.f16844a)) {
            objX = y(objX, cVar.f16844a);
        }
        cVar.f16844a = objX;
        cVar.f16857n += iZ;
        cVar.f16858o += iZ;
        return cVar;
    }

    protected abstract int s(Object obj);

    protected abstract int t(int i10);

    protected abstract int u(int i10);

    protected abstract Object x(int i10);

    protected abstract int z(int i10);
}
