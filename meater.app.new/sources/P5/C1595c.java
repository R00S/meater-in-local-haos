package P5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: BinUtils.java */
/* renamed from: P5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1595c {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f14027a = "0123456789ABCDEF".toCharArray();

    public static int a(byte b10) {
        return b10 & 255;
    }

    public static String b(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f14027a;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static long c(byte[] bArr) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.put(bArr, 0, 8);
        byteBufferAllocate.flip();
        return byteBufferAllocate.getLong(0);
    }

    public static byte[] d(long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putLong(j10);
        return byteBufferAllocate.array();
    }
}
