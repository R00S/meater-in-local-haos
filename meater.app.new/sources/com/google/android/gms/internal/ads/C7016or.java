package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.or */
/* loaded from: classes2.dex */
final class C7016or extends zzdbt<zzdbq, zzdfx, zzdgh> {
    public C7016or() {
        super(zzdbq.class, zzdfx.class, zzdgh.class, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    /* renamed from: H0 */
    public final int mo15142H0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: i */
    protected final zzdgr.zzb mo15143i() {
        return zzdgr.zzb.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: j */
    protected final /* synthetic */ void mo15144j(zzdpk zzdpkVar) throws GeneralSecurityException {
        zzdfx zzdfxVar = (zzdfx) zzdpkVar;
        zzdlx.m19578b(zzdfxVar.m19367x(), 0);
        C7164sr.m15851d(zzdfxVar.m19366E());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: k */
    protected final /* bridge */ /* synthetic */ void mo15145k(zzdpk zzdpkVar) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: l */
    protected final /* synthetic */ zzdbq mo15146l(zzdpk zzdpkVar) throws GeneralSecurityException {
        zzdfx zzdfxVar = (zzdfx) zzdpkVar;
        zzdft zzdftVarM19366E = zzdfxVar.m19366E();
        zzdfz zzdfzVarM19334x = zzdftVarM19366E.m19334x();
        return new zzdkc(zzdkr.m19561d(C7164sr.m15848a(zzdfzVarM19334x.m19375y()), zzdfxVar.m19364C().m19603c(), zzdfxVar.m19365D().m19603c()), zzdfzVarM19334x.m19376z().m19603c(), C7164sr.m15850c(zzdfzVarM19334x.m19374x()), C7164sr.m15849b(zzdftVarM19366E.m19336z()), new C7238ur(zzdftVarM19366E.m19335y().m19328x()));
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: n */
    public final /* synthetic */ zzdpk mo15147n(zzdpk zzdpkVar) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: p */
    protected final /* synthetic */ zzdpk mo15148p(zzdmr zzdmrVar) throws zzdok {
        return zzdfx.m19361M(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: q */
    protected final /* synthetic */ zzdpk mo15149q(zzdmr zzdmrVar) throws zzdok {
        return zzdgh.m19380y(zzdmrVar);
    }
}
