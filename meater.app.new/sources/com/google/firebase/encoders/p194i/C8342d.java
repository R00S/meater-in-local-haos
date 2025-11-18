package com.google.firebase.encoders.p194i;

import java.io.OutputStream;

/* compiled from: LengthCountingOutputStream.java */
/* renamed from: com.google.firebase.encoders.i.d */
/* loaded from: classes2.dex */
final class C8342d extends OutputStream {

    /* renamed from: f */
    private long f31673f = 0;

    C8342d() {
    }

    /* renamed from: a */
    long m26128a() {
        return this.f31673f;
    }

    @Override // java.io.OutputStream
    public void write(int i2) {
        this.f31673f++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f31673f += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) {
        int i4;
        if (i2 >= 0 && i2 <= bArr.length && i3 >= 0 && (i4 = i2 + i3) <= bArr.length && i4 >= 0) {
            this.f31673f += i3;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
