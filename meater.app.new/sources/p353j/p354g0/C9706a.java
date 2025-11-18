package p353j.p354g0;

import java.io.EOFException;
import kotlin.jvm.internal.C9801m;
import p353j.C9695b;
import p353j.C9703f;
import p353j.C9721t;
import p353j.C9726y;

/* compiled from: Buffer.kt */
/* renamed from: j.g0.a */
/* loaded from: classes3.dex */
public final class C9706a {

    /* renamed from: a */
    private static final byte[] f37049a = C9695b.m31979a("0123456789abcdef");

    /* renamed from: a */
    public static final C9703f.a m32070a(C9703f c9703f, C9703f.a aVar) {
        C9801m.m32346f(c9703f, "$this$commonReadAndWriteUnsafe");
        C9801m.m32346f(aVar, "unsafeCursor");
        if (!(aVar.f37040f == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        aVar.f37040f = c9703f;
        aVar.f37041g = true;
        return aVar;
    }

    /* renamed from: b */
    public static final byte[] m32071b() {
        return f37049a;
    }

    /* renamed from: c */
    public static final boolean m32072c(C9726y c9726y, int i2, byte[] bArr, int i3, int i4) {
        C9801m.m32346f(c9726y, "segment");
        C9801m.m32346f(bArr, "bytes");
        int i5 = c9726y.f37093d;
        byte[] bArr2 = c9726y.f37091b;
        while (i3 < i4) {
            if (i2 == i5) {
                c9726y = c9726y.f37096g;
                C9801m.m32343c(c9726y);
                byte[] bArr3 = c9726y.f37091b;
                bArr2 = bArr3;
                i2 = c9726y.f37092c;
                i5 = c9726y.f37093d;
            }
            if (bArr2[i2] != bArr[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    /* renamed from: d */
    public static final String m32073d(C9703f c9703f, long j2) throws EOFException {
        C9801m.m32346f(c9703f, "$this$readUtf8Line");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (c9703f.m32047m(j3) == ((byte) 13)) {
                String strM32027Z = c9703f.m32027Z(j3);
                c9703f.skip(2L);
                return strM32027Z;
            }
        }
        String strM32027Z2 = c9703f.m32027Z(j2);
        c9703f.skip(1L);
        return strM32027Z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r19 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        return r10;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m32074e(p353j.C9703f r17, p353j.C9721t r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 177
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p353j.p354g0.C9706a.m32074e(j.f, j.t, boolean):int");
    }

    /* renamed from: f */
    public static /* synthetic */ int m32075f(C9703f c9703f, C9721t c9721t, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m32074e(c9703f, c9721t, z);
    }
}
