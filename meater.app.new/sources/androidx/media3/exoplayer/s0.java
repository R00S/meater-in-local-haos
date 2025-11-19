package androidx.media3.exoplayer;

import U1.C1726b;
import U1.G;
import d2.AbstractC3029a;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PlaylistTimeline.java */
/* loaded from: classes.dex */
final class s0 extends AbstractC3029a {

    /* renamed from: h, reason: collision with root package name */
    private final int f27481h;

    /* renamed from: i, reason: collision with root package name */
    private final int f27482i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f27483j;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f27484k;

    /* renamed from: l, reason: collision with root package name */
    private final U1.G[] f27485l;

    /* renamed from: m, reason: collision with root package name */
    private final Object[] f27486m;

    /* renamed from: n, reason: collision with root package name */
    private final HashMap<Object, Integer> f27487n;

    /* compiled from: PlaylistTimeline.java */
    class a extends androidx.media3.exoplayer.source.m {

        /* renamed from: f, reason: collision with root package name */
        private final G.c f27488f;

        a(U1.G g10) {
            super(g10);
            this.f27488f = new G.c();
        }

        @Override // androidx.media3.exoplayer.source.m, U1.G
        public G.b g(int i10, G.b bVar, boolean z10) {
            G.b bVarG = super.g(i10, bVar, z10);
            if (super.n(bVarG.f16823c, this.f27488f).f()) {
                bVarG.t(bVar.f16821a, bVar.f16822b, bVar.f16823c, bVar.f16824d, bVar.f16825e, C1726b.f16996g, true);
            } else {
                bVarG.f16826f = true;
            }
            return bVarG;
        }
    }

    public s0(Collection<? extends b0> collection, n2.t tVar) {
        this(G(collection), H(collection), tVar);
    }

    private static U1.G[] G(Collection<? extends b0> collection) {
        U1.G[] gArr = new U1.G[collection.size()];
        Iterator<? extends b0> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            gArr[i10] = it.next().b();
            i10++;
        }
        return gArr;
    }

    private static Object[] H(Collection<? extends b0> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends b0> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = it.next().a();
            i10++;
        }
        return objArr;
    }

    @Override // d2.AbstractC3029a
    protected int A(int i10) {
        return this.f27484k[i10];
    }

    @Override // d2.AbstractC3029a
    protected U1.G D(int i10) {
        return this.f27485l[i10];
    }

    public s0 E(n2.t tVar) {
        U1.G[] gArr = new U1.G[this.f27485l.length];
        int i10 = 0;
        while (true) {
            U1.G[] gArr2 = this.f27485l;
            if (i10 >= gArr2.length) {
                return new s0(gArr, this.f27486m, tVar);
            }
            gArr[i10] = new a(gArr2[i10]);
            i10++;
        }
    }

    List<U1.G> F() {
        return Arrays.asList(this.f27485l);
    }

    @Override // U1.G
    public int i() {
        return this.f27482i;
    }

    @Override // U1.G
    public int p() {
        return this.f27481h;
    }

    @Override // d2.AbstractC3029a
    protected int s(Object obj) {
        Integer num = this.f27487n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // d2.AbstractC3029a
    protected int t(int i10) {
        return X1.L.g(this.f27483j, i10 + 1, false, false);
    }

    @Override // d2.AbstractC3029a
    protected int u(int i10) {
        return X1.L.g(this.f27484k, i10 + 1, false, false);
    }

    @Override // d2.AbstractC3029a
    protected Object x(int i10) {
        return this.f27486m[i10];
    }

    @Override // d2.AbstractC3029a
    protected int z(int i10) {
        return this.f27483j[i10];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private s0(U1.G[] gArr, Object[] objArr, n2.t tVar) {
        super(false, tVar);
        int i10 = 0;
        int length = gArr.length;
        this.f27485l = gArr;
        this.f27483j = new int[length];
        this.f27484k = new int[length];
        this.f27486m = objArr;
        this.f27487n = new HashMap<>();
        int length2 = gArr.length;
        int iP = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length2) {
            U1.G g10 = gArr[i10];
            this.f27485l[i12] = g10;
            this.f27484k[i12] = iP;
            this.f27483j[i12] = i11;
            iP += g10.p();
            i11 += this.f27485l[i12].i();
            this.f27487n.put(objArr[i12], Integer.valueOf(i12));
            i10++;
            i12++;
        }
        this.f27481h = iP;
        this.f27482i = i11;
    }
}
