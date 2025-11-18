package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public final class CodedOutputStream {

    /* renamed from: a */
    private final byte[] f41248a;

    /* renamed from: b */
    private final int f41249b;

    /* renamed from: e */
    private final OutputStream f41252e;

    /* renamed from: d */
    private int f41251d = 0;

    /* renamed from: c */
    private int f41250c = 0;

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f41252e = outputStream;
        this.f41248a = bArr;
        this.f41249b = bArr.length;
    }

    /* renamed from: A */
    public static int m38165A(int i2, long j2) {
        return m38168D(i2) + m38166B(j2);
    }

    /* renamed from: B */
    public static int m38166B(long j2) {
        return m38197w(m38172H(j2));
    }

    /* renamed from: C */
    public static int m38167C(String str) throws UnsupportedEncodingException {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m38196v(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported.", e2);
        }
    }

    /* renamed from: D */
    public static int m38168D(int i2) {
        return m38196v(C10764w.m38496c(i2, 0));
    }

    /* renamed from: E */
    public static int m38169E(int i2) {
        return m38196v(i2);
    }

    /* renamed from: F */
    public static int m38170F(long j2) {
        return m38197w(j2);
    }

    /* renamed from: G */
    public static int m38171G(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    /* renamed from: H */
    public static long m38172H(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    /* renamed from: J */
    public static CodedOutputStream m38173J(OutputStream outputStream, int i2) {
        return new CodedOutputStream(outputStream, new byte[i2]);
    }

    /* renamed from: K */
    private void m38174K() throws IOException {
        OutputStream outputStream = this.f41252e;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.f41248a, 0, this.f41250c);
        this.f41250c = 0;
    }

    /* renamed from: a */
    public static int m38175a(int i2, boolean z) {
        return m38168D(i2) + m38176b(z);
    }

    /* renamed from: b */
    public static int m38176b(boolean z) {
        return 1;
    }

    /* renamed from: c */
    public static int m38177c(byte[] bArr) {
        return m38196v(bArr.length) + bArr.length;
    }

    /* renamed from: d */
    public static int m38178d(int i2, AbstractC10745d abstractC10745d) {
        return m38168D(i2) + m38179e(abstractC10745d);
    }

    /* renamed from: e */
    public static int m38179e(AbstractC10745d abstractC10745d) {
        return m38196v(abstractC10745d.size()) + abstractC10745d.size();
    }

    /* renamed from: f */
    public static int m38180f(int i2, double d2) {
        return m38168D(i2) + m38181g(d2);
    }

    /* renamed from: g */
    public static int m38181g(double d2) {
        return 8;
    }

    /* renamed from: h */
    public static int m38182h(int i2, int i3) {
        return m38168D(i2) + m38183i(i3);
    }

    /* renamed from: i */
    public static int m38183i(int i2) {
        return m38190p(i2);
    }

    /* renamed from: j */
    public static int m38184j(int i2) {
        return 4;
    }

    /* renamed from: k */
    public static int m38185k(long j2) {
        return 8;
    }

    /* renamed from: l */
    public static int m38186l(int i2, float f2) {
        return m38168D(i2) + m38187m(f2);
    }

    /* renamed from: m */
    public static int m38187m(float f2) {
        return 4;
    }

    /* renamed from: n */
    public static int m38188n(InterfaceC10756o interfaceC10756o) {
        return interfaceC10756o.mo34078e();
    }

    /* renamed from: o */
    public static int m38189o(int i2, int i3) {
        return m38168D(i2) + m38190p(i3);
    }

    /* renamed from: p */
    public static int m38190p(int i2) {
        if (i2 >= 0) {
            return m38196v(i2);
        }
        return 10;
    }

    /* renamed from: q */
    public static int m38191q(long j2) {
        return m38197w(j2);
    }

    /* renamed from: r */
    public static int m38192r(C10752k c10752k) {
        int iM38420b = c10752k.m38420b();
        return m38196v(iM38420b) + iM38420b;
    }

    /* renamed from: s */
    public static int m38193s(int i2, InterfaceC10756o interfaceC10756o) {
        return m38168D(i2) + m38194t(interfaceC10756o);
    }

    /* renamed from: t */
    public static int m38194t(InterfaceC10756o interfaceC10756o) {
        int iMo34078e = interfaceC10756o.mo34078e();
        return m38196v(iMo34078e) + iMo34078e;
    }

    /* renamed from: u */
    static int m38195u(int i2) {
        return i2 > 4096 ? RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT : i2;
    }

    /* renamed from: v */
    public static int m38196v(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: w */
    public static int m38197w(long j2) {
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (((-16384) & j2) == 0) {
            return 2;
        }
        if (((-2097152) & j2) == 0) {
            return 3;
        }
        if (((-268435456) & j2) == 0) {
            return 4;
        }
        if (((-34359738368L) & j2) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j2) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j2) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: x */
    public static int m38198x(int i2) {
        return 4;
    }

    /* renamed from: y */
    public static int m38199y(long j2) {
        return 8;
    }

    /* renamed from: z */
    public static int m38200z(int i2) {
        return m38196v(m38171G(i2));
    }

    /* renamed from: I */
    public void m38201I() throws IOException {
        if (this.f41252e != null) {
            m38174K();
        }
    }

    /* renamed from: L */
    public void m38202L(int i2, boolean z) throws IOException {
        m38239w0(i2, 0);
        m38203M(z);
    }

    /* renamed from: M */
    public void m38203M(boolean z) throws IOException {
        m38224h0(z ? 1 : 0);
    }

    /* renamed from: N */
    public void m38204N(byte[] bArr) throws IOException {
        m38231o0(bArr.length);
        m38227k0(bArr);
    }

    /* renamed from: O */
    public void m38205O(int i2, AbstractC10745d abstractC10745d) throws IOException {
        m38239w0(i2, 2);
        m38206P(abstractC10745d);
    }

    /* renamed from: P */
    public void m38206P(AbstractC10745d abstractC10745d) throws IOException {
        m38231o0(abstractC10745d.size());
        m38225i0(abstractC10745d);
    }

    /* renamed from: Q */
    public void m38207Q(int i2, double d2) throws IOException {
        m38239w0(i2, 1);
        m38208R(d2);
    }

    /* renamed from: R */
    public void m38208R(double d2) throws IOException {
        m38230n0(Double.doubleToRawLongBits(d2));
    }

    /* renamed from: S */
    public void m38209S(int i2, int i3) throws IOException {
        m38239w0(i2, 0);
        m38210T(i3);
    }

    /* renamed from: T */
    public void m38210T(int i2) throws IOException {
        m38218b0(i2);
    }

    /* renamed from: U */
    public void m38211U(int i2) throws IOException {
        m38229m0(i2);
    }

    /* renamed from: V */
    public void m38212V(long j2) throws IOException {
        m38230n0(j2);
    }

    /* renamed from: W */
    public void m38213W(int i2, float f2) throws IOException {
        m38239w0(i2, 5);
        m38214X(f2);
    }

    /* renamed from: X */
    public void m38214X(float f2) throws IOException {
        m38229m0(Float.floatToRawIntBits(f2));
    }

    /* renamed from: Y */
    public void m38215Y(int i2, InterfaceC10756o interfaceC10756o) throws IOException {
        m38239w0(i2, 3);
        m38216Z(interfaceC10756o);
        m38239w0(i2, 4);
    }

    /* renamed from: Z */
    public void m38216Z(InterfaceC10756o interfaceC10756o) throws IOException {
        interfaceC10756o.mo34081h(this);
    }

    /* renamed from: a0 */
    public void m38217a0(int i2, int i3) throws IOException {
        m38239w0(i2, 0);
        m38218b0(i3);
    }

    /* renamed from: b0 */
    public void m38218b0(int i2) throws IOException {
        if (i2 >= 0) {
            m38231o0(i2);
        } else {
            m38232p0(i2);
        }
    }

    /* renamed from: c0 */
    public void m38219c0(long j2) throws IOException {
        m38232p0(j2);
    }

    /* renamed from: d0 */
    public void m38220d0(int i2, InterfaceC10756o interfaceC10756o) throws IOException {
        m38239w0(i2, 2);
        m38221e0(interfaceC10756o);
    }

    /* renamed from: e0 */
    public void m38221e0(InterfaceC10756o interfaceC10756o) throws IOException {
        m38231o0(interfaceC10756o.mo34078e());
        interfaceC10756o.mo34081h(this);
    }

    /* renamed from: f0 */
    public void m38222f0(int i2, InterfaceC10756o interfaceC10756o) throws IOException {
        m38239w0(1, 3);
        m38240x0(2, i2);
        m38220d0(3, interfaceC10756o);
        m38239w0(1, 4);
    }

    /* renamed from: g0 */
    public void m38223g0(byte b2) throws IOException {
        if (this.f41250c == this.f41249b) {
            m38174K();
        }
        byte[] bArr = this.f41248a;
        int i2 = this.f41250c;
        this.f41250c = i2 + 1;
        bArr[i2] = b2;
        this.f41251d++;
    }

    /* renamed from: h0 */
    public void m38224h0(int i2) throws IOException {
        m38223g0((byte) i2);
    }

    /* renamed from: i0 */
    public void m38225i0(AbstractC10745d abstractC10745d) throws IOException {
        m38226j0(abstractC10745d, 0, abstractC10745d.size());
    }

    /* renamed from: j0 */
    public void m38226j0(AbstractC10745d abstractC10745d, int i2, int i3) throws IOException {
        int i4 = this.f41249b;
        int i5 = this.f41250c;
        if (i4 - i5 >= i3) {
            abstractC10745d.m38287o(this.f41248a, i2, i5, i3);
            this.f41250c += i3;
            this.f41251d += i3;
            return;
        }
        int i6 = i4 - i5;
        abstractC10745d.m38287o(this.f41248a, i2, i5, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f41250c = this.f41249b;
        this.f41251d += i6;
        m38174K();
        if (i8 <= this.f41249b) {
            abstractC10745d.m38287o(this.f41248a, i7, 0, i8);
            this.f41250c = i8;
        } else {
            abstractC10745d.m38284E(this.f41252e, i7, i8);
        }
        this.f41251d += i8;
    }

    /* renamed from: k0 */
    public void m38227k0(byte[] bArr) throws IOException {
        m38228l0(bArr, 0, bArr.length);
    }

    /* renamed from: l0 */
    public void m38228l0(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f41249b;
        int i5 = this.f41250c;
        if (i4 - i5 >= i3) {
            System.arraycopy(bArr, i2, this.f41248a, i5, i3);
            this.f41250c += i3;
            this.f41251d += i3;
            return;
        }
        int i6 = i4 - i5;
        System.arraycopy(bArr, i2, this.f41248a, i5, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f41250c = this.f41249b;
        this.f41251d += i6;
        m38174K();
        if (i8 <= this.f41249b) {
            System.arraycopy(bArr, i7, this.f41248a, 0, i8);
            this.f41250c = i8;
        } else {
            this.f41252e.write(bArr, i7, i8);
        }
        this.f41251d += i8;
    }

    /* renamed from: m0 */
    public void m38229m0(int i2) throws IOException {
        m38224h0(i2 & 255);
        m38224h0((i2 >> 8) & 255);
        m38224h0((i2 >> 16) & 255);
        m38224h0((i2 >> 24) & 255);
    }

    /* renamed from: n0 */
    public void m38230n0(long j2) throws IOException {
        m38224h0(((int) j2) & 255);
        m38224h0(((int) (j2 >> 8)) & 255);
        m38224h0(((int) (j2 >> 16)) & 255);
        m38224h0(((int) (j2 >> 24)) & 255);
        m38224h0(((int) (j2 >> 32)) & 255);
        m38224h0(((int) (j2 >> 40)) & 255);
        m38224h0(((int) (j2 >> 48)) & 255);
        m38224h0(((int) (j2 >> 56)) & 255);
    }

    /* renamed from: o0 */
    public void m38231o0(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            m38224h0((i2 & 127) | 128);
            i2 >>>= 7;
        }
        m38224h0(i2);
    }

    /* renamed from: p0 */
    public void m38232p0(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            m38224h0((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        m38224h0((int) j2);
    }

    /* renamed from: q0 */
    public void m38233q0(int i2) throws IOException {
        m38229m0(i2);
    }

    /* renamed from: r0 */
    public void m38234r0(long j2) throws IOException {
        m38230n0(j2);
    }

    /* renamed from: s0 */
    public void m38235s0(int i2) throws IOException {
        m38231o0(m38171G(i2));
    }

    /* renamed from: t0 */
    public void m38236t0(int i2, long j2) throws IOException {
        m38239w0(i2, 0);
        m38237u0(j2);
    }

    /* renamed from: u0 */
    public void m38237u0(long j2) throws IOException {
        m38232p0(m38172H(j2));
    }

    /* renamed from: v0 */
    public void m38238v0(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m38231o0(bytes.length);
        m38227k0(bytes);
    }

    /* renamed from: w0 */
    public void m38239w0(int i2, int i3) throws IOException {
        m38231o0(C10764w.m38496c(i2, i3));
    }

    /* renamed from: x0 */
    public void m38240x0(int i2, int i3) throws IOException {
        m38239w0(i2, 0);
        m38241y0(i3);
    }

    /* renamed from: y0 */
    public void m38241y0(int i2) throws IOException {
        m38231o0(i2);
    }

    /* renamed from: z0 */
    public void m38242z0(long j2) throws IOException {
        m38232p0(j2);
    }
}
