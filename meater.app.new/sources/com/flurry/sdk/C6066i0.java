package com.flurry.sdk;

/* renamed from: com.flurry.sdk.i0 */
/* loaded from: classes2.dex */
public final class C6066i0 extends C6027d7<C6057h0> {

    /* renamed from: p */
    private C6110n f15968p;

    /* renamed from: q */
    private C6020d0 f15969q;

    /* renamed from: r */
    private C6119o f15970r;

    /* renamed from: s */
    private InterfaceC6046f7<C6011c0> f15971s;

    /* renamed from: t */
    private InterfaceC6046f7<C6110n> f15972t;

    /* renamed from: com.flurry.sdk.i0$a */
    final class a implements InterfaceC6046f7<C6011c0> {

        /* renamed from: com.flurry.sdk.i0$a$a, reason: collision with other inner class name */
        final class C11469a extends AbstractRunnableC6041f2 {

            /* renamed from: h */
            final /* synthetic */ C6011c0 f15974h;

            C11469a(C6011c0 c6011c0) {
                this.f15974h = c6011c0;
            }

            @Override // com.flurry.sdk.AbstractRunnableC6041f2
            /* renamed from: a */
            public final void mo12950a() throws Exception {
                C6066i0.this.m13048t(this.f15974h.f15707e.equals(EnumC6030e0.SESSION_START) ? new C6057h0(true, C6066i0.this.f15968p) : new C6057h0(false, C6066i0.this.f15968p));
            }
        }

        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6046f7
        /* renamed from: a */
        public final /* synthetic */ void mo12962a(C6011c0 c6011c0) {
            C6066i0.this.mo13007m(new C11469a(c6011c0));
        }
    }

    /* renamed from: com.flurry.sdk.i0$b */
    final class b implements InterfaceC6046f7<C6110n> {

        /* renamed from: com.flurry.sdk.i0$b$a */
        final class a extends AbstractRunnableC6041f2 {

            /* renamed from: h */
            final /* synthetic */ C6110n f15977h;

            a(C6110n c6110n) {
                this.f15977h = c6110n;
            }

            @Override // com.flurry.sdk.AbstractRunnableC6041f2
            /* renamed from: a */
            public final void mo12950a() throws Exception {
                C6021d1.m13030c(3, "SessionPropertyProvider", "Receive instant app data");
                C6066i0.this.f15968p = this.f15977h;
            }
        }

        b() {
        }

        @Override // com.flurry.sdk.InterfaceC6046f7
        /* renamed from: a */
        public final /* synthetic */ void mo12962a(C6110n c6110n) {
            C6066i0.this.mo13007m(new a(c6110n));
        }
    }

    public C6066i0(C6020d0 c6020d0, C6119o c6119o) {
        super("SessionPropertyProvider");
        this.f15971s = new a();
        this.f15972t = new b();
        this.f15969q = c6020d0;
        c6020d0.mo13050v(this.f15971s);
        this.f15970r = c6119o;
        c6119o.mo13050v(this.f15972t);
    }
}
