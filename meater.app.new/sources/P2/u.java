package P2;

import X1.y;
import v2.InterfaceC4811q;

/* compiled from: TrackFragment.java */
/* loaded from: classes.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    public c f13890a;

    /* renamed from: b, reason: collision with root package name */
    public long f13891b;

    /* renamed from: c, reason: collision with root package name */
    public long f13892c;

    /* renamed from: d, reason: collision with root package name */
    public long f13893d;

    /* renamed from: e, reason: collision with root package name */
    public int f13894e;

    /* renamed from: f, reason: collision with root package name */
    public int f13895f;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13901l;

    /* renamed from: n, reason: collision with root package name */
    public t f13903n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13905p;

    /* renamed from: q, reason: collision with root package name */
    public long f13906q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13907r;

    /* renamed from: g, reason: collision with root package name */
    public long[] f13896g = new long[0];

    /* renamed from: h, reason: collision with root package name */
    public int[] f13897h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public int[] f13898i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public long[] f13899j = new long[0];

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f13900k = new boolean[0];

    /* renamed from: m, reason: collision with root package name */
    public boolean[] f13902m = new boolean[0];

    /* renamed from: o, reason: collision with root package name */
    public final y f13904o = new y();

    public void a(y yVar) {
        yVar.l(this.f13904o.e(), 0, this.f13904o.g());
        this.f13904o.W(0);
        this.f13905p = false;
    }

    public void b(InterfaceC4811q interfaceC4811q) {
        interfaceC4811q.readFully(this.f13904o.e(), 0, this.f13904o.g());
        this.f13904o.W(0);
        this.f13905p = false;
    }

    public long c(int i10) {
        return this.f13899j[i10];
    }

    public void d(int i10) {
        this.f13904o.S(i10);
        this.f13901l = true;
        this.f13905p = true;
    }

    public void e(int i10, int i11) {
        this.f13894e = i10;
        this.f13895f = i11;
        if (this.f13897h.length < i10) {
            this.f13896g = new long[i10];
            this.f13897h = new int[i10];
        }
        if (this.f13898i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f13898i = new int[i12];
            this.f13899j = new long[i12];
            this.f13900k = new boolean[i12];
            this.f13902m = new boolean[i12];
        }
    }

    public void f() {
        this.f13894e = 0;
        this.f13906q = 0L;
        this.f13907r = false;
        this.f13901l = false;
        this.f13905p = false;
        this.f13903n = null;
    }

    public boolean g(int i10) {
        return this.f13901l && this.f13902m[i10];
    }
}
