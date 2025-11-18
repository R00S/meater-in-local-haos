package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.jr */
/* loaded from: classes2.dex */
final class C6831jr extends zzdbt<zzdbj, zzdfb, zzdgh> {
    public C6831jr() {
        super(zzdbj.class, zzdfb.class, zzdgh.class, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
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
        zzdfb zzdfbVar = (zzdfb) zzdpkVar;
        zzdlx.m19578b(zzdfbVar.m19322x(), 0);
        if (zzdfbVar.m19321B().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: k */
    protected final /* bridge */ /* synthetic */ void mo15145k(zzdpk zzdpkVar) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: l */
    public final /* synthetic */ zzdbj mo15146l(zzdpk zzdpkVar) throws GeneralSecurityException {
        return new zzdjv(((zzdfb) zzdpkVar).m19321B().m19603c());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: n */
    protected final /* synthetic */ zzdpk mo15147n(zzdpk zzdpkVar) throws GeneralSecurityException {
        return (zzdfb) ((zzdob) zzdfb.m19316D().m19324v(0).m19323u(zzdmr.m19596D(zzdlo.m19575c(32))).mo19736p0());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: p */
    protected final /* synthetic */ zzdpk mo15148p(zzdmr zzdmrVar) throws zzdok {
        return zzdfb.m19315C(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: q */
    protected final /* synthetic */ zzdpk mo15149q(zzdmr zzdmrVar) throws zzdok {
        return zzdgh.m19380y(zzdmrVar);
    }
}
