package Cc;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ByteString.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0016\u0018\u0000 ,2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001IB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\tJ\u000f\u0010\u0013\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0014H\u0087\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u001f\u0010\u001eJ'\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0014H\u0010¢\u0006\u0004\b%\u0010&J/\u0010*\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0014H\u0016¢\u0006\u0004\b*\u0010+J/\u0010,\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0014H\u0016¢\u0006\u0004\b,\u0010-J3\u00100\u001a\u00020$2\b\b\u0002\u0010\"\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020)2\u0006\u00102\u001a\u00020\u0000¢\u0006\u0004\b3\u00104J\u001a\u00106\u001a\u00020)2\b\u0010'\u001a\u0004\u0018\u000105H\u0096\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0014H\u0016¢\u0006\u0004\b8\u0010\u001cJ\u0018\u00109\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0007H\u0016¢\u0006\u0004\b;\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010\u001eR\"\u00108\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010\u000e\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010AR$\u0010F\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010B\u001a\u0004\bC\u0010\t\"\u0004\bD\u0010ER\u0011\u0010H\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\bG\u0010\u001c¨\u0006J"}, d2 = {"LCc/h;", "Ljava/io/Serializable;", "", "", "data", "<init>", "([B)V", "", "N", "()Ljava/lang/String;", "c", "B", "()LCc/h;", "H", "I", "algorithm", "p", "(Ljava/lang/String;)LCc/h;", "y", "L", "", "pos", "", "A", "(I)B", "index", "t", "w", "()I", "M", "()[B", "z", "LCc/e;", "buffer", "offset", "byteCount", "Loa/F;", "O", "(LCc/e;II)V", "other", "otherOffset", "", "D", "(ILCc/h;II)Z", "E", "(I[BII)Z", "target", "targetOffset", "n", "(I[BII)V", "prefix", "K", "(LCc/h;)Z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "j", "(LCc/h;)I", "toString", "[B", "u", "C", "v", "F", "(I)V", "Ljava/lang/String;", "x", "G", "(Ljava/lang/String;)V", "utf8", "J", "size", "a", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class h implements Serializable, Comparable<h> {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: F, reason: collision with root package name */
    public static final h f3238F = new h(new byte[0]);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final byte[] data;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private transient int hashCode;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private transient String utf8;

    /* compiled from: ByteString.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00020\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0007*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u0007*\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0007*\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0011J\u0013\u0010\u0017\u001a\u00020\u0007*\u00020\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LCc/h$a;", "", "<init>", "()V", "", "", "data", "LCc/h;", "e", "([B)LCc/h;", "", "offset", "byteCount", "f", "([BII)LCc/h;", "", "d", "(Ljava/lang/String;)LCc/h;", "Ljava/nio/charset/Charset;", "charset", "c", "(Ljava/lang/String;Ljava/nio/charset/Charset;)LCc/h;", "a", "b", "EMPTY", "LCc/h;", "", "serialVersionUID", "J", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cc.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public static /* synthetic */ h g(Companion companion, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = C0979b.c();
            }
            return companion.f(bArr, i10, i11);
        }

        public final h a(String str) {
            C3862t.g(str, "<this>");
            byte[] bArrA = C0978a.a(str);
            if (bArrA != null) {
                return new h(bArrA);
            }
            return null;
        }

        public final h b(String str) {
            C3862t.g(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((Dc.b.e(str.charAt(i11)) << 4) + Dc.b.e(str.charAt(i11 + 1)));
            }
            return new h(bArr);
        }

        public final h c(String str, Charset charset) {
            C3862t.g(str, "<this>");
            C3862t.g(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            C3862t.f(bytes, "getBytes(...)");
            return new h(bytes);
        }

        public final h d(String str) {
            C3862t.g(str, "<this>");
            h hVar = new h(E.a(str));
            hVar.G(str);
            return hVar;
        }

        public final h e(byte... data) {
            C3862t.g(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            C3862t.f(bArrCopyOf, "copyOf(...)");
            return new h(bArrCopyOf);
        }

        public final h f(byte[] bArr, int i10, int i11) {
            C3862t.g(bArr, "<this>");
            int iE = C0979b.e(bArr, i11);
            C0979b.b(bArr.length, i10, iE);
            return new h(C3831l.q(bArr, i10, iE + i10));
        }

        private Companion() {
        }
    }

    public h(byte[] data) {
        C3862t.g(data, "data");
        this.data = data;
    }

    public static final h C(byte... bArr) {
        return INSTANCE.e(bArr);
    }

    public static final h s(String str) {
        return INSTANCE.d(str);
    }

    public byte A(int pos) {
        return getData()[pos];
    }

    public final h B() {
        return p("MD5");
    }

    public boolean D(int offset, h other, int otherOffset, int byteCount) {
        C3862t.g(other, "other");
        return other.E(otherOffset, getData(), offset, byteCount);
    }

    public boolean E(int offset, byte[] other, int otherOffset, int byteCount) {
        C3862t.g(other, "other");
        return offset >= 0 && offset <= getData().length - byteCount && otherOffset >= 0 && otherOffset <= other.length - byteCount && C0979b.a(getData(), offset, other, otherOffset, byteCount);
    }

    public final void F(int i10) {
        this.hashCode = i10;
    }

    public final void G(String str) {
        this.utf8 = str;
    }

    public final h H() {
        return p("SHA-1");
    }

    public final h I() {
        return p("SHA-256");
    }

    public final int J() {
        return w();
    }

    public final boolean K(h prefix) {
        C3862t.g(prefix, "prefix");
        return D(0, prefix, 0, prefix.J());
    }

    public h L() {
        for (int i10 = 0; i10 < getData().length; i10++) {
            byte b10 = getData()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] data = getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                C3862t.f(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new h(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] M() {
        byte[] data = getData();
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        C3862t.f(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public String N() {
        String utf8 = getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        String strB = E.b(z());
        G(strB);
        return strB;
    }

    public void O(C0982e buffer, int offset, int byteCount) {
        C3862t.g(buffer, "buffer");
        Dc.b.d(this, buffer, offset, byteCount);
    }

    public String c() {
        return C0978a.c(getData(), null, 1, null);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof h) {
            h hVar = (h) other;
            if (hVar.J() == getData().length && hVar.E(0, getData(), 0, getData().length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int iHashCode = Arrays.hashCode(getData());
        F(iHashCode);
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(Cc.h r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.C3862t.g(r10, r0)
            int r0 = r9.J()
            int r1 = r10.J()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.t(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.t(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Cc.h.compareTo(Cc.h):int");
    }

    public void n(int offset, byte[] target, int targetOffset, int byteCount) {
        C3862t.g(target, "target");
        C3831l.h(getData(), target, targetOffset, offset, byteCount + offset);
    }

    public h p(String algorithm) throws NoSuchAlgorithmException {
        C3862t.g(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, J());
        byte[] bArrDigest = messageDigest.digest();
        C3862t.d(bArrDigest);
        return new h(bArrDigest);
    }

    public final byte t(int index) {
        return A(index);
    }

    public String toString() {
        String str;
        if (getData().length == 0) {
            str = "[size=0]";
        } else {
            int iC = Dc.b.c(getData(), 64);
            if (iC != -1) {
                String strN = N();
                String strSubstring = strN.substring(0, iC);
                C3862t.f(strSubstring, "substring(...)");
                String strC = Ub.n.C(Ub.n.C(Ub.n.C(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (iC >= strN.length()) {
                    return "[text=" + strC + ']';
                }
                return "[size=" + getData().length + " text=" + strC + "…]";
            }
            if (getData().length > 64) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(getData().length);
                sb2.append(" hex=");
                int iD = C0979b.d(this, 64);
                if (iD <= getData().length) {
                    if (iD < 0) {
                        throw new IllegalArgumentException("endIndex < beginIndex");
                    }
                    sb2.append((iD == getData().length ? this : new h(C3831l.q(getData(), 0, iD))).y());
                    sb2.append("…]");
                    return sb2.toString();
                }
                throw new IllegalArgumentException(("endIndex > length(" + getData().length + ')').toString());
            }
            str = "[hex=" + y() + ']';
        }
        return str;
    }

    /* renamed from: u, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* renamed from: v, reason: from getter */
    public final int getHashCode() {
        return this.hashCode;
    }

    public int w() {
        return getData().length;
    }

    /* renamed from: x, reason: from getter */
    public final String getUtf8() {
        return this.utf8;
    }

    public String y() {
        char[] cArr = new char[getData().length * 2];
        int i10 = 0;
        for (byte b10 : getData()) {
            int i11 = i10 + 1;
            cArr[i10] = Dc.b.f()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = Dc.b.f()[b10 & 15];
        }
        return Ub.n.n(cArr);
    }

    public byte[] z() {
        return getData();
    }
}
