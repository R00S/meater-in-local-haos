package com.rd;

import S9.b;

/* compiled from: IndicatorManager.java */
/* loaded from: classes2.dex */
public class a implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private W9.a f39504a;

    /* renamed from: b, reason: collision with root package name */
    private R9.a f39505b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0502a f39506c;

    /* compiled from: IndicatorManager.java */
    /* renamed from: com.rd.a$a, reason: collision with other inner class name */
    interface InterfaceC0502a {
        void b();
    }

    a(InterfaceC0502a interfaceC0502a) {
        this.f39506c = interfaceC0502a;
        W9.a aVar = new W9.a();
        this.f39504a = aVar;
        this.f39505b = new R9.a(aVar.b(), this);
    }

    @Override // S9.b.a
    public void a(T9.a aVar) {
        this.f39504a.g(aVar);
        InterfaceC0502a interfaceC0502a = this.f39506c;
        if (interfaceC0502a != null) {
            interfaceC0502a.b();
        }
    }

    public R9.a b() {
        return this.f39505b;
    }

    public W9.a c() {
        return this.f39504a;
    }

    public Y9.a d() {
        return this.f39504a.b();
    }
}
