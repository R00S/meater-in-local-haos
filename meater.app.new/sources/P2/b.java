package P2;

import U1.C1733i;
import U1.C1738n;
import U1.s;
import U1.y;
import U1.z;
import X1.C1804a;
import X1.C1808e;
import X1.L;
import X1.x;
import X1.y;
import Y1.b;
import Y1.e;
import android.util.Pair;
import androidx.media3.common.ParserException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l8.InterfaceC3914g;
import m8.AbstractC4009y;
import v2.B;
import v2.C;
import v2.C4798d;
import v2.C4808n;
import v2.C4812s;

/* compiled from: BoxParser.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f13712a = L.t0("OpusHead");

    /* compiled from: BoxParser.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f13713a;

        /* renamed from: b, reason: collision with root package name */
        public int f13714b;

        /* renamed from: c, reason: collision with root package name */
        public int f13715c;

        /* renamed from: d, reason: collision with root package name */
        public long f13716d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f13717e;

        /* renamed from: f, reason: collision with root package name */
        private final y f13718f;

        /* renamed from: g, reason: collision with root package name */
        private final y f13719g;

        /* renamed from: h, reason: collision with root package name */
        private int f13720h;

        /* renamed from: i, reason: collision with root package name */
        private int f13721i;

        public a(y yVar, y yVar2, boolean z10) throws ParserException {
            this.f13719g = yVar;
            this.f13718f = yVar2;
            this.f13717e = z10;
            yVar2.W(12);
            this.f13713a = yVar2.L();
            yVar.W(12);
            this.f13721i = yVar.L();
            C4812s.a(yVar.q() == 1, "first_chunk must be 1");
            this.f13714b = -1;
        }

        public boolean a() {
            int i10 = this.f13714b + 1;
            this.f13714b = i10;
            if (i10 == this.f13713a) {
                return false;
            }
            this.f13716d = this.f13717e ? this.f13718f.O() : this.f13718f.J();
            if (this.f13714b == this.f13720h) {
                this.f13715c = this.f13719g.L();
                this.f13719g.X(4);
                int i11 = this.f13721i - 1;
                this.f13721i = i11;
                this.f13720h = i11 > 0 ? this.f13719g.L() - 1 : -1;
            }
            return true;
        }
    }

    /* compiled from: BoxParser.java */
    /* renamed from: P2.b$b, reason: collision with other inner class name */
    private static final class C0205b {

        /* renamed from: a, reason: collision with root package name */
        private final String f13722a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f13723b;

        /* renamed from: c, reason: collision with root package name */
        private final long f13724c;

        /* renamed from: d, reason: collision with root package name */
        private final long f13725d;

        public C0205b(String str, byte[] bArr, long j10, long j11) {
            this.f13722a = str;
            this.f13723b = bArr;
            this.f13724c = j10;
            this.f13725d = j11;
        }
    }

    /* compiled from: BoxParser.java */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final f f13726a;

        public c(f fVar) {
            this.f13726a = fVar;
        }
    }

    /* compiled from: BoxParser.java */
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final long f13727a;

        /* renamed from: b, reason: collision with root package name */
        private final long f13728b;

        /* renamed from: c, reason: collision with root package name */
        private final String f13729c;

        public d(long j10, long j11, String str) {
            this.f13727a = j10;
            this.f13728b = j11;
            this.f13729c = str;
        }
    }

    /* compiled from: BoxParser.java */
    private interface e {
        int a();

        int b();

        int c();
    }

    /* compiled from: BoxParser.java */
    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f13730a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f13731b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f13732c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f13733d;

        public f(boolean z10, boolean z11, boolean z12, boolean z13) {
            this.f13730a = z10;
            this.f13731b = z11;
            this.f13732c = z12;
            this.f13733d = z13;
        }
    }

    /* compiled from: BoxParser.java */
    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final t[] f13734a;

        /* renamed from: b, reason: collision with root package name */
        public U1.s f13735b;

        /* renamed from: c, reason: collision with root package name */
        public int f13736c;

        /* renamed from: d, reason: collision with root package name */
        public int f13737d = 0;

        public g(int i10) {
            this.f13734a = new t[i10];
        }
    }

    /* compiled from: BoxParser.java */
    static final class h implements e {

        /* renamed from: a, reason: collision with root package name */
        private final int f13738a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13739b;

        /* renamed from: c, reason: collision with root package name */
        private final y f13740c;

        public h(b.c cVar, U1.s sVar) {
            y yVar = cVar.f19220b;
            this.f13740c = yVar;
            yVar.W(12);
            int iL = yVar.L();
            if ("audio/raw".equals(sVar.f17162o)) {
                int iI0 = L.i0(sVar.f17139F, sVar.f17137D);
                if (iL == 0 || iL % iI0 != 0) {
                    X1.n.h("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iI0 + ", stsz sample size: " + iL);
                    iL = iI0;
                }
            }
            this.f13738a = iL == 0 ? -1 : iL;
            this.f13739b = yVar.L();
        }

        @Override // P2.b.e
        public int a() {
            return this.f13738a;
        }

        @Override // P2.b.e
        public int b() {
            return this.f13739b;
        }

        @Override // P2.b.e
        public int c() {
            int i10 = this.f13738a;
            return i10 == -1 ? this.f13740c.L() : i10;
        }
    }

    /* compiled from: BoxParser.java */
    static final class i implements e {

        /* renamed from: a, reason: collision with root package name */
        private final y f13741a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13742b;

        /* renamed from: c, reason: collision with root package name */
        private final int f13743c;

        /* renamed from: d, reason: collision with root package name */
        private int f13744d;

        /* renamed from: e, reason: collision with root package name */
        private int f13745e;

        public i(b.c cVar) {
            y yVar = cVar.f19220b;
            this.f13741a = yVar;
            yVar.W(12);
            this.f13743c = yVar.L() & 255;
            this.f13742b = yVar.L();
        }

        @Override // P2.b.e
        public int a() {
            return -1;
        }

        @Override // P2.b.e
        public int b() {
            return this.f13742b;
        }

        @Override // P2.b.e
        public int c() {
            int i10 = this.f13743c;
            if (i10 == 8) {
                return this.f13741a.H();
            }
            if (i10 == 16) {
                return this.f13741a.P();
            }
            int i11 = this.f13744d;
            this.f13744d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f13745e & 15;
            }
            int iH = this.f13741a.H();
            this.f13745e = iH;
            return (iH & 240) >> 4;
        }
    }

    /* compiled from: BoxParser.java */
    private static final class j {

        /* renamed from: a, reason: collision with root package name */
        private final int f13746a;

        /* renamed from: b, reason: collision with root package name */
        private final long f13747b;

        /* renamed from: c, reason: collision with root package name */
        private final int f13748c;

        public j(int i10, long j10, int i11) {
            this.f13746a = i10;
            this.f13747b = j10;
            this.f13748c = i11;
        }
    }

    /* compiled from: BoxParser.java */
    static final class k {

        /* renamed from: a, reason: collision with root package name */
        private final c f13749a;

        public k(c cVar) {
            this.f13749a = cVar;
        }

        public boolean b() {
            c cVar = this.f13749a;
            return cVar != null && cVar.f13726a.f13730a && this.f13749a.f13726a.f13731b;
        }
    }

    private static void A(y yVar, int i10, int i11, int i12, int i13, String str, g gVar) {
        yVar.W(i11 + 16);
        String str2 = "application/ttml+xml";
        AbstractC4009y abstractC4009yH = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = i12 - 16;
                byte[] bArr = new byte[i14];
                yVar.l(bArr, 0, i14);
                abstractC4009yH = AbstractC4009y.H(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else {
                if (i10 != 1664495672) {
                    throw new IllegalStateException();
                }
                gVar.f13737d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        gVar.f13735b = new s.b().d0(i13).s0(str2).i0(str).w0(j10).f0(abstractC4009yH).M();
    }

    private static j B(y yVar) {
        long j10;
        yVar.W(8);
        int iM = m(yVar.q());
        yVar.X(iM == 0 ? 8 : 16);
        int iQ = yVar.q();
        yVar.X(4);
        int iF = yVar.f();
        int i10 = iM == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i12 >= i10) {
                yVar.X(i10);
                break;
            }
            if (yVar.e()[iF + i12] != -1) {
                long J10 = iM == 0 ? yVar.J() : yVar.O();
                if (J10 != 0) {
                    j10 = J10;
                }
            } else {
                i12++;
            }
        }
        yVar.X(16);
        int iQ2 = yVar.q();
        int iQ3 = yVar.q();
        yVar.X(4);
        int iQ4 = yVar.q();
        int iQ5 = yVar.q();
        if (iQ2 == 0 && iQ3 == 65536 && iQ4 == -65536 && iQ5 == 0) {
            i11 = 90;
        } else if (iQ2 == 0 && iQ3 == -65536 && iQ4 == 65536 && iQ5 == 0) {
            i11 = 270;
        } else if (iQ2 == -65536 && iQ3 == 0 && iQ4 == 0 && iQ5 == -65536) {
            i11 = 180;
        }
        return new j(iQ, j10, i11);
    }

    public static s C(b.C0281b c0281b, b.c cVar, long j10, C1738n c1738n, boolean z10, boolean z11) throws ParserException {
        b.c cVar2;
        long j11;
        long[] jArr;
        long[] jArr2;
        b.C0281b c0281bD;
        Pair<long[], long[]> pairI;
        b.C0281b c0281b2 = (b.C0281b) C1804a.e(c0281b.d(1835297121));
        int iD = d(n(((b.c) C1804a.e(c0281b2.e(1751411826))).f19220b));
        if (iD == -1) {
            return null;
        }
        j jVarB = B(((b.c) C1804a.e(c0281b.e(1953196132))).f19220b);
        if (j10 == -9223372036854775807L) {
            cVar2 = cVar;
            j11 = jVarB.f13747b;
        } else {
            cVar2 = cVar;
            j11 = j10;
        }
        long j12 = s(cVar2.f19220b).f19225D;
        long jD1 = j11 != -9223372036854775807L ? L.d1(j11, 1000000L, j12) : -9223372036854775807L;
        b.C0281b c0281b3 = (b.C0281b) C1804a.e(((b.C0281b) C1804a.e(c0281b2.d(1835626086))).d(1937007212));
        d dVarP = p(((b.c) C1804a.e(c0281b2.e(1835296868))).f19220b);
        b.c cVarE = c0281b3.e(1937011556);
        if (cVarE == null) {
            throw ParserException.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        g gVarZ = z(cVarE.f19220b, jVarB.f13746a, jVarB.f13748c, dVarP.f13729c, c1738n, z11);
        if (z10 || (c0281bD = c0281b.d(1701082227)) == null || (pairI = i(c0281bD)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairI.first;
            jArr2 = (long[]) pairI.second;
            jArr = jArr3;
        }
        if (gVarZ.f13735b == null) {
            return null;
        }
        return new s(jVarB.f13746a, iD, dVarP.f13727a, j12, jD1, dVarP.f13728b, gVarZ.f13735b, gVarZ.f13737d, gVarZ.f13734a, gVarZ.f13736c, jArr, jArr2);
    }

    public static List<v> D(b.C0281b c0281b, B b10, long j10, C1738n c1738n, boolean z10, boolean z11, InterfaceC3914g<s, s> interfaceC3914g) {
        s sVarApply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c0281b.f19219d.size(); i10++) {
            b.C0281b c0281b2 = c0281b.f19219d.get(i10);
            if (c0281b2.f19216a == 1953653099 && (sVarApply = interfaceC3914g.apply(C(c0281b2, (b.c) C1804a.e(c0281b.e(1836476516)), j10, c1738n, z10, z11))) != null) {
                arrayList.add(x(sVarApply, (b.C0281b) C1804a.e(((b.C0281b) C1804a.e(((b.C0281b) C1804a.e(c0281b2.d(1835297121))).d(1835626086))).d(1937007212)), b10));
            }
        }
        return arrayList;
    }

    public static U1.y E(b.c cVar) {
        y yVar = cVar.f19220b;
        yVar.W(8);
        U1.y yVar2 = new U1.y(new y.b[0]);
        while (yVar.a() >= 8) {
            int iF = yVar.f();
            int iQ = yVar.q();
            int iQ2 = yVar.q();
            if (iQ2 == 1835365473) {
                yVar.W(iF);
                yVar2 = yVar2.b(F(yVar, iF + iQ));
            } else if (iQ2 == 1936553057) {
                yVar.W(iF);
                yVar2 = yVar2.b(q.b(yVar, iF + iQ));
            } else if (iQ2 == -1451722374) {
                yVar2 = yVar2.b(I(yVar));
            }
            yVar.W(iF + iQ);
        }
        return yVar2;
    }

    private static U1.y F(X1.y yVar, int i10) {
        yVar.X(8);
        e(yVar);
        while (yVar.f() < i10) {
            int iF = yVar.f();
            int iQ = yVar.q();
            if (yVar.q() == 1768715124) {
                yVar.W(iF);
                return o(yVar, iF + iQ);
            }
            yVar.W(iF + iQ);
        }
        return null;
    }

    static k G(X1.y yVar, int i10, int i11) throws ParserException {
        yVar.W(i10 + 8);
        int iF = yVar.f();
        c cVarY = null;
        while (iF - i10 < i11) {
            yVar.W(iF);
            int iQ = yVar.q();
            C4812s.a(iQ > 0, "childAtomSize must be positive");
            if (yVar.q() == 1702454643) {
                cVarY = y(yVar, iF, iQ);
            }
            iF += iQ;
        }
        if (cVarY == null) {
            return null;
        }
        return new k(cVarY);
    }

    private static void H(X1.y yVar, int i10, int i11, int i12, int i13, int i14, C1738n c1738n, g gVar, int i15) throws ParserException {
        String str;
        C1738n c1738n2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f10;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25 = i11;
        int i26 = i12;
        C1738n c1738nC = c1738n;
        g gVar2 = gVar;
        yVar.W(i25 + 16);
        yVar.X(16);
        int iP = yVar.P();
        int iP2 = yVar.P();
        yVar.X(50);
        int iF = yVar.f();
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair<Integer, t> pairV = v(yVar, i25, i26);
            if (pairV != null) {
                iIntValue = ((Integer) pairV.first).intValue();
                c1738nC = c1738nC == null ? null : c1738nC.c(((t) pairV.second).f13886b);
                gVar2.f13734a[i15] = (t) pairV.second;
            }
            yVar.W(iF);
        }
        String str2 = "video/3gpp";
        String str3 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        float fT = 1.0f;
        int i27 = 8;
        int i28 = 8;
        List<byte[]> listH = null;
        String str4 = null;
        byte[] bArrU = null;
        int i29 = -1;
        int i30 = -1;
        int i31 = -1;
        int i32 = -1;
        int iK = -1;
        ByteBuffer byteBufferA = null;
        C0205b c0205bJ = null;
        e.k kVar = null;
        boolean z10 = false;
        while (iF - i25 < i26) {
            yVar.W(iF);
            int iF2 = yVar.f();
            int iQ = yVar.q();
            if (iQ == 0) {
                str = str2;
                if (yVar.f() - i25 == i26) {
                    break;
                }
            } else {
                str = str2;
            }
            C4812s.a(iQ > 0, "childAtomSize must be positive");
            int iQ2 = yVar.q();
            if (iQ2 == 1635148611) {
                C4812s.a(str3 == null, null);
                yVar.W(iF2 + 8);
                C4798d c4798dB = C4798d.b(yVar);
                List<byte[]> list = c4798dB.f51127a;
                gVar2.f13736c = c4798dB.f51128b;
                if (!z10) {
                    fT = c4798dB.f51137k;
                }
                String str5 = c4798dB.f51138l;
                int i33 = c4798dB.f51136j;
                int i34 = c4798dB.f51133g;
                c1738n2 = c1738nC;
                i18 = iP2;
                i19 = iIntValue;
                i30 = i33;
                i32 = c4798dB.f51134h;
                iK = c4798dB.f51135i;
                i27 = c4798dB.f51131e;
                listH = list;
                str3 = "video/avc";
                str4 = str5;
                i16 = i34;
                i28 = c4798dB.f51132f;
            } else {
                if (iQ2 == 1752589123) {
                    C4812s.a(str3 == null, null);
                    yVar.W(iF2 + 8);
                    C cA = C.a(yVar);
                    List<byte[]> list2 = cA.f51016a;
                    gVar2.f13736c = cA.f51017b;
                    if (!z10) {
                        fT = cA.f51026k;
                    }
                    int i35 = cA.f51027l;
                    String str6 = cA.f51028m;
                    int i36 = cA.f51025j;
                    if (i36 != -1) {
                        i29 = i36;
                    }
                    int i37 = cA.f51022g;
                    int i38 = cA.f51023h;
                    listH = list2;
                    int i39 = cA.f51024i;
                    int i40 = cA.f51020e;
                    int i41 = cA.f51021f;
                    kVar = cA.f51029n;
                    c1738n2 = c1738nC;
                    i18 = iP2;
                    i19 = iIntValue;
                    i32 = i38;
                    iK = i39;
                    i27 = i40;
                    i30 = i35;
                    str3 = "video/hevc";
                    str4 = str6;
                    i16 = i37;
                    i28 = i41;
                } else {
                    c1738n2 = c1738nC;
                    if (iQ2 == 1818785347) {
                        C4812s.a("video/hevc".equals(str3), "lhvC must follow hvcC atom");
                        e.k kVar2 = kVar;
                        C4812s.a(kVar2 != null && kVar2.f19278b.size() >= 2, "must have at least two layers");
                        yVar.W(iF2 + 8);
                        C c10 = C.c(yVar, (e.k) C1804a.e(kVar2));
                        C4812s.a(gVar2.f13736c == c10.f51017b, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i42 = c10.f51022g;
                        i16 = i31;
                        if (i42 != -1) {
                            C4812s.a(i16 == i42, "colorSpace must be the same for both views");
                        }
                        int i43 = c10.f51023h;
                        int i44 = i32;
                        if (i43 != -1) {
                            C4812s.a(i44 == i43, "colorRange must be the same for both views");
                        }
                        int i45 = c10.f51024i;
                        if (i45 != -1) {
                            int i46 = iK;
                            i24 = i46;
                            C4812s.a(i46 == i45, "colorTransfer must be the same for both views");
                        } else {
                            i24 = iK;
                        }
                        C4812s.a(i27 == c10.f51020e, "bitdepthLuma must be the same for both views");
                        C4812s.a(i28 == c10.f51021f, "bitdepthChroma must be the same for both views");
                        List<byte[]> list3 = listH;
                        if (list3 != null) {
                            listH = AbstractC4009y.y().j(list3).j(c10.f51016a).k();
                        } else {
                            listH = list3;
                            C4812s.a(false, "initializationData must be already set from hvcC atom");
                        }
                        kVar = kVar2;
                        str3 = "video/mv-hevc";
                        i18 = iP2;
                        i19 = iIntValue;
                        i32 = i44;
                        iK = i24;
                        str4 = c10.f51028m;
                    } else {
                        List<byte[]> listH2 = listH;
                        i16 = i31;
                        int i47 = i32;
                        int i48 = iK;
                        e.k kVar3 = kVar;
                        if (iQ2 == 1986361461) {
                            k kVarG = G(yVar, iF2, iQ);
                            if (kVarG == null || kVarG.f13749a == null) {
                                i23 = i29;
                                i29 = i23;
                                kVar = kVar3;
                                i18 = iP2;
                                i19 = iIntValue;
                                listH = listH2;
                                i32 = i47;
                                iK = i48;
                            } else if (kVar3 == null || kVar3.f19278b.size() < 2) {
                                i23 = i29;
                                if (i23 == -1) {
                                    i29 = kVarG.f13749a.f13726a.f13732c ? 5 : 4;
                                } else {
                                    i29 = i23;
                                }
                                kVar = kVar3;
                                i18 = iP2;
                                i19 = iIntValue;
                                listH = listH2;
                                i32 = i47;
                                iK = i48;
                            } else {
                                C4812s.a(kVarG.b(), "both eye views must be marked as available");
                                C4812s.a(!kVarG.f13749a.f13726a.f13732c, "for MV-HEVC, eye_views_reversed must be set to false");
                                i23 = i29;
                                i29 = i23;
                                kVar = kVar3;
                                i18 = iP2;
                                i19 = iIntValue;
                                listH = listH2;
                                i32 = i47;
                                iK = i48;
                            }
                            iF += iQ;
                            i25 = i11;
                            i26 = i12;
                            gVar2 = gVar;
                            iIntValue = i19;
                            c1738nC = c1738n2;
                            iP2 = i18;
                            i31 = i16;
                            str2 = str;
                        } else {
                            int i49 = i29;
                            if (iQ2 == 1685480259 || iQ2 == 1685485123) {
                                i17 = i49;
                                i18 = iP2;
                                i19 = iIntValue;
                                i20 = i28;
                                f10 = fT;
                                i21 = i27;
                                i22 = i48;
                                C4808n c4808nA = C4808n.a(yVar);
                                if (c4808nA != null) {
                                    str3 = "video/dolby-vision";
                                    str4 = c4808nA.f51207c;
                                }
                            } else {
                                if (iQ2 == 1987076931) {
                                    C4812s.a(str3 == null, null);
                                    String str7 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                    yVar.W(iF2 + 12);
                                    byte bH = (byte) yVar.H();
                                    byte bH2 = (byte) yVar.H();
                                    int iH = yVar.H();
                                    i28 = iH >> 4;
                                    byte b10 = (byte) ((iH >> 1) & 7);
                                    if (str7.equals("video/x-vnd.on2.vp9")) {
                                        listH2 = C1808e.h(bH, bH2, (byte) i28, b10);
                                    }
                                    boolean z11 = (iH & 1) != 0;
                                    int iH2 = yVar.H();
                                    int iH3 = yVar.H();
                                    int iJ = C1733i.j(iH2);
                                    i32 = z11 ? 1 : 2;
                                    iK = C1733i.k(iH3);
                                    str3 = str7;
                                    i18 = iP2;
                                    i27 = i28;
                                    kVar = kVar3;
                                    i16 = iJ;
                                    listH = listH2;
                                    i29 = i49;
                                    i19 = iIntValue;
                                } else if (iQ2 == 1635135811) {
                                    int i50 = iQ - 8;
                                    byte[] bArr = new byte[i50];
                                    yVar.l(bArr, 0, i50);
                                    listH = AbstractC4009y.H(bArr);
                                    yVar.W(iF2 + 8);
                                    C1733i c1733iG = g(yVar);
                                    int i51 = c1733iG.f17064e;
                                    int i52 = c1733iG.f17065f;
                                    int i53 = c1733iG.f17060a;
                                    int i54 = c1733iG.f17061b;
                                    iK = c1733iG.f17062c;
                                    i18 = iP2;
                                    i19 = iIntValue;
                                    i32 = i54;
                                    str3 = "video/av01";
                                    kVar = kVar3;
                                    i27 = i51;
                                    i29 = i49;
                                    i28 = i52;
                                    i16 = i53;
                                } else if (iQ2 == 1668050025) {
                                    if (byteBufferA == null) {
                                        byteBufferA = a();
                                    }
                                    ByteBuffer byteBuffer = byteBufferA;
                                    byteBuffer.position(21);
                                    byteBuffer.putShort(yVar.D());
                                    byteBuffer.putShort(yVar.D());
                                    byteBufferA = byteBuffer;
                                    i18 = iP2;
                                    i19 = iIntValue;
                                    kVar = kVar3;
                                    listH = listH2;
                                    i32 = i47;
                                    iK = i48;
                                    i29 = i49;
                                } else {
                                    if (iQ2 == 1835295606) {
                                        if (byteBufferA == null) {
                                            byteBufferA = a();
                                        }
                                        ByteBuffer byteBuffer2 = byteBufferA;
                                        short sD = yVar.D();
                                        short sD2 = yVar.D();
                                        i19 = iIntValue;
                                        short sD3 = yVar.D();
                                        short sD4 = yVar.D();
                                        int i55 = i28;
                                        short sD5 = yVar.D();
                                        int i56 = i27;
                                        short sD6 = yVar.D();
                                        i17 = i49;
                                        short sD7 = yVar.D();
                                        float f11 = fT;
                                        short sD8 = yVar.D();
                                        long J10 = yVar.J();
                                        long J11 = yVar.J();
                                        i18 = iP2;
                                        byteBuffer2.position(1);
                                        byteBuffer2.putShort(sD5);
                                        byteBuffer2.putShort(sD6);
                                        byteBuffer2.putShort(sD);
                                        byteBuffer2.putShort(sD2);
                                        byteBuffer2.putShort(sD3);
                                        byteBuffer2.putShort(sD4);
                                        byteBuffer2.putShort(sD7);
                                        byteBuffer2.putShort(sD8);
                                        byteBuffer2.putShort((short) (J10 / 10000));
                                        byteBuffer2.putShort((short) (J11 / 10000));
                                        byteBufferA = byteBuffer2;
                                        i28 = i55;
                                        i27 = i56;
                                        listH = listH2;
                                        i32 = i47;
                                        iK = i48;
                                        fT = f11;
                                    } else {
                                        i17 = i49;
                                        i18 = iP2;
                                        i19 = iIntValue;
                                        i20 = i28;
                                        f10 = fT;
                                        i21 = i27;
                                        if (iQ2 == 1681012275) {
                                            C4812s.a(str3 == null, null);
                                            str3 = str;
                                        } else if (iQ2 == 1702061171) {
                                            C4812s.a(str3 == null, null);
                                            c0205bJ = j(yVar, iF2);
                                            String str8 = c0205bJ.f13722a;
                                            byte[] bArr2 = c0205bJ.f13723b;
                                            listH = bArr2 != null ? AbstractC4009y.H(bArr2) : listH2;
                                            str3 = str8;
                                            i28 = i20;
                                            i27 = i21;
                                            i32 = i47;
                                            iK = i48;
                                            fT = f10;
                                        } else if (iQ2 == 1885434736) {
                                            fT = t(yVar, iF2);
                                            i28 = i20;
                                            i27 = i21;
                                            listH = listH2;
                                            i32 = i47;
                                            iK = i48;
                                            z10 = true;
                                        } else if (iQ2 == 1937126244) {
                                            bArrU = u(yVar, iF2, iQ);
                                        } else if (iQ2 == 1936995172) {
                                            int iH4 = yVar.H();
                                            yVar.X(3);
                                            if (iH4 == 0) {
                                                int iH5 = yVar.H();
                                                if (iH5 == 0) {
                                                    i17 = 0;
                                                } else if (iH5 == 1) {
                                                    i17 = 1;
                                                } else if (iH5 == 2) {
                                                    i17 = 2;
                                                } else if (iH5 == 3) {
                                                    i17 = 3;
                                                }
                                            }
                                        } else if (iQ2 == 1668246642) {
                                            i22 = i48;
                                            if (i16 == -1 && i22 == -1) {
                                                int iQ3 = yVar.q();
                                                if (iQ3 == 1852009592 || iQ3 == 1852009571) {
                                                    int iP3 = yVar.P();
                                                    int iP4 = yVar.P();
                                                    yVar.X(2);
                                                    boolean z12 = iQ == 19 && (yVar.H() & 128) != 0;
                                                    int iJ2 = C1733i.j(iP3);
                                                    int i57 = z12 ? 1 : 2;
                                                    i16 = iJ2;
                                                    i28 = i20;
                                                    i27 = i21;
                                                    listH = listH2;
                                                    fT = f10;
                                                    iK = C1733i.k(iP4);
                                                    i32 = i57;
                                                } else {
                                                    X1.n.h("BoxParsers", "Unsupported color type: " + Y1.b.a(iQ3));
                                                }
                                            }
                                        } else {
                                            i22 = i48;
                                        }
                                        i28 = i20;
                                        i27 = i21;
                                        listH = listH2;
                                        i32 = i47;
                                        iK = i48;
                                        fT = f10;
                                    }
                                    int i58 = i17;
                                    kVar = kVar3;
                                    i29 = i58;
                                }
                                iF += iQ;
                                i25 = i11;
                                i26 = i12;
                                gVar2 = gVar;
                                iIntValue = i19;
                                c1738nC = c1738n2;
                                iP2 = i18;
                                i31 = i16;
                                str2 = str;
                            }
                            i28 = i20;
                            i27 = i21;
                            listH = listH2;
                            i32 = i47;
                            fT = f10;
                            iK = i22;
                            int i582 = i17;
                            kVar = kVar3;
                            i29 = i582;
                            iF += iQ;
                            i25 = i11;
                            i26 = i12;
                            gVar2 = gVar;
                            iIntValue = i19;
                            c1738nC = c1738n2;
                            iP2 = i18;
                            i31 = i16;
                            str2 = str;
                        }
                    }
                }
                iF += iQ;
                i25 = i11;
                i26 = i12;
                gVar2 = gVar;
                iIntValue = i19;
                c1738nC = c1738n2;
                iP2 = i18;
                i31 = i16;
                str2 = str;
            }
            iF += iQ;
            i25 = i11;
            i26 = i12;
            gVar2 = gVar;
            iIntValue = i19;
            c1738nC = c1738n2;
            iP2 = i18;
            i31 = i16;
            str2 = str;
        }
        C1738n c1738n3 = c1738nC;
        int i59 = iP2;
        float f12 = fT;
        List<byte[]> list4 = listH;
        int i60 = i29;
        int i61 = i31;
        int i62 = i32;
        int i63 = iK;
        int i64 = i28;
        int i65 = i27;
        if (str3 == null) {
            return;
        }
        s.b bVarS = new s.b().d0(i13).s0(str3).R(str4).z0(iP).c0(i59).o0(f12).r0(i14).p0(bArrU).v0(i60).f0(list4).k0(i30).X(c1738n3).S(new C1733i.b().d(i61).c(i62).e(i63).f(byteBufferA != null ? byteBufferA.array() : null).g(i65).b(i64).a());
        if (c0205bJ != null) {
            bVarS.P(p8.f.k(c0205bJ.f13724c)).n0(p8.f.k(c0205bJ.f13725d));
        }
        gVar.f13735b = bVarS.M();
    }

    private static U1.y I(X1.y yVar) {
        short sD = yVar.D();
        yVar.X(2);
        String strE = yVar.E(sD);
        int iMax = Math.max(strE.lastIndexOf(43), strE.lastIndexOf(45));
        try {
            return new U1.y(new Y1.c(Float.parseFloat(strE.substring(0, iMax)), Float.parseFloat(strE.substring(iMax, strE.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[L.p(4, 0, length)] && jArr[L.p(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    private static int c(X1.y yVar, int i10, int i11, int i12) throws ParserException {
        int iF = yVar.f();
        C4812s.a(iF >= i11, null);
        while (iF - i11 < i12) {
            yVar.W(iF);
            int iQ = yVar.q();
            C4812s.a(iQ > 0, "childAtomSize must be positive");
            if (yVar.q() == i10) {
                return iF;
            }
            iF += iQ;
        }
        return -1;
    }

    private static int d(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void e(X1.y yVar) {
        int iF = yVar.f();
        yVar.X(4);
        if (yVar.q() != 1751411826) {
            iF += 4;
        }
        yVar.W(iF);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(X1.y r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, U1.C1738n r33, P2.b.g r34, int r35) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1151
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.b.f(X1.y, int, int, int, int, java.lang.String, boolean, U1.n, P2.b$g, int):void");
    }

    private static C1733i g(X1.y yVar) {
        C1733i.b bVar = new C1733i.b();
        x xVar = new x(yVar.e());
        xVar.p(yVar.f() * 8);
        xVar.s(1);
        int iH = xVar.h(3);
        xVar.r(6);
        boolean zG = xVar.g();
        boolean zG2 = xVar.g();
        if (iH == 2 && zG) {
            bVar.g(zG2 ? 12 : 10);
            bVar.b(zG2 ? 12 : 10);
        } else if (iH <= 2) {
            bVar.g(zG ? 10 : 8);
            bVar.b(zG ? 10 : 8);
        }
        xVar.r(13);
        xVar.q();
        int iH2 = xVar.h(4);
        if (iH2 != 1) {
            X1.n.f("BoxParsers", "Unsupported obu_type: " + iH2);
            return bVar.a();
        }
        if (xVar.g()) {
            X1.n.f("BoxParsers", "Unsupported obu_extension_flag");
            return bVar.a();
        }
        boolean zG3 = xVar.g();
        xVar.q();
        if (zG3 && xVar.h(8) > 127) {
            X1.n.f("BoxParsers", "Excessive obu_size");
            return bVar.a();
        }
        int iH3 = xVar.h(3);
        xVar.q();
        if (xVar.g()) {
            X1.n.f("BoxParsers", "Unsupported reduced_still_picture_header");
            return bVar.a();
        }
        if (xVar.g()) {
            X1.n.f("BoxParsers", "Unsupported timing_info_present_flag");
            return bVar.a();
        }
        if (xVar.g()) {
            X1.n.f("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return bVar.a();
        }
        int iH4 = xVar.h(5);
        boolean z10 = false;
        for (int i10 = 0; i10 <= iH4; i10++) {
            xVar.r(12);
            if (xVar.h(5) > 7) {
                xVar.q();
            }
        }
        int iH5 = xVar.h(4);
        int iH6 = xVar.h(4);
        xVar.r(iH5 + 1);
        xVar.r(iH6 + 1);
        if (xVar.g()) {
            xVar.r(7);
        }
        xVar.r(7);
        boolean zG4 = xVar.g();
        if (zG4) {
            xVar.r(2);
        }
        if ((xVar.g() ? 2 : xVar.h(1)) > 0 && !xVar.g()) {
            xVar.r(1);
        }
        if (zG4) {
            xVar.r(3);
        }
        xVar.r(3);
        boolean zG5 = xVar.g();
        if (iH3 == 2 && zG5) {
            xVar.q();
        }
        if (iH3 != 1 && xVar.g()) {
            z10 = true;
        }
        if (xVar.g()) {
            int iH7 = xVar.h(8);
            int iH8 = xVar.h(8);
            bVar.d(C1733i.j(iH7)).c(((z10 || iH7 != 1 || iH8 != 13 || xVar.h(8) != 0) ? xVar.h(1) : 1) != 1 ? 2 : 1).e(C1733i.k(iH8));
        }
        return bVar.a();
    }

    static Pair<Integer, t> h(X1.y yVar, int i10, int i11) throws ParserException {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String strE = null;
        Integer numValueOf = null;
        while (i12 - i10 < i11) {
            yVar.W(i12);
            int iQ = yVar.q();
            int iQ2 = yVar.q();
            if (iQ2 == 1718775137) {
                numValueOf = Integer.valueOf(yVar.q());
            } else if (iQ2 == 1935894637) {
                yVar.X(4);
                strE = yVar.E(4);
            } else if (iQ2 == 1935894633) {
                i13 = i12;
                i14 = iQ;
            }
            i12 += iQ;
        }
        if (!"cenc".equals(strE) && !"cbc1".equals(strE) && !"cens".equals(strE) && !"cbcs".equals(strE)) {
            return null;
        }
        C4812s.a(numValueOf != null, "frma atom is mandatory");
        C4812s.a(i13 != -1, "schi atom is mandatory");
        t tVarW = w(yVar, i13, i14, strE);
        C4812s.a(tVarW != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (t) L.i(tVarW));
    }

    private static Pair<long[], long[]> i(b.C0281b c0281b) {
        b.c cVarE = c0281b.e(1701606260);
        if (cVarE == null) {
            return null;
        }
        X1.y yVar = cVarE.f19220b;
        yVar.W(8);
        int iM = m(yVar.q());
        int iL = yVar.L();
        long[] jArr = new long[iL];
        long[] jArr2 = new long[iL];
        for (int i10 = 0; i10 < iL; i10++) {
            jArr[i10] = iM == 1 ? yVar.O() : yVar.J();
            jArr2[i10] = iM == 1 ? yVar.A() : yVar.q();
            if (yVar.D() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            yVar.X(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static C0205b j(X1.y yVar, int i10) {
        yVar.W(i10 + 12);
        yVar.X(1);
        k(yVar);
        yVar.X(2);
        int iH = yVar.H();
        if ((iH & 128) != 0) {
            yVar.X(2);
        }
        if ((iH & 64) != 0) {
            yVar.X(yVar.H());
        }
        if ((iH & 32) != 0) {
            yVar.X(2);
        }
        yVar.X(1);
        k(yVar);
        String strH = z.h(yVar.H());
        if ("audio/mpeg".equals(strH) || "audio/vnd.dts".equals(strH) || "audio/vnd.dts.hd".equals(strH)) {
            return new C0205b(strH, null, -1L, -1L);
        }
        yVar.X(4);
        long J10 = yVar.J();
        long J11 = yVar.J();
        yVar.X(1);
        int iK = k(yVar);
        byte[] bArr = new byte[iK];
        yVar.l(bArr, 0, iK);
        return new C0205b(strH, bArr, J11 > 0 ? J11 : -1L, J10 > 0 ? J10 : -1L);
    }

    private static int k(X1.y yVar) {
        int iH = yVar.H();
        int i10 = iH & 127;
        while ((iH & 128) == 128) {
            iH = yVar.H();
            i10 = (i10 << 7) | (iH & 127);
        }
        return i10;
    }

    public static int l(int i10) {
        return i10 & 16777215;
    }

    public static int m(int i10) {
        return (i10 >> 24) & 255;
    }

    private static int n(X1.y yVar) {
        yVar.W(16);
        return yVar.q();
    }

    private static U1.y o(X1.y yVar, int i10) {
        yVar.X(8);
        ArrayList arrayList = new ArrayList();
        while (yVar.f() < i10) {
            y.b bVarD = P2.j.d(yVar);
            if (bVarD != null) {
                arrayList.add(bVarD);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new U1.y(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r6 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static P2.b.d p(X1.y r11) {
        /*
            r0 = 8
            r11.W(r0)
            int r1 = r11.q()
            int r1 = m(r1)
            if (r1 != 0) goto L11
            r2 = r0
            goto L13
        L11:
            r2 = 16
        L13:
            r11.X(r2)
            long r9 = r11.J()
            int r2 = r11.f()
            if (r1 != 0) goto L21
            r0 = 4
        L21:
            r3 = 0
        L22:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 >= r0) goto L55
            byte[] r6 = r11.e()
            int r7 = r2 + r3
            r6 = r6[r7]
            r7 = -1
            if (r6 == r7) goto L52
            if (r1 != 0) goto L3b
            long r0 = r11.J()
            goto L3f
        L3b:
            long r0 = r11.O()
        L3f:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L47
        L45:
            r6 = r4
            goto L59
        L47:
            r5 = 1000000(0xf4240, double:4.940656E-318)
            r3 = r0
            r7 = r9
            long r0 = X1.L.d1(r3, r5, r7)
            r6 = r0
            goto L59
        L52:
            int r3 = r3 + 1
            goto L22
        L55:
            r11.X(r0)
            goto L45
        L59:
            int r11 = r11.P()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            int r1 = r11 >> 10
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            r0.append(r1)
            int r1 = r11 >> 5
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            r0.append(r1)
            r11 = r11 & 31
            int r11 = r11 + 96
            char r11 = (char) r11
            r0.append(r11)
            java.lang.String r8 = r0.toString()
            P2.b$d r11 = new P2.b$d
            r3 = r11
            r4 = r9
            r3.<init>(r4, r6, r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.b.p(X1.y):P2.b$d");
    }

    public static U1.y q(b.C0281b c0281b) {
        b.c cVarE = c0281b.e(1751411826);
        b.c cVarE2 = c0281b.e(1801812339);
        b.c cVarE3 = c0281b.e(1768715124);
        if (cVarE == null || cVarE2 == null || cVarE3 == null || n(cVarE.f19220b) != 1835299937) {
            return null;
        }
        X1.y yVar = cVarE2.f19220b;
        yVar.W(12);
        int iQ = yVar.q();
        String[] strArr = new String[iQ];
        for (int i10 = 0; i10 < iQ; i10++) {
            int iQ2 = yVar.q();
            yVar.X(4);
            strArr[i10] = yVar.E(iQ2 - 8);
        }
        X1.y yVar2 = cVarE3.f19220b;
        yVar2.W(8);
        ArrayList arrayList = new ArrayList();
        while (yVar2.a() > 8) {
            int iF = yVar2.f();
            int iQ3 = yVar2.q();
            int iQ4 = yVar2.q() - 1;
            if (iQ4 < 0 || iQ4 >= iQ) {
                X1.n.h("BoxParsers", "Skipped metadata with unknown key index: " + iQ4);
            } else {
                Y1.a aVarI = P2.j.i(yVar2, iF + iQ3, strArr[iQ4]);
                if (aVarI != null) {
                    arrayList.add(aVarI);
                }
            }
            yVar2.W(iF + iQ3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new U1.y(arrayList);
    }

    private static void r(X1.y yVar, int i10, int i11, int i12, g gVar) {
        yVar.W(i11 + 16);
        if (i10 == 1835365492) {
            yVar.B();
            String strB = yVar.B();
            if (strB != null) {
                gVar.f13735b = new s.b().d0(i12).s0(strB).M();
            }
        }
    }

    public static Y1.d s(X1.y yVar) {
        long jA;
        long jA2;
        yVar.W(8);
        if (m(yVar.q()) == 0) {
            jA = yVar.J();
            jA2 = yVar.J();
        } else {
            jA = yVar.A();
            jA2 = yVar.A();
        }
        return new Y1.d(jA, jA2, yVar.J());
    }

    private static float t(X1.y yVar, int i10) {
        yVar.W(i10 + 8);
        return yVar.L() / yVar.L();
    }

    private static byte[] u(X1.y yVar, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            yVar.W(i12);
            int iQ = yVar.q();
            if (yVar.q() == 1886547818) {
                return Arrays.copyOfRange(yVar.e(), i12, iQ + i12);
            }
            i12 += iQ;
        }
        return null;
    }

    private static Pair<Integer, t> v(X1.y yVar, int i10, int i11) throws ParserException {
        Pair<Integer, t> pairH;
        int iF = yVar.f();
        while (iF - i10 < i11) {
            yVar.W(iF);
            int iQ = yVar.q();
            C4812s.a(iQ > 0, "childAtomSize must be positive");
            if (yVar.q() == 1936289382 && (pairH = h(yVar, iF, iQ)) != null) {
                return pairH;
            }
            iF += iQ;
        }
        return null;
    }

    private static t w(X1.y yVar, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            yVar.W(i14);
            int iQ = yVar.q();
            if (yVar.q() == 1952804451) {
                int iM = m(yVar.q());
                yVar.X(1);
                if (iM == 0) {
                    yVar.X(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int iH = yVar.H();
                    i12 = iH & 15;
                    i13 = (iH & 240) >> 4;
                }
                boolean z10 = yVar.H() == 1;
                int iH2 = yVar.H();
                byte[] bArr2 = new byte[16];
                yVar.l(bArr2, 0, 16);
                if (z10 && iH2 == 0) {
                    int iH3 = yVar.H();
                    bArr = new byte[iH3];
                    yVar.l(bArr, 0, iH3);
                }
                return new t(z10, str, iH2, bArr2, i13, i12, bArr);
            }
            i14 += iQ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static P2.v x(P2.s r39, Y1.b.C0281b r40, v2.B r41) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.b.x(P2.s, Y1.b$b, v2.B):P2.v");
    }

    private static c y(X1.y yVar, int i10, int i11) throws ParserException {
        yVar.W(i10 + 8);
        int iF = yVar.f();
        while (iF - i10 < i11) {
            yVar.W(iF);
            int iQ = yVar.q();
            C4812s.a(iQ > 0, "childAtomSize must be positive");
            if (yVar.q() == 1937011305) {
                yVar.X(4);
                int iH = yVar.H();
                return new c(new f((iH & 1) == 1, (iH & 2) == 2, (iH & 8) == 8, (iH & 4) == 4));
            }
            iF += iQ;
        }
        return null;
    }

    private static g z(X1.y yVar, int i10, int i11, String str, C1738n c1738n, boolean z10) throws ParserException {
        int i12;
        yVar.W(12);
        int iQ = yVar.q();
        g gVar = new g(iQ);
        for (int i13 = 0; i13 < iQ; i13++) {
            int iF = yVar.f();
            int iQ2 = yVar.q();
            C4812s.a(iQ2 > 0, "childAtomSize must be positive");
            int iQ3 = yVar.q();
            if (iQ3 == 1635148593 || iQ3 == 1635148595 || iQ3 == 1701733238 || iQ3 == 1831958048 || iQ3 == 1836070006 || iQ3 == 1752589105 || iQ3 == 1751479857 || iQ3 == 1932670515 || iQ3 == 1211250227 || iQ3 == 1748121139 || iQ3 == 1987063864 || iQ3 == 1987063865 || iQ3 == 1635135537 || iQ3 == 1685479798 || iQ3 == 1685479729 || iQ3 == 1685481573 || iQ3 == 1685481521) {
                i12 = iF;
                H(yVar, iQ3, i12, iQ2, i10, i11, c1738n, gVar, i13);
            } else if (iQ3 == 1836069985 || iQ3 == 1701733217 || iQ3 == 1633889587 || iQ3 == 1700998451 || iQ3 == 1633889588 || iQ3 == 1835823201 || iQ3 == 1685353315 || iQ3 == 1685353317 || iQ3 == 1685353320 || iQ3 == 1685353324 || iQ3 == 1685353336 || iQ3 == 1935764850 || iQ3 == 1935767394 || iQ3 == 1819304813 || iQ3 == 1936684916 || iQ3 == 1953984371 || iQ3 == 778924082 || iQ3 == 778924083 || iQ3 == 1835557169 || iQ3 == 1835560241 || iQ3 == 1634492771 || iQ3 == 1634492791 || iQ3 == 1970037111 || iQ3 == 1332770163 || iQ3 == 1716281667 || iQ3 == 1767992678) {
                i12 = iF;
                f(yVar, iQ3, iF, iQ2, i10, str, z10, c1738n, gVar, i13);
            } else {
                if (iQ3 == 1414810956 || iQ3 == 1954034535 || iQ3 == 2004251764 || iQ3 == 1937010800 || iQ3 == 1664495672) {
                    A(yVar, iQ3, iF, iQ2, i10, str, gVar);
                } else if (iQ3 == 1835365492) {
                    r(yVar, iQ3, iF, i10, gVar);
                } else if (iQ3 == 1667329389) {
                    gVar.f13735b = new s.b().d0(i10).s0("application/x-camera-motion").M();
                }
                i12 = iF;
            }
            yVar.W(i12 + iQ2);
        }
        return gVar;
    }
}
