package com.facebook.p157o0.p166r0;

import kotlin.jvm.internal.C9801m;

/* compiled from: Operator.kt */
/* renamed from: com.facebook.o0.r0.i */
/* loaded from: classes2.dex */
public final class C5920i {

    /* renamed from: a */
    public static final C5920i f15449a = new C5920i();

    private C5920i() {
    }

    /* renamed from: a */
    public static final void m12724a(C5917f c5917f, C5917f c5917f2) {
        C9801m.m32346f(c5917f, "x");
        C9801m.m32346f(c5917f2, "b");
        int iM12674b = c5917f.m12674b(0);
        int iM12674b2 = c5917f.m12674b(1);
        int iM12674b3 = c5917f.m12674b(2);
        float[] fArrM12673a = c5917f.m12673a();
        float[] fArrM12673a2 = c5917f2.m12673a();
        if (iM12674b <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (iM12674b2 > 0) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (iM12674b3 > 0) {
                        int i6 = 0;
                        while (true) {
                            int i7 = i6 + 1;
                            int i8 = (i2 * iM12674b2 * iM12674b3) + (i4 * iM12674b3) + i6;
                            fArrM12673a[i8] = fArrM12673a[i8] + fArrM12673a2[i6];
                            if (i7 >= iM12674b3) {
                                break;
                            } else {
                                i6 = i7;
                            }
                        }
                    }
                    if (i5 >= iM12674b2) {
                        break;
                    } else {
                        i4 = i5;
                    }
                }
            }
            if (i3 >= iM12674b) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    /* renamed from: b */
    public static final C5917f m12725b(C5917f[] c5917fArr) {
        int iM12674b;
        C9801m.m32346f(c5917fArr, "tensors");
        int iM12674b2 = c5917fArr[0].m12674b(0);
        int length = c5917fArr.length - 1;
        if (length >= 0) {
            int i2 = 0;
            iM12674b = 0;
            while (true) {
                int i3 = i2 + 1;
                iM12674b += c5917fArr[i2].m12674b(1);
                if (i3 > length) {
                    break;
                }
                i2 = i3;
            }
        } else {
            iM12674b = 0;
        }
        C5917f c5917f = new C5917f(new int[]{iM12674b2, iM12674b});
        float[] fArrM12673a = c5917f.m12673a();
        if (iM12674b2 > 0) {
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                int i6 = i4 * iM12674b;
                int length2 = c5917fArr.length - 1;
                if (length2 >= 0) {
                    int i7 = 0;
                    while (true) {
                        int i8 = i7 + 1;
                        float[] fArrM12673a2 = c5917fArr[i7].m12673a();
                        int iM12674b3 = c5917fArr[i7].m12674b(1);
                        System.arraycopy(fArrM12673a2, i4 * iM12674b3, fArrM12673a, i6, iM12674b3);
                        i6 += iM12674b3;
                        if (i8 > length2) {
                            break;
                        }
                        i7 = i8;
                    }
                }
                if (i5 >= iM12674b2) {
                    break;
                }
                i4 = i5;
            }
        }
        return c5917f;
    }

    /* renamed from: c */
    public static final C5917f m12726c(C5917f c5917f, C5917f c5917f2) {
        C5917f c5917f3;
        int i2;
        int i3;
        C9801m.m32346f(c5917f, "x");
        C9801m.m32346f(c5917f2, "w");
        int iM12674b = c5917f.m12674b(0);
        int iM12674b2 = c5917f.m12674b(1);
        int iM12674b3 = c5917f.m12674b(2);
        int iM12674b4 = c5917f2.m12674b(0);
        int i4 = (iM12674b2 - iM12674b4) + 1;
        int iM12674b5 = c5917f2.m12674b(2);
        C5917f c5917f4 = new C5917f(new int[]{iM12674b, i4, iM12674b5});
        float[] fArrM12673a = c5917f.m12673a();
        float[] fArrM12673a2 = c5917f4.m12673a();
        float[] fArrM12673a3 = c5917f2.m12673a();
        if (iM12674b <= 0) {
            return c5917f4;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            if (iM12674b5 > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    if (i4 > 0) {
                        int i9 = 0;
                        while (true) {
                            int i10 = i9 + 1;
                            float f2 = 0.0f;
                            if (iM12674b4 > 0) {
                                int i11 = 0;
                                while (true) {
                                    c5917f3 = c5917f4;
                                    int i12 = i11 + 1;
                                    if (iM12674b3 > 0) {
                                        int i13 = 0;
                                        while (true) {
                                            i3 = iM12674b;
                                            int i14 = i13 + 1;
                                            f2 += fArrM12673a[(iM12674b2 * iM12674b3 * i5) + ((i11 + i9) * iM12674b3) + i13] * fArrM12673a3[(((i11 * iM12674b3) + i13) * iM12674b5) + i7];
                                            if (i14 >= iM12674b3) {
                                                break;
                                            }
                                            i13 = i14;
                                            iM12674b = i3;
                                        }
                                    } else {
                                        i3 = iM12674b;
                                    }
                                    if (i12 >= iM12674b4) {
                                        break;
                                    }
                                    i11 = i12;
                                    c5917f4 = c5917f3;
                                    iM12674b = i3;
                                }
                            } else {
                                i3 = iM12674b;
                                c5917f3 = c5917f4;
                            }
                            fArrM12673a2[(i4 * iM12674b5 * i5) + (i9 * iM12674b5) + i7] = f2;
                            if (i10 >= i4) {
                                break;
                            }
                            i9 = i10;
                            c5917f4 = c5917f3;
                            iM12674b = i3;
                        }
                    } else {
                        i3 = iM12674b;
                        c5917f3 = c5917f4;
                    }
                    if (i8 >= iM12674b5) {
                        break;
                    }
                    i7 = i8;
                    c5917f4 = c5917f3;
                    iM12674b = i3;
                }
                i2 = i3;
            } else {
                c5917f3 = c5917f4;
                i2 = iM12674b;
            }
            if (i6 >= i2) {
                return c5917f3;
            }
            iM12674b = i2;
            i5 = i6;
            c5917f4 = c5917f3;
        }
    }

    /* renamed from: d */
    public static final C5917f m12727d(C5917f c5917f, C5917f c5917f2, C5917f c5917f3) {
        C9801m.m32346f(c5917f, "x");
        C9801m.m32346f(c5917f2, "w");
        C9801m.m32346f(c5917f3, "b");
        int iM12674b = c5917f.m12674b(0);
        int iM12674b2 = c5917f3.m12674b(0);
        C5917f c5917fM12731h = m12731h(c5917f, c5917f2);
        float[] fArrM12673a = c5917f3.m12673a();
        float[] fArrM12673a2 = c5917fM12731h.m12673a();
        if (iM12674b > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (iM12674b2 > 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        int i6 = (i2 * iM12674b2) + i4;
                        fArrM12673a2[i6] = fArrM12673a2[i6] + fArrM12673a[i4];
                        if (i5 >= iM12674b2) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                if (i3 >= iM12674b) {
                    break;
                }
                i2 = i3;
            }
        }
        return c5917fM12731h;
    }

    /* renamed from: e */
    public static final C5917f m12728e(String[] strArr, int i2, C5917f c5917f) {
        C9801m.m32346f(strArr, "texts");
        C9801m.m32346f(c5917f, "w");
        int length = strArr.length;
        int iM12674b = c5917f.m12674b(1);
        C5917f c5917f2 = new C5917f(new int[]{length, i2, iM12674b});
        float[] fArrM12673a = c5917f2.m12673a();
        float[] fArrM12673a2 = c5917f.m12673a();
        if (length > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                int[] iArrM12739d = C5921j.f15450a.m12739d(strArr[i3], i2);
                if (i2 > 0) {
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        System.arraycopy(fArrM12673a2, iArrM12739d[i5] * iM12674b, fArrM12673a, (iM12674b * i2 * i3) + (i5 * iM12674b), iM12674b);
                        if (i6 >= i2) {
                            break;
                        }
                        i5 = i6;
                    }
                }
                if (i4 >= length) {
                    break;
                }
                i3 = i4;
            }
        }
        return c5917f2;
    }

    /* renamed from: f */
    public static final void m12729f(C5917f c5917f, int i2) {
        C9801m.m32346f(c5917f, "x");
        if (i2 >= c5917f.m12675c()) {
            return;
        }
        int iM12675c = c5917f.m12675c();
        int iM12674b = 1;
        if (i2 < iM12675c) {
            int i3 = i2;
            while (true) {
                int i4 = i3 + 1;
                iM12674b *= c5917f.m12674b(i3);
                if (i4 >= iM12675c) {
                    break;
                } else {
                    i3 = i4;
                }
            }
        }
        int[] iArr = new int[i2 + 1];
        int i5 = 0;
        if (i2 > 0) {
            while (true) {
                int i6 = i5 + 1;
                iArr[i5] = c5917f.m12674b(i5);
                if (i6 >= i2) {
                    break;
                } else {
                    i5 = i6;
                }
            }
        }
        iArr[i2] = iM12674b;
        c5917f.m12676d(iArr);
    }

    /* renamed from: g */
    public static final C5917f m12730g(C5917f c5917f, int i2) {
        int i3;
        C9801m.m32346f(c5917f, "x");
        int iM12674b = c5917f.m12674b(0);
        int iM12674b2 = c5917f.m12674b(1);
        int iM12674b3 = c5917f.m12674b(2);
        int i4 = (iM12674b2 - i2) + 1;
        C5917f c5917f2 = new C5917f(new int[]{iM12674b, i4, iM12674b3});
        float[] fArrM12673a = c5917f.m12673a();
        float[] fArrM12673a2 = c5917f2.m12673a();
        if (iM12674b > 0) {
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (iM12674b3 > 0) {
                    int i7 = 0;
                    while (true) {
                        int i8 = i7 + 1;
                        if (i4 > 0) {
                            int i9 = 0;
                            while (true) {
                                int i10 = i9 + 1;
                                int i11 = i9 * iM12674b3;
                                int i12 = (i5 * i4 * iM12674b3) + i11 + i7;
                                int i13 = (i5 * iM12674b2 * iM12674b3) + i11 + i7;
                                fArrM12673a2[i12] = Float.MIN_VALUE;
                                if (i2 > 0) {
                                    int i14 = 0;
                                    while (true) {
                                        int i15 = i14 + 1;
                                        i3 = iM12674b2;
                                        fArrM12673a2[i12] = Math.max(fArrM12673a2[i12], fArrM12673a[i13 + (i14 * iM12674b3)]);
                                        if (i15 >= i2) {
                                            break;
                                        }
                                        i14 = i15;
                                        iM12674b2 = i3;
                                    }
                                } else {
                                    i3 = iM12674b2;
                                }
                                if (i10 >= i4) {
                                    break;
                                }
                                i9 = i10;
                                iM12674b2 = i3;
                            }
                        } else {
                            i3 = iM12674b2;
                        }
                        if (i8 >= iM12674b3) {
                            break;
                        }
                        i7 = i8;
                        iM12674b2 = i3;
                    }
                } else {
                    i3 = iM12674b2;
                }
                if (i6 >= iM12674b) {
                    break;
                }
                i5 = i6;
                iM12674b2 = i3;
            }
        }
        return c5917f2;
    }

    /* renamed from: h */
    public static final C5917f m12731h(C5917f c5917f, C5917f c5917f2) {
        C9801m.m32346f(c5917f, "x");
        C9801m.m32346f(c5917f2, "w");
        int iM12674b = c5917f.m12674b(0);
        int iM12674b2 = c5917f2.m12674b(0);
        int iM12674b3 = c5917f2.m12674b(1);
        C5917f c5917f3 = new C5917f(new int[]{iM12674b, iM12674b3});
        float[] fArrM12673a = c5917f.m12673a();
        float[] fArrM12673a2 = c5917f2.m12673a();
        float[] fArrM12673a3 = c5917f3.m12673a();
        if (iM12674b > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (iM12674b3 > 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        int i6 = (i2 * iM12674b3) + i4;
                        fArrM12673a3[i6] = 0.0f;
                        if (iM12674b2 > 0) {
                            int i7 = 0;
                            while (true) {
                                int i8 = i7 + 1;
                                fArrM12673a3[i6] = fArrM12673a3[i6] + (fArrM12673a[(i2 * iM12674b2) + i7] * fArrM12673a2[(i7 * iM12674b3) + i4]);
                                if (i8 >= iM12674b2) {
                                    break;
                                }
                                i7 = i8;
                            }
                        }
                        if (i5 >= iM12674b3) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                if (i3 >= iM12674b) {
                    break;
                }
                i2 = i3;
            }
        }
        return c5917f3;
    }

    /* renamed from: i */
    public static final void m12732i(C5917f c5917f) {
        C9801m.m32346f(c5917f, "x");
        float[] fArrM12673a = c5917f.m12673a();
        int length = fArrM12673a.length - 1;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (fArrM12673a[i2] < 0.0f) {
                fArrM12673a[i2] = 0.0f;
            }
            if (i3 > length) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    /* renamed from: j */
    public static final void m12733j(C5917f c5917f) {
        C9801m.m32346f(c5917f, "x");
        int i2 = 0;
        int iM12674b = c5917f.m12674b(0);
        int iM12674b2 = c5917f.m12674b(1);
        float[] fArrM12673a = c5917f.m12673a();
        if (iM12674b <= 0) {
            return;
        }
        while (true) {
            int i3 = i2 + 1;
            int i4 = i2 * iM12674b2;
            int i5 = i4 + iM12674b2;
            float f2 = Float.MIN_VALUE;
            float f3 = 0.0f;
            if (i4 < i5) {
                int i6 = i4;
                while (true) {
                    int i7 = i6 + 1;
                    if (fArrM12673a[i6] > f2) {
                        f2 = fArrM12673a[i6];
                    }
                    if (i7 >= i5) {
                        break;
                    } else {
                        i6 = i7;
                    }
                }
            }
            if (i4 < i5) {
                int i8 = i4;
                while (true) {
                    int i9 = i8 + 1;
                    fArrM12673a[i8] = (float) Math.exp(fArrM12673a[i8] - f2);
                    f3 += fArrM12673a[i8];
                    if (i9 >= i5) {
                        break;
                    } else {
                        i8 = i9;
                    }
                }
            }
            if (i4 < i5) {
                while (true) {
                    int i10 = i4 + 1;
                    fArrM12673a[i4] = fArrM12673a[i4] / f3;
                    if (i10 >= i5) {
                        break;
                    } else {
                        i4 = i10;
                    }
                }
            }
            if (i3 >= iM12674b) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    /* renamed from: k */
    public static final C5917f m12734k(C5917f c5917f) {
        C9801m.m32346f(c5917f, "x");
        int iM12674b = c5917f.m12674b(0);
        int iM12674b2 = c5917f.m12674b(1);
        C5917f c5917f2 = new C5917f(new int[]{iM12674b2, iM12674b});
        float[] fArrM12673a = c5917f.m12673a();
        float[] fArrM12673a2 = c5917f2.m12673a();
        if (iM12674b > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (iM12674b2 > 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        fArrM12673a2[(i4 * iM12674b) + i2] = fArrM12673a[(i2 * iM12674b2) + i4];
                        if (i5 >= iM12674b2) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                if (i3 >= iM12674b) {
                    break;
                }
                i2 = i3;
            }
        }
        return c5917f2;
    }

    /* renamed from: l */
    public static final C5917f m12735l(C5917f c5917f) {
        C9801m.m32346f(c5917f, "x");
        int iM12674b = c5917f.m12674b(0);
        int iM12674b2 = c5917f.m12674b(1);
        int iM12674b3 = c5917f.m12674b(2);
        C5917f c5917f2 = new C5917f(new int[]{iM12674b3, iM12674b2, iM12674b});
        float[] fArrM12673a = c5917f.m12673a();
        float[] fArrM12673a2 = c5917f2.m12673a();
        if (iM12674b > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (iM12674b2 > 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        if (iM12674b3 > 0) {
                            int i6 = 0;
                            while (true) {
                                int i7 = i6 + 1;
                                fArrM12673a2[(i6 * iM12674b * iM12674b2) + (i4 * iM12674b) + i2] = fArrM12673a[(i2 * iM12674b2 * iM12674b3) + (i4 * iM12674b3) + i6];
                                if (i7 >= iM12674b3) {
                                    break;
                                }
                                i6 = i7;
                            }
                        }
                        if (i5 >= iM12674b2) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                if (i3 >= iM12674b) {
                    break;
                }
                i2 = i3;
            }
        }
        return c5917f2;
    }
}
