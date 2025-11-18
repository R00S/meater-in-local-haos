package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdha;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class zzdcf {

    /* renamed from: a */
    private static final Logger f25473a = Logger.getLogger(zzdcf.class.getName());

    /* renamed from: b */
    private static final ConcurrentMap<String, zzdbs> f25474b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final ConcurrentMap<String, Boolean> f25475c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap<String, zzdbk> f25476d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap<Class<?>, zzdcc<?>> f25477e = new ConcurrentHashMap();

    /* renamed from: a */
    private static <T> T m19206a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: b */
    private static <P> zzdbs<P> m19207b(String str, Class<P> cls) throws GeneralSecurityException {
        zzdbs<P> zzdbsVar = f25474b.get(str);
        if (zzdbsVar == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
            sb.append("No key manager found for key type: ");
            sb.append(str);
            sb.append(".  Check the configuration of the registry.");
            throw new GeneralSecurityException(sb.toString());
        }
        if (cls == null || zzdbsVar.mo19178a().equals(cls)) {
            return zzdbsVar;
        }
        String name = zzdbsVar.mo19178a().getName();
        String name2 = cls.getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 80 + String.valueOf(str).length() + name2.length());
        sb2.append("Primitive type ");
        sb2.append(name);
        sb2.append(" of keymanager for type ");
        sb2.append(str);
        sb2.append(" does not match requested primitive type ");
        sb2.append(name2);
        throw new GeneralSecurityException(sb2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static <P> zzdca<P> m19208c(zzdbu zzdbuVar, zzdbs<P> zzdbsVar, Class<P> cls) throws GeneralSecurityException {
        Class cls2 = (Class) m19206a(cls);
        C6572cr.m14985b(zzdbuVar.m19189b());
        zzdca<P> zzdcaVar = (zzdca<P>) zzdca.m19196a(cls2);
        for (zzdha.zzb zzbVar : zzdbuVar.m19189b().m19460y()) {
            if (zzbVar.m19463A() == zzdgu.ENABLED) {
                zzdcb zzdcbVarM19197b = zzdcaVar.m19197b(m19212g(zzbVar.m19467z().m19416B(), zzbVar.m19467z().m19417C(), cls2), zzbVar);
                if (zzbVar.m19464B() == zzdbuVar.m19189b().m19459x()) {
                    zzdcaVar.m19198c(zzdcbVarM19197b);
                }
            }
        }
        return zzdcaVar;
    }

    /* renamed from: d */
    public static synchronized zzdgr m19209d(zzdgw zzdgwVar) throws GeneralSecurityException {
        zzdbs zzdbsVarM19207b;
        zzdbsVarM19207b = m19207b(zzdgwVar.m19426x(), null);
        if (!f25475c.get(zzdgwVar.m19426x()).booleanValue()) {
            String strValueOf = String.valueOf(zzdgwVar.m19426x());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
        }
        return zzdbsVarM19207b.mo19182e(zzdgwVar.m19427y());
    }

    /* renamed from: e */
    public static synchronized zzdpk m19210e(String str, zzdpk zzdpkVar) throws GeneralSecurityException {
        zzdbs zzdbsVarM19207b;
        zzdbsVarM19207b = m19207b(str, null);
        if (!f25475c.get(str).booleanValue()) {
            String strValueOf = String.valueOf(str);
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
        }
        return zzdbsVarM19207b.mo19180c(zzdpkVar);
    }

    /* renamed from: f */
    public static <P> P m19211f(zzdca<P> zzdcaVar) throws GeneralSecurityException {
        zzdcc<?> zzdccVar = f25477e.get(zzdcaVar.m19199d());
        if (zzdccVar != null) {
            return (P) zzdccVar.mo19205b(zzdcaVar);
        }
        String name = zzdcaVar.m19199d().getName();
        throw new GeneralSecurityException(name.length() != 0 ? "No wrapper found for ".concat(name) : new String("No wrapper found for "));
    }

    /* renamed from: g */
    private static <P> P m19212g(String str, zzdmr zzdmrVar, Class<P> cls) throws GeneralSecurityException {
        return (P) m19207b(str, cls).mo19184g(zzdmrVar);
    }

    /* renamed from: h */
    public static <P> P m19213h(String str, zzdpk zzdpkVar, Class<P> cls) throws GeneralSecurityException {
        return (P) m19207b(str, (Class) m19206a(cls)).mo19181d(zzdpkVar);
    }

    /* renamed from: i */
    public static <P> P m19214i(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) m19212g(str, zzdmr.m19596D(bArr), (Class) m19206a(cls));
    }

    /* renamed from: j */
    public static synchronized <P> void m19215j(zzdbs<P> zzdbsVar) throws GeneralSecurityException {
        m19216k(zzdbsVar, true);
    }

    /* renamed from: k */
    public static synchronized <P> void m19216k(zzdbs<P> zzdbsVar, boolean z) throws GeneralSecurityException {
        if (zzdbsVar == null) {
            throw new IllegalArgumentException("key manager must be non-null.");
        }
        String strMo19179b = zzdbsVar.mo19179b();
        ConcurrentMap<String, zzdbs> concurrentMap = f25474b;
        if (concurrentMap.containsKey(strMo19179b)) {
            zzdbs zzdbsVarM19207b = m19207b(strMo19179b, null);
            boolean zBooleanValue = f25475c.get(strMo19179b).booleanValue();
            if (!zzdbsVar.getClass().equals(zzdbsVarM19207b.getClass()) || (!zBooleanValue && z)) {
                Logger logger = f25473a;
                Level level = Level.WARNING;
                String strValueOf = String.valueOf(strMo19179b);
                logger.logp(level, "com.google.crypto.tink.Registry", "registerKeyManager", strValueOf.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(strValueOf) : new String("Attempted overwrite of a registered key manager for key type "));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strMo19179b, zzdbsVarM19207b.getClass().getName(), zzdbsVar.getClass().getName()));
            }
        }
        concurrentMap.put(strMo19179b, zzdbsVar);
        f25475c.put(strMo19179b, Boolean.valueOf(z));
    }

    /* renamed from: l */
    public static synchronized <P> void m19217l(zzdcc<P> zzdccVar) throws GeneralSecurityException {
        if (zzdccVar == null) {
            throw new IllegalArgumentException("wrapper must be non-null");
        }
        Class<P> clsMo19204a = zzdccVar.mo19204a();
        ConcurrentMap<Class<?>, zzdcc<?>> concurrentMap = f25477e;
        if (concurrentMap.containsKey(clsMo19204a)) {
            zzdcc<?> zzdccVar2 = concurrentMap.get(clsMo19204a);
            if (!zzdccVar.getClass().equals(zzdccVar2.getClass())) {
                Logger logger = f25473a;
                Level level = Level.WARNING;
                String strValueOf = String.valueOf(clsMo19204a.toString());
                logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", strValueOf.length() != 0 ? "Attempted overwrite of a registered SetWrapper for type ".concat(strValueOf) : new String("Attempted overwrite of a registered SetWrapper for type "));
                throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", clsMo19204a.getName(), zzdccVar2.getClass().getName(), zzdccVar.getClass().getName()));
            }
        }
        concurrentMap.put(clsMo19204a, zzdccVar);
    }

    /* renamed from: m */
    public static synchronized void m19218m(String str, zzdbk<?> zzdbkVar) throws GeneralSecurityException {
        ConcurrentMap<String, zzdbk> concurrentMap = f25476d;
        if (concurrentMap.containsKey(str.toLowerCase())) {
            if (!zzdbkVar.getClass().equals(concurrentMap.get(str.toLowerCase()).getClass())) {
                f25473a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "addCatalogue", str.length() != 0 ? "Attempted overwrite of a catalogueName catalogue for name ".concat(str) : new String("Attempted overwrite of a catalogueName catalogue for name "));
                StringBuilder sb = new StringBuilder(str.length() + 47);
                sb.append("catalogue for name ");
                sb.append(str);
                sb.append(" has been already registered");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        concurrentMap.put(str.toLowerCase(), zzdbkVar);
    }

    /* renamed from: n */
    public static synchronized zzdpk m19219n(zzdgw zzdgwVar) throws GeneralSecurityException {
        zzdbs zzdbsVarM19207b;
        zzdbsVarM19207b = m19207b(zzdgwVar.m19426x(), null);
        if (!f25475c.get(zzdgwVar.m19426x()).booleanValue()) {
            String strValueOf = String.valueOf(zzdgwVar.m19426x());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
        }
        return zzdbsVarM19207b.mo19183f(zzdgwVar.m19427y());
    }

    /* renamed from: o */
    public static zzdbk<?> m19220o(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        zzdbk<?> zzdbkVar = f25476d.get(str.toLowerCase());
        if (zzdbkVar != null) {
            return zzdbkVar;
        }
        String strConcat = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase().startsWith("tinkaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call DeterministicAeadConfig.register().");
        } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call StreamingAeadConfig.register().");
        } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call HybridConfig.register().");
        } else if (str.toLowerCase().startsWith("tinkmac")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call MacConfig.register().");
        } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call SignatureConfig.register().");
        } else if (str.toLowerCase().startsWith("tink")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call TinkConfig.register().");
        }
        throw new GeneralSecurityException(strConcat);
    }
}
