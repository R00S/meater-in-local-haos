package com.google.zxing.p225i;

import com.google.zxing.EnumC8620a;
import com.google.zxing.EnumC8622c;
import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8637b;
import java.util.Map;

/* compiled from: ITFWriter.java */
/* renamed from: com.google.zxing.i.l */
/* loaded from: classes2.dex */
public final class C8665l extends AbstractC8667n {

    /* renamed from: a */
    private static final int[] f32880a = {1, 1, 1, 1};

    /* renamed from: b */
    private static final int[] f32881b = {3, 1, 1};

    /* renamed from: c */
    private static final int[][] f32882c = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // com.google.zxing.p225i.AbstractC8667n, com.google.zxing.InterfaceC8627e
    /* renamed from: a */
    public C8637b mo27243a(String str, EnumC8620a enumC8620a, int i2, int i3, Map<EnumC8622c, ?> map) throws WriterException {
        if (enumC8620a == EnumC8620a.ITF) {
            return super.mo27243a(str, enumC8620a, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(enumC8620a)));
    }

    @Override // com.google.zxing.p225i.AbstractC8667n
    /* renamed from: c */
    public boolean[] mo27380c(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[(length * 9) + 9];
        int iM27388b = AbstractC8667n.m27388b(zArr, 0, f32880a, true);
        for (int i2 = 0; i2 < length; i2 += 2) {
            int iDigit = Character.digit(str.charAt(i2), 10);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 10);
            int[] iArr = new int[10];
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                int[][] iArr2 = f32882c;
                iArr[i4] = iArr2[iDigit][i3];
                iArr[i4 + 1] = iArr2[iDigit2][i3];
            }
            iM27388b += AbstractC8667n.m27388b(zArr, iM27388b, iArr, true);
        }
        AbstractC8667n.m27388b(zArr, iM27388b, f32881b, true);
        return zArr;
    }
}
