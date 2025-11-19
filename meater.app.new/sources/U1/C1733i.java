package U1;

import java.util.Arrays;

/* compiled from: ColorInfo.java */
/* renamed from: U1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1733i {

    /* renamed from: h, reason: collision with root package name */
    public static final C1733i f17052h = new b().d(1).c(2).e(3).a();

    /* renamed from: i, reason: collision with root package name */
    public static final C1733i f17053i = new b().d(1).c(1).e(2).a();

    /* renamed from: j, reason: collision with root package name */
    private static final String f17054j = X1.L.B0(0);

    /* renamed from: k, reason: collision with root package name */
    private static final String f17055k = X1.L.B0(1);

    /* renamed from: l, reason: collision with root package name */
    private static final String f17056l = X1.L.B0(2);

    /* renamed from: m, reason: collision with root package name */
    private static final String f17057m = X1.L.B0(3);

    /* renamed from: n, reason: collision with root package name */
    private static final String f17058n = X1.L.B0(4);

    /* renamed from: o, reason: collision with root package name */
    private static final String f17059o = X1.L.B0(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f17060a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17061b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17062c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f17063d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17064e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17065f;

    /* renamed from: g, reason: collision with root package name */
    private int f17066g;

    /* compiled from: ColorInfo.java */
    /* renamed from: U1.i$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f17067a;

        /* renamed from: b, reason: collision with root package name */
        private int f17068b;

        /* renamed from: c, reason: collision with root package name */
        private int f17069c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f17070d;

        /* renamed from: e, reason: collision with root package name */
        private int f17071e;

        /* renamed from: f, reason: collision with root package name */
        private int f17072f;

        public C1733i a() {
            return new C1733i(this.f17067a, this.f17068b, this.f17069c, this.f17070d, this.f17071e, this.f17072f);
        }

        public b b(int i10) {
            this.f17072f = i10;
            return this;
        }

        public b c(int i10) {
            this.f17068b = i10;
            return this;
        }

        public b d(int i10) {
            this.f17067a = i10;
            return this;
        }

        public b e(int i10) {
            this.f17069c = i10;
            return this;
        }

        public b f(byte[] bArr) {
            this.f17070d = bArr;
            return this;
        }

        public b g(int i10) {
            this.f17071e = i10;
            return this;
        }

        public b() {
            this.f17067a = -1;
            this.f17068b = -1;
            this.f17069c = -1;
            this.f17071e = -1;
            this.f17072f = -1;
        }

        private b(C1733i c1733i) {
            this.f17067a = c1733i.f17060a;
            this.f17068b = c1733i.f17061b;
            this.f17069c = c1733i.f17062c;
            this.f17070d = c1733i.f17063d;
            this.f17071e = c1733i.f17064e;
            this.f17072f = c1733i.f17065f;
        }
    }

    private static String b(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Chroma";
    }

    private static String c(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 == 1) {
            return "Full range";
        }
        if (i10 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i10;
    }

    private static String d(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 == 1) {
            return "BT709";
        }
        if (i10 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i10;
    }

    private static String e(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 == 6) {
            return "ST2084 PQ";
        }
        if (i10 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i10;
    }

    public static boolean h(C1733i c1733i) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (c1733i == null) {
            return true;
        }
        int i14 = c1733i.f17060a;
        return (i14 == -1 || i14 == 1 || i14 == 2) && ((i10 = c1733i.f17061b) == -1 || i10 == 2) && (((i11 = c1733i.f17062c) == -1 || i11 == 3) && c1733i.f17063d == null && (((i12 = c1733i.f17065f) == -1 || i12 == 8) && ((i13 = c1733i.f17064e) == -1 || i13 == 8)));
    }

    public static int j(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int k(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String l(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Luma";
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1733i.class != obj.getClass()) {
            return false;
        }
        C1733i c1733i = (C1733i) obj;
        return this.f17060a == c1733i.f17060a && this.f17061b == c1733i.f17061b && this.f17062c == c1733i.f17062c && Arrays.equals(this.f17063d, c1733i.f17063d) && this.f17064e == c1733i.f17064e && this.f17065f == c1733i.f17065f;
    }

    public boolean f() {
        return (this.f17064e == -1 || this.f17065f == -1) ? false : true;
    }

    public boolean g() {
        return (this.f17060a == -1 || this.f17061b == -1 || this.f17062c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f17066g == 0) {
            this.f17066g = ((((((((((527 + this.f17060a) * 31) + this.f17061b) * 31) + this.f17062c) * 31) + Arrays.hashCode(this.f17063d)) * 31) + this.f17064e) * 31) + this.f17065f;
        }
        return this.f17066g;
    }

    public boolean i() {
        return f() || g();
    }

    public String m() {
        String str;
        String strG = g() ? X1.L.G("%s/%s/%s", d(this.f17060a), c(this.f17061b), e(this.f17062c)) : "NA/NA/NA";
        if (f()) {
            str = this.f17064e + "/" + this.f17065f;
        } else {
            str = "NA/NA";
        }
        return strG + "/" + str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(d(this.f17060a));
        sb2.append(", ");
        sb2.append(c(this.f17061b));
        sb2.append(", ");
        sb2.append(e(this.f17062c));
        sb2.append(", ");
        sb2.append(this.f17063d != null);
        sb2.append(", ");
        sb2.append(l(this.f17064e));
        sb2.append(", ");
        sb2.append(b(this.f17065f));
        sb2.append(")");
        return sb2.toString();
    }

    private C1733i(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f17060a = i10;
        this.f17061b = i11;
        this.f17062c = i12;
        this.f17063d = bArr;
        this.f17064e = i13;
        this.f17065f = i14;
    }
}
