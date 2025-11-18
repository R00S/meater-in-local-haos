package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.gr */
/* loaded from: classes2.dex */
final class C6720gr extends zzdbt<zzdlk, zzdeb, zzded> {
    public C6720gr() {
        super(zzdlk.class, zzdeb.class, zzded.class, "type.googleapis.com/google.crypto.tink.AesCtrKey");
    }

    /* renamed from: r */
    private static void m15167r(zzdef zzdefVar) throws GeneralSecurityException {
        if (zzdefVar.m19273x() < 12 || zzdefVar.m19273x() > 16) {
            throw new GeneralSecurityException("invalid IV size");
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
        zzdeb zzdebVar = (zzdeb) zzdpkVar;
        zzdlx.m19578b(zzdebVar.m19262x(), 0);
        zzdlx.m19577a(zzdebVar.m19260D().size());
        m15167r(zzdebVar.m19261E());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: k */
    protected final /* synthetic */ void mo15145k(zzdpk zzdpkVar) throws GeneralSecurityException {
        zzded zzdedVar = (zzded) zzdpkVar;
        zzdlx.m19577a(zzdedVar.m19269x());
        m15167r(zzdedVar.m19270z());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: l */
    public final /* synthetic */ zzdlk mo15146l(zzdpk zzdpkVar) throws GeneralSecurityException {
        zzdeb zzdebVar = (zzdeb) zzdpkVar;
        return new zzdjj(zzdebVar.m19260D().m19603c(), zzdebVar.m19261E().m19273x());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: n */
    public final /* synthetic */ zzdpk mo15147n(zzdpk zzdpkVar) throws GeneralSecurityException {
        zzded zzdedVar = (zzded) zzdpkVar;
        return (zzdeb) ((zzdob) zzdeb.m19253F().m19264v(zzdedVar.m19270z()).m19263u(zzdmr.m19596D(zzdlo.m19575c(zzdedVar.m19269x()))).m19265w(0).mo19736p0());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: p */
    protected final /* synthetic */ zzdpk mo15148p(zzdmr zzdmrVar) throws zzdok {
        return zzdeb.m19252C(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: q */
    protected final /* synthetic */ zzdpk mo15149q(zzdmr zzdmrVar) throws zzdok {
        return zzded.m19268y(zzdmrVar);
    }
}
