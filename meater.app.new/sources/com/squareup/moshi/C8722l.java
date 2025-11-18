package com.squareup.moshi;

import cm.aptoide.p092pt.account.AdultContentAnalytics;
import java.io.IOException;
import p353j.InterfaceC9705g;

/* compiled from: JsonUtf8Writer.java */
/* renamed from: com.squareup.moshi.l */
/* loaded from: classes2.dex */
final class C8722l extends AbstractC8725o {

    /* renamed from: o */
    private static final String[] f33132o = new String[128];

    /* renamed from: p */
    private final InterfaceC9705g f33133p;

    /* renamed from: q */
    private String f33134q = ":";

    /* renamed from: r */
    private String f33135r;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f33132o[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f33132o;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    C8722l(InterfaceC9705g interfaceC9705g) {
        if (interfaceC9705g == null) {
            throw new NullPointerException("sink == null");
        }
        this.f33133p = interfaceC9705g;
        m27781z(6);
    }

    /* renamed from: T */
    private void m27743T() throws IOException {
        int iM27779x = m27779x();
        if (iM27779x == 5) {
            this.f33133p.writeByte(44);
        } else if (iM27779x != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m27746Z();
        m27771A(4);
    }

    /* renamed from: W */
    private void m27744W() throws IOException {
        int iM27779x = m27779x();
        int i2 = 7;
        if (iM27779x == 1) {
            m27746Z();
            i2 = 2;
        } else if (iM27779x == 2) {
            this.f33133p.writeByte(44);
            m27746Z();
            i2 = 2;
        } else if (iM27779x == 4) {
            i2 = 5;
            this.f33133p.mo32055r0(this.f33134q);
        } else {
            if (iM27779x == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            if (iM27779x != 6) {
                if (iM27779x != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f33148k) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
        }
        m27771A(i2);
    }

    /* renamed from: Y */
    private AbstractC8725o m27745Y(int i2, int i3, char c2) throws IOException {
        int iM27779x = m27779x();
        if (iM27779x != i3 && iM27779x != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f33135r != null) {
            throw new IllegalStateException("Dangling name: " + this.f33135r);
        }
        int i4 = this.f33143f;
        int i5 = this.f33151n;
        if (i4 == (i5 ^ (-1))) {
            this.f33151n = i5 ^ (-1);
            return this;
        }
        int i6 = i4 - 1;
        this.f33143f = i6;
        this.f33145h[i6] = null;
        int[] iArr = this.f33146i;
        int i7 = i6 - 1;
        iArr[i7] = iArr[i7] + 1;
        if (iM27779x == i3) {
            m27746Z();
        }
        this.f33133p.writeByte(c2);
        return this;
    }

    /* renamed from: Z */
    private void m27746Z() throws IOException {
        if (this.f33147j == null) {
            return;
        }
        this.f33133p.writeByte(10);
        int i2 = this.f33143f;
        for (int i3 = 1; i3 < i2; i3++) {
            this.f33133p.mo32055r0(this.f33147j);
        }
    }

    /* renamed from: a0 */
    private AbstractC8725o m27747a0(int i2, int i3, char c2) throws IOException {
        int i4 = this.f33143f;
        int i5 = this.f33151n;
        if (i4 == i5) {
            int[] iArr = this.f33144g;
            if (iArr[i4 - 1] == i2 || iArr[i4 - 1] == i3) {
                this.f33151n = i5 ^ (-1);
                return this;
            }
        }
        m27744W();
        m27774c();
        m27781z(i2);
        this.f33146i[this.f33143f - 1] = 0;
        this.f33133p.writeByte(c2);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void m27748e0(p353j.InterfaceC9705g r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = com.squareup.moshi.C8722l.f33132o
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = 0
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.mo31997A0(r8, r4, r3)
        L2e:
            r7.mo32055r0(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.mo31997A0(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C8722l.m27748e0(j.g, java.lang.String):void");
    }

    /* renamed from: f0 */
    private void m27749f0() throws IOException {
        if (this.f33135r != null) {
            m27743T();
            m27748e0(this.f33133p, this.f33135r);
            this.f33135r = null;
        }
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: B */
    public void mo27750B(String str) {
        super.mo27750B(str);
        this.f33134q = !str.isEmpty() ? ": " : ":";
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: I */
    public AbstractC8725o mo27751I(double d2) throws IOException {
        if (!this.f33148k && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
        }
        if (this.f33150m) {
            this.f33150m = false;
            return mo27760l(Double.toString(d2));
        }
        m27749f0();
        m27744W();
        this.f33133p.mo32055r0(Double.toString(d2));
        int[] iArr = this.f33146i;
        int i2 = this.f33143f - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: J */
    public AbstractC8725o mo27752J(long j2) throws IOException {
        if (this.f33150m) {
            this.f33150m = false;
            return mo27760l(Long.toString(j2));
        }
        m27749f0();
        m27744W();
        this.f33133p.mo32055r0(Long.toString(j2));
        int[] iArr = this.f33146i;
        int i2 = this.f33143f - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: K */
    public AbstractC8725o mo27753K(Number number) throws IOException {
        if (number == null) {
            return mo27761m();
        }
        String string = number.toString();
        if (!this.f33148k && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f33150m) {
            this.f33150m = false;
            return mo27760l(string);
        }
        m27749f0();
        m27744W();
        this.f33133p.mo32055r0(string);
        int[] iArr = this.f33146i;
        int i2 = this.f33143f - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: N */
    public AbstractC8725o mo27754N(String str) throws IOException {
        if (str == null) {
            return mo27761m();
        }
        if (this.f33150m) {
            this.f33150m = false;
            return mo27760l(str);
        }
        m27749f0();
        m27744W();
        m27748e0(this.f33133p, str);
        int[] iArr = this.f33146i;
        int i2 = this.f33143f - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: Q */
    public AbstractC8725o mo27755Q(boolean z) throws IOException {
        if (this.f33150m) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + m27776g());
        }
        m27749f0();
        m27744W();
        this.f33133p.mo32055r0(z ? "true" : AdultContentAnalytics.UNLOCK);
        int[] iArr = this.f33146i;
        int i2 = this.f33143f - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: a */
    public AbstractC8725o mo27756a() throws IOException {
        if (!this.f33150m) {
            m27749f0();
            return m27747a0(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + m27776g());
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: b */
    public AbstractC8725o mo27757b() throws IOException {
        if (!this.f33150m) {
            m27749f0();
            return m27747a0(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + m27776g());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f33133p.close();
        int i2 = this.f33143f;
        if (i2 > 1 || (i2 == 1 && this.f33144g[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f33143f = 0;
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: d */
    public AbstractC8725o mo27758d() throws IOException {
        return m27745Y(1, 2, ']');
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: e */
    public AbstractC8725o mo27759e() throws IOException {
        this.f33150m = false;
        return m27745Y(3, 5, '}');
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f33143f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f33133p.flush();
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: l */
    public AbstractC8725o mo27760l(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f33143f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iM27779x = m27779x();
        if ((iM27779x != 3 && iM27779x != 5) || this.f33135r != null || this.f33150m) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f33135r = str;
        this.f33145h[this.f33143f - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: m */
    public AbstractC8725o mo27761m() throws IOException {
        if (this.f33150m) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + m27776g());
        }
        if (this.f33135r != null) {
            if (!this.f33149l) {
                this.f33135r = null;
                return this;
            }
            m27749f0();
        }
        m27744W();
        this.f33133p.mo32055r0("null");
        int[] iArr = this.f33146i;
        int i2 = this.f33143f - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }
}
