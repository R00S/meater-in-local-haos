package io.sentry.vendor.gson.stream;

import cm.aptoide.p092pt.account.AdultContentAnalytics;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: JsonReader.java */
@ApiStatus.Internal
/* renamed from: io.sentry.vendor.gson.stream.a */
/* loaded from: classes2.dex */
public class C9665a implements Closeable {

    /* renamed from: f */
    private final Reader f36964f;

    /* renamed from: g */
    private boolean f36965g = false;

    /* renamed from: h */
    private final char[] f36966h = new char[1024];

    /* renamed from: i */
    private int f36967i = 0;

    /* renamed from: j */
    private int f36968j = 0;

    /* renamed from: k */
    private int f36969k = 0;

    /* renamed from: l */
    private int f36970l = 0;

    /* renamed from: m */
    int f36971m = 0;

    /* renamed from: n */
    private long f36972n;

    /* renamed from: o */
    private int f36973o;

    /* renamed from: p */
    private String f36974p;

    /* renamed from: q */
    private int[] f36975q;

    /* renamed from: r */
    private int f36976r;

    /* renamed from: s */
    private String[] f36977s;

    /* renamed from: t */
    private int[] f36978t;

    public C9665a(Reader reader) {
        int[] iArr = new int[32];
        this.f36975q = iArr;
        this.f36976r = 0;
        this.f36976r = 0 + 1;
        iArr[0] = 6;
        this.f36977s = new String[32];
        this.f36978t = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f36964f = reader;
    }

    /* renamed from: D */
    private int m31862D(boolean z) throws IOException {
        char[] cArr = this.f36966h;
        int i2 = this.f36967i;
        int i3 = this.f36968j;
        while (true) {
            if (i2 == i3) {
                this.f36967i = i2;
                if (!m31875k(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m31891p());
                }
                i2 = this.f36967i;
                i3 = this.f36968j;
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == '\n') {
                this.f36969k++;
                this.f36970l = i4;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f36967i = i4;
                    if (i4 == i3) {
                        this.f36967i = i4 - 1;
                        boolean zM31875k = m31875k(2);
                        this.f36967i++;
                        if (!zM31875k) {
                            return c2;
                        }
                    }
                    m31871c();
                    int i5 = this.f36967i;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.f36967i = i5 + 1;
                        if (!m31870a0("*/")) {
                            throw m31877m0("Unterminated comment");
                        }
                        i2 = this.f36967i + 2;
                        i3 = this.f36968j;
                    } else {
                        if (c3 != '/') {
                            return c2;
                        }
                        this.f36967i = i5 + 1;
                        m31873e0();
                        i2 = this.f36967i;
                        i3 = this.f36968j;
                    }
                } else {
                    if (c2 != '#') {
                        this.f36967i = i4;
                        return c2;
                    }
                    this.f36967i = i4;
                    m31871c();
                    m31873e0();
                    i2 = this.f36967i;
                    i3 = this.f36968j;
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
        r9.f36967i = r2;
     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m31863I(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f36966h
            r1 = 0
        L3:
            int r2 = r9.f36967i
            int r3 = r9.f36968j
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
            r9.f36967i = r7
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
            r9.f36967i = r7
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
            char r2 = r9.m31868Y()
            r1.append(r2)
            int r2 = r9.f36967i
            int r3 = r9.f36968j
            goto L7
        L4f:
            r5 = 10
            if (r2 != r5) goto L5a
            int r2 = r9.f36969k
            int r2 = r2 + r6
            r9.f36969k = r2
            r9.f36970l = r7
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
            r9.f36967i = r2
            boolean r2 = r9.m31875k(r6)
            if (r2 == 0) goto L7a
            goto L3
        L7a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.m31877m0(r10)
            goto L82
        L81:
            throw r10
        L82:
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C9665a.m31863I(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        m31871c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m31864K() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f36967i
            int r4 = r3 + r2
            int r5 = r6.f36968j
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f36966h
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
            r6.m31871c()
            goto L5c
        L4e:
            char[] r3 = r6.f36966h
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.m31875k(r3)
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
            char[] r3 = r6.f36966h
            int r4 = r6.f36967i
            r1.append(r3, r4, r2)
            int r3 = r6.f36967i
            int r3 = r3 + r2
            r6.f36967i = r3
            r2 = 1
            boolean r2 = r6.m31875k(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f36966h
            int r3 = r6.f36967i
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f36966h
            int r3 = r6.f36967i
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f36967i
            int r2 = r2 + r0
            r6.f36967i = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C9665a.m31864K():java.lang.String");
    }

    /* renamed from: Q */
    private int m31865Q() throws IOException {
        int i2;
        String str;
        String str2;
        char c2 = this.f36966h[this.f36967i];
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
            if (this.f36967i + i3 >= this.f36968j && !m31875k(i3 + 1)) {
                return 0;
            }
            char c3 = this.f36966h[this.f36967i + i3];
            if (c3 != str.charAt(i3) && c3 != str2.charAt(i3)) {
                return 0;
            }
        }
        if ((this.f36967i + length < this.f36968j || m31875k(length + 1)) && m31876m(this.f36966h[this.f36967i + length])) {
            return 0;
        }
        this.f36967i += length;
        this.f36971m = i2;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        if (m31876m(r14) != false) goto L80;
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
    
        r18.f36972n = r11;
        r18.f36967i += r8;
        r18.f36971m = 15;
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
    
        r18.f36973o = r8;
        r18.f36971m = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ce, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00cf, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f2  */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m31866T() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C9665a.m31866T():int");
    }

    /* renamed from: W */
    private void m31867W(int i2) {
        int i3 = this.f36976r;
        int[] iArr = this.f36975q;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.f36975q = Arrays.copyOf(iArr, i4);
            this.f36978t = Arrays.copyOf(this.f36978t, i4);
            this.f36977s = (String[]) Arrays.copyOf(this.f36977s, i4);
        }
        int[] iArr2 = this.f36975q;
        int i5 = this.f36976r;
        this.f36976r = i5 + 1;
        iArr2[i5] = i2;
    }

    /* renamed from: Y */
    private char m31868Y() throws IOException {
        int i2;
        int i3;
        if (this.f36967i == this.f36968j && !m31875k(1)) {
            throw m31877m0("Unterminated escape sequence");
        }
        char[] cArr = this.f36966h;
        int i4 = this.f36967i;
        int i5 = i4 + 1;
        this.f36967i = i5;
        char c2 = cArr[i4];
        if (c2 == '\n') {
            this.f36969k++;
            this.f36970l = i5;
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
                throw m31877m0("Invalid escape sequence");
            }
            if (i5 + 4 > this.f36968j && !m31875k(4)) {
                throw m31877m0("Unterminated escape sequence");
            }
            char c3 = 0;
            int i6 = this.f36967i;
            int i7 = i6 + 4;
            while (i6 < i7) {
                char c4 = this.f36966h[i6];
                char c5 = (char) (c3 << 4);
                if (c4 < '0' || c4 > '9') {
                    if (c4 >= 'a' && c4 <= 'f') {
                        i2 = c4 - 'a';
                    } else {
                        if (c4 < 'A' || c4 > 'F') {
                            throw new NumberFormatException("\\u" + new String(this.f36966h, this.f36967i, 4));
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
            this.f36967i += 4;
            return c3;
        }
        return c2;
    }

    /* renamed from: Z */
    private void m31869Z(char c2) throws IOException {
        char[] cArr = this.f36966h;
        do {
            int i2 = this.f36967i;
            int i3 = this.f36968j;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c3 = cArr[i2];
                if (c3 == c2) {
                    this.f36967i = i4;
                    return;
                }
                if (c3 == '\\') {
                    this.f36967i = i4;
                    m31868Y();
                    i2 = this.f36967i;
                    i3 = this.f36968j;
                } else {
                    if (c3 == '\n') {
                        this.f36969k++;
                        this.f36970l = i4;
                    }
                    i2 = i4;
                }
            }
            this.f36967i = i2;
        } while (m31875k(1));
        throw m31877m0("Unterminated string");
    }

    /* renamed from: a0 */
    private boolean m31870a0(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.f36967i + length > this.f36968j && !m31875k(length)) {
                return false;
            }
            char[] cArr = this.f36966h;
            int i2 = this.f36967i;
            if (cArr[i2] != '\n') {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.f36966h[this.f36967i + i3] != str.charAt(i3)) {
                        break;
                    }
                }
                return true;
            }
            this.f36969k++;
            this.f36970l = i2 + 1;
            this.f36967i++;
        }
    }

    /* renamed from: c */
    private void m31871c() throws IOException {
        if (!this.f36965g) {
            throw m31877m0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: d */
    private void m31872d() throws IOException {
        m31862D(true);
        int i2 = this.f36967i - 1;
        this.f36967i = i2;
        if (i2 + 5 <= this.f36968j || m31875k(5)) {
            char[] cArr = this.f36966h;
            if (cArr[i2] == ')' && cArr[i2 + 1] == ']' && cArr[i2 + 2] == '}' && cArr[i2 + 3] == '\'' && cArr[i2 + 4] == '\n') {
                this.f36967i += 5;
            }
        }
    }

    /* renamed from: e0 */
    private void m31873e0() throws IOException {
        char c2;
        do {
            if (this.f36967i >= this.f36968j && !m31875k(1)) {
                return;
            }
            char[] cArr = this.f36966h;
            int i2 = this.f36967i;
            int i3 = i2 + 1;
            this.f36967i = i3;
            c2 = cArr[i2];
            if (c2 == '\n') {
                this.f36969k++;
                this.f36970l = i3;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        m31871c();
     */
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m31874f0() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f36967i
            int r2 = r1 + r0
            int r3 = r4.f36968j
            if (r2 >= r3) goto L51
            char[] r2 = r4.f36966h
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
            r4.m31871c()
        L4b:
            int r1 = r4.f36967i
            int r1 = r1 + r0
            r4.f36967i = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f36967i = r1
            r0 = 1
            boolean r0 = r4.m31875k(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C9665a.m31874f0():void");
    }

    /* renamed from: k */
    private boolean m31875k(int i2) throws IOException {
        int i3;
        int i4;
        char[] cArr = this.f36966h;
        int i5 = this.f36970l;
        int i6 = this.f36967i;
        this.f36970l = i5 - i6;
        int i7 = this.f36968j;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f36968j = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f36968j = 0;
        }
        this.f36967i = 0;
        do {
            Reader reader = this.f36964f;
            int i9 = this.f36968j;
            int i10 = reader.read(cArr, i9, cArr.length - i9);
            if (i10 == -1) {
                return false;
            }
            i3 = this.f36968j + i10;
            this.f36968j = i3;
            if (this.f36969k == 0 && (i4 = this.f36970l) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f36967i++;
                this.f36970l = i4 + 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    /* renamed from: m */
    private boolean m31876m(char c2) throws IOException {
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
        m31871c();
        return false;
    }

    /* renamed from: m0 */
    private IOException m31877m0(String str) throws IOException {
        throw new MalformedJsonException(str + m31891p());
    }

    /* renamed from: A */
    public long m31878A() throws IOException, NumberFormatException {
        int iM31885e = this.f36971m;
        if (iM31885e == 0) {
            iM31885e = m31885e();
        }
        if (iM31885e == 15) {
            this.f36971m = 0;
            int[] iArr = this.f36978t;
            int i2 = this.f36976r - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f36972n;
        }
        if (iM31885e == 16) {
            this.f36974p = new String(this.f36966h, this.f36967i, this.f36973o);
            this.f36967i += this.f36973o;
        } else {
            if (iM31885e != 8 && iM31885e != 9 && iM31885e != 10) {
                throw new IllegalStateException("Expected a long but was " + m31882N() + m31891p());
            }
            if (iM31885e == 10) {
                this.f36974p = m31864K();
            } else {
                this.f36974p = m31863I(iM31885e == 8 ? '\'' : '\"');
            }
            try {
                long j2 = Long.parseLong(this.f36974p);
                this.f36971m = 0;
                int[] iArr2 = this.f36978t;
                int i3 = this.f36976r - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        }
        this.f36971m = 11;
        double d2 = Double.parseDouble(this.f36974p);
        long j3 = (long) d2;
        if (j3 != d2) {
            throw new NumberFormatException("Expected a long but was " + this.f36974p + m31891p());
        }
        this.f36974p = null;
        this.f36971m = 0;
        int[] iArr3 = this.f36978t;
        int i4 = this.f36976r - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j3;
    }

    /* renamed from: B */
    public String m31879B() throws IOException {
        String strM31863I;
        int iM31885e = this.f36971m;
        if (iM31885e == 0) {
            iM31885e = m31885e();
        }
        if (iM31885e == 14) {
            strM31863I = m31864K();
        } else if (iM31885e == 12) {
            strM31863I = m31863I('\'');
        } else {
            if (iM31885e != 13) {
                throw new IllegalStateException("Expected a name but was " + m31882N() + m31891p());
            }
            strM31863I = m31863I('\"');
        }
        this.f36971m = 0;
        this.f36977s[this.f36976r - 1] = strM31863I;
        return strM31863I;
    }

    /* renamed from: H */
    public void m31880H() throws IOException {
        int iM31885e = this.f36971m;
        if (iM31885e == 0) {
            iM31885e = m31885e();
        }
        if (iM31885e == 7) {
            this.f36971m = 0;
            int[] iArr = this.f36978t;
            int i2 = this.f36976r - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + m31882N() + m31891p());
    }

    /* renamed from: J */
    public String m31881J() throws IOException {
        String str;
        int iM31885e = this.f36971m;
        if (iM31885e == 0) {
            iM31885e = m31885e();
        }
        if (iM31885e == 10) {
            str = m31864K();
        } else if (iM31885e == 8) {
            str = m31863I('\'');
        } else if (iM31885e == 9) {
            str = m31863I('\"');
        } else if (iM31885e == 11) {
            str = this.f36974p;
            this.f36974p = null;
        } else if (iM31885e == 15) {
            str = Long.toString(this.f36972n);
        } else {
            if (iM31885e != 16) {
                throw new IllegalStateException("Expected a string but was " + m31882N() + m31891p());
            }
            str = new String(this.f36966h, this.f36967i, this.f36973o);
            this.f36967i += this.f36973o;
        }
        this.f36971m = 0;
        int[] iArr = this.f36978t;
        int i2 = this.f36976r - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: N */
    public EnumC9666b m31882N() throws IOException {
        int iM31885e = this.f36971m;
        if (iM31885e == 0) {
            iM31885e = m31885e();
        }
        switch (iM31885e) {
            case 1:
                return EnumC9666b.BEGIN_OBJECT;
            case 2:
                return EnumC9666b.END_OBJECT;
            case 3:
                return EnumC9666b.BEGIN_ARRAY;
            case 4:
                return EnumC9666b.END_ARRAY;
            case 5:
            case 6:
                return EnumC9666b.BOOLEAN;
            case 7:
                return EnumC9666b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC9666b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC9666b.NAME;
            case 15:
            case 16:
                return EnumC9666b.NUMBER;
            case 17:
                return EnumC9666b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: a */
    public void m31883a() throws IOException {
        int iM31885e = this.f36971m;
        if (iM31885e == 0) {
            iM31885e = m31885e();
        }
        if (iM31885e == 3) {
            m31867W(1);
            this.f36978t[this.f36976r - 1] = 0;
            this.f36971m = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + m31882N() + m31891p());
        }
    }

    /* renamed from: b */
    public void m31884b() throws IOException {
        int iM31885e = this.f36971m;
        if (iM31885e == 0) {
            iM31885e = m31885e();
        }
        if (iM31885e == 1) {
            m31867W(3);
            this.f36971m = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + m31882N() + m31891p());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f36971m = 0;
        this.f36975q[0] = 8;
        this.f36976r = 1;
        this.f36964f.close();
    }

    /* renamed from: e */
    int m31885e() throws IOException {
        int iM31862D;
        int[] iArr = this.f36975q;
        int i2 = this.f36976r;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int iM31862D2 = m31862D(true);
            if (iM31862D2 != 44) {
                if (iM31862D2 != 59) {
                    if (iM31862D2 != 93) {
                        throw m31877m0("Unterminated array");
                    }
                    this.f36971m = 4;
                    return 4;
                }
                m31871c();
            }
        } else {
            if (i3 == 3 || i3 == 5) {
                iArr[i2 - 1] = 4;
                if (i3 == 5 && (iM31862D = m31862D(true)) != 44) {
                    if (iM31862D != 59) {
                        if (iM31862D != 125) {
                            throw m31877m0("Unterminated object");
                        }
                        this.f36971m = 2;
                        return 2;
                    }
                    m31871c();
                }
                int iM31862D3 = m31862D(true);
                if (iM31862D3 == 34) {
                    this.f36971m = 13;
                    return 13;
                }
                if (iM31862D3 == 39) {
                    m31871c();
                    this.f36971m = 12;
                    return 12;
                }
                if (iM31862D3 == 125) {
                    if (i3 == 5) {
                        throw m31877m0("Expected name");
                    }
                    this.f36971m = 2;
                    return 2;
                }
                m31871c();
                this.f36967i--;
                if (!m31876m((char) iM31862D3)) {
                    throw m31877m0("Expected name");
                }
                this.f36971m = 14;
                return 14;
            }
            if (i3 == 4) {
                iArr[i2 - 1] = 5;
                int iM31862D4 = m31862D(true);
                if (iM31862D4 != 58) {
                    if (iM31862D4 != 61) {
                        throw m31877m0("Expected ':'");
                    }
                    m31871c();
                    if (this.f36967i < this.f36968j || m31875k(1)) {
                        char[] cArr = this.f36966h;
                        int i4 = this.f36967i;
                        if (cArr[i4] == '>') {
                            this.f36967i = i4 + 1;
                        }
                    }
                }
            } else if (i3 == 6) {
                if (this.f36965g) {
                    m31872d();
                }
                this.f36975q[this.f36976r - 1] = 7;
            } else if (i3 == 7) {
                if (m31862D(false) == -1) {
                    this.f36971m = 17;
                    return 17;
                }
                m31871c();
                this.f36967i--;
            } else if (i3 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iM31862D5 = m31862D(true);
        if (iM31862D5 == 34) {
            this.f36971m = 9;
            return 9;
        }
        if (iM31862D5 == 39) {
            m31871c();
            this.f36971m = 8;
            return 8;
        }
        if (iM31862D5 != 44 && iM31862D5 != 59) {
            if (iM31862D5 == 91) {
                this.f36971m = 3;
                return 3;
            }
            if (iM31862D5 != 93) {
                if (iM31862D5 == 123) {
                    this.f36971m = 1;
                    return 1;
                }
                this.f36967i--;
                int iM31865Q = m31865Q();
                if (iM31865Q != 0) {
                    return iM31865Q;
                }
                int iM31866T = m31866T();
                if (iM31866T != 0) {
                    return iM31866T;
                }
                if (!m31876m(this.f36966h[this.f36967i])) {
                    throw m31877m0("Expected value");
                }
                m31871c();
                this.f36971m = 10;
                return 10;
            }
            if (i3 == 1) {
                this.f36971m = 4;
                return 4;
            }
        }
        if (i3 != 1 && i3 != 2) {
            throw m31877m0("Unexpected value");
        }
        m31871c();
        this.f36967i--;
        this.f36971m = 7;
        return 7;
    }

    /* renamed from: f */
    public void m31886f() throws IOException {
        int iM31885e = this.f36971m;
        if (iM31885e == 0) {
            iM31885e = m31885e();
        }
        if (iM31885e != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + m31882N() + m31891p());
        }
        int i2 = this.f36976r - 1;
        this.f36976r = i2;
        int[] iArr = this.f36978t;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f36971m = 0;
    }

    /* renamed from: g */
    public String m31887g() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = this.f36976r;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f36975q[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.f36978t[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String[] strArr = this.f36977s;
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: i0 */
    public void m31888i0() throws IOException {
        int i2 = 0;
        do {
            int iM31885e = this.f36971m;
            if (iM31885e == 0) {
                iM31885e = m31885e();
            }
            if (iM31885e == 3) {
                m31867W(1);
            } else if (iM31885e == 1) {
                m31867W(3);
            } else if (iM31885e == 4 || iM31885e == 2) {
                this.f36976r--;
                i2--;
                this.f36971m = 0;
            } else {
                if (iM31885e == 14 || iM31885e == 10) {
                    m31874f0();
                } else if (iM31885e == 8 || iM31885e == 12) {
                    m31869Z('\'');
                } else if (iM31885e == 9 || iM31885e == 13) {
                    m31869Z('\"');
                } else if (iM31885e == 16) {
                    this.f36967i += this.f36973o;
                }
                this.f36971m = 0;
            }
            i2++;
            this.f36971m = 0;
        } while (i2 != 0);
        int[] iArr = this.f36978t;
        int i3 = this.f36976r;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f36977s[i3 - 1] = "null";
    }

    /* renamed from: j */
    public void m31889j() throws IOException {
        int iM31885e = this.f36971m;
        if (iM31885e == 0) {
            iM31885e = m31885e();
        }
        if (iM31885e != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + m31882N() + m31891p());
        }
        int i2 = this.f36976r - 1;
        this.f36976r = i2;
        this.f36977s[i2] = null;
        int[] iArr = this.f36978t;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f36971m = 0;
    }

    /* renamed from: l */
    public boolean m31890l() throws IOException {
        int iM31885e = this.f36971m;
        if (iM31885e == 0) {
            iM31885e = m31885e();
        }
        return (iM31885e == 2 || iM31885e == 4) ? false : true;
    }

    /* renamed from: p */
    String m31891p() {
        return " at line " + (this.f36969k + 1) + " column " + ((this.f36967i - this.f36970l) + 1) + " path " + m31887g();
    }

    public String toString() {
        return getClass().getSimpleName() + m31891p();
    }

    /* renamed from: x */
    public boolean m31892x() throws IOException {
        int iM31885e = this.f36971m;
        if (iM31885e == 0) {
            iM31885e = m31885e();
        }
        if (iM31885e == 5) {
            this.f36971m = 0;
            int[] iArr = this.f36978t;
            int i2 = this.f36976r - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iM31885e == 6) {
            this.f36971m = 0;
            int[] iArr2 = this.f36978t;
            int i3 = this.f36976r - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + m31882N() + m31891p());
    }

    /* renamed from: y */
    public double m31893y() throws IOException, NumberFormatException {
        int iM31885e = this.f36971m;
        if (iM31885e == 0) {
            iM31885e = m31885e();
        }
        if (iM31885e == 15) {
            this.f36971m = 0;
            int[] iArr = this.f36978t;
            int i2 = this.f36976r - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f36972n;
        }
        if (iM31885e == 16) {
            this.f36974p = new String(this.f36966h, this.f36967i, this.f36973o);
            this.f36967i += this.f36973o;
        } else if (iM31885e == 8 || iM31885e == 9) {
            this.f36974p = m31863I(iM31885e == 8 ? '\'' : '\"');
        } else if (iM31885e == 10) {
            this.f36974p = m31864K();
        } else if (iM31885e != 11) {
            throw new IllegalStateException("Expected a double but was " + m31882N() + m31891p());
        }
        this.f36971m = 11;
        double d2 = Double.parseDouble(this.f36974p);
        if (!this.f36965g && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d2 + m31891p());
        }
        this.f36974p = null;
        this.f36971m = 0;
        int[] iArr2 = this.f36978t;
        int i3 = this.f36976r - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return d2;
    }

    /* renamed from: z */
    public int m31894z() throws IOException, NumberFormatException {
        int iM31885e = this.f36971m;
        if (iM31885e == 0) {
            iM31885e = m31885e();
        }
        if (iM31885e == 15) {
            long j2 = this.f36972n;
            int i2 = (int) j2;
            if (j2 == i2) {
                this.f36971m = 0;
                int[] iArr = this.f36978t;
                int i3 = this.f36976r - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f36972n + m31891p());
        }
        if (iM31885e == 16) {
            this.f36974p = new String(this.f36966h, this.f36967i, this.f36973o);
            this.f36967i += this.f36973o;
        } else {
            if (iM31885e != 8 && iM31885e != 9 && iM31885e != 10) {
                throw new IllegalStateException("Expected an int but was " + m31882N() + m31891p());
            }
            if (iM31885e == 10) {
                this.f36974p = m31864K();
            } else {
                this.f36974p = m31863I(iM31885e == 8 ? '\'' : '\"');
            }
            try {
                int i4 = Integer.parseInt(this.f36974p);
                this.f36971m = 0;
                int[] iArr2 = this.f36978t;
                int i5 = this.f36976r - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        }
        this.f36971m = 11;
        double d2 = Double.parseDouble(this.f36974p);
        int i6 = (int) d2;
        if (i6 != d2) {
            throw new NumberFormatException("Expected an int but was " + this.f36974p + m31891p());
        }
        this.f36974p = null;
        this.f36971m = 0;
        int[] iArr3 = this.f36978t;
        int i7 = this.f36976r - 1;
        iArr3[i7] = iArr3[i7] + 1;
        return i6;
    }
}
