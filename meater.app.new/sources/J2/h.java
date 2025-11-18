package J2;

import U1.z;
import X1.L;
import X1.x;
import X1.y;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import l8.C3910c;
import m8.AbstractC4009y;

/* compiled from: Id3Decoder.java */
/* loaded from: classes.dex */
public final class h extends E2.c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f7250b = new a() { // from class: J2.g
        @Override // J2.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return h.A(i10, i11, i12, i13, i14);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final a f7251a;

    /* compiled from: Id3Decoder.java */
    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    /* compiled from: Id3Decoder.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f7252a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f7253b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7254c;

        public b(int i10, boolean z10, int i11) {
            this.f7252a = i10;
            this.f7253b = z10;
            this.f7254c = i11;
        }
    }

    public h() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean A(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static int B(y yVar, int i10) {
        byte[] bArrE = yVar.e();
        int iF = yVar.f();
        int i11 = iF;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iF + i10) {
                return i10;
            }
            if ((bArrE[i11] & 255) == 255 && bArrE[i12] == 0) {
                System.arraycopy(bArrE, i11 + 2, bArrE, i12, (i10 - (i11 - iF)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[PHI: r3
      0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean C(X1.y r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.f()
        L8:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r18.q()     // Catch: java.lang.Throwable -> L22
            long r8 = r18.J()     // Catch: java.lang.Throwable -> L22
            int r10 = r18.P()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lb2
        L25:
            int r7 = r18.K()     // Catch: java.lang.Throwable -> L22
            int r8 = r18.K()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3d
            if (r10 != 0) goto L3d
            r1.W(r2)
            return r4
        L3d:
            r7 = 4
            if (r0 != r7) goto L6e
            if (r21 != 0) goto L6e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4e
            r1.W(r2)
            return r6
        L4e:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6e:
            if (r0 != r7) goto L7e
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r3 = r4
            goto L77
        L76:
            r3 = r6
        L77:
            r7 = r10 & 1
            if (r7 == 0) goto L7c
            goto L8e
        L7c:
            r4 = r6
            goto L8e
        L7e:
            if (r0 != r3) goto L8c
            r3 = r10 & 32
            if (r3 == 0) goto L86
            r3 = r4
            goto L87
        L86:
            r3 = r6
        L87:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L7c
            goto L8e
        L8c:
            r3 = r6
            r4 = r3
        L8e:
            if (r4 == 0) goto L92
            int r3 = r3 + 4
        L92:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9b
            r1.W(r2)
            return r6
        L9b:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La8
            r1.W(r2)
            return r6
        La8:
            int r3 = (int) r8
            r1.X(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        Lae:
            r1.W(r2)
            return r4
        Lb2:
            r1.W(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.h.C(X1.y, int, int, boolean):boolean");
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? L.f18631f : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static J2.a f(y yVar, int i10, int i11) {
        int iZ;
        String str;
        int iH = yVar.H();
        Charset charsetW = w(iH);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        yVar.l(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + C3910c.e(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iZ = 2;
        } else {
            iZ = z(bArr, 0);
            String strE = C3910c.e(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
            if (strE.indexOf(47) == -1) {
                str = "image/" + strE;
            } else {
                str = strE;
            }
        }
        int i13 = bArr[iZ + 1] & 255;
        int i14 = iZ + 2;
        int iY = y(bArr, i14, iH);
        return new J2.a(str, new String(bArr, i14, iY - i14, charsetW), i13, d(bArr, iY + v(iH), i12));
    }

    private static J2.b g(y yVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        yVar.l(bArr, 0, i10);
        return new J2.b(str, bArr);
    }

    private static c h(y yVar, int i10, int i11, boolean z10, int i12, a aVar) {
        int iF = yVar.f();
        int iZ = z(yVar.e(), iF);
        String str = new String(yVar.e(), iF, iZ - iF, StandardCharsets.ISO_8859_1);
        yVar.W(iZ + 1);
        int iQ = yVar.q();
        int iQ2 = yVar.q();
        long J10 = yVar.J();
        long j10 = J10 == 4294967295L ? -1L : J10;
        long J11 = yVar.J();
        long j11 = J11 == 4294967295L ? -1L : J11;
        ArrayList arrayList = new ArrayList();
        int i13 = iF + i10;
        while (yVar.f() < i13) {
            i iVarK = k(i11, yVar, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new c(str, iQ, iQ2, j10, j11, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(y yVar, int i10, int i11, boolean z10, int i12, a aVar) {
        int iF = yVar.f();
        int iZ = z(yVar.e(), iF);
        String str = new String(yVar.e(), iF, iZ - iF, StandardCharsets.ISO_8859_1);
        yVar.W(iZ + 1);
        int iH = yVar.H();
        boolean z11 = (iH & 2) != 0;
        boolean z12 = (iH & 1) != 0;
        int iH2 = yVar.H();
        String[] strArr = new String[iH2];
        for (int i13 = 0; i13 < iH2; i13++) {
            int iF2 = yVar.f();
            int iZ2 = z(yVar.e(), iF2);
            strArr[i13] = new String(yVar.e(), iF2, iZ2 - iF2, StandardCharsets.ISO_8859_1);
            yVar.W(iZ2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iF + i10;
        while (yVar.f() < i14) {
            i iVarK = k(i11, yVar, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(y yVar, int i10) {
        if (i10 < 4) {
            return null;
        }
        int iH = yVar.H();
        Charset charsetW = w(iH);
        byte[] bArr = new byte[3];
        yVar.l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        yVar.l(bArr2, 0, i11);
        int iY = y(bArr2, 0, iH);
        String str2 = new String(bArr2, 0, iY, charsetW);
        int iV = iY + v(iH);
        return new e(str, str2, p(bArr2, iV, y(bArr2, iV, iH), charsetW));
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ed A[Catch: all -> 0x011f, Exception -> 0x0122, OutOfMemoryError -> 0x0125, TRY_LEAVE, TryCatch #2 {Exception -> 0x0122, OutOfMemoryError -> 0x0125, all -> 0x011f, blocks: (B:91:0x0119, B:99:0x012a, B:106:0x0140, B:108:0x0148, B:116:0x0162, B:125:0x017a, B:136:0x0195, B:143:0x01a7, B:149:0x01b6, B:154:0x01ce, B:160:0x01e8, B:161:0x01ed), top: B:171:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static J2.i k(int r20, X1.y r21, boolean r22, int r23, J2.h.a r24) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.h.k(int, X1.y, boolean, int, J2.h$a):J2.i");
    }

    private static f l(y yVar, int i10) {
        int iH = yVar.H();
        Charset charsetW = w(iH);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        yVar.l(bArr, 0, i11);
        int iZ = z(bArr, 0);
        String strT = z.t(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
        int i12 = iZ + 1;
        int iY = y(bArr, i12, iH);
        String strP = p(bArr, i12, iY, charsetW);
        int iV = iY + v(iH);
        int iY2 = y(bArr, iV, iH);
        return new f(strT, strP, p(bArr, iV, iY2, charsetW), d(bArr, iY2 + v(iH), i11));
    }

    private static b m(y yVar) {
        if (yVar.a() < 10) {
            X1.n.h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iK = yVar.K();
        if (iK != 4801587) {
            X1.n.h("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iK)));
            return null;
        }
        int iH = yVar.H();
        yVar.X(1);
        int iH2 = yVar.H();
        int iG = yVar.G();
        if (iH == 2) {
            if ((iH2 & 64) != 0) {
                X1.n.h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iH == 3) {
            if ((iH2 & 64) != 0) {
                int iQ = yVar.q();
                yVar.X(iQ);
                iG -= iQ + 4;
            }
        } else {
            if (iH != 4) {
                X1.n.h("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iH);
                return null;
            }
            if ((iH2 & 64) != 0) {
                int iG2 = yVar.G();
                yVar.X(iG2 - 4);
                iG -= iG2;
            }
            if ((iH2 & 16) != 0) {
                iG -= 10;
            }
        }
        return new b(iH, iH < 4 && (iH2 & 128) != 0, iG);
    }

    private static l n(y yVar, int i10) {
        int iP = yVar.P();
        int iK = yVar.K();
        int iK2 = yVar.K();
        int iH = yVar.H();
        int iH2 = yVar.H();
        x xVar = new x();
        xVar.m(yVar);
        int i11 = ((i10 - 10) * 8) / (iH + iH2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iH3 = xVar.h(iH);
            int iH4 = xVar.h(iH2);
            iArr[i12] = iH3;
            iArr2[i12] = iH4;
        }
        return new l(iP, iK, iK2, iArr, iArr2);
    }

    private static m o(y yVar, int i10) {
        byte[] bArr = new byte[i10];
        yVar.l(bArr, 0, i10);
        int iZ = z(bArr, 0);
        return new m(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1), d(bArr, iZ + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    private static n q(y yVar, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int iH = yVar.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        yVar.l(bArr, 0, i11);
        return new n(str, null, r(bArr, iH, 0));
    }

    private static AbstractC4009y<String> r(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return AbstractC4009y.H("");
        }
        AbstractC4009y.a aVarY = AbstractC4009y.y();
        int iY = y(bArr, i11, i10);
        while (i11 < iY) {
            aVarY.a(new String(bArr, i11, iY - i11, w(i10)));
            i11 = v(i10) + iY;
            iY = y(bArr, i11, i10);
        }
        AbstractC4009y<String> abstractC4009yK = aVarY.k();
        return abstractC4009yK.isEmpty() ? AbstractC4009y.H("") : abstractC4009yK;
    }

    private static n s(y yVar, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iH = yVar.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        yVar.l(bArr, 0, i11);
        int iY = y(bArr, 0, iH);
        return new n("TXXX", new String(bArr, 0, iY, w(iH)), r(bArr, iH, iY + v(iH)));
    }

    private static o t(y yVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        yVar.l(bArr, 0, i10);
        return new o(str, null, new String(bArr, 0, z(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    private static o u(y yVar, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iH = yVar.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        yVar.l(bArr, 0, i11);
        int iY = y(bArr, 0, iH);
        String str = new String(bArr, 0, iY, w(iH));
        int iV = iY + v(iH);
        return new o("WXXX", str, p(bArr, iV, z(bArr, iV), StandardCharsets.ISO_8859_1));
    }

    private static int v(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static Charset w(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    private static String x(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int y(byte[] bArr, int i10, int i11) {
        int iZ = z(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iZ;
        }
        while (iZ < bArr.length - 1) {
            if ((iZ - i10) % 2 == 0 && bArr[iZ + 1] == 0) {
                return iZ;
            }
            iZ = z(bArr, iZ + 1);
        }
        return bArr.length;
    }

    private static int z(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    @Override // E2.c
    protected U1.y b(E2.b bVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public U1.y e(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        y yVar = new y(bArr, i10);
        b bVarM = m(yVar);
        if (bVarM == null) {
            return null;
        }
        int iF = yVar.f();
        int i11 = bVarM.f7252a == 2 ? 6 : 10;
        int iB = bVarM.f7254c;
        if (bVarM.f7253b) {
            iB = B(yVar, bVarM.f7254c);
        }
        yVar.V(iF + iB);
        boolean z10 = false;
        if (!C(yVar, bVarM.f7252a, i11, false)) {
            if (bVarM.f7252a != 4 || !C(yVar, 4, i11, true)) {
                X1.n.h("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarM.f7252a);
                return null;
            }
            z10 = true;
        }
        while (yVar.a() >= i11) {
            i iVarK = k(bVarM.f7252a, yVar, z10, i11, this.f7251a);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new U1.y(arrayList);
    }

    public h(a aVar) {
        this.f7251a = aVar;
    }
}
