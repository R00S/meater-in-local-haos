package A8;

import java.security.GeneralSecurityException;
import w8.C5009b;
import z8.C5214a;
import z8.g;

/* compiled from: ChunkedAesCmacImpl.java */
/* loaded from: classes2.dex */
public final class b implements g {

    /* renamed from: b, reason: collision with root package name */
    private static final C5009b.EnumC0751b f1043b = C5009b.EnumC0751b.f51985B;

    /* renamed from: a, reason: collision with root package name */
    private final C5214a f1044a;

    public b(C5214a c5214a) throws GeneralSecurityException {
        if (!f1043b.c()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f1044a = c5214a;
    }
}
