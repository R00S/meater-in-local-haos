package com.google.zxing.p228k.p230c;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: ByteMatrix.java */
/* renamed from: com.google.zxing.k.c.b */
/* loaded from: classes2.dex */
public final class C8686b {

    /* renamed from: a */
    private final byte[][] f32954a;

    /* renamed from: b */
    private final int f32955b;

    /* renamed from: c */
    private final int f32956c;

    public C8686b(int i2, int i3) {
        this.f32954a = (byte[][]) Array.newInstance((Class<?>) byte.class, i3, i2);
        this.f32955b = i2;
        this.f32956c = i3;
    }

    /* renamed from: a */
    public void m27452a(byte b2) {
        for (byte[] bArr : this.f32954a) {
            Arrays.fill(bArr, b2);
        }
    }

    /* renamed from: b */
    public byte m27453b(int i2, int i3) {
        return this.f32954a[i3][i2];
    }

    /* renamed from: c */
    public byte[][] m27454c() {
        return this.f32954a;
    }

    /* renamed from: d */
    public int m27455d() {
        return this.f32956c;
    }

    /* renamed from: e */
    public int m27456e() {
        return this.f32955b;
    }

    /* renamed from: f */
    public void m27457f(int i2, int i3, int i4) {
        this.f32954a[i3][i2] = (byte) i4;
    }

    /* renamed from: g */
    public void m27458g(int i2, int i3, boolean z) {
        this.f32954a[i3][i2] = z ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f32955b * 2 * this.f32956c) + 2);
        for (int i2 = 0; i2 < this.f32956c; i2++) {
            byte[] bArr = this.f32954a[i2];
            for (int i3 = 0; i3 < this.f32955b; i3++) {
                byte b2 = bArr[i3];
                if (b2 == 0) {
                    sb.append(" 0");
                } else if (b2 != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
