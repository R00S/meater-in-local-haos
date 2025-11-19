package com.bumptech.glide.load.engine;

import m6.InterfaceC3970e;
import o6.InterfaceC4139c;

/* compiled from: EngineResource.java */
/* loaded from: classes2.dex */
class o<Z> implements InterfaceC4139c<Z> {

    /* renamed from: B, reason: collision with root package name */
    private final boolean f33240B;

    /* renamed from: C, reason: collision with root package name */
    private final boolean f33241C;

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC4139c<Z> f33242D;

    /* renamed from: E, reason: collision with root package name */
    private final a f33243E;

    /* renamed from: F, reason: collision with root package name */
    private final InterfaceC3970e f33244F;

    /* renamed from: G, reason: collision with root package name */
    private int f33245G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f33246H;

    /* compiled from: EngineResource.java */
    interface a {
        void c(InterfaceC3970e interfaceC3970e, o<?> oVar);
    }

    o(InterfaceC4139c<Z> interfaceC4139c, boolean z10, boolean z11, InterfaceC3970e interfaceC3970e, a aVar) {
        this.f33242D = (InterfaceC4139c) H6.k.d(interfaceC4139c);
        this.f33240B = z10;
        this.f33241C = z11;
        this.f33244F = interfaceC3970e;
        this.f33243E = (a) H6.k.d(aVar);
    }

    @Override // o6.InterfaceC4139c
    public int a() {
        return this.f33242D.a();
    }

    synchronized void b() {
        if (this.f33246H) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f33245G++;
    }

    @Override // o6.InterfaceC4139c
    public synchronized void c() {
        if (this.f33245G > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f33246H) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f33246H = true;
        if (this.f33241C) {
            this.f33242D.c();
        }
    }

    @Override // o6.InterfaceC4139c
    public Class<Z> d() {
        return this.f33242D.d();
    }

    InterfaceC4139c<Z> e() {
        return this.f33242D;
    }

    boolean f() {
        return this.f33240B;
    }

    void g() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f33245G;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f33245G = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f33243E.c(this.f33244F, this);
        }
    }

    @Override // o6.InterfaceC4139c
    public Z get() {
        return this.f33242D.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f33240B + ", listener=" + this.f33243E + ", key=" + this.f33244F + ", acquired=" + this.f33245G + ", isRecycled=" + this.f33246H + ", resource=" + this.f33242D + '}';
    }
}
