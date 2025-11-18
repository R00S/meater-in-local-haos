package com.google.zxing.p225i;

import com.google.zxing.EnumC8620a;
import com.google.zxing.EnumC8622c;
import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8637b;
import java.util.Map;

/* compiled from: Code39Writer.java */
/* renamed from: com.google.zxing.i.f */
/* loaded from: classes2.dex */
public final class C8659f extends AbstractC8667n {
    /* renamed from: f */
    private static void m27383f(int i2, int[] iArr) {
        for (int i3 = 0; i3 < 9; i3++) {
            int i4 = 1;
            if (((1 << (8 - i3)) & i2) != 0) {
                i4 = 2;
            }
            iArr[i3] = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m27384g(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p225i.C8659f.m27384g(java.lang.String):java.lang.String");
    }

    @Override // com.google.zxing.p225i.AbstractC8667n, com.google.zxing.InterfaceC8627e
    /* renamed from: a */
    public C8637b mo27243a(String str, EnumC8620a enumC8620a, int i2, int i3, Map<EnumC8622c, ?> map) throws WriterException {
        if (enumC8620a == EnumC8620a.CODE_39) {
            return super.mo27243a(str, enumC8620a, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(enumC8620a)));
    }

    @Override // com.google.zxing.p225i.AbstractC8667n
    /* renamed from: c */
    public boolean[] mo27380c(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i2)) < 0) {
                str = m27384g(str);
                length = str.length();
                if (length > 80) {
                    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                }
            } else {
                i2++;
            }
        }
        int[] iArr = new int[9];
        int i3 = length + 25;
        for (int i4 = 0; i4 < length; i4++) {
            m27383f(C8658e.f32875a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i4))], iArr);
            for (int i5 = 0; i5 < 9; i5++) {
                i3 += iArr[i5];
            }
        }
        boolean[] zArr = new boolean[i3];
        m27383f(148, iArr);
        int iM27388b = AbstractC8667n.m27388b(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int iM27388b2 = iM27388b + AbstractC8667n.m27388b(zArr, iM27388b, iArr2, false);
        for (int i6 = 0; i6 < length; i6++) {
            m27383f(C8658e.f32875a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i6))], iArr);
            int iM27388b3 = iM27388b2 + AbstractC8667n.m27388b(zArr, iM27388b2, iArr, true);
            iM27388b2 = iM27388b3 + AbstractC8667n.m27388b(zArr, iM27388b3, iArr2, false);
        }
        m27383f(148, iArr);
        AbstractC8667n.m27388b(zArr, iM27388b2, iArr, true);
        return zArr;
    }
}
