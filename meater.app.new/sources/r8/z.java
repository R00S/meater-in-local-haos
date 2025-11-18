package r8;

import D8.C;
import D8.D;
import D8.I;
import D8.y;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: Util.java */
/* loaded from: classes2.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f48490a = Charset.forName("UTF-8");

    public static D.c a(C.c cVar) {
        return D.c.d0().G(cVar.c0().d0()).F(cVar.g0()).E(cVar.e0()).D(cVar.d0()).e();
    }

    public static D b(C c10) {
        D.b bVarE = D.d0().E(c10.g0());
        Iterator<C.c> it = c10.e0().iterator();
        while (it.hasNext()) {
            bVarE.D(a(it.next()));
        }
        return bVarE.e();
    }

    public static void c(C.c cVar) throws GeneralSecurityException {
        if (!cVar.h0()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.d0())));
        }
        if (cVar.e0() == I.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.d0())));
        }
        if (cVar.g0() == D8.z.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.d0())));
        }
    }

    public static void d(C c10) {
        int iG0 = c10.g0();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (C.c cVar : c10.e0()) {
            if (cVar.g0() == D8.z.ENABLED) {
                c(cVar);
                if (cVar.d0() == iG0) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                if (cVar.c0().c0() != y.c.ASYMMETRIC_PUBLIC) {
                    z11 = false;
                }
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
