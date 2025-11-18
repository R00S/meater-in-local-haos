package com.google.gson.stream;

import cm.aptoide.p092pt.account.AdultContentAnalytics;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* compiled from: JsonWriter.java */
/* renamed from: com.google.gson.stream.c */
/* loaded from: classes2.dex */
public class C8587c implements Closeable, Flushable {

    /* renamed from: f */
    private static final String[] f32484f = new String[128];

    /* renamed from: g */
    private static final String[] f32485g;

    /* renamed from: h */
    private final Writer f32486h;

    /* renamed from: i */
    private int[] f32487i = new int[32];

    /* renamed from: j */
    private int f32488j = 0;

    /* renamed from: k */
    private String f32489k;

    /* renamed from: l */
    private String f32490l;

    /* renamed from: m */
    private boolean f32491m;

    /* renamed from: n */
    private boolean f32492n;

    /* renamed from: o */
    private String f32493o;

    /* renamed from: p */
    private boolean f32494p;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f32484f[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f32484f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f32485g = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C8587c(Writer writer) {
        m27017B(6);
        this.f32490l = ":";
        this.f32494p = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f32486h = writer;
    }

    /* renamed from: A */
    private int m27016A() {
        int i2 = this.f32488j;
        if (i2 != 0) {
            return this.f32487i[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: B */
    private void m27017B(int i2) {
        int i3 = this.f32488j;
        int[] iArr = this.f32487i;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[i3 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f32487i = iArr2;
        }
        int[] iArr3 = this.f32487i;
        int i4 = this.f32488j;
        this.f32488j = i4 + 1;
        iArr3[i4] = i2;
    }

    /* renamed from: D */
    private void m27018D(int i2) {
        this.f32487i[this.f32488j - 1] = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m27019N(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f32492n
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.gson.stream.C8587c.f32485g
            goto L9
        L7:
            java.lang.String[] r0 = com.google.gson.stream.C8587c.f32484f
        L9:
            java.io.Writer r1 = r8.f32486h
            java.lang.String r2 = "\""
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
            java.io.Writer r6 = r8.f32486h
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f32486h
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f32486h
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f32486h
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C8587c.m27019N(java.lang.String):void");
    }

    /* renamed from: a */
    private void m27020a() throws IOException {
        int iM27016A = m27016A();
        if (iM27016A == 5) {
            this.f32486h.write(44);
        } else if (iM27016A != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m27024x();
        m27018D(4);
    }

    /* renamed from: a0 */
    private void m27021a0() throws IOException {
        if (this.f32493o != null) {
            m27020a();
            m27019N(this.f32493o);
            this.f32493o = null;
        }
    }

    /* renamed from: b */
    private void m27022b() throws IOException {
        int iM27016A = m27016A();
        if (iM27016A == 1) {
            m27018D(2);
            m27024x();
            return;
        }
        if (iM27016A == 2) {
            this.f32486h.append(',');
            m27024x();
        } else {
            if (iM27016A == 4) {
                this.f32486h.append((CharSequence) this.f32490l);
                m27018D(5);
                return;
            }
            if (iM27016A != 6) {
                if (iM27016A != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f32491m) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m27018D(7);
        }
    }

    /* renamed from: e */
    private C8587c m27023e(int i2, int i3, String str) throws IOException {
        int iM27016A = m27016A();
        if (iM27016A != i3 && iM27016A != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f32493o != null) {
            throw new IllegalStateException("Dangling name: " + this.f32493o);
        }
        this.f32488j--;
        if (iM27016A == i3) {
            m27024x();
        }
        this.f32486h.write(str);
        return this;
    }

    /* renamed from: x */
    private void m27024x() throws IOException {
        if (this.f32489k == null) {
            return;
        }
        this.f32486h.write("\n");
        int i2 = this.f32488j;
        for (int i3 = 1; i3 < i2; i3++) {
            this.f32486h.write(this.f32489k);
        }
    }

    /* renamed from: z */
    private C8587c m27025z(int i2, String str) throws IOException {
        m27022b();
        m27017B(i2);
        this.f32486h.write(str);
        return this;
    }

    /* renamed from: H */
    public final void m27026H(boolean z) {
        this.f32492n = z;
    }

    /* renamed from: I */
    public final void m27027I(String str) {
        if (str.length() == 0) {
            this.f32489k = null;
            this.f32490l = ":";
        } else {
            this.f32489k = str;
            this.f32490l = ": ";
        }
    }

    /* renamed from: J */
    public final void m27028J(boolean z) {
        this.f32491m = z;
    }

    /* renamed from: K */
    public final void m27029K(boolean z) {
        this.f32494p = z;
    }

    /* renamed from: Q */
    public C8587c mo27030Q(long j2) throws IOException {
        m27021a0();
        m27022b();
        this.f32486h.write(Long.toString(j2));
        return this;
    }

    /* renamed from: T */
    public C8587c mo27031T(Boolean bool) throws IOException {
        if (bool == null) {
            return mo27043y();
        }
        m27021a0();
        m27022b();
        this.f32486h.write(bool.booleanValue() ? "true" : AdultContentAnalytics.UNLOCK);
        return this;
    }

    /* renamed from: W */
    public C8587c mo27032W(Number number) throws IOException {
        if (number == null) {
            return mo27043y();
        }
        m27021a0();
        String string = number.toString();
        if (this.f32491m || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            m27022b();
            this.f32486h.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    /* renamed from: Y */
    public C8587c mo27033Y(String str) throws IOException {
        if (str == null) {
            return mo27043y();
        }
        m27021a0();
        m27022b();
        m27019N(str);
        return this;
    }

    /* renamed from: Z */
    public C8587c mo27034Z(boolean z) throws IOException {
        m27021a0();
        m27022b();
        this.f32486h.write(z ? "true" : AdultContentAnalytics.UNLOCK);
        return this;
    }

    /* renamed from: c */
    public C8587c mo27035c() throws IOException {
        m27021a0();
        return m27025z(1, "[");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f32486h.close();
        int i2 = this.f32488j;
        if (i2 > 1 || (i2 == 1 && this.f32487i[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f32488j = 0;
    }

    /* renamed from: d */
    public C8587c mo27036d() throws IOException {
        m27021a0();
        return m27025z(3, "{");
    }

    /* renamed from: f */
    public C8587c mo27037f() throws IOException {
        return m27023e(1, 2, "]");
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f32488j == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f32486h.flush();
    }

    /* renamed from: j */
    public C8587c mo27038j() throws IOException {
        return m27023e(3, 5, "}");
    }

    /* renamed from: k */
    public final boolean m27039k() {
        return this.f32494p;
    }

    /* renamed from: l */
    public final boolean m27040l() {
        return this.f32492n;
    }

    /* renamed from: m */
    public boolean m27041m() {
        return this.f32491m;
    }

    /* renamed from: p */
    public C8587c mo27042p(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f32493o != null) {
            throw new IllegalStateException();
        }
        if (this.f32488j == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f32493o = str;
        return this;
    }

    /* renamed from: y */
    public C8587c mo27043y() throws IOException {
        if (this.f32493o != null) {
            if (!this.f32494p) {
                this.f32493o = null;
                return this;
            }
            m27021a0();
        }
        m27022b();
        this.f32486h.write("null");
        return this;
    }
}
