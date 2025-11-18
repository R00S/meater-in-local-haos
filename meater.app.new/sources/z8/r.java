package z8;

import B8.b;
import D8.I;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import r8.t;
import r8.v;
import r8.w;
import r8.x;

/* compiled from: MacWrapper.java */
/* loaded from: classes2.dex */
class r implements w<t, t> {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f53916a = Logger.getLogger(r.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f53917b = {0};

    /* renamed from: c, reason: collision with root package name */
    private static final r f53918c = new r();

    /* compiled from: MacWrapper.java */
    private static class b implements t {

        /* renamed from: a, reason: collision with root package name */
        private final v<t> f53919a;

        /* renamed from: b, reason: collision with root package name */
        private final b.a f53920b;

        /* renamed from: c, reason: collision with root package name */
        private final b.a f53921c;

        @Override // r8.t
        public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                this.f53921c.a();
                throw new GeneralSecurityException("tag too short");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (v.c<t> cVar : this.f53919a.f(bArrCopyOf)) {
                try {
                    cVar.g().a(bArrCopyOfRange, cVar.f().equals(I.LEGACY) ? E8.f.a(bArr2, r.f53917b) : bArr2);
                    this.f53921c.b(cVar.d(), r3.length);
                    return;
                } catch (GeneralSecurityException e10) {
                    r.f53916a.info("tag prefix matches a key, but cannot verify: " + e10);
                }
            }
            for (v.c<t> cVar2 : this.f53919a.h()) {
                try {
                    cVar2.g().a(bArr, bArr2);
                    this.f53921c.b(cVar2.d(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f53921c.a();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // r8.t
        public byte[] b(byte[] bArr) throws GeneralSecurityException {
            if (this.f53919a.e().f().equals(I.LEGACY)) {
                bArr = E8.f.a(bArr, r.f53917b);
            }
            try {
                byte[] bArrA = E8.f.a(this.f53919a.e().b(), this.f53919a.e().g().b(bArr));
                this.f53920b.b(this.f53919a.e().d(), bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e10) {
                this.f53920b.a();
                throw e10;
            }
        }

        private b(v<t> vVar) {
            this.f53919a = vVar;
            if (!vVar.i()) {
                b.a aVar = com.google.crypto.tink.internal.f.f37655a;
                this.f53920b = aVar;
                this.f53921c = aVar;
            } else {
                B8.b bVarA = com.google.crypto.tink.internal.g.b().a();
                B8.c cVarA = com.google.crypto.tink.internal.f.a(vVar);
                this.f53920b = bVarA.a(cVarA, "mac", "compute");
                this.f53921c = bVarA.a(cVarA, "mac", "verify");
            }
        }
    }

    r() {
    }

    public static void f() {
        x.n(f53918c);
    }

    private void g(v<t> vVar) throws GeneralSecurityException {
        Iterator<List<v.c<t>>> it = vVar.c().iterator();
        while (it.hasNext()) {
            for (v.c<t> cVar : it.next()) {
                if (cVar.c() instanceof p) {
                    p pVar = (p) cVar.c();
                    F8.a aVarA = F8.a.a(cVar.b());
                    if (!aVarA.equals(pVar.a())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + pVar.b() + " has wrong output prefix (" + pVar.a() + ") instead of (" + aVarA + ")");
                    }
                }
            }
        }
    }

    @Override // r8.w
    public Class<t> a() {
        return t.class;
    }

    @Override // r8.w
    public Class<t> b() {
        return t.class;
    }

    @Override // r8.w
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public t c(v<t> vVar) throws GeneralSecurityException {
        g(vVar);
        return new b(vVar);
    }
}
