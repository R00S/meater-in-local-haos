package com.google.zxing.p225i;

/* compiled from: CodaBarWriter.java */
/* renamed from: com.google.zxing.i.b */
/* loaded from: classes2.dex */
public final class C8655b extends AbstractC8667n {

    /* renamed from: a */
    private static final char[] f32865a;

    /* renamed from: b */
    private static final char[] f32866b = {'T', 'N', '*', 'E'};

    /* renamed from: c */
    private static final char[] f32867c = {'/', ':', '+', '.'};

    /* renamed from: d */
    private static final char f32868d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f32865a = cArr;
        f32868d = cArr[0];
    }

    @Override // com.google.zxing.p225i.AbstractC8667n
    /* renamed from: c */
    public boolean[] mo27380c(String str) {
        int i2;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c2 = f32868d;
            sb.append(c2);
            sb.append(str);
            sb.append(c2);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f32865a;
            boolean zM27379a = C8654a.m27379a(cArr, upperCase);
            boolean zM27379a2 = C8654a.m27379a(cArr, upperCase2);
            char[] cArr2 = f32866b;
            boolean zM27379a3 = C8654a.m27379a(cArr2, upperCase);
            boolean zM27379a4 = C8654a.m27379a(cArr2, upperCase2);
            if (zM27379a) {
                if (!zM27379a2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zM27379a3) {
                if (zM27379a2 || zM27379a4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                StringBuilder sb2 = new StringBuilder();
                char c3 = f32868d;
                sb2.append(c3);
                sb2.append(str);
                sb2.append(c3);
                str = sb2.toString();
            } else if (!zM27379a4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i3 = 20;
        for (int i4 = 1; i4 < str.length() - 1; i4++) {
            if (Character.isDigit(str.charAt(i4)) || str.charAt(i4) == '-' || str.charAt(i4) == '$') {
                i3 += 9;
            } else {
                if (!C8654a.m27379a(f32867c, str.charAt(i4))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i4) + '\'');
                }
                i3 += 10;
            }
        }
        boolean[] zArr = new boolean[i3 + (str.length() - 1)];
        int i5 = 0;
        for (int i6 = 0; i6 < str.length(); i6++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i6));
            if (i6 == 0 || i6 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i7 = 0;
            while (true) {
                char[] cArr3 = C8654a.f32862a;
                if (i7 >= cArr3.length) {
                    i2 = 0;
                    break;
                }
                if (upperCase3 == cArr3[i7]) {
                    i2 = C8654a.f32863b[i7];
                    break;
                }
                i7++;
            }
            int i8 = 0;
            boolean z = true;
            while (true) {
                int i9 = 0;
                while (i8 < 7) {
                    zArr[i5] = z;
                    i5++;
                    if (((i2 >> (6 - i8)) & 1) == 0 || i9 == 1) {
                        break;
                    }
                    i9++;
                }
                z = !z;
                i8++;
            }
            if (i6 < str.length() - 1) {
                zArr[i5] = false;
                i5++;
            }
        }
        return zArr;
    }
}
