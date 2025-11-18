package r8;

import com.google.crypto.tink.shaded.protobuf.P;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* compiled from: KeyManagerRegistry.java */
/* loaded from: classes2.dex */
final class j {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f48439b = Logger.getLogger(j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<String, b> f48440a;

    /* compiled from: KeyManagerRegistry.java */
    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.crypto.tink.internal.d f48441a;

        a(com.google.crypto.tink.internal.d dVar) {
            this.f48441a = dVar;
        }

        @Override // r8.j.b
        public <Q> h<Q> a(Class<Q> cls) throws GeneralSecurityException {
            try {
                return new i(this.f48441a, cls);
            } catch (IllegalArgumentException e10) {
                throw new GeneralSecurityException("Primitive type not supported", e10);
            }
        }

        @Override // r8.j.b
        public h<?> b() {
            com.google.crypto.tink.internal.d dVar = this.f48441a;
            return new i(dVar, dVar.b());
        }

        @Override // r8.j.b
        public Class<?> c() {
            return this.f48441a.getClass();
        }

        @Override // r8.j.b
        public Set<Class<?>> d() {
            return this.f48441a.i();
        }
    }

    /* compiled from: KeyManagerRegistry.java */
    private interface b {
        <P> h<P> a(Class<P> cls);

        h<?> b();

        Class<?> c();

        Set<Class<?>> d();
    }

    j(j jVar) {
        this.f48440a = new ConcurrentHashMap(jVar.f48440a);
    }

    private static <T> T a(T t10) {
        t10.getClass();
        return t10;
    }

    private static <KeyProtoT extends P> b b(com.google.crypto.tink.internal.d<KeyProtoT> dVar) {
        return new a(dVar);
    }

    private synchronized b d(String str) {
        if (!this.f48440a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.f48440a.get(str);
    }

    private <P> h<P> e(String str, Class<P> cls) throws GeneralSecurityException {
        b bVarD = d(str);
        if (cls == null) {
            return (h<P>) bVarD.b();
        }
        if (bVarD.d().contains(cls)) {
            return bVarD.a(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + bVarD.c() + ", supported primitives: " + i(bVarD.d()));
    }

    private synchronized <P> void h(b bVar, boolean z10) {
        try {
            String strC = bVar.b().c();
            b bVar2 = this.f48440a.get(strC);
            if (bVar2 != null && !bVar2.c().equals(bVar.c())) {
                f48439b.warning("Attempted overwrite of a registered key manager for key type " + strC);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strC, bVar2.c().getName(), bVar.c().getName()));
            }
            if (z10) {
                this.f48440a.put(strC, bVar);
            } else {
                this.f48440a.putIfAbsent(strC, bVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static String i(Set<Class<?>> set) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class<?> cls : set) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls.getCanonicalName());
            z10 = false;
        }
        return sb2.toString();
    }

    <P> h<P> c(String str, Class<P> cls) {
        return e(str, (Class) a(cls));
    }

    h<?> f(String str) {
        return d(str).b();
    }

    synchronized <KeyProtoT extends P> void g(com.google.crypto.tink.internal.d<KeyProtoT> dVar) {
        if (!dVar.a().c()) {
            throw new GeneralSecurityException("failed to register key manager " + dVar.getClass() + " as it is not FIPS compatible.");
        }
        h(b(dVar), false);
    }

    boolean j(String str) {
        return this.f48440a.containsKey(str);
    }

    j() {
        this.f48440a = new ConcurrentHashMap();
    }
}
