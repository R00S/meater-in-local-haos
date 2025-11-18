package com.google.firebase.components;

import com.google.firebase.p205s.InterfaceC8495a;
import com.google.firebase.p205s.InterfaceC8496b;

/* compiled from: OptionalProvider.java */
/* renamed from: com.google.firebase.components.z */
/* loaded from: classes2.dex */
class C8136z<T> implements InterfaceC8496b<T>, InterfaceC8495a<T> {

    /* renamed from: a */
    private static final InterfaceC8495a.a<Object> f30748a = new InterfaceC8495a.a() { // from class: com.google.firebase.components.k
        @Override // com.google.firebase.p205s.InterfaceC8495a.a
        /* renamed from: a */
        public final void mo24982a(InterfaceC8496b interfaceC8496b) {
            C8136z.m25080c(interfaceC8496b);
        }
    };

    /* renamed from: b */
    private static final InterfaceC8496b<Object> f30749b = new InterfaceC8496b() { // from class: com.google.firebase.components.j
        @Override // com.google.firebase.p205s.InterfaceC8496b
        public final Object get() {
            C8136z.m25081d();
            return null;
        }
    };

    /* renamed from: c */
    private InterfaceC8495a.a<T> f30750c;

    /* renamed from: d */
    private volatile InterfaceC8496b<T> f30751d;

    private C8136z(InterfaceC8495a.a<T> aVar, InterfaceC8496b<T> interfaceC8496b) {
        this.f30750c = aVar;
        this.f30751d = interfaceC8496b;
    }

    /* renamed from: b */
    static <T> C8136z<T> m25079b() {
        return new C8136z<>(f30748a, f30749b);
    }

    /* renamed from: c */
    static /* synthetic */ void m25080c(InterfaceC8496b interfaceC8496b) {
    }

    /* renamed from: d */
    static /* synthetic */ Object m25081d() {
        return null;
    }

    /* renamed from: e */
    static /* synthetic */ void m25082e(InterfaceC8495a.a aVar, InterfaceC8495a.a aVar2, InterfaceC8496b interfaceC8496b) {
        aVar.mo24982a(interfaceC8496b);
        aVar2.mo24982a(interfaceC8496b);
    }

    /* renamed from: f */
    static <T> C8136z<T> m25083f(InterfaceC8496b<T> interfaceC8496b) {
        return new C8136z<>(null, interfaceC8496b);
    }

    @Override // com.google.firebase.p205s.InterfaceC8495a
    /* renamed from: a */
    public void mo25084a(final InterfaceC8495a.a<T> aVar) {
        InterfaceC8496b<T> interfaceC8496b;
        InterfaceC8496b<T> interfaceC8496b2 = this.f30751d;
        InterfaceC8496b<Object> interfaceC8496b3 = f30749b;
        if (interfaceC8496b2 != interfaceC8496b3) {
            aVar.mo24982a(interfaceC8496b2);
            return;
        }
        InterfaceC8496b<T> interfaceC8496b4 = null;
        synchronized (this) {
            interfaceC8496b = this.f30751d;
            if (interfaceC8496b != interfaceC8496b3) {
                interfaceC8496b4 = interfaceC8496b;
            } else {
                final InterfaceC8495a.a<T> aVar2 = this.f30750c;
                this.f30750c = new InterfaceC8495a.a() { // from class: com.google.firebase.components.l
                    @Override // com.google.firebase.p205s.InterfaceC8495a.a
                    /* renamed from: a */
                    public final void mo24982a(InterfaceC8496b interfaceC8496b5) {
                        C8136z.m25082e(aVar2, aVar, interfaceC8496b5);
                    }
                };
            }
        }
        if (interfaceC8496b4 != null) {
            aVar.mo24982a(interfaceC8496b);
        }
    }

    /* renamed from: g */
    void m25085g(InterfaceC8496b<T> interfaceC8496b) {
        InterfaceC8495a.a<T> aVar;
        if (this.f30751d != f30749b) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f30750c;
            this.f30750c = null;
            this.f30751d = interfaceC8496b;
        }
        aVar.mo24982a(interfaceC8496b);
    }

    @Override // com.google.firebase.p205s.InterfaceC8496b
    public T get() {
        return this.f30751d.get();
    }
}
