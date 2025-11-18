package T2;

import S2.k;
import S2.o;
import S2.p;
import W1.a;
import X1.C1804a;
import X1.n;
import X1.y;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.TemperatureLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Cea608Decoder.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: i, reason: collision with root package name */
    private final int f15782i;

    /* renamed from: j, reason: collision with root package name */
    private final int f15783j;

    /* renamed from: k, reason: collision with root package name */
    private final int f15784k;

    /* renamed from: l, reason: collision with root package name */
    private final long f15785l;

    /* renamed from: o, reason: collision with root package name */
    private List<W1.a> f15788o;

    /* renamed from: p, reason: collision with root package name */
    private List<W1.a> f15789p;

    /* renamed from: q, reason: collision with root package name */
    private int f15790q;

    /* renamed from: r, reason: collision with root package name */
    private int f15791r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f15792s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f15793t;

    /* renamed from: u, reason: collision with root package name */
    private byte f15794u;

    /* renamed from: v, reason: collision with root package name */
    private byte f15795v;

    /* renamed from: x, reason: collision with root package name */
    private boolean f15797x;

    /* renamed from: y, reason: collision with root package name */
    private long f15798y;

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f15780z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f15773A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: B, reason: collision with root package name */
    private static final int[] f15774B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: C, reason: collision with root package name */
    private static final int[] f15775C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, Temperature.MAX_INTERNAL_SECOND_GEN_PROBE, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D, reason: collision with root package name */
    private static final int[] f15776D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f15777E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: F, reason: collision with root package name */
    private static final int[] f15778F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G, reason: collision with root package name */
    private static final boolean[] f15779G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h, reason: collision with root package name */
    private final y f15781h = new y();

    /* renamed from: m, reason: collision with root package name */
    private final ArrayList<C0230a> f15786m = new ArrayList<>();

    /* renamed from: n, reason: collision with root package name */
    private C0230a f15787n = new C0230a(0, 4);

    /* renamed from: w, reason: collision with root package name */
    private int f15796w = 0;

    /* compiled from: Cea608Decoder.java */
    /* renamed from: T2.a$a, reason: collision with other inner class name */
    private static final class C0230a {

        /* renamed from: a, reason: collision with root package name */
        private final List<C0231a> f15799a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List<SpannableString> f15800b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final StringBuilder f15801c = new StringBuilder();

        /* renamed from: d, reason: collision with root package name */
        private int f15802d;

        /* renamed from: e, reason: collision with root package name */
        private int f15803e;

        /* renamed from: f, reason: collision with root package name */
        private int f15804f;

        /* renamed from: g, reason: collision with root package name */
        private int f15805g;

        /* renamed from: h, reason: collision with root package name */
        private int f15806h;

        /* compiled from: Cea608Decoder.java */
        /* renamed from: T2.a$a$a, reason: collision with other inner class name */
        private static class C0231a {

            /* renamed from: a, reason: collision with root package name */
            public final int f15807a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f15808b;

            /* renamed from: c, reason: collision with root package name */
            public int f15809c;

            public C0231a(int i10, boolean z10, int i11) {
                this.f15807a = i10;
                this.f15808b = z10;
                this.f15809c = i11;
            }
        }

        public C0230a(int i10, int i11) {
            j(i10);
            this.f15806h = i11;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f15801c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f15799a.size()) {
                C0231a c0231a = this.f15799a.get(i14);
                boolean z11 = c0231a.f15808b;
                int i16 = c0231a.f15807a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = a.f15774B[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0231a.f15809c;
                i14++;
                if (i17 != (i14 < this.f15799a.size() ? this.f15799a.get(i14).f15809c : length)) {
                    if (i10 != -1 && !z11) {
                        q(spannableStringBuilder, i10, i17);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        o(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        n(spannableStringBuilder, i15, i17, i12);
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                q(spannableStringBuilder, i10, length);
            }
            if (i11 != -1 && i11 != length) {
                o(spannableStringBuilder, i11, length);
            }
            if (i15 != length) {
                n(spannableStringBuilder, i15, length, i12);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f15801c.length() < 32) {
                this.f15801c.append(c10);
            }
        }

        public void f() {
            int length = this.f15801c.length();
            if (length > 0) {
                this.f15801c.delete(length - 1, length);
                for (int size = this.f15799a.size() - 1; size >= 0; size--) {
                    C0231a c0231a = this.f15799a.get(size);
                    int i10 = c0231a.f15809c;
                    if (i10 != length) {
                        return;
                    }
                    c0231a.f15809c = i10 - 1;
                }
            }
        }

        public W1.a g(int i10) {
            float f10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < this.f15800b.size(); i11++) {
                spannableStringBuilder.append((CharSequence) this.f15800b.get(i11));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i12 = this.f15803e + this.f15804f;
            int length = (32 - i12) - spannableStringBuilder.length();
            int i13 = i12 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f15805g != 2 || (Math.abs(i13) >= 3 && length >= 0)) ? (this.f15805g != 2 || i13 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i12 = 32 - length;
                }
                f10 = ((i12 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i14 = this.f15802d;
            if (i14 > 7) {
                i14 -= 17;
            } else if (this.f15805g == 1) {
                i14 -= this.f15806h - 1;
            }
            return new a.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i14, 1).k(f10).l(i10).a();
        }

        public boolean i() {
            return this.f15799a.isEmpty() && this.f15800b.isEmpty() && this.f15801c.length() == 0;
        }

        public void j(int i10) {
            this.f15805g = i10;
            this.f15799a.clear();
            this.f15800b.clear();
            this.f15801c.setLength(0);
            this.f15802d = 15;
            this.f15803e = 0;
            this.f15804f = 0;
        }

        public void k() {
            this.f15800b.add(h());
            this.f15801c.setLength(0);
            this.f15799a.clear();
            int iMin = Math.min(this.f15806h, this.f15802d);
            while (this.f15800b.size() >= iMin) {
                this.f15800b.remove(0);
            }
        }

        public void l(int i10) {
            this.f15805g = i10;
        }

        public void m(int i10) {
            this.f15806h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f15799a.add(new C0231a(i10, z10, this.f15801c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            C1804a.a(j10 >= 16000);
            this.f15785l = j10 * 1000;
        } else {
            this.f15785l = -9223372036854775807L;
        }
        this.f15782i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f15784k = 0;
            this.f15783j = 0;
        } else if (i10 == 2) {
            this.f15784k = 1;
            this.f15783j = 0;
        } else if (i10 == 3) {
            this.f15784k = 0;
            this.f15783j = 1;
        } else if (i10 != 4) {
            n.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f15784k = 0;
            this.f15783j = 0;
        } else {
            this.f15784k = 1;
            this.f15783j = 1;
        }
        P(0);
        O();
        this.f15797x = true;
        this.f15798y = -9223372036854775807L;
    }

    private void A(byte b10) {
        if (b10 == 32) {
            P(2);
            return;
        }
        if (b10 == 41) {
            P(3);
            return;
        }
        switch (b10) {
            case 37:
                P(1);
                Q(2);
                break;
            case 38:
                P(1);
                Q(3);
                break;
            case 39:
                P(1);
                Q(4);
                break;
            default:
                int i10 = this.f15790q;
                if (i10 != 0) {
                    if (b10 == 33) {
                        this.f15787n.f();
                        break;
                    } else {
                        switch (b10) {
                            case 44:
                                this.f15788o = Collections.emptyList();
                                int i11 = this.f15790q;
                                if (i11 == 1 || i11 == 3) {
                                    O();
                                    break;
                                }
                            case 45:
                                if (i10 == 1 && !this.f15787n.i()) {
                                    this.f15787n.k();
                                    break;
                                }
                                break;
                            case 46:
                                O();
                                break;
                            case 47:
                                this.f15788o = u();
                                O();
                                break;
                        }
                    }
                }
                break;
        }
    }

    private void B(byte b10, byte b11) {
        int i10 = f15780z[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f15787n.f15802d) {
            if (this.f15790q != 1 && !this.f15787n.i()) {
                C0230a c0230a = new C0230a(this.f15790q, this.f15791r);
                this.f15787n = c0230a;
                this.f15786m.add(c0230a);
            }
            this.f15787n.f15802d = i10;
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f15787n.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f15787n.f15803e = f15773A[i11];
        }
    }

    private static boolean C(byte b10) {
        return (b10 & 224) == 0;
    }

    private static boolean D(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    private static boolean E(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean F(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private static boolean G(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean H(byte b10) {
        return (b10 & 240) == 16;
    }

    private boolean I(boolean z10, byte b10, byte b11) {
        if (!z10 || !H(b10)) {
            this.f15793t = false;
        } else {
            if (this.f15793t && this.f15794u == b10 && this.f15795v == b11) {
                this.f15793t = false;
                return true;
            }
            this.f15793t = true;
            this.f15794u = b10;
            this.f15795v = b11;
        }
        return false;
    }

    private static boolean J(byte b10) {
        return (b10 & 246) == 20;
    }

    private static boolean K(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean L(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private static boolean M(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    private void N(byte b10, byte b11) {
        if (M(b10)) {
            this.f15797x = false;
            return;
        }
        if (J(b10)) {
            if (b11 != 32 && b11 != 47) {
                switch (b11) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b11) {
                            case 42:
                            case 43:
                                this.f15797x = false;
                                break;
                        }
                }
            }
            this.f15797x = true;
        }
    }

    private void O() {
        this.f15787n.j(this.f15790q);
        this.f15786m.clear();
        this.f15786m.add(this.f15787n);
    }

    private void P(int i10) {
        int i11 = this.f15790q;
        if (i11 == i10) {
            return;
        }
        this.f15790q = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f15786m.size(); i12++) {
                this.f15786m.get(i12).l(i10);
            }
            return;
        }
        O();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f15788o = Collections.emptyList();
        }
    }

    private void Q(int i10) {
        this.f15791r = i10;
        this.f15787n.m(i10);
    }

    private boolean R() {
        return (this.f15785l == -9223372036854775807L || this.f15798y == -9223372036854775807L || m() - this.f15798y < this.f15785l) ? false : true;
    }

    private boolean S(byte b10) {
        if (C(b10)) {
            this.f15796w = t(b10);
        }
        return this.f15796w == this.f15784k;
    }

    private static char s(byte b10) {
        return (char) f15775C[(b10 & 127) - 32];
    }

    private static int t(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List<W1.a> u() {
        int size = this.f15786m.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            W1.a aVarG = this.f15786m.get(i10).g(Integer.MIN_VALUE);
            arrayList.add(aVarG);
            if (aVarG != null) {
                iMin = Math.min(iMin, aVarG.f18307i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            W1.a aVar = (W1.a) arrayList.get(i11);
            if (aVar != null) {
                if (aVar.f18307i != iMin) {
                    aVar = (W1.a) C1804a.e(this.f15786m.get(i11).g(iMin));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    private static char v(byte b10) {
        return (char) f15777E[b10 & 31];
    }

    private static char w(byte b10) {
        return (char) f15778F[b10 & 31];
    }

    private static char x(byte b10, byte b11) {
        return (b10 & 1) == 0 ? v(b11) : w(b11);
    }

    private static char y(byte b10) {
        return (char) f15776D[b10 & 15];
    }

    private void z(byte b10) {
        this.f15787n.e(' ');
        this.f15787n.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    @Override // T2.e, S2.l
    public /* bridge */ /* synthetic */ void d(long j10) {
        super.d(j10);
    }

    @Override // T2.e, c2.d
    public void flush() {
        super.flush();
        this.f15788o = null;
        this.f15789p = null;
        P(0);
        Q(4);
        O();
        this.f15792s = false;
        this.f15793t = false;
        this.f15794u = (byte) 0;
        this.f15795v = (byte) 0;
        this.f15796w = 0;
        this.f15797x = true;
        this.f15798y = -9223372036854775807L;
    }

    @Override // T2.e
    protected k h() {
        List<W1.a> list = this.f15788o;
        this.f15789p = list;
        return new f((List) C1804a.e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // T2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void i(S2.o r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.a.i(S2.o):void");
    }

    @Override // T2.e
    /* renamed from: j */
    public /* bridge */ /* synthetic */ o e() {
        return super.e();
    }

    @Override // T2.e, c2.d
    /* renamed from: k */
    public p a() {
        p pVarL;
        p pVarA = super.a();
        if (pVarA != null) {
            return pVarA;
        }
        if (!R() || (pVarL = l()) == null) {
            return null;
        }
        this.f15788o = Collections.emptyList();
        this.f15798y = -9223372036854775807L;
        pVarL.D(m(), h(), Long.MAX_VALUE);
        return pVarL;
    }

    @Override // T2.e
    protected boolean n() {
        return this.f15788o != this.f15789p;
    }

    @Override // T2.e
    /* renamed from: o */
    public /* bridge */ /* synthetic */ void g(o oVar) {
        super.g(oVar);
    }

    @Override // T2.e, c2.d
    public void c() {
    }
}
