package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class zzdde implements zzdcc<zzdbp> {

    /* renamed from: a */
    private static final Logger f25509a = Logger.getLogger(zzdde.class.getName());

    /* renamed from: com.google.android.gms.internal.ads.zzdde$a */
    static class C7434a implements zzdbp {

        /* renamed from: a */
        private final zzdca<zzdbp> f25510a;

        public C7434a(zzdca<zzdbp> zzdcaVar) {
            this.f25510a = zzdcaVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    /* renamed from: a */
    public final Class<zzdbp> mo19204a() {
        return zzdbp.class;
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    /* renamed from: b */
    public final /* synthetic */ zzdbp mo19205b(zzdca<zzdbp> zzdcaVar) throws GeneralSecurityException {
        return new C7434a(zzdcaVar);
    }
}
