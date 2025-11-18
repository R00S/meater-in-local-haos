package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import cm.aptoide.p092pt.root.execution.Command;
import com.google.android.gms.internal.ads.zzpo;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class b20 {

    /* renamed from: a */
    private static final int f18230a = zzsy.m20545i("vide");

    /* renamed from: b */
    private static final int f18231b = zzsy.m20545i("soun");

    /* renamed from: c */
    private static final int f18232c = zzsy.m20545i(Command.CommandHandler.TEXT);

    /* renamed from: d */
    private static final int f18233d = zzsy.m20545i("sbtl");

    /* renamed from: e */
    private static final int f18234e = zzsy.m20545i("subt");

    /* renamed from: f */
    private static final int f18235f = zzsy.m20545i("clcp");

    /* renamed from: g */
    private static final int f18236g = zzsy.m20545i("cenc");

    /* renamed from: h */
    private static final int f18237h = zzsy.m20545i("meta");

    /* renamed from: a */
    private static int m14845a(zzst zzstVar, int i2, int i3, e20 e20Var, int i4) {
        int iM20501b = zzstVar.m20501b();
        while (true) {
            if (iM20501b - i2 >= i3) {
                return 0;
            }
            zzstVar.m20510k(iM20501b);
            int iM20503d = zzstVar.m20503d();
            zzsk.m20478b(iM20503d > 0, "childAtomSize should be positive");
            if (zzstVar.m20503d() == y10.f21034V) {
                int i5 = iM20501b + 8;
                Pair pairCreate = null;
                Integer numValueOf = null;
                zzpb zzpbVar = null;
                boolean z = false;
                while (i5 - iM20501b < iM20503d) {
                    zzstVar.m20510k(i5);
                    int iM20503d2 = zzstVar.m20503d();
                    int iM20503d3 = zzstVar.m20503d();
                    if (iM20503d3 == y10.f21042b0) {
                        numValueOf = Integer.valueOf(zzstVar.m20503d());
                    } else if (iM20503d3 == y10.f21035W) {
                        zzstVar.m20511l(4);
                        z = zzstVar.m20503d() == f18236g;
                    } else if (iM20503d3 == y10.f21036X) {
                        int i6 = i5 + 8;
                        while (true) {
                            if (i6 - i5 >= iM20503d2) {
                                zzpbVar = null;
                                break;
                            }
                            zzstVar.m20510k(i6);
                            int iM20503d4 = zzstVar.m20503d();
                            if (zzstVar.m20503d() == y10.f21037Y) {
                                zzstVar.m20511l(6);
                                boolean z2 = zzstVar.m20506g() == 1;
                                int iM20506g = zzstVar.m20506g();
                                byte[] bArr = new byte[16];
                                zzstVar.m20513n(bArr, 0, 16);
                                zzpbVar = new zzpb(z2, iM20506g, bArr);
                            } else {
                                i6 += iM20503d4;
                            }
                        }
                    }
                    i5 += iM20503d2;
                }
                if (z) {
                    zzsk.m20478b(numValueOf != null, "frma atom is mandatory");
                    zzsk.m20478b(zzpbVar != null, "schi->tenc atom is mandatory");
                    pairCreate = Pair.create(numValueOf, zzpbVar);
                }
                if (pairCreate != null) {
                    e20Var.f18720a[i4] = (zzpb) pairCreate.second;
                    return ((Integer) pairCreate.first).intValue();
                }
            }
            iM20501b += iM20503d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:273:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x06e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x047f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a4  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzpa m14846b(com.google.android.gms.internal.ads.z10 r50, com.google.android.gms.internal.ads.a20 r51, long r52, com.google.android.gms.internal.ads.zzne r54, boolean r55) throws com.google.android.gms.internal.ads.zzlm {
        /*
            Method dump skipped, instructions count: 1823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b20.m14846b(com.google.android.gms.internal.ads.z10, com.google.android.gms.internal.ads.a20, long, com.google.android.gms.internal.ads.zzne, boolean):com.google.android.gms.internal.ads.zzpa");
    }

    /* renamed from: c */
    public static n20 m14847c(zzpa zzpaVar, z10 z10Var, zznr zznrVar) throws zzlm {
        d20 g20Var;
        boolean z;
        int iM20518s;
        int iM20518s2;
        zzpa zzpaVar2;
        int i2;
        long[] jArr;
        int[] iArr;
        int i3;
        long[] jArr2;
        int[] iArr2;
        long j2;
        long j3;
        long[] jArr3;
        long[] jArr4;
        boolean z2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int i4;
        int i5;
        int iM20518s3;
        int iM20518s4;
        a20 a20VarM16152d = z10Var.m16152d(y10.f21072q0);
        if (a20VarM16152d != null) {
            g20Var = new f20(a20VarM16152d);
        } else {
            a20 a20VarM16152d2 = z10Var.m16152d(y10.f21074r0);
            if (a20VarM16152d2 == null) {
                throw new zzlm("Track has no sample table size information");
            }
            g20Var = new g20(a20VarM16152d2);
        }
        int iMo15023b = g20Var.mo15023b();
        if (iMo15023b == 0) {
            return new n20(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        a20 a20VarM16152d3 = z10Var.m16152d(y10.f21076s0);
        if (a20VarM16152d3 == null) {
            a20VarM16152d3 = z10Var.m16152d(y10.f21078t0);
            z = true;
        } else {
            z = false;
        }
        zzst zzstVar = a20VarM16152d3.f18072Q0;
        zzst zzstVar2 = z10Var.m16152d(y10.f21070p0).f18072Q0;
        zzst zzstVar3 = z10Var.m16152d(y10.f21064m0).f18072Q0;
        a20 a20VarM16152d4 = z10Var.m16152d(y10.f21066n0);
        zzst zzstVar4 = null;
        zzst zzstVar5 = a20VarM16152d4 != null ? a20VarM16152d4.f18072Q0 : null;
        a20 a20VarM16152d5 = z10Var.m16152d(y10.f21068o0);
        zzst zzstVar6 = a20VarM16152d5 != null ? a20VarM16152d5.f18072Q0 : null;
        c20 c20Var = new c20(zzstVar2, zzstVar, z);
        zzstVar3.m20510k(12);
        int iM20518s5 = zzstVar3.m20518s() - 1;
        int iM20518s6 = zzstVar3.m20518s();
        int iM20518s7 = zzstVar3.m20518s();
        if (zzstVar6 != null) {
            zzstVar6.m20510k(12);
            iM20518s = zzstVar6.m20518s();
        } else {
            iM20518s = 0;
        }
        int iM20518s8 = -1;
        if (zzstVar5 != null) {
            zzstVar5.m20510k(12);
            iM20518s2 = zzstVar5.m20518s();
            if (iM20518s2 > 0) {
                iM20518s8 = zzstVar5.m20518s() - 1;
                zzstVar4 = zzstVar5;
            }
        } else {
            zzstVar4 = zzstVar5;
            iM20518s2 = 0;
        }
        long j4 = 0;
        if (g20Var.mo15022a() && "audio/raw".equals(zzpaVar.f26750f.f26470k) && iM20518s5 == 0 && iM20518s == 0 && iM20518s2 == 0) {
            zzpaVar2 = zzpaVar;
            i2 = iMo15023b;
            d20 d20Var = g20Var;
            int i6 = c20Var.f18381a;
            long[] jArr5 = new long[i6];
            int[] iArr6 = new int[i6];
            while (c20Var.m14956a()) {
                int i7 = c20Var.f18382b;
                jArr5[i7] = c20Var.f18384d;
                iArr6[i7] = c20Var.f18383c;
            }
            int iMo15024c = d20Var.mo15024c();
            long j5 = iM20518s7;
            int i8 = 8192 / iMo15024c;
            int iM20546j = 0;
            for (int i9 = 0; i9 < i6; i9++) {
                iM20546j += zzsy.m20546j(iArr6[i9], i8);
            }
            long[] jArr6 = new long[iM20546j];
            int[] iArr7 = new int[iM20546j];
            long[] jArr7 = new long[iM20546j];
            int[] iArr8 = new int[iM20546j];
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int iMax = 0;
            while (i10 < i6) {
                int i13 = iArr6[i10];
                long j6 = jArr5[i10];
                int i14 = i6;
                int i15 = i13;
                while (i15 > 0) {
                    int iMin = Math.min(i8, i15);
                    jArr6[i12] = j6;
                    iArr7[i12] = iMo15024c * iMin;
                    iMax = Math.max(iMax, iArr7[i12]);
                    jArr7[i12] = i11 * j5;
                    iArr8[i12] = 1;
                    j6 += iArr7[i12];
                    i11 += iMin;
                    i15 -= iMin;
                    i12++;
                    jArr5 = jArr5;
                    iArr6 = iArr6;
                }
                i10++;
                i6 = i14;
            }
            zzou zzouVar = new zzou(jArr6, iArr7, iMax, jArr7, iArr8);
            jArr = zzouVar.f26717a;
            iArr = zzouVar.f26718b;
            i3 = zzouVar.f26719c;
            jArr2 = zzouVar.f26720d;
            iArr2 = zzouVar.f26721e;
            j2 = 0;
        } else {
            long[] jArr8 = new long[iMo15023b];
            iArr = new int[iMo15023b];
            jArr2 = new long[iMo15023b];
            int i16 = iM20518s2;
            iArr2 = new int[iMo15023b];
            int iM20518s9 = iM20518s8;
            long j7 = 0;
            j2 = 0;
            int i17 = 0;
            i3 = 0;
            int iM20518s10 = 0;
            int i18 = 0;
            int iM20503d = 0;
            int i19 = iM20518s;
            int i20 = iM20518s7;
            int i21 = iM20518s6;
            int i22 = iM20518s5;
            int i23 = i16;
            while (i17 < iMo15023b) {
                while (i18 == 0) {
                    zzsk.m20481e(c20Var.m14956a());
                    j7 = c20Var.f18384d;
                    i18 = c20Var.f18383c;
                    i20 = i20;
                    i21 = i21;
                }
                int i24 = i21;
                int i25 = i20;
                if (zzstVar6 != null) {
                    while (iM20518s10 == 0 && i19 > 0) {
                        iM20518s10 = zzstVar6.m20518s();
                        iM20503d = zzstVar6.m20503d();
                        i19--;
                    }
                    iM20518s10--;
                }
                int i26 = iM20503d;
                jArr8[i17] = j7;
                iArr[i17] = g20Var.mo15024c();
                if (iArr[i17] > i3) {
                    i3 = iArr[i17];
                }
                int i27 = iMo15023b;
                d20 d20Var2 = g20Var;
                jArr2[i17] = j2 + i26;
                iArr2[i17] = zzstVar4 == null ? 1 : 0;
                if (i17 == iM20518s9) {
                    iArr2[i17] = 1;
                    i23--;
                    if (i23 > 0) {
                        iM20518s9 = zzstVar4.m20518s() - 1;
                    }
                }
                long[] jArr9 = jArr8;
                j2 += i25;
                int i28 = i24 - 1;
                if (i28 != 0 || i22 <= 0) {
                    iM20518s3 = i25;
                    iM20518s4 = i28;
                } else {
                    iM20518s4 = zzstVar3.m20518s();
                    iM20518s3 = zzstVar3.m20518s();
                    i22--;
                }
                int i29 = iM20518s4;
                j7 += iArr[i17];
                i18--;
                i17++;
                iMo15023b = i27;
                jArr8 = jArr9;
                iM20518s9 = iM20518s9;
                iM20503d = i26;
                i21 = i29;
                i20 = iM20518s3;
                g20Var = d20Var2;
            }
            i2 = iMo15023b;
            long[] jArr10 = jArr8;
            int i30 = i21;
            zzsk.m20477a(iM20518s10 == 0);
            while (i19 > 0) {
                zzsk.m20477a(zzstVar6.m20518s() == 0);
                zzstVar6.m20503d();
                i19--;
            }
            if (i23 == 0 && i30 == 0) {
                i5 = i18;
                if (i5 == 0 && i22 == 0) {
                    zzpaVar2 = zzpaVar;
                }
                jArr = jArr10;
            } else {
                i5 = i18;
            }
            zzpaVar2 = zzpaVar;
            int i31 = zzpaVar2.f26745a;
            StringBuilder sb = new StringBuilder(215);
            sb.append("Inconsistent stbl box for track ");
            sb.append(i31);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i23);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i30);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i5);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i22);
            Log.w("AtomParsers", sb.toString());
            jArr = jArr10;
        }
        if (zzpaVar2.f26753i == null || zznrVar.m20336c()) {
            int[] iArr9 = iArr;
            zzsy.m20542f(jArr2, 1000000L, zzpaVar2.f26747c);
            return new n20(jArr, iArr9, i3, jArr2, iArr2);
        }
        long[] jArr11 = zzpaVar2.f26753i;
        if (jArr11.length == 1 && zzpaVar2.f26746b == 1 && jArr2.length >= 2) {
            long j8 = zzpaVar2.f26754j[0];
            long jM20539c = zzsy.m20539c(jArr11[0], zzpaVar2.f26747c, zzpaVar2.f26748d) + j8;
            if (jArr2[0] <= j8 && j8 < jArr2[1] && jArr2[jArr2.length - 1] < jM20539c && jM20539c <= j2) {
                long j9 = j2 - jM20539c;
                long jM20539c2 = zzsy.m20539c(j8 - jArr2[0], zzpaVar2.f26750f.f26483x, zzpaVar2.f26747c);
                long jM20539c3 = zzsy.m20539c(j9, zzpaVar2.f26750f.f26483x, zzpaVar2.f26747c);
                if ((jM20539c2 != 0 || jM20539c3 != 0) && jM20539c2 <= 2147483647L && jM20539c3 <= 2147483647L) {
                    zznrVar.f26656c = (int) jM20539c2;
                    zznrVar.f26657d = (int) jM20539c3;
                    zzsy.m20542f(jArr2, 1000000L, zzpaVar2.f26747c);
                    return new n20(jArr, iArr, i3, jArr2, iArr2);
                }
            }
        }
        long[] jArr12 = zzpaVar2.f26753i;
        if (jArr12.length == 1) {
            char c2 = 0;
            if (jArr12[0] == 0) {
                int i32 = 0;
                while (i32 < jArr2.length) {
                    jArr2[i32] = zzsy.m20539c(jArr2[i32] - zzpaVar2.f26754j[c2], 1000000L, zzpaVar2.f26747c);
                    i32++;
                    c2 = 0;
                }
                return new n20(jArr, iArr, i3, jArr2, iArr2);
            }
        }
        boolean z3 = zzpaVar2.f26746b == 1;
        boolean z4 = false;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        while (true) {
            long[] jArr13 = zzpaVar2.f26753i;
            j3 = -1;
            if (i35 >= jArr13.length) {
                break;
            }
            int i36 = i3;
            int[] iArr10 = iArr;
            long j10 = zzpaVar2.f26754j[i35];
            if (j10 != -1) {
                i4 = i36;
                long jM20539c4 = zzsy.m20539c(jArr13[i35], zzpaVar2.f26747c, zzpaVar2.f26748d);
                int iM20547k = zzsy.m20547k(jArr2, j10, true, true);
                int iM20547k2 = zzsy.m20547k(jArr2, j10 + jM20539c4, z3, false);
                i33 += iM20547k2 - iM20547k;
                z4 |= i34 != iM20547k;
                i34 = iM20547k2;
            } else {
                i4 = i36;
            }
            i35++;
            iArr = iArr10;
            i3 = i4;
        }
        int i37 = i3;
        int[] iArr11 = iArr;
        boolean z5 = z4 | (i33 != i2);
        long[] jArr14 = z5 ? new long[i33] : jArr;
        int[] iArr12 = z5 ? new int[i33] : iArr11;
        int i38 = z5 ? 0 : i37;
        int[] iArr13 = z5 ? new int[i33] : iArr2;
        long[] jArr15 = new long[i33];
        int i39 = i38;
        int i40 = 0;
        int i41 = 0;
        while (true) {
            long[] jArr16 = zzpaVar2.f26753i;
            if (i40 >= jArr16.length) {
                break;
            }
            int[] iArr14 = iArr12;
            int[] iArr15 = iArr13;
            long j11 = zzpaVar2.f26754j[i40];
            long j12 = jArr16[i40];
            if (j11 != j3) {
                jArr3 = jArr14;
                long[] jArr17 = jArr;
                long jM20539c5 = zzsy.m20539c(j12, zzpaVar2.f26747c, zzpaVar2.f26748d) + j11;
                int iM20547k3 = zzsy.m20547k(jArr2, j11, true, true);
                int iM20547k4 = zzsy.m20547k(jArr2, jM20539c5, z3, false);
                if (z5) {
                    int i42 = iM20547k4 - iM20547k3;
                    System.arraycopy(jArr17, iM20547k3, jArr3, i41, i42);
                    iArr4 = iArr11;
                    z2 = z3;
                    iArr3 = iArr14;
                    System.arraycopy(iArr4, iM20547k3, iArr3, i41, i42);
                    jArr4 = jArr17;
                    iArr5 = iArr15;
                    System.arraycopy(iArr2, iM20547k3, iArr5, i41, i42);
                } else {
                    iArr4 = iArr11;
                    jArr4 = jArr17;
                    iArr5 = iArr15;
                    z2 = z3;
                    iArr3 = iArr14;
                }
                int i43 = i39;
                while (iM20547k3 < iM20547k4) {
                    int[] iArr16 = iArr5;
                    int[] iArr17 = iArr4;
                    long j13 = j11;
                    jArr15[i41] = zzsy.m20539c(j4, 1000000L, zzpaVar2.f26748d) + zzsy.m20539c(jArr2[iM20547k3] - j11, 1000000L, zzpaVar2.f26747c);
                    if (z5 && iArr3[i41] > i43) {
                        i43 = iArr17[iM20547k3];
                    }
                    i41++;
                    iM20547k3++;
                    iArr4 = iArr17;
                    j11 = j13;
                    iArr5 = iArr16;
                }
                iArr15 = iArr5;
                iArr11 = iArr4;
                i39 = i43;
            } else {
                jArr3 = jArr14;
                jArr4 = jArr;
                z2 = z3;
                iArr3 = iArr14;
            }
            j4 += j12;
            i40++;
            iArr12 = iArr3;
            jArr14 = jArr3;
            z3 = z2;
            iArr13 = iArr15;
            jArr = jArr4;
            j3 = -1;
        }
        long[] jArr18 = jArr14;
        int[] iArr18 = iArr12;
        int[] iArr19 = iArr13;
        boolean z6 = false;
        for (int i44 = 0; i44 < iArr19.length && !z6; i44++) {
            z6 |= (iArr19[i44] & 1) != 0;
        }
        if (z6) {
            return new n20(jArr18, iArr18, i39, jArr15, iArr19);
        }
        throw new zzlm("The edited sample sequence does not contain a sync sample.");
    }

    /* renamed from: d */
    public static zzpo m14848d(a20 a20Var, boolean z) {
        if (z) {
            return null;
        }
        zzst zzstVar = a20Var.f18072Q0;
        zzstVar.m20510k(8);
        while (zzstVar.m20520u() >= 8) {
            int iM20501b = zzstVar.m20501b();
            int iM20503d = zzstVar.m20503d();
            if (zzstVar.m20503d() == y10.f21001B0) {
                zzstVar.m20510k(iM20501b);
                int i2 = iM20501b + iM20503d;
                zzstVar.m20511l(12);
                while (true) {
                    if (zzstVar.m20501b() >= i2) {
                        break;
                    }
                    int iM20501b2 = zzstVar.m20501b();
                    int iM20503d2 = zzstVar.m20503d();
                    if (zzstVar.m20503d() == y10.f21003C0) {
                        zzstVar.m20510k(iM20501b2);
                        int i3 = iM20501b2 + iM20503d2;
                        zzstVar.m20511l(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzstVar.m20501b() < i3) {
                            zzpo.zza zzaVarM15362d = j20.m15362d(zzstVar);
                            if (zzaVarM15362d != null) {
                                arrayList.add(zzaVarM15362d);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new zzpo(arrayList);
                        }
                    } else {
                        zzstVar.m20511l(iM20503d2 - 8);
                    }
                }
                return null;
            }
            zzstVar.m20511l(iM20503d - 8);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair<java.lang.String, byte[]> m14849e(com.google.android.gms.internal.ads.zzst r3, int r4) {
        /*
            int r4 = r4 + 8
            int r4 = r4 + 4
            r3.m20510k(r4)
            r4 = 1
            r3.m20511l(r4)
            m14850f(r3)
            r0 = 2
            r3.m20511l(r0)
            int r1 = r3.m20506g()
            r2 = r1 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L1d
            r3.m20511l(r0)
        L1d:
            r2 = r1 & 64
            if (r2 == 0) goto L28
            int r2 = r3.m20507h()
            r3.m20511l(r2)
        L28:
            r2 = 32
            r1 = r1 & r2
            if (r1 == 0) goto L30
            r3.m20511l(r0)
        L30:
            r3.m20511l(r4)
            m14850f(r3)
            int r0 = r3.m20506g()
            r1 = 0
            if (r0 == r2) goto L80
            r2 = 33
            if (r0 == r2) goto L7d
            r2 = 35
            if (r0 == r2) goto L7a
            r2 = 64
            if (r0 == r2) goto L77
            r2 = 107(0x6b, float:1.5E-43)
            if (r0 == r2) goto L70
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto L6d
            r2 = 166(0xa6, float:2.33E-43)
            if (r0 == r2) goto L6a
            switch(r0) {
                case 102: goto L77;
                case 103: goto L77;
                case 104: goto L77;
                default: goto L58;
            }
        L58:
            switch(r0) {
                case 169: goto L63;
                case 170: goto L5c;
                case 171: goto L5c;
                case 172: goto L63;
                default: goto L5b;
            }
        L5b:
            goto L82
        L5c:
            java.lang.String r3 = "audio/vnd.dts.hd"
            android.util.Pair r3 = android.util.Pair.create(r3, r1)
            return r3
        L63:
            java.lang.String r3 = "audio/vnd.dts"
            android.util.Pair r3 = android.util.Pair.create(r3, r1)
            return r3
        L6a:
            java.lang.String r1 = "audio/eac3"
            goto L82
        L6d:
            java.lang.String r1 = "audio/ac3"
            goto L82
        L70:
            java.lang.String r3 = "audio/mpeg"
            android.util.Pair r3 = android.util.Pair.create(r3, r1)
            return r3
        L77:
            java.lang.String r1 = "audio/mp4a-latm"
            goto L82
        L7a:
            java.lang.String r1 = "video/hevc"
            goto L82
        L7d:
            java.lang.String r1 = "video/avc"
            goto L82
        L80:
            java.lang.String r1 = "video/mp4v-es"
        L82:
            r0 = 12
            r3.m20511l(r0)
            r3.m20511l(r4)
            int r4 = m14850f(r3)
            byte[] r0 = new byte[r4]
            r2 = 0
            r3.m20513n(r0, r2, r4)
            android.util.Pair r3 = android.util.Pair.create(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b20.m14849e(com.google.android.gms.internal.ads.zzst, int):android.util.Pair");
    }

    /* renamed from: f */
    private static int m14850f(zzst zzstVar) {
        int iM20506g = zzstVar.m20506g();
        int i2 = iM20506g & 127;
        while ((iM20506g & 128) == 128) {
            iM20506g = zzstVar.m20506g();
            i2 = (i2 << 7) | (iM20506g & 127);
        }
        return i2;
    }
}
