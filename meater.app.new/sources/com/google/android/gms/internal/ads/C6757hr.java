package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.hr */
/* loaded from: classes2.dex */
final class C6757hr extends zzdbt<zzdbj, zzdeh, zzdej> {
    public C6757hr() {
        super(zzdbj.class, zzdeh.class, zzdej.class, "type.googleapis.com/google.crypto.tink.AesEaxKey");
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
        zzdeh zzdehVar = (zzdeh) zzdpkVar;
        zzdlx.m19578b(zzdehVar.m19285x(), 0);
        zzdlx.m19577a(zzdehVar.m19283E().size());
        if (zzdehVar.m19284F().m19295x() != 12 && zzdehVar.m19284F().m19295x() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: k */
    protected final /* synthetic */ void mo15145k(zzdpk zzdpkVar) throws GeneralSecurityException {
        zzdej zzdejVar = (zzdej) zzdpkVar;
        zzdlx.m19577a(zzdejVar.m19291x());
        if (zzdejVar.m19292z().m19295x() != 12 && zzdejVar.m19292z().m19295x() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: l */
    public final /* synthetic */ zzdbj mo15146l(zzdpk zzdpkVar) throws GeneralSecurityException {
        zzdeh zzdehVar = (zzdeh) zzdpkVar;
        return new zzdjk(zzdehVar.m19283E().m19603c(), zzdehVar.m19284F().m19295x());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: n */
    public final /* synthetic */ zzdpk mo15147n(zzdpk zzdpkVar) throws GeneralSecurityException {
        zzdej zzdejVar = (zzdej) zzdpkVar;
        return (zzdeh) ((zzdob) zzdeh.m19278G().m19286u(zzdmr.m19596D(zzdlo.m19575c(zzdejVar.m19291x()))).m19287v(zzdejVar.m19292z()).m19288w(0).mo19736p0());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: p */
    protected final /* synthetic */ zzdpk mo15148p(zzdmr zzdmrVar) throws zzdok {
        return zzdeh.m19277D(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: q */
    protected final /* synthetic */ zzdpk mo15149q(zzdmr zzdmrVar) throws zzdok {
        return zzdej.m19290y(zzdmrVar);
    }
}
