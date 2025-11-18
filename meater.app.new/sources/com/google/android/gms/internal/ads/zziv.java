package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* loaded from: classes2.dex */
public final class zziv implements zzid, zzio {

    /* renamed from: f */
    private long f26308f;

    /* renamed from: g */
    private int f26309g;

    /* renamed from: h */
    private long f26310h;

    /* renamed from: i */
    private int f26311i;

    /* renamed from: j */
    private zzkm f26312j;

    /* renamed from: k */
    private int f26313k;

    /* renamed from: l */
    private int f26314l;

    /* renamed from: m */
    private int f26315m;

    /* renamed from: n */
    private zzif f26316n;

    /* renamed from: o */
    private C7394yz[] f26317o;

    /* renamed from: c */
    private final zzkm f26305c = new zzkm(16);

    /* renamed from: d */
    private final Stack<zzir> f26306d = new Stack<>();

    /* renamed from: a */
    private final zzkm f26303a = new zzkm(zzkj.f26421a);

    /* renamed from: b */
    private final zzkm f26304b = new zzkm(4);

    /* renamed from: e */
    private int f26307e = 0;

    @Override // com.google.android.gms.internal.ads.zzio
    /* renamed from: a */
    public final long mo20059a(long j2) {
        int i2;
        long j3 = Long.MAX_VALUE;
        int i3 = 0;
        while (true) {
            C7394yz[] c7394yzArr = this.f26317o;
            if (i3 >= c7394yzArr.length) {
                return j3;
            }
            C7431zz c7431zz = c7394yzArr[i3].f21343b;
            int iM20155a = zzkq.m20155a(c7431zz.f21487d, j2, true, false);
            while (true) {
                i2 = -1;
                if (iM20155a < 0) {
                    iM20155a = -1;
                    break;
                }
                if (c7431zz.f21487d[iM20155a] <= j2 && (c7431zz.f21488e[iM20155a] & 1) != 0) {
                    break;
                }
                iM20155a--;
            }
            if (iM20155a == -1) {
                int iM20162h = zzkq.m20162h(c7431zz.f21487d, j2, true, false);
                while (true) {
                    long[] jArr = c7431zz.f21487d;
                    if (iM20162h < jArr.length) {
                        if (jArr[iM20162h] >= j2 && (c7431zz.f21488e[iM20162h] & 1) != 0) {
                            i2 = iM20162h;
                            break;
                        }
                        iM20162h++;
                    } else {
                        break;
                    }
                }
                iM20155a = i2;
            }
            C7394yz[] c7394yzArr2 = this.f26317o;
            c7394yzArr2[i3].f21345d = iM20155a;
            long j4 = c7431zz.f21485b[c7394yzArr2[i3].f21345d];
            if (j4 < j3) {
                j3 = j4;
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzio
    /* renamed from: b */
    public final boolean mo20060b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzid
    /* renamed from: c */
    public final int mo20075c(zzie zzieVar, zzij zzijVar) throws InterruptedException, IOException {
        C7394yz[] c7394yzArr;
        int i2;
        long j2;
        zzir zzirVar;
        boolean z;
        zziv zzivVar;
        ArrayList arrayList;
        int i3;
        zzix zzixVarM15999a;
        int i4;
        int i5;
        int i6;
        int iM20151m;
        int iM20151m2;
        int iM20151m3;
        int iM20141c;
        int iM20151m4;
        int i7;
        zzkm zzkmVar;
        zzkm zzkmVar2;
        int i8;
        zzkm zzkmVar3;
        int i9;
        int iM20151m5;
        int i10;
        boolean z2;
        zziv zzivVar2 = this;
        zzie zzieVar2 = zzieVar;
        zzij zzijVar2 = zzijVar;
        while (true) {
            int i11 = zzivVar2.f26307e;
            if (i11 == 0) {
                zziv zzivVar3 = zzivVar2;
                if (zzieVar.mo20062b(zzivVar3.f26305c.f26424a, 0, 8, true)) {
                    zzivVar3.f26305c.m20145g(0);
                    zzivVar3.f26310h = zzivVar3.f26305c.m20149k();
                    zzivVar3.f26309g = zzivVar3.f26305c.m20141c();
                    if (zzivVar3.f26310h == 1) {
                        zzieVar.readFully(zzivVar3.f26305c.f26424a, 8, 8);
                        zzivVar3.f26310h = zzivVar3.f26305c.m20142d();
                        zzivVar3.f26308f += 16;
                        zzivVar3.f26311i = 16;
                    } else {
                        zzivVar3.f26308f += 8;
                        zzivVar3.f26311i = 8;
                    }
                    int i12 = zzivVar3.f26309g;
                    if (i12 == C7283vz.f20805p || i12 == C7283vz.f20807r || i12 == C7283vz.f20808s || i12 == C7283vz.f20809t || i12 == C7283vz.f20810u) {
                        if (zzivVar3.f26310h == 1) {
                            zzivVar3.f26306d.add(new zzir(zzivVar3.f26309g, (zzivVar3.f26308f + zzivVar3.f26310h) - zzivVar3.f26311i));
                        } else {
                            zzivVar3.f26306d.add(new zzir(zzivVar3.f26309g, (zzivVar3.f26308f + zzivVar3.f26310h) - zzivVar3.f26311i));
                        }
                        zzivVar3.f26307e = 0;
                    } else {
                        if (i12 == C7283vz.f20764A || i12 == C7283vz.f20806q || i12 == C7283vz.f20765B || i12 == C7283vz.f20780Q || i12 == C7283vz.f20781R || i12 == C7283vz.f20766C || i12 == C7283vz.f20791b || i12 == C7283vz.f20811v || i12 == C7283vz.f20795f || i12 == C7283vz.f20793d || i12 == C7283vz.f20783T || i12 == C7283vz.f20784U || i12 == C7283vz.f20785V || i12 == C7283vz.f20786W || i12 == C7283vz.f20787X || i12 == C7283vz.f20788Y || i12 == C7283vz.f20789Z || i12 == C7283vz.f20815z) {
                            zzkh.m20129d(zzivVar3.f26310h < 2147483647L);
                            zzkm zzkmVar4 = new zzkm((int) zzivVar3.f26310h);
                            zzivVar3.f26312j = zzkmVar4;
                            System.arraycopy(zzivVar3.f26305c.f26424a, 0, zzkmVar4.f26424a, 0, 8);
                            zzivVar3.f26307e = 1;
                        } else {
                            zzivVar3.f26312j = null;
                            zzivVar3.f26307e = 1;
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    return -1;
                }
                zzijVar2 = zzijVar;
                zzivVar2 = zzivVar3;
                zzieVar2 = zzieVar;
            } else {
                if (i11 != 1) {
                    long j3 = Long.MAX_VALUE;
                    int i13 = 0;
                    int i14 = -1;
                    while (true) {
                        c7394yzArr = zzivVar2.f26317o;
                        if (i13 >= c7394yzArr.length) {
                            break;
                        }
                        C7394yz c7394yz = c7394yzArr[i13];
                        int i15 = c7394yz.f21345d;
                        C7431zz c7431zz = c7394yz.f21343b;
                        if (i15 != c7431zz.f21484a) {
                            long j4 = c7431zz.f21485b[i15];
                            if (j4 < j3) {
                                i14 = i13;
                                j3 = j4;
                            }
                        }
                        i13++;
                    }
                    if (i14 == -1) {
                        return -1;
                    }
                    C7394yz c7394yz2 = c7394yzArr[i14];
                    int i16 = c7394yz2.f21345d;
                    long j5 = c7394yz2.f21343b.f21485b[i16];
                    long position = (j5 - zzieVar.getPosition()) + zzivVar2.f26314l;
                    if (position < 0) {
                        i2 = 1;
                        j2 = j5;
                    } else {
                        if (position < 262144) {
                            zzieVar2.mo20061a((int) position);
                            zzivVar2.f26313k = c7394yz2.f21343b.f21486c[i16];
                            int i17 = c7394yz2.f21342a.f26324g;
                            if (i17 == -1) {
                                while (true) {
                                    int i18 = zzivVar2.f26314l;
                                    int i19 = zzivVar2.f26313k;
                                    if (i18 >= i19) {
                                        break;
                                    }
                                    int iMo20064a = c7394yz2.f21344c.mo20064a(zzieVar2, i19 - i18);
                                    zzivVar2.f26314l += iMo20064a;
                                    zzivVar2.f26315m -= iMo20064a;
                                }
                            } else {
                                byte[] bArr = zzivVar2.f26304b.f26424a;
                                bArr[0] = 0;
                                bArr[1] = 0;
                                bArr[2] = 0;
                                int i20 = 4 - i17;
                                while (zzivVar2.f26314l < zzivVar2.f26313k) {
                                    int i21 = zzivVar2.f26315m;
                                    if (i21 == 0) {
                                        zzieVar2.readFully(zzivVar2.f26304b.f26424a, i20, i17);
                                        zzivVar2.f26304b.m20145g(0);
                                        zzivVar2.f26315m = zzivVar2.f26304b.m20151m();
                                        zzivVar2.f26303a.m20145g(0);
                                        c7394yz2.f21344c.mo20066c(zzivVar2.f26303a, 4);
                                        zzivVar2.f26314l += 4;
                                        zzivVar2.f26313k += i20;
                                    } else {
                                        int iMo20064a2 = c7394yz2.f21344c.mo20064a(zzieVar2, i21);
                                        zzivVar2.f26314l += iMo20064a2;
                                        zzivVar2.f26315m -= iMo20064a2;
                                    }
                                }
                            }
                            zzip zzipVar = c7394yz2.f21344c;
                            C7431zz c7431zz2 = c7394yz2.f21343b;
                            zzipVar.mo15814d(c7431zz2.f21487d[i16], c7431zz2.f21488e[i16], zzivVar2.f26313k, 0, null);
                            c7394yz2.f21345d++;
                            zzivVar2.f26314l = 0;
                            zzivVar2.f26315m = 0;
                            return 0;
                        }
                        j2 = j5;
                        i2 = 1;
                    }
                    zzijVar2.f26298a = j2;
                    return i2;
                }
                zzivVar2.f26307e = 0;
                long j6 = zzivVar2.f26308f;
                long j7 = zzivVar2.f26310h;
                int i22 = zzivVar2.f26311i;
                long j8 = j6 + (j7 - i22);
                zzivVar2.f26308f = j8;
                long j9 = j7 - i22;
                zzkm zzkmVar5 = zzivVar2.f26312j;
                boolean z3 = zzkmVar5 == null && (j7 >= 262144 || j7 > 2147483647L);
                if (z3) {
                    zzijVar2.f26298a = j8;
                } else if (zzkmVar5 != null) {
                    zzieVar2.readFully(zzkmVar5.f26424a, i22, (int) j9);
                    if (!zzivVar2.f26306d.isEmpty()) {
                        zzivVar2.f26306d.peek().f26300c0.add(new zzis(zzivVar2.f26309g, zzivVar2.f26312j));
                    }
                } else {
                    zzieVar2.mo20061a((int) j9);
                }
                while (!zzivVar2.f26306d.isEmpty() && zzivVar2.f26306d.peek().f26299b0 == zzivVar2.f26308f) {
                    zzir zzirVarPop = zzivVar2.f26306d.pop();
                    if (zzirVarPop.f20816a0 == C7283vz.f20805p) {
                        ArrayList arrayList2 = new ArrayList();
                        int i23 = 0;
                        while (i23 < zzirVarPop.f26301d0.size()) {
                            zzir zzirVar2 = zzirVarPop.f26301d0.get(i23);
                            if (zzirVar2.f20816a0 == C7283vz.f20807r && (zzixVarM15999a = C7320wz.m15999a(zzirVar2, zzirVarPop.m20093c(C7283vz.f20806q))) != null && ((i4 = zzixVarM15999a.f26319b) == 1936684398 || i4 == 1986618469)) {
                                zzir zzirVarM20094d = zzirVar2.m20094d(C7283vz.f20808s).m20094d(C7283vz.f20809t).m20094d(C7283vz.f20810u);
                                zzkm zzkmVar6 = zzirVarM20094d.m20093c(C7283vz.f20787X).f26302b0;
                                int i24 = C7283vz.f20788Y;
                                zzis zzisVarM20093c = zzirVarM20094d.m20093c(i24);
                                if (zzisVarM20093c == null) {
                                    zzisVarM20093c = zzirVarM20094d.m20093c(C7283vz.f20789Z);
                                }
                                zzkm zzkmVar7 = zzisVarM20093c.f26302b0;
                                zzkm zzkmVar8 = zzirVarM20094d.m20093c(C7283vz.f20786W).f26302b0;
                                zzkm zzkmVar9 = zzirVarM20094d.m20093c(C7283vz.f20783T).f26302b0;
                                zzis zzisVarM20093c2 = zzirVarM20094d.m20093c(C7283vz.f20784U);
                                zzkm zzkmVar10 = zzisVarM20093c2 != null ? zzisVarM20093c2.f26302b0 : null;
                                zzis zzisVarM20093c3 = zzirVarM20094d.m20093c(C7283vz.f20785V);
                                zzkm zzkmVar11 = zzisVarM20093c3 != null ? zzisVarM20093c3.f26302b0 : null;
                                zzkmVar6.m20145g(12);
                                int iM20151m6 = zzkmVar6.m20151m();
                                int iM20151m7 = zzkmVar6.m20151m();
                                int[] iArr = new int[iM20151m7];
                                z = z3;
                                long[] jArr = new long[iM20151m7];
                                zzirVar = zzirVarPop;
                                long[] jArr2 = new long[iM20151m7];
                                ArrayList arrayList3 = arrayList2;
                                int[] iArr2 = new int[iM20151m7];
                                int i25 = i23;
                                zzkmVar7.m20145g(12);
                                int iM20151m8 = zzkmVar7.m20151m();
                                zzkmVar8.m20145g(12);
                                int iM20151m9 = zzkmVar8.m20151m() - 1;
                                int i26 = iM20151m8;
                                if (!(zzkmVar8.m20141c() == 1)) {
                                    throw new IllegalStateException("stsc first chunk must be 1");
                                }
                                int iM20151m10 = zzkmVar8.m20151m();
                                zzkmVar8.m20146h(4);
                                if (iM20151m9 > 0) {
                                    iM20151m = zzkmVar8.m20151m() - 1;
                                    i5 = iM20151m10;
                                    i6 = 12;
                                } else {
                                    i5 = iM20151m10;
                                    i6 = 12;
                                    iM20151m = -1;
                                }
                                zzkmVar9.m20145g(i6);
                                int iM20151m11 = zzkmVar9.m20151m() - 1;
                                int iM20151m12 = zzkmVar9.m20151m();
                                int iM20151m13 = zzkmVar9.m20151m();
                                if (zzkmVar11 != null) {
                                    zzkmVar11.m20145g(i6);
                                    iM20151m2 = zzkmVar11.m20151m() - 1;
                                    iM20151m3 = zzkmVar11.m20151m();
                                    iM20141c = zzkmVar11.m20141c();
                                } else {
                                    iM20151m2 = 0;
                                    iM20151m3 = 0;
                                    iM20141c = 0;
                                }
                                if (zzkmVar10 != null) {
                                    zzkmVar10.m20145g(i6);
                                    int iM20151m14 = zzkmVar10.m20151m();
                                    iM20151m4 = zzkmVar10.m20151m() - 1;
                                    i7 = iM20151m14;
                                } else {
                                    iM20151m4 = -1;
                                    i7 = 0;
                                }
                                int i27 = i7;
                                long jM20149k = zzisVarM20093c.f20816a0 == i24 ? zzkmVar7.m20149k() : zzkmVar7.m20152n();
                                int i28 = 0;
                                long j10 = 0;
                                int i29 = iM20151m;
                                int iM20151m15 = iM20151m4;
                                int i30 = 0;
                                int iM20151m16 = iM20151m3;
                                zzkm zzkmVar12 = zzkmVar8;
                                int iM20151m17 = iM20151m13;
                                int i31 = iM20151m11;
                                int i32 = iM20151m9;
                                int iM20141c2 = iM20141c;
                                int i33 = iM20151m2;
                                int iM20151m18 = iM20151m12;
                                int iM20151m19 = i5;
                                while (i30 < iM20151m7) {
                                    jArr2[i30] = jM20149k;
                                    iArr[i30] = iM20151m6 == 0 ? zzkmVar6.m20151m() : iM20151m6;
                                    zzkm zzkmVar13 = zzkmVar6;
                                    int i34 = i28;
                                    jArr[i30] = j10 + iM20141c2;
                                    iArr2[i30] = zzkmVar10 == null ? 1 : 0;
                                    if (i30 == iM20151m15) {
                                        iArr2[i30] = 1;
                                        i27--;
                                        if (i27 > 0) {
                                            iM20151m15 = zzkmVar10.m20151m() - 1;
                                        }
                                    }
                                    j10 += iM20151m17;
                                    iM20151m18--;
                                    if (iM20151m18 == 0 && i31 > 0) {
                                        i31--;
                                        iM20151m18 = zzkmVar9.m20151m();
                                        iM20151m17 = zzkmVar9.m20151m();
                                    }
                                    if (zzkmVar11 != null && iM20151m16 - 1 == 0 && i33 > 0) {
                                        i33--;
                                        iM20151m16 = zzkmVar11.m20151m();
                                        iM20141c2 = zzkmVar11.m20141c();
                                    }
                                    i5--;
                                    if (i5 == 0) {
                                        i28 = i34 + 1;
                                        i8 = i26;
                                        i9 = i27;
                                        if (i28 < i8) {
                                            zzkmVar = zzkmVar11;
                                            jM20149k = zzisVarM20093c.f20816a0 == C7283vz.f20788Y ? zzkmVar7.m20149k() : zzkmVar7.m20152n();
                                        } else {
                                            zzkmVar = zzkmVar11;
                                        }
                                        iM20151m5 = i29;
                                        if (i28 == iM20151m5) {
                                            iM20151m19 = zzkmVar12.m20151m();
                                            zzkmVar2 = zzkmVar10;
                                            zzkmVar3 = zzkmVar12;
                                            zzkmVar3.m20146h(4);
                                            i32--;
                                            if (i32 > 0) {
                                                iM20151m5 = zzkmVar3.m20151m() - 1;
                                            }
                                        } else {
                                            zzkmVar2 = zzkmVar10;
                                            zzkmVar3 = zzkmVar12;
                                        }
                                        i10 = iM20151m7;
                                        if (i28 < i8) {
                                            i5 = iM20151m19;
                                        }
                                    } else {
                                        zzkmVar = zzkmVar11;
                                        zzkmVar2 = zzkmVar10;
                                        i8 = i26;
                                        zzkmVar3 = zzkmVar12;
                                        i9 = i27;
                                        iM20151m5 = i29;
                                        i10 = iM20151m7;
                                        jM20149k += iArr[i30];
                                        i28 = i34;
                                    }
                                    i30++;
                                    i29 = iM20151m5;
                                    zzkmVar10 = zzkmVar2;
                                    i27 = i9;
                                    iM20151m7 = i10;
                                    zzkmVar12 = zzkmVar3;
                                    i26 = i8;
                                    zzkmVar6 = zzkmVar13;
                                    zzkmVar11 = zzkmVar;
                                }
                                zzkq.m20157c(jArr, 1000000L, zzixVarM15999a.f26320c);
                                zzkh.m20126a(i27 == 0);
                                zzkh.m20126a(iM20151m18 == 0);
                                zzkh.m20126a(i5 == 0);
                                zzkh.m20126a(i31 == 0);
                                zzkh.m20126a(i33 == 0);
                                C7431zz c7431zz3 = new C7431zz(jArr2, iArr, jArr, iArr2);
                                if (c7431zz3.f21484a != 0) {
                                    zzivVar = this;
                                    i3 = i25;
                                    C7394yz c7394yz3 = new C7394yz(zzixVarM15999a, c7431zz3, zzivVar.f26316n.mo20080f(i3));
                                    c7394yz3.f21344c.mo20065b(zzixVarM15999a.f26322e);
                                    arrayList = arrayList3;
                                    arrayList.add(c7394yz3);
                                } else {
                                    zzivVar = this;
                                    arrayList = arrayList3;
                                    i3 = i25;
                                }
                            } else {
                                zzirVar = zzirVarPop;
                                z = z3;
                                zzivVar = zzivVar2;
                                arrayList = arrayList2;
                                i3 = i23;
                            }
                            i23 = i3 + 1;
                            arrayList2 = arrayList;
                            zzivVar2 = zzivVar;
                            z3 = z;
                            zzirVarPop = zzirVar;
                        }
                        zziv zzivVar4 = zzivVar2;
                        zzivVar4.f26317o = (C7394yz[]) arrayList2.toArray(new C7394yz[0]);
                        zzivVar4.f26316n.mo20078d();
                        zzivVar4.f26316n.mo20081g(zzivVar4);
                        zzivVar4.f26307e = 2;
                        zzivVar2 = zzivVar4;
                    } else {
                        boolean z4 = z3;
                        zziv zzivVar5 = zzivVar2;
                        if (!zzivVar5.f26306d.isEmpty()) {
                            zzivVar5.f26306d.peek().f26301d0.add(zzirVarPop);
                        }
                        zzivVar2 = zzivVar5;
                        z3 = z4;
                    }
                }
                zziv zzivVar6 = zzivVar2;
                if (z3) {
                    return 1;
                }
                zzieVar2 = zzieVar;
                zzijVar2 = zzijVar;
                zzivVar2 = zzivVar6;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzid
    /* renamed from: d */
    public final void mo20076d(zzif zzifVar) {
        this.f26316n = zzifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzid
    /* renamed from: e */
    public final void mo20077e() {
        this.f26308f = 0L;
        this.f26314l = 0;
        this.f26315m = 0;
    }
}
