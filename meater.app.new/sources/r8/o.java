package r8;

import D8.A;
import D8.C;
import D8.I;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: KeysetManager.java */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final C.b f48462a;

    private o(C.b bVar) {
        this.f48462a = bVar;
    }

    private synchronized C.c c(D8.y yVar, I i10) {
        int iG;
        iG = g();
        if (i10 == I.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return C.c.i0().D(yVar).E(iG).G(D8.z.ENABLED).F(i10).e();
    }

    private synchronized boolean e(int i10) {
        Iterator<C.c> it = this.f48462a.G().iterator();
        while (it.hasNext()) {
            if (it.next().d0() == i10) {
                return true;
            }
        }
        return false;
    }

    private synchronized C.c f(A a10) {
        return c(x.k(a10), a10.c0());
    }

    private synchronized int g() {
        int iC;
        iC = com.google.crypto.tink.internal.s.c();
        while (e(iC)) {
            iC = com.google.crypto.tink.internal.s.c();
        }
        return iC;
    }

    public static o i() {
        return new o(C.h0());
    }

    public static o j(n nVar) {
        return new o(nVar.h().d());
    }

    public synchronized o a(l lVar) {
        b(lVar.b(), false);
        return this;
    }

    @Deprecated
    public synchronized int b(A a10, boolean z10) {
        C.c cVarF;
        try {
            cVarF = f(a10);
            this.f48462a.D(cVarF);
            if (z10) {
                this.f48462a.H(cVarF.d0());
            }
        } catch (Throwable th) {
            throw th;
        }
        return cVarF.d0();
    }

    public synchronized n d() {
        return n.e(this.f48462a.e());
    }

    public synchronized o h(int i10) {
        for (int i11 = 0; i11 < this.f48462a.F(); i11++) {
            C.c cVarE = this.f48462a.E(i11);
            if (cVarE.d0() == i10) {
                if (!cVarE.g0().equals(D8.z.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i10);
                }
                this.f48462a.H(i10);
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }
}
