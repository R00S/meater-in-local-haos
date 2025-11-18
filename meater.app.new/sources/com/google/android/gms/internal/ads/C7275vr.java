package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.vr */
/* loaded from: classes2.dex */
final class C7275vr extends zzdbt<zzdby, zzdgl, zzdgn> {
    public C7275vr() {
        super(zzdby.class, zzdgl.class, zzdgn.class, "type.googleapis.com/google.crypto.tink.HmacKey");
    }

    /* renamed from: r */
    private static void m15956r(zzdgp zzdgpVar) throws GeneralSecurityException {
        if (zzdgpVar.m19406y() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i2 = C7312wr.f20868a[zzdgpVar.m19405x().ordinal()];
        if (i2 == 1) {
            if (zzdgpVar.m19406y() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i2 == 2) {
            if (zzdgpVar.m19406y() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i2 != 3) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (zzdgpVar.m19406y() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    /* renamed from: H0 */
    public final int mo15142H0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: i */
    protected final zzdgr.zzb mo15143i() {
        return zzdgr.zzb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: j */
    protected final /* synthetic */ void mo15144j(zzdpk zzdpkVar) throws GeneralSecurityException {
        zzdgl zzdglVar = (zzdgl) zzdpkVar;
        zzdlx.m19578b(zzdglVar.m19394x(), 0);
        if (zzdglVar.m19392C().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m15956r(zzdglVar.m19393D());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: k */
    protected final /* synthetic */ void mo15145k(zzdpk zzdpkVar) throws GeneralSecurityException {
        zzdgn zzdgnVar = (zzdgn) zzdpkVar;
        if (zzdgnVar.m19401x() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m15956r(zzdgnVar.m19402y());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: l */
    public final /* synthetic */ zzdby mo15146l(zzdpk zzdpkVar) throws GeneralSecurityException {
        zzdgl zzdglVar = (zzdgl) zzdpkVar;
        zzdgj zzdgjVarM19405x = zzdglVar.m19393D().m19405x();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzdglVar.m19392C().m19603c(), "HMAC");
        int iM19406y = zzdglVar.m19393D().m19406y();
        int i2 = C7312wr.f20868a[zzdgjVarM19405x.ordinal()];
        if (i2 == 1) {
            return new zzdll("HMACSHA1", secretKeySpec, iM19406y);
        }
        if (i2 == 2) {
            return new zzdll("HMACSHA256", secretKeySpec, iM19406y);
        }
        if (i2 == 3) {
            return new zzdll("HMACSHA512", secretKeySpec, iM19406y);
        }
        throw new GeneralSecurityException("unknown hash");
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: n */
    public final /* synthetic */ zzdpk mo15147n(zzdpk zzdpkVar) throws GeneralSecurityException {
        zzdgn zzdgnVar = (zzdgn) zzdpkVar;
        return (zzdgl) ((zzdob) zzdgl.m19384E().m19397w(0).m19396v(zzdgnVar.m19402y()).m19395u(zzdmr.m19596D(zzdlo.m19575c(zzdgnVar.m19401x()))).mo19736p0());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: p */
    protected final /* synthetic */ zzdpk mo15148p(zzdmr zzdmrVar) throws zzdok {
        return zzdgl.m19388I(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: q */
    protected final /* synthetic */ zzdpk mo15149q(zzdmr zzdmrVar) throws zzdok {
        return zzdgn.m19399B(zzdmrVar);
    }
}
