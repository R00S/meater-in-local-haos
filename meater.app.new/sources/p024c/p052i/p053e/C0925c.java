package p024c.p052i.p053e;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: PathParser.java */
/* renamed from: c.i.e.c */
/* loaded from: classes.dex */
public class C0925c {

    /* compiled from: PathParser.java */
    /* renamed from: c.i.e.c$a */
    private static class a {

        /* renamed from: a */
        int f6287a;

        /* renamed from: b */
        boolean f6288b;

        a() {
        }
    }

    /* renamed from: a */
    private static void m5893a(ArrayList<b> arrayList, char c2, float[] fArr) {
        arrayList.add(new b(c2, fArr));
    }

    /* renamed from: b */
    public static boolean m5894b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            if (bVarArr[i2].f6289a != bVarArr2[i2].f6289a || bVarArr[i2].f6290b.length != bVarArr2[i2].f6290b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    static float[] m5895c(float[] fArr, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i2 < 0 || i2 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = i3 - i2;
        int iMin = Math.min(i4, length - i2);
        float[] fArr2 = new float[i4];
        System.arraycopy(fArr, i2, fArr2, 0, iMin);
        return fArr2;
    }

    /* renamed from: d */
    public static b[] m5896d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        while (i2 < str.length()) {
            int iM5901i = m5901i(str, i2);
            String strTrim = str.substring(i3, iM5901i).trim();
            if (strTrim.length() > 0) {
                m5893a(arrayList, strTrim.charAt(0), m5900h(strTrim));
            }
            i3 = iM5901i;
            i2 = iM5901i + 1;
        }
        if (i2 - i3 == 1 && i3 < str.length()) {
            m5893a(arrayList, str.charAt(i3), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    /* renamed from: e */
    public static Path m5897e(String str) {
        Path path = new Path();
        b[] bVarArrM5896d = m5896d(str);
        if (bVarArrM5896d == null) {
            return null;
        }
        try {
            b.m5906e(bVarArrM5896d, path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing " + str, e2);
        }
    }

    /* renamed from: f */
    public static b[] m5898f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            bVarArr2[i2] = new b(bVarArr[i2]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a A[LOOP:0: B:3:0x0007->B:24:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m5899g(java.lang.String r8, int r9, p024c.p052i.p053e.C0925c.a r10) {
        /*
            r0 = 0
            r10.f6288b = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3d
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L35
            r6 = 69
            if (r5 == r6) goto L33
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L33
            switch(r5) {
                case 44: goto L35;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L31
        L22:
            if (r3 != 0) goto L27
            r2 = 0
            r3 = 1
            goto L37
        L27:
            r10.f6288b = r7
            goto L35
        L2a:
            if (r1 == r9) goto L31
            if (r2 != 0) goto L31
            r10.f6288b = r7
            goto L35
        L31:
            r2 = 0
            goto L37
        L33:
            r2 = 1
            goto L37
        L35:
            r2 = 0
            r4 = 1
        L37:
            if (r4 == 0) goto L3a
            goto L3d
        L3a:
            int r1 = r1 + 1
            goto L7
        L3d:
            r10.f6287a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p052i.p053e.C0925c.m5899g(java.lang.String, int, c.i.e.c$a):void");
    }

    /* renamed from: h */
    private static float[] m5900h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i2 = 1;
            int i3 = 0;
            while (i2 < length) {
                m5899g(str, i2, aVar);
                int i4 = aVar.f6287a;
                if (i2 < i4) {
                    fArr[i3] = Float.parseFloat(str.substring(i2, i4));
                    i3++;
                }
                i2 = aVar.f6288b ? i4 : i4 + 1;
            }
            return m5895c(fArr, 0, i3);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e2);
        }
    }

    /* renamed from: i */
    private static int m5901i(String str, int i2) {
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i2;
            }
            i2++;
        }
        return i2;
    }

    /* renamed from: j */
    public static void m5902j(b[] bVarArr, b[] bVarArr2) {
        for (int i2 = 0; i2 < bVarArr2.length; i2++) {
            bVarArr[i2].f6289a = bVarArr2[i2].f6289a;
            for (int i3 = 0; i3 < bVarArr2[i2].f6290b.length; i3++) {
                bVarArr[i2].f6290b[i3] = bVarArr2[i2].f6290b[i3];
            }
        }
    }

    /* compiled from: PathParser.java */
    /* renamed from: c.i.e.c$b */
    public static class b {

        /* renamed from: a */
        public char f6289a;

        /* renamed from: b */
        public float[] f6290b;

        b(char c2, float[] fArr) {
            this.f6289a = c2;
            this.f6290b = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        private static void m5903a(Path path, float[] fArr, char c2, char c3, float[] fArr2) {
            int i2;
            int i3;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            char c4 = c3;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i2 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f14, f15);
                    f10 = f14;
                    f12 = f10;
                    f11 = f15;
                    f13 = f11;
                    i2 = 2;
                    break;
            }
            float f16 = f10;
            float f17 = f11;
            float f18 = f14;
            float f19 = f15;
            int i4 = 0;
            char c5 = c2;
            while (i4 < fArr2.length) {
                if (c4 != 'A') {
                    if (c4 == 'C') {
                        i3 = i4;
                        int i5 = i3 + 2;
                        int i6 = i3 + 3;
                        int i7 = i3 + 4;
                        int i8 = i3 + 5;
                        path.cubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i5], fArr2[i6], fArr2[i7], fArr2[i8]);
                        f16 = fArr2[i7];
                        float f20 = fArr2[i8];
                        float f21 = fArr2[i5];
                        float f22 = fArr2[i6];
                        f17 = f20;
                        f13 = f22;
                        f12 = f21;
                    } else if (c4 == 'H') {
                        i3 = i4;
                        int i9 = i3 + 0;
                        path.lineTo(fArr2[i9], f17);
                        f16 = fArr2[i9];
                    } else if (c4 == 'Q') {
                        i3 = i4;
                        int i10 = i3 + 0;
                        int i11 = i3 + 1;
                        int i12 = i3 + 2;
                        int i13 = i3 + 3;
                        path.quadTo(fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i13]);
                        float f23 = fArr2[i10];
                        float f24 = fArr2[i11];
                        f16 = fArr2[i12];
                        f17 = fArr2[i13];
                        f12 = f23;
                        f13 = f24;
                    } else if (c4 == 'V') {
                        i3 = i4;
                        int i14 = i3 + 0;
                        path.lineTo(f16, fArr2[i14]);
                        f17 = fArr2[i14];
                    } else if (c4 != 'a') {
                        if (c4 != 'c') {
                            if (c4 == 'h') {
                                int i15 = i4 + 0;
                                path.rLineTo(fArr2[i15], 0.0f);
                                f16 += fArr2[i15];
                            } else if (c4 != 'q') {
                                if (c4 == 'v') {
                                    int i16 = i4 + 0;
                                    path.rLineTo(0.0f, fArr2[i16]);
                                    f5 = fArr2[i16];
                                } else if (c4 == 'L') {
                                    int i17 = i4 + 0;
                                    int i18 = i4 + 1;
                                    path.lineTo(fArr2[i17], fArr2[i18]);
                                    f16 = fArr2[i17];
                                    f17 = fArr2[i18];
                                } else if (c4 == 'M') {
                                    int i19 = i4 + 0;
                                    f16 = fArr2[i19];
                                    int i20 = i4 + 1;
                                    f17 = fArr2[i20];
                                    if (i4 > 0) {
                                        path.lineTo(fArr2[i19], fArr2[i20]);
                                    } else {
                                        path.moveTo(fArr2[i19], fArr2[i20]);
                                        i3 = i4;
                                        f19 = f17;
                                        f18 = f16;
                                    }
                                } else if (c4 == 'S') {
                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                        f16 = (f16 * 2.0f) - f12;
                                        f17 = (f17 * 2.0f) - f13;
                                    }
                                    float f25 = f17;
                                    int i21 = i4 + 0;
                                    int i22 = i4 + 1;
                                    int i23 = i4 + 2;
                                    int i24 = i4 + 3;
                                    path.cubicTo(f16, f25, fArr2[i21], fArr2[i22], fArr2[i23], fArr2[i24]);
                                    f2 = fArr2[i21];
                                    f3 = fArr2[i22];
                                    f16 = fArr2[i23];
                                    f17 = fArr2[i24];
                                    f12 = f2;
                                    f13 = f3;
                                } else if (c4 == 'T') {
                                    if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                        f16 = (f16 * 2.0f) - f12;
                                        f17 = (f17 * 2.0f) - f13;
                                    }
                                    int i25 = i4 + 0;
                                    int i26 = i4 + 1;
                                    path.quadTo(f16, f17, fArr2[i25], fArr2[i26]);
                                    float f26 = fArr2[i25];
                                    float f27 = fArr2[i26];
                                    i3 = i4;
                                    f13 = f17;
                                    f12 = f16;
                                    f16 = f26;
                                    f17 = f27;
                                } else if (c4 == 'l') {
                                    int i27 = i4 + 0;
                                    int i28 = i4 + 1;
                                    path.rLineTo(fArr2[i27], fArr2[i28]);
                                    f16 += fArr2[i27];
                                    f5 = fArr2[i28];
                                } else if (c4 == 'm') {
                                    int i29 = i4 + 0;
                                    f16 += fArr2[i29];
                                    int i30 = i4 + 1;
                                    f17 += fArr2[i30];
                                    if (i4 > 0) {
                                        path.rLineTo(fArr2[i29], fArr2[i30]);
                                    } else {
                                        path.rMoveTo(fArr2[i29], fArr2[i30]);
                                        i3 = i4;
                                        f19 = f17;
                                        f18 = f16;
                                    }
                                } else if (c4 == 's') {
                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                        float f28 = f16 - f12;
                                        f6 = f17 - f13;
                                        f7 = f28;
                                    } else {
                                        f7 = 0.0f;
                                        f6 = 0.0f;
                                    }
                                    int i31 = i4 + 0;
                                    int i32 = i4 + 1;
                                    int i33 = i4 + 2;
                                    int i34 = i4 + 3;
                                    path.rCubicTo(f7, f6, fArr2[i31], fArr2[i32], fArr2[i33], fArr2[i34]);
                                    f2 = fArr2[i31] + f16;
                                    f3 = fArr2[i32] + f17;
                                    f16 += fArr2[i33];
                                    f4 = fArr2[i34];
                                } else if (c4 == 't') {
                                    if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                        f8 = f16 - f12;
                                        f9 = f17 - f13;
                                    } else {
                                        f9 = 0.0f;
                                        f8 = 0.0f;
                                    }
                                    int i35 = i4 + 0;
                                    int i36 = i4 + 1;
                                    path.rQuadTo(f8, f9, fArr2[i35], fArr2[i36]);
                                    float f29 = f8 + f16;
                                    float f30 = f9 + f17;
                                    f16 += fArr2[i35];
                                    f17 += fArr2[i36];
                                    f13 = f30;
                                    f12 = f29;
                                }
                                f17 += f5;
                            } else {
                                int i37 = i4 + 0;
                                int i38 = i4 + 1;
                                int i39 = i4 + 2;
                                int i40 = i4 + 3;
                                path.rQuadTo(fArr2[i37], fArr2[i38], fArr2[i39], fArr2[i40]);
                                f2 = fArr2[i37] + f16;
                                f3 = fArr2[i38] + f17;
                                f16 += fArr2[i39];
                                f4 = fArr2[i40];
                            }
                            i3 = i4;
                        } else {
                            int i41 = i4 + 2;
                            int i42 = i4 + 3;
                            int i43 = i4 + 4;
                            int i44 = i4 + 5;
                            path.rCubicTo(fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i41], fArr2[i42], fArr2[i43], fArr2[i44]);
                            f2 = fArr2[i41] + f16;
                            f3 = fArr2[i42] + f17;
                            f16 += fArr2[i43];
                            f4 = fArr2[i44];
                        }
                        f17 += f4;
                        f12 = f2;
                        f13 = f3;
                        i3 = i4;
                    } else {
                        int i45 = i4 + 5;
                        int i46 = i4 + 6;
                        i3 = i4;
                        m5905c(path, f16, f17, fArr2[i45] + f16, fArr2[i46] + f17, fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                        f16 += fArr2[i45];
                        f17 += fArr2[i46];
                    }
                    i4 = i3 + i2;
                    c5 = c3;
                    c4 = c5;
                } else {
                    i3 = i4;
                    int i47 = i3 + 5;
                    int i48 = i3 + 6;
                    m5905c(path, f16, f17, fArr2[i47], fArr2[i48], fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                    f16 = fArr2[i47];
                    f17 = fArr2[i48];
                }
                f13 = f17;
                f12 = f16;
                i4 = i3 + i2;
                c5 = c3;
                c4 = c5;
            }
            fArr[0] = f16;
            fArr[1] = f17;
            fArr[2] = f12;
            fArr[3] = f13;
            fArr[4] = f18;
            fArr[5] = f19;
        }

        /* renamed from: b */
        private static void m5904b(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
            double d11 = d4;
            int iCeil = (int) Math.ceil(Math.abs((d10 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d8);
            double dSin = Math.sin(d8);
            double dCos2 = Math.cos(d9);
            double dSin2 = Math.sin(d9);
            double d12 = -d11;
            double d13 = d12 * dCos;
            double d14 = d5 * dSin;
            double d15 = (d13 * dSin2) - (d14 * dCos2);
            double d16 = d12 * dSin;
            double d17 = d5 * dCos;
            double d18 = (dSin2 * d16) + (dCos2 * d17);
            double d19 = iCeil;
            Double.isNaN(d19);
            double d20 = d10 / d19;
            double d21 = d9;
            double d22 = d18;
            double d23 = d15;
            int i2 = 0;
            double d24 = d6;
            double d25 = d7;
            while (i2 < iCeil) {
                double d26 = d21 + d20;
                double dSin3 = Math.sin(d26);
                double dCos3 = Math.cos(d26);
                double d27 = (d2 + ((d11 * dCos) * dCos3)) - (d14 * dSin3);
                double d28 = d3 + (d11 * dSin * dCos3) + (d17 * dSin3);
                double d29 = (d13 * dSin3) - (d14 * dCos3);
                double d30 = (dSin3 * d16) + (dCos3 * d17);
                double d31 = d26 - d21;
                double dTan = Math.tan(d31 / 2.0d);
                double dSin4 = (Math.sin(d31) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d32 = d24 + (d23 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d32, (float) (d25 + (d22 * dSin4)), (float) (d27 - (dSin4 * d29)), (float) (d28 - (dSin4 * d30)), (float) d27, (float) d28);
                i2++;
                d20 = d20;
                dSin = dSin;
                d24 = d27;
                d16 = d16;
                dCos = dCos;
                d21 = d26;
                d22 = d30;
                d23 = d29;
                iCeil = iCeil;
                d25 = d28;
                d11 = d4;
            }
        }

        /* renamed from: c */
        private static void m5905c(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2) {
            double d2;
            double d3;
            double radians = Math.toRadians(f8);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d4 = f2;
            Double.isNaN(d4);
            double d5 = d4 * dCos;
            double d6 = f3;
            Double.isNaN(d6);
            double d7 = f6;
            Double.isNaN(d7);
            double d8 = (d5 + (d6 * dSin)) / d7;
            double d9 = -f2;
            Double.isNaN(d9);
            Double.isNaN(d6);
            double d10 = (d9 * dSin) + (d6 * dCos);
            double d11 = f7;
            Double.isNaN(d11);
            double d12 = d10 / d11;
            double d13 = f4;
            Double.isNaN(d13);
            double d14 = f5;
            Double.isNaN(d14);
            Double.isNaN(d7);
            double d15 = ((d13 * dCos) + (d14 * dSin)) / d7;
            double d16 = -f4;
            Double.isNaN(d16);
            Double.isNaN(d14);
            Double.isNaN(d11);
            double d17 = ((d16 * dSin) + (d14 * dCos)) / d11;
            double d18 = d8 - d15;
            double d19 = d12 - d17;
            double d20 = (d8 + d15) / 2.0d;
            double d21 = (d12 + d17) / 2.0d;
            double d22 = (d18 * d18) + (d19 * d19);
            if (d22 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d23 = (1.0d / d22) - 0.25d;
            if (d23 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d22);
                float fSqrt = (float) (Math.sqrt(d22) / 1.99999d);
                m5905c(path, f2, f3, f4, f5, f6 * fSqrt, f7 * fSqrt, f8, z, z2);
                return;
            }
            double dSqrt = Math.sqrt(d23);
            double d24 = d18 * dSqrt;
            double d25 = dSqrt * d19;
            if (z == z2) {
                d2 = d20 - d25;
                d3 = d21 + d24;
            } else {
                d2 = d20 + d25;
                d3 = d21 - d24;
            }
            double dAtan2 = Math.atan2(d12 - d3, d8 - d2);
            double dAtan22 = Math.atan2(d17 - d3, d15 - d2) - dAtan2;
            if (z2 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            Double.isNaN(d7);
            double d26 = d2 * d7;
            Double.isNaN(d11);
            double d27 = d3 * d11;
            m5904b(path, (d26 * dCos) - (d27 * dSin), (d26 * dSin) + (d27 * dCos), d7, d11, d4, d6, radians, dAtan2, dAtan22);
        }

        /* renamed from: e */
        public static void m5906e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c2 = 'm';
            for (int i2 = 0; i2 < bVarArr.length; i2++) {
                m5903a(path, fArr, c2, bVarArr[i2].f6289a, bVarArr[i2].f6290b);
                c2 = bVarArr[i2].f6289a;
            }
        }

        /* renamed from: d */
        public void m5907d(b bVar, b bVar2, float f2) {
            this.f6289a = bVar.f6289a;
            int i2 = 0;
            while (true) {
                float[] fArr = bVar.f6290b;
                if (i2 >= fArr.length) {
                    return;
                }
                this.f6290b[i2] = (fArr[i2] * (1.0f - f2)) + (bVar2.f6290b[i2] * f2);
                i2++;
            }
        }

        b(b bVar) {
            this.f6289a = bVar.f6289a;
            float[] fArr = bVar.f6290b;
            this.f6290b = C0925c.m5895c(fArr, 0, fArr.length);
        }
    }
}
