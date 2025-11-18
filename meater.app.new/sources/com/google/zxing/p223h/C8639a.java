package com.google.zxing.p223h;

import com.google.zxing.C8621b;
import com.google.zxing.EnumC8620a;
import com.google.zxing.EnumC8622c;
import com.google.zxing.InterfaceC8627e;
import com.google.zxing.p222g.C8637b;
import com.google.zxing.p223h.p224b.C8644e;
import com.google.zxing.p223h.p224b.C8648i;
import com.google.zxing.p223h.p224b.C8649j;
import com.google.zxing.p223h.p224b.C8650k;
import com.google.zxing.p223h.p224b.EnumC8651l;
import com.google.zxing.p228k.p230c.C8686b;
import java.util.Map;

/* compiled from: DataMatrixWriter.java */
/* renamed from: com.google.zxing.h.a */
/* loaded from: classes2.dex */
public final class C8639a implements InterfaceC8627e {
    /* renamed from: b */
    private static C8637b m27303b(C8686b c8686b, int i2, int i3) {
        C8637b c8637b;
        int iM27456e = c8686b.m27456e();
        int iM27455d = c8686b.m27455d();
        int iMax = Math.max(i2, iM27456e);
        int iMax2 = Math.max(i3, iM27455d);
        int iMin = Math.min(iMax / iM27456e, iMax2 / iM27455d);
        int i4 = (iMax - (iM27456e * iMin)) / 2;
        int i5 = (iMax2 - (iM27455d * iMin)) / 2;
        if (i3 < iM27455d || i2 < iM27456e) {
            c8637b = new C8637b(iM27456e, iM27455d);
            i4 = 0;
            i5 = 0;
        } else {
            c8637b = new C8637b(i2, i3);
        }
        c8637b.m27293d();
        int i6 = 0;
        while (i6 < iM27455d) {
            int i7 = i4;
            int i8 = 0;
            while (i8 < iM27456e) {
                if (c8686b.m27453b(i8, i6) == 1) {
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

    /* renamed from: c */
    private static C8637b m27304c(C8644e c8644e, C8650k c8650k, int i2, int i3) {
        int iM27376h = c8650k.m27376h();
        int iM27375g = c8650k.m27375g();
        C8686b c8686b = new C8686b(c8650k.m27378j(), c8650k.m27377i());
        int i4 = 0;
        for (int i5 = 0; i5 < iM27375g; i5++) {
            if (i5 % c8650k.f32854g == 0) {
                int i6 = 0;
                for (int i7 = 0; i7 < c8650k.m27378j(); i7++) {
                    c8686b.m27458g(i6, i4, i7 % 2 == 0);
                    i6++;
                }
                i4++;
            }
            int i8 = 0;
            for (int i9 = 0; i9 < iM27376h; i9++) {
                if (i9 % c8650k.f32853f == 0) {
                    c8686b.m27458g(i8, i4, true);
                    i8++;
                }
                c8686b.m27458g(i8, i4, c8644e.m27326e(i9, i5));
                i8++;
                int i10 = c8650k.f32853f;
                if (i9 % i10 == i10 - 1) {
                    c8686b.m27458g(i8, i4, i5 % 2 == 0);
                    i8++;
                }
            }
            i4++;
            int i11 = c8650k.f32854g;
            if (i5 % i11 == i11 - 1) {
                int i12 = 0;
                for (int i13 = 0; i13 < c8650k.m27378j(); i13++) {
                    c8686b.m27458g(i12, i4, true);
                    i12++;
                }
                i4++;
            }
        }
        return m27303b(c8686b, i2, i3);
    }

    @Override // com.google.zxing.InterfaceC8627e
    /* renamed from: a */
    public C8637b mo27243a(String str, EnumC8620a enumC8620a, int i2, int i3, Map<EnumC8622c, ?> map) {
        C8621b c8621b;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (enumC8620a != EnumC8620a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(enumC8620a)));
        }
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i2 + 'x' + i3);
        }
        EnumC8651l enumC8651l = EnumC8651l.FORCE_NONE;
        C8621b c8621b2 = null;
        if (map != null) {
            EnumC8651l enumC8651l2 = (EnumC8651l) map.get(EnumC8622c.DATA_MATRIX_SHAPE);
            if (enumC8651l2 != null) {
                enumC8651l = enumC8651l2;
            }
            C8621b c8621b3 = (C8621b) map.get(EnumC8622c.MIN_SIZE);
            if (c8621b3 == null) {
                c8621b3 = null;
            }
            c8621b = (C8621b) map.get(EnumC8622c.MAX_SIZE);
            if (c8621b == null) {
                c8621b = null;
            }
            c8621b2 = c8621b3;
        } else {
            c8621b = null;
        }
        String strM27355b = C8649j.m27355b(str, enumC8651l, c8621b2, c8621b);
        C8650k c8650kM27371l = C8650k.m27371l(strM27355b.length(), enumC8651l, c8621b2, c8621b, true);
        C8644e c8644e = new C8644e(C8648i.m27353c(strM27355b, c8650kM27371l), c8650kM27371l.m27376h(), c8650kM27371l.m27375g());
        c8644e.m27327h();
        return m27304c(c8644e, c8650kM27371l, i2, i3);
    }
}
