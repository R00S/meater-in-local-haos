package p353j;

import kotlin.jvm.internal.C9801m;
import p353j.p354g0.C9707b;

/* compiled from: -Util.kt */
/* renamed from: j.c */
/* loaded from: classes3.dex */
public final class C9697c {
    /* renamed from: a */
    public static final boolean m31981a(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        C9801m.m32346f(bArr, "a");
        C9801m.m32346f(bArr2, "b");
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final void m31982b(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    /* renamed from: c */
    public static final int m31983c(int i2) {
        return ((i2 & 255) << 24) | (((-16777216) & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    /* renamed from: d */
    public static final short m31984d(short s) {
        int i2 = s & 65535;
        return (short) (((i2 & 255) << 8) | ((65280 & i2) >>> 8));
    }

    /* renamed from: e */
    public static final String m31985e(byte b2) {
        return new String(new char[]{C9707b.m32081f()[(b2 >> 4) & 15], C9707b.m32081f()[b2 & 15]});
    }

    /* renamed from: f */
    public static final String m31986f(int i2) {
        if (i2 == 0) {
            return "0";
        }
        int i3 = 0;
        char[] cArr = {C9707b.m32081f()[(i2 >> 28) & 15], C9707b.m32081f()[(i2 >> 24) & 15], C9707b.m32081f()[(i2 >> 20) & 15], C9707b.m32081f()[(i2 >> 16) & 15], C9707b.m32081f()[(i2 >> 12) & 15], C9707b.m32081f()[(i2 >> 8) & 15], C9707b.m32081f()[(i2 >> 4) & 15], C9707b.m32081f()[i2 & 15]};
        while (i3 < 8 && cArr[i3] == '0') {
            i3++;
        }
        return new String(cArr, i3, 8 - i3);
    }
}
