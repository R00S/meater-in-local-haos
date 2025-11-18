package com.google.zxing.p228k;

import com.google.zxing.EnumC8620a;
import com.google.zxing.EnumC8622c;
import com.google.zxing.InterfaceC8627e;
import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8637b;
import com.google.zxing.p228k.p229b.EnumC8682a;
import com.google.zxing.p228k.p230c.C8686b;
import com.google.zxing.p228k.p230c.C8687c;
import com.google.zxing.p228k.p230c.C8690f;
import java.util.Map;

/* compiled from: QRCodeWriter.java */
/* renamed from: com.google.zxing.k.a */
/* loaded from: classes2.dex */
public final class C8681a implements InterfaceC8627e {
    /* renamed from: b */
    private static C8637b m27434b(C8690f c8690f, int i2, int i3, int i4) {
        C8686b c8686bM27509a = c8690f.m27509a();
        if (c8686bM27509a == null) {
            throw new IllegalStateException();
        }
        int iM27456e = c8686bM27509a.m27456e();
        int iM27455d = c8686bM27509a.m27455d();
        int i5 = i4 << 1;
        int i6 = iM27456e + i5;
        int i7 = i5 + iM27455d;
        int iMax = Math.max(i2, i6);
        int iMax2 = Math.max(i3, i7);
        int iMin = Math.min(iMax / i6, iMax2 / i7);
        int i8 = (iMax - (iM27456e * iMin)) / 2;
        int i9 = (iMax2 - (iM27455d * iMin)) / 2;
        C8637b c8637b = new C8637b(iMax, iMax2);
        int i10 = 0;
        while (i10 < iM27455d) {
            int i11 = i8;
            int i12 = 0;
            while (i12 < iM27456e) {
                if (c8686bM27509a.m27453b(i12, i10) == 1) {
                    c8637b.m27299j(i11, i9, iMin, iMin);
                }
                i12++;
                i11 += iMin;
            }
            i10++;
            i9 += iMin;
        }
        return c8637b;
    }

    @Override // com.google.zxing.InterfaceC8627e
    /* renamed from: a */
    public C8637b mo27243a(String str, EnumC8620a enumC8620a, int i2, int i3, Map<EnumC8622c, ?> map) throws NumberFormatException, WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (enumC8620a != EnumC8620a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(enumC8620a)));
        }
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i2 + 'x' + i3);
        }
        EnumC8682a enumC8682aValueOf = EnumC8682a.L;
        int i4 = 4;
        if (map != null) {
            EnumC8622c enumC8622c = EnumC8622c.ERROR_CORRECTION;
            if (map.containsKey(enumC8622c)) {
                enumC8682aValueOf = EnumC8682a.valueOf(map.get(enumC8622c).toString());
            }
            EnumC8622c enumC8622c2 = EnumC8622c.MARGIN;
            if (map.containsKey(enumC8622c2)) {
                i4 = Integer.parseInt(map.get(enumC8622c2).toString());
            }
        }
        return m27434b(C8687c.m27472n(str, enumC8682aValueOf, map), i2, i3, i4);
    }
}
