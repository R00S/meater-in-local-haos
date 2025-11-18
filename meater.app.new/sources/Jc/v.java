package Jc;

import java.io.InputStream;

/* compiled from: MultiByteArrayInputStream.java */
/* loaded from: classes3.dex */
public class v extends InputStream {

    /* renamed from: B, reason: collision with root package name */
    private final byte[] f7831B;

    /* renamed from: C, reason: collision with root package name */
    private final int f7832C;

    /* renamed from: D, reason: collision with root package name */
    private final int f7833D;

    /* renamed from: E, reason: collision with root package name */
    private final byte[] f7834E;

    /* renamed from: F, reason: collision with root package name */
    private final int f7835F;

    /* renamed from: G, reason: collision with root package name */
    private final int f7836G;

    /* renamed from: H, reason: collision with root package name */
    private int f7837H = 0;

    public v(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        this.f7831B = bArr;
        this.f7834E = bArr2;
        this.f7832C = i10;
        this.f7835F = i12;
        this.f7833D = i11;
        this.f7836G = i13;
    }

    @Override // java.io.InputStream
    public int read() {
        int i10;
        int i11 = this.f7837H;
        int i12 = this.f7833D;
        if (i11 < i12) {
            i10 = this.f7831B[this.f7832C + i11];
        } else {
            if (i11 >= this.f7836G + i12) {
                return -1;
            }
            i10 = this.f7834E[(this.f7835F + i11) - i12];
        }
        if (i10 < 0) {
            i10 += 256;
        }
        this.f7837H = i11 + 1;
        return i10;
    }
}
