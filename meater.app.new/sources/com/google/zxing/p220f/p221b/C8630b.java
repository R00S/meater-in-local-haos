package com.google.zxing.p220f.p221b;

import com.google.zxing.p222g.C8636a;

/* compiled from: BinaryShiftToken.java */
/* renamed from: com.google.zxing.f.b.b */
/* loaded from: classes2.dex */
final class C8630b extends AbstractC8635g {

    /* renamed from: c */
    private final short f32775c;

    /* renamed from: d */
    private final short f32776d;

    C8630b(AbstractC8635g abstractC8635g, int i2, int i3) {
        super(abstractC8635g);
        this.f32775c = (short) i2;
        this.f32776d = (short) i3;
    }

    @Override // com.google.zxing.p220f.p221b.AbstractC8635g
    /* renamed from: c */
    public void mo27252c(C8636a c8636a, byte[] bArr) {
        int i2 = 0;
        while (true) {
            short s = this.f32776d;
            if (i2 >= s) {
                return;
            }
            if (i2 == 0 || (i2 == 31 && s <= 62)) {
                c8636a.m27285e(31, 5);
                short s2 = this.f32776d;
                if (s2 > 62) {
                    c8636a.m27285e(s2 - 31, 16);
                } else if (i2 == 0) {
                    c8636a.m27285e(Math.min((int) s2, 31), 5);
                } else {
                    c8636a.m27285e(s2 - 31, 5);
                }
            }
            c8636a.m27285e(bArr[this.f32775c + i2], 8);
            i2++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.f32775c);
        sb.append("::");
        sb.append((this.f32775c + this.f32776d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
