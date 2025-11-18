package com.google.zxing.p226j.p227b;

/* compiled from: BarcodeRow.java */
/* renamed from: com.google.zxing.j.b.b */
/* loaded from: classes2.dex */
final class C8675b {

    /* renamed from: a */
    private final byte[] f32895a;

    /* renamed from: b */
    private int f32896b = 0;

    C8675b(int i2) {
        this.f32895a = new byte[i2];
    }

    /* renamed from: c */
    private void m27400c(int i2, boolean z) {
        this.f32895a[i2] = z ? (byte) 1 : (byte) 0;
    }

    /* renamed from: a */
    void m27401a(boolean z, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f32896b;
            this.f32896b = i4 + 1;
            m27400c(i4, z);
        }
    }

    /* renamed from: b */
    byte[] m27402b(int i2) {
        int length = this.f32895a.length * i2;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            bArr[i3] = this.f32895a[i3 / i2];
        }
        return bArr;
    }
}
