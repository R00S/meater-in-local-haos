package com.google.firebase.components;

import com.google.firebase.p203q.InterfaceC8481c;
import com.google.firebase.p205s.InterfaceC8495a;
import com.google.firebase.p205s.InterfaceC8496b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RestrictedComponentContainer.java */
/* renamed from: com.google.firebase.components.c0 */
/* loaded from: classes2.dex */
final class C8113c0 implements InterfaceC8126p {

    /* renamed from: a */
    private final Set<C8111b0<?>> f30677a;

    /* renamed from: b */
    private final Set<C8111b0<?>> f30678b;

    /* renamed from: c */
    private final Set<C8111b0<?>> f30679c;

    /* renamed from: d */
    private final Set<C8111b0<?>> f30680d;

    /* renamed from: e */
    private final Set<C8111b0<?>> f30681e;

    /* renamed from: f */
    private final Set<Class<?>> f30682f;

    /* renamed from: g */
    private final InterfaceC8126p f30683g;

    /* compiled from: RestrictedComponentContainer.java */
    /* renamed from: com.google.firebase.components.c0$a */
    private static class a implements InterfaceC8481c {

        /* renamed from: a */
        private final Set<Class<?>> f30684a;

        /* renamed from: b */
        private final InterfaceC8481c f30685b;

        public a(Set<Class<?>> set, InterfaceC8481c interfaceC8481c) {
            this.f30684a = set;
            this.f30685b = interfaceC8481c;
        }
    }

    C8113c0(C8124n<?> c8124n, InterfaceC8126p interfaceC8126p) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C8132v c8132v : c8124n.m24993e()) {
            if (c8132v.m25066e()) {
                if (c8132v.m25068g()) {
                    hashSet4.add(c8132v.m25064c());
                } else {
                    hashSet.add(c8132v.m25064c());
                }
            } else if (c8132v.m25065d()) {
                hashSet3.add(c8132v.m25064c());
            } else if (c8132v.m25068g()) {
                hashSet5.add(c8132v.m25064c());
            } else {
                hashSet2.add(c8132v.m25064c());
            }
        }
        if (!c8124n.m24997i().isEmpty()) {
            hashSet.add(C8111b0.m24972b(InterfaceC8481c.class));
        }
        this.f30677a = Collections.unmodifiableSet(hashSet);
        this.f30678b = Collections.unmodifiableSet(hashSet2);
        this.f30679c = Collections.unmodifiableSet(hashSet3);
        this.f30680d = Collections.unmodifiableSet(hashSet4);
        this.f30681e = Collections.unmodifiableSet(hashSet5);
        this.f30682f = c8124n.m24997i();
        this.f30683g = interfaceC8126p;
    }

    @Override // com.google.firebase.components.InterfaceC8126p
    /* renamed from: a */
    public <T> T mo24973a(Class<T> cls) {
        if (!this.f30677a.contains(C8111b0.m24972b(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.f30683g.mo24973a(cls);
        return !cls.equals(InterfaceC8481c.class) ? t : (T) new a(this.f30682f, (InterfaceC8481c) t);
    }

    @Override // com.google.firebase.components.InterfaceC8126p
    /* renamed from: b */
    public <T> InterfaceC8496b<T> mo24974b(C8111b0<T> c8111b0) {
        if (this.f30678b.contains(c8111b0)) {
            return this.f30683g.mo24974b(c8111b0);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", c8111b0));
    }

    @Override // com.google.firebase.components.InterfaceC8126p
    /* renamed from: c */
    public <T> InterfaceC8496b<T> mo24975c(Class<T> cls) {
        return mo24974b(C8111b0.m24972b(cls));
    }

    @Override // com.google.firebase.components.InterfaceC8126p
    /* renamed from: d */
    public <T> Set<T> mo24976d(C8111b0<T> c8111b0) {
        if (this.f30680d.contains(c8111b0)) {
            return this.f30683g.mo24976d(c8111b0);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", c8111b0));
    }

    @Override // com.google.firebase.components.InterfaceC8126p
    /* renamed from: e */
    public <T> InterfaceC8496b<Set<T>> mo24977e(C8111b0<T> c8111b0) {
        if (this.f30681e.contains(c8111b0)) {
            return this.f30683g.mo24977e(c8111b0);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", c8111b0));
    }

    @Override // com.google.firebase.components.InterfaceC8126p
    /* renamed from: f */
    public <T> T mo24978f(C8111b0<T> c8111b0) {
        if (this.f30677a.contains(c8111b0)) {
            return (T) this.f30683g.mo24978f(c8111b0);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", c8111b0));
    }

    @Override // com.google.firebase.components.InterfaceC8126p
    /* renamed from: g */
    public /* synthetic */ Set mo24979g(Class cls) {
        return C8125o.m25017f(this, cls);
    }

    @Override // com.google.firebase.components.InterfaceC8126p
    /* renamed from: h */
    public <T> InterfaceC8495a<T> mo24980h(C8111b0<T> c8111b0) {
        if (this.f30679c.contains(c8111b0)) {
            return this.f30683g.mo24980h(c8111b0);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", c8111b0));
    }

    @Override // com.google.firebase.components.InterfaceC8126p
    /* renamed from: i */
    public <T> InterfaceC8495a<T> mo24981i(Class<T> cls) {
        return mo24980h(C8111b0.m24972b(cls));
    }
}
