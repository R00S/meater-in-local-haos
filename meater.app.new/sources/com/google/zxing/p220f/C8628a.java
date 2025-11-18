package com.google.zxing.p220f;

import com.google.zxing.EnumC8620a;
import com.google.zxing.EnumC8622c;
import com.google.zxing.InterfaceC8627e;
import com.google.zxing.p220f.p221b.C8629a;
import com.google.zxing.p220f.p221b.C8631c;
import com.google.zxing.p222g.C8637b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* compiled from: AztecWriter.java */
/* renamed from: com.google.zxing.f.a */
/* loaded from: classes2.dex */
public final class C8628a implements InterfaceC8627e {
    /* renamed from: b */
    private static C8637b m27244b(String str, EnumC8620a enumC8620a, int i2, int i3, Charset charset, int i4, int i5) {
        if (enumC8620a == EnumC8620a.AZTEC) {
            return m27245c(C8631c.m27256d(str.getBytes(charset), i4, i5), i2, i3);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(enumC8620a)));
    }

    /* renamed from: c */
    private static C8637b m27245c(C8629a c8629a, int i2, int i3) {
        C8637b c8637bM27246a = c8629a.m27246a();
        if (c8637bM27246a == null) {
            throw new IllegalStateException();
        }
        int iM27297h = c8637bM27246a.m27297h();
        int iM27296g = c8637bM27246a.m27296g();
        int iMax = Math.max(i2, iM27297h);
        int iMax2 = Math.max(i3, iM27296g);
        int iMin = Math.min(iMax / iM27297h, iMax2 / iM27296g);
        int i4 = (iMax - (iM27297h * iMin)) / 2;
        int i5 = (iMax2 - (iM27296g * iMin)) / 2;
        C8637b c8637b = new C8637b(iMax, iMax2);
        int i6 = 0;
        while (i6 < iM27296g) {
            int i7 = i4;
            int i8 = 0;
            while (i8 < iM27297h) {
                if (c8637bM27246a.m27295f(i8, i6)) {
                    c8637b.m27299j(i7, i5, iMin, iMin);
                }
                i8++;
                i7 += iMin;
            }
            i6++;
            i5 += iMin;
        }
        return c8637b;
    }

    @Override // com.google.zxing.InterfaceC8627e
    /* renamed from: a */
    public C8637b mo27243a(String str, EnumC8620a enumC8620a, int i2, int i3, Map<EnumC8622c, ?> map) throws NumberFormatException {
        Charset charset;
        int i4;
        int i5;
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        if (map != null) {
            EnumC8622c enumC8622c = EnumC8622c.CHARACTER_SET;
            if (map.containsKey(enumC8622c)) {
                charsetForName = Charset.forName(map.get(enumC8622c).toString());
            }
            EnumC8622c enumC8622c2 = EnumC8622c.ERROR_CORRECTION;
            int i6 = map.containsKey(enumC8622c2) ? Integer.parseInt(map.get(enumC8622c2).toString()) : 33;
            EnumC8622c enumC8622c3 = EnumC8622c.AZTEC_LAYERS;
            if (map.containsKey(enumC8622c3)) {
                charset = charsetForName;
                i4 = i6;
                i5 = Integer.parseInt(map.get(enumC8622c3).toString());
                return m27244b(str, enumC8620a, i2, i3, charset, i4, i5);
            }
            charset = charsetForName;
            i4 = i6;
        } else {
            charset = charsetForName;
            i4 = 33;
        }
        i5 = 0;
        return m27244b(str, enumC8620a, i2, i3, charset, i4, i5);
    }
}
