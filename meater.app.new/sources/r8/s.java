package r8;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: KmsClients.java */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList<r> f48463a = new CopyOnWriteArrayList<>();

    public static r a(String str) throws GeneralSecurityException {
        Iterator<r> it = f48463a.iterator();
        while (it.hasNext()) {
            r next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
