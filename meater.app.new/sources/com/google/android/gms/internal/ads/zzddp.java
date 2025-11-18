package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class zzddp implements zzdcc<zzdby> {

    /* renamed from: a */
    private static final Logger f25514a = Logger.getLogger(zzddp.class.getName());

    /* renamed from: com.google.android.gms.internal.ads.zzddp$a */
    static class C7435a implements zzdby {

        /* renamed from: a */
        private final zzdca<zzdby> f25515a;

        /* renamed from: b */
        private final byte[] f25516b;

        private C7435a(zzdca<zzdby> zzdcaVar) {
            this.f25516b = new byte[]{0};
            this.f25515a = zzdcaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzdby
        /* renamed from: a */
        public final byte[] mo19193a(byte[] bArr) throws GeneralSecurityException {
            return this.f25515a.m19200e().m19202b().equals(zzdhm.LEGACY) ? zzdjs.m19553c(this.f25515a.m19200e().m19203c(), this.f25515a.m19200e().m19201a().mo19193a(zzdjs.m19553c(bArr, this.f25516b))) : zzdjs.m19553c(this.f25515a.m19200e().m19203c(), this.f25515a.m19200e().m19201a().mo19193a(bArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    /* renamed from: a */
    public final Class<zzdby> mo19204a() {
        return zzdby.class;
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    /* renamed from: b */
    public final /* synthetic */ zzdby mo19205b(zzdca<zzdby> zzdcaVar) throws GeneralSecurityException {
        return new C7435a(zzdcaVar);
    }
}
