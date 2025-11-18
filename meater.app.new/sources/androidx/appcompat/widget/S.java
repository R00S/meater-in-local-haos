package androidx.appcompat.widget;

/* compiled from: RtlSpacingHelper.java */
/* loaded from: classes.dex */
class S {

    /* renamed from: a, reason: collision with root package name */
    private int f21354a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f21355b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f21356c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f21357d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f21358e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f21359f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f21360g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21361h = false;

    S() {
    }

    public int a() {
        return this.f21360g ? this.f21354a : this.f21355b;
    }

    public int b() {
        return this.f21354a;
    }

    public int c() {
        return this.f21355b;
    }

    public int d() {
        return this.f21360g ? this.f21355b : this.f21354a;
    }

    public void e(int i10, int i11) {
        this.f21361h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f21358e = i10;
            this.f21354a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f21359f = i11;
            this.f21355b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f21360g) {
            return;
        }
        this.f21360g = z10;
        if (!this.f21361h) {
            this.f21354a = this.f21358e;
            this.f21355b = this.f21359f;
            return;
        }
        if (z10) {
            int i10 = this.f21357d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f21358e;
            }
            this.f21354a = i10;
            int i11 = this.f21356c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f21359f;
            }
            this.f21355b = i11;
            return;
        }
        int i12 = this.f21356c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f21358e;
        }
        this.f21354a = i12;
        int i13 = this.f21357d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f21359f;
        }
        this.f21355b = i13;
    }

    public void g(int i10, int i11) {
        this.f21356c = i10;
        this.f21357d = i11;
        this.f21361h = true;
        if (this.f21360g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f21354a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f21355b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f21354a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f21355b = i11;
        }
    }
}
