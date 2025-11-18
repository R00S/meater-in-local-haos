package q2;

import U1.G;
import U1.H;
import X1.InterfaceC1807d;
import X1.L;
import androidx.media3.exoplayer.source.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m8.AbstractC4009y;
import m8.C3982E;
import m8.M;
import m8.N;
import q2.x;

/* compiled from: AdaptiveTrackSelection.java */
/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4272a extends AbstractC4274c {

    /* renamed from: i, reason: collision with root package name */
    private final r2.d f47810i;

    /* renamed from: j, reason: collision with root package name */
    private final long f47811j;

    /* renamed from: k, reason: collision with root package name */
    private final long f47812k;

    /* renamed from: l, reason: collision with root package name */
    private final long f47813l;

    /* renamed from: m, reason: collision with root package name */
    private final int f47814m;

    /* renamed from: n, reason: collision with root package name */
    private final int f47815n;

    /* renamed from: o, reason: collision with root package name */
    private final float f47816o;

    /* renamed from: p, reason: collision with root package name */
    private final float f47817p;

    /* renamed from: q, reason: collision with root package name */
    private final AbstractC4009y<C0666a> f47818q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC1807d f47819r;

    /* renamed from: s, reason: collision with root package name */
    private float f47820s;

    /* renamed from: t, reason: collision with root package name */
    private int f47821t;

    /* renamed from: u, reason: collision with root package name */
    private int f47822u;

    /* renamed from: v, reason: collision with root package name */
    private long f47823v;

    /* renamed from: w, reason: collision with root package name */
    private o2.l f47824w;

    /* renamed from: x, reason: collision with root package name */
    private long f47825x;

    /* compiled from: AdaptiveTrackSelection.java */
    /* renamed from: q2.a$a, reason: collision with other inner class name */
    public static final class C0666a {

        /* renamed from: a, reason: collision with root package name */
        public final long f47826a;

        /* renamed from: b, reason: collision with root package name */
        public final long f47827b;

        public C0666a(long j10, long j11) {
            this.f47826a = j10;
            this.f47827b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0666a)) {
                return false;
            }
            C0666a c0666a = (C0666a) obj;
            return this.f47826a == c0666a.f47826a && this.f47827b == c0666a.f47827b;
        }

        public int hashCode() {
            return (((int) this.f47826a) * 31) + ((int) this.f47827b);
        }
    }

    /* compiled from: AdaptiveTrackSelection.java */
    /* renamed from: q2.a$b */
    public static class b implements x.b {

        /* renamed from: a, reason: collision with root package name */
        private final int f47828a;

        /* renamed from: b, reason: collision with root package name */
        private final int f47829b;

        /* renamed from: c, reason: collision with root package name */
        private final int f47830c;

        /* renamed from: d, reason: collision with root package name */
        private final int f47831d;

        /* renamed from: e, reason: collision with root package name */
        private final int f47832e;

        /* renamed from: f, reason: collision with root package name */
        private final float f47833f;

        /* renamed from: g, reason: collision with root package name */
        private final float f47834g;

        /* renamed from: h, reason: collision with root package name */
        private final InterfaceC1807d f47835h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q2.x.b
        public final x[] a(x.a[] aVarArr, r2.d dVar, r.b bVar, G g10) {
            AbstractC4009y abstractC4009yB = C4272a.B(aVarArr);
            x[] xVarArr = new x[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                x.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.f47982b;
                    if (iArr.length != 0) {
                        xVarArr[i10] = iArr.length == 1 ? new y(aVar.f47981a, iArr[0], aVar.f47983c) : b(aVar.f47981a, iArr, aVar.f47983c, dVar, (AbstractC4009y) abstractC4009yB.get(i10));
                    }
                }
            }
            return xVarArr;
        }

        protected C4272a b(H h10, int[] iArr, int i10, r2.d dVar, AbstractC4009y<C0666a> abstractC4009y) {
            return new C4272a(h10, iArr, i10, dVar, this.f47828a, this.f47829b, this.f47830c, this.f47831d, this.f47832e, this.f47833f, this.f47834g, abstractC4009y, this.f47835h);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, InterfaceC1807d.f18647a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, InterfaceC1807d interfaceC1807d) {
            this.f47828a = i10;
            this.f47829b = i11;
            this.f47830c = i12;
            this.f47831d = i13;
            this.f47832e = i14;
            this.f47833f = f10;
            this.f47834g = f11;
            this.f47835h = interfaceC1807d;
        }
    }

    protected C4272a(H h10, int[] iArr, int i10, r2.d dVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List<C0666a> list, InterfaceC1807d interfaceC1807d) {
        r2.d dVar2;
        long j13;
        super(h10, iArr, i10);
        if (j12 < j10) {
            X1.n.h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            dVar2 = dVar;
            j13 = j10;
        } else {
            dVar2 = dVar;
            j13 = j12;
        }
        this.f47810i = dVar2;
        this.f47811j = j10 * 1000;
        this.f47812k = j11 * 1000;
        this.f47813l = j13 * 1000;
        this.f47814m = i11;
        this.f47815n = i12;
        this.f47816o = f10;
        this.f47817p = f11;
        this.f47818q = AbstractC4009y.B(list);
        this.f47819r = interfaceC1807d;
        this.f47820s = 1.0f;
        this.f47822u = 0;
        this.f47823v = -9223372036854775807L;
        this.f47825x = -2147483647L;
    }

    private int A(long j10, long j11) {
        long jC = C(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f47837b; i11++) {
            if (j10 == Long.MIN_VALUE || !a(i11, j10)) {
                U1.s sVarF = f(i11);
                if (z(sVarF, sVarF.f17157j, jC)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC4009y<AbstractC4009y<C0666a>> B(x.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (x.a aVar : aVarArr) {
            if (aVar == null || aVar.f47982b.length <= 1) {
                arrayList.add(null);
            } else {
                AbstractC4009y.a aVarY = AbstractC4009y.y();
                aVarY.a(new C0666a(0L, 0L));
                arrayList.add(aVarY);
            }
        }
        long[][] jArrG = G(aVarArr);
        int[] iArr = new int[jArrG.length];
        long[] jArr = new long[jArrG.length];
        for (int i10 = 0; i10 < jArrG.length; i10++) {
            long[] jArr2 = jArrG[i10];
            jArr[i10] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        y(arrayList, jArr);
        AbstractC4009y<Integer> abstractC4009yH = H(jArrG);
        for (int i11 = 0; i11 < abstractC4009yH.size(); i11++) {
            int iIntValue = abstractC4009yH.get(i11).intValue();
            int i12 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i12;
            jArr[iIntValue] = jArrG[iIntValue][i12];
            y(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        y(arrayList, jArr);
        AbstractC4009y.a aVarY2 = AbstractC4009y.y();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            AbstractC4009y.a aVar2 = (AbstractC4009y.a) arrayList.get(i14);
            aVarY2.a(aVar2 == null ? AbstractC4009y.G() : aVar2.k());
        }
        return aVarY2.k();
    }

    private long C(long j10) {
        long jI = I(j10);
        if (this.f47818q.isEmpty()) {
            return jI;
        }
        int i10 = 1;
        while (i10 < this.f47818q.size() - 1 && this.f47818q.get(i10).f47826a < jI) {
            i10++;
        }
        C0666a c0666a = this.f47818q.get(i10 - 1);
        C0666a c0666a2 = this.f47818q.get(i10);
        long j11 = c0666a.f47826a;
        float f10 = (jI - j11) / (c0666a2.f47826a - j11);
        return c0666a.f47827b + ((long) (f10 * (c0666a2.f47827b - r2)));
    }

    private long D(List<? extends o2.l> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        o2.l lVar = (o2.l) C3982E.e(list);
        long j10 = lVar.f46352g;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = lVar.f46353h;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    private long F(o2.m[] mVarArr, List<? extends o2.l> list) {
        int i10 = this.f47821t;
        if (i10 < mVarArr.length && mVarArr[i10].next()) {
            o2.m mVar = mVarArr[this.f47821t];
            return mVar.b() - mVar.a();
        }
        for (o2.m mVar2 : mVarArr) {
            if (mVar2.next()) {
                return mVar2.b() - mVar2.a();
            }
        }
        return D(list);
    }

    private static long[][] G(x.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            x.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f47982b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f47982b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = aVar.f47981a.a(iArr[i11]).f17157j;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static AbstractC4009y<Integer> H(long[][] jArr) {
        M mE = N.c().a().e();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double dLog = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i11] = dLog;
                    i11++;
                }
                int i12 = length - 1;
                double d10 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d11 = dArr[i13];
                    i13++;
                    mE.put(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i13]) * 0.5d) - dArr[0]) / d10), Integer.valueOf(i10));
                }
            }
        }
        return AbstractC4009y.B(mE.values());
    }

    private long I(long j10) {
        long jF = this.f47810i.f();
        this.f47825x = jF;
        long j11 = (long) (jF * this.f47816o);
        long jB = this.f47810i.b();
        if (jB == -9223372036854775807L || j10 == -9223372036854775807L) {
            return (long) (j11 / this.f47820s);
        }
        float f10 = j10;
        return (long) ((j11 * Math.max((f10 / this.f47820s) - jB, 0.0f)) / f10);
    }

    private long J(long j10, long j11) {
        if (j10 == -9223372036854775807L) {
            return this.f47811j;
        }
        if (j11 != -9223372036854775807L) {
            j10 -= j11;
        }
        return Math.min((long) (j10 * this.f47817p), this.f47811j);
    }

    private static void y(List<AbstractC4009y.a<C0666a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            AbstractC4009y.a<C0666a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.a(new C0666a(j10, jArr[i10]));
            }
        }
    }

    protected long E() {
        return this.f47813l;
    }

    protected boolean K(long j10, List<? extends o2.l> list) {
        long j11 = this.f47823v;
        return j11 == -9223372036854775807L || j10 - j11 >= 1000 || !(list.isEmpty() || ((o2.l) C3982E.e(list)).equals(this.f47824w));
    }

    @Override // q2.x
    public int c() {
        return this.f47821t;
    }

    @Override // q2.x
    public void d(long j10, long j11, long j12, List<? extends o2.l> list, o2.m[] mVarArr) {
        long jC = this.f47819r.c();
        long jF = F(mVarArr, list);
        int i10 = this.f47822u;
        if (i10 == 0) {
            this.f47822u = 1;
            this.f47821t = A(jC, jF);
            return;
        }
        int i11 = this.f47821t;
        int iL = list.isEmpty() ? -1 : l(((o2.l) C3982E.e(list)).f46349d);
        if (iL != -1) {
            i10 = ((o2.l) C3982E.e(list)).f46350e;
            i11 = iL;
        }
        int iA = A(jC, jF);
        if (iA != i11 && !a(i11, jC)) {
            U1.s sVarF = f(i11);
            U1.s sVarF2 = f(iA);
            long J10 = J(j12, jF);
            int i12 = sVarF2.f17157j;
            int i13 = sVarF.f17157j;
            if ((i12 > i13 && j11 < J10) || (i12 < i13 && j11 >= this.f47812k)) {
                iA = i11;
            }
        }
        if (iA != i11) {
            i10 = 3;
        }
        this.f47822u = i10;
        this.f47821t = iA;
    }

    @Override // q2.AbstractC4274c, q2.x
    public void g() {
        this.f47824w = null;
    }

    @Override // q2.AbstractC4274c, q2.x
    public void h() {
        this.f47823v = -9223372036854775807L;
        this.f47824w = null;
    }

    @Override // q2.AbstractC4274c, q2.x
    public int j(long j10, List<? extends o2.l> list) {
        int i10;
        int i11;
        long jC = this.f47819r.c();
        if (!K(jC, list)) {
            return list.size();
        }
        this.f47823v = jC;
        this.f47824w = list.isEmpty() ? null : (o2.l) C3982E.e(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jJ0 = L.j0(list.get(size - 1).f46352g - j10, this.f47820s);
        long jE = E();
        if (jJ0 < jE) {
            return size;
        }
        U1.s sVarF = f(A(jC, D(list)));
        for (int i12 = 0; i12 < size; i12++) {
            o2.l lVar = list.get(i12);
            U1.s sVar = lVar.f46349d;
            if (L.j0(lVar.f46352g - j10, this.f47820s) >= jE && sVar.f17157j < sVarF.f17157j && (i10 = sVar.f17170w) != -1 && i10 <= this.f47815n && (i11 = sVar.f17169v) != -1 && i11 <= this.f47814m && i10 < sVarF.f17170w) {
                return i12;
            }
        }
        return size;
    }

    @Override // q2.x
    public int o() {
        return this.f47822u;
    }

    @Override // q2.AbstractC4274c, q2.x
    public void q(float f10) {
        this.f47820s = f10;
    }

    @Override // q2.x
    public Object r() {
        return null;
    }

    protected boolean z(U1.s sVar, int i10, long j10) {
        return ((long) i10) <= j10;
    }
}
