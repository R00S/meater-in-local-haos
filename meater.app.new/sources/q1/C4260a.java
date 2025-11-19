package q1;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* compiled from: BidiFormatter.java */
/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4260a {

    /* renamed from: d, reason: collision with root package name */
    static final r f47761d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f47762e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f47763f;

    /* renamed from: g, reason: collision with root package name */
    static final C4260a f47764g;

    /* renamed from: h, reason: collision with root package name */
    static final C4260a f47765h;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f47766a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47767b;

    /* renamed from: c, reason: collision with root package name */
    private final r f47768c;

    /* compiled from: BidiFormatter.java */
    /* renamed from: q1.a$a, reason: collision with other inner class name */
    public static final class C0664a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f47769a;

        /* renamed from: b, reason: collision with root package name */
        private int f47770b;

        /* renamed from: c, reason: collision with root package name */
        private r f47771c;

        public C0664a() {
            c(C4260a.e(Locale.getDefault()));
        }

        private static C4260a b(boolean z10) {
            return z10 ? C4260a.f47765h : C4260a.f47764g;
        }

        private void c(boolean z10) {
            this.f47769a = z10;
            this.f47771c = C4260a.f47761d;
            this.f47770b = 2;
        }

        public C4260a a() {
            return (this.f47770b == 2 && this.f47771c == C4260a.f47761d) ? b(this.f47769a) : new C4260a(this.f47769a, this.f47770b, this.f47771c);
        }
    }

    /* compiled from: BidiFormatter.java */
    /* renamed from: q1.a$b */
    private static class b {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f47772f = new byte[1792];

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f47773a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f47774b;

        /* renamed from: c, reason: collision with root package name */
        private final int f47775c;

        /* renamed from: d, reason: collision with root package name */
        private int f47776d;

        /* renamed from: e, reason: collision with root package name */
        private char f47777e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f47772f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f47773a = charSequence;
            this.f47774b = z10;
            this.f47775c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f47772f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char cCharAt;
            int i10 = this.f47776d;
            do {
                int i11 = this.f47776d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f47773a;
                int i12 = i11 - 1;
                this.f47776d = i12;
                cCharAt = charSequence.charAt(i12);
                this.f47777e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f47776d = i10;
            this.f47777e = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i10 = this.f47776d;
                if (i10 >= this.f47775c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f47773a;
                this.f47776d = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.f47777e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i10 = this.f47776d;
            while (true) {
                int i11 = this.f47776d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f47773a;
                int i12 = i11 - 1;
                this.f47776d = i12;
                char cCharAt2 = charSequence.charAt(i12);
                this.f47777e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f47776d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f47773a;
                            int i14 = i13 - 1;
                            this.f47776d = i14;
                            cCharAt = charSequence2.charAt(i14);
                            this.f47777e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f47776d = i10;
            this.f47777e = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i10 = this.f47776d;
            while (true) {
                int i11 = this.f47776d;
                if (i11 >= this.f47775c) {
                    this.f47776d = i10;
                    this.f47777e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f47773a;
                this.f47776d = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                this.f47777e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f47776d;
                        if (i12 < this.f47775c) {
                            CharSequence charSequence2 = this.f47773a;
                            this.f47776d = i12 + 1;
                            cCharAt = charSequence2.charAt(i12);
                            this.f47777e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f47773a.charAt(this.f47776d - 1);
            this.f47777e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f47773a, this.f47776d);
                this.f47776d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f47776d--;
            byte bC = c(this.f47777e);
            if (!this.f47774b) {
                return bC;
            }
            char c10 = this.f47777e;
            return c10 == '>' ? h() : c10 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f47773a.charAt(this.f47776d);
            this.f47777e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f47773a, this.f47776d);
                this.f47776d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f47776d++;
            byte bC = c(this.f47777e);
            if (!this.f47774b) {
                return bC;
            }
            char c10 = this.f47777e;
            return c10 == '<' ? i() : c10 == '&' ? g() : bC;
        }

        int d() {
            this.f47776d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f47776d < this.f47775c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f47776d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        int e() {
            this.f47776d = this.f47775c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f47776d > 0) {
                    byte bA = a();
                    if (bA != 0) {
                        if (bA == 1 || bA == 2) {
                            if (i10 == 0) {
                                return 1;
                            }
                            if (i11 == 0) {
                                break;
                            }
                        } else if (bA != 9) {
                            switch (bA) {
                                case 14:
                                case 15:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    i10--;
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    i10--;
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        r rVar = s.f47793c;
        f47761d = rVar;
        f47762e = Character.toString((char) 8206);
        f47763f = Character.toString((char) 8207);
        f47764g = new C4260a(false, 2, rVar);
        f47765h = new C4260a(true, 2, rVar);
    }

    C4260a(boolean z10, int i10, r rVar) {
        this.f47766a = z10;
        this.f47767b = i10;
        this.f47768c = rVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static C4260a c() {
        return new C0664a().a();
    }

    static boolean e(Locale locale) {
        return t.a(locale) == 1;
    }

    private String f(CharSequence charSequence, r rVar) {
        boolean zA = rVar.a(charSequence, 0, charSequence.length());
        return (this.f47766a || !(zA || b(charSequence) == 1)) ? this.f47766a ? (!zA || b(charSequence) == -1) ? f47763f : "" : "" : f47762e;
    }

    private String g(CharSequence charSequence, r rVar) {
        boolean zA = rVar.a(charSequence, 0, charSequence.length());
        return (this.f47766a || !(zA || a(charSequence) == 1)) ? this.f47766a ? (!zA || a(charSequence) == -1) ? f47763f : "" : "" : f47762e;
    }

    public boolean d() {
        return (this.f47767b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f47768c, true);
    }

    public CharSequence i(CharSequence charSequence, r rVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean zA = rVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zA ? s.f47792b : s.f47791a));
        }
        if (zA != this.f47766a) {
            spannableStringBuilder.append(zA ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zA ? s.f47792b : s.f47791a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f47768c, true);
    }

    public String k(String str, r rVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, rVar, z10).toString();
    }
}
