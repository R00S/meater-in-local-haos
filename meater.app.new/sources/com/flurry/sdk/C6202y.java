package com.flurry.sdk;

/* renamed from: com.flurry.sdk.y */
/* loaded from: classes2.dex */
public final class C6202y extends C6027d7<C6194x> {

    /* renamed from: p */
    public String f16517p;

    /* renamed from: q */
    public boolean f16518q;

    /* renamed from: r */
    private C6064h7 f16519r;

    /* renamed from: s */
    protected InterfaceC6046f7<C6073i7> f16520s;

    /* renamed from: com.flurry.sdk.y$a */
    final class a implements InterfaceC6046f7<C6073i7> {
        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6046f7
        /* renamed from: a */
        public final /* synthetic */ void mo12962a(C6073i7 c6073i7) {
            C6202y c6202y = C6202y.this;
            c6202y.m13048t(new C6194x(c6202y.f16517p, C6202y.this.f16518q));
        }
    }

    /* renamed from: com.flurry.sdk.y$b */
    final class b extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6046f7 f16522h;

        /* renamed from: i */
        final /* synthetic */ C6194x f16523i;

        b(InterfaceC6046f7 interfaceC6046f7, C6194x c6194x) {
            this.f16522h = interfaceC6046f7;
            this.f16523i = c6194x;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() {
            this.f16522h.mo12962a(this.f16523i);
        }
    }

    public C6202y(C6064h7 c6064h7) {
        super("NotificationProvider");
        this.f16518q = false;
        a aVar = new a();
        this.f16520s = aVar;
        this.f16519r = c6064h7;
        c6064h7.mo13050v(aVar);
    }

    @Override // com.flurry.sdk.C6027d7
    /* renamed from: v */
    public final void mo13050v(InterfaceC6046f7<C6194x> interfaceC6046f7) {
        super.mo13050v(interfaceC6046f7);
        mo13007m(new b(interfaceC6046f7, new C6194x(this.f16517p, this.f16518q)));
    }
}
