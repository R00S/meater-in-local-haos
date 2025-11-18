package p353j;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.collections.C10801m;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import p353j.p354g0.C9707b;

/* compiled from: ByteString.kt */
/* renamed from: j.i */
/* loaded from: classes3.dex */
public class C9710i implements Serializable, Comparable<C9710i> {

    /* renamed from: h */
    private transient int f37053h;

    /* renamed from: i */
    private transient String f37054i;

    /* renamed from: j */
    private final byte[] f37055j;

    /* renamed from: g */
    public static final a f37052g = new a(null);

    /* renamed from: f */
    public static final C9710i f37051f = new C9710i(new byte[0]);

    /* compiled from: ByteString.kt */
    /* renamed from: j.i$a */
    public static final class a {
        private a() {
        }

        /* renamed from: f */
        public static /* synthetic */ C9710i m32099f(a aVar, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = bArr.length;
            }
            return aVar.m32104e(bArr, i2, i3);
        }

        /* renamed from: a */
        public final C9710i m32100a(String str) {
            C9801m.m32346f(str, "$this$decodeBase64");
            byte[] bArrM31962a = C9693a.m31962a(str);
            if (bArrM31962a != null) {
                return new C9710i(bArrM31962a);
            }
            return null;
        }

        /* renamed from: b */
        public final C9710i m32101b(String str) {
            C9801m.m32346f(str, "$this$decodeHex");
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) ((C9707b.m32080e(str.charAt(i3)) << 4) + C9707b.m32080e(str.charAt(i3 + 1)));
            }
            return new C9710i(bArr);
        }

        /* renamed from: c */
        public final C9710i m32102c(String str, Charset charset) {
            C9801m.m32346f(str, "$this$encode");
            C9801m.m32346f(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            C9801m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
            return new C9710i(bytes);
        }

        /* renamed from: d */
        public final C9710i m32103d(String str) {
            C9801m.m32346f(str, "$this$encodeUtf8");
            C9710i c9710i = new C9710i(C9695b.m31979a(str));
            c9710i.m32090M(str);
            return c9710i;
        }

        /* renamed from: e */
        public final C9710i m32104e(byte[] bArr, int i2, int i3) {
            C9801m.m32346f(bArr, "$this$toByteString");
            C9697c.m31982b(bArr.length, i2, i3);
            return new C9710i(C10801m.m38707h(bArr, i2, i3 + i2));
        }

        /* renamed from: g */
        public final C9710i m32105g(InputStream inputStream, int i2) throws IOException {
            C9801m.m32346f(inputStream, "$this$readByteString");
            int i3 = 0;
            if (!(i2 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + i2).toString());
            }
            byte[] bArr = new byte[i2];
            while (i3 < i2) {
                int i4 = inputStream.read(bArr, i3, i2 - i3);
                if (i4 == -1) {
                    throw new EOFException();
                }
                i3 += i4;
            }
            return new C9710i(bArr);
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    public C9710i(byte[] bArr) {
        C9801m.m32346f(bArr, "data");
        this.f37055j = bArr;
    }

    /* renamed from: q */
    public static final C9710i m32084q(String str) {
        return f37052g.m32101b(str);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException, IllegalArgumentException {
        C9710i c9710iM32105g = f37052g.m32105g(objectInputStream, objectInputStream.readInt());
        Field declaredField = C9710i.class.getDeclaredField("j");
        C9801m.m32345e(declaredField, "field");
        declaredField.setAccessible(true);
        declaredField.set(this, c9710iM32105g.f37055j);
    }

    /* renamed from: v */
    public static final C9710i m32085v(String str) {
        return f37052g.m32103d(str);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f37055j.length);
        objectOutputStream.write(this.f37055j);
    }

    /* renamed from: A */
    public final int m32086A() {
        return this.f37053h;
    }

    /* renamed from: D */
    public int mo31966D() {
        return m32098y().length;
    }

    /* renamed from: E */
    public final String m32087E() {
        return this.f37054i;
    }

    /* renamed from: F */
    public String mo31967F() {
        char[] cArr = new char[m32098y().length * 2];
        int i2 = 0;
        for (byte b2 : m32098y()) {
            int i3 = i2 + 1;
            cArr[i2] = C9707b.m32081f()[(b2 >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = C9707b.m32081f()[b2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: G */
    public byte[] mo31968G() {
        return m32098y();
    }

    /* renamed from: H */
    public byte mo31969H(int i2) {
        return m32098y()[i2];
    }

    /* renamed from: I */
    public final C9710i m32088I() {
        return mo31978u("MD5");
    }

    /* renamed from: J */
    public boolean mo31970J(int i2, C9710i c9710i, int i3, int i4) {
        C9801m.m32346f(c9710i, "other");
        return c9710i.mo31971K(i3, m32098y(), i2, i4);
    }

    /* renamed from: K */
    public boolean mo31971K(int i2, byte[] bArr, int i3, int i4) {
        C9801m.m32346f(bArr, "other");
        return i2 >= 0 && i2 <= m32098y().length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && C9697c.m31981a(m32098y(), i2, bArr, i3, i4);
    }

    /* renamed from: L */
    public final void m32089L(int i2) {
        this.f37053h = i2;
    }

    /* renamed from: M */
    public final void m32090M(String str) {
        this.f37054i = str;
    }

    /* renamed from: N */
    public final C9710i m32091N() {
        return mo31978u("SHA-1");
    }

    /* renamed from: O */
    public final C9710i m32092O() {
        return mo31978u("SHA-256");
    }

    /* renamed from: P */
    public final int m32093P() {
        return mo31966D();
    }

    /* renamed from: Q */
    public final boolean m32094Q(C9710i c9710i) {
        C9801m.m32346f(c9710i, "prefix");
        return mo31970J(0, c9710i, 0, c9710i.m32093P());
    }

    /* renamed from: R */
    public C9710i mo31972R() {
        byte b2;
        for (int i2 = 0; i2 < m32098y().length; i2++) {
            byte b3 = m32098y()[i2];
            byte b4 = (byte) 65;
            if (b3 >= b4 && b3 <= (b2 = (byte) 90)) {
                byte[] bArrM32098y = m32098y();
                byte[] bArrCopyOf = Arrays.copyOf(bArrM32098y, bArrM32098y.length);
                C9801m.m32345e(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i2] = (byte) (b3 + 32);
                for (int i3 = i2 + 1; i3 < bArrCopyOf.length; i3++) {
                    byte b5 = bArrCopyOf[i3];
                    if (b5 >= b4 && b5 <= b2) {
                        bArrCopyOf[i3] = (byte) (b5 + 32);
                    }
                }
                return new C9710i(bArrCopyOf);
            }
        }
        return this;
    }

    /* renamed from: S */
    public String m32095S() {
        String strM32087E = m32087E();
        if (strM32087E != null) {
            return strM32087E;
        }
        String strM31980b = C9695b.m31980b(mo31968G());
        m32090M(strM31980b);
        return strM31980b;
    }

    /* renamed from: T */
    public void mo31973T(C9703f c9703f, int i2, int i3) {
        C9801m.m32346f(c9703f, "buffer");
        C9707b.m32079d(this, c9703f, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9710i) {
            C9710i c9710i = (C9710i) obj;
            if (c9710i.m32093P() == m32098y().length && c9710i.mo31971K(0, m32098y(), 0, m32098y().length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public String mo31977g() {
        return C9693a.m31964c(m32098y(), null, 1, null);
    }

    public int hashCode() {
        int iM32086A = m32086A();
        if (iM32086A != 0) {
            return iM32086A;
        }
        int iHashCode = Arrays.hashCode(m32098y());
        m32089L(iHashCode);
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(p353j.C9710i r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.C9801m.m32346f(r10, r0)
            int r0 = r9.m32093P()
            int r1 = r10.m32093P()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.m32097x(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.m32097x(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p353j.C9710i.compareTo(j.i):int");
    }

    public String toString() {
        if (m32098y().length == 0) {
            return "[size=0]";
        }
        int iM32078c = C9707b.m32078c(m32098y(), 64);
        if (iM32078c == -1) {
            if (m32098y().length <= 64) {
                return "[hex=" + mo31967F() + ']';
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[size=");
            sb.append(m32098y().length);
            sb.append(" hex=");
            if (64 <= m32098y().length) {
                sb.append((64 == m32098y().length ? this : new C9710i(C10801m.m38707h(m32098y(), 0, 64))).mo31967F());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + m32098y().length + ')').toString());
        }
        String strM32095S = m32095S();
        if (strM32095S == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = strM32095S.substring(0, iM32078c);
        C9801m.m32345e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String strM37507A = C10546u.m37507A(C10546u.m37507A(C10546u.m37507A(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
        if (iM32078c >= strM32095S.length()) {
            return "[text=" + strM37507A + ']';
        }
        return "[size=" + m32098y().length + " text=" + strM37507A + "…]";
    }

    /* renamed from: u */
    public C9710i mo31978u(String str) throws NoSuchAlgorithmException {
        C9801m.m32346f(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f37055j, 0, m32093P());
        byte[] bArrDigest = messageDigest.digest();
        C9801m.m32345e(bArrDigest, "digestBytes");
        return new C9710i(bArrDigest);
    }

    /* renamed from: x */
    public final byte m32097x(int i2) {
        return mo31969H(i2);
    }

    /* renamed from: y */
    public final byte[] m32098y() {
        return this.f37055j;
    }
}
