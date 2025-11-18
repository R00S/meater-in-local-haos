package com.google.gson.stream;

import cm.aptoide.p092pt.account.AdultContentAnalytics;
import com.google.gson.p215t.AbstractC8593f;
import com.google.gson.p215t.p216n.C8605e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* compiled from: JsonReader.java */
/* renamed from: com.google.gson.stream.a */
/* loaded from: classes2.dex */
public class C8585a implements Closeable {

    /* renamed from: f */
    private static final char[] f32457f = ")]}'\n".toCharArray();

    /* renamed from: g */
    private final Reader f32458g;

    /* renamed from: h */
    private boolean f32459h = false;

    /* renamed from: i */
    private final char[] f32460i = new char[1024];

    /* renamed from: j */
    private int f32461j = 0;

    /* renamed from: k */
    private int f32462k = 0;

    /* renamed from: l */
    private int f32463l = 0;

    /* renamed from: m */
    private int f32464m = 0;

    /* renamed from: n */
    int f32465n = 0;

    /* renamed from: o */
    private long f32466o;

    /* renamed from: p */
    private int f32467p;

    /* renamed from: q */
    private String f32468q;

    /* renamed from: r */
    private int[] f32469r;

    /* renamed from: s */
    private int f32470s;

    /* renamed from: t */
    private String[] f32471t;

    /* renamed from: u */
    private int[] f32472u;

    /* compiled from: JsonReader.java */
    /* renamed from: com.google.gson.stream.a$a */
    static class a extends AbstractC8593f {
        a() {
        }

        @Override // com.google.gson.p215t.AbstractC8593f
        /* renamed from: a */
        public void mo27015a(C8585a c8585a) throws IOException {
            if (c8585a instanceof C8605e) {
                ((C8605e) c8585a).m27127y0();
                return;
            }
            int iM27005e = c8585a.f32465n;
            if (iM27005e == 0) {
                iM27005e = c8585a.m27005e();
            }
            if (iM27005e == 13) {
                c8585a.f32465n = 9;
                return;
            }
            if (iM27005e == 12) {
                c8585a.f32465n = 8;
                return;
            }
            if (iM27005e == 14) {
                c8585a.f32465n = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + c8585a.mo27001Q() + c8585a.m27012x());
        }
    }

    static {
        AbstractC8593f.f32541a = new a();
    }

    public C8585a(Reader reader) {
        int[] iArr = new int[32];
        this.f32469r = iArr;
        this.f32470s = 0;
        this.f32470s = 0 + 1;
        iArr[0] = 6;
        this.f32471t = new String[32];
        this.f32472u = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f32458g = reader;
    }

    /* renamed from: H */
    private int m26980H(boolean z) throws IOException {
        char[] cArr = this.f32460i;
        int i2 = this.f32461j;
        int i3 = this.f32462k;
        while (true) {
            if (i2 == i3) {
                this.f32461j = i2;
                if (!m26992k(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m27012x());
                }
                i2 = this.f32461j;
                i3 = this.f32462k;
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == '\n') {
                this.f32463l++;
                this.f32464m = i4;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f32461j = i4;
                    if (i4 == i3) {
                        this.f32461j = i4 - 1;
                        boolean zM26992k = m26992k(2);
                        this.f32461j++;
                        if (!zM26992k) {
                            return c2;
                        }
                    }
                    m26987c();
                    int i5 = this.f32461j;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.f32461j = i5 + 1;
                        if (!m26990f0("*/")) {
                            throw m26995p0("Unterminated comment");
                        }
                        i2 = this.f32461j + 2;
                        i3 = this.f32462k;
                    } else {
                        if (c3 != '/') {
                            return c2;
                        }
                        this.f32461j = i5 + 1;
                        m26991i0();
                        i2 = this.f32461j;
                        i3 = this.f32462k;
                    }
                } else {
                    if (c2 != '#') {
                        this.f32461j = i4;
                        return c2;
                    }
                    this.f32461j = i4;
                    m26987c();
                    m26991i0();
                    i2 = this.f32461j;
                    i3 = this.f32462k;
                }
            }
            i2 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r9.f32461j = r2;
     */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m26981J(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f32460i
            r1 = 0
        L3:
            int r2 = r9.f32461j
            int r3 = r9.f32462k
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5c
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.f32461j = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4f
            r9.f32461j = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L40
            int r1 = r7 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L40:
            r1.append(r0, r3, r7)
            char r2 = r9.m26986Z()
            r1.append(r2)
            int r2 = r9.f32461j
            int r3 = r9.f32462k
            goto L7
        L4f:
            r5 = 10
            if (r2 != r5) goto L5a
            int r2 = r9.f32463l
            int r2 = r2 + r6
            r9.f32463l = r2
            r9.f32464m = r7
        L5a:
            r2 = r7
            goto L9
        L5c:
            if (r1 != 0) goto L6c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f32461j = r2
            boolean r2 = r9.m26992k(r6)
            if (r2 == 0) goto L7a
            goto L3
        L7a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.m26995p0(r10)
            goto L82
        L81:
            throw r10
        L82:
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C8585a.m26981J(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        m26987c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m26982N() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f32461j
            int r4 = r3 + r2
            int r5 = r6.f32462k
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f32460i
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.m26987c()
            goto L5c
        L4e:
            char[] r3 = r6.f32460i
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.m26992k(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f32460i
            int r4 = r6.f32461j
            r1.append(r3, r4, r2)
            int r3 = r6.f32461j
            int r3 = r3 + r2
            r6.f32461j = r3
            r2 = 1
            boolean r2 = r6.m26992k(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f32460i
            int r3 = r6.f32461j
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f32460i
            int r3 = r6.f32461j
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f32461j
            int r2 = r2 + r0
            r6.f32461j = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C8585a.m26982N():java.lang.String");
    }

    /* renamed from: T */
    private int m26983T() throws IOException {
        int i2;
        String str;
        String str2;
        char c2 = this.f32460i[this.f32461j];
        if (c2 == 't' || c2 == 'T') {
            i2 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c2 == 'f' || c2 == 'F') {
            i2 = 6;
            str = AdultContentAnalytics.UNLOCK;
            str2 = "FALSE";
        } else {
            if (c2 != 'n' && c2 != 'N') {
                return 0;
            }
            i2 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        for (int i3 = 1; i3 < length; i3++) {
            if (this.f32461j + i3 >= this.f32462k && !m26992k(i3 + 1)) {
                return 0;
            }
            char c3 = this.f32460i[this.f32461j + i3];
            if (c3 != str.charAt(i3) && c3 != str2.charAt(i3)) {
                return 0;
            }
        }
        if ((this.f32461j + length < this.f32462k || m26992k(length + 1)) && m26994p(this.f32460i[this.f32461j + length])) {
            return 0;
        }
        this.f32461j += length;
        this.f32465n = i2;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        if (m26994p(r14) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0099, code lost:
    
        if (r9 != 2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
    
        if (r10 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a1, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
    
        if (r13 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a9, code lost:
    
        if (r11 != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
    
        if (r13 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ad, code lost:
    
        if (r13 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b1, code lost:
    
        r18.f32466o = r11;
        r18.f32461j += r8;
        r18.f32465n = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bc, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bd, code lost:
    
        if (r9 == 2) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c0, code lost:
    
        if (r9 == 4) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c3, code lost:
    
        if (r9 != 7) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c6, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c8, code lost:
    
        r18.f32467p = r8;
        r18.f32465n = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ce, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00cf, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f2  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m26984W() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C8585a.m26984W():int");
    }

    /* renamed from: Y */
    private void m26985Y(int i2) {
        int i3 = this.f32470s;
        int[] iArr = this.f32469r;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[i3 * 2];
            int[] iArr3 = new int[i3 * 2];
            String[] strArr = new String[i3 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            System.arraycopy(this.f32472u, 0, iArr3, 0, this.f32470s);
            System.arraycopy(this.f32471t, 0, strArr, 0, this.f32470s);
            this.f32469r = iArr2;
            this.f32472u = iArr3;
            this.f32471t = strArr;
        }
        int[] iArr4 = this.f32469r;
        int i4 = this.f32470s;
        this.f32470s = i4 + 1;
        iArr4[i4] = i2;
    }

    /* renamed from: Z */
    private char m26986Z() throws IOException {
        int i2;
        int i3;
        if (this.f32461j == this.f32462k && !m26992k(1)) {
            throw m26995p0("Unterminated escape sequence");
        }
        char[] cArr = this.f32460i;
        int i4 = this.f32461j;
        int i5 = i4 + 1;
        this.f32461j = i5;
        char c2 = cArr[i4];
        if (c2 == '\n') {
            this.f32463l++;
            this.f32464m = i5;
        } else if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
            if (c2 == 'b') {
                return '\b';
            }
            if (c2 == 'f') {
                return '\f';
            }
            if (c2 == 'n') {
                return '\n';
            }
            if (c2 == 'r') {
                return '\r';
            }
            if (c2 == 't') {
                return '\t';
            }
            if (c2 != 'u') {
                throw m26995p0("Invalid escape sequence");
            }
            if (i5 + 4 > this.f32462k && !m26992k(4)) {
                throw m26995p0("Unterminated escape sequence");
            }
            char c3 = 0;
            int i6 = this.f32461j;
            int i7 = i6 + 4;
            while (i6 < i7) {
                char c4 = this.f32460i[i6];
                char c5 = (char) (c3 << 4);
                if (c4 < '0' || c4 > '9') {
                    if (c4 >= 'a' && c4 <= 'f') {
                        i2 = c4 - 'a';
                    } else {
                        if (c4 < 'A' || c4 > 'F') {
                            throw new NumberFormatException("\\u" + new String(this.f32460i, this.f32461j, 4));
                        }
                        i2 = c4 - 'A';
                    }
                    i3 = i2 + 10;
                } else {
                    i3 = c4 - '0';
                }
                c3 = (char) (c5 + i3);
                i6++;
            }
            this.f32461j += 4;
            return c3;
        }
        return c2;
    }

    /* renamed from: c */
    private void m26987c() throws IOException {
        if (!this.f32459h) {
            throw m26995p0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: d */
    private void m26988d() throws IOException {
        m26980H(true);
        int i2 = this.f32461j - 1;
        this.f32461j = i2;
        char[] cArr = f32457f;
        if (i2 + cArr.length > this.f32462k && !m26992k(cArr.length)) {
            return;
        }
        int i3 = 0;
        while (true) {
            char[] cArr2 = f32457f;
            if (i3 >= cArr2.length) {
                this.f32461j += cArr2.length;
                return;
            } else if (this.f32460i[this.f32461j + i3] != cArr2[i3]) {
                return;
            } else {
                i3++;
            }
        }
    }

    /* renamed from: e0 */
    private void m26989e0(char c2) throws IOException {
        char[] cArr = this.f32460i;
        do {
            int i2 = this.f32461j;
            int i3 = this.f32462k;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c3 = cArr[i2];
                if (c3 == c2) {
                    this.f32461j = i4;
                    return;
                }
                if (c3 == '\\') {
                    this.f32461j = i4;
                    m26986Z();
                    i2 = this.f32461j;
                    i3 = this.f32462k;
                } else {
                    if (c3 == '\n') {
                        this.f32463l++;
                        this.f32464m = i4;
                    }
                    i2 = i4;
                }
            }
            this.f32461j = i2;
        } while (m26992k(1));
        throw m26995p0("Unterminated string");
    }

    /* renamed from: f0 */
    private boolean m26990f0(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.f32461j + length > this.f32462k && !m26992k(length)) {
                return false;
            }
            char[] cArr = this.f32460i;
            int i2 = this.f32461j;
            if (cArr[i2] != '\n') {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.f32460i[this.f32461j + i3] != str.charAt(i3)) {
                        break;
                    }
                }
                return true;
            }
            this.f32463l++;
            this.f32464m = i2 + 1;
            this.f32461j++;
        }
    }

    /* renamed from: i0 */
    private void m26991i0() throws IOException {
        char c2;
        do {
            if (this.f32461j >= this.f32462k && !m26992k(1)) {
                return;
            }
            char[] cArr = this.f32460i;
            int i2 = this.f32461j;
            int i3 = i2 + 1;
            this.f32461j = i3;
            c2 = cArr[i2];
            if (c2 == '\n') {
                this.f32463l++;
                this.f32464m = i3;
                return;
            }
        } while (c2 != '\r');
    }

    /* renamed from: k */
    private boolean m26992k(int i2) throws IOException {
        int i3;
        int i4;
        char[] cArr = this.f32460i;
        int i5 = this.f32464m;
        int i6 = this.f32461j;
        this.f32464m = i5 - i6;
        int i7 = this.f32462k;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f32462k = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f32462k = 0;
        }
        this.f32461j = 0;
        do {
            Reader reader = this.f32458g;
            int i9 = this.f32462k;
            int i10 = reader.read(cArr, i9, cArr.length - i9);
            if (i10 == -1) {
                return false;
            }
            i3 = this.f32462k + i10;
            this.f32462k = i3;
            if (this.f32463l == 0 && (i4 = this.f32464m) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f32461j++;
                this.f32464m = i4 + 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        m26987c();
     */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m26993m0() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f32461j
            int r2 = r1 + r0
            int r3 = r4.f32462k
            if (r2 >= r3) goto L51
            char[] r2 = r4.f32460i
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m26987c()
        L4b:
            int r1 = r4.f32461j
            int r1 = r1 + r0
            r4.f32461j = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f32461j = r1
            r0 = 1
            boolean r0 = r4.m26992k(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C8585a.m26993m0():void");
    }

    /* renamed from: p */
    private boolean m26994p(char c2) throws IOException {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m26987c();
        return false;
    }

    /* renamed from: p0 */
    private IOException m26995p0(String str) throws IOException {
        throw new MalformedJsonException(str + m27012x());
    }

    /* renamed from: A */
    public int mo26996A() throws IOException, NumberFormatException {
        int iM27005e = this.f32465n;
        if (iM27005e == 0) {
            iM27005e = m27005e();
        }
        if (iM27005e == 15) {
            long j2 = this.f32466o;
            int i2 = (int) j2;
            if (j2 == i2) {
                this.f32465n = 0;
                int[] iArr = this.f32472u;
                int i3 = this.f32470s - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f32466o + m27012x());
        }
        if (iM27005e == 16) {
            this.f32468q = new String(this.f32460i, this.f32461j, this.f32467p);
            this.f32461j += this.f32467p;
        } else {
            if (iM27005e != 8 && iM27005e != 9 && iM27005e != 10) {
                throw new IllegalStateException("Expected an int but was " + mo27001Q() + m27012x());
            }
            if (iM27005e == 10) {
                this.f32468q = m26982N();
            } else {
                this.f32468q = m26981J(iM27005e == 8 ? '\'' : '\"');
            }
            try {
                int i4 = Integer.parseInt(this.f32468q);
                this.f32465n = 0;
                int[] iArr2 = this.f32472u;
                int i5 = this.f32470s - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        }
        this.f32465n = 11;
        double d2 = Double.parseDouble(this.f32468q);
        int i6 = (int) d2;
        if (i6 != d2) {
            throw new NumberFormatException("Expected an int but was " + this.f32468q + m27012x());
        }
        this.f32468q = null;
        this.f32465n = 0;
        int[] iArr3 = this.f32472u;
        int i7 = this.f32470s - 1;
        iArr3[i7] = iArr3[i7] + 1;
        return i6;
    }

    /* renamed from: B */
    public long mo26997B() throws IOException, NumberFormatException {
        int iM27005e = this.f32465n;
        if (iM27005e == 0) {
            iM27005e = m27005e();
        }
        if (iM27005e == 15) {
            this.f32465n = 0;
            int[] iArr = this.f32472u;
            int i2 = this.f32470s - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f32466o;
        }
        if (iM27005e == 16) {
            this.f32468q = new String(this.f32460i, this.f32461j, this.f32467p);
            this.f32461j += this.f32467p;
        } else {
            if (iM27005e != 8 && iM27005e != 9 && iM27005e != 10) {
                throw new IllegalStateException("Expected a long but was " + mo27001Q() + m27012x());
            }
            if (iM27005e == 10) {
                this.f32468q = m26982N();
            } else {
                this.f32468q = m26981J(iM27005e == 8 ? '\'' : '\"');
            }
            try {
                long j2 = Long.parseLong(this.f32468q);
                this.f32465n = 0;
                int[] iArr2 = this.f32472u;
                int i3 = this.f32470s - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        }
        this.f32465n = 11;
        double d2 = Double.parseDouble(this.f32468q);
        long j3 = (long) d2;
        if (j3 != d2) {
            throw new NumberFormatException("Expected a long but was " + this.f32468q + m27012x());
        }
        this.f32468q = null;
        this.f32465n = 0;
        int[] iArr3 = this.f32472u;
        int i4 = this.f32470s - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j3;
    }

    /* renamed from: D */
    public String mo26998D() throws IOException {
        String strM26981J;
        int iM27005e = this.f32465n;
        if (iM27005e == 0) {
            iM27005e = m27005e();
        }
        if (iM27005e == 14) {
            strM26981J = m26982N();
        } else if (iM27005e == 12) {
            strM26981J = m26981J('\'');
        } else {
            if (iM27005e != 13) {
                throw new IllegalStateException("Expected a name but was " + mo27001Q() + m27012x());
            }
            strM26981J = m26981J('\"');
        }
        this.f32465n = 0;
        this.f32471t[this.f32470s - 1] = strM26981J;
        return strM26981J;
    }

    /* renamed from: I */
    public void mo26999I() throws IOException {
        int iM27005e = this.f32465n;
        if (iM27005e == 0) {
            iM27005e = m27005e();
        }
        if (iM27005e == 7) {
            this.f32465n = 0;
            int[] iArr = this.f32472u;
            int i2 = this.f32470s - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo27001Q() + m27012x());
    }

    /* renamed from: K */
    public String mo27000K() throws IOException {
        String str;
        int iM27005e = this.f32465n;
        if (iM27005e == 0) {
            iM27005e = m27005e();
        }
        if (iM27005e == 10) {
            str = m26982N();
        } else if (iM27005e == 8) {
            str = m26981J('\'');
        } else if (iM27005e == 9) {
            str = m26981J('\"');
        } else if (iM27005e == 11) {
            str = this.f32468q;
            this.f32468q = null;
        } else if (iM27005e == 15) {
            str = Long.toString(this.f32466o);
        } else {
            if (iM27005e != 16) {
                throw new IllegalStateException("Expected a string but was " + mo27001Q() + m27012x());
            }
            str = new String(this.f32460i, this.f32461j, this.f32467p);
            this.f32461j += this.f32467p;
        }
        this.f32465n = 0;
        int[] iArr = this.f32472u;
        int i2 = this.f32470s - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: Q */
    public EnumC8586b mo27001Q() throws IOException {
        int iM27005e = this.f32465n;
        if (iM27005e == 0) {
            iM27005e = m27005e();
        }
        switch (iM27005e) {
            case 1:
                return EnumC8586b.BEGIN_OBJECT;
            case 2:
                return EnumC8586b.END_OBJECT;
            case 3:
                return EnumC8586b.BEGIN_ARRAY;
            case 4:
                return EnumC8586b.END_ARRAY;
            case 5:
            case 6:
                return EnumC8586b.BOOLEAN;
            case 7:
                return EnumC8586b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC8586b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC8586b.NAME;
            case 15:
            case 16:
                return EnumC8586b.NUMBER;
            case 17:
                return EnumC8586b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: a */
    public void mo27002a() throws IOException {
        int iM27005e = this.f32465n;
        if (iM27005e == 0) {
            iM27005e = m27005e();
        }
        if (iM27005e == 3) {
            m26985Y(1);
            this.f32472u[this.f32470s - 1] = 0;
            this.f32465n = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo27001Q() + m27012x());
        }
    }

    /* renamed from: a0 */
    public final void m27003a0(boolean z) {
        this.f32459h = z;
    }

    /* renamed from: b */
    public void mo27004b() throws IOException {
        int iM27005e = this.f32465n;
        if (iM27005e == 0) {
            iM27005e = m27005e();
        }
        if (iM27005e == 1) {
            m26985Y(3);
            this.f32465n = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo27001Q() + m27012x());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f32465n = 0;
        this.f32469r[0] = 8;
        this.f32470s = 1;
        this.f32458g.close();
    }

    /* renamed from: e */
    int m27005e() throws IOException {
        int iM26980H;
        int[] iArr = this.f32469r;
        int i2 = this.f32470s;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int iM26980H2 = m26980H(true);
            if (iM26980H2 != 44) {
                if (iM26980H2 != 59) {
                    if (iM26980H2 != 93) {
                        throw m26995p0("Unterminated array");
                    }
                    this.f32465n = 4;
                    return 4;
                }
                m26987c();
            }
        } else {
            if (i3 == 3 || i3 == 5) {
                iArr[i2 - 1] = 4;
                if (i3 == 5 && (iM26980H = m26980H(true)) != 44) {
                    if (iM26980H != 59) {
                        if (iM26980H != 125) {
                            throw m26995p0("Unterminated object");
                        }
                        this.f32465n = 2;
                        return 2;
                    }
                    m26987c();
                }
                int iM26980H3 = m26980H(true);
                if (iM26980H3 == 34) {
                    this.f32465n = 13;
                    return 13;
                }
                if (iM26980H3 == 39) {
                    m26987c();
                    this.f32465n = 12;
                    return 12;
                }
                if (iM26980H3 == 125) {
                    if (i3 == 5) {
                        throw m26995p0("Expected name");
                    }
                    this.f32465n = 2;
                    return 2;
                }
                m26987c();
                this.f32461j--;
                if (!m26994p((char) iM26980H3)) {
                    throw m26995p0("Expected name");
                }
                this.f32465n = 14;
                return 14;
            }
            if (i3 == 4) {
                iArr[i2 - 1] = 5;
                int iM26980H4 = m26980H(true);
                if (iM26980H4 != 58) {
                    if (iM26980H4 != 61) {
                        throw m26995p0("Expected ':'");
                    }
                    m26987c();
                    if (this.f32461j < this.f32462k || m26992k(1)) {
                        char[] cArr = this.f32460i;
                        int i4 = this.f32461j;
                        if (cArr[i4] == '>') {
                            this.f32461j = i4 + 1;
                        }
                    }
                }
            } else if (i3 == 6) {
                if (this.f32459h) {
                    m26988d();
                }
                this.f32469r[this.f32470s - 1] = 7;
            } else if (i3 == 7) {
                if (m26980H(false) == -1) {
                    this.f32465n = 17;
                    return 17;
                }
                m26987c();
                this.f32461j--;
            } else if (i3 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iM26980H5 = m26980H(true);
        if (iM26980H5 == 34) {
            this.f32465n = 9;
            return 9;
        }
        if (iM26980H5 == 39) {
            m26987c();
            this.f32465n = 8;
            return 8;
        }
        if (iM26980H5 != 44 && iM26980H5 != 59) {
            if (iM26980H5 == 91) {
                this.f32465n = 3;
                return 3;
            }
            if (iM26980H5 != 93) {
                if (iM26980H5 == 123) {
                    this.f32465n = 1;
                    return 1;
                }
                this.f32461j--;
                int iM26983T = m26983T();
                if (iM26983T != 0) {
                    return iM26983T;
                }
                int iM26984W = m26984W();
                if (iM26984W != 0) {
                    return iM26984W;
                }
                if (!m26994p(this.f32460i[this.f32461j])) {
                    throw m26995p0("Expected value");
                }
                m26987c();
                this.f32465n = 10;
                return 10;
            }
            if (i3 == 1) {
                this.f32465n = 4;
                return 4;
            }
        }
        if (i3 != 1 && i3 != 2) {
            throw m26995p0("Unexpected value");
        }
        m26987c();
        this.f32461j--;
        this.f32465n = 7;
        return 7;
    }

    /* renamed from: f */
    public void mo27006f() throws IOException {
        int iM27005e = this.f32465n;
        if (iM27005e == 0) {
            iM27005e = m27005e();
        }
        if (iM27005e != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + mo27001Q() + m27012x());
        }
        int i2 = this.f32470s - 1;
        this.f32470s = i2;
        int[] iArr = this.f32472u;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f32465n = 0;
    }

    /* renamed from: g */
    public String mo27007g() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = this.f32470s;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f32469r[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.f32472u[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String[] strArr = this.f32471t;
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: j */
    public void mo27008j() throws IOException {
        int iM27005e = this.f32465n;
        if (iM27005e == 0) {
            iM27005e = m27005e();
        }
        if (iM27005e != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + mo27001Q() + m27012x());
        }
        int i2 = this.f32470s - 1;
        this.f32470s = i2;
        this.f32471t[i2] = null;
        int[] iArr = this.f32472u;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f32465n = 0;
    }

    /* renamed from: l */
    public boolean mo27009l() throws IOException {
        int iM27005e = this.f32465n;
        if (iM27005e == 0) {
            iM27005e = m27005e();
        }
        return (iM27005e == 2 || iM27005e == 4) ? false : true;
    }

    /* renamed from: m */
    public final boolean m27010m() {
        return this.f32459h;
    }

    /* renamed from: n0 */
    public void mo27011n0() throws IOException {
        int i2 = 0;
        do {
            int iM27005e = this.f32465n;
            if (iM27005e == 0) {
                iM27005e = m27005e();
            }
            if (iM27005e == 3) {
                m26985Y(1);
            } else if (iM27005e == 1) {
                m26985Y(3);
            } else if (iM27005e == 4 || iM27005e == 2) {
                this.f32470s--;
                i2--;
                this.f32465n = 0;
            } else {
                if (iM27005e == 14 || iM27005e == 10) {
                    m26993m0();
                } else if (iM27005e == 8 || iM27005e == 12) {
                    m26989e0('\'');
                } else if (iM27005e == 9 || iM27005e == 13) {
                    m26989e0('\"');
                } else if (iM27005e == 16) {
                    this.f32461j += this.f32467p;
                }
                this.f32465n = 0;
            }
            i2++;
            this.f32465n = 0;
        } while (i2 != 0);
        int[] iArr = this.f32472u;
        int i3 = this.f32470s;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f32471t[i3 - 1] = "null";
    }

    public String toString() {
        return getClass().getSimpleName() + m27012x();
    }

    /* renamed from: x */
    String m27012x() {
        return " at line " + (this.f32463l + 1) + " column " + ((this.f32461j - this.f32464m) + 1) + " path " + mo27007g();
    }

    /* renamed from: y */
    public boolean mo27013y() throws IOException {
        int iM27005e = this.f32465n;
        if (iM27005e == 0) {
            iM27005e = m27005e();
        }
        if (iM27005e == 5) {
            this.f32465n = 0;
            int[] iArr = this.f32472u;
            int i2 = this.f32470s - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iM27005e == 6) {
            this.f32465n = 0;
            int[] iArr2 = this.f32472u;
            int i3 = this.f32470s - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + mo27001Q() + m27012x());
    }

    /* renamed from: z */
    public double mo27014z() throws IOException, NumberFormatException {
        int iM27005e = this.f32465n;
        if (iM27005e == 0) {
            iM27005e = m27005e();
        }
        if (iM27005e == 15) {
            this.f32465n = 0;
            int[] iArr = this.f32472u;
            int i2 = this.f32470s - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f32466o;
        }
        if (iM27005e == 16) {
            this.f32468q = new String(this.f32460i, this.f32461j, this.f32467p);
            this.f32461j += this.f32467p;
        } else if (iM27005e == 8 || iM27005e == 9) {
            this.f32468q = m26981J(iM27005e == 8 ? '\'' : '\"');
        } else if (iM27005e == 10) {
            this.f32468q = m26982N();
        } else if (iM27005e != 11) {
            throw new IllegalStateException("Expected a double but was " + mo27001Q() + m27012x());
        }
        this.f32465n = 11;
        double d2 = Double.parseDouble(this.f32468q);
        if (!this.f32459h && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d2 + m27012x());
        }
        this.f32468q = null;
        this.f32465n = 0;
        int[] iArr2 = this.f32472u;
        int i3 = this.f32470s - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return d2;
    }
}
