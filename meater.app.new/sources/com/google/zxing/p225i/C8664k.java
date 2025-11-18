package com.google.zxing.p225i;

import com.google.zxing.EnumC8620a;
import com.google.zxing.EnumC8622c;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import com.google.zxing.p222g.C8637b;
import java.util.Map;

/* compiled from: EAN8Writer.java */
/* renamed from: com.google.zxing.i.k */
/* loaded from: classes2.dex */
public final class C8664k extends AbstractC8670q {
    @Override // com.google.zxing.p225i.AbstractC8667n, com.google.zxing.InterfaceC8627e
    /* renamed from: a */
    public C8637b mo27243a(String str, EnumC8620a enumC8620a, int i2, int i3, Map<EnumC8622c, ?> map) throws WriterException {
        if (enumC8620a == EnumC8620a.EAN_8) {
            return super.mo27243a(str, enumC8620a, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(enumC8620a)));
    }

    @Override // com.google.zxing.p225i.AbstractC8667n
    /* renamed from: c */
    public boolean[] mo27380c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + AbstractC8669p.m27392b(str);
            } catch (FormatException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!AbstractC8669p.m27391a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        boolean[] zArr = new boolean[67];
        int iM27388b = AbstractC8667n.m27388b(zArr, 0, AbstractC8669p.f32884a, true) + 0;
        for (int i2 = 0; i2 <= 3; i2++) {
            iM27388b += AbstractC8667n.m27388b(zArr, iM27388b, AbstractC8669p.f32887d[Character.digit(str.charAt(i2), 10)], false);
        }
        int iM27388b2 = iM27388b + AbstractC8667n.m27388b(zArr, iM27388b, AbstractC8669p.f32885b, false);
        for (int i3 = 4; i3 <= 7; i3++) {
            iM27388b2 += AbstractC8667n.m27388b(zArr, iM27388b2, AbstractC8669p.f32887d[Character.digit(str.charAt(i3), 10)], true);
        }
        AbstractC8667n.m27388b(zArr, iM27388b2, AbstractC8669p.f32884a, true);
        return zArr;
    }
}
