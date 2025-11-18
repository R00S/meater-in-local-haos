package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.ads.mt */
/* loaded from: classes2.dex */
abstract class AbstractC6944mt implements zzdlk {

    /* renamed from: a */
    private static final int[] f19938a = m15562j(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: b */
    int[] f19939b;

    /* renamed from: c */
    private final int f19940c;

    AbstractC6944mt(byte[] bArr, int i2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f19939b = m15562j(bArr);
        this.f19940c = i2;
    }

    /* renamed from: b */
    private static int m15558b(int i2, int i3) {
        return (i2 >>> (-i3)) | (i2 << i3);
    }

    /* renamed from: d */
    private static void m15559d(int[] iArr, int i2, int i3, int i4, int i5) {
        iArr[i2] = iArr[i2] + iArr[i3];
        iArr[i5] = m15558b(iArr[i5] ^ iArr[i2], 16);
        iArr[i4] = iArr[i4] + iArr[i5];
        iArr[i3] = m15558b(iArr[i3] ^ iArr[i4], 12);
        iArr[i2] = iArr[i2] + iArr[i3];
        iArr[i5] = m15558b(iArr[i2] ^ iArr[i5], 8);
        iArr[i4] = iArr[i4] + iArr[i5];
        iArr[i3] = m15558b(iArr[i3] ^ iArr[i4], 7);
    }

    /* renamed from: e */
    static void m15560e(int[] iArr, int[] iArr2) {
        int[] iArr3 = f19938a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* renamed from: i */
    static void m15561i(int[] iArr) {
        for (int i2 = 0; i2 < 10; i2++) {
            m15559d(iArr, 0, 4, 8, 12);
            m15559d(iArr, 1, 5, 9, 13);
            m15559d(iArr, 2, 6, 10, 14);
            m15559d(iArr, 3, 7, 11, 15);
            m15559d(iArr, 0, 5, 10, 15);
            m15559d(iArr, 1, 6, 11, 12);
            m15559d(iArr, 2, 7, 8, 13);
            m15559d(iArr, 3, 4, 9, 14);
        }
    }

    /* renamed from: j */
    private static int[] m15562j(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    /* renamed from: a */
    public final byte[] mo15563a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > Integer.MAX_VALUE - mo15515f()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(mo15515f() + bArr.length);
        m15564c(byteBufferAllocate, bArr);
        return byteBufferAllocate.array();
    }

    /* renamed from: c */
    final void m15564c(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - mo15515f() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] bArrM19575c = zzdlo.m19575c(mo15515f());
        byteBuffer.put(bArrM19575c);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        int iRemaining = byteBufferWrap.remaining();
        int i2 = (iRemaining / 64) + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferM15565h = m15565h(bArrM19575c, this.f19940c + i3);
            if (i3 == i2 - 1) {
                zzdjs.m19551a(byteBuffer, byteBufferWrap, byteBufferM15565h, iRemaining % 64);
            } else {
                zzdjs.m19551a(byteBuffer, byteBufferWrap, byteBufferM15565h, 64);
            }
        }
    }

    /* renamed from: f */
    abstract int mo15515f();

    /* renamed from: g */
    abstract int[] mo15516g(int[] iArr, int i2);

    /* renamed from: h */
    final ByteBuffer m15565h(byte[] bArr, int i2) {
        int[] iArrMo15516g = mo15516g(m15562j(bArr), i2);
        int[] iArr = (int[]) iArrMo15516g.clone();
        m15561i(iArr);
        for (int i3 = 0; i3 < iArrMo15516g.length; i3++) {
            iArrMo15516g[i3] = iArrMo15516g[i3] + iArr[i3];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrMo15516g, 0, 16);
        return byteBufferOrder;
    }
}
