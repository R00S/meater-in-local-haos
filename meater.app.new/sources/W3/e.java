package W3;

import Cc.C0982e;
import Cc.g;
import Cc.h;
import W3.c;
import java.io.EOFException;

/* compiled from: JsonUtf8Reader.java */
/* loaded from: classes.dex */
final class e extends c {

    /* renamed from: O, reason: collision with root package name */
    private static final h f18414O = h.s("'\\");

    /* renamed from: P, reason: collision with root package name */
    private static final h f18415P = h.s("\"\\");

    /* renamed from: Q, reason: collision with root package name */
    private static final h f18416Q = h.s("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: R, reason: collision with root package name */
    private static final h f18417R = h.s("\n\r");

    /* renamed from: S, reason: collision with root package name */
    private static final h f18418S = h.s("*/");

    /* renamed from: I, reason: collision with root package name */
    private final g f18419I;

    /* renamed from: J, reason: collision with root package name */
    private final C0982e f18420J;

    /* renamed from: K, reason: collision with root package name */
    private int f18421K = 0;

    /* renamed from: L, reason: collision with root package name */
    private long f18422L;

    /* renamed from: M, reason: collision with root package name */
    private int f18423M;

    /* renamed from: N, reason: collision with root package name */
    private String f18424N;

    e(g gVar) {
        if (gVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f18419I = gVar;
        this.f18420J = gVar.getBufferField();
        p(6);
    }

    private int C(String str, c.a aVar) {
        int length = aVar.f18401a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f18401a[i10])) {
                this.f18421K = 0;
                this.f18397D[this.f18395B - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    private boolean K(int i10) throws b {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        y();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r6.f18420J.w(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r2 != 47) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r6.f18419I.Q0(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        y();
        r3 = r6.f18420J.m(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r3 == 42) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r6.f18420J.readByte();
        r6.f18420J.readByte();
        f0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r6.f18420J.readByte();
        r6.f18420J.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (e0() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        throw x("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        y();
        f0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int L(boolean r7) throws W3.b, java.io.EOFException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            Cc.g r2 = r6.f18419I
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.Q0(r4)
            if (r2 == 0) goto L80
            Cc.e r2 = r6.f18420J
            long r4 = (long) r1
            byte r2 = r2.m(r4)
            r4 = 10
            if (r2 == r4) goto L7e
            r4 = 32
            if (r2 == r4) goto L7e
            r4 = 13
            if (r2 == r4) goto L7e
            r4 = 9
            if (r2 != r4) goto L25
            goto L7e
        L25:
            Cc.e r3 = r6.f18420J
            long r4 = (long) r1
            r3.w(r4)
            r1 = 47
            if (r2 != r1) goto L72
            Cc.g r3 = r6.f18419I
            r4 = 2
            boolean r3 = r3.Q0(r4)
            if (r3 != 0) goto L3a
            return r2
        L3a:
            r6.y()
            Cc.e r3 = r6.f18420J
            r4 = 1
            byte r3 = r3.m(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            return r2
        L4c:
            Cc.e r1 = r6.f18420J
            r1.readByte()
            Cc.e r1 = r6.f18420J
            r1.readByte()
            r6.f0()
            goto L1
        L5a:
            Cc.e r1 = r6.f18420J
            r1.readByte()
            Cc.e r1 = r6.f18420J
            r1.readByte()
            boolean r1 = r6.e0()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "Unterminated comment"
            W3.b r7 = r6.x(r7)
            throw r7
        L72:
            r1 = 35
            if (r2 != r1) goto L7d
            r6.y()
            r6.f0()
            goto L1
        L7d:
            return r2
        L7e:
            r1 = r3
            goto L2
        L80:
            if (r7 != 0) goto L84
            r7 = -1
            return r7
        L84:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.e.L(boolean):int");
    }

    private String N(h hVar) throws b, EOFException {
        StringBuilder sb2 = null;
        while (true) {
            long jJ1 = this.f18419I.j1(hVar);
            if (jJ1 == -1) {
                throw x("Unterminated string");
            }
            if (this.f18420J.m(jJ1) != 92) {
                if (sb2 == null) {
                    String strD = this.f18420J.D(jJ1);
                    this.f18420J.readByte();
                    return strD;
                }
                sb2.append(this.f18420J.D(jJ1));
                this.f18420J.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f18420J.D(jJ1));
            this.f18420J.readByte();
            sb2.append(X());
        }
    }

    private String P() {
        long jJ1 = this.f18419I.j1(f18416Q);
        return jJ1 != -1 ? this.f18420J.D(jJ1) : this.f18420J.Q();
    }

    private int Q() throws EOFException {
        String str;
        String str2;
        int i10;
        byte bM = this.f18420J.m(0L);
        if (bM == 116 || bM == 84) {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (bM == 102 || bM == 70) {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (bM != 110 && bM != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        int i11 = 1;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (!this.f18419I.Q0(i12)) {
                return 0;
            }
            byte bM2 = this.f18420J.m(i11);
            if (bM2 != str.charAt(i11) && bM2 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f18419I.Q0(length + 1) && K(this.f18420J.m(length))) {
            return 0;
        }
        this.f18420J.w(length);
        this.f18421K = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        if (K(r11) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0083, code lost:
    
        if (r6 != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0085, code lost:
    
        if (r7 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
    
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
    
        if (r8 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        if (r10 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
    
        if (r10 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
    
        r16.f18422L = r8;
        r16.f18420J.w(r5);
        r16.f18421K = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a5, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
    
        if (r6 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        if (r6 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ac, code lost:
    
        if (r6 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00af, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
    
        r16.f18423M = r5;
        r16.f18421K = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b6, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int W() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.e.W():int");
    }

    private char X() throws b, EOFException {
        int i10;
        if (!this.f18419I.Q0(1L)) {
            throw x("Unterminated escape sequence");
        }
        byte b10 = this.f18420J.readByte();
        if (b10 == 10 || b10 == 34 || b10 == 39 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return '\b';
        }
        if (b10 == 102) {
            return '\f';
        }
        if (b10 == 110) {
            return '\n';
        }
        if (b10 == 114) {
            return '\r';
        }
        if (b10 == 116) {
            return '\t';
        }
        if (b10 != 117) {
            if (this.f18399F) {
                return (char) b10;
            }
            throw x("Invalid escape sequence: \\" + ((char) b10));
        }
        if (!this.f18419I.Q0(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + h());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bM = this.f18420J.m(i11);
            char c11 = (char) (c10 << 4);
            if (bM >= 48 && bM <= 57) {
                i10 = bM - 48;
            } else if (bM >= 97 && bM <= 102) {
                i10 = bM - 87;
            } else {
                if (bM < 65 || bM > 70) {
                    throw x("\\u" + this.f18420J.D(4L));
                }
                i10 = bM - 55;
            }
            c10 = (char) (c11 + i10);
        }
        this.f18420J.w(4L);
        return c10;
    }

    private void a0(h hVar) throws b, EOFException {
        while (true) {
            long jJ1 = this.f18419I.j1(hVar);
            if (jJ1 == -1) {
                throw x("Unterminated string");
            }
            if (this.f18420J.m(jJ1) != 92) {
                this.f18420J.w(jJ1 + 1);
                return;
            } else {
                this.f18420J.w(jJ1 + 1);
                X();
            }
        }
    }

    private boolean e0() throws EOFException {
        long jR0 = this.f18419I.R0(f18418S);
        boolean z10 = jR0 != -1;
        C0982e c0982e = this.f18420J;
        c0982e.w(z10 ? jR0 + r1.J() : c0982e.getSize());
        return z10;
    }

    private void f0() throws EOFException {
        long jJ1 = this.f18419I.j1(f18417R);
        C0982e c0982e = this.f18420J;
        c0982e.w(jJ1 != -1 ? jJ1 + 1 : c0982e.getSize());
    }

    private void h0() throws EOFException {
        long jJ1 = this.f18419I.j1(f18416Q);
        C0982e c0982e = this.f18420J;
        if (jJ1 == -1) {
            jJ1 = c0982e.getSize();
        }
        c0982e.w(jJ1);
    }

    private void y() throws b {
        if (!this.f18399F) {
            throw x("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int z() throws b, EOFException {
        int[] iArr = this.f18396C;
        int i10 = this.f18395B;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iL = L(true);
            this.f18420J.readByte();
            if (iL != 44) {
                if (iL != 59) {
                    if (iL != 93) {
                        throw x("Unterminated array");
                    }
                    this.f18421K = 4;
                    return 4;
                }
                y();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int iL2 = L(true);
                    this.f18420J.readByte();
                    if (iL2 != 44) {
                        if (iL2 != 59) {
                            if (iL2 != 125) {
                                throw x("Unterminated object");
                            }
                            this.f18421K = 2;
                            return 2;
                        }
                        y();
                    }
                }
                int iL3 = L(true);
                if (iL3 == 34) {
                    this.f18420J.readByte();
                    this.f18421K = 13;
                    return 13;
                }
                if (iL3 == 39) {
                    this.f18420J.readByte();
                    y();
                    this.f18421K = 12;
                    return 12;
                }
                if (iL3 != 125) {
                    y();
                    if (!K((char) iL3)) {
                        throw x("Expected name");
                    }
                    this.f18421K = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw x("Expected name");
                }
                this.f18420J.readByte();
                this.f18421K = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iL4 = L(true);
                this.f18420J.readByte();
                if (iL4 != 58) {
                    if (iL4 != 61) {
                        throw x("Expected ':'");
                    }
                    y();
                    if (this.f18419I.Q0(1L) && this.f18420J.m(0L) == 62) {
                        this.f18420J.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (L(false) == -1) {
                    this.f18421K = 18;
                    return 18;
                }
                y();
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iL5 = L(true);
        if (iL5 == 34) {
            this.f18420J.readByte();
            this.f18421K = 9;
            return 9;
        }
        if (iL5 == 39) {
            y();
            this.f18420J.readByte();
            this.f18421K = 8;
            return 8;
        }
        if (iL5 != 44 && iL5 != 59) {
            if (iL5 == 91) {
                this.f18420J.readByte();
                this.f18421K = 3;
                return 3;
            }
            if (iL5 != 93) {
                if (iL5 == 123) {
                    this.f18420J.readByte();
                    this.f18421K = 1;
                    return 1;
                }
                int iQ = Q();
                if (iQ != 0) {
                    return iQ;
                }
                int iW = W();
                if (iW != 0) {
                    return iW;
                }
                if (!K(this.f18420J.m(0L))) {
                    throw x("Expected value");
                }
                y();
                this.f18421K = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f18420J.readByte();
                this.f18421K = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw x("Unexpected value");
        }
        y();
        this.f18421K = 7;
        return 7;
    }

    @Override // W3.c
    public void b() throws b, EOFException {
        int iZ = this.f18421K;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 3) {
            p(1);
            this.f18398E[this.f18395B - 1] = 0;
            this.f18421K = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + o() + " at path " + h());
        }
    }

    @Override // W3.c
    public void c() throws b, EOFException {
        int iZ = this.f18421K;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 1) {
            p(3);
            this.f18421K = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + o() + " at path " + h());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f18421K = 0;
        this.f18396C[0] = 8;
        this.f18395B = 1;
        this.f18420J.b();
        this.f18419I.close();
    }

    @Override // W3.c
    public void d() throws b, EOFException {
        int iZ = this.f18421K;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ != 4) {
            throw new a("Expected END_ARRAY but was " + o() + " at path " + h());
        }
        int i10 = this.f18395B;
        this.f18395B = i10 - 1;
        int[] iArr = this.f18398E;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f18421K = 0;
    }

    @Override // W3.c
    public void e() throws b, EOFException {
        int iZ = this.f18421K;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ != 2) {
            throw new a("Expected END_OBJECT but was " + o() + " at path " + h());
        }
        int i10 = this.f18395B;
        int i11 = i10 - 1;
        this.f18395B = i11;
        this.f18397D[i11] = null;
        int[] iArr = this.f18398E;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f18421K = 0;
    }

    @Override // W3.c
    public boolean f() throws b, EOFException {
        int iZ = this.f18421K;
        if (iZ == 0) {
            iZ = z();
        }
        return (iZ == 2 || iZ == 4 || iZ == 18) ? false : true;
    }

    @Override // W3.c
    public boolean g() throws b, EOFException {
        int iZ = this.f18421K;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 5) {
            this.f18421K = 0;
            int[] iArr = this.f18398E;
            int i10 = this.f18395B - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iZ == 6) {
            this.f18421K = 0;
            int[] iArr2 = this.f18398E;
            int i11 = this.f18395B - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + o() + " at path " + h());
    }

    @Override // W3.c
    public double j() throws b, NumberFormatException, EOFException {
        int iZ = this.f18421K;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 16) {
            this.f18421K = 0;
            int[] iArr = this.f18398E;
            int i10 = this.f18395B - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f18422L;
        }
        if (iZ == 17) {
            this.f18424N = this.f18420J.D(this.f18423M);
        } else if (iZ == 9) {
            this.f18424N = N(f18415P);
        } else if (iZ == 8) {
            this.f18424N = N(f18414O);
        } else if (iZ == 10) {
            this.f18424N = P();
        } else if (iZ != 11) {
            throw new a("Expected a double but was " + o() + " at path " + h());
        }
        this.f18421K = 11;
        try {
            double d10 = Double.parseDouble(this.f18424N);
            if (this.f18399F || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
                this.f18424N = null;
                this.f18421K = 0;
                int[] iArr2 = this.f18398E;
                int i11 = this.f18395B - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return d10;
            }
            throw new b("JSON forbids NaN and infinities: " + d10 + " at path " + h());
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f18424N + " at path " + h());
        }
    }

    @Override // W3.c
    public int k() throws b, NumberFormatException, EOFException {
        int iZ = this.f18421K;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 16) {
            long j10 = this.f18422L;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f18421K = 0;
                int[] iArr = this.f18398E;
                int i11 = this.f18395B - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new a("Expected an int but was " + this.f18422L + " at path " + h());
        }
        if (iZ == 17) {
            this.f18424N = this.f18420J.D(this.f18423M);
        } else if (iZ == 9 || iZ == 8) {
            String strN = iZ == 9 ? N(f18415P) : N(f18414O);
            this.f18424N = strN;
            try {
                int i12 = Integer.parseInt(strN);
                this.f18421K = 0;
                int[] iArr2 = this.f18398E;
                int i13 = this.f18395B - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iZ != 11) {
            throw new a("Expected an int but was " + o() + " at path " + h());
        }
        this.f18421K = 11;
        try {
            double d10 = Double.parseDouble(this.f18424N);
            int i14 = (int) d10;
            if (i14 == d10) {
                this.f18424N = null;
                this.f18421K = 0;
                int[] iArr3 = this.f18398E;
                int i15 = this.f18395B - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new a("Expected an int but was " + this.f18424N + " at path " + h());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f18424N + " at path " + h());
        }
    }

    @Override // W3.c
    public String l() throws b, EOFException {
        String strN;
        int iZ = this.f18421K;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 14) {
            strN = P();
        } else if (iZ == 13) {
            strN = N(f18415P);
        } else if (iZ == 12) {
            strN = N(f18414O);
        } else {
            if (iZ != 15) {
                throw new a("Expected a name but was " + o() + " at path " + h());
            }
            strN = this.f18424N;
        }
        this.f18421K = 0;
        this.f18397D[this.f18395B - 1] = strN;
        return strN;
    }

    @Override // W3.c
    public String m() throws b, EOFException {
        String strD;
        int iZ = this.f18421K;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 10) {
            strD = P();
        } else if (iZ == 9) {
            strD = N(f18415P);
        } else if (iZ == 8) {
            strD = N(f18414O);
        } else if (iZ == 11) {
            strD = this.f18424N;
            this.f18424N = null;
        } else if (iZ == 16) {
            strD = Long.toString(this.f18422L);
        } else {
            if (iZ != 17) {
                throw new a("Expected a string but was " + o() + " at path " + h());
            }
            strD = this.f18420J.D(this.f18423M);
        }
        this.f18421K = 0;
        int[] iArr = this.f18398E;
        int i10 = this.f18395B - 1;
        iArr[i10] = iArr[i10] + 1;
        return strD;
    }

    @Override // W3.c
    public c.b o() throws b, EOFException {
        int iZ = this.f18421K;
        if (iZ == 0) {
            iZ = z();
        }
        switch (iZ) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return c.b.STRING;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // W3.c
    public int q(c.a aVar) throws b, EOFException {
        int iZ = this.f18421K;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ < 12 || iZ > 15) {
            return -1;
        }
        if (iZ == 15) {
            return C(this.f18424N, aVar);
        }
        int iY1 = this.f18419I.y1(aVar.f18402b);
        if (iY1 != -1) {
            this.f18421K = 0;
            this.f18397D[this.f18395B - 1] = aVar.f18401a[iY1];
            return iY1;
        }
        String str = this.f18397D[this.f18395B - 1];
        String strL = l();
        int iC = C(strL, aVar);
        if (iC == -1) {
            this.f18421K = 15;
            this.f18424N = strL;
            this.f18397D[this.f18395B - 1] = str;
        }
        return iC;
    }

    @Override // W3.c
    public void s() throws b, EOFException {
        if (this.f18400G) {
            throw new a("Cannot skip unexpected " + o() + " at " + h());
        }
        int iZ = this.f18421K;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 14) {
            h0();
        } else if (iZ == 13) {
            a0(f18415P);
        } else if (iZ == 12) {
            a0(f18414O);
        } else if (iZ != 15) {
            throw new a("Expected a name but was " + o() + " at path " + h());
        }
        this.f18421K = 0;
        this.f18397D[this.f18395B - 1] = "null";
    }

    @Override // W3.c
    public void t() throws b, EOFException {
        if (this.f18400G) {
            throw new a("Cannot skip unexpected " + o() + " at " + h());
        }
        int i10 = 0;
        do {
            int iZ = this.f18421K;
            if (iZ == 0) {
                iZ = z();
            }
            if (iZ == 3) {
                p(1);
            } else if (iZ == 1) {
                p(3);
            } else {
                if (iZ == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new a("Expected a value but was " + o() + " at path " + h());
                    }
                    this.f18395B--;
                } else if (iZ == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new a("Expected a value but was " + o() + " at path " + h());
                    }
                    this.f18395B--;
                } else if (iZ == 14 || iZ == 10) {
                    h0();
                } else if (iZ == 9 || iZ == 13) {
                    a0(f18415P);
                } else if (iZ == 8 || iZ == 12) {
                    a0(f18414O);
                } else if (iZ == 17) {
                    this.f18420J.w(this.f18423M);
                } else if (iZ == 18) {
                    throw new a("Expected a value but was " + o() + " at path " + h());
                }
                this.f18421K = 0;
            }
            i10++;
            this.f18421K = 0;
        } while (i10 != 0);
        int[] iArr = this.f18398E;
        int i11 = this.f18395B;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f18397D[i11 - 1] = "null";
    }

    public String toString() {
        return "JsonReader(" + this.f18419I + ")";
    }
}
