package E8;

import E8.j;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import w8.C5009b;

/* compiled from: EngineFactory.java */
/* loaded from: classes2.dex */
public final class i<T_WRAPPER extends j<JcePrimitiveT>, JcePrimitiveT> {

    /* renamed from: b, reason: collision with root package name */
    public static final i<j.a, Cipher> f4112b = new i<>(new j.a());

    /* renamed from: c, reason: collision with root package name */
    public static final i<j.e, Mac> f4113c = new i<>(new j.e());

    /* renamed from: d, reason: collision with root package name */
    public static final i<j.g, Signature> f4114d = new i<>(new j.g());

    /* renamed from: e, reason: collision with root package name */
    public static final i<j.f, MessageDigest> f4115e = new i<>(new j.f());

    /* renamed from: f, reason: collision with root package name */
    public static final i<j.b, KeyAgreement> f4116f = new i<>(new j.b());

    /* renamed from: g, reason: collision with root package name */
    public static final i<j.d, KeyPairGenerator> f4117g = new i<>(new j.d());

    /* renamed from: h, reason: collision with root package name */
    public static final i<j.c, KeyFactory> f4118h = new i<>(new j.c());

    /* renamed from: a, reason: collision with root package name */
    private final e<JcePrimitiveT> f4119a;

    /* compiled from: EngineFactory.java */
    private static class b<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* renamed from: a, reason: collision with root package name */
        private final j<JcePrimitiveT> f4120a;

        @Override // E8.i.e
        public JcePrimitiveT a(String str) {
            Iterator<Provider> it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f4120a.a(str, it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            return this.f4120a.a(str, null);
        }

        private b(j<JcePrimitiveT> jVar) {
            this.f4120a = jVar;
        }
    }

    /* compiled from: EngineFactory.java */
    private static class c<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* renamed from: a, reason: collision with root package name */
        private final j<JcePrimitiveT> f4121a;

        @Override // E8.i.e
        public JcePrimitiveT a(String str) {
            return this.f4121a.a(str, null);
        }

        private c(j<JcePrimitiveT> jVar) {
            this.f4121a = jVar;
        }
    }

    /* compiled from: EngineFactory.java */
    private static class d<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* renamed from: a, reason: collision with root package name */
        private final j<JcePrimitiveT> f4122a;

        @Override // E8.i.e
        public JcePrimitiveT a(String str) throws GeneralSecurityException {
            Iterator<Provider> it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f4122a.a(str, it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }

        private d(j<JcePrimitiveT> jVar) {
            this.f4122a = jVar;
        }
    }

    /* compiled from: EngineFactory.java */
    private interface e<JcePrimitiveT> {
        JcePrimitiveT a(String str);
    }

    public i(T_WRAPPER t_wrapper) {
        if (C5009b.c()) {
            this.f4119a = new d(t_wrapper);
        } else if (q.b()) {
            this.f4119a = new b(t_wrapper);
        } else {
            this.f4119a = new c(t_wrapper);
        }
    }

    public static List<Provider> b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public JcePrimitiveT a(String str) {
        return this.f4119a.a(str);
    }
}
