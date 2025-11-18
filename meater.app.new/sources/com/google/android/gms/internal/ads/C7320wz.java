package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.wz */
/* loaded from: classes2.dex */
final class C7320wz {
    /* renamed from: a */
    public static zzix m15999a(zzir zzirVar, zzis zzisVar) {
        boolean z;
        boolean z2;
        long jM20149k;
        int i2;
        int i3;
        int i4;
        int i5;
        zzir zzirVarM20094d = zzirVar.m20094d(C7283vz.f20808s);
        zzkm zzkmVar = zzirVarM20094d.m20093c(C7283vz.f20765B).f26302b0;
        zzkmVar.m20145g(16);
        int iM20141c = zzkmVar.m20141c();
        if (iM20141c != 1936684398 && iM20141c != 1986618469 && iM20141c != 1952807028 && iM20141c != 1953325924) {
            return null;
        }
        zzkm zzkmVar2 = zzirVar.m20093c(C7283vz.f20815z).f26302b0;
        zzkmVar2.m20145g(8);
        int iM15972a = C7283vz.m15972a(zzkmVar2.m20141c());
        zzkmVar2.m20146h(iM15972a == 0 ? 8 : 16);
        int iM20141c2 = zzkmVar2.m20141c();
        zzkmVar2.m20146h(4);
        int iM20139a = zzkmVar2.m20139a();
        int i6 = iM15972a == 0 ? 4 : 8;
        int i7 = 0;
        while (true) {
            z = true;
            if (i7 >= i6) {
                z2 = true;
                break;
            }
            if (zzkmVar2.f26424a[iM20139a + i7] != -1) {
                z2 = false;
                break;
            }
            i7++;
        }
        if (z2) {
            zzkmVar2.m20146h(i6);
            jM20149k = -1;
        } else {
            jM20149k = iM15972a == 0 ? zzkmVar2.m20149k() : zzkmVar2.m20152n();
        }
        Pair pairCreate = Pair.create(Integer.valueOf(iM20141c2), Long.valueOf(jM20149k));
        int iIntValue = ((Integer) pairCreate.first).intValue();
        long jLongValue = ((Long) pairCreate.second).longValue();
        zzkm zzkmVar3 = zzisVar.f26302b0;
        zzkmVar3.m20145g(8);
        zzkmVar3.m20146h(C7283vz.m15972a(zzkmVar3.m20141c()) == 0 ? 8 : 16);
        long jM20156b = jLongValue == -1 ? -1L : zzkq.m20156b(jLongValue, 1000000L, zzkmVar3.m20149k());
        zzir zzirVarM20094d2 = zzirVarM20094d.m20094d(C7283vz.f20809t).m20094d(C7283vz.f20810u);
        zzkm zzkmVar4 = zzirVarM20094d.m20093c(C7283vz.f20764A).f26302b0;
        zzkmVar4.m20145g(8);
        zzkmVar4.m20146h(C7283vz.m15972a(zzkmVar4.m20141c()) != 0 ? 16 : 8);
        long jM20149k2 = zzkmVar4.m20149k();
        zzkm zzkmVar5 = zzirVarM20094d2.m20093c(C7283vz.f20766C).f26302b0;
        zzkmVar5.m20145g(12);
        int iM20141c3 = zzkmVar5.m20141c();
        C7357xz c7357xz = new C7357xz(iM20141c3);
        int i8 = 0;
        while (i8 < iM20141c3) {
            int iM20139a2 = zzkmVar5.m20139a();
            int iM20141c4 = zzkmVar5.m20141c();
            zzkh.m20127b(iM20141c4 > 0, "childAtomSize should be positive");
            int iM20141c5 = zzkmVar5.m20141c();
            if (iM20141c5 == C7283vz.f20791b || iM20141c5 == C7283vz.f20792c || iM20141c5 == C7283vz.f20772I) {
                i2 = iM20141c3;
                i3 = iIntValue;
                i4 = iM20141c;
                i5 = iM20141c4;
                zzkmVar5.m20145g(iM20139a2 + 8);
                zzkmVar5.m20146h(24);
                int iM20144f = zzkmVar5.m20144f();
                int iM20144f2 = zzkmVar5.m20144f();
                zzkmVar5.m20146h(50);
                int iM20139a3 = zzkmVar5.m20139a();
                float fM20151m = 1.0f;
                List list = null;
                while (iM20139a3 - iM20139a2 < i5) {
                    zzkmVar5.m20145g(iM20139a3);
                    int iM20139a4 = zzkmVar5.m20139a();
                    int iM20141c6 = zzkmVar5.m20141c();
                    if (iM20141c6 == 0 && zzkmVar5.m20139a() - iM20139a2 == i5) {
                        break;
                    }
                    zzkh.m20127b(iM20141c6 > 0, "childAtomSize should be positive");
                    int iM20141c7 = zzkmVar5.m20141c();
                    if (iM20141c7 == C7283vz.f20811v) {
                        zzkmVar5.m20145g(iM20139a4 + 8 + 4);
                        int iM20143e = (zzkmVar5.m20143e() & 3) + 1;
                        if (iM20143e == 3) {
                            throw new IllegalStateException();
                        }
                        ArrayList arrayList = new ArrayList();
                        int iM20143e2 = zzkmVar5.m20143e() & 31;
                        for (int i9 = 0; i9 < iM20143e2; i9++) {
                            arrayList.add(zzkj.m20132a(zzkmVar5));
                        }
                        int iM20143e3 = zzkmVar5.m20143e();
                        for (int i10 = 0; i10 < iM20143e3; i10++) {
                            arrayList.add(zzkj.m20132a(zzkmVar5));
                        }
                        Pair pairCreate2 = Pair.create(arrayList, Integer.valueOf(iM20143e));
                        list = (List) pairCreate2.first;
                        c7357xz.f20990c = ((Integer) pairCreate2.second).intValue();
                    } else if (iM20141c7 == C7283vz.f20768E) {
                        c7357xz.f20988a[i8] = m16000b(zzkmVar5, iM20139a4, iM20141c6);
                    } else if (iM20141c7 == C7283vz.f20778O) {
                        zzkmVar5.m20145g(iM20139a4 + 8);
                        fM20151m = zzkmVar5.m20151m() / zzkmVar5.m20151m();
                    }
                    iM20139a3 += iM20141c6;
                }
                z = true;
                c7357xz.f20989b = zzhj.m20022d("video/avc", -1, jM20156b, iM20144f, iM20144f2, fM20151m, list);
            } else {
                if (iM20141c5 == C7283vz.f20795f || iM20141c5 == C7283vz.f20773J || iM20141c5 == C7283vz.f20796g) {
                    i2 = iM20141c3;
                    i5 = iM20141c4;
                    zzkmVar5.m20145g(iM20139a2 + 8);
                    zzkmVar5.m20146h(16);
                    int iM20144f3 = zzkmVar5.m20144f();
                    int iM20144f4 = zzkmVar5.m20144f();
                    zzkmVar5.m20146h(4);
                    int iM20150l = zzkmVar5.m20150l();
                    int iM20139a5 = zzkmVar5.m20139a();
                    int iIntValue2 = iM20144f3;
                    int iIntValue3 = iM20150l;
                    byte[] bArrM16001c = null;
                    while (true) {
                        if (iM20139a5 - iM20139a2 < i5) {
                            zzkmVar5.m20145g(iM20139a5);
                            int iM20139a6 = zzkmVar5.m20139a();
                            int iM20141c8 = zzkmVar5.m20141c();
                            i4 = iM20141c;
                            zzkh.m20127b(iM20141c8 > 0, "childAtomSize should be positive");
                            int iM20141c9 = zzkmVar5.m20141c();
                            i3 = iIntValue;
                            if (iM20141c5 != C7283vz.f20795f && iM20141c5 != C7283vz.f20773J) {
                                if (iM20141c5 != C7283vz.f20796g || iM20141c9 != C7283vz.f20797h) {
                                    if (iM20141c5 == C7283vz.f20798i && iM20141c9 == C7283vz.f20799j) {
                                        zzkmVar5.m20145g(iM20139a6 + 8);
                                        c7357xz.f20989b = zzkg.m20125c(zzkmVar5);
                                        break;
                                    }
                                } else {
                                    zzkmVar5.m20145g(iM20139a6 + 8);
                                    c7357xz.f20989b = zzkg.m20124b(zzkmVar5);
                                    break;
                                }
                            } else if (iM20141c9 == C7283vz.f20793d) {
                                bArrM16001c = m16001c(zzkmVar5, iM20139a6);
                                Pair<Integer, Integer> pairM20131b = zzki.m20131b(bArrM16001c);
                                iIntValue3 = ((Integer) pairM20131b.first).intValue();
                                iIntValue2 = ((Integer) pairM20131b.second).intValue();
                            } else if (iM20141c9 == C7283vz.f20768E) {
                                c7357xz.f20988a[i8] = m16000b(zzkmVar5, iM20139a6, iM20141c8);
                            }
                            iM20139a5 += iM20141c8;
                            iM20141c = i4;
                            iIntValue = i3;
                        } else {
                            i3 = iIntValue;
                            i4 = iM20141c;
                            c7357xz.f20989b = zzhj.m20025g(iM20141c5 == C7283vz.f20796g ? "audio/ac3" : iM20141c5 == C7283vz.f20798i ? "audio/eac3" : "audio/mp4a-latm", iM20144f4, jM20156b, iIntValue2, iIntValue3, bArrM16001c == null ? null : Collections.singletonList(bArrM16001c));
                        }
                    }
                } else if (iM20141c5 == C7283vz.f20779P) {
                    c7357xz.f20989b = zzhj.m20026h();
                    i2 = iM20141c3;
                    i3 = iIntValue;
                    i4 = iM20141c;
                    i5 = iM20141c4;
                } else if (iM20141c5 == C7283vz.f20782S) {
                    zzkmVar5.m20145g(iM20139a2 + 8);
                    zzkmVar5.m20146h(24);
                    int iM20144f5 = zzkmVar5.m20144f();
                    int iM20144f6 = zzkmVar5.m20144f();
                    zzkmVar5.m20146h(50);
                    ArrayList arrayList2 = new ArrayList(z ? 1 : 0);
                    int iM20139a7 = zzkmVar5.m20139a();
                    while (iM20139a7 - iM20139a2 < iM20141c4) {
                        zzkmVar5.m20145g(iM20139a7);
                        int iM20139a8 = zzkmVar5.m20139a();
                        int iM20141c10 = zzkmVar5.m20141c();
                        if (iM20141c10 <= 0) {
                            z = false;
                        }
                        zzkh.m20127b(z, "childAtomSize should be positive");
                        int i11 = iM20141c3;
                        if (zzkmVar5.m20141c() == C7283vz.f20793d) {
                            arrayList2.add(m16001c(zzkmVar5, iM20139a8));
                        }
                        iM20139a7 += iM20141c10;
                        iM20141c3 = i11;
                        z = true;
                    }
                    i2 = iM20141c3;
                    i5 = iM20141c4;
                    c7357xz.f20989b = zzhj.m20023e("video/mp4v-es", -1, jM20156b, iM20144f5, iM20144f6, arrayList2);
                    i3 = iIntValue;
                    i4 = iM20141c;
                } else {
                    i2 = iM20141c3;
                    i5 = iM20141c4;
                    i3 = iIntValue;
                    i4 = iM20141c;
                }
                z = true;
            }
            zzkmVar5.m20145g(iM20139a2 + i5);
            i8++;
            iM20141c3 = i2;
            iM20141c = i4;
            iIntValue = i3;
        }
        return new zzix(iIntValue, iM20141c, jM20149k2, jM20156b, c7357xz.f20989b, c7357xz.f20988a, c7357xz.f20990c);
    }

    /* renamed from: b */
    private static zziy m16000b(zzkm zzkmVar, int i2, int i3) {
        int i4 = i2 + 8;
        zziy zziyVar = null;
        while (i4 - i2 < i3) {
            zzkmVar.m20145g(i4);
            int iM20141c = zzkmVar.m20141c();
            int iM20141c2 = zzkmVar.m20141c();
            if (iM20141c2 == C7283vz.f20774K) {
                zzkmVar.m20141c();
            } else if (iM20141c2 == C7283vz.f20769F) {
                zzkmVar.m20146h(4);
                zzkmVar.m20141c();
                zzkmVar.m20141c();
            } else if (iM20141c2 == C7283vz.f20770G) {
                int i5 = i4 + 8;
                while (true) {
                    if (i5 - i4 >= iM20141c) {
                        zziyVar = null;
                        break;
                    }
                    zzkmVar.m20145g(i5);
                    int iM20141c3 = zzkmVar.m20141c();
                    if (zzkmVar.m20141c() == C7283vz.f20771H) {
                        zzkmVar.m20146h(4);
                        int iM20141c4 = zzkmVar.m20141c();
                        boolean z = (iM20141c4 >> 8) == 1;
                        byte[] bArr = new byte[16];
                        zzkmVar.m20148j(bArr, 0, 16);
                        zziyVar = new zziy(z, iM20141c4 & 255, bArr);
                    } else {
                        i5 += iM20141c3;
                    }
                }
            }
            i4 += iM20141c;
        }
        return zziyVar;
    }

    /* renamed from: c */
    private static byte[] m16001c(zzkm zzkmVar, int i2) {
        zzkmVar.m20145g(i2 + 8 + 4);
        zzkmVar.m20146h(1);
        int iM20143e = zzkmVar.m20143e();
        while (iM20143e > 127) {
            iM20143e = zzkmVar.m20143e();
        }
        zzkmVar.m20146h(2);
        int iM20143e2 = zzkmVar.m20143e();
        if ((iM20143e2 & 128) != 0) {
            zzkmVar.m20146h(2);
        }
        if ((iM20143e2 & 64) != 0) {
            zzkmVar.m20146h(zzkmVar.m20144f());
        }
        if ((iM20143e2 & 32) != 0) {
            zzkmVar.m20146h(2);
        }
        zzkmVar.m20146h(1);
        int iM20143e3 = zzkmVar.m20143e();
        while (iM20143e3 > 127) {
            iM20143e3 = zzkmVar.m20143e();
        }
        zzkmVar.m20146h(13);
        zzkmVar.m20146h(1);
        int iM20143e4 = zzkmVar.m20143e();
        int i3 = iM20143e4 & 127;
        while (iM20143e4 > 127) {
            iM20143e4 = zzkmVar.m20143e();
            i3 = (i3 << 8) | (iM20143e4 & 127);
        }
        byte[] bArr = new byte[i3];
        zzkmVar.m20148j(bArr, 0, i3);
        return bArr;
    }
}
