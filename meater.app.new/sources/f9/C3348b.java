package f9;

import java.io.OutputStream;

/* compiled from: LengthCountingOutputStream.java */
/* renamed from: f9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3348b extends OutputStream {

    /* renamed from: B, reason: collision with root package name */
    private long f41386B = 0;

    C3348b() {
    }

    long a() {
        return this.f41386B;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f41386B++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f41386B += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f41386B += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
