package p024c.p052i.p058i;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import okhttp3.HttpUrl;

/* compiled from: BidiFormatter.java */
/* renamed from: c.i.i.a */
/* loaded from: classes.dex */
public final class C0945a {

    /* renamed from: a */
    static final InterfaceC0948d f6360a;

    /* renamed from: b */
    private static final String f6361b;

    /* renamed from: c */
    private static final String f6362c;

    /* renamed from: d */
    static final C0945a f6363d;

    /* renamed from: e */
    static final C0945a f6364e;

    /* renamed from: f */
    private final boolean f6365f;

    /* renamed from: g */
    private final int f6366g;

    /* renamed from: h */
    private final InterfaceC0948d f6367h;

    /* compiled from: BidiFormatter.java */
    /* renamed from: c.i.i.a$a */
    public static final class a {

        /* renamed from: a */
        private boolean f6368a;

        /* renamed from: b */
        private int f6369b;

        /* renamed from: c */
        private InterfaceC0948d f6370c;

        public a() {
            m6021c(C0945a.m6012e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C0945a m6020b(boolean z) {
            return z ? C0945a.f6364e : C0945a.f6363d;
        }

        /* renamed from: c */
        private void m6021c(boolean z) {
            this.f6368a = z;
            this.f6370c = C0945a.f6360a;
            this.f6369b = 2;
        }

        /* renamed from: a */
        public C0945a m6022a() {
            return (this.f6369b == 2 && this.f6370c == C0945a.f6360a) ? m6020b(this.f6368a) : new C0945a(this.f6368a, this.f6369b, this.f6370c);
        }
    }

    /* compiled from: BidiFormatter.java */
    /* renamed from: c.i.i.a$b */
    private static class b {

        /* renamed from: a */
        private static final byte[] f6371a = new byte[1792];

        /* renamed from: b */
        private final CharSequence f6372b;

        /* renamed from: c */
        private final boolean f6373c;

        /* renamed from: d */
        private final int f6374d;

        /* renamed from: e */
        private int f6375e;

        /* renamed from: f */
        private char f6376f;

        static {
            for (int i2 = 0; i2 < 1792; i2++) {
                f6371a[i2] = Character.getDirectionality(i2);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.f6372b = charSequence;
            this.f6373c = z;
            this.f6374d = charSequence.length();
        }

        /* renamed from: c */
        private static byte m6023c(char c2) {
            return c2 < 1792 ? f6371a[c2] : Character.getDirectionality(c2);
        }

        /* renamed from: f */
        private byte m6024f() {
            char cCharAt;
            int i2 = this.f6375e;
            do {
                int i3 = this.f6375e;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f6372b;
                int i4 = i3 - 1;
                this.f6375e = i4;
                cCharAt = charSequence.charAt(i4);
                this.f6376f = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f6375e = i2;
            this.f6376f = ';';
            return (byte) 13;
        }

        /* renamed from: g */
        private byte m6025g() {
            char cCharAt;
            do {
                int i2 = this.f6375e;
                if (i2 >= this.f6374d) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f6372b;
                this.f6375e = i2 + 1;
                cCharAt = charSequence.charAt(i2);
                this.f6376f = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        /* renamed from: h */
        private byte m6026h() {
            char cCharAt;
            int i2 = this.f6375e;
            while (true) {
                int i3 = this.f6375e;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f6372b;
                int i4 = i3 - 1;
                this.f6375e = i4;
                char cCharAt2 = charSequence.charAt(i4);
                this.f6376f = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i5 = this.f6375e;
                        if (i5 > 0) {
                            CharSequence charSequence2 = this.f6372b;
                            int i6 = i5 - 1;
                            this.f6375e = i6;
                            cCharAt = charSequence2.charAt(i6);
                            this.f6376f = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f6375e = i2;
            this.f6376f = '>';
            return (byte) 13;
        }

        /* renamed from: i */
        private byte m6027i() {
            char cCharAt;
            int i2 = this.f6375e;
            while (true) {
                int i3 = this.f6375e;
                if (i3 >= this.f6374d) {
                    this.f6375e = i2;
                    this.f6376f = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f6372b;
                this.f6375e = i3 + 1;
                char cCharAt2 = charSequence.charAt(i3);
                this.f6376f = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i4 = this.f6375e;
                        if (i4 < this.f6374d) {
                            CharSequence charSequence2 = this.f6372b;
                            this.f6375e = i4 + 1;
                            cCharAt = charSequence2.charAt(i4);
                            this.f6376f = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        /* renamed from: a */
        byte m6028a() {
            char cCharAt = this.f6372b.charAt(this.f6375e - 1);
            this.f6376f = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f6372b, this.f6375e);
                this.f6375e -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f6375e--;
            byte bM6023c = m6023c(this.f6376f);
            if (!this.f6373c) {
                return bM6023c;
            }
            char c2 = this.f6376f;
            return c2 == '>' ? m6026h() : c2 == ';' ? m6024f() : bM6023c;
        }

        /* renamed from: b */
        byte m6029b() {
            char cCharAt = this.f6372b.charAt(this.f6375e);
            this.f6376f = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f6372b, this.f6375e);
                this.f6375e += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f6375e++;
            byte bM6023c = m6023c(this.f6376f);
            if (!this.f6373c) {
                return bM6023c;
            }
            char c2 = this.f6376f;
            return c2 == '<' ? m6027i() : c2 == '&' ? m6025g() : bM6023c;
        }

        /* renamed from: d */
        int m6030d() {
            this.f6375e = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (this.f6375e < this.f6374d && i2 == 0) {
                byte bM6029b = m6029b();
                if (bM6029b != 0) {
                    if (bM6029b == 1 || bM6029b == 2) {
                        if (i4 == 0) {
                            return 1;
                        }
                    } else if (bM6029b != 9) {
                        switch (bM6029b) {
                            case 14:
                            case 15:
                                i4++;
                                i3 = -1;
                                continue;
                            case 16:
                            case 17:
                                i4++;
                                i3 = 1;
                                continue;
                            case 18:
                                i4--;
                                i3 = 0;
                                continue;
                        }
                    }
                } else if (i4 == 0) {
                    return -1;
                }
                i2 = i4;
            }
            if (i2 == 0) {
                return 0;
            }
            if (i3 != 0) {
                return i3;
            }
            while (this.f6375e > 0) {
                switch (m6028a()) {
                    case 14:
                    case 15:
                        if (i2 == i4) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i2 == i4) {
                            return 1;
                        }
                        break;
                    case 18:
                        i4++;
                        continue;
                }
                i4--;
            }
            return 0;
        }

        /* renamed from: e */
        int m6031e() {
            this.f6375e = this.f6374d;
            int i2 = 0;
            int i3 = 0;
            while (this.f6375e > 0) {
                byte bM6028a = m6028a();
                if (bM6028a != 0) {
                    if (bM6028a == 1 || bM6028a == 2) {
                        if (i2 == 0) {
                            return 1;
                        }
                        if (i3 == 0) {
                            i3 = i2;
                        }
                    } else if (bM6028a != 9) {
                        switch (bM6028a) {
                            case 14:
                            case 15:
                                if (i3 == i2) {
                                    return -1;
                                }
                                i2--;
                                break;
                            case 16:
                            case 17:
                                if (i3 == i2) {
                                    return 1;
                                }
                                i2--;
                                break;
                            case 18:
                                i2++;
                                break;
                            default:
                                if (i3 != 0) {
                                    break;
                                } else {
                                    i3 = i2;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i2 == 0) {
                        return -1;
                    }
                    if (i3 == 0) {
                        i3 = i2;
                    }
                }
            }
            return 0;
        }
    }

    static {
        InterfaceC0948d interfaceC0948d = C0949e.f6394c;
        f6360a = interfaceC0948d;
        f6361b = Character.toString((char) 8206);
        f6362c = Character.toString((char) 8207);
        f6363d = new C0945a(false, 2, interfaceC0948d);
        f6364e = new C0945a(true, 2, interfaceC0948d);
    }

    C0945a(boolean z, int i2, InterfaceC0948d interfaceC0948d) {
        this.f6365f = z;
        this.f6366g = i2;
        this.f6367h = interfaceC0948d;
    }

    /* renamed from: a */
    private static int m6009a(CharSequence charSequence) {
        return new b(charSequence, false).m6030d();
    }

    /* renamed from: b */
    private static int m6010b(CharSequence charSequence) {
        return new b(charSequence, false).m6031e();
    }

    /* renamed from: c */
    public static C0945a m6011c() {
        return new a().m6022a();
    }

    /* renamed from: e */
    static boolean m6012e(Locale locale) {
        return C0950f.m6053b(locale) == 1;
    }

    /* renamed from: f */
    private String m6013f(CharSequence charSequence, InterfaceC0948d interfaceC0948d) {
        boolean zMo6046a = interfaceC0948d.mo6046a(charSequence, 0, charSequence.length());
        return (this.f6365f || !(zMo6046a || m6010b(charSequence) == 1)) ? this.f6365f ? (!zMo6046a || m6010b(charSequence) == -1) ? f6362c : HttpUrl.FRAGMENT_ENCODE_SET : HttpUrl.FRAGMENT_ENCODE_SET : f6361b;
    }

    /* renamed from: g */
    private String m6014g(CharSequence charSequence, InterfaceC0948d interfaceC0948d) {
        boolean zMo6046a = interfaceC0948d.mo6046a(charSequence, 0, charSequence.length());
        return (this.f6365f || !(zMo6046a || m6009a(charSequence) == 1)) ? this.f6365f ? (!zMo6046a || m6009a(charSequence) == -1) ? f6362c : HttpUrl.FRAGMENT_ENCODE_SET : HttpUrl.FRAGMENT_ENCODE_SET : f6361b;
    }

    /* renamed from: d */
    public boolean m6015d() {
        return (this.f6366g & 2) != 0;
    }

    /* renamed from: h */
    public CharSequence m6016h(CharSequence charSequence) {
        return m6017i(charSequence, this.f6367h, true);
    }

    /* renamed from: i */
    public CharSequence m6017i(CharSequence charSequence, InterfaceC0948d interfaceC0948d, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean zMo6046a = interfaceC0948d.mo6046a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m6015d() && z) {
            spannableStringBuilder.append((CharSequence) m6014g(charSequence, zMo6046a ? C0949e.f6393b : C0949e.f6392a));
        }
        if (zMo6046a != this.f6365f) {
            spannableStringBuilder.append(zMo6046a ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) m6013f(charSequence, zMo6046a ? C0949e.f6393b : C0949e.f6392a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String m6018j(String str) {
        return m6019k(str, this.f6367h, true);
    }

    /* renamed from: k */
    public String m6019k(String str, InterfaceC0948d interfaceC0948d, boolean z) {
        if (str == null) {
            return null;
        }
        return m6017i(str, interfaceC0948d, z).toString();
    }
}
