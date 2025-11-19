package v2;

import U1.C1738n;
import U1.s;
import java.nio.ByteBuffer;

/* compiled from: Ac3Util.java */
/* renamed from: v2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4796b {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f51102a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f51103b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f51104c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f51105d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f51106e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f51107f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* compiled from: Ac3Util.java */
    /* renamed from: v2.b$b, reason: collision with other inner class name */
    public static final class C0731b {

        /* renamed from: a, reason: collision with root package name */
        public final String f51108a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51109b;

        /* renamed from: c, reason: collision with root package name */
        public final int f51110c;

        /* renamed from: d, reason: collision with root package name */
        public final int f51111d;

        /* renamed from: e, reason: collision with root package name */
        public final int f51112e;

        /* renamed from: f, reason: collision with root package name */
        public final int f51113f;

        /* renamed from: g, reason: collision with root package name */
        public final int f51114g;

        private C0731b(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f51108a = str;
            this.f51109b = i10;
            this.f51111d = i11;
            this.f51110c = i12;
            this.f51112e = i13;
            this.f51113f = i14;
            this.f51114g = i15;
        }
    }

    private static int a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((X1.L.P(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - iPosition;
            }
        }
        return -1;
    }

    private static int c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f51103b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f51107f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f51106e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static U1.s d(X1.y yVar, String str, String str2, C1738n c1738n) {
        X1.x xVar = new X1.x();
        xVar.m(yVar);
        int i10 = f51103b[xVar.h(2)];
        xVar.r(8);
        int i11 = f51105d[xVar.h(3)];
        if (xVar.h(1) != 0) {
            i11++;
        }
        int i12 = f51106e[xVar.h(5)] * 1000;
        xVar.c();
        yVar.W(xVar.d());
        return new s.b().e0(str).s0("audio/ac3").Q(i11).t0(i10).X(c1738n).i0(str2).P(i12).n0(i12).M();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f51102a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C0731b f(X1.x xVar) {
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iE = xVar.e();
        xVar.r(40);
        boolean z10 = xVar.h(5) > 10;
        xVar.p(iE);
        int i22 = -1;
        if (z10) {
            xVar.r(16);
            int iH = xVar.h(2);
            if (iH == 0) {
                i22 = 0;
            } else if (iH == 1) {
                i22 = 1;
            } else if (iH == 2) {
                i22 = 2;
            }
            xVar.r(3);
            int iH2 = (xVar.h(11) + 1) * 2;
            int iH3 = xVar.h(2);
            if (iH3 == 3) {
                i17 = f51104c[xVar.h(2)];
                i16 = 3;
                i18 = 6;
            } else {
                int iH4 = xVar.h(2);
                int i23 = f51102a[iH4];
                i16 = iH4;
                i17 = f51103b[iH3];
                i18 = i23;
            }
            int i24 = i18 * 256;
            int iA = a(iH2, i17, i18);
            int iH5 = xVar.h(3);
            boolean zG = xVar.g();
            i10 = f51105d[iH5] + (zG ? 1 : 0);
            xVar.r(10);
            if (xVar.g()) {
                xVar.r(8);
            }
            if (iH5 == 0) {
                xVar.r(5);
                if (xVar.g()) {
                    xVar.r(8);
                }
            }
            if (i22 == 1 && xVar.g()) {
                xVar.r(16);
            }
            if (xVar.g()) {
                if (iH5 > 2) {
                    xVar.r(2);
                }
                if ((iH5 & 1) == 0 || iH5 <= 2) {
                    i20 = 6;
                } else {
                    i20 = 6;
                    xVar.r(6);
                }
                if ((iH5 & 4) != 0) {
                    xVar.r(i20);
                }
                if (zG && xVar.g()) {
                    xVar.r(5);
                }
                if (i22 == 0) {
                    if (xVar.g()) {
                        i21 = 6;
                        xVar.r(6);
                    } else {
                        i21 = 6;
                    }
                    if (iH5 == 0 && xVar.g()) {
                        xVar.r(i21);
                    }
                    if (xVar.g()) {
                        xVar.r(i21);
                    }
                    int iH6 = xVar.h(2);
                    if (iH6 == 1) {
                        xVar.r(5);
                    } else if (iH6 == 2) {
                        xVar.r(12);
                    } else if (iH6 == 3) {
                        int iH7 = xVar.h(5);
                        if (xVar.g()) {
                            xVar.r(5);
                            if (xVar.g()) {
                                xVar.r(4);
                            }
                            if (xVar.g()) {
                                xVar.r(4);
                            }
                            if (xVar.g()) {
                                xVar.r(4);
                            }
                            if (xVar.g()) {
                                xVar.r(4);
                            }
                            if (xVar.g()) {
                                xVar.r(4);
                            }
                            if (xVar.g()) {
                                xVar.r(4);
                            }
                            if (xVar.g()) {
                                xVar.r(4);
                            }
                            if (xVar.g()) {
                                if (xVar.g()) {
                                    xVar.r(4);
                                }
                                if (xVar.g()) {
                                    xVar.r(4);
                                }
                            }
                        }
                        if (xVar.g()) {
                            xVar.r(5);
                            if (xVar.g()) {
                                xVar.r(7);
                                if (xVar.g()) {
                                    xVar.r(8);
                                }
                            }
                        }
                        xVar.r((iH7 + 2) * 8);
                        xVar.c();
                    }
                    if (iH5 < 2) {
                        if (xVar.g()) {
                            xVar.r(14);
                        }
                        if (iH5 == 0 && xVar.g()) {
                            xVar.r(14);
                        }
                    }
                    if (xVar.g()) {
                        if (i16 == 0) {
                            xVar.r(5);
                        } else {
                            for (int i25 = 0; i25 < i18; i25++) {
                                if (xVar.g()) {
                                    xVar.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (xVar.g()) {
                xVar.r(5);
                if (iH5 == 2) {
                    xVar.r(4);
                }
                if (iH5 >= 6) {
                    xVar.r(2);
                }
                if (xVar.g()) {
                    xVar.r(8);
                }
                if (iH5 == 0 && xVar.g()) {
                    xVar.r(8);
                }
                if (iH3 < 3) {
                    xVar.q();
                }
            }
            if (i22 == 0 && i16 != 3) {
                xVar.q();
            }
            if (i22 == 2 && (i16 == 3 || xVar.g())) {
                i19 = 6;
                xVar.r(6);
            } else {
                i19 = 6;
            }
            str = (xVar.g() && xVar.h(i19) == 1 && xVar.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i11 = i22;
            i12 = i24;
            i14 = iH2;
            i15 = i17;
            i13 = iA;
        } else {
            xVar.r(32);
            int iH8 = xVar.h(2);
            String str2 = iH8 == 3 ? null : "audio/ac3";
            int iH9 = xVar.h(6);
            int i26 = f51106e[iH9 / 2] * 1000;
            int iC = c(iH8, iH9);
            xVar.r(8);
            int iH10 = xVar.h(3);
            if ((iH10 & 1) != 0 && iH10 != 1) {
                xVar.r(2);
            }
            if ((iH10 & 4) != 0) {
                xVar.r(2);
            }
            if (iH10 == 2) {
                xVar.r(2);
            }
            int[] iArr = f51103b;
            int i27 = iH8 < iArr.length ? iArr[iH8] : -1;
            i10 = f51105d[iH10] + (xVar.g() ? 1 : 0);
            i11 = -1;
            str = str2;
            i12 = 1536;
            i13 = i26;
            i14 = iC;
            i15 = i27;
        }
        return new C0731b(str, i11, i10, i15, i14, i12, i13);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return c((b10 & 192) >> 6, b10 & 63);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static U1.s h(X1.y r7, java.lang.String r8, java.lang.String r9, U1.C1738n r10) {
        /*
            X1.x r0 = new X1.x
            r0.<init>()
            r0.m(r7)
            r1 = 13
            int r1 = r0.h(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.r(r2)
            r3 = 2
            int r3 = r0.h(r3)
            int[] r4 = v2.C4796b.f51103b
            r3 = r4[r3]
            r4 = 10
            r0.r(r4)
            int[] r4 = v2.C4796b.f51105d
            int r5 = r0.h(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.h(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.r(r2)
            r2 = 4
            int r2 = r0.h(r2)
            r0.r(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.r(r2)
            int r2 = r0.h(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.r(r5)
        L4f:
            int r2 = r0.b()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.r(r6)
            int r2 = r0.h(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.c()
            int r0 = r0.d()
            r7.W(r0)
            U1.s$b r7 = new U1.s$b
            r7.<init>()
            U1.s$b r7 = r7.e0(r8)
            U1.s$b r7 = r7.s0(r2)
            U1.s$b r7 = r7.Q(r4)
            U1.s$b r7 = r7.t0(r3)
            U1.s$b r7 = r7.X(r10)
            U1.s$b r7 = r7.i0(r9)
            U1.s$b r7 = r7.n0(r1)
            U1.s r7 = r7.M()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.C4796b.h(X1.y, java.lang.String, java.lang.String, U1.n):U1.s");
    }

    public static int i(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
