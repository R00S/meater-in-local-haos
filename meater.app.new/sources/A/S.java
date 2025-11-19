package A;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: RowColumnMeasurePolicy.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LA/Q;", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "arrangementSpacingInt", "Ly0/K;", "measureScope", "", "Ly0/H;", "measurables", "", "Ly0/Z;", "placeables", "startIndex", "endIndex", "", "crossAxisOffset", "currentLineIndex", "Ly0/J;", "a", "(LA/Q;IIIIILy0/K;Ljava/util/List;[Ly0/Z;II[II)Ly0/J;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S {
    public static final y0.J a(Q q10, int i10, int i11, int i12, int i13, int i14, y0.K k10, List<? extends y0.H> list, y0.Z[] zArr, int i15, int i16, int[] iArr, int i17) {
        int[] iArr2;
        long j10;
        long j11;
        String str;
        String str2;
        int i18;
        Integer num;
        int i19;
        int iK;
        int i20;
        String str3;
        int i21;
        float f10;
        String str4;
        float f11;
        long j12;
        long j13;
        String str5;
        String str6;
        String str7;
        String str8;
        int i22;
        int i23;
        String str9;
        float f12;
        int i24;
        int i25;
        float f13;
        String str10;
        long j14;
        int i26;
        String str11;
        String str12;
        int i27;
        int i28;
        float f14;
        float f15;
        char c10;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        long j15;
        int[] iArr3;
        int i35;
        int i36;
        float f16;
        int[] iArr4;
        int i37;
        List<? extends y0.H> list2 = list;
        int i38 = i16;
        int i39 = i38 - i15;
        int i40 = 0;
        int i41 = i15;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int[] iArr5 = new int[i39];
        long j16 = i14;
        float f17 = 0.0f;
        int i46 = 0;
        while (true) {
            if (i41 >= i38) {
                break;
            }
            int i47 = i46;
            y0.H h10 = list2.get(i41);
            RowColumnParentData rowColumnParentDataC = P.c(h10);
            float fE = P.e(rowColumnParentDataC);
            i45 = (i45 != 0 || P.f(rowColumnParentDataC)) ? 1 : i40;
            if (fE > 0.0f) {
                i44++;
                i34 = i41;
                j15 = j16;
                iArr4 = iArr5;
                i36 = i39;
                f16 = f17 + fE;
                i37 = i40;
            } else {
                if (i13 != Integer.MAX_VALUE && rowColumnParentDataC != null) {
                    rowColumnParentDataC.c();
                }
                int i48 = i12 - i43;
                y0.Z zT = zArr[i41];
                if (zT == null) {
                    i31 = i48;
                    i32 = i43;
                    i33 = i44;
                    i34 = i41;
                    iArr3 = iArr5;
                    j15 = j16;
                    i35 = i47;
                    i36 = i39;
                    f16 = f17;
                    zT = h10.T(Q.n(q10, 0, 0, i12 != Integer.MAX_VALUE ? Ha.g.d(i48, i40) : Integer.MAX_VALUE, i13, false, 16, null));
                } else {
                    i31 = i48;
                    i32 = i43;
                    i33 = i44;
                    i34 = i41;
                    j15 = j16;
                    iArr3 = iArr5;
                    i35 = i47;
                    i36 = i39;
                    f16 = f17;
                }
                y0.Z z10 = zT;
                int iF = q10.f(z10);
                int iK2 = q10.k(z10);
                iArr4 = iArr3;
                iArr4[i34 - i15] = iF;
                i37 = 0;
                int iMin = Math.min(i14, Ha.g.d(i31 - iF, 0));
                i43 = iF + iMin + i32;
                int iMax = Math.max(i35, iK2);
                zArr[i34] = z10;
                i47 = iMax;
                i42 = iMin;
                i44 = i33;
            }
            i41 = i34 + 1;
            iArr5 = iArr4;
            i40 = i37;
            f17 = f16;
            i39 = i36;
            i46 = i47;
            j16 = j15;
        }
        int i49 = i46;
        long j17 = j16;
        int[] iArr6 = iArr5;
        int i50 = i39;
        float f18 = f17;
        int i51 = i40;
        int i52 = i43;
        int i53 = i44;
        if (i53 == 0) {
            i20 = i52 - i42;
            iArr2 = iArr6;
            iK = i51;
            i18 = i10;
            i19 = i49;
            num = null;
        } else {
            int i54 = i12 != Integer.MAX_VALUE ? i12 : i10;
            iArr2 = iArr6;
            long j18 = (i53 - 1) * j17;
            long jE = Ha.g.e((i54 - i52) - j18, 0L);
            float f19 = jE / f18;
            int i55 = i15;
            long jRound = jE;
            while (true) {
                j10 = jE;
                j11 = j18;
                str = "arrangementSpacingPx ";
                str2 = "targetSpace ";
                if (i55 >= i38) {
                    break;
                }
                float fE2 = P.e(P.c(list2.get(i55)));
                float f20 = f19 * fE2;
                try {
                    jRound -= Math.round(f20);
                    i55++;
                    list2 = list;
                    i38 = i16;
                    jE = j10;
                    j18 = j11;
                } catch (IllegalArgumentException e10) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + i12 + "mainAxisMin " + i10 + "targetSpace " + i54 + "arrangementSpacingPx " + j17 + "weightChildrenCount " + i53 + "fixedSpace " + i52 + "arrangementSpacingTotal " + j11 + "remainingToTarget " + j10 + "totalWeight " + f18 + "weightUnitSpace " + f19 + "itemWeight " + fE2 + "weightedSize " + f20).initCause(e10);
                }
            }
            i18 = i10;
            float f21 = f18;
            String str13 = "weightedSize ";
            String str14 = "weightUnitSpace ";
            String str15 = "totalWeight ";
            long j19 = j10;
            String str16 = "remainingToTarget ";
            long j20 = j11;
            String str17 = "arrangementSpacingTotal ";
            long j21 = j17;
            int i56 = i49;
            int i57 = 0;
            int i58 = i15;
            int i59 = i16;
            while (i58 < i59) {
                if (zArr[i58] == null) {
                    y0.H h11 = list.get(i58);
                    RowColumnParentData rowColumnParentDataC2 = P.c(h11);
                    float fE3 = P.e(rowColumnParentDataC2);
                    String str18 = str;
                    int i60 = i54;
                    if (i13 != Integer.MAX_VALUE && rowColumnParentDataC2 != null) {
                        rowColumnParentDataC2.c();
                    }
                    if (fE3 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    int iB = Da.a.b(jRound);
                    String str19 = str2;
                    jRound -= iB;
                    float f22 = f19 * fE3;
                    int iMax2 = Math.max(0, Math.round(f22) + iB);
                    try {
                    } catch (IllegalArgumentException e11) {
                        e = e11;
                        f12 = f22;
                        i24 = i53;
                        i25 = i52;
                        f13 = fE3;
                        str10 = str13;
                        j14 = j20;
                        i26 = i60;
                        str11 = str18;
                        str12 = str19;
                        i27 = iB;
                        i28 = iMax2;
                        f14 = f19;
                        f15 = f21;
                        j12 = j21;
                    }
                    try {
                        if (P.b(rowColumnParentDataC2)) {
                            c10 = 65535;
                            int i61 = iMax2 != Integer.MAX_VALUE ? iMax2 : 0;
                            j14 = j20;
                            str11 = str18;
                            i27 = iB;
                            i28 = iMax2;
                            str12 = str19;
                            int i62 = i61;
                            f12 = f22;
                            i26 = i60;
                            i24 = i53;
                            i25 = i52;
                            f13 = fE3;
                            f14 = f19;
                            str10 = str13;
                            f15 = f21;
                            j12 = j21;
                            y0.Z zT2 = h11.T(q10.b(i62, 0, i28, i13, true));
                            int iF2 = q10.f(zT2);
                            int iK3 = q10.k(zT2);
                            iArr2[i58 - i15] = iF2;
                            i57 += iF2;
                            int iMax3 = Math.max(i56, iK3);
                            zArr[i58] = zT2;
                            i56 = iMax3;
                            str4 = str10;
                            f11 = f15;
                            f10 = f14;
                            j13 = j19;
                            str5 = str14;
                            str6 = str15;
                            str7 = str16;
                            str8 = str17;
                            j20 = j14;
                            str3 = str11;
                            str9 = str12;
                            i22 = i26;
                            i23 = i24;
                            i21 = i25;
                        } else {
                            c10 = 65535;
                        }
                        y0.Z zT22 = h11.T(q10.b(i62, 0, i28, i13, true));
                        int iF22 = q10.f(zT22);
                        int iK32 = q10.k(zT22);
                        iArr2[i58 - i15] = iF22;
                        i57 += iF22;
                        int iMax32 = Math.max(i56, iK32);
                        zArr[i58] = zT22;
                        i56 = iMax32;
                        str4 = str10;
                        f11 = f15;
                        f10 = f14;
                        j13 = j19;
                        str5 = str14;
                        str6 = str15;
                        str7 = str16;
                        str8 = str17;
                        j20 = j14;
                        str3 = str11;
                        str9 = str12;
                        i22 = i26;
                        i23 = i24;
                        i21 = i25;
                    } catch (IllegalArgumentException e12) {
                        e = e12;
                        throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i12 + "mainAxisMin " + i18 + str12 + i26 + str11 + j12 + "weightChildrenCount " + i24 + "fixedSpace " + i25 + str17 + j14 + str16 + j19 + str15 + f15 + str14 + f14 + "weight " + f13 + str10 + f12 + "crossAxisDesiredSize " + ((Object) null) + "remainderUnit " + i27 + "childMainAxisSize " + i28).initCause(e);
                    }
                    j14 = j20;
                    str11 = str18;
                    i27 = iB;
                    i28 = iMax2;
                    str12 = str19;
                    int i622 = i61;
                    f12 = f22;
                    i26 = i60;
                    i24 = i53;
                    i25 = i52;
                    f13 = fE3;
                    f14 = f19;
                    str10 = str13;
                    f15 = f21;
                    j12 = j21;
                } else {
                    str3 = str;
                    i21 = i52;
                    f10 = f19;
                    str4 = str13;
                    f11 = f21;
                    j12 = j21;
                    j13 = j19;
                    str5 = str14;
                    str6 = str15;
                    str7 = str16;
                    str8 = str17;
                    i22 = i54;
                    i23 = i53;
                    str9 = str2;
                }
                i58++;
                str2 = str9;
                i54 = i22;
                str = str3;
                i53 = i23;
                i52 = i21;
                j19 = j13;
                f19 = f10;
                str14 = str5;
                str15 = str6;
                str16 = str7;
                str17 = str8;
                i59 = i16;
                j21 = j12;
                f21 = f11;
                str13 = str4;
            }
            int i63 = i52;
            num = null;
            i19 = i56;
            iK = Ha.g.k((int) (i57 + j20), 0, i12 - i63);
            i20 = i63;
        }
        if (i45 != 0) {
            int iMax4 = 0;
            int iMax5 = 0;
            for (int i64 = i15; i64 < i16; i64++) {
                y0.Z z11 = zArr[i64];
                C3862t.d(z11);
                AbstractC0805m abstractC0805mA = P.a(P.d(z11));
                Integer numB = abstractC0805mA != null ? abstractC0805mA.b(z11) : num;
                if (numB != null) {
                    int iIntValue = numB.intValue();
                    int iK4 = q10.k(z11);
                    iMax4 = Math.max(iMax4, iIntValue != Integer.MIN_VALUE ? numB.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iK4;
                    }
                    iMax5 = Math.max(iMax5, iK4 - iIntValue);
                }
            }
            i29 = iMax5;
            i30 = iMax4;
        } else {
            i29 = 0;
            i30 = 0;
        }
        int iMax6 = Math.max(Ha.g.d(i20 + iK, 0), i18);
        int iMax7 = Math.max(i19, Math.max(i11, i29 + i30));
        int[] iArr7 = new int[i50];
        for (int i65 = 0; i65 < i50; i65++) {
            iArr7[i65] = 0;
        }
        q10.g(iMax6, iArr2, iArr7, k10);
        return q10.a(zArr, k10, i30, iArr7, iMax6, iMax7, iArr, i17, i15, i16);
    }
}
