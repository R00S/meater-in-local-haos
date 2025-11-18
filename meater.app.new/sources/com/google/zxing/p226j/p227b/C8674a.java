package com.google.zxing.p226j.p227b;

import java.lang.reflect.Array;

/* compiled from: BarcodeMatrix.java */
/* renamed from: com.google.zxing.j.b.a */
/* loaded from: classes2.dex */
public final class C8674a {

    /* renamed from: a */
    private final C8675b[] f32891a;

    /* renamed from: b */
    private int f32892b;

    /* renamed from: c */
    private final int f32893c;

    /* renamed from: d */
    private final int f32894d;

    C8674a(int i2, int i3) {
        C8675b[] c8675bArr = new C8675b[i2];
        this.f32891a = c8675bArr;
        int length = c8675bArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f32891a[i4] = new C8675b(((i3 + 4) * 17) + 1);
        }
        this.f32894d = i3 * 17;
        this.f32893c = i2;
        this.f32892b = -1;
    }

    /* renamed from: a */
    C8675b m27397a() {
        return this.f32891a[this.f32892b];
    }

    /* renamed from: b */
    public byte[][] m27398b(int i2, int i3) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) byte.class, this.f32893c * i3, this.f32894d * i2);
        int i4 = this.f32893c * i3;
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[(i4 - i5) - 1] = this.f32891a[i5 / i3].m27402b(i2);
        }
        return bArr;
    }

    /* renamed from: c */
    void m27399c() {
        this.f32892b++;
    }
}
