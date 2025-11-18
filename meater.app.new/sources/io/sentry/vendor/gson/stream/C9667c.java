package io.sentry.vendor.gson.stream;

import cm.aptoide.p092pt.account.AdultContentAnalytics;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: JsonWriter.java */
@ApiStatus.Internal
/* renamed from: io.sentry.vendor.gson.stream.c */
/* loaded from: classes2.dex */
public class C9667c implements Closeable, Flushable {

    /* renamed from: f */
    private static final String[] f36979f = new String[128];

    /* renamed from: g */
    private static final String[] f36980g;

    /* renamed from: h */
    private final Writer f36981h;

    /* renamed from: i */
    private int[] f36982i = new int[32];

    /* renamed from: j */
    private int f36983j = 0;

    /* renamed from: k */
    private String f36984k;

    /* renamed from: l */
    private String f36985l;

    /* renamed from: m */
    private boolean f36986m;

    /* renamed from: n */
    private boolean f36987n;

    /* renamed from: o */
    private String f36988o;

    /* renamed from: p */
    private boolean f36989p;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f36979f[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f36979f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f36980g = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C9667c(Writer writer) {
        m31903y(6);
        this.f36985l = ":";
        this.f36989p = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f36981h = writer;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m31895B(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f36987n
            if (r0 == 0) goto L7
            java.lang.String[] r0 = io.sentry.vendor.gson.stream.C9667c.f36980g
            goto L9
        L7:
            java.lang.String[] r0 = io.sentry.vendor.gson.stream.C9667c.f36979f
        L9:
            java.io.Writer r1 = r8.f36981h
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
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
            java.io.Writer r6 = r8.f36981h
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f36981h
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f36981h
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f36981h
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C9667c.m31895B(java.lang.String):void");
    }

    /* renamed from: N */
    private void m31896N() throws IOException {
        if (this.f36988o != null) {
            m31897a();
            m31895B(this.f36988o);
            this.f36988o = null;
        }
    }

    /* renamed from: a */
    private void m31897a() throws IOException {
        int iM31902x = m31902x();
        if (iM31902x == 5) {
            this.f36981h.write(44);
        } else if (iM31902x != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m31900l();
        m31904z(4);
    }

    /* renamed from: b */
    private void m31898b() throws IOException {
        int iM31902x = m31902x();
        if (iM31902x == 1) {
            m31904z(2);
            m31900l();
            return;
        }
        if (iM31902x == 2) {
            this.f36981h.append(',');
            m31900l();
        } else {
            if (iM31902x == 4) {
                this.f36981h.append((CharSequence) this.f36985l);
                m31904z(5);
                return;
            }
            if (iM31902x != 6) {
                if (iM31902x != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f36986m) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m31904z(7);
        }
    }

    /* renamed from: e */
    private C9667c m31899e(int i2, int i3, char c2) throws IOException {
        int iM31902x = m31902x();
        if (iM31902x != i3 && iM31902x != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f36988o != null) {
            throw new IllegalStateException("Dangling name: " + this.f36988o);
        }
        this.f36983j--;
        if (iM31902x == i3) {
            m31900l();
        }
        this.f36981h.write(c2);
        return this;
    }

    /* renamed from: l */
    private void m31900l() throws IOException {
        if (this.f36984k == null) {
            return;
        }
        this.f36981h.write(10);
        int i2 = this.f36983j;
        for (int i3 = 1; i3 < i2; i3++) {
            this.f36981h.write(this.f36984k);
        }
    }

    /* renamed from: p */
    private C9667c m31901p(int i2, char c2) throws IOException {
        m31898b();
        m31903y(i2);
        this.f36981h.write(c2);
        return this;
    }

    /* renamed from: x */
    private int m31902x() {
        int i2 = this.f36983j;
        if (i2 != 0) {
            return this.f36982i[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: y */
    private void m31903y(int i2) {
        int i3 = this.f36983j;
        int[] iArr = this.f36982i;
        if (i3 == iArr.length) {
            this.f36982i = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f36982i;
        int i4 = this.f36983j;
        this.f36983j = i4 + 1;
        iArr2[i4] = i2;
    }

    /* renamed from: z */
    private void m31904z(int i2) {
        this.f36982i[this.f36983j - 1] = i2;
    }

    /* renamed from: A */
    public final void m31905A(String str) {
        if (str.length() == 0) {
            this.f36984k = null;
            this.f36985l = ":";
        } else {
            this.f36984k = str;
            this.f36985l = ": ";
        }
    }

    /* renamed from: D */
    public C9667c m31906D(long j2) throws IOException {
        m31896N();
        m31898b();
        this.f36981h.write(Long.toString(j2));
        return this;
    }

    /* renamed from: H */
    public C9667c m31907H(Boolean bool) throws IOException {
        if (bool == null) {
            return m31916m();
        }
        m31896N();
        m31898b();
        this.f36981h.write(bool.booleanValue() ? "true" : AdultContentAnalytics.UNLOCK);
        return this;
    }

    /* renamed from: I */
    public C9667c m31908I(Number number) throws IOException {
        if (number == null) {
            return m31916m();
        }
        m31896N();
        String string = number.toString();
        if (this.f36986m || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            m31898b();
            this.f36981h.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    /* renamed from: J */
    public C9667c m31909J(String str) throws IOException {
        if (str == null) {
            return m31916m();
        }
        m31896N();
        m31898b();
        m31895B(str);
        return this;
    }

    /* renamed from: K */
    public C9667c m31910K(boolean z) throws IOException {
        m31896N();
        m31898b();
        this.f36981h.write(z ? "true" : AdultContentAnalytics.UNLOCK);
        return this;
    }

    /* renamed from: c */
    public C9667c m31911c() throws IOException {
        m31896N();
        return m31901p(1, '[');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f36981h.close();
        int i2 = this.f36983j;
        if (i2 > 1 || (i2 == 1 && this.f36982i[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f36983j = 0;
    }

    /* renamed from: d */
    public C9667c m31912d() throws IOException {
        m31896N();
        return m31901p(3, '{');
    }

    /* renamed from: f */
    public C9667c m31913f() throws IOException {
        return m31899e(1, 2, ']');
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f36983j == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f36981h.flush();
    }

    /* renamed from: j */
    public C9667c m31914j() throws IOException {
        return m31899e(3, 5, '}');
    }

    /* renamed from: k */
    public C9667c m31915k(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f36988o != null) {
            throw new IllegalStateException();
        }
        if (this.f36983j == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f36988o = str;
        return this;
    }

    /* renamed from: m */
    public C9667c m31916m() throws IOException {
        if (this.f36988o != null) {
            if (!this.f36989p) {
                this.f36988o = null;
                return this;
            }
            m31896N();
        }
        m31898b();
        this.f36981h.write("null");
        return this;
    }
}
