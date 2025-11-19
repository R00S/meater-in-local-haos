package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import r8.v;
import r8.w;

/* compiled from: PrimitiveRegistry.java */
/* loaded from: classes2.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final Map<c, l<?, ?>> f37674a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, w<?, ?>> f37675b;

    /* compiled from: PrimitiveRegistry.java */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Class<?> f37678a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<?> f37679b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f37678a.equals(this.f37678a) && cVar.f37679b.equals(this.f37679b);
        }

        public int hashCode() {
            return Objects.hash(this.f37678a, this.f37679b);
        }

        public String toString() {
            return this.f37678a.getSimpleName() + " with primitive type: " + this.f37679b.getSimpleName();
        }

        private c(Class<?> cls, Class<?> cls2) {
            this.f37678a = cls;
            this.f37679b = cls2;
        }
    }

    public Class<?> c(Class<?> cls) throws GeneralSecurityException {
        if (this.f37675b.containsKey(cls)) {
            return this.f37675b.get(cls).a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public <KeyT extends r8.g, PrimitiveT> PrimitiveT d(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        c cVar = new c(keyt.getClass(), cls);
        if (this.f37674a.containsKey(cVar)) {
            return (PrimitiveT) this.f37674a.get(cVar).a(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + cVar + " available");
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT e(v<InputPrimitiveT> vVar, Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        if (!this.f37675b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + cls);
        }
        w<?, ?> wVar = this.f37675b.get(cls);
        if (vVar.g().equals(wVar.a()) && wVar.a().equals(vVar.g())) {
            return (WrapperPrimitiveT) wVar.c(vVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }

    private n(b bVar) {
        this.f37674a = new HashMap(bVar.f37676a);
        this.f37675b = new HashMap(bVar.f37677b);
    }

    /* compiled from: PrimitiveRegistry.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map<c, l<?, ?>> f37676a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<Class<?>, w<?, ?>> f37677b;

        public b() {
            this.f37676a = new HashMap();
            this.f37677b = new HashMap();
        }

        n c() {
            return new n(this);
        }

        public <KeyT extends r8.g, PrimitiveT> b d(l<KeyT, PrimitiveT> lVar) throws GeneralSecurityException {
            if (lVar == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            c cVar = new c(lVar.c(), lVar.d());
            if (this.f37676a.containsKey(cVar)) {
                l<?, ?> lVar2 = this.f37676a.get(cVar);
                if (!lVar2.equals(lVar) || !lVar.equals(lVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + cVar);
                }
            } else {
                this.f37676a.put(cVar, lVar);
            }
            return this;
        }

        public <InputPrimitiveT, WrapperPrimitiveT> b e(w<InputPrimitiveT, WrapperPrimitiveT> wVar) throws GeneralSecurityException {
            if (wVar == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class<WrapperPrimitiveT> clsB = wVar.b();
            if (this.f37677b.containsKey(clsB)) {
                w<?, ?> wVar2 = this.f37677b.get(clsB);
                if (!wVar2.equals(wVar) || !wVar.equals(wVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsB);
                }
            } else {
                this.f37677b.put(clsB, wVar);
            }
            return this;
        }

        public b(n nVar) {
            this.f37676a = new HashMap(nVar.f37674a);
            this.f37677b = new HashMap(nVar.f37675b);
        }
    }
}
