package com.bumptech.glide.load.engine;

import com.bumptech.glide.p145r.C5596j;
import com.bumptech.glide.p145r.p146l.AbstractC5600c;
import com.bumptech.glide.p145r.p146l.C5598a;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: LockedResource.java */
/* renamed from: com.bumptech.glide.load.engine.t */
/* loaded from: classes.dex */
final class C5403t<Z> implements InterfaceC5404u<Z>, C5598a.f {

    /* renamed from: f */
    private static final InterfaceC0956f<C5403t<?>> f13477f = C5598a.m11068d(20, new a());

    /* renamed from: g */
    private final AbstractC5600c f13478g = AbstractC5600c.m11078a();

    /* renamed from: h */
    private InterfaceC5404u<Z> f13479h;

    /* renamed from: i */
    private boolean f13480i;

    /* renamed from: j */
    private boolean f13481j;

    /* compiled from: LockedResource.java */
    /* renamed from: com.bumptech.glide.load.engine.t$a */
    class a implements C5598a.d<C5403t<?>> {
        a() {
        }

        @Override // com.bumptech.glide.p145r.p146l.C5598a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5403t<?> mo10211a() {
            return new C5403t<>();
        }
    }

    C5403t() {
    }

    /* renamed from: a */
    private void m10353a(InterfaceC5404u<Z> interfaceC5404u) {
        this.f13481j = false;
        this.f13480i = true;
        this.f13479h = interfaceC5404u;
    }

    /* renamed from: b */
    static <Z> C5403t<Z> m10354b(InterfaceC5404u<Z> interfaceC5404u) {
        C5403t<Z> c5403t = (C5403t) C5596j.m11042d(f13477f.mo6061b());
        c5403t.m10353a(interfaceC5404u);
        return c5403t;
    }

    /* renamed from: f */
    private void m10355f() {
        this.f13479h = null;
        f13477f.mo6060a(this);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: c */
    public synchronized void mo10340c() {
        this.f13478g.mo11080c();
        this.f13481j = true;
        if (!this.f13480i) {
            this.f13479h.mo10340c();
            m10355f();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: d */
    public int mo10341d() {
        return this.f13479h.mo10341d();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: e */
    public Class<Z> mo10342e() {
        return this.f13479h.mo10342e();
    }

    /* renamed from: g */
    synchronized void m10356g() {
        this.f13478g.mo11080c();
        if (!this.f13480i) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f13480i = false;
        if (this.f13481j) {
            mo10340c();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    public Z get() {
        return this.f13479h.get();
    }

    @Override // com.bumptech.glide.p145r.p146l.C5598a.f
    /* renamed from: u */
    public AbstractC5600c mo10213u() {
        return this.f13478g;
    }
}
