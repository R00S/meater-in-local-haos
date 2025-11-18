package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.fr */
/* loaded from: classes2.dex */
final class C6683fr extends zzdbt<zzdbj, zzddr, zzddt> {
    public C6683fr() throws GeneralSecurityException {
        super(zzdbj.class, zzddr.class, zzddt.class, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzdcf.m19215j(new C6720gr());
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
        zzdlx.m19578b(((zzddr) zzdpkVar).m19240x(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: k */
    protected final /* synthetic */ void mo15145k(zzdpk zzdpkVar) throws GeneralSecurityException {
        zzdlx.m19577a(((zzddt) zzdpkVar).m19246x().m19269x());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: l */
    public final /* synthetic */ zzdbj mo15146l(zzdpk zzdpkVar) throws GeneralSecurityException {
        zzddr zzddrVar = (zzddr) zzdpkVar;
        return new zzdkw((zzdlk) zzdcf.m19213h("type.googleapis.com/google.crypto.tink.AesCtrKey", zzddrVar.m19238E(), zzdlk.class), (zzdby) zzdcf.m19213h("type.googleapis.com/google.crypto.tink.HmacKey", zzddrVar.m19239F(), zzdby.class), zzddrVar.m19239F().m19393D().m19406y());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: n */
    public final /* synthetic */ zzdpk mo15147n(zzdpk zzdpkVar) throws GeneralSecurityException {
        zzddt zzddtVar = (zzddt) zzdpkVar;
        zzdeb zzdebVar = (zzdeb) zzdcf.m19210e("type.googleapis.com/google.crypto.tink.AesCtrKey", zzddtVar.m19246x());
        return (zzddr) ((zzdob) zzddr.m19233G().m19241u(zzdebVar).m19242v((zzdgl) zzdcf.m19210e("type.googleapis.com/google.crypto.tink.HmacKey", zzddtVar.m19247y())).m19243w(0).mo19736p0());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: p */
    protected final /* synthetic */ zzdpk mo15148p(zzdmr zzdmrVar) throws zzdok {
        return zzddr.m19235I(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    /* renamed from: q */
    protected final /* synthetic */ zzdpk mo15149q(zzdmr zzdmrVar) throws zzdok {
        return zzddt.m19244A(zzdmrVar);
    }
}
