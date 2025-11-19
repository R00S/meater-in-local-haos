package T2;

import C9.h;
import S2.k;
import S2.o;
import S2.p;
import T2.c;
import W1.a;
import X1.C1804a;
import X1.C1808e;
import X1.n;
import X1.x;
import X1.y;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.apptionlabs.meater_app.model.TemperatureLog;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: Cea708Decoder.java */
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: h, reason: collision with root package name */
    private final y f15810h = new y();

    /* renamed from: i, reason: collision with root package name */
    private final x f15811i = new x();

    /* renamed from: j, reason: collision with root package name */
    private int f15812j = -1;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f15813k;

    /* renamed from: l, reason: collision with root package name */
    private final int f15814l;

    /* renamed from: m, reason: collision with root package name */
    private final b[] f15815m;

    /* renamed from: n, reason: collision with root package name */
    private b f15816n;

    /* renamed from: o, reason: collision with root package name */
    private List<W1.a> f15817o;

    /* renamed from: p, reason: collision with root package name */
    private List<W1.a> f15818p;

    /* renamed from: q, reason: collision with root package name */
    private C0232c f15819q;

    /* renamed from: r, reason: collision with root package name */
    private int f15820r;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cea708Decoder.java */
    static final class a {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f15821c = new Comparator() { // from class: T2.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.a.c((c.a) obj, (c.a) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final W1.a f15822a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15823b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            a.b bVarN = new a.b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                bVarN.s(i13);
            }
            this.f15822a = bVarN.a();
            this.f15823b = i14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int c(a aVar, a aVar2) {
            return Integer.compare(aVar2.f15823b, aVar.f15823b);
        }
    }

    /* compiled from: Cea708Decoder.java */
    private static final class b {

        /* renamed from: A, reason: collision with root package name */
        private static final int[] f15824A;

        /* renamed from: B, reason: collision with root package name */
        private static final boolean[] f15825B;

        /* renamed from: C, reason: collision with root package name */
        private static final int[] f15826C;

        /* renamed from: D, reason: collision with root package name */
        private static final int[] f15827D;

        /* renamed from: E, reason: collision with root package name */
        private static final int[] f15828E;

        /* renamed from: F, reason: collision with root package name */
        private static final int[] f15829F;

        /* renamed from: v, reason: collision with root package name */
        public static final int f15830v = h(2, 2, 2, 0);

        /* renamed from: w, reason: collision with root package name */
        public static final int f15831w;

        /* renamed from: x, reason: collision with root package name */
        public static final int f15832x;

        /* renamed from: y, reason: collision with root package name */
        private static final int[] f15833y;

        /* renamed from: z, reason: collision with root package name */
        private static final int[] f15834z;

        /* renamed from: a, reason: collision with root package name */
        private final List<SpannableString> f15835a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f15836b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        private boolean f15837c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f15838d;

        /* renamed from: e, reason: collision with root package name */
        private int f15839e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f15840f;

        /* renamed from: g, reason: collision with root package name */
        private int f15841g;

        /* renamed from: h, reason: collision with root package name */
        private int f15842h;

        /* renamed from: i, reason: collision with root package name */
        private int f15843i;

        /* renamed from: j, reason: collision with root package name */
        private int f15844j;

        /* renamed from: k, reason: collision with root package name */
        private int f15845k;

        /* renamed from: l, reason: collision with root package name */
        private int f15846l;

        /* renamed from: m, reason: collision with root package name */
        private int f15847m;

        /* renamed from: n, reason: collision with root package name */
        private int f15848n;

        /* renamed from: o, reason: collision with root package name */
        private int f15849o;

        /* renamed from: p, reason: collision with root package name */
        private int f15850p;

        /* renamed from: q, reason: collision with root package name */
        private int f15851q;

        /* renamed from: r, reason: collision with root package name */
        private int f15852r;

        /* renamed from: s, reason: collision with root package name */
        private int f15853s;

        /* renamed from: t, reason: collision with root package name */
        private int f15854t;

        /* renamed from: u, reason: collision with root package name */
        private int f15855u;

        static {
            int iH = h(0, 0, 0, 0);
            f15831w = iH;
            int iH2 = h(0, 0, 0, 3);
            f15832x = iH2;
            f15833y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f15834z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f15824A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f15825B = new boolean[]{false, false, false, true, true, true, false};
            f15826C = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            f15827D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f15828E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f15829F = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                X1.C1804a.c(r4, r0, r1)
                X1.C1804a.c(r5, r0, r1)
                X1.C1804a.c(r6, r0, r1)
                X1.C1804a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L1b
                if (r7 == r1) goto L1b
                r3 = 2
                if (r7 == r3) goto L1f
                r3 = 3
                if (r7 == r3) goto L1d
            L1b:
                r7 = r2
                goto L21
            L1d:
                r7 = r0
                goto L21
            L1f:
                r7 = 127(0x7f, float:1.78E-43)
            L21:
                if (r4 <= r1) goto L25
                r4 = r2
                goto L26
            L25:
                r4 = r0
            L26:
                if (r5 <= r1) goto L2a
                r5 = r2
                goto L2b
            L2a:
                r5 = r0
            L2b:
                if (r6 <= r1) goto L2e
                r0 = r2
            L2e:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: T2.c.b.h(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f15836b.append(c10);
                return;
            }
            this.f15835a.add(d());
            this.f15836b.clear();
            if (this.f15849o != -1) {
                this.f15849o = 0;
            }
            if (this.f15850p != -1) {
                this.f15850p = 0;
            }
            if (this.f15851q != -1) {
                this.f15851q = 0;
            }
            if (this.f15853s != -1) {
                this.f15853s = 0;
            }
            while (true) {
                if (this.f15835a.size() < this.f15844j && this.f15835a.size() < 15) {
                    this.f15855u = this.f15835a.size();
                    return;
                }
                this.f15835a.remove(0);
            }
        }

        public void b() {
            int length = this.f15836b.length();
            if (length > 0) {
                this.f15836b.delete(length - 1, length);
            }
        }

        public a c() {
            Layout.Alignment alignment;
            float f10;
            float f11;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < this.f15835a.size(); i10++) {
                spannableStringBuilder.append((CharSequence) this.f15835a.get(i10));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i11 = this.f15845k;
            if (i11 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i11 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f15845k);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.f15840f) {
                f10 = this.f15842h / 99.0f;
                f11 = this.f15841g / 99.0f;
            } else {
                f10 = this.f15842h / 209.0f;
                f11 = this.f15841g / 74.0f;
            }
            float f12 = (f10 * 0.9f) + 0.05f;
            float f13 = (f11 * 0.9f) + 0.05f;
            int i12 = this.f15843i;
            return new a(spannableStringBuilder, alignment2, f13, 0, i12 / 3 == 0 ? 0 : i12 / 3 == 1 ? 1 : 2, f12, i12 % 3 == 0 ? 0 : i12 % 3 == 1 ? 1 : 2, -3.4028235E38f, this.f15848n != f15831w, this.f15848n, this.f15839e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f15836b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f15849o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f15849o, length, 33);
                }
                if (this.f15850p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f15850p, length, 33);
                }
                if (this.f15851q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f15852r), this.f15851q, length, 33);
                }
                if (this.f15853s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f15854t), this.f15853s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f15835a.clear();
            this.f15836b.clear();
            this.f15849o = -1;
            this.f15850p = -1;
            this.f15851q = -1;
            this.f15853s = -1;
            this.f15855u = 0;
        }

        public void f(boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f15837c = true;
            this.f15838d = z10;
            this.f15839e = i10;
            this.f15840f = z11;
            this.f15841g = i11;
            this.f15842h = i12;
            this.f15843i = i14;
            int i17 = i13 + 1;
            if (this.f15844j != i17) {
                this.f15844j = i17;
                while (true) {
                    if (this.f15835a.size() < this.f15844j && this.f15835a.size() < 15) {
                        break;
                    } else {
                        this.f15835a.remove(0);
                    }
                }
            }
            if (i15 != 0 && this.f15846l != i15) {
                this.f15846l = i15;
                int i18 = i15 - 1;
                q(f15826C[i18], f15832x, f15825B[i18], 0, f15834z[i18], f15824A[i18], f15833y[i18]);
            }
            if (i16 == 0 || this.f15847m == i16) {
                return;
            }
            this.f15847m = i16;
            int i19 = i16 - 1;
            m(0, 1, 1, false, false, f15828E[i19], f15827D[i19]);
            n(f15830v, f15829F[i19], f15831w);
        }

        public boolean i() {
            return this.f15837c;
        }

        public boolean j() {
            return !i() || (this.f15835a.isEmpty() && this.f15836b.length() == 0);
        }

        public boolean k() {
            return this.f15838d;
        }

        public void l() {
            e();
            this.f15837c = false;
            this.f15838d = false;
            this.f15839e = 4;
            this.f15840f = false;
            this.f15841g = 0;
            this.f15842h = 0;
            this.f15843i = 0;
            this.f15844j = 15;
            this.f15845k = 0;
            this.f15846l = 0;
            this.f15847m = 0;
            int i10 = f15831w;
            this.f15848n = i10;
            this.f15852r = f15830v;
            this.f15854t = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f15849o != -1) {
                if (!z10) {
                    this.f15836b.setSpan(new StyleSpan(2), this.f15849o, this.f15836b.length(), 33);
                    this.f15849o = -1;
                }
            } else if (z10) {
                this.f15849o = this.f15836b.length();
            }
            if (this.f15850p == -1) {
                if (z11) {
                    this.f15850p = this.f15836b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f15836b.setSpan(new UnderlineSpan(), this.f15850p, this.f15836b.length(), 33);
                this.f15850p = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f15851q != -1 && this.f15852r != i10) {
                this.f15836b.setSpan(new ForegroundColorSpan(this.f15852r), this.f15851q, this.f15836b.length(), 33);
            }
            if (i10 != f15830v) {
                this.f15851q = this.f15836b.length();
                this.f15852r = i10;
            }
            if (this.f15853s != -1 && this.f15854t != i11) {
                this.f15836b.setSpan(new BackgroundColorSpan(this.f15854t), this.f15853s, this.f15836b.length(), 33);
            }
            if (i11 != f15831w) {
                this.f15853s = this.f15836b.length();
                this.f15854t = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f15855u != i10) {
                a('\n');
            }
            this.f15855u = i10;
        }

        public void p(boolean z10) {
            this.f15838d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f15848n = i10;
            this.f15845k = i15;
        }
    }

    /* compiled from: Cea708Decoder.java */
    /* renamed from: T2.c$c, reason: collision with other inner class name */
    private static final class C0232c {

        /* renamed from: a, reason: collision with root package name */
        public final int f15856a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15857b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f15858c;

        /* renamed from: d, reason: collision with root package name */
        int f15859d = 0;

        public C0232c(int i10, int i11) {
            this.f15856a = i10;
            this.f15857b = i11;
            this.f15858c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, List<byte[]> list) {
        this.f15814l = i10 == -1 ? 1 : i10;
        this.f15813k = list != null && C1808e.v(list);
        this.f15815m = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f15815m[i11] = new b();
        }
        this.f15816n = this.f15815m[0];
    }

    private void A(int i10) {
        if (i10 == 32) {
            this.f15816n.a(' ');
        }
        if (i10 == 33) {
            this.f15816n.a((char) 160);
            return;
        }
        if (i10 == 37) {
            this.f15816n.a((char) 8230);
            return;
        }
        if (i10 == 42) {
            this.f15816n.a((char) 352);
            return;
        }
        if (i10 == 44) {
            this.f15816n.a((char) 338);
            return;
        }
        if (i10 == 63) {
            this.f15816n.a((char) 376);
            return;
        }
        if (i10 == 57) {
            this.f15816n.a((char) 8482);
            return;
        }
        if (i10 == 58) {
            this.f15816n.a((char) 353);
            return;
        }
        if (i10 == 60) {
            this.f15816n.a((char) 339);
            return;
        }
        if (i10 == 61) {
            this.f15816n.a((char) 8480);
            return;
        }
        switch (i10) {
            case 48:
                this.f15816n.a((char) 9608);
                break;
            case 49:
                this.f15816n.a((char) 8216);
                break;
            case 50:
                this.f15816n.a((char) 8217);
                break;
            case 51:
                this.f15816n.a((char) 8220);
                break;
            case 52:
                this.f15816n.a((char) 8221);
                break;
            case 53:
                this.f15816n.a((char) 8226);
                break;
            default:
                switch (i10) {
                    case 118:
                        this.f15816n.a((char) 8539);
                        break;
                    case 119:
                        this.f15816n.a((char) 8540);
                        break;
                    case TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES /* 120 */:
                        this.f15816n.a((char) 8541);
                        break;
                    case 121:
                        this.f15816n.a((char) 8542);
                        break;
                    case 122:
                        this.f15816n.a((char) 9474);
                        break;
                    case 123:
                        this.f15816n.a((char) 9488);
                        break;
                    case 124:
                        this.f15816n.a((char) 9492);
                        break;
                    case 125:
                        this.f15816n.a((char) 9472);
                        break;
                    case 126:
                        this.f15816n.a((char) 9496);
                        break;
                    case 127:
                        this.f15816n.a((char) 9484);
                        break;
                    default:
                        n.h("Cea708Decoder", "Invalid G2 character: " + i10);
                        break;
                }
        }
    }

    private void B(int i10) {
        if (i10 == 160) {
            this.f15816n.a((char) 13252);
            return;
        }
        n.h("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f15816n.a('_');
    }

    private void C() {
        this.f15816n.m(this.f15811i.h(4), this.f15811i.h(2), this.f15811i.h(2), this.f15811i.g(), this.f15811i.g(), this.f15811i.h(3), this.f15811i.h(3));
    }

    private void D() {
        int iH = b.h(this.f15811i.h(2), this.f15811i.h(2), this.f15811i.h(2), this.f15811i.h(2));
        int iH2 = b.h(this.f15811i.h(2), this.f15811i.h(2), this.f15811i.h(2), this.f15811i.h(2));
        this.f15811i.r(2);
        this.f15816n.n(iH, iH2, b.g(this.f15811i.h(2), this.f15811i.h(2), this.f15811i.h(2)));
    }

    private void E() {
        this.f15811i.r(4);
        int iH = this.f15811i.h(4);
        this.f15811i.r(2);
        this.f15816n.o(iH, this.f15811i.h(6));
    }

    private void F() {
        int iH = b.h(this.f15811i.h(2), this.f15811i.h(2), this.f15811i.h(2), this.f15811i.h(2));
        int iH2 = this.f15811i.h(2);
        int iG = b.g(this.f15811i.h(2), this.f15811i.h(2), this.f15811i.h(2));
        if (this.f15811i.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f15811i.g();
        int iH3 = this.f15811i.h(2);
        int iH4 = this.f15811i.h(2);
        int iH5 = this.f15811i.h(2);
        this.f15811i.r(8);
        this.f15816n.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    private void G() {
        C0232c c0232c = this.f15819q;
        if (c0232c.f15859d != (c0232c.f15857b * 2) - 1) {
            n.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f15819q.f15857b * 2) - 1) + ", but current index is " + this.f15819q.f15859d + " (sequence number " + this.f15819q.f15856a + ");");
        }
        x xVar = this.f15811i;
        C0232c c0232c2 = this.f15819q;
        xVar.o(c0232c2.f15858c, c0232c2.f15859d);
        boolean z10 = false;
        while (true) {
            if (this.f15811i.b() <= 0) {
                break;
            }
            int iH = this.f15811i.h(3);
            int iH2 = this.f15811i.h(5);
            if (iH == 7) {
                this.f15811i.r(2);
                iH = this.f15811i.h(6);
                if (iH < 7) {
                    n.h("Cea708Decoder", "Invalid extended service number: " + iH);
                }
            }
            if (iH2 == 0) {
                if (iH != 0) {
                    n.h("Cea708Decoder", "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                }
            } else if (iH != this.f15814l) {
                this.f15811i.s(iH2);
            } else {
                int iE = this.f15811i.e() + (iH2 * 8);
                while (this.f15811i.e() < iE) {
                    int iH3 = this.f15811i.h(8);
                    if (iH3 == 16) {
                        int iH4 = this.f15811i.h(8);
                        if (iH4 <= 31) {
                            v(iH4);
                        } else {
                            if (iH4 <= 127) {
                                A(iH4);
                            } else if (iH4 <= 159) {
                                w(iH4);
                            } else if (iH4 <= 255) {
                                B(iH4);
                            } else {
                                n.h("Cea708Decoder", "Invalid extended command: " + iH4);
                            }
                            z10 = true;
                        }
                    } else if (iH3 <= 31) {
                        t(iH3);
                    } else {
                        if (iH3 <= 127) {
                            y(iH3);
                        } else if (iH3 <= 159) {
                            u(iH3);
                        } else if (iH3 <= 255) {
                            z(iH3);
                        } else {
                            n.h("Cea708Decoder", "Invalid base command: " + iH3);
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            this.f15817o = s();
        }
    }

    private void H() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f15815m[i10].l();
        }
    }

    private void r() {
        if (this.f15819q == null) {
            return;
        }
        G();
        this.f15819q = null;
    }

    private List<W1.a> s() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f15815m[i10].j() && this.f15815m[i10].k() && (aVarC = this.f15815m[i10].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.f15821c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f15822a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void t(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f15817o = s();
            }
            if (i10 == 8) {
                this.f15816n.b();
                return;
            }
            switch (i10) {
                case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    H();
                    break;
                case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    this.f15816n.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        n.h("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f15811i.r(8);
                        break;
                    } else if (i10 >= 24 && i10 <= 31) {
                        n.h("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f15811i.r(16);
                        break;
                    } else {
                        n.h("Cea708Decoder", "Invalid C0 command: " + i10);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void u(int i10) {
        int i11 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i12 = i10 - 128;
                if (this.f15820r != i12) {
                    this.f15820r = i12;
                    this.f15816n = this.f15815m[i12];
                    break;
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /* 136 */:
                while (i11 <= 8) {
                    if (this.f15811i.g()) {
                        this.f15815m[8 - i11].e();
                    }
                    i11++;
                }
                break;
            case 137:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f15811i.g()) {
                        this.f15815m[8 - i13].p(true);
                    }
                }
                break;
            case 138:
                while (i11 <= 8) {
                    if (this.f15811i.g()) {
                        this.f15815m[8 - i11].p(false);
                    }
                    i11++;
                }
                break;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f15811i.g()) {
                        this.f15815m[8 - i14].p(!r0.k());
                    }
                }
                break;
            case 140:
                while (i11 <= 8) {
                    if (this.f15811i.g()) {
                        this.f15815m[8 - i11].l();
                    }
                    i11++;
                }
                break;
            case 141:
                this.f15811i.r(8);
                break;
            case 142:
                break;
            case 143:
                H();
                break;
            case 144:
                if (this.f15816n.i()) {
                    C();
                    break;
                } else {
                    this.f15811i.r(16);
                    break;
                }
            case 145:
                if (this.f15816n.i()) {
                    D();
                    break;
                } else {
                    this.f15811i.r(24);
                    break;
                }
            case 146:
                if (this.f15816n.i()) {
                    E();
                    break;
                } else {
                    this.f15811i.r(16);
                    break;
                }
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                n.h("Cea708Decoder", "Invalid C1 command: " + i10);
                break;
            case 151:
                if (this.f15816n.i()) {
                    F();
                    break;
                } else {
                    this.f15811i.r(32);
                    break;
                }
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i15 = i10 - 152;
                x(i15);
                if (this.f15820r != i15) {
                    this.f15820r = i15;
                    this.f15816n = this.f15815m[i15];
                    break;
                }
                break;
        }
    }

    private void v(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f15811i.r(8);
        } else if (i10 <= 23) {
            this.f15811i.r(16);
        } else if (i10 <= 31) {
            this.f15811i.r(24);
        }
    }

    private void w(int i10) {
        if (i10 <= 135) {
            this.f15811i.r(32);
            return;
        }
        if (i10 <= 143) {
            this.f15811i.r(40);
        } else if (i10 <= 159) {
            this.f15811i.r(2);
            this.f15811i.r(this.f15811i.h(6) * 8);
        }
    }

    private void x(int i10) {
        b bVar = this.f15815m[i10];
        this.f15811i.r(2);
        boolean zG = this.f15811i.g();
        this.f15811i.r(2);
        int iH = this.f15811i.h(3);
        boolean zG2 = this.f15811i.g();
        int iH2 = this.f15811i.h(7);
        int iH3 = this.f15811i.h(8);
        int iH4 = this.f15811i.h(4);
        int iH5 = this.f15811i.h(4);
        this.f15811i.r(2);
        this.f15811i.r(6);
        this.f15811i.r(2);
        bVar.f(zG, iH, zG2, iH2, iH3, iH5, iH4, this.f15811i.h(3), this.f15811i.h(3));
    }

    private void y(int i10) {
        if (i10 == 127) {
            this.f15816n.a((char) 9835);
        } else {
            this.f15816n.a((char) (i10 & 255));
        }
    }

    private void z(int i10) {
        this.f15816n.a((char) (i10 & 255));
    }

    @Override // T2.e, c2.d
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // T2.e, S2.l
    public /* bridge */ /* synthetic */ void d(long j10) {
        super.d(j10);
    }

    @Override // T2.e, c2.d
    public void flush() {
        super.flush();
        this.f15817o = null;
        this.f15818p = null;
        this.f15820r = 0;
        this.f15816n = this.f15815m[0];
        H();
        this.f15819q = null;
    }

    @Override // T2.e
    protected k h() {
        List<W1.a> list = this.f15817o;
        this.f15818p = list;
        return new f((List) C1804a.e(list));
    }

    @Override // T2.e
    protected void i(o oVar) {
        ByteBuffer byteBuffer = (ByteBuffer) C1804a.e(oVar.f26293E);
        this.f15810h.U(byteBuffer.array(), byteBuffer.limit());
        while (this.f15810h.a() >= 3) {
            int iH = this.f15810h.H();
            int i10 = iH & 3;
            boolean z10 = (iH & 4) == 4;
            byte bH = (byte) this.f15810h.H();
            byte bH2 = (byte) this.f15810h.H();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        r();
                        int i11 = (bH & 192) >> 6;
                        int i12 = this.f15812j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            H();
                            n.h("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f15812j + " current=" + i11);
                        }
                        this.f15812j = i11;
                        int i13 = bH & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C0232c c0232c = new C0232c(i11, i13);
                        this.f15819q = c0232c;
                        byte[] bArr = c0232c.f15858c;
                        int i14 = c0232c.f15859d;
                        c0232c.f15859d = i14 + 1;
                        bArr[i14] = bH2;
                    } else {
                        C1804a.a(i10 == 2);
                        C0232c c0232c2 = this.f15819q;
                        if (c0232c2 == null) {
                            n.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0232c2.f15858c;
                            int i15 = c0232c2.f15859d;
                            int i16 = i15 + 1;
                            c0232c2.f15859d = i16;
                            bArr2[i15] = bH;
                            c0232c2.f15859d = i15 + 2;
                            bArr2[i16] = bH2;
                        }
                    }
                    C0232c c0232c3 = this.f15819q;
                    if (c0232c3.f15859d == (c0232c3.f15857b * 2) - 1) {
                        r();
                    }
                }
            }
        }
    }

    @Override // T2.e
    /* renamed from: j */
    public /* bridge */ /* synthetic */ o e() {
        return super.e();
    }

    @Override // T2.e
    /* renamed from: k */
    public /* bridge */ /* synthetic */ p a() {
        return super.a();
    }

    @Override // T2.e
    protected boolean n() {
        return this.f15817o != this.f15818p;
    }

    @Override // T2.e
    /* renamed from: o */
    public /* bridge */ /* synthetic */ void g(o oVar) {
        super.g(oVar);
    }
}
