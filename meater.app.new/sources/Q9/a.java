package Q9;

import C9.h;
import com.google.gson.internal.e;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: JsonReader.java */
/* loaded from: classes2.dex */
public class a implements Closeable {

    /* renamed from: B, reason: collision with root package name */
    private final Reader f14534B;

    /* renamed from: J, reason: collision with root package name */
    private long f14542J;

    /* renamed from: K, reason: collision with root package name */
    private int f14543K;

    /* renamed from: L, reason: collision with root package name */
    private String f14544L;

    /* renamed from: M, reason: collision with root package name */
    private int[] f14545M;

    /* renamed from: O, reason: collision with root package name */
    private String[] f14547O;

    /* renamed from: P, reason: collision with root package name */
    private int[] f14548P;

    /* renamed from: C, reason: collision with root package name */
    private boolean f14535C = false;

    /* renamed from: D, reason: collision with root package name */
    private final char[] f14536D = new char[1024];

    /* renamed from: E, reason: collision with root package name */
    private int f14537E = 0;

    /* renamed from: F, reason: collision with root package name */
    private int f14538F = 0;

    /* renamed from: G, reason: collision with root package name */
    private int f14539G = 0;

    /* renamed from: H, reason: collision with root package name */
    private int f14540H = 0;

    /* renamed from: I, reason: collision with root package name */
    int f14541I = 0;

    /* renamed from: N, reason: collision with root package name */
    private int f14546N = 1;

    /* compiled from: JsonReader.java */
    /* renamed from: Q9.a$a, reason: collision with other inner class name */
    class C0214a extends e {
        C0214a() {
        }

        @Override // com.google.gson.internal.e
        public void a(a aVar) throws IOException {
            if (aVar instanceof com.google.gson.internal.bind.a) {
                ((com.google.gson.internal.bind.a) aVar).M0();
                return;
            }
            int iE = aVar.f14541I;
            if (iE == 0) {
                iE = aVar.e();
            }
            if (iE == 13) {
                aVar.f14541I = 9;
                return;
            }
            if (iE == 12) {
                aVar.f14541I = 8;
                return;
            }
            if (iE == 14) {
                aVar.f14541I = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + aVar.N() + aVar.p());
        }
    }

    static {
        e.f39065a = new C0214a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f14545M = iArr;
        iArr[0] = 6;
        this.f14547O = new String[32];
        this.f14548P = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f14534B = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r9.f14537E = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String C(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f14536D
            r1 = 0
        L3:
            int r2 = r9.f14537E
            int r3 = r9.f14538F
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5a
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.f14537E = r7
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
            if (r2 != r8) goto L4d
            r9.f14537E = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L3e
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L3e:
            r1.append(r0, r3, r2)
            char r2 = r9.X()
            r1.append(r2)
            int r2 = r9.f14537E
            int r3 = r9.f14538F
            goto L7
        L4d:
            r5 = 10
            if (r2 != r5) goto L58
            int r2 = r9.f14539G
            int r2 = r2 + r6
            r9.f14539G = r2
            r9.f14540H = r7
        L58:
            r2 = r7
            goto L9
        L5a:
            if (r1 != 0) goto L6a
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6a:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f14537E = r2
            boolean r2 = r9.j(r6)
            if (r2 == 0) goto L78
            goto L3
        L78:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.p0(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Q9.a.C(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String L() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f14537E
            int r4 = r3 + r2
            int r5 = r6.f14538F
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f14536D
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
            r6.c()
            goto L5c
        L4e:
            char[] r3 = r6.f14536D
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.j(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f14536D
            int r4 = r6.f14537E
            r0.append(r3, r4, r2)
            int r3 = r6.f14537E
            int r3 = r3 + r2
            r6.f14537E = r3
            r2 = 1
            boolean r2 = r6.j(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f14536D
            int r3 = r6.f14537E
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f14536D
            int r3 = r6.f14537E
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f14537E
            int r2 = r2 + r1
            r6.f14537E = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q9.a.L():java.lang.String");
    }

    private int P() {
        String str;
        String str2;
        int i10;
        char c10 = this.f14536D[this.f14537E];
        if (c10 == 't' || c10 == 'T') {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f14537E + i11 >= this.f14538F && !j(i11 + 1)) {
                return 0;
            }
            char c11 = this.f14536D[this.f14537E + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f14537E + length < this.f14538F || j(length + 1)) && o(this.f14536D[this.f14537E + length])) {
            return 0;
        }
        this.f14537E += length;
        this.f14541I = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        if (o(r14) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0093, code lost:
    
        if (r9 != 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
    
        if (r10 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009d, code lost:
    
        if (r13 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
    
        if (r11 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        if (r13 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a7, code lost:
    
        if (r13 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ab, code lost:
    
        r18.f14542J = r11;
        r18.f14537E += r8;
        r18.f14541I = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b7, code lost:
    
        if (r9 == 2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ba, code lost:
    
        if (r9 == 4) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bd, code lost:
    
        if (r9 != 7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c2, code lost:
    
        r18.f14543K = r8;
        r18.f14541I = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c8, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c9, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int Q() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q9.a.Q():int");
    }

    private void W(int i10) {
        int i11 = this.f14546N;
        int[] iArr = this.f14545M;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f14545M = Arrays.copyOf(iArr, i12);
            this.f14548P = Arrays.copyOf(this.f14548P, i12);
            this.f14547O = (String[]) Arrays.copyOf(this.f14547O, i12);
        }
        int[] iArr2 = this.f14545M;
        int i13 = this.f14546N;
        this.f14546N = i13 + 1;
        iArr2[i13] = i10;
    }

    private char X() throws IOException {
        int i10;
        if (this.f14537E == this.f14538F && !j(1)) {
            throw p0("Unterminated escape sequence");
        }
        char[] cArr = this.f14536D;
        int i11 = this.f14537E;
        int i12 = i11 + 1;
        this.f14537E = i12;
        char c10 = cArr[i11];
        if (c10 == '\n') {
            this.f14539G++;
            this.f14540H = i12;
        } else if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
            if (c10 == 'b') {
                return '\b';
            }
            if (c10 == 'f') {
                return '\f';
            }
            if (c10 == 'n') {
                return '\n';
            }
            if (c10 == 'r') {
                return '\r';
            }
            if (c10 == 't') {
                return '\t';
            }
            if (c10 != 'u') {
                throw p0("Invalid escape sequence");
            }
            if (i11 + 5 > this.f14538F && !j(4)) {
                throw p0("Unterminated escape sequence");
            }
            int i13 = this.f14537E;
            int i14 = i13 + 4;
            char c11 = 0;
            while (i13 < i14) {
                char c12 = this.f14536D[i13];
                char c13 = (char) (c11 << 4);
                if (c12 >= '0' && c12 <= '9') {
                    i10 = c12 - '0';
                } else if (c12 >= 'a' && c12 <= 'f') {
                    i10 = c12 - 'W';
                } else {
                    if (c12 < 'A' || c12 > 'F') {
                        throw new NumberFormatException("\\u" + new String(this.f14536D, this.f14537E, 4));
                    }
                    i10 = c12 - '7';
                }
                c11 = (char) (c13 + i10);
                i13++;
            }
            this.f14537E += 4;
            return c11;
        }
        return c10;
    }

    private void c() throws IOException {
        if (!this.f14535C) {
            throw p0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void d() throws IOException {
        y(true);
        int i10 = this.f14537E;
        this.f14537E = i10 - 1;
        if (i10 + 4 <= this.f14538F || j(5)) {
            int i11 = this.f14537E;
            char[] cArr = this.f14536D;
            if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
                this.f14537E = i11 + 5;
            }
        }
    }

    private void e0(char c10) throws IOException {
        char[] cArr = this.f14536D;
        do {
            int i10 = this.f14537E;
            int i11 = this.f14538F;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f14537E = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f14537E = i12;
                    X();
                    i10 = this.f14537E;
                    i11 = this.f14538F;
                } else {
                    if (c11 == '\n') {
                        this.f14539G++;
                        this.f14540H = i12;
                    }
                    i10 = i12;
                }
            }
            this.f14537E = i10;
        } while (j(1));
        throw p0("Unterminated string");
    }

    private boolean f0(String str) {
        int length = str.length();
        while (true) {
            if (this.f14537E + length > this.f14538F && !j(length)) {
                return false;
            }
            char[] cArr = this.f14536D;
            int i10 = this.f14537E;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f14536D[this.f14537E + i11] != str.charAt(i11)) {
                        break;
                    }
                }
                return true;
            }
            this.f14539G++;
            this.f14540H = i10 + 1;
            this.f14537E++;
        }
    }

    private void h0() {
        char c10;
        do {
            if (this.f14537E >= this.f14538F && !j(1)) {
                return;
            }
            char[] cArr = this.f14536D;
            int i10 = this.f14537E;
            int i11 = i10 + 1;
            this.f14537E = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f14539G++;
                this.f14540H = i11;
                return;
            }
        } while (c10 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        c();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i0() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f14537E
            int r2 = r1 + r0
            int r3 = r4.f14538F
            if (r2 >= r3) goto L51
            char[] r2 = r4.f14536D
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
            r4.c()
        L4b:
            int r1 = r4.f14537E
            int r1 = r1 + r0
            r4.f14537E = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f14537E = r1
            r0 = 1
            boolean r0 = r4.j(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q9.a.i0():void");
    }

    private boolean j(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f14536D;
        int i13 = this.f14540H;
        int i14 = this.f14537E;
        this.f14540H = i13 - i14;
        int i15 = this.f14538F;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f14538F = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f14538F = 0;
        }
        this.f14537E = 0;
        do {
            Reader reader = this.f14534B;
            int i17 = this.f14538F;
            int i18 = reader.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f14538F + i18;
            this.f14538F = i11;
            if (this.f14539G == 0 && (i12 = this.f14540H) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f14537E++;
                this.f14540H = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    private String k(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f14546N;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.f14545M[i10];
            if (i12 == 1 || i12 == 2) {
                int i13 = this.f14548P[i10];
                if (z10 && i13 > 0 && i10 == i11 - 1) {
                    i13--;
                }
                sb2.append('[');
                sb2.append(i13);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = this.f14547O[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    private boolean o(char c10) throws IOException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
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
        c();
        return false;
    }

    private IOException p0(String str) throws MalformedJsonException {
        throw new MalformedJsonException(str + p());
    }

    private int y(boolean z10) throws IOException {
        char[] cArr = this.f14536D;
        int i10 = this.f14537E;
        int i11 = this.f14538F;
        while (true) {
            if (i10 == i11) {
                this.f14537E = i10;
                if (!j(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + p());
                }
                i10 = this.f14537E;
                i11 = this.f14538F;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f14539G++;
                this.f14540H = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f14537E = i12;
                    if (i12 == i11) {
                        this.f14537E = i10;
                        boolean zJ = j(2);
                        this.f14537E++;
                        if (!zJ) {
                            return c10;
                        }
                    }
                    c();
                    int i13 = this.f14537E;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f14537E = i13 + 1;
                        if (!f0("*/")) {
                            throw p0("Unterminated comment");
                        }
                        i10 = this.f14537E + 2;
                        i11 = this.f14538F;
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f14537E = i13 + 1;
                        h0();
                        i10 = this.f14537E;
                        i11 = this.f14538F;
                    }
                } else {
                    if (c10 != '#') {
                        this.f14537E = i12;
                        return c10;
                    }
                    this.f14537E = i12;
                    c();
                    h0();
                    i10 = this.f14537E;
                    i11 = this.f14538F;
                }
            }
            i10 = i12;
        }
    }

    public String K() throws IOException {
        String str;
        int iE = this.f14541I;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 10) {
            str = L();
        } else if (iE == 8) {
            str = C('\'');
        } else if (iE == 9) {
            str = C('\"');
        } else if (iE == 11) {
            str = this.f14544L;
            this.f14544L = null;
        } else if (iE == 15) {
            str = Long.toString(this.f14542J);
        } else {
            if (iE != 16) {
                throw new IllegalStateException("Expected a string but was " + N() + p());
            }
            str = new String(this.f14536D, this.f14537E, this.f14543K);
            this.f14537E += this.f14543K;
        }
        this.f14541I = 0;
        int[] iArr = this.f14548P;
        int i10 = this.f14546N - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public b N() throws IOException {
        int iE = this.f14541I;
        if (iE == 0) {
            iE = e();
        }
        switch (iE) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return b.STRING;
            case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public void a() throws IOException {
        int iE = this.f14541I;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 3) {
            W(1);
            this.f14548P[this.f14546N - 1] = 0;
            this.f14541I = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + N() + p());
        }
    }

    public final void a0(boolean z10) {
        this.f14535C = z10;
    }

    public void b() throws IOException {
        int iE = this.f14541I;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 1) {
            W(3);
            this.f14541I = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + N() + p());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14541I = 0;
        this.f14545M[0] = 8;
        this.f14546N = 1;
        this.f14534B.close();
    }

    int e() throws IOException {
        int iY;
        int[] iArr = this.f14545M;
        int i10 = this.f14546N;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iY2 = y(true);
            if (iY2 != 44) {
                if (iY2 != 59) {
                    if (iY2 != 93) {
                        throw p0("Unterminated array");
                    }
                    this.f14541I = 4;
                    return 4;
                }
                c();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (iY = y(true)) != 44) {
                    if (iY != 59) {
                        if (iY != 125) {
                            throw p0("Unterminated object");
                        }
                        this.f14541I = 2;
                        return 2;
                    }
                    c();
                }
                int iY3 = y(true);
                if (iY3 == 34) {
                    this.f14541I = 13;
                    return 13;
                }
                if (iY3 == 39) {
                    c();
                    this.f14541I = 12;
                    return 12;
                }
                if (iY3 == 125) {
                    if (i11 == 5) {
                        throw p0("Expected name");
                    }
                    this.f14541I = 2;
                    return 2;
                }
                c();
                this.f14537E--;
                if (!o((char) iY3)) {
                    throw p0("Expected name");
                }
                this.f14541I = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iY4 = y(true);
                if (iY4 != 58) {
                    if (iY4 != 61) {
                        throw p0("Expected ':'");
                    }
                    c();
                    if (this.f14537E < this.f14538F || j(1)) {
                        char[] cArr = this.f14536D;
                        int i12 = this.f14537E;
                        if (cArr[i12] == '>') {
                            this.f14537E = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.f14535C) {
                    d();
                }
                this.f14545M[this.f14546N - 1] = 7;
            } else if (i11 == 7) {
                if (y(false) == -1) {
                    this.f14541I = 17;
                    return 17;
                }
                c();
                this.f14537E--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iY5 = y(true);
        if (iY5 == 34) {
            this.f14541I = 9;
            return 9;
        }
        if (iY5 == 39) {
            c();
            this.f14541I = 8;
            return 8;
        }
        if (iY5 != 44 && iY5 != 59) {
            if (iY5 == 91) {
                this.f14541I = 3;
                return 3;
            }
            if (iY5 != 93) {
                if (iY5 == 123) {
                    this.f14541I = 1;
                    return 1;
                }
                this.f14537E--;
                int iP = P();
                if (iP != 0) {
                    return iP;
                }
                int iQ = Q();
                if (iQ != 0) {
                    return iQ;
                }
                if (!o(this.f14536D[this.f14537E])) {
                    throw p0("Expected value");
                }
                c();
                this.f14541I = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f14541I = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw p0("Unexpected value");
        }
        c();
        this.f14537E--;
        this.f14541I = 7;
        return 7;
    }

    public void f() throws IOException {
        int iE = this.f14541I;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + N() + p());
        }
        int i10 = this.f14546N;
        this.f14546N = i10 - 1;
        int[] iArr = this.f14548P;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f14541I = 0;
    }

    public void g() throws IOException {
        int iE = this.f14541I;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + N() + p());
        }
        int i10 = this.f14546N;
        int i11 = i10 - 1;
        this.f14546N = i11;
        this.f14547O[i11] = null;
        int[] iArr = this.f14548P;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f14541I = 0;
    }

    public String h() {
        return k(false);
    }

    public String l() {
        return k(true);
    }

    public boolean m() throws IOException {
        int iE = this.f14541I;
        if (iE == 0) {
            iE = e();
        }
        return (iE == 2 || iE == 4 || iE == 17) ? false : true;
    }

    public final boolean n() {
        return this.f14535C;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void o0() throws IOException {
        int i10 = 0;
        do {
            int iE = this.f14541I;
            if (iE == 0) {
                iE = e();
            }
            switch (iE) {
                case 1:
                    W(3);
                    i10++;
                    this.f14541I = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f14547O[this.f14546N - 1] = null;
                    }
                    this.f14546N--;
                    i10--;
                    this.f14541I = 0;
                    break;
                case 3:
                    W(1);
                    i10++;
                    this.f14541I = 0;
                    break;
                case 4:
                    this.f14546N--;
                    i10--;
                    this.f14541I = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case 15:
                default:
                    this.f14541I = 0;
                    break;
                case 8:
                    e0('\'');
                    this.f14541I = 0;
                    break;
                case 9:
                    e0('\"');
                    this.f14541I = 0;
                    break;
                case h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    i0();
                    this.f14541I = 0;
                    break;
                case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    e0('\'');
                    if (i10 == 0) {
                        this.f14547O[this.f14546N - 1] = "<skipped>";
                    }
                    this.f14541I = 0;
                    break;
                case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    e0('\"');
                    if (i10 == 0) {
                        this.f14547O[this.f14546N - 1] = "<skipped>";
                    }
                    this.f14541I = 0;
                    break;
                case 14:
                    i0();
                    if (i10 == 0) {
                        this.f14547O[this.f14546N - 1] = "<skipped>";
                    }
                    this.f14541I = 0;
                    break;
                case 16:
                    this.f14537E += this.f14543K;
                    this.f14541I = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.f14548P;
        int i11 = this.f14546N - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    String p() {
        return " at line " + (this.f14539G + 1) + " column " + ((this.f14537E - this.f14540H) + 1) + " path " + h();
    }

    public boolean q() throws IOException {
        int iE = this.f14541I;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 5) {
            this.f14541I = 0;
            int[] iArr = this.f14548P;
            int i10 = this.f14546N - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iE == 6) {
            this.f14541I = 0;
            int[] iArr2 = this.f14548P;
            int i11 = this.f14546N - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + N() + p());
    }

    public double s() throws IOException, NumberFormatException {
        int iE = this.f14541I;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 15) {
            this.f14541I = 0;
            int[] iArr = this.f14548P;
            int i10 = this.f14546N - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f14542J;
        }
        if (iE == 16) {
            this.f14544L = new String(this.f14536D, this.f14537E, this.f14543K);
            this.f14537E += this.f14543K;
        } else if (iE == 8 || iE == 9) {
            this.f14544L = C(iE == 8 ? '\'' : '\"');
        } else if (iE == 10) {
            this.f14544L = L();
        } else if (iE != 11) {
            throw new IllegalStateException("Expected a double but was " + N() + p());
        }
        this.f14541I = 11;
        double d10 = Double.parseDouble(this.f14544L);
        if (!this.f14535C && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d10 + p());
        }
        this.f14544L = null;
        this.f14541I = 0;
        int[] iArr2 = this.f14548P;
        int i11 = this.f14546N - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public int t() throws IOException, NumberFormatException {
        int iE = this.f14541I;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 15) {
            long j10 = this.f14542J;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f14541I = 0;
                int[] iArr = this.f14548P;
                int i11 = this.f14546N - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.f14542J + p());
        }
        if (iE == 16) {
            this.f14544L = new String(this.f14536D, this.f14537E, this.f14543K);
            this.f14537E += this.f14543K;
        } else {
            if (iE != 8 && iE != 9 && iE != 10) {
                throw new IllegalStateException("Expected an int but was " + N() + p());
            }
            if (iE == 10) {
                this.f14544L = L();
            } else {
                this.f14544L = C(iE == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f14544L);
                this.f14541I = 0;
                int[] iArr2 = this.f14548P;
                int i13 = this.f14546N - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f14541I = 11;
        double d10 = Double.parseDouble(this.f14544L);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f14544L + p());
        }
        this.f14544L = null;
        this.f14541I = 0;
        int[] iArr3 = this.f14548P;
        int i15 = this.f14546N - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public String toString() {
        return getClass().getSimpleName() + p();
    }

    public long u() throws IOException, NumberFormatException {
        int iE = this.f14541I;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 15) {
            this.f14541I = 0;
            int[] iArr = this.f14548P;
            int i10 = this.f14546N - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f14542J;
        }
        if (iE == 16) {
            this.f14544L = new String(this.f14536D, this.f14537E, this.f14543K);
            this.f14537E += this.f14543K;
        } else {
            if (iE != 8 && iE != 9 && iE != 10) {
                throw new IllegalStateException("Expected a long but was " + N() + p());
            }
            if (iE == 10) {
                this.f14544L = L();
            } else {
                this.f14544L = C(iE == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f14544L);
                this.f14541I = 0;
                int[] iArr2 = this.f14548P;
                int i11 = this.f14546N - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f14541I = 11;
        double d10 = Double.parseDouble(this.f14544L);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f14544L + p());
        }
        this.f14544L = null;
        this.f14541I = 0;
        int[] iArr3 = this.f14548P;
        int i12 = this.f14546N - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public String x() throws IOException {
        String strC;
        int iE = this.f14541I;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 14) {
            strC = L();
        } else if (iE == 12) {
            strC = C('\'');
        } else {
            if (iE != 13) {
                throw new IllegalStateException("Expected a name but was " + N() + p());
            }
            strC = C('\"');
        }
        this.f14541I = 0;
        this.f14547O[this.f14546N - 1] = strC;
        return strC;
    }

    public void z() throws IOException {
        int iE = this.f14541I;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 7) {
            this.f14541I = 0;
            int[] iArr = this.f14548P;
            int i10 = this.f14546N - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + N() + p());
    }
}
