package com.google.zxing.p226j;

import com.google.zxing.EnumC8620a;
import com.google.zxing.EnumC8622c;
import com.google.zxing.InterfaceC8627e;
import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8637b;
import com.google.zxing.p226j.p227b.C8677d;
import com.google.zxing.p226j.p227b.C8678e;
import com.google.zxing.p226j.p227b.EnumC8676c;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: PDF417Writer.java */
/* renamed from: com.google.zxing.j.a */
/* loaded from: classes2.dex */
public final class C8673a implements InterfaceC8627e {
    /* renamed from: b */
    private static C8637b m27394b(byte[][] bArr, int i2) {
        int i3 = i2 * 2;
        C8637b c8637b = new C8637b(bArr[0].length + i3, bArr.length + i3);
        c8637b.m27293d();
        int iM27296g = (c8637b.m27296g() - i2) - 1;
        int i4 = 0;
        while (i4 < bArr.length) {
            byte[] bArr2 = bArr[i4];
            for (int i5 = 0; i5 < bArr[0].length; i5++) {
                if (bArr2[i5] == 1) {
                    c8637b.m27298i(i5 + i2, iM27296g);
                }
            }
            i4++;
            iM27296g--;
        }
        return c8637b;
    }

    /* renamed from: c */
    private static C8637b m27395c(C8678e c8678e, String str, int i2, int i3, int i4, int i5) throws WriterException {
        boolean z;
        c8678e.m27412e(str, i2);
        byte[][] bArrM27398b = c8678e.m27413f().m27398b(1, 4);
        if ((i4 > i3) != (bArrM27398b[0].length < bArrM27398b.length)) {
            bArrM27398b = m27396d(bArrM27398b);
            z = true;
        } else {
            z = false;
        }
        int length = i3 / bArrM27398b[0].length;
        int length2 = i4 / bArrM27398b.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return m27394b(bArrM27398b, i5);
        }
        byte[][] bArrM27398b2 = c8678e.m27413f().m27398b(length, length << 2);
        if (z) {
            bArrM27398b2 = m27396d(bArrM27398b2);
        }
        return m27394b(bArrM27398b2, i5);
    }

    /* renamed from: d */
    private static byte[][] m27396d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) byte.class, bArr[0].length, bArr.length);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int length = (bArr.length - i2) - 1;
            for (int i3 = 0; i3 < bArr[0].length; i3++) {
                bArr2[i3][length] = bArr[i2][i3];
            }
        }
        return bArr2;
    }

    @Override // com.google.zxing.InterfaceC8627e
    /* renamed from: a */
    public C8637b mo27243a(String str, EnumC8620a enumC8620a, int i2, int i3, Map<EnumC8622c, ?> map) throws WriterException {
        int i4;
        int i5;
        if (enumC8620a != EnumC8620a.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(enumC8620a)));
        }
        C8678e c8678e = new C8678e();
        if (map != null) {
            EnumC8622c enumC8622c = EnumC8622c.PDF417_COMPACT;
            if (map.containsKey(enumC8622c)) {
                c8678e.m27414h(Boolean.valueOf(map.get(enumC8622c).toString()).booleanValue());
            }
            EnumC8622c enumC8622c2 = EnumC8622c.PDF417_COMPACTION;
            if (map.containsKey(enumC8622c2)) {
                c8678e.m27415i(EnumC8676c.valueOf(map.get(enumC8622c2).toString()));
            }
            EnumC8622c enumC8622c3 = EnumC8622c.PDF417_DIMENSIONS;
            if (map.containsKey(enumC8622c3)) {
                C8677d c8677d = (C8677d) map.get(enumC8622c3);
                c8678e.m27416j(c8677d.m27403a(), c8677d.m27405c(), c8677d.m27404b(), c8677d.m27406d());
            }
            EnumC8622c enumC8622c4 = EnumC8622c.MARGIN;
            int i6 = map.containsKey(enumC8622c4) ? Integer.parseInt(map.get(enumC8622c4).toString()) : 30;
            EnumC8622c enumC8622c5 = EnumC8622c.ERROR_CORRECTION;
            int i7 = map.containsKey(enumC8622c5) ? Integer.parseInt(map.get(enumC8622c5).toString()) : 2;
            EnumC8622c enumC8622c6 = EnumC8622c.CHARACTER_SET;
            if (map.containsKey(enumC8622c6)) {
                c8678e.m27417k(Charset.forName(map.get(enumC8622c6).toString()));
            }
            i5 = i6;
            i4 = i7;
        } else {
            i4 = 2;
            i5 = 30;
        }
        return m27395c(c8678e, str, i4, i2, i3, i5);
    }
}
