package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.p145r.C5596j;

/* compiled from: EngineResource.java */
/* renamed from: com.bumptech.glide.load.engine.p */
/* loaded from: classes.dex */
class C5399p<Z> implements InterfaceC5404u<Z> {

    /* renamed from: f */
    private final boolean f13464f;

    /* renamed from: g */
    private final boolean f13465g;

    /* renamed from: h */
    private final InterfaceC5404u<Z> f13466h;

    /* renamed from: i */
    private a f13467i;

    /* renamed from: j */
    private InterfaceC5423f f13468j;

    /* renamed from: k */
    private int f13469k;

    /* renamed from: l */
    private boolean f13470l;

    /* compiled from: EngineResource.java */
    /* renamed from: com.bumptech.glide.load.engine.p$a */
    interface a {
        /* renamed from: d */
        void mo10308d(InterfaceC5423f interfaceC5423f, C5399p<?> c5399p);
    }

    C5399p(InterfaceC5404u<Z> interfaceC5404u, boolean z, boolean z2) {
        this.f13466h = (InterfaceC5404u) C5596j.m11042d(interfaceC5404u);
        this.f13464f = z;
        this.f13465g = z2;
    }

    /* renamed from: a */
    synchronized void m10338a() {
        if (this.f13470l) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f13469k++;
    }

    /* renamed from: b */
    InterfaceC5404u<Z> m10339b() {
        return this.f13466h;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: c */
    public synchronized void mo10340c() {
        if (this.f13469k > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f13470l) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f13470l = true;
        if (this.f13465g) {
            this.f13466h.mo10340c();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: d */
    public int mo10341d() {
        return this.f13466h.mo10341d();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: e */
    public Class<Z> mo10342e() {
        return this.f13466h.mo10342e();
    }

    /* renamed from: f */
    boolean m10343f() {
        return this.f13464f;
    }

    /* renamed from: g */
    void m10344g() {
        synchronized (this.f13467i) {
            synchronized (this) {
                int i2 = this.f13469k;
                if (i2 <= 0) {
                    throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
                }
                int i3 = i2 - 1;
                this.f13469k = i3;
                if (i3 == 0) {
                    this.f13467i.mo10308d(this.f13468j, this);
                }
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    public Z get() {
        return this.f13466h.get();
    }

    /* renamed from: h */
    synchronized void m10345h(InterfaceC5423f interfaceC5423f, a aVar) {
        this.f13468j = interfaceC5423f;
        this.f13467i = aVar;
    }

    public synchronized String toString() {
        return "EngineResource{isCacheable=" + this.f13464f + ", listener=" + this.f13467i + ", key=" + this.f13468j + ", acquired=" + this.f13469k + ", isRecycled=" + this.f13470l + ", resource=" + this.f13466h + '}';
    }
}
