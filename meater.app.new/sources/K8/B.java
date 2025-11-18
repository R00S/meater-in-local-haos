package K8;

import com.google.firebase.components.DependencyException;
import j9.InterfaceC3754a;
import j9.InterfaceC3755b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RestrictedComponentContainer.java */
/* loaded from: classes2.dex */
final class B implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Set<A<?>> f8732a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<A<?>> f8733b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<A<?>> f8734c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<A<?>> f8735d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<A<?>> f8736e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f8737f;

    /* renamed from: g, reason: collision with root package name */
    private final d f8738g;

    /* compiled from: RestrictedComponentContainer.java */
    private static class a implements g9.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set<Class<?>> f8739a;

        /* renamed from: b, reason: collision with root package name */
        private final g9.c f8740b;

        public a(Set<Class<?>> set, g9.c cVar) {
            this.f8739a = set;
            this.f8740b = cVar;
        }
    }

    B(c<?> cVar, d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : cVar.g()) {
            if (qVar.e()) {
                if (qVar.g()) {
                    hashSet4.add(qVar.c());
                } else {
                    hashSet.add(qVar.c());
                }
            } else if (qVar.d()) {
                hashSet3.add(qVar.c());
            } else if (qVar.g()) {
                hashSet5.add(qVar.c());
            } else {
                hashSet2.add(qVar.c());
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(A.b(g9.c.class));
        }
        this.f8732a = Collections.unmodifiableSet(hashSet);
        this.f8733b = Collections.unmodifiableSet(hashSet2);
        this.f8734c = Collections.unmodifiableSet(hashSet3);
        this.f8735d = Collections.unmodifiableSet(hashSet4);
        this.f8736e = Collections.unmodifiableSet(hashSet5);
        this.f8737f = cVar.k();
        this.f8738g = dVar;
    }

    @Override // K8.d
    public <T> T a(Class<T> cls) {
        if (!this.f8732a.contains(A.b(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t10 = (T) this.f8738g.a(cls);
        return !cls.equals(g9.c.class) ? t10 : (T) new a(this.f8737f, (g9.c) t10);
    }

    @Override // K8.d
    public <T> InterfaceC3754a<T> b(A<T> a10) {
        if (this.f8734c.contains(a10)) {
            return this.f8738g.b(a10);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", a10));
    }

    @Override // K8.d
    public <T> InterfaceC3755b<Set<T>> c(A<T> a10) {
        if (this.f8736e.contains(a10)) {
            return this.f8738g.c(a10);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", a10));
    }

    @Override // K8.d
    public <T> InterfaceC3755b<T> d(Class<T> cls) {
        return f(A.b(cls));
    }

    @Override // K8.d
    public <T> InterfaceC3755b<T> f(A<T> a10) {
        if (this.f8733b.contains(a10)) {
            return this.f8738g.f(a10);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", a10));
    }

    @Override // K8.d
    public <T> T g(A<T> a10) {
        if (this.f8732a.contains(a10)) {
            return (T) this.f8738g.g(a10);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", a10));
    }

    @Override // K8.d
    public <T> Set<T> h(A<T> a10) {
        if (this.f8735d.contains(a10)) {
            return this.f8738g.h(a10);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", a10));
    }

    @Override // K8.d
    public <T> InterfaceC3754a<T> i(Class<T> cls) {
        return b(A.b(cls));
    }
}
