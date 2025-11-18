package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class zzdck implements zzdcc<zzdbj> {

    /* renamed from: a */
    private static final Logger f25481a = Logger.getLogger(zzdck.class.getName());

    /* renamed from: com.google.android.gms.internal.ads.zzdck$a */
    static class C7433a implements zzdbj {

        /* renamed from: a */
        private final zzdca<zzdbj> f25482a;

        private C7433a(zzdca<zzdbj> zzdcaVar) {
            this.f25482a = zzdcaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzdbj
        /* renamed from: a */
        public final byte[] mo15598a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return zzdjs.m19553c(this.f25482a.m19200e().m19203c(), this.f25482a.m19200e().m19201a().mo15598a(bArr, bArr2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    /* renamed from: a */
    public final Class<zzdbj> mo19204a() {
        return zzdbj.class;
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    /* renamed from: b */
    public final /* synthetic */ zzdbj mo19205b(zzdca<zzdbj> zzdcaVar) throws GeneralSecurityException {
        return new C7433a(zzdcaVar);
    }
}
