package com.bumptech.glide.p141p;

/* compiled from: ErrorRequestCoordinator.java */
/* renamed from: com.bumptech.glide.p.b */
/* loaded from: classes.dex */
public final class C5559b implements InterfaceC5562e, InterfaceC5561d {

    /* renamed from: f */
    private final InterfaceC5562e f13935f;

    /* renamed from: g */
    private InterfaceC5561d f13936g;

    /* renamed from: h */
    private InterfaceC5561d f13937h;

    public C5559b(InterfaceC5562e interfaceC5562e) {
        this.f13935f = interfaceC5562e;
    }

    /* renamed from: n */
    private boolean m10921n(InterfaceC5561d interfaceC5561d) {
        return interfaceC5561d.equals(this.f13936g) || (this.f13936g.mo10933h() && interfaceC5561d.equals(this.f13937h));
    }

    /* renamed from: o */
    private boolean m10922o() {
        InterfaceC5562e interfaceC5562e = this.f13935f;
        return interfaceC5562e == null || interfaceC5562e.mo10938m(this);
    }

    /* renamed from: p */
    private boolean m10923p() {
        InterfaceC5562e interfaceC5562e = this.f13935f;
        return interfaceC5562e == null || interfaceC5562e.mo10932g(this);
    }

    /* renamed from: q */
    private boolean m10924q() {
        InterfaceC5562e interfaceC5562e = this.f13935f;
        return interfaceC5562e == null || interfaceC5562e.mo10935j(this);
    }

    /* renamed from: r */
    private boolean m10925r() {
        InterfaceC5562e interfaceC5562e = this.f13935f;
        return interfaceC5562e != null && interfaceC5562e.mo10927b();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5562e
    /* renamed from: a */
    public void mo10926a(InterfaceC5561d interfaceC5561d) {
        if (!interfaceC5561d.equals(this.f13937h)) {
            if (this.f13937h.isRunning()) {
                return;
            }
            this.f13937h.mo10929d();
        } else {
            InterfaceC5562e interfaceC5562e = this.f13935f;
            if (interfaceC5562e != null) {
                interfaceC5562e.mo10926a(this);
            }
        }
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5562e
    /* renamed from: b */
    public boolean mo10927b() {
        return m10925r() || mo10931f();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5561d
    /* renamed from: c */
    public void mo10928c() {
        this.f13936g.mo10928c();
        this.f13937h.mo10928c();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5561d
    public void clear() {
        this.f13936g.clear();
        if (this.f13937h.isRunning()) {
            this.f13937h.clear();
        }
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5561d
    /* renamed from: d */
    public void mo10929d() {
        if (this.f13936g.isRunning()) {
            return;
        }
        this.f13936g.mo10929d();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5561d
    /* renamed from: e */
    public boolean mo10930e(InterfaceC5561d interfaceC5561d) {
        if (!(interfaceC5561d instanceof C5559b)) {
            return false;
        }
        C5559b c5559b = (C5559b) interfaceC5561d;
        return this.f13936g.mo10930e(c5559b.f13936g) && this.f13937h.mo10930e(c5559b.f13937h);
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5561d
    /* renamed from: f */
    public boolean mo10931f() {
        return (this.f13936g.mo10933h() ? this.f13937h : this.f13936g).mo10931f();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5562e
    /* renamed from: g */
    public boolean mo10932g(InterfaceC5561d interfaceC5561d) {
        return m10923p() && m10921n(interfaceC5561d);
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5561d
    /* renamed from: h */
    public boolean mo10933h() {
        return this.f13936g.mo10933h() && this.f13937h.mo10933h();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5561d
    /* renamed from: i */
    public boolean mo10934i() {
        return (this.f13936g.mo10933h() ? this.f13937h : this.f13936g).mo10934i();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5561d
    public boolean isRunning() {
        return (this.f13936g.mo10933h() ? this.f13937h : this.f13936g).isRunning();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5562e
    /* renamed from: j */
    public boolean mo10935j(InterfaceC5561d interfaceC5561d) {
        return m10924q() && m10921n(interfaceC5561d);
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5562e
    /* renamed from: k */
    public void mo10936k(InterfaceC5561d interfaceC5561d) {
        InterfaceC5562e interfaceC5562e = this.f13935f;
        if (interfaceC5562e != null) {
            interfaceC5562e.mo10936k(this);
        }
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5561d
    /* renamed from: l */
    public boolean mo10937l() {
        return (this.f13936g.mo10933h() ? this.f13937h : this.f13936g).mo10937l();
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5562e
    /* renamed from: m */
    public boolean mo10938m(InterfaceC5561d interfaceC5561d) {
        return m10922o() && m10921n(interfaceC5561d);
    }

    /* renamed from: s */
    public void m10939s(InterfaceC5561d interfaceC5561d, InterfaceC5561d interfaceC5561d2) {
        this.f13936g = interfaceC5561d;
        this.f13937h = interfaceC5561d2;
    }
}
