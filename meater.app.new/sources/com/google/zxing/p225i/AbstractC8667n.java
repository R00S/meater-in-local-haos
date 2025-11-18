package com.google.zxing.p225i;

import com.google.zxing.EnumC8620a;
import com.google.zxing.EnumC8622c;
import com.google.zxing.InterfaceC8627e;
import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8637b;
import java.util.Map;

/* compiled from: OneDimensionalCodeWriter.java */
/* renamed from: com.google.zxing.i.n */
/* loaded from: classes2.dex */
public abstract class AbstractC8667n implements InterfaceC8627e {
    /* renamed from: b */
    protected static int m27388b(boolean[] zArr, int i2, int[] iArr, boolean z) {
        int i3 = 0;
        for (int i4 : iArr) {
            int i5 = 0;
            while (i5 < i4) {
                zArr[i2] = z;
                i5++;
                i2++;
            }
            i3 += i4;
            z = !z;
        }
        return i3;
    }

    /* renamed from: e */
    private static C8637b m27389e(boolean[] zArr, int i2, int i3, int i4) {
        int length = zArr.length;
        int i5 = i4 + length;
        int iMax = Math.max(i2, i5);
        int iMax2 = Math.max(1, i3);
        int i6 = iMax / i5;
        int i7 = (iMax - (length * i6)) / 2;
        C8637b c8637b = new C8637b(iMax, iMax2);
        int i8 = 0;
        while (i8 < length) {
            if (zArr[i8]) {
                c8637b.m27299j(i7, 0, i6, iMax2);
            }
            i8++;
            i7 += i6;
        }
        return c8637b;
    }

    @Override // com.google.zxing.InterfaceC8627e
    /* renamed from: a */
    public C8637b mo27243a(String str, EnumC8620a enumC8620a, int i2, int i3, Map<EnumC8622c, ?> map) throws NumberFormatException, WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i2 + 'x' + i3);
        }
        int iMo27390d = mo27390d();
        if (map != null) {
            EnumC8622c enumC8622c = EnumC8622c.MARGIN;
            if (map.containsKey(enumC8622c)) {
                iMo27390d = Integer.parseInt(map.get(enumC8622c).toString());
            }
        }
        return m27389e(mo27380c(str), i2, i3, iMo27390d);
    }

    /* renamed from: c */
    public abstract boolean[] mo27380c(String str);

    /* renamed from: d */
    public int mo27390d() {
        return 10;
    }
}
