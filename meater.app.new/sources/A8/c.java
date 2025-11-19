package A8;

import java.security.GeneralSecurityException;
import w8.C5009b;
import z8.g;
import z8.i;

/* compiled from: ChunkedHmacImpl.java */
/* loaded from: classes2.dex */
public final class c implements g {

    /* renamed from: b, reason: collision with root package name */
    private static final C5009b.EnumC0751b f1045b = C5009b.EnumC0751b.f51986C;

    /* renamed from: a, reason: collision with root package name */
    private final i f1046a;

    public c(i iVar) throws GeneralSecurityException {
        if (!f1045b.c()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f1046a = iVar;
    }
}
