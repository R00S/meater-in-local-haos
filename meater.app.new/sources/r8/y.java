package r8;

import java.security.GeneralSecurityException;

/* compiled from: SecretKeyAccess.java */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private static final y f48489a = new y();

    private y() {
    }

    static y a() {
        return f48489a;
    }

    public static y b(y yVar) throws GeneralSecurityException {
        if (yVar != null) {
            return yVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
