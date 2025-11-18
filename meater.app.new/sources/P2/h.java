package P2;

import S2.r;
import U1.C1738n;
import U1.s;
import U1.z;
import X1.C1804a;
import X1.E;
import X1.L;
import X1.y;
import Y1.b;
import Y1.g;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import l8.InterfaceC3914g;
import m8.AbstractC4009y;
import v2.B;
import v2.C4797c;
import v2.C4800f;
import v2.C4801g;
import v2.I;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.J;
import v2.N;
import v2.O;

/* compiled from: FragmentedMp4Extractor.java */
/* loaded from: classes.dex */
public class h implements InterfaceC4810p {

    /* renamed from: M, reason: collision with root package name */
    @Deprecated
    public static final v2.u f13762M = new v2.u() { // from class: P2.f
        @Override // v2.u
        public final InterfaceC4810p[] d() {
            return h.s();
        }
    };

    /* renamed from: N, reason: collision with root package name */
    private static final byte[] f13763N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: O, reason: collision with root package name */
    private static final U1.s f13764O = new s.b().s0("application/x-emsg").M();

    /* renamed from: A, reason: collision with root package name */
    private long f13765A;

    /* renamed from: B, reason: collision with root package name */
    private long f13766B;

    /* renamed from: C, reason: collision with root package name */
    private b f13767C;

    /* renamed from: D, reason: collision with root package name */
    private int f13768D;

    /* renamed from: E, reason: collision with root package name */
    private int f13769E;

    /* renamed from: F, reason: collision with root package name */
    private int f13770F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f13771G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f13772H;

    /* renamed from: I, reason: collision with root package name */
    private v2.r f13773I;

    /* renamed from: J, reason: collision with root package name */
    private O[] f13774J;

    /* renamed from: K, reason: collision with root package name */
    private O[] f13775K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f13776L;

    /* renamed from: a, reason: collision with root package name */
    private final r.a f13777a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13778b;

    /* renamed from: c, reason: collision with root package name */
    private final s f13779c;

    /* renamed from: d, reason: collision with root package name */
    private final List<U1.s> f13780d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray<b> f13781e;

    /* renamed from: f, reason: collision with root package name */
    private final y f13782f;

    /* renamed from: g, reason: collision with root package name */
    private final y f13783g;

    /* renamed from: h, reason: collision with root package name */
    private final y f13784h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f13785i;

    /* renamed from: j, reason: collision with root package name */
    private final y f13786j;

    /* renamed from: k, reason: collision with root package name */
    private final E f13787k;

    /* renamed from: l, reason: collision with root package name */
    private final G2.c f13788l;

    /* renamed from: m, reason: collision with root package name */
    private final y f13789m;

    /* renamed from: n, reason: collision with root package name */
    private final ArrayDeque<b.C0281b> f13790n;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayDeque<a> f13791o;

    /* renamed from: p, reason: collision with root package name */
    private final Y1.g f13792p;

    /* renamed from: q, reason: collision with root package name */
    private final O f13793q;

    /* renamed from: r, reason: collision with root package name */
    private AbstractC4009y<N> f13794r;

    /* renamed from: s, reason: collision with root package name */
    private int f13795s;

    /* renamed from: t, reason: collision with root package name */
    private int f13796t;

    /* renamed from: u, reason: collision with root package name */
    private long f13797u;

    /* renamed from: v, reason: collision with root package name */
    private int f13798v;

    /* renamed from: w, reason: collision with root package name */
    private y f13799w;

    /* renamed from: x, reason: collision with root package name */
    private long f13800x;

    /* renamed from: y, reason: collision with root package name */
    private int f13801y;

    /* renamed from: z, reason: collision with root package name */
    private long f13802z;

    /* compiled from: FragmentedMp4Extractor.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f13803a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13804b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13805c;

        public a(long j10, boolean z10, int i10) {
            this.f13803a = j10;
            this.f13804b = z10;
            this.f13805c = i10;
        }
    }

    /* compiled from: FragmentedMp4Extractor.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final O f13806a;

        /* renamed from: d, reason: collision with root package name */
        public v f13809d;

        /* renamed from: e, reason: collision with root package name */
        public c f13810e;

        /* renamed from: f, reason: collision with root package name */
        public int f13811f;

        /* renamed from: g, reason: collision with root package name */
        public int f13812g;

        /* renamed from: h, reason: collision with root package name */
        public int f13813h;

        /* renamed from: i, reason: collision with root package name */
        public int f13814i;

        /* renamed from: l, reason: collision with root package name */
        private boolean f13817l;

        /* renamed from: b, reason: collision with root package name */
        public final u f13807b = new u();

        /* renamed from: c, reason: collision with root package name */
        public final y f13808c = new y();

        /* renamed from: j, reason: collision with root package name */
        private final y f13815j = new y(1);

        /* renamed from: k, reason: collision with root package name */
        private final y f13816k = new y();

        public b(O o10, v vVar, c cVar) {
            this.f13806a = o10;
            this.f13809d = vVar;
            this.f13810e = cVar;
            j(vVar, cVar);
        }

        public int c() {
            int i10 = !this.f13817l ? this.f13809d.f13914g[this.f13811f] : this.f13807b.f13900k[this.f13811f] ? 1 : 0;
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            return !this.f13817l ? this.f13809d.f13910c[this.f13811f] : this.f13807b.f13896g[this.f13813h];
        }

        public long e() {
            return !this.f13817l ? this.f13809d.f13913f[this.f13811f] : this.f13807b.c(this.f13811f);
        }

        public int f() {
            return !this.f13817l ? this.f13809d.f13911d[this.f13811f] : this.f13807b.f13898i[this.f13811f];
        }

        public t g() {
            if (!this.f13817l) {
                return null;
            }
            int i10 = ((c) L.i(this.f13807b.f13890a)).f13750a;
            t tVarB = this.f13807b.f13903n;
            if (tVarB == null) {
                tVarB = this.f13809d.f13908a.b(i10);
            }
            if (tVarB == null || !tVarB.f13885a) {
                return null;
            }
            return tVarB;
        }

        public boolean h() {
            this.f13811f++;
            if (!this.f13817l) {
                return false;
            }
            int i10 = this.f13812g + 1;
            this.f13812g = i10;
            int[] iArr = this.f13807b.f13897h;
            int i11 = this.f13813h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f13813h = i11 + 1;
            this.f13812g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            y yVar;
            t tVarG = g();
            if (tVarG == null) {
                return 0;
            }
            int length = tVarG.f13888d;
            if (length != 0) {
                yVar = this.f13807b.f13904o;
            } else {
                byte[] bArr = (byte[]) L.i(tVarG.f13889e);
                this.f13816k.U(bArr, bArr.length);
                y yVar2 = this.f13816k;
                length = bArr.length;
                yVar = yVar2;
            }
            boolean zG = this.f13807b.g(this.f13811f);
            boolean z10 = zG || i11 != 0;
            this.f13815j.e()[0] = (byte) ((z10 ? 128 : 0) | length);
            this.f13815j.W(0);
            this.f13806a.b(this.f13815j, 1, 1);
            this.f13806a.b(yVar, length, 1);
            if (!z10) {
                return length + 1;
            }
            if (!zG) {
                this.f13808c.S(8);
                byte[] bArrE = this.f13808c.e();
                bArrE[0] = 0;
                bArrE[1] = 1;
                bArrE[2] = (byte) ((i11 >> 8) & 255);
                bArrE[3] = (byte) (i11 & 255);
                bArrE[4] = (byte) ((i10 >> 24) & 255);
                bArrE[5] = (byte) ((i10 >> 16) & 255);
                bArrE[6] = (byte) ((i10 >> 8) & 255);
                bArrE[7] = (byte) (i10 & 255);
                this.f13806a.b(this.f13808c, 8, 1);
                return length + 9;
            }
            y yVar3 = this.f13807b.f13904o;
            int iP = yVar3.P();
            yVar3.X(-2);
            int i12 = (iP * 6) + 2;
            if (i11 != 0) {
                this.f13808c.S(i12);
                byte[] bArrE2 = this.f13808c.e();
                yVar3.l(bArrE2, 0, i12);
                int i13 = (((bArrE2[2] & 255) << 8) | (bArrE2[3] & 255)) + i11;
                bArrE2[2] = (byte) ((i13 >> 8) & 255);
                bArrE2[3] = (byte) (i13 & 255);
                yVar3 = this.f13808c;
            }
            this.f13806a.b(yVar3, i12, 1);
            return length + 1 + i12;
        }

        public void j(v vVar, c cVar) {
            this.f13809d = vVar;
            this.f13810e = cVar;
            this.f13806a.f(vVar.f13908a.f13879g);
            k();
        }

        public void k() {
            this.f13807b.f();
            this.f13811f = 0;
            this.f13813h = 0;
            this.f13812g = 0;
            this.f13814i = 0;
            this.f13817l = false;
        }

        public void l(long j10) {
            int i10 = this.f13811f;
            while (true) {
                u uVar = this.f13807b;
                if (i10 >= uVar.f13895f || uVar.c(i10) > j10) {
                    return;
                }
                if (this.f13807b.f13900k[i10]) {
                    this.f13814i = i10;
                }
                i10++;
            }
        }

        public void m() {
            t tVarG = g();
            if (tVarG == null) {
                return;
            }
            y yVar = this.f13807b.f13904o;
            int i10 = tVarG.f13888d;
            if (i10 != 0) {
                yVar.X(i10);
            }
            if (this.f13807b.g(this.f13811f)) {
                yVar.X(yVar.P() * 6);
            }
        }

        public void n(C1738n c1738n) {
            t tVarB = this.f13809d.f13908a.b(((c) L.i(this.f13807b.f13890a)).f13750a);
            this.f13806a.f(this.f13809d.f13908a.f13879g.b().X(c1738n.c(tVarB != null ? tVarB.f13886b : null)).M());
        }
    }

    public h(r.a aVar, int i10) {
        this(aVar, i10, null, null, AbstractC4009y.G(), null);
    }

    private static long A(y yVar) {
        yVar.W(8);
        return P2.b.m(yVar.q()) == 0 ? yVar.J() : yVar.O();
    }

    private static void B(b.C0281b c0281b, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws ParserException {
        int size = c0281b.f19219d.size();
        for (int i11 = 0; i11 < size; i11++) {
            b.C0281b c0281b2 = c0281b.f19219d.get(i11);
            if (c0281b2.f19216a == 1953653094) {
                K(c0281b2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void C(y yVar, u uVar) throws ParserException {
        yVar.W(8);
        int iQ = yVar.q();
        if ((P2.b.l(iQ) & 1) == 1) {
            yVar.X(8);
        }
        int iL = yVar.L();
        if (iL == 1) {
            uVar.f13893d += P2.b.m(iQ) == 0 ? yVar.J() : yVar.O();
        } else {
            throw ParserException.a("Unexpected saio entry count: " + iL, null);
        }
    }

    private static void D(t tVar, y yVar, u uVar) throws ParserException {
        int i10;
        int i11 = tVar.f13888d;
        yVar.W(8);
        if ((P2.b.l(yVar.q()) & 1) == 1) {
            yVar.X(8);
        }
        int iH = yVar.H();
        int iL = yVar.L();
        if (iL > uVar.f13895f) {
            throw ParserException.a("Saiz sample count " + iL + " is greater than fragment sample count" + uVar.f13895f, null);
        }
        if (iH == 0) {
            boolean[] zArr = uVar.f13902m;
            i10 = 0;
            for (int i12 = 0; i12 < iL; i12++) {
                int iH2 = yVar.H();
                i10 += iH2;
                zArr[i12] = iH2 > i11;
            }
        } else {
            i10 = iH * iL;
            Arrays.fill(uVar.f13902m, 0, iL, iH > i11);
        }
        Arrays.fill(uVar.f13902m, iL, uVar.f13895f, false);
        if (i10 > 0) {
            uVar.d(i10);
        }
    }

    private static void E(b.C0281b c0281b, String str, u uVar) throws ParserException {
        byte[] bArr = null;
        y yVar = null;
        y yVar2 = null;
        for (int i10 = 0; i10 < c0281b.f19218c.size(); i10++) {
            b.c cVar = c0281b.f19218c.get(i10);
            y yVar3 = cVar.f19220b;
            int i11 = cVar.f19216a;
            if (i11 == 1935828848) {
                yVar3.W(12);
                if (yVar3.q() == 1936025959) {
                    yVar = yVar3;
                }
            } else if (i11 == 1936158820) {
                yVar3.W(12);
                if (yVar3.q() == 1936025959) {
                    yVar2 = yVar3;
                }
            }
        }
        if (yVar == null || yVar2 == null) {
            return;
        }
        yVar.W(8);
        int iM = P2.b.m(yVar.q());
        yVar.X(4);
        if (iM == 1) {
            yVar.X(4);
        }
        if (yVar.q() != 1) {
            throw ParserException.d("Entry count in sbgp != 1 (unsupported).");
        }
        yVar2.W(8);
        int iM2 = P2.b.m(yVar2.q());
        yVar2.X(4);
        if (iM2 == 1) {
            if (yVar2.J() == 0) {
                throw ParserException.d("Variable length description in sgpd found (unsupported)");
            }
        } else if (iM2 >= 2) {
            yVar2.X(4);
        }
        if (yVar2.J() != 1) {
            throw ParserException.d("Entry count in sgpd != 1 (unsupported).");
        }
        yVar2.X(1);
        int iH = yVar2.H();
        int i12 = (iH & 240) >> 4;
        int i13 = iH & 15;
        boolean z10 = yVar2.H() == 1;
        if (z10) {
            int iH2 = yVar2.H();
            byte[] bArr2 = new byte[16];
            yVar2.l(bArr2, 0, 16);
            if (iH2 == 0) {
                int iH3 = yVar2.H();
                bArr = new byte[iH3];
                yVar2.l(bArr, 0, iH3);
            }
            uVar.f13901l = true;
            uVar.f13903n = new t(z10, str, iH2, bArr2, i12, i13, bArr);
        }
    }

    private static void F(y yVar, int i10, u uVar) throws ParserException {
        yVar.W(i10 + 8);
        int iL = P2.b.l(yVar.q());
        if ((iL & 1) != 0) {
            throw ParserException.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iL & 2) != 0;
        int iL2 = yVar.L();
        if (iL2 == 0) {
            Arrays.fill(uVar.f13902m, 0, uVar.f13895f, false);
            return;
        }
        if (iL2 == uVar.f13895f) {
            Arrays.fill(uVar.f13902m, 0, iL2, z10);
            uVar.d(yVar.a());
            uVar.a(yVar);
        } else {
            throw ParserException.a("Senc sample count " + iL2 + " is different from fragment sample count" + uVar.f13895f, null);
        }
    }

    private static void G(y yVar, u uVar) throws ParserException {
        F(yVar, 0, uVar);
    }

    private static Pair<Long, C4801g> H(y yVar, long j10) throws ParserException {
        long jO;
        long jO2;
        yVar.W(8);
        int iM = P2.b.m(yVar.q());
        yVar.X(4);
        long J10 = yVar.J();
        if (iM == 0) {
            jO = yVar.J();
            jO2 = yVar.J();
        } else {
            jO = yVar.O();
            jO2 = yVar.O();
        }
        long j11 = jO;
        long j12 = j10 + jO2;
        long jD1 = L.d1(j11, 1000000L, J10);
        yVar.X(2);
        int iP = yVar.P();
        int[] iArr = new int[iP];
        long[] jArr = new long[iP];
        long[] jArr2 = new long[iP];
        long[] jArr3 = new long[iP];
        long j13 = jD1;
        int i10 = 0;
        long j14 = j11;
        while (i10 < iP) {
            int iQ = yVar.q();
            if ((iQ & Integer.MIN_VALUE) != 0) {
                throw ParserException.a("Unhandled indirect reference", null);
            }
            long J11 = yVar.J();
            iArr[i10] = iQ & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            long j15 = j14 + J11;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i11 = iP;
            long jD12 = L.d1(j15, 1000000L, J10);
            jArr4[i10] = jD12 - jArr5[i10];
            yVar.X(4);
            j12 += r1[i10];
            i10++;
            iArr = iArr;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            iP = i11;
            j14 = j15;
            j13 = jD12;
        }
        return Pair.create(Long.valueOf(jD1), new C4801g(iArr, jArr, jArr2, jArr3));
    }

    private static long I(y yVar) {
        yVar.W(8);
        return P2.b.m(yVar.q()) == 1 ? yVar.O() : yVar.J();
    }

    private static b J(y yVar, SparseArray<b> sparseArray, boolean z10) {
        yVar.W(8);
        int iL = P2.b.l(yVar.q());
        b bVarValueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(yVar.q());
        if (bVarValueAt == null) {
            return null;
        }
        if ((iL & 1) != 0) {
            long jO = yVar.O();
            u uVar = bVarValueAt.f13807b;
            uVar.f13892c = jO;
            uVar.f13893d = jO;
        }
        c cVar = bVarValueAt.f13810e;
        bVarValueAt.f13807b.f13890a = new c((iL & 2) != 0 ? yVar.q() - 1 : cVar.f13750a, (iL & 8) != 0 ? yVar.q() : cVar.f13751b, (iL & 16) != 0 ? yVar.q() : cVar.f13752c, (iL & 32) != 0 ? yVar.q() : cVar.f13753d);
        return bVarValueAt;
    }

    private static void K(b.C0281b c0281b, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws ParserException {
        b bVarJ = J(((b.c) C1804a.e(c0281b.e(1952868452))).f19220b, sparseArray, z10);
        if (bVarJ == null) {
            return;
        }
        u uVar = bVarJ.f13807b;
        long j10 = uVar.f13906q;
        boolean z11 = uVar.f13907r;
        bVarJ.k();
        bVarJ.f13817l = true;
        b.c cVarE = c0281b.e(1952867444);
        if (cVarE == null || (i10 & 2) != 0) {
            uVar.f13906q = j10;
            uVar.f13907r = z11;
        } else {
            uVar.f13906q = I(cVarE.f19220b);
            uVar.f13907r = true;
        }
        N(c0281b, bVarJ, i10);
        t tVarB = bVarJ.f13809d.f13908a.b(((c) C1804a.e(uVar.f13890a)).f13750a);
        b.c cVarE2 = c0281b.e(1935763834);
        if (cVarE2 != null) {
            D((t) C1804a.e(tVarB), cVarE2.f19220b, uVar);
        }
        b.c cVarE3 = c0281b.e(1935763823);
        if (cVarE3 != null) {
            C(cVarE3.f19220b, uVar);
        }
        b.c cVarE4 = c0281b.e(1936027235);
        if (cVarE4 != null) {
            G(cVarE4.f19220b, uVar);
        }
        E(c0281b, tVarB != null ? tVarB.f13886b : null, uVar);
        int size = c0281b.f19218c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b.c cVar = c0281b.f19218c.get(i11);
            if (cVar.f19216a == 1970628964) {
                O(cVar.f19220b, uVar, bArr);
            }
        }
    }

    private static Pair<Integer, c> L(y yVar) {
        yVar.W(12);
        return Pair.create(Integer.valueOf(yVar.q()), new c(yVar.q() - 1, yVar.q(), yVar.q(), yVar.q()));
    }

    private static int M(b bVar, int i10, int i11, y yVar, int i12) throws ParserException {
        boolean z10;
        int iQ;
        boolean z11;
        int iQ2;
        boolean z12;
        boolean z13;
        boolean z14;
        int iQ3;
        b bVar2 = bVar;
        yVar.W(8);
        int iL = P2.b.l(yVar.q());
        s sVar = bVar2.f13809d.f13908a;
        u uVar = bVar2.f13807b;
        c cVar = (c) L.i(uVar.f13890a);
        uVar.f13897h[i10] = yVar.L();
        long[] jArr = uVar.f13896g;
        long j10 = uVar.f13892c;
        jArr[i10] = j10;
        if ((iL & 1) != 0) {
            jArr[i10] = j10 + yVar.q();
        }
        boolean z15 = (iL & 4) != 0;
        int iQ4 = cVar.f13753d;
        if (z15) {
            iQ4 = yVar.q();
        }
        boolean z16 = (iL & 256) != 0;
        boolean z17 = (iL & 512) != 0;
        boolean z18 = (iL & 1024) != 0;
        boolean z19 = (iL & 2048) != 0;
        long j11 = q(sVar) ? ((long[]) L.i(sVar.f13882j))[0] : 0L;
        int[] iArr = uVar.f13898i;
        long[] jArr2 = uVar.f13899j;
        boolean[] zArr = uVar.f13900k;
        int i13 = iQ4;
        boolean z20 = sVar.f13874b == 2 && (i11 & 1) != 0;
        int i14 = i12 + uVar.f13897h[i10];
        boolean z21 = z20;
        long j12 = sVar.f13875c;
        long j13 = uVar.f13906q;
        int i15 = i12;
        while (i15 < i14) {
            int iG = g(z16 ? yVar.q() : cVar.f13751b);
            if (z17) {
                iQ = yVar.q();
                z10 = z16;
            } else {
                z10 = z16;
                iQ = cVar.f13752c;
            }
            int iG2 = g(iQ);
            if (z18) {
                z11 = z15;
                iQ2 = yVar.q();
            } else if (i15 == 0 && z15) {
                z11 = z15;
                iQ2 = i13;
            } else {
                z11 = z15;
                iQ2 = cVar.f13753d;
            }
            if (z19) {
                z12 = z19;
                z13 = z17;
                z14 = z18;
                iQ3 = yVar.q();
            } else {
                z12 = z19;
                z13 = z17;
                z14 = z18;
                iQ3 = 0;
            }
            long jD1 = L.d1((iQ3 + j13) - j11, 1000000L, j12);
            jArr2[i15] = jD1;
            if (!uVar.f13907r) {
                jArr2[i15] = jD1 + bVar2.f13809d.f13915h;
            }
            iArr[i15] = iG2;
            zArr[i15] = ((iQ2 >> 16) & 1) == 0 && (!z21 || i15 == 0);
            j13 += iG;
            i15++;
            bVar2 = bVar;
            z16 = z10;
            z15 = z11;
            z19 = z12;
            z17 = z13;
            z18 = z14;
        }
        uVar.f13906q = j13;
        return i14;
    }

    private static void N(b.C0281b c0281b, b bVar, int i10) throws ParserException {
        List<b.c> list = c0281b.f19218c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            b.c cVar = list.get(i13);
            if (cVar.f19216a == 1953658222) {
                y yVar = cVar.f19220b;
                yVar.W(12);
                int iL = yVar.L();
                if (iL > 0) {
                    i12 += iL;
                    i11++;
                }
            }
        }
        bVar.f13813h = 0;
        bVar.f13812g = 0;
        bVar.f13811f = 0;
        bVar.f13807b.e(i11, i12);
        int i14 = 0;
        int iM = 0;
        for (int i15 = 0; i15 < size; i15++) {
            b.c cVar2 = list.get(i15);
            if (cVar2.f19216a == 1953658222) {
                iM = M(bVar, i14, i10, cVar2.f19220b, iM);
                i14++;
            }
        }
    }

    private static void O(y yVar, u uVar, byte[] bArr) throws ParserException {
        yVar.W(8);
        yVar.l(bArr, 0, 16);
        if (Arrays.equals(bArr, f13763N)) {
            F(yVar, 16, uVar);
        }
    }

    private void P(long j10) throws ParserException {
        while (!this.f13790n.isEmpty() && this.f13790n.peek().f19217b == j10) {
            u(this.f13790n.pop());
        }
        k();
    }

    private boolean Q(InterfaceC4811q interfaceC4811q) throws ParserException {
        if (this.f13798v == 0) {
            if (!interfaceC4811q.f(this.f13789m.e(), 0, 8, true)) {
                return false;
            }
            this.f13798v = 8;
            this.f13789m.W(0);
            this.f13797u = this.f13789m.J();
            this.f13796t = this.f13789m.q();
        }
        long j10 = this.f13797u;
        if (j10 == 1) {
            interfaceC4811q.readFully(this.f13789m.e(), 8, 8);
            this.f13798v += 8;
            this.f13797u = this.f13789m.O();
        } else if (j10 == 0) {
            long jA = interfaceC4811q.a();
            if (jA == -1 && !this.f13790n.isEmpty()) {
                jA = this.f13790n.peek().f19217b;
            }
            if (jA != -1) {
                this.f13797u = (jA - interfaceC4811q.getPosition()) + this.f13798v;
            }
        }
        if (this.f13797u < this.f13798v) {
            throw ParserException.d("Atom size less than header length (unsupported).");
        }
        long position = interfaceC4811q.getPosition() - this.f13798v;
        int i10 = this.f13796t;
        if ((i10 == 1836019558 || i10 == 1835295092) && !this.f13776L) {
            this.f13773I.f(new J.b(this.f13765A, position));
            this.f13776L = true;
        }
        if (this.f13796t == 1836019558) {
            int size = this.f13781e.size();
            for (int i11 = 0; i11 < size; i11++) {
                u uVar = this.f13781e.valueAt(i11).f13807b;
                uVar.f13891b = position;
                uVar.f13893d = position;
                uVar.f13892c = position;
            }
        }
        int i12 = this.f13796t;
        if (i12 == 1835295092) {
            this.f13767C = null;
            this.f13800x = position + this.f13797u;
            this.f13795s = 2;
            return true;
        }
        if (U(i12)) {
            long position2 = (interfaceC4811q.getPosition() + this.f13797u) - 8;
            this.f13790n.push(new b.C0281b(this.f13796t, position2));
            if (this.f13797u == this.f13798v) {
                P(position2);
            } else {
                k();
            }
        } else if (V(this.f13796t)) {
            if (this.f13798v != 8) {
                throw ParserException.d("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f13797u > 2147483647L) {
                throw ParserException.d("Leaf atom with length > 2147483647 (unsupported).");
            }
            y yVar = new y((int) this.f13797u);
            System.arraycopy(this.f13789m.e(), 0, yVar.e(), 0, 8);
            this.f13799w = yVar;
            this.f13795s = 1;
        } else {
            if (this.f13797u > 2147483647L) {
                throw ParserException.d("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f13799w = null;
            this.f13795s = 1;
        }
        return true;
    }

    private void R(InterfaceC4811q interfaceC4811q) throws ParserException {
        int i10 = ((int) this.f13797u) - this.f13798v;
        y yVar = this.f13799w;
        if (yVar != null) {
            interfaceC4811q.readFully(yVar.e(), 8, i10);
            w(new b.c(this.f13796t, yVar), interfaceC4811q.getPosition());
        } else {
            interfaceC4811q.n(i10);
        }
        P(interfaceC4811q.getPosition());
    }

    private void S(InterfaceC4811q interfaceC4811q) throws ParserException {
        int size = this.f13781e.size();
        long j10 = Long.MAX_VALUE;
        b bVarValueAt = null;
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = this.f13781e.valueAt(i10).f13807b;
            if (uVar.f13905p) {
                long j11 = uVar.f13893d;
                if (j11 < j10) {
                    bVarValueAt = this.f13781e.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVarValueAt == null) {
            this.f13795s = 3;
            return;
        }
        int position = (int) (j10 - interfaceC4811q.getPosition());
        if (position < 0) {
            throw ParserException.a("Offset to encryption data was negative.", null);
        }
        interfaceC4811q.n(position);
        bVarValueAt.f13807b.b(interfaceC4811q);
    }

    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    private boolean T(InterfaceC4811q interfaceC4811q) throws ParserException {
        int i10;
        int iC;
        b bVarN = this.f13767C;
        boolean z10 = false;
        if (bVarN == null) {
            bVarN = n(this.f13781e);
            if (bVarN == null) {
                int position = (int) (this.f13800x - interfaceC4811q.getPosition());
                if (position < 0) {
                    throw ParserException.a("Offset to end of mdat was negative.", null);
                }
                interfaceC4811q.n(position);
                k();
                return false;
            }
            int iD = (int) (bVarN.d() - interfaceC4811q.getPosition());
            if (iD < 0) {
                X1.n.h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iD = 0;
            }
            interfaceC4811q.n(iD);
            this.f13767C = bVarN;
        }
        int i11 = 4;
        ?? r92 = 1;
        if (this.f13795s == 3) {
            this.f13768D = bVarN.f();
            this.f13771G = (this.f13778b & 64) == 0 || !Objects.equals(bVarN.f13809d.f13908a.f13879g.f17162o, "video/avc");
            if (bVarN.f13811f < bVarN.f13814i) {
                interfaceC4811q.n(this.f13768D);
                bVarN.m();
                if (!bVarN.h()) {
                    this.f13767C = null;
                }
                this.f13795s = 3;
                return true;
            }
            if (bVarN.f13809d.f13908a.f13880h == 1) {
                this.f13768D -= 8;
                interfaceC4811q.n(8);
            }
            if ("audio/ac4".equals(bVarN.f13809d.f13908a.f13879g.f17162o)) {
                this.f13769E = bVarN.i(this.f13768D, 7);
                C4797c.a(this.f13768D, this.f13786j);
                bVarN.f13806a.d(this.f13786j, 7);
                this.f13769E += 7;
            } else {
                this.f13769E = bVarN.i(this.f13768D, 0);
            }
            this.f13768D += this.f13769E;
            this.f13795s = 4;
            this.f13770F = 0;
        }
        s sVar = bVarN.f13809d.f13908a;
        O o10 = bVarN.f13806a;
        long jE = bVarN.e();
        E e10 = this.f13787k;
        if (e10 != null) {
            jE = e10.a(jE);
        }
        long j10 = jE;
        if (sVar.f13883k == 0) {
            while (true) {
                int i12 = this.f13769E;
                int i13 = this.f13768D;
                if (i12 >= i13) {
                    break;
                }
                this.f13769E += o10.c(interfaceC4811q, i13 - i12, false);
            }
        } else {
            byte[] bArrE = this.f13783g.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i14 = sVar.f13883k;
            int i15 = i14 + 1;
            int i16 = 4 - i14;
            while (this.f13769E < this.f13768D) {
                int i17 = this.f13770F;
                if (i17 == 0) {
                    interfaceC4811q.readFully(bArrE, i16, i15);
                    this.f13783g.W(z10 ? 1 : 0);
                    int iQ = this.f13783g.q();
                    if (iQ < r92) {
                        throw ParserException.a("Invalid NAL length", null);
                    }
                    this.f13770F = iQ - 1;
                    this.f13782f.W(z10 ? 1 : 0);
                    o10.d(this.f13782f, i11);
                    o10.d(this.f13783g, r92 == true ? 1 : 0);
                    this.f13772H = (this.f13775K.length <= 0 || !Y1.e.l(sVar.f13879g, bArrE[i11])) ? z10 ? 1 : 0 : r92 == true ? 1 : 0;
                    this.f13769E += 5;
                    this.f13768D += i16;
                    if (!this.f13771G && Objects.equals(bVarN.f13809d.f13908a.f13879g.f17162o, "video/avc") && Y1.e.k(bArrE[i11])) {
                        this.f13771G = r92;
                    }
                } else {
                    if (this.f13772H) {
                        this.f13784h.S(i17);
                        interfaceC4811q.readFully(this.f13784h.e(), z10 ? 1 : 0, this.f13770F);
                        o10.d(this.f13784h, this.f13770F);
                        iC = this.f13770F;
                        int I10 = Y1.e.I(this.f13784h.e(), this.f13784h.g());
                        this.f13784h.W((Objects.equals(sVar.f13879g.f17162o, "video/hevc") || z.b(sVar.f13879g.f17158k, "video/hevc")) ? 1 : 0);
                        this.f13784h.V(I10);
                        if (sVar.f13879g.f17164q != -1) {
                            int iE = this.f13792p.e();
                            int i18 = sVar.f13879g.f17164q;
                            if (iE != i18) {
                                this.f13792p.f(i18);
                            }
                        } else if (this.f13792p.e() != 0) {
                            this.f13792p.f(0);
                        }
                        this.f13792p.a(j10, this.f13784h);
                        i10 = 4;
                        if ((bVarN.c() & 4) != 0) {
                            this.f13792p.c();
                        }
                    } else {
                        i10 = i11;
                        iC = o10.c(interfaceC4811q, i17, z10);
                    }
                    this.f13769E += iC;
                    this.f13770F -= iC;
                    i11 = i10;
                    z10 = false;
                    r92 = 1;
                }
            }
        }
        int iC2 = bVarN.c();
        if ((this.f13778b & 64) != 0 && !this.f13771G) {
            iC2 |= 67108864;
        }
        int i19 = iC2;
        t tVarG = bVarN.g();
        o10.e(j10, i19, this.f13768D, 0, tVarG != null ? tVarG.f13887c : null);
        z(j10);
        if (!bVarN.h()) {
            this.f13767C = null;
        }
        this.f13795s = 3;
        return true;
    }

    private static boolean U(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private static boolean V(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    private static int g(int i10) throws ParserException {
        if (i10 >= 0) {
            return i10;
        }
        throw ParserException.a("Unexpected negative value: " + i10, null);
    }

    private void k() {
        this.f13795s = 0;
        this.f13798v = 0;
    }

    private c l(SparseArray<c> sparseArray, int i10) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (c) C1804a.e(sparseArray.get(i10));
    }

    private static C1738n m(List<b.c> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            b.c cVar = list.get(i10);
            if (cVar.f19216a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrE = cVar.f19220b.e();
                UUID uuidF = o.f(bArrE);
                if (uuidF == null) {
                    X1.n.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C1738n.b(uuidF, "video/mp4", bArrE));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C1738n(arrayList);
    }

    private static b n(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVarValueAt = sparseArray.valueAt(i10);
            if ((bVarValueAt.f13817l || bVarValueAt.f13811f != bVarValueAt.f13809d.f13909b) && (!bVarValueAt.f13817l || bVarValueAt.f13813h != bVarValueAt.f13807b.f13894e)) {
                long jD = bVarValueAt.d();
                if (jD < j10) {
                    bVar = bVarValueAt;
                    j10 = jD;
                }
            }
        }
        return bVar;
    }

    private void p() {
        int i10;
        O[] oArr = new O[2];
        this.f13774J = oArr;
        O o10 = this.f13793q;
        int i11 = 0;
        if (o10 != null) {
            oArr[0] = o10;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f13778b & 4) != 0) {
            oArr[i10] = this.f13773I.a(100, 5);
            i12 = 101;
            i10++;
        }
        O[] oArr2 = (O[]) L.V0(this.f13774J, i10);
        this.f13774J = oArr2;
        for (O o11 : oArr2) {
            o11.f(f13764O);
        }
        this.f13775K = new O[this.f13780d.size()];
        while (i11 < this.f13775K.length) {
            O oA = this.f13773I.a(i12, 3);
            oA.f(this.f13780d.get(i11));
            this.f13775K[i11] = oA;
            i11++;
            i12++;
        }
    }

    private static boolean q(s sVar) {
        long[] jArr = sVar.f13881i;
        if (jArr == null || jArr.length != 1 || sVar.f13882j == null) {
            return false;
        }
        long j10 = jArr[0];
        return j10 == 0 || L.d1(j10, 1000000L, sVar.f13876d) + L.d1(sVar.f13882j[0], 1000000L, sVar.f13875c) >= sVar.f13877e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(long j10, y yVar) {
        C4800f.a(j10, yVar, this.f13775K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4810p[] s() {
        return new InterfaceC4810p[]{new h(r.a.f15292a, 32)};
    }

    private void u(b.C0281b c0281b) throws ParserException {
        int i10 = c0281b.f19216a;
        if (i10 == 1836019574) {
            y(c0281b);
        } else if (i10 == 1836019558) {
            x(c0281b);
        } else {
            if (this.f13790n.isEmpty()) {
                return;
            }
            this.f13790n.peek().b(c0281b);
        }
    }

    private void v(y yVar) {
        long jD1;
        String str;
        long jD12;
        String str2;
        long J10;
        long jA;
        if (this.f13774J.length == 0) {
            return;
        }
        yVar.W(8);
        int iM = P2.b.m(yVar.q());
        if (iM == 0) {
            String str3 = (String) C1804a.e(yVar.B());
            String str4 = (String) C1804a.e(yVar.B());
            long J11 = yVar.J();
            jD1 = L.d1(yVar.J(), 1000000L, J11);
            long j10 = this.f13766B;
            long j11 = j10 != -9223372036854775807L ? j10 + jD1 : -9223372036854775807L;
            str = str3;
            jD12 = L.d1(yVar.J(), 1000L, J11);
            str2 = str4;
            J10 = yVar.J();
            jA = j11;
        } else {
            if (iM != 1) {
                X1.n.h("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iM);
                return;
            }
            long J12 = yVar.J();
            jA = L.d1(yVar.O(), 1000000L, J12);
            long jD13 = L.d1(yVar.J(), 1000L, J12);
            long J13 = yVar.J();
            str = (String) C1804a.e(yVar.B());
            jD12 = jD13;
            J10 = J13;
            str2 = (String) C1804a.e(yVar.B());
            jD1 = -9223372036854775807L;
        }
        byte[] bArr = new byte[yVar.a()];
        yVar.l(bArr, 0, yVar.a());
        y yVar2 = new y(this.f13788l.a(new G2.a(str, str2, jD12, J10, bArr)));
        int iA = yVar2.a();
        for (O o10 : this.f13774J) {
            yVar2.W(0);
            o10.d(yVar2, iA);
        }
        if (jA == -9223372036854775807L) {
            this.f13791o.addLast(new a(jD1, true, iA));
            this.f13801y += iA;
            return;
        }
        if (!this.f13791o.isEmpty()) {
            this.f13791o.addLast(new a(jA, false, iA));
            this.f13801y += iA;
            return;
        }
        E e10 = this.f13787k;
        if (e10 != null && !e10.g()) {
            this.f13791o.addLast(new a(jA, false, iA));
            this.f13801y += iA;
            return;
        }
        E e11 = this.f13787k;
        if (e11 != null) {
            jA = e11.a(jA);
        }
        for (O o11 : this.f13774J) {
            o11.e(jA, 1, iA, 0, null);
        }
    }

    private void w(b.c cVar, long j10) throws ParserException {
        if (!this.f13790n.isEmpty()) {
            this.f13790n.peek().c(cVar);
            return;
        }
        int i10 = cVar.f19216a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                v(cVar.f19220b);
            }
        } else {
            Pair<Long, C4801g> pairH = H(cVar.f19220b, j10);
            this.f13766B = ((Long) pairH.first).longValue();
            this.f13773I.f((J) pairH.second);
            this.f13776L = true;
        }
    }

    private void x(b.C0281b c0281b) throws ParserException {
        B(c0281b, this.f13781e, this.f13779c != null, this.f13778b, this.f13785i);
        C1738n c1738nM = m(c0281b.f19218c);
        if (c1738nM != null) {
            int size = this.f13781e.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f13781e.valueAt(i10).n(c1738nM);
            }
        }
        if (this.f13802z != -9223372036854775807L) {
            int size2 = this.f13781e.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f13781e.valueAt(i11).l(this.f13802z);
            }
            this.f13802z = -9223372036854775807L;
        }
    }

    private void y(b.C0281b c0281b) {
        int i10 = 0;
        C1804a.h(this.f13779c == null, "Unexpected moov box.");
        C1738n c1738nM = m(c0281b.f19218c);
        b.C0281b c0281b2 = (b.C0281b) C1804a.e(c0281b.d(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = c0281b2.f19218c.size();
        long jA = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            b.c cVar = c0281b2.f19218c.get(i11);
            int i12 = cVar.f19216a;
            if (i12 == 1953654136) {
                Pair<Integer, c> pairL = L(cVar.f19220b);
                sparseArray.put(((Integer) pairL.first).intValue(), (c) pairL.second);
            } else if (i12 == 1835362404) {
                jA = A(cVar.f19220b);
            }
        }
        List<v> listD = P2.b.D(c0281b, new B(), jA, c1738nM, (this.f13778b & 16) != 0, false, new InterfaceC3914g() { // from class: P2.e
            @Override // l8.InterfaceC3914g
            public final Object apply(Object obj) {
                return this.f13760B.t((s) obj);
            }
        });
        int size2 = listD.size();
        if (this.f13781e.size() != 0) {
            C1804a.g(this.f13781e.size() == size2);
            while (i10 < size2) {
                v vVar = listD.get(i10);
                s sVar = vVar.f13908a;
                this.f13781e.get(sVar.f13873a).j(vVar, l(sparseArray, sVar.f13873a));
                i10++;
            }
            return;
        }
        while (i10 < size2) {
            v vVar2 = listD.get(i10);
            s sVar2 = vVar2.f13908a;
            this.f13781e.put(sVar2.f13873a, new b(this.f13773I.a(i10, sVar2.f13874b), vVar2, l(sparseArray, sVar2.f13873a)));
            this.f13765A = Math.max(this.f13765A, sVar2.f13877e);
            i10++;
        }
        this.f13773I.n();
    }

    private void z(long j10) {
        while (!this.f13791o.isEmpty()) {
            a aVarRemoveFirst = this.f13791o.removeFirst();
            this.f13801y -= aVarRemoveFirst.f13805c;
            long jA = aVarRemoveFirst.f13803a;
            if (aVarRemoveFirst.f13804b) {
                jA += j10;
            }
            E e10 = this.f13787k;
            if (e10 != null) {
                jA = e10.a(jA);
            }
            for (O o10 : this.f13774J) {
                o10.e(jA, 1, aVarRemoveFirst.f13805c, this.f13801y, null);
            }
        }
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        int size = this.f13781e.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f13781e.valueAt(i10).k();
        }
        this.f13791o.clear();
        this.f13801y = 0;
        this.f13792p.c();
        this.f13802z = j11;
        this.f13790n.clear();
        k();
    }

    @Override // v2.InterfaceC4810p
    public boolean d(InterfaceC4811q interfaceC4811q) {
        N nB = r.b(interfaceC4811q);
        this.f13794r = nB != null ? AbstractC4009y.H(nB) : AbstractC4009y.G();
        return nB == null;
    }

    @Override // v2.InterfaceC4810p
    public void h(v2.r rVar) {
        if ((this.f13778b & 32) == 0) {
            rVar = new S2.s(rVar, this.f13777a);
        }
        this.f13773I = rVar;
        k();
        p();
        s sVar = this.f13779c;
        if (sVar != null) {
            this.f13781e.put(0, new b(this.f13773I.a(0, sVar.f13874b), new v(this.f13779c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.f13773I.n();
        }
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, I i10) throws ParserException {
        while (true) {
            int i11 = this.f13795s;
            if (i11 != 0) {
                if (i11 == 1) {
                    R(interfaceC4811q);
                } else if (i11 == 2) {
                    S(interfaceC4811q);
                } else if (T(interfaceC4811q)) {
                    return 0;
                }
            } else if (!Q(interfaceC4811q)) {
                this.f13792p.c();
                return -1;
            }
        }
    }

    @Override // v2.InterfaceC4810p
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC4009y<N> j() {
        return this.f13794r;
    }

    public h(r.a aVar, int i10, E e10, s sVar, List<U1.s> list, O o10) {
        this.f13777a = aVar;
        this.f13778b = i10;
        this.f13787k = e10;
        this.f13779c = sVar;
        this.f13780d = Collections.unmodifiableList(list);
        this.f13793q = o10;
        this.f13788l = new G2.c();
        this.f13789m = new y(16);
        this.f13782f = new y(Y1.e.f19226a);
        this.f13783g = new y(5);
        this.f13784h = new y();
        byte[] bArr = new byte[16];
        this.f13785i = bArr;
        this.f13786j = new y(bArr);
        this.f13790n = new ArrayDeque<>();
        this.f13791o = new ArrayDeque<>();
        this.f13781e = new SparseArray<>();
        this.f13794r = AbstractC4009y.G();
        this.f13765A = -9223372036854775807L;
        this.f13802z = -9223372036854775807L;
        this.f13766B = -9223372036854775807L;
        this.f13773I = v2.r.f51223A;
        this.f13774J = new O[0];
        this.f13775K = new O[0];
        this.f13792p = new Y1.g(new g.b() { // from class: P2.g
            @Override // Y1.g.b
            public final void a(long j10, y yVar) {
                this.f13761a.r(j10, yVar);
            }
        });
    }

    @Override // v2.InterfaceC4810p
    public void c() {
    }

    protected s t(s sVar) {
        return sVar;
    }
}
