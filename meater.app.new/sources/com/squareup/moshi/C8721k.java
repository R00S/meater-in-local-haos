package com.squareup.moshi;

import cm.aptoide.p092pt.account.AdultContentAnalytics;
import com.squareup.moshi.AbstractC8719i;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import p353j.C9703f;
import p353j.C9710i;
import p353j.InterfaceC9709h;

/* compiled from: JsonUtf8Reader.java */
/* renamed from: com.squareup.moshi.k */
/* loaded from: classes2.dex */
final class C8721k extends AbstractC8719i {

    /* renamed from: l */
    private static final C9710i f33121l = C9710i.m32085v("'\\");

    /* renamed from: m */
    private static final C9710i f33122m = C9710i.m32085v("\"\\");

    /* renamed from: n */
    private static final C9710i f33123n = C9710i.m32085v("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: o */
    private static final C9710i f33124o = C9710i.m32085v("\n\r");

    /* renamed from: p */
    private static final C9710i f33125p = C9710i.m32085v("*/");

    /* renamed from: q */
    private final InterfaceC9709h f33126q;

    /* renamed from: r */
    private final C9703f f33127r;

    /* renamed from: s */
    private int f33128s = 0;

    /* renamed from: t */
    private long f33129t;

    /* renamed from: u */
    private int f33130u;

    /* renamed from: v */
    private String f33131v;

    C8721k(InterfaceC9709h interfaceC9709h) {
        if (interfaceC9709h == null) {
            throw new NullPointerException("source == null");
        }
        this.f33126q = interfaceC9709h;
        this.f33127r = interfaceC9709h.mo32042i();
        m27701D(6);
    }

    /* renamed from: E0 */
    private boolean m27727E0() throws IOException {
        long jMo32016P = this.f33126q.mo32016P(f33125p);
        boolean z = jMo32016P != -1;
        C9703f c9703f = this.f33127r;
        c9703f.skip(z ? jMo32016P + r1.m32093P() : c9703f.size());
        return z;
    }

    /* renamed from: F0 */
    private void m27728F0() throws IOException {
        long jMo32031b0 = this.f33126q.mo32031b0(f33124o);
        C9703f c9703f = this.f33127r;
        c9703f.skip(jMo32031b0 != -1 ? jMo32031b0 + 1 : c9703f.size());
    }

    /* renamed from: G0 */
    private void m27729G0() throws IOException {
        long jMo32031b0 = this.f33126q.mo32031b0(f33123n);
        C9703f c9703f = this.f33127r;
        if (jMo32031b0 == -1) {
            jMo32031b0 = c9703f.size();
        }
        c9703f.skip(jMo32031b0);
    }

    /* renamed from: Y */
    private void m27730Y() throws IOException {
        if (!this.f33106j) {
            throw m27708T("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: Z */
    private int m27731Z() throws IOException {
        int[] iArr = this.f33103g;
        int i2 = this.f33102f;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int iM27735m0 = m27735m0(true);
            this.f33127r.readByte();
            if (iM27735m0 != 44) {
                if (iM27735m0 != 59) {
                    if (iM27735m0 != 93) {
                        throw m27708T("Unterminated array");
                    }
                    this.f33128s = 4;
                    return 4;
                }
                m27730Y();
            }
        } else {
            if (i3 == 3 || i3 == 5) {
                iArr[i2 - 1] = 4;
                if (i3 == 5) {
                    int iM27735m02 = m27735m0(true);
                    this.f33127r.readByte();
                    if (iM27735m02 != 44) {
                        if (iM27735m02 != 59) {
                            if (iM27735m02 != 125) {
                                throw m27708T("Unterminated object");
                            }
                            this.f33128s = 2;
                            return 2;
                        }
                        m27730Y();
                    }
                }
                int iM27735m03 = m27735m0(true);
                if (iM27735m03 == 34) {
                    this.f33127r.readByte();
                    this.f33128s = 13;
                    return 13;
                }
                if (iM27735m03 == 39) {
                    this.f33127r.readByte();
                    m27730Y();
                    this.f33128s = 12;
                    return 12;
                }
                if (iM27735m03 != 125) {
                    m27730Y();
                    if (!m27734f0((char) iM27735m03)) {
                        throw m27708T("Expected name");
                    }
                    this.f33128s = 14;
                    return 14;
                }
                if (i3 == 5) {
                    throw m27708T("Expected name");
                }
                this.f33127r.readByte();
                this.f33128s = 2;
                return 2;
            }
            if (i3 == 4) {
                iArr[i2 - 1] = 5;
                int iM27735m04 = m27735m0(true);
                this.f33127r.readByte();
                if (iM27735m04 != 58) {
                    if (iM27735m04 != 61) {
                        throw m27708T("Expected ':'");
                    }
                    m27730Y();
                    if (this.f33126q.request(1L) && this.f33127r.m32047m(0L) == 62) {
                        this.f33127r.readByte();
                    }
                }
            } else if (i3 == 6) {
                iArr[i2 - 1] = 7;
            } else if (i3 == 7) {
                if (m27735m0(false) == -1) {
                    this.f33128s = 18;
                    return 18;
                }
                m27730Y();
            } else {
                if (i3 == 9) {
                    throw null;
                }
                if (i3 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iM27735m05 = m27735m0(true);
        if (iM27735m05 == 34) {
            this.f33127r.readByte();
            this.f33128s = 9;
            return 9;
        }
        if (iM27735m05 == 39) {
            m27730Y();
            this.f33127r.readByte();
            this.f33128s = 8;
            return 8;
        }
        if (iM27735m05 != 44 && iM27735m05 != 59) {
            if (iM27735m05 == 91) {
                this.f33127r.readByte();
                this.f33128s = 3;
                return 3;
            }
            if (iM27735m05 != 93) {
                if (iM27735m05 == 123) {
                    this.f33127r.readByte();
                    this.f33128s = 1;
                    return 1;
                }
                int iM27738q0 = m27738q0();
                if (iM27738q0 != 0) {
                    return iM27738q0;
                }
                int iM27739t0 = m27739t0();
                if (iM27739t0 != 0) {
                    return iM27739t0;
                }
                if (!m27734f0(this.f33127r.m32047m(0L))) {
                    throw m27708T("Expected value");
                }
                m27730Y();
                this.f33128s = 10;
                return 10;
            }
            if (i3 == 1) {
                this.f33127r.readByte();
                this.f33128s = 4;
                return 4;
            }
        }
        if (i3 != 1 && i3 != 2) {
            throw m27708T("Unexpected value");
        }
        m27730Y();
        this.f33128s = 7;
        return 7;
    }

    /* renamed from: a0 */
    private int m27732a0(String str, AbstractC8719i.a aVar) {
        int length = aVar.f33108a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(aVar.f33108a[i2])) {
                this.f33128s = 0;
                this.f33104h[this.f33102f - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: e0 */
    private int m27733e0(String str, AbstractC8719i.a aVar) {
        int length = aVar.f33108a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(aVar.f33108a[i2])) {
                this.f33128s = 0;
                int[] iArr = this.f33105i;
                int i3 = this.f33102f - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: f0 */
    private boolean m27734f0(int i2) throws IOException {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (i2 != 47 && i2 != 61) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
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
        m27730Y();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r6.f33127r.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r1 != 47) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r6.f33126q.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        m27730Y();
        r3 = r6.f33127r.m32047m(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r3 == 42) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        r6.f33127r.readByte();
        r6.f33127r.readByte();
        m27728F0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        r6.f33127r.readByte();
        r6.f33127r.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (m27727E0() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        throw m27708T("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (r1 != 35) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        m27730Y();
        m27728F0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        return r1;
     */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m27735m0(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            j.h r2 = r6.f33126q
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L82
            j.f r2 = r6.f33127r
            long r4 = (long) r1
            byte r1 = r2.m32047m(r4)
            r2 = 10
            if (r1 == r2) goto L80
            r2 = 32
            if (r1 == r2) goto L80
            r2 = 13
            if (r1 == r2) goto L80
            r2 = 9
            if (r1 != r2) goto L25
            goto L80
        L25:
            j.f r2 = r6.f33127r
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L74
            j.h r3 = r6.f33126q
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3c
            return r1
        L3c:
            r6.m27730Y()
            j.f r3 = r6.f33127r
            r4 = 1
            byte r3 = r3.m32047m(r4)
            r4 = 42
            if (r3 == r4) goto L5c
            if (r3 == r2) goto L4e
            return r1
        L4e:
            j.f r1 = r6.f33127r
            r1.readByte()
            j.f r1 = r6.f33127r
            r1.readByte()
            r6.m27728F0()
            goto L1
        L5c:
            j.f r1 = r6.f33127r
            r1.readByte()
            j.f r1 = r6.f33127r
            r1.readByte()
            boolean r1 = r6.m27727E0()
            if (r1 == 0) goto L6d
            goto L1
        L6d:
            java.lang.String r7 = "Unterminated comment"
            com.squareup.moshi.JsonEncodingException r7 = r6.m27708T(r7)
            throw r7
        L74:
            r2 = 35
            if (r1 != r2) goto L7f
            r6.m27730Y()
            r6.m27728F0()
            goto L1
        L7f:
            return r1
        L80:
            r1 = r3
            goto L2
        L82:
            if (r7 != 0) goto L86
            r7 = -1
            return r7
        L86:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            goto L8f
        L8e:
            throw r7
        L8f:
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C8721k.m27735m0(boolean):int");
    }

    /* renamed from: n0 */
    private String m27736n0(C9710i c9710i) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jMo32031b0 = this.f33126q.mo32031b0(c9710i);
            if (jMo32031b0 == -1) {
                throw m27708T("Unterminated string");
            }
            if (this.f33127r.m32047m(jMo32031b0) != 92) {
                if (sb == null) {
                    String strM32027Z = this.f33127r.m32027Z(jMo32031b0);
                    this.f33127r.readByte();
                    return strM32027Z;
                }
                sb.append(this.f33127r.m32027Z(jMo32031b0));
                this.f33127r.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.f33127r.m32027Z(jMo32031b0));
            this.f33127r.readByte();
            sb.append(m27740x0());
        }
    }

    /* renamed from: p0 */
    private String m27737p0() throws IOException {
        long jMo32031b0 = this.f33126q.mo32031b0(f33123n);
        return jMo32031b0 != -1 ? this.f33127r.m32027Z(jMo32031b0) : this.f33127r.m32021T();
    }

    /* renamed from: q0 */
    private int m27738q0() throws IOException {
        int i2;
        String str;
        String str2;
        byte bM32047m = this.f33127r.m32047m(0L);
        if (bM32047m == 116 || bM32047m == 84) {
            i2 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (bM32047m == 102 || bM32047m == 70) {
            i2 = 6;
            str = AdultContentAnalytics.UNLOCK;
            str2 = "FALSE";
        } else {
            if (bM32047m != 110 && bM32047m != 78) {
                return 0;
            }
            i2 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        int i3 = 1;
        while (i3 < length) {
            int i4 = i3 + 1;
            if (!this.f33126q.request(i4)) {
                return 0;
            }
            byte bM32047m2 = this.f33127r.m32047m(i3);
            if (bM32047m2 != str.charAt(i3) && bM32047m2 != str2.charAt(i3)) {
                return 0;
            }
            i3 = i4;
        }
        if (this.f33126q.request(length + 1) && m27734f0(this.f33127r.m32047m(length))) {
            return 0;
        }
        this.f33127r.skip(length);
        this.f33128s = i2;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0089, code lost:
    
        if (m27734f0(r11) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
    
        if (r6 != 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
    
        if (r7 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0093, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0095, code lost:
    
        if (r10 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
    
        if (r8 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
    
        if (r10 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
    
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a0, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a1, code lost:
    
        r16.f33129t = r8;
        r16.f33127r.skip(r5);
        r16.f33128s = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ad, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ae, code lost:
    
        if (r6 == 2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b1, code lost:
    
        if (r6 == 4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b4, code lost:
    
        if (r6 != 7) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b9, code lost:
    
        r16.f33130u = r5;
        r16.f33128s = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bf, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c0, code lost:
    
        return 0;
     */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m27739t0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C8721k.m27739t0():int");
    }

    /* renamed from: x0 */
    private char m27740x0() throws IOException {
        int i2;
        int i3;
        if (!this.f33126q.request(1L)) {
            throw m27708T("Unterminated escape sequence");
        }
        byte b2 = this.f33127r.readByte();
        if (b2 == 10 || b2 == 34 || b2 == 39 || b2 == 47 || b2 == 92) {
            return (char) b2;
        }
        if (b2 == 98) {
            return '\b';
        }
        if (b2 == 102) {
            return '\f';
        }
        if (b2 == 110) {
            return '\n';
        }
        if (b2 == 114) {
            return '\r';
        }
        if (b2 == 116) {
            return '\t';
        }
        if (b2 != 117) {
            if (this.f33106j) {
                return (char) b2;
            }
            throw m27708T("Invalid escape sequence: \\" + ((char) b2));
        }
        if (!this.f33126q.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + m27716g());
        }
        char c2 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            byte bM32047m = this.f33127r.m32047m(i4);
            char c3 = (char) (c2 << 4);
            if (bM32047m < 48 || bM32047m > 57) {
                if (bM32047m >= 97 && bM32047m <= 102) {
                    i2 = bM32047m - 97;
                } else {
                    if (bM32047m < 65 || bM32047m > 70) {
                        throw m27708T("\\u" + this.f33127r.m32027Z(4L));
                    }
                    i2 = bM32047m - 65;
                }
                i3 = i2 + 10;
            } else {
                i3 = bM32047m - 48;
            }
            c2 = (char) (c3 + i3);
        }
        this.f33127r.skip(4L);
        return c2;
    }

    /* renamed from: y0 */
    private void m27741y0(C9710i c9710i) throws IOException {
        while (true) {
            long jMo32031b0 = this.f33126q.mo32031b0(c9710i);
            if (jMo32031b0 == -1) {
                throw m27708T("Unterminated string");
            }
            if (this.f33127r.m32047m(jMo32031b0) != 92) {
                this.f33127r.skip(jMo32031b0 + 1);
                return;
            } else {
                this.f33127r.skip(jMo32031b0 + 1);
                m27740x0();
            }
        }
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: A */
    public AbstractC8719i.b mo27699A() throws IOException {
        int iM27731Z = this.f33128s;
        if (iM27731Z == 0) {
            iM27731Z = m27731Z();
        }
        switch (iM27731Z) {
            case 1:
                return AbstractC8719i.b.BEGIN_OBJECT;
            case 2:
                return AbstractC8719i.b.END_OBJECT;
            case 3:
                return AbstractC8719i.b.BEGIN_ARRAY;
            case 4:
                return AbstractC8719i.b.END_ARRAY;
            case 5:
            case 6:
                return AbstractC8719i.b.BOOLEAN;
            case 7:
                return AbstractC8719i.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return AbstractC8719i.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return AbstractC8719i.b.NAME;
            case 16:
            case 17:
                return AbstractC8719i.b.NUMBER;
            case 18:
                return AbstractC8719i.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: B */
    public void mo27700B() throws IOException {
        if (mo27715f()) {
            this.f33131v = m27742i0();
            this.f33128s = 11;
        }
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: H */
    public int mo27702H(AbstractC8719i.a aVar) throws IOException {
        int iM27731Z = this.f33128s;
        if (iM27731Z == 0) {
            iM27731Z = m27731Z();
        }
        if (iM27731Z < 12 || iM27731Z > 15) {
            return -1;
        }
        if (iM27731Z == 15) {
            return m27732a0(this.f33131v, aVar);
        }
        int iMo32053p1 = this.f33126q.mo32053p1(aVar.f33109b);
        if (iMo32053p1 != -1) {
            this.f33128s = 0;
            this.f33104h[this.f33102f - 1] = aVar.f33108a[iMo32053p1];
            return iMo32053p1;
        }
        String str = this.f33104h[this.f33102f - 1];
        String strM27742i0 = m27742i0();
        int iM27732a0 = m27732a0(strM27742i0, aVar);
        if (iM27732a0 == -1) {
            this.f33128s = 15;
            this.f33131v = strM27742i0;
            this.f33104h[this.f33102f - 1] = str;
        }
        return iM27732a0;
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: I */
    public int mo27703I(AbstractC8719i.a aVar) throws IOException {
        int iM27731Z = this.f33128s;
        if (iM27731Z == 0) {
            iM27731Z = m27731Z();
        }
        if (iM27731Z < 8 || iM27731Z > 11) {
            return -1;
        }
        if (iM27731Z == 11) {
            return m27733e0(this.f33131v, aVar);
        }
        int iMo32053p1 = this.f33126q.mo32053p1(aVar.f33109b);
        if (iMo32053p1 != -1) {
            this.f33128s = 0;
            int[] iArr = this.f33105i;
            int i2 = this.f33102f - 1;
            iArr[i2] = iArr[i2] + 1;
            return iMo32053p1;
        }
        String strMo27723y = mo27723y();
        int iM27733e0 = m27733e0(strMo27723y, aVar);
        if (iM27733e0 == -1) {
            this.f33128s = 11;
            this.f33131v = strMo27723y;
            this.f33105i[this.f33102f - 1] = r0[r1] - 1;
        }
        return iM27733e0;
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: N */
    public void mo27706N() throws IOException {
        if (this.f33107k) {
            AbstractC8719i.b bVarMo27699A = mo27699A();
            m27742i0();
            throw new JsonDataException("Cannot skip unexpected " + bVarMo27699A + " at " + m27716g());
        }
        int iM27731Z = this.f33128s;
        if (iM27731Z == 0) {
            iM27731Z = m27731Z();
        }
        if (iM27731Z == 14) {
            m27729G0();
        } else if (iM27731Z == 13) {
            m27741y0(f33122m);
        } else if (iM27731Z == 12) {
            m27741y0(f33121l);
        } else if (iM27731Z != 15) {
            throw new JsonDataException("Expected a name but was " + mo27699A() + " at path " + m27716g());
        }
        this.f33128s = 0;
        this.f33104h[this.f33102f - 1] = "null";
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: Q */
    public void mo27707Q() throws IOException {
        if (this.f33107k) {
            throw new JsonDataException("Cannot skip unexpected " + mo27699A() + " at " + m27716g());
        }
        int i2 = 0;
        do {
            int iM27731Z = this.f33128s;
            if (iM27731Z == 0) {
                iM27731Z = m27731Z();
            }
            if (iM27731Z == 3) {
                m27701D(1);
            } else if (iM27731Z == 1) {
                m27701D(3);
            } else {
                if (iM27731Z == 4) {
                    i2--;
                    if (i2 < 0) {
                        throw new JsonDataException("Expected a value but was " + mo27699A() + " at path " + m27716g());
                    }
                    this.f33102f--;
                } else if (iM27731Z == 2) {
                    i2--;
                    if (i2 < 0) {
                        throw new JsonDataException("Expected a value but was " + mo27699A() + " at path " + m27716g());
                    }
                    this.f33102f--;
                } else if (iM27731Z == 14 || iM27731Z == 10) {
                    m27729G0();
                } else if (iM27731Z == 9 || iM27731Z == 13) {
                    m27741y0(f33122m);
                } else if (iM27731Z == 8 || iM27731Z == 12) {
                    m27741y0(f33121l);
                } else if (iM27731Z == 17) {
                    this.f33127r.skip(this.f33130u);
                } else if (iM27731Z == 18) {
                    throw new JsonDataException("Expected a value but was " + mo27699A() + " at path " + m27716g());
                }
                this.f33128s = 0;
            }
            i2++;
            this.f33128s = 0;
        } while (i2 != 0);
        int[] iArr = this.f33105i;
        int i3 = this.f33102f;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f33104h[i3 - 1] = "null";
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: a */
    public void mo27710a() throws IOException {
        int iM27731Z = this.f33128s;
        if (iM27731Z == 0) {
            iM27731Z = m27731Z();
        }
        if (iM27731Z == 3) {
            m27701D(1);
            this.f33105i[this.f33102f - 1] = 0;
            this.f33128s = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + mo27699A() + " at path " + m27716g());
        }
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: b */
    public void mo27711b() throws IOException {
        int iM27731Z = this.f33128s;
        if (iM27731Z == 0) {
            iM27731Z = m27731Z();
        }
        if (iM27731Z == 1) {
            m27701D(3);
            this.f33128s = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + mo27699A() + " at path " + m27716g());
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: c */
    public void mo27712c() throws IOException {
        int iM27731Z = this.f33128s;
        if (iM27731Z == 0) {
            iM27731Z = m27731Z();
        }
        if (iM27731Z != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + mo27699A() + " at path " + m27716g());
        }
        int i2 = this.f33102f - 1;
        this.f33102f = i2;
        int[] iArr = this.f33105i;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f33128s = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f33128s = 0;
        this.f33103g[0] = 8;
        this.f33102f = 1;
        this.f33127r.m32030b();
        this.f33126q.close();
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: d */
    public void mo27713d() throws IOException {
        int iM27731Z = this.f33128s;
        if (iM27731Z == 0) {
            iM27731Z = m27731Z();
        }
        if (iM27731Z != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + mo27699A() + " at path " + m27716g());
        }
        int i2 = this.f33102f - 1;
        this.f33102f = i2;
        this.f33104h[i2] = null;
        int[] iArr = this.f33105i;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f33128s = 0;
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: f */
    public boolean mo27715f() throws IOException {
        int iM27731Z = this.f33128s;
        if (iM27731Z == 0) {
            iM27731Z = m27731Z();
        }
        return (iM27731Z == 2 || iM27731Z == 4 || iM27731Z == 18) ? false : true;
    }

    /* renamed from: i0 */
    public String m27742i0() throws IOException {
        String strM27736n0;
        int iM27731Z = this.f33128s;
        if (iM27731Z == 0) {
            iM27731Z = m27731Z();
        }
        if (iM27731Z == 14) {
            strM27736n0 = m27737p0();
        } else if (iM27731Z == 13) {
            strM27736n0 = m27736n0(f33122m);
        } else if (iM27731Z == 12) {
            strM27736n0 = m27736n0(f33121l);
        } else {
            if (iM27731Z != 15) {
                throw new JsonDataException("Expected a name but was " + mo27699A() + " at path " + m27716g());
            }
            strM27736n0 = this.f33131v;
            this.f33131v = null;
        }
        this.f33128s = 0;
        this.f33104h[this.f33102f - 1] = strM27736n0;
        return strM27736n0;
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: k */
    public boolean mo27718k() throws IOException {
        int iM27731Z = this.f33128s;
        if (iM27731Z == 0) {
            iM27731Z = m27731Z();
        }
        if (iM27731Z == 5) {
            this.f33128s = 0;
            int[] iArr = this.f33105i;
            int i2 = this.f33102f - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iM27731Z == 6) {
            this.f33128s = 0;
            int[] iArr2 = this.f33105i;
            int i3 = this.f33102f - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + mo27699A() + " at path " + m27716g());
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: l */
    public double mo27719l() throws IOException, NumberFormatException {
        int iM27731Z = this.f33128s;
        if (iM27731Z == 0) {
            iM27731Z = m27731Z();
        }
        if (iM27731Z == 16) {
            this.f33128s = 0;
            int[] iArr = this.f33105i;
            int i2 = this.f33102f - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f33129t;
        }
        if (iM27731Z == 17) {
            this.f33131v = this.f33127r.m32027Z(this.f33130u);
        } else if (iM27731Z == 9) {
            this.f33131v = m27736n0(f33122m);
        } else if (iM27731Z == 8) {
            this.f33131v = m27736n0(f33121l);
        } else if (iM27731Z == 10) {
            this.f33131v = m27737p0();
        } else if (iM27731Z != 11) {
            throw new JsonDataException("Expected a double but was " + mo27699A() + " at path " + m27716g());
        }
        this.f33128s = 11;
        try {
            double d2 = Double.parseDouble(this.f33131v);
            if (this.f33106j || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
                this.f33131v = null;
                this.f33128s = 0;
                int[] iArr2 = this.f33105i;
                int i3 = this.f33102f - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return d2;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + d2 + " at path " + m27716g());
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f33131v + " at path " + m27716g());
        }
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: m */
    public int mo27720m() throws IOException, NumberFormatException {
        int iM27731Z = this.f33128s;
        if (iM27731Z == 0) {
            iM27731Z = m27731Z();
        }
        if (iM27731Z == 16) {
            long j2 = this.f33129t;
            int i2 = (int) j2;
            if (j2 == i2) {
                this.f33128s = 0;
                int[] iArr = this.f33105i;
                int i3 = this.f33102f - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.f33129t + " at path " + m27716g());
        }
        if (iM27731Z == 17) {
            this.f33131v = this.f33127r.m32027Z(this.f33130u);
        } else if (iM27731Z == 9 || iM27731Z == 8) {
            String strM27736n0 = iM27731Z == 9 ? m27736n0(f33122m) : m27736n0(f33121l);
            this.f33131v = strM27736n0;
            try {
                int i4 = Integer.parseInt(strM27736n0);
                this.f33128s = 0;
                int[] iArr2 = this.f33105i;
                int i5 = this.f33102f - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        } else if (iM27731Z != 11) {
            throw new JsonDataException("Expected an int but was " + mo27699A() + " at path " + m27716g());
        }
        this.f33128s = 11;
        try {
            double d2 = Double.parseDouble(this.f33131v);
            int i6 = (int) d2;
            if (i6 == d2) {
                this.f33131v = null;
                this.f33128s = 0;
                int[] iArr3 = this.f33105i;
                int i7 = this.f33102f - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            throw new JsonDataException("Expected an int but was " + this.f33131v + " at path " + m27716g());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f33131v + " at path " + m27716g());
        }
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: p */
    public long mo27721p() throws IOException, NumberFormatException {
        int iM27731Z = this.f33128s;
        if (iM27731Z == 0) {
            iM27731Z = m27731Z();
        }
        if (iM27731Z == 16) {
            this.f33128s = 0;
            int[] iArr = this.f33105i;
            int i2 = this.f33102f - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f33129t;
        }
        if (iM27731Z == 17) {
            this.f33131v = this.f33127r.m32027Z(this.f33130u);
        } else if (iM27731Z == 9 || iM27731Z == 8) {
            String strM27736n0 = iM27731Z == 9 ? m27736n0(f33122m) : m27736n0(f33121l);
            this.f33131v = strM27736n0;
            try {
                long j2 = Long.parseLong(strM27736n0);
                this.f33128s = 0;
                int[] iArr2 = this.f33105i;
                int i3 = this.f33102f - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        } else if (iM27731Z != 11) {
            throw new JsonDataException("Expected a long but was " + mo27699A() + " at path " + m27716g());
        }
        this.f33128s = 11;
        try {
            long jLongValueExact = new BigDecimal(this.f33131v).longValueExact();
            this.f33131v = null;
            this.f33128s = 0;
            int[] iArr3 = this.f33105i;
            int i4 = this.f33102f - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.f33131v + " at path " + m27716g());
        }
    }

    public String toString() {
        return "JsonReader(" + this.f33126q + ")";
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: x */
    public <T> T mo27722x() throws IOException {
        int iM27731Z = this.f33128s;
        if (iM27731Z == 0) {
            iM27731Z = m27731Z();
        }
        if (iM27731Z == 7) {
            this.f33128s = 0;
            int[] iArr = this.f33105i;
            int i2 = this.f33102f - 1;
            iArr[i2] = iArr[i2] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + mo27699A() + " at path " + m27716g());
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: y */
    public String mo27723y() throws IOException {
        String strM32027Z;
        int iM27731Z = this.f33128s;
        if (iM27731Z == 0) {
            iM27731Z = m27731Z();
        }
        if (iM27731Z == 10) {
            strM32027Z = m27737p0();
        } else if (iM27731Z == 9) {
            strM32027Z = m27736n0(f33122m);
        } else if (iM27731Z == 8) {
            strM32027Z = m27736n0(f33121l);
        } else if (iM27731Z == 11) {
            strM32027Z = this.f33131v;
            this.f33131v = null;
        } else if (iM27731Z == 16) {
            strM32027Z = Long.toString(this.f33129t);
        } else {
            if (iM27731Z != 17) {
                throw new JsonDataException("Expected a string but was " + mo27699A() + " at path " + m27716g());
            }
            strM32027Z = this.f33127r.m32027Z(this.f33130u);
        }
        this.f33128s = 0;
        int[] iArr = this.f33105i;
        int i2 = this.f33102f - 1;
        iArr[i2] = iArr[i2] + 1;
        return strM32027Z;
    }
}
