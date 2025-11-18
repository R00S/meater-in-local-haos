package Q9;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: JsonWriter.java */
/* loaded from: classes2.dex */
public class c implements Closeable, Flushable {

    /* renamed from: K, reason: collision with root package name */
    private static final Pattern f14560K = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: L, reason: collision with root package name */
    private static final String[] f14561L = new String[128];

    /* renamed from: M, reason: collision with root package name */
    private static final String[] f14562M;

    /* renamed from: B, reason: collision with root package name */
    private final Writer f14563B;

    /* renamed from: C, reason: collision with root package name */
    private int[] f14564C = new int[32];

    /* renamed from: D, reason: collision with root package name */
    private int f14565D = 0;

    /* renamed from: E, reason: collision with root package name */
    private String f14566E;

    /* renamed from: F, reason: collision with root package name */
    private String f14567F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f14568G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f14569H;

    /* renamed from: I, reason: collision with root package name */
    private String f14570I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f14571J;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f14561L[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f14561L;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f14562M = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        t(6);
        this.f14567F = ":";
        this.f14571J = true;
        Objects.requireNonNull(writer, "out == null");
        this.f14563B = writer;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void K(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f14569H
            if (r0 == 0) goto L7
            java.lang.String[] r0 = Q9.c.f14562M
            goto L9
        L7:
            java.lang.String[] r0 = Q9.c.f14561L
        L9:
            java.io.Writer r1 = r8.f14563B
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f14563B
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f14563B
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f14563B
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f14563B
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q9.c.K(java.lang.String):void");
    }

    private void a() throws IOException {
        int iS = s();
        if (iS == 5) {
            this.f14563B.write(44);
        } else if (iS != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        o();
        u(4);
    }

    private void a0() throws IOException {
        if (this.f14570I != null) {
            a();
            K(this.f14570I);
            this.f14570I = null;
        }
    }

    private void b() throws IOException {
        int iS = s();
        if (iS == 1) {
            u(2);
            o();
            return;
        }
        if (iS == 2) {
            this.f14563B.append(',');
            o();
        } else {
            if (iS == 4) {
                this.f14563B.append((CharSequence) this.f14567F);
                u(5);
                return;
            }
            if (iS != 6) {
                if (iS != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f14568G) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            u(7);
        }
    }

    private c e(int i10, int i11, char c10) throws IOException {
        int iS = s();
        if (iS != i11 && iS != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f14570I != null) {
            throw new IllegalStateException("Dangling name: " + this.f14570I);
        }
        this.f14565D--;
        if (iS == i11) {
            o();
        }
        this.f14563B.write(c10);
        return this;
    }

    private static boolean m(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void o() throws IOException {
        if (this.f14566E == null) {
            return;
        }
        this.f14563B.write(10);
        int i10 = this.f14565D;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f14563B.write(this.f14566E);
        }
    }

    private c q(int i10, char c10) throws IOException {
        b();
        t(i10);
        this.f14563B.write(c10);
        return this;
    }

    private int s() {
        int i10 = this.f14565D;
        if (i10 != 0) {
            return this.f14564C[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void t(int i10) {
        int i11 = this.f14565D;
        int[] iArr = this.f14564C;
        if (i11 == iArr.length) {
            this.f14564C = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f14564C;
        int i12 = this.f14565D;
        this.f14565D = i12 + 1;
        iArr2[i12] = i10;
    }

    private void u(int i10) {
        this.f14564C[this.f14565D - 1] = i10;
    }

    public final void C(boolean z10) {
        this.f14571J = z10;
    }

    public c L(double d10) throws IOException {
        a0();
        if (this.f14568G || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            b();
            this.f14563B.append((CharSequence) Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    public c N(long j10) throws IOException {
        a0();
        b();
        this.f14563B.write(Long.toString(j10));
        return this;
    }

    public c P(Boolean bool) throws IOException {
        if (bool == null) {
            return p();
        }
        a0();
        b();
        this.f14563B.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c Q(Number number) throws IOException {
        if (number == null) {
            return p();
        }
        a0();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!m(cls) && !f14560K.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f14568G) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
        }
        b();
        this.f14563B.append((CharSequence) string);
        return this;
    }

    public c W(String str) throws IOException {
        if (str == null) {
            return p();
        }
        a0();
        b();
        K(str);
        return this;
    }

    public c X(boolean z10) throws IOException {
        a0();
        b();
        this.f14563B.write(z10 ? "true" : "false");
        return this;
    }

    public c c() throws IOException {
        a0();
        return q(1, '[');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14563B.close();
        int i10 = this.f14565D;
        if (i10 > 1 || (i10 == 1 && this.f14564C[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f14565D = 0;
    }

    public c d() throws IOException {
        a0();
        return q(3, '{');
    }

    public c f() {
        return e(1, 2, ']');
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f14565D == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f14563B.flush();
    }

    public c g() {
        return e(3, 5, '}');
    }

    public final boolean j() {
        return this.f14571J;
    }

    public final boolean k() {
        return this.f14569H;
    }

    public boolean l() {
        return this.f14568G;
    }

    public c n(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f14570I != null) {
            throw new IllegalStateException();
        }
        if (this.f14565D == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f14570I = str;
        return this;
    }

    public c p() throws IOException {
        if (this.f14570I != null) {
            if (!this.f14571J) {
                this.f14570I = null;
                return this;
            }
            a0();
        }
        b();
        this.f14563B.write("null");
        return this;
    }

    public final void x(boolean z10) {
        this.f14569H = z10;
    }

    public final void y(String str) {
        if (str.length() == 0) {
            this.f14566E = null;
            this.f14567F = ":";
        } else {
            this.f14566E = str;
            this.f14567F = ": ";
        }
    }

    public final void z(boolean z10) {
        this.f14568G = z10;
    }
}
