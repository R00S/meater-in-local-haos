package t8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* compiled from: ChaCha20Util.java */
/* renamed from: t8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4575a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f49971a = e(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    static void a(int[] iArr, int i10, int i11, int i12, int i13) {
        int i14 = iArr[i10] + iArr[i11];
        iArr[i10] = i14;
        int iB = b(i14 ^ iArr[i13], 16);
        iArr[i13] = iB;
        int i15 = iArr[i12] + iB;
        iArr[i12] = i15;
        int iB2 = b(iArr[i11] ^ i15, 12);
        iArr[i11] = iB2;
        int i16 = iArr[i10] + iB2;
        iArr[i10] = i16;
        int iB3 = b(iArr[i13] ^ i16, 8);
        iArr[i13] = iB3;
        int i17 = iArr[i12] + iB3;
        iArr[i12] = i17;
        iArr[i11] = b(iArr[i11] ^ i17, 7);
    }

    private static int b(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    static void c(int[] iArr, int[] iArr2) {
        int[] iArr3 = f49971a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static void d(int[] iArr) {
        for (int i10 = 0; i10 < 10; i10++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }

    static int[] e(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }
}
