package Q2;

import Q2.i;
import U1.s;
import X1.C1804a;
import X1.y;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import m8.AbstractC4009y;
import v2.S;

/* compiled from: VorbisReader.java */
/* loaded from: classes.dex */
final class j extends i {

    /* renamed from: n, reason: collision with root package name */
    private a f14272n;

    /* renamed from: o, reason: collision with root package name */
    private int f14273o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f14274p;

    /* renamed from: q, reason: collision with root package name */
    private S.c f14275q;

    /* renamed from: r, reason: collision with root package name */
    private S.a f14276r;

    /* compiled from: VorbisReader.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final S.c f14277a;

        /* renamed from: b, reason: collision with root package name */
        public final S.a f14278b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f14279c;

        /* renamed from: d, reason: collision with root package name */
        public final S.b[] f14280d;

        /* renamed from: e, reason: collision with root package name */
        public final int f14281e;

        public a(S.c cVar, S.a aVar, byte[] bArr, S.b[] bVarArr, int i10) {
            this.f14277a = cVar;
            this.f14278b = aVar;
            this.f14279c = bArr;
            this.f14280d = bVarArr;
            this.f14281e = i10;
        }
    }

    j() {
    }

    static void n(y yVar, long j10) {
        if (yVar.b() < yVar.g() + 4) {
            yVar.T(Arrays.copyOf(yVar.e(), yVar.g() + 4));
        } else {
            yVar.V(yVar.g() + 4);
        }
        byte[] bArrE = yVar.e();
        bArrE[yVar.g() - 4] = (byte) (j10 & 255);
        bArrE[yVar.g() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrE[yVar.g() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrE[yVar.g() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    private static int o(byte b10, a aVar) {
        return !aVar.f14280d[p(b10, aVar.f14281e, 1)].f51083a ? aVar.f14277a.f51093g : aVar.f14277a.f51094h;
    }

    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(y yVar) {
        try {
            return S.o(1, yVar, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // Q2.i
    protected void e(long j10) {
        super.e(j10);
        this.f14274p = j10 != 0;
        S.c cVar = this.f14275q;
        this.f14273o = cVar != null ? cVar.f51093g : 0;
    }

    @Override // Q2.i
    protected long f(y yVar) {
        if ((yVar.e()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(yVar.e()[0], (a) C1804a.i(this.f14272n));
        long j10 = this.f14274p ? (this.f14273o + iO) / 4 : 0;
        n(yVar, j10);
        this.f14274p = true;
        this.f14273o = iO;
        return j10;
    }

    @Override // Q2.i
    protected boolean h(y yVar, long j10, i.b bVar) throws ParserException {
        if (this.f14272n != null) {
            C1804a.e(bVar.f14270a);
            return false;
        }
        a aVarQ = q(yVar);
        this.f14272n = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        S.c cVar = aVarQ.f14277a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f51096j);
        arrayList.add(aVarQ.f14279c);
        bVar.f14270a = new s.b().s0("audio/vorbis").P(cVar.f51091e).n0(cVar.f51090d).Q(cVar.f51088b).t0(cVar.f51089c).f0(arrayList).l0(S.d(AbstractC4009y.D(aVarQ.f14278b.f51081b))).M();
        return true;
    }

    @Override // Q2.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f14272n = null;
            this.f14275q = null;
            this.f14276r = null;
        }
        this.f14273o = 0;
        this.f14274p = false;
    }

    a q(y yVar) throws ParserException {
        S.c cVar = this.f14275q;
        if (cVar == null) {
            this.f14275q = S.l(yVar);
            return null;
        }
        S.a aVar = this.f14276r;
        if (aVar == null) {
            this.f14276r = S.j(yVar);
            return null;
        }
        byte[] bArr = new byte[yVar.g()];
        System.arraycopy(yVar.e(), 0, bArr, 0, yVar.g());
        return new a(cVar, aVar, bArr, S.m(yVar, cVar.f51088b), S.b(r4.length - 1));
    }
}
