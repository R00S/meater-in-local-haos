package com.google.zxing.p225i;

import com.google.zxing.EnumC8620a;
import com.google.zxing.EnumC8622c;
import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8637b;
import java.util.Map;

/* compiled from: Code93Writer.java */
/* renamed from: com.google.zxing.i.h */
/* loaded from: classes2.dex */
public class C8661h extends AbstractC8667n {
    /* renamed from: f */
    private static int m27385f(boolean[] zArr, int i2, int[] iArr) {
        int length = iArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i2 + 1;
            zArr[i2] = iArr[i3] != 0;
            i3++;
            i2 = i4;
        }
        return 9;
    }

    /* renamed from: g */
    private static int m27386g(String str, int i2) {
        int iIndexOf = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i2) {
                i3 = 1;
            }
        }
        return iIndexOf % 47;
    }

    /* renamed from: h */
    private static void m27387h(int i2, int[] iArr) {
        for (int i3 = 0; i3 < 9; i3++) {
            int i4 = 1;
            if (((1 << (8 - i3)) & i2) == 0) {
                i4 = 0;
            }
            iArr[i3] = i4;
        }
    }

    @Override // com.google.zxing.p225i.AbstractC8667n, com.google.zxing.InterfaceC8627e
    /* renamed from: a */
    public C8637b mo27243a(String str, EnumC8620a enumC8620a, int i2, int i3, Map<EnumC8622c, ?> map) throws WriterException {
        if (enumC8620a == EnumC8620a.CODE_93) {
            return super.mo27243a(str, enumC8620a, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(enumC8620a)));
    }

    @Override // com.google.zxing.p225i.AbstractC8667n
    /* renamed from: c */
    public boolean[] mo27380c(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int[] iArr = new int[9];
        int length2 = ((str.length() + 2 + 2) * 9) + 1;
        m27387h(C8660g.f32877b[47], iArr);
        boolean[] zArr = new boolean[length2];
        int iM27385f = m27385f(zArr, 0, iArr);
        for (int i2 = 0; i2 < length; i2++) {
            m27387h(C8660g.f32877b["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i2))], iArr);
            iM27385f += m27385f(zArr, iM27385f, iArr);
        }
        int iM27386g = m27386g(str, 20);
        int[] iArr2 = C8660g.f32877b;
        m27387h(iArr2[iM27386g], iArr);
        int iM27385f2 = iM27385f + m27385f(zArr, iM27385f, iArr);
        m27387h(iArr2[m27386g(str + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iM27386g), 15)], iArr);
        int iM27385f3 = iM27385f2 + m27385f(zArr, iM27385f2, iArr);
        m27387h(iArr2[47], iArr);
        zArr[iM27385f3 + m27385f(zArr, iM27385f3, iArr)] = true;
        return zArr;
    }
}
