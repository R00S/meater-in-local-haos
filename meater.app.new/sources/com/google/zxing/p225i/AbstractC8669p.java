package com.google.zxing.p225i;

import com.google.zxing.FormatException;

/* compiled from: UPCEANReader.java */
/* renamed from: com.google.zxing.i.p */
/* loaded from: classes2.dex */
public abstract class AbstractC8669p extends AbstractC8666m {

    /* renamed from: a */
    static final int[] f32884a = {1, 1, 1};

    /* renamed from: b */
    static final int[] f32885b = {1, 1, 1, 1, 1};

    /* renamed from: c */
    static final int[] f32886c = {1, 1, 1, 1, 1, 1};

    /* renamed from: d */
    static final int[][] f32887d;

    /* renamed from: e */
    static final int[][] f32888e;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f32887d = iArr;
        int[][] iArr2 = new int[20][];
        f32888e = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i2 = 10; i2 < 20; i2++) {
            int[] iArr3 = f32887d[i2 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i3 = 0; i3 < iArr3.length; i3++) {
                iArr4[i3] = iArr3[(iArr3.length - i3) - 1];
            }
            f32888e[i2] = iArr4;
        }
    }

    /* renamed from: a */
    static boolean m27391a(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i2 = length - 1;
        return m27392b(charSequence.subSequence(0, i2)) == Character.digit(charSequence.charAt(i2), 10);
    }

    /* renamed from: b */
    static int m27392b(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i2 = 0;
        for (int i3 = length - 1; i3 >= 0; i3 -= 2) {
            int iCharAt = charSequence.charAt(i3) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw FormatException.m27222a();
            }
            i2 += iCharAt;
        }
        int i4 = i2 * 3;
        for (int i5 = length - 2; i5 >= 0; i5 -= 2) {
            int iCharAt2 = charSequence.charAt(i5) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw FormatException.m27222a();
            }
            i4 += iCharAt2;
        }
        return (1000 - i4) % 10;
    }
}
