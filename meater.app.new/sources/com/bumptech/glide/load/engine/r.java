package com.bumptech.glide.load.engine;

import I6.a;
import o6.InterfaceC4139c;
import r1.InterfaceC4339f;

/* compiled from: LockedResource.java */
/* loaded from: classes2.dex */
final class r<Z> implements InterfaceC4139c<Z>, a.f {

    /* renamed from: F, reason: collision with root package name */
    private static final InterfaceC4339f<r<?>> f33253F = I6.a.d(20, new a());

    /* renamed from: B, reason: collision with root package name */
    private final I6.c f33254B = I6.c.a();

    /* renamed from: C, reason: collision with root package name */
    private InterfaceC4139c<Z> f33255C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f33256D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f33257E;

    /* compiled from: LockedResource.java */
    class a implements a.d<r<?>> {
        a() {
        }

        @Override // I6.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r<?> a() {
            return new r<>();
        }
    }

    r() {
    }

    private void b(InterfaceC4139c<Z> interfaceC4139c) {
        this.f33257E = false;
        this.f33256D = true;
        this.f33255C = interfaceC4139c;
    }

    static <Z> r<Z> e(InterfaceC4139c<Z> interfaceC4139c) {
        r<Z> rVar = (r) H6.k.d(f33253F.b());
        rVar.b(interfaceC4139c);
        return rVar;
    }

    private void f() {
        this.f33255C = null;
        f33253F.a(this);
    }

    @Override // o6.InterfaceC4139c
    public int a() {
        return this.f33255C.a();
    }

    @Override // o6.InterfaceC4139c
    public synchronized void c() {
        this.f33254B.c();
        this.f33257E = true;
        if (!this.f33256D) {
            this.f33255C.c();
            f();
        }
    }

    @Override // o6.InterfaceC4139c
    public Class<Z> d() {
        return this.f33255C.d();
    }

    synchronized void g() {
        this.f33254B.c();
        if (!this.f33256D) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f33256D = false;
        if (this.f33257E) {
            c();
        }
    }

    @Override // o6.InterfaceC4139c
    public Z get() {
        return this.f33255C.get();
    }

    @Override // I6.a.f
    public I6.c p() {
        return this.f33254B;
    }
}
