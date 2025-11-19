package r8;

import java.security.GeneralSecurityException;

/* compiled from: KeyTemplates.java */
/* loaded from: classes2.dex */
public final class m {
    public static l a(String str) throws GeneralSecurityException {
        l lVar = x.i().get(str);
        if (lVar != null) {
            return lVar;
        }
        throw new GeneralSecurityException("cannot find key template: " + str);
    }
}
