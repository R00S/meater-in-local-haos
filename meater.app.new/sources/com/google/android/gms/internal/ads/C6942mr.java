package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.mr */
/* loaded from: classes2.dex */
final class C6942mr extends zzdbt<zzdbj, zzdig, zzdgh> {
    public C6942mr() {
        super(zzdbj.class, zzdig.class, zzdgh.class, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
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
        zzdig zzdigVar = (zzdig) zzdpkVar;
        zzdlx.m19578b(zzdigVar.m19539x(), 0);
        if (zzdigVar.m19538B().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: k */
    protected final /* bridge */ /* synthetic */ void mo15145k(zzdpk zzdpkVar) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: l */
    public final /* synthetic */ zzdbj mo15146l(zzdpk zzdpkVar) throws GeneralSecurityException {
        return new zzdma(((zzdig) zzdpkVar).m19538B().m19603c());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: n */
    protected final /* synthetic */ zzdpk mo15147n(zzdpk zzdpkVar) throws GeneralSecurityException {
        return (zzdig) ((zzdob) zzdig.m19532C().m19541v(0).m19540u(zzdmr.m19596D(zzdlo.m19575c(32))).mo19736p0());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: p */
    protected final /* synthetic */ zzdpk mo15148p(zzdmr zzdmrVar) throws zzdok {
        return zzdig.m19534E(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: q */
    protected final /* synthetic */ zzdpk mo15149q(zzdmr zzdmrVar) throws zzdok {
        return zzdgh.m19380y(zzdmrVar);
    }
}
