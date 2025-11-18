package r8;

import D8.A;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.P;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* compiled from: Registry.java */
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f48482a = Logger.getLogger(x.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference<j> f48483b = new AtomicReference<>(new j());

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap<String, b> f48484c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap<String, Boolean> f48485d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentMap<String, Object> f48486e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final ConcurrentMap<String, l> f48487f = new ConcurrentHashMap();

    /* compiled from: Registry.java */
    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.crypto.tink.internal.d f48488a;

        a(com.google.crypto.tink.internal.d dVar) {
            this.f48488a = dVar;
        }
    }

    /* compiled from: Registry.java */
    private interface b {
    }

    private x() {
    }

    private static <KeyProtoT extends P> b a(com.google.crypto.tink.internal.d<KeyProtoT> dVar) {
        return new a(dVar);
    }

    private static synchronized <KeyProtoT extends P, KeyFormatProtoT extends P> void b(String str, Map<String, d.a.C0484a<KeyFormatProtoT>> map, boolean z10) {
        if (z10) {
            try {
                ConcurrentMap<String, Boolean> concurrentMap = f48485d;
                if (concurrentMap.containsKey(str) && !concurrentMap.get(str).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } finally {
            }
        }
        if (z10) {
            if (f48483b.get().j(str)) {
                for (Map.Entry<String, d.a.C0484a<KeyFormatProtoT>> entry : map.entrySet()) {
                    if (!f48487f.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + entry.getKey() + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry<String, d.a.C0484a<KeyFormatProtoT>> entry2 : map.entrySet()) {
                    if (f48487f.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + entry2.getKey());
                    }
                }
            }
        }
    }

    static <KeyT extends g, P> P c(KeyT keyt, Class<P> cls) {
        return (P) com.google.crypto.tink.internal.h.c().b(keyt, cls);
    }

    public static Class<?> d(Class<?> cls) {
        try {
            return com.google.crypto.tink.internal.h.c().a(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static <P> P e(D8.y yVar, Class<P> cls) {
        return (P) f(yVar.d0(), yVar.e0(), cls);
    }

    public static <P> P f(String str, AbstractC2898h abstractC2898h, Class<P> cls) {
        return f48483b.get().c(str, cls).d(abstractC2898h);
    }

    public static <P> P g(String str, byte[] bArr, Class<P> cls) {
        return (P) f(str, AbstractC2898h.j(bArr), cls);
    }

    public static h<?> h(String str) {
        return f48483b.get().f(str);
    }

    static synchronized Map<String, l> i() {
        return Collections.unmodifiableMap(f48487f);
    }

    public static synchronized P j(A a10) {
        h<?> hVarH;
        hVarH = h(a10.d0());
        if (!f48485d.get(a10.d0()).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + a10.d0());
        }
        return hVarH.a(a10.e0());
    }

    public static synchronized D8.y k(A a10) {
        h<?> hVarH;
        hVarH = h(a10.d0());
        if (!f48485d.get(a10.d0()).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + a10.d0());
        }
        return hVarH.b(a10.e0());
    }

    public static synchronized <KeyProtoT extends P> void l(com.google.crypto.tink.internal.d<KeyProtoT> dVar, boolean z10) {
        try {
            if (dVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            AtomicReference<j> atomicReference = f48483b;
            j jVar = new j(atomicReference.get());
            jVar.g(dVar);
            String strD = dVar.d();
            b(strD, z10 ? dVar.f().c() : Collections.emptyMap(), z10);
            if (!atomicReference.get().j(strD)) {
                f48484c.put(strD, a(dVar));
                if (z10) {
                    m(strD, dVar.f().c());
                }
            }
            f48485d.put(strD, Boolean.valueOf(z10));
            atomicReference.set(jVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    private static <KeyFormatProtoT extends P> void m(String str, Map<String, d.a.C0484a<KeyFormatProtoT>> map) {
        for (Map.Entry<String, d.a.C0484a<KeyFormatProtoT>> entry : map.entrySet()) {
            f48487f.put(entry.getKey(), l.a(str, entry.getValue().f37650a.l(), entry.getValue().f37651b));
        }
    }

    public static synchronized <B, P> void n(w<B, P> wVar) {
        com.google.crypto.tink.internal.h.c().e(wVar);
    }

    public static <B, P> P o(v<B> vVar, Class<P> cls) {
        return (P) com.google.crypto.tink.internal.h.c().f(vVar, cls);
    }
}
