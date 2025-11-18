package androidx.work;

import android.os.Build;

/* compiled from: Constraints.java */
/* renamed from: androidx.work.c */
/* loaded from: classes.dex */
public final class C0704c {

    /* renamed from: a */
    public static final C0704c f4490a = new a().m4816a();

    /* renamed from: b */
    private EnumC0808o f4491b;

    /* renamed from: c */
    private boolean f4492c;

    /* renamed from: d */
    private boolean f4493d;

    /* renamed from: e */
    private boolean f4494e;

    /* renamed from: f */
    private boolean f4495f;

    /* renamed from: g */
    private long f4496g;

    /* renamed from: h */
    private long f4497h;

    /* renamed from: i */
    private C0705d f4498i;

    /* compiled from: Constraints.java */
    /* renamed from: androidx.work.c$a */
    public static final class a {

        /* renamed from: a */
        boolean f4499a = false;

        /* renamed from: b */
        boolean f4500b = false;

        /* renamed from: c */
        EnumC0808o f4501c = EnumC0808o.NOT_REQUIRED;

        /* renamed from: d */
        boolean f4502d = false;

        /* renamed from: e */
        boolean f4503e = false;

        /* renamed from: f */
        long f4504f = -1;

        /* renamed from: g */
        long f4505g = -1;

        /* renamed from: h */
        C0705d f4506h = new C0705d();

        /* renamed from: a */
        public C0704c m4816a() {
            return new C0704c(this);
        }

        /* renamed from: b */
        public a m4817b(EnumC0808o enumC0808o) {
            this.f4501c = enumC0808o;
            return this;
        }
    }

    public C0704c() {
        this.f4491b = EnumC0808o.NOT_REQUIRED;
        this.f4496g = -1L;
        this.f4497h = -1L;
        this.f4498i = new C0705d();
    }

    /* renamed from: a */
    public C0705d m4799a() {
        return this.f4498i;
    }

    /* renamed from: b */
    public EnumC0808o m4800b() {
        return this.f4491b;
    }

    /* renamed from: c */
    public long m4801c() {
        return this.f4496g;
    }

    /* renamed from: d */
    public long m4802d() {
        return this.f4497h;
    }

    /* renamed from: e */
    public boolean m4803e() {
        return this.f4498i.m4820c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0704c.class != obj.getClass()) {
            return false;
        }
        C0704c c0704c = (C0704c) obj;
        if (this.f4492c == c0704c.f4492c && this.f4493d == c0704c.f4493d && this.f4494e == c0704c.f4494e && this.f4495f == c0704c.f4495f && this.f4496g == c0704c.f4496g && this.f4497h == c0704c.f4497h && this.f4491b == c0704c.f4491b) {
            return this.f4498i.equals(c0704c.f4498i);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m4804f() {
        return this.f4494e;
    }

    /* renamed from: g */
    public boolean m4805g() {
        return this.f4492c;
    }

    /* renamed from: h */
    public boolean m4806h() {
        return this.f4493d;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f4491b.hashCode() * 31) + (this.f4492c ? 1 : 0)) * 31) + (this.f4493d ? 1 : 0)) * 31) + (this.f4494e ? 1 : 0)) * 31) + (this.f4495f ? 1 : 0)) * 31;
        long j2 = this.f4496g;
        int i2 = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f4497h;
        return ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f4498i.hashCode();
    }

    /* renamed from: i */
    public boolean m4807i() {
        return this.f4495f;
    }

    /* renamed from: j */
    public void m4808j(C0705d c0705d) {
        this.f4498i = c0705d;
    }

    /* renamed from: k */
    public void m4809k(EnumC0808o enumC0808o) {
        this.f4491b = enumC0808o;
    }

    /* renamed from: l */
    public void m4810l(boolean z) {
        this.f4494e = z;
    }

    /* renamed from: m */
    public void m4811m(boolean z) {
        this.f4492c = z;
    }

    /* renamed from: n */
    public void m4812n(boolean z) {
        this.f4493d = z;
    }

    /* renamed from: o */
    public void m4813o(boolean z) {
        this.f4495f = z;
    }

    /* renamed from: p */
    public void m4814p(long j2) {
        this.f4496g = j2;
    }

    /* renamed from: q */
    public void m4815q(long j2) {
        this.f4497h = j2;
    }

    C0704c(a aVar) {
        this.f4491b = EnumC0808o.NOT_REQUIRED;
        this.f4496g = -1L;
        this.f4497h = -1L;
        this.f4498i = new C0705d();
        this.f4492c = aVar.f4499a;
        int i2 = Build.VERSION.SDK_INT;
        this.f4493d = i2 >= 23 && aVar.f4500b;
        this.f4491b = aVar.f4501c;
        this.f4494e = aVar.f4502d;
        this.f4495f = aVar.f4503e;
        if (i2 >= 24) {
            this.f4498i = aVar.f4506h;
            this.f4496g = aVar.f4504f;
            this.f4497h = aVar.f4505g;
        }
    }

    public C0704c(C0704c c0704c) {
        this.f4491b = EnumC0808o.NOT_REQUIRED;
        this.f4496g = -1L;
        this.f4497h = -1L;
        this.f4498i = new C0705d();
        this.f4492c = c0704c.f4492c;
        this.f4493d = c0704c.f4493d;
        this.f4491b = c0704c.f4491b;
        this.f4494e = c0704c.f4494e;
        this.f4495f = c0704c.f4495f;
        this.f4498i = c0704c.f4498i;
    }
}
