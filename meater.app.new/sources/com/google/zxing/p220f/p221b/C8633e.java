package com.google.zxing.p220f.p221b;

import com.google.zxing.p222g.C8636a;

/* compiled from: SimpleToken.java */
/* renamed from: com.google.zxing.f.b.e */
/* loaded from: classes2.dex */
final class C8633e extends AbstractC8635g {

    /* renamed from: c */
    private final short f32784c;

    /* renamed from: d */
    private final short f32785d;

    C8633e(AbstractC8635g abstractC8635g, int i2, int i3) {
        super(abstractC8635g);
        this.f32784c = (short) i2;
        this.f32785d = (short) i3;
    }

    @Override // com.google.zxing.p220f.p221b.AbstractC8635g
    /* renamed from: c */
    void mo27252c(C8636a c8636a, byte[] bArr) {
        c8636a.m27285e(this.f32784c, this.f32785d);
    }

    public String toString() {
        short s = this.f32784c;
        short s2 = this.f32785d;
        return "<" + Integer.toBinaryString((s & ((1 << s2) - 1)) | (1 << s2) | (1 << this.f32785d)).substring(1) + '>';
    }
}
