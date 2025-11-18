package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* renamed from: com.google.android.gms.internal.ads.nr */
/* loaded from: classes2.dex */
final class C6979nr extends zzdbt<zzdbp, zzdfv, zzdfr> implements zzdbs<zzdbp> {
    public C6979nr() {
        super(zzdbp.class, zzdfv.class, zzdfr.class, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    /* renamed from: H0 */
    public final int mo15142H0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: i */
    protected final zzdgr.zzb mo15143i() {
        return zzdgr.zzb.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: j */
    protected final /* synthetic */ void mo15144j(zzdpk zzdpkVar) throws GeneralSecurityException {
        zzdfv zzdfvVar = (zzdfv) zzdpkVar;
        zzdlx.m19578b(zzdfvVar.m19348x(), 0);
        C7164sr.m15851d(zzdfvVar.m19347E().m19366E());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: k */
    protected final /* synthetic */ void mo15145k(zzdpk zzdpkVar) throws GeneralSecurityException {
        C7164sr.m15851d(((zzdfr) zzdpkVar).m19331x());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: l */
    public final /* synthetic */ zzdbp mo15146l(zzdpk zzdpkVar) throws GeneralSecurityException {
        zzdfv zzdfvVar = (zzdfv) zzdpkVar;
        zzdft zzdftVarM19366E = zzdfvVar.m19347E().m19366E();
        zzdfz zzdfzVarM19334x = zzdftVarM19366E.m19334x();
        return new zzdkb(zzdkr.m19560c(C7164sr.m15848a(zzdfzVarM19334x.m19375y()), zzdfvVar.m19346D().m19603c()), zzdfzVarM19334x.m19376z().m19603c(), C7164sr.m15850c(zzdfzVarM19334x.m19374x()), C7164sr.m15849b(zzdftVarM19366E.m19336z()), new C7238ur(zzdftVarM19366E.m19335y().m19328x()));
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: n */
    public final /* synthetic */ zzdpk mo15147n(zzdpk zzdpkVar) throws GeneralSecurityException {
        zzdfr zzdfrVar = (zzdfr) zzdpkVar;
        KeyPair keyPairM19559b = zzdkr.m19559b(zzdkr.m19562e(C7164sr.m15848a(zzdfrVar.m19331x().m19334x().m19375y())));
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairM19559b.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairM19559b.getPrivate();
        ECPoint w = eCPublicKey.getW();
        return (zzdfv) ((zzdob) zzdfv.m19340F().m19351w(0).m19349u((zzdfx) ((zzdob) zzdfx.m19354F().m19368A(0).m19371w(zzdfrVar.m19331x()).m19369u(zzdmr.m19596D(w.getAffineX().toByteArray())).m19370v(zzdmr.m19596D(w.getAffineY().toByteArray())).mo19736p0())).m19350v(zzdmr.m19596D(eCPrivateKey.getS().toByteArray())).mo19736p0());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: p */
    protected final /* synthetic */ zzdpk mo15148p(zzdmr zzdmrVar) throws zzdok {
        return zzdfv.m19342H(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: q */
    protected final /* synthetic */ zzdpk mo15149q(zzdmr zzdmrVar) throws zzdok {
        return zzdfr.m19330z(zzdmrVar);
    }
}
