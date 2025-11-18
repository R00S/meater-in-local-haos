package p353j;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.collections.C10801m;
import kotlin.jvm.internal.C9801m;
import p353j.p354g0.C9708c;

/* compiled from: SegmentedByteString.kt */
/* renamed from: j.a0 */
/* loaded from: classes3.dex */
public final class C9694a0 extends C9710i {

    /* renamed from: k */
    private final transient byte[][] f37031k;

    /* renamed from: l */
    private final transient int[] f37032l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9694a0(byte[][] bArr, int[] iArr) {
        super(C9710i.f37051f.m32098y());
        C9801m.m32346f(bArr, "segments");
        C9801m.m32346f(iArr, "directory");
        this.f37031k = bArr;
        this.f37032l = iArr;
    }

    /* renamed from: X */
    private final C9710i m31965X() {
        return new C9710i(m31976W());
    }

    private final Object writeReplace() {
        C9710i c9710iM31965X = m31965X();
        if (c9710iM31965X != null) {
            return c9710iM31965X;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
    }

    @Override // p353j.C9710i
    /* renamed from: D */
    public int mo31966D() {
        return m31974U()[m31975V().length - 1];
    }

    @Override // p353j.C9710i
    /* renamed from: F */
    public String mo31967F() {
        return m31965X().mo31967F();
    }

    @Override // p353j.C9710i
    /* renamed from: G */
    public byte[] mo31968G() {
        return m31976W();
    }

    @Override // p353j.C9710i
    /* renamed from: H */
    public byte mo31969H(int i2) {
        C9697c.m31982b(m31974U()[m31975V().length - 1], i2, 1L);
        int iM32083b = C9708c.m32083b(this, i2);
        return m31975V()[iM32083b][(i2 - (iM32083b == 0 ? 0 : m31974U()[iM32083b - 1])) + m31974U()[m31975V().length + iM32083b]];
    }

    @Override // p353j.C9710i
    /* renamed from: J */
    public boolean mo31970J(int i2, C9710i c9710i, int i3, int i4) {
        C9801m.m32346f(c9710i, "other");
        if (i2 < 0 || i2 > m32093P() - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int iM32083b = C9708c.m32083b(this, i2);
        while (i2 < i5) {
            int i6 = iM32083b == 0 ? 0 : m31974U()[iM32083b - 1];
            int i7 = m31974U()[iM32083b] - i6;
            int i8 = m31974U()[m31975V().length + iM32083b];
            int iMin = Math.min(i5, i7 + i6) - i2;
            if (!c9710i.mo31971K(i3, m31975V()[iM32083b], i8 + (i2 - i6), iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iM32083b++;
        }
        return true;
    }

    @Override // p353j.C9710i
    /* renamed from: K */
    public boolean mo31971K(int i2, byte[] bArr, int i3, int i4) {
        C9801m.m32346f(bArr, "other");
        if (i2 < 0 || i2 > m32093P() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int iM32083b = C9708c.m32083b(this, i2);
        while (i2 < i5) {
            int i6 = iM32083b == 0 ? 0 : m31974U()[iM32083b - 1];
            int i7 = m31974U()[iM32083b] - i6;
            int i8 = m31974U()[m31975V().length + iM32083b];
            int iMin = Math.min(i5, i7 + i6) - i2;
            if (!C9697c.m31981a(m31975V()[iM32083b], i8 + (i2 - i6), bArr, i3, iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iM32083b++;
        }
        return true;
    }

    @Override // p353j.C9710i
    /* renamed from: R */
    public C9710i mo31972R() {
        return m31965X().mo31972R();
    }

    @Override // p353j.C9710i
    /* renamed from: T */
    public void mo31973T(C9703f c9703f, int i2, int i3) {
        C9801m.m32346f(c9703f, "buffer");
        int i4 = i2 + i3;
        int iM32083b = C9708c.m32083b(this, i2);
        while (i2 < i4) {
            int i5 = iM32083b == 0 ? 0 : m31974U()[iM32083b - 1];
            int i6 = m31974U()[iM32083b] - i5;
            int i7 = m31974U()[m31975V().length + iM32083b];
            int iMin = Math.min(i4, i6 + i5) - i2;
            int i8 = i7 + (i2 - i5);
            C9726y c9726y = new C9726y(m31975V()[iM32083b], i8, i8 + iMin, true, false);
            C9726y c9726y2 = c9703f.f37038f;
            if (c9726y2 == null) {
                c9726y.f37097h = c9726y;
                c9726y.f37096g = c9726y;
                c9703f.f37038f = c9726y;
            } else {
                C9801m.m32343c(c9726y2);
                C9726y c9726y3 = c9726y2.f37097h;
                C9801m.m32343c(c9726y3);
                c9726y3.m32163c(c9726y);
            }
            i2 += iMin;
            iM32083b++;
        }
        c9703f.m32038f0(c9703f.size() + i3);
    }

    /* renamed from: U */
    public final int[] m31974U() {
        return this.f37032l;
    }

    /* renamed from: V */
    public final byte[][] m31975V() {
        return this.f37031k;
    }

    /* renamed from: W */
    public byte[] m31976W() {
        byte[] bArr = new byte[m32093P()];
        int length = m31975V().length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = m31974U()[length + i2];
            int i6 = m31974U()[i2];
            int i7 = i6 - i3;
            C10801m.m38703d(m31975V()[i2], bArr, i4, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    @Override // p353j.C9710i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9710i) {
            C9710i c9710i = (C9710i) obj;
            if (c9710i.m32093P() == m32093P() && mo31970J(0, c9710i, 0, m32093P())) {
                return true;
            }
        }
        return false;
    }

    @Override // p353j.C9710i
    /* renamed from: g */
    public String mo31977g() {
        return m31965X().mo31977g();
    }

    @Override // p353j.C9710i
    public int hashCode() {
        int iM32086A = m32086A();
        if (iM32086A != 0) {
            return iM32086A;
        }
        int length = m31975V().length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int i5 = m31974U()[length + i2];
            int i6 = m31974U()[i2];
            byte[] bArr = m31975V()[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        m32089L(i3);
        return i3;
    }

    @Override // p353j.C9710i
    public String toString() {
        return m31965X().toString();
    }

    @Override // p353j.C9710i
    /* renamed from: u */
    public C9710i mo31978u(String str) throws NoSuchAlgorithmException {
        C9801m.m32346f(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = m31975V().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = m31974U()[length + i2];
            int i5 = m31974U()[i2];
            messageDigest.update(m31975V()[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] bArrDigest = messageDigest.digest();
        C9801m.m32345e(bArrDigest, "digestBytes");
        return new C9710i(bArrDigest);
    }
}
