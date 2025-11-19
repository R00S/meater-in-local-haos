package Wb;

import Ub.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Uuid.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000e\u001a\u00020\r*\u00020\u00072\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "randomBytes", "LWb/c;", "f", "([B)LWb/c;", "", "startIndex", "", "e", "([BI)J", "dst", "dstOffset", "count", "Loa/F;", "d", "(J[BII)V", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
/* loaded from: classes3.dex */
class e extends d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(long j10, byte[] bArr, int i10, int i11) {
        int i12 = i10 + (i11 * 2);
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = f.a()[(int) (255 & j10)];
            bArr[i12 - 1] = (byte) i14;
            i12 -= 2;
            bArr[i12] = (byte) (i14 >> 8);
            j10 >>= 8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(byte[] bArr, int i10) {
        return (bArr[i10 + 7] & 255) | ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
    }

    public static final c f(byte[] randomBytes) {
        C3862t.g(randomBytes, "randomBytes");
        byte b10 = (byte) (randomBytes[6] & 15);
        randomBytes[6] = b10;
        randomBytes[6] = (byte) (b10 | 64);
        byte b11 = (byte) (randomBytes[8] & 63);
        randomBytes[8] = b11;
        randomBytes[8] = (byte) (b11 | 128);
        return c.INSTANCE.a(randomBytes);
    }
}
