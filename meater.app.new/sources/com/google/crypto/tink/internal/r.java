package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import r8.u;
import r8.y;

/* compiled from: SerializationRegistry.java */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Map<d, com.google.crypto.tink.internal.c<?, ?>> f37687a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<c, com.google.crypto.tink.internal.b<?>> f37688b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<d, k<?, ?>> f37689c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<c, j<?>> f37690d;

    /* compiled from: SerializationRegistry.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Class<? extends q> f37695a;

        /* renamed from: b, reason: collision with root package name */
        private final F8.a f37696b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f37695a.equals(this.f37695a) && cVar.f37696b.equals(this.f37696b);
        }

        public int hashCode() {
            return Objects.hash(this.f37695a, this.f37696b);
        }

        public String toString() {
            return this.f37695a.getSimpleName() + ", object identifier: " + this.f37696b;
        }

        private c(Class<? extends q> cls, F8.a aVar) {
            this.f37695a = cls;
            this.f37696b = aVar;
        }
    }

    /* compiled from: SerializationRegistry.java */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private final Class<?> f37697a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<? extends q> f37698b;

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f37697a.equals(this.f37697a) && dVar.f37698b.equals(this.f37698b);
        }

        public int hashCode() {
            return Objects.hash(this.f37697a, this.f37698b);
        }

        public String toString() {
            return this.f37697a.getSimpleName() + " with serialization type: " + this.f37698b.getSimpleName();
        }

        private d(Class<?> cls, Class<? extends q> cls2) {
            this.f37697a = cls;
            this.f37698b = cls2;
        }
    }

    public <SerializationT extends q> boolean e(SerializationT serializationt) {
        return this.f37688b.containsKey(new c(serializationt.getClass(), serializationt.a()));
    }

    public <SerializationT extends q> r8.g f(SerializationT serializationt, y yVar) throws GeneralSecurityException {
        c cVar = new c(serializationt.getClass(), serializationt.a());
        if (this.f37688b.containsKey(cVar)) {
            return this.f37688b.get(cVar).d(serializationt, yVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }

    private r(b bVar) {
        this.f37687a = new HashMap(bVar.f37691a);
        this.f37688b = new HashMap(bVar.f37692b);
        this.f37689c = new HashMap(bVar.f37693c);
        this.f37690d = new HashMap(bVar.f37694d);
    }

    /* compiled from: SerializationRegistry.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map<d, com.google.crypto.tink.internal.c<?, ?>> f37691a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<c, com.google.crypto.tink.internal.b<?>> f37692b;

        /* renamed from: c, reason: collision with root package name */
        private final Map<d, k<?, ?>> f37693c;

        /* renamed from: d, reason: collision with root package name */
        private final Map<c, j<?>> f37694d;

        public b() {
            this.f37691a = new HashMap();
            this.f37692b = new HashMap();
            this.f37693c = new HashMap();
            this.f37694d = new HashMap();
        }

        r e() {
            return new r(this);
        }

        public <SerializationT extends q> b f(com.google.crypto.tink.internal.b<SerializationT> bVar) throws GeneralSecurityException {
            c cVar = new c(bVar.c(), bVar.b());
            if (this.f37692b.containsKey(cVar)) {
                com.google.crypto.tink.internal.b<?> bVar2 = this.f37692b.get(cVar);
                if (!bVar2.equals(bVar) || !bVar.equals(bVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.f37692b.put(cVar, bVar);
            }
            return this;
        }

        public <KeyT extends r8.g, SerializationT extends q> b g(com.google.crypto.tink.internal.c<KeyT, SerializationT> cVar) throws GeneralSecurityException {
            d dVar = new d(cVar.b(), cVar.c());
            if (this.f37691a.containsKey(dVar)) {
                com.google.crypto.tink.internal.c<?, ?> cVar2 = this.f37691a.get(dVar);
                if (!cVar2.equals(cVar) || !cVar.equals(cVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.f37691a.put(dVar, cVar);
            }
            return this;
        }

        public <SerializationT extends q> b h(j<SerializationT> jVar) throws GeneralSecurityException {
            c cVar = new c(jVar.c(), jVar.b());
            if (this.f37694d.containsKey(cVar)) {
                j<?> jVar2 = this.f37694d.get(cVar);
                if (!jVar2.equals(jVar) || !jVar.equals(jVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.f37694d.put(cVar, jVar);
            }
            return this;
        }

        public <ParametersT extends u, SerializationT extends q> b i(k<ParametersT, SerializationT> kVar) throws GeneralSecurityException {
            d dVar = new d(kVar.b(), kVar.c());
            if (this.f37693c.containsKey(dVar)) {
                k<?, ?> kVar2 = this.f37693c.get(dVar);
                if (!kVar2.equals(kVar) || !kVar.equals(kVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.f37693c.put(dVar, kVar);
            }
            return this;
        }

        public b(r rVar) {
            this.f37691a = new HashMap(rVar.f37687a);
            this.f37692b = new HashMap(rVar.f37688b);
            this.f37693c = new HashMap(rVar.f37689c);
            this.f37694d = new HashMap(rVar.f37690d);
        }
    }
}
