package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;
import com.google.android.gms.internal.ads.zzcqt;

/* loaded from: classes2.dex */
public final class zzcqq extends zzawb {

    /* renamed from: f */
    private zzbjm f24941f;

    public zzcqq(zzbjm zzbjmVar) {
        this.f24941f = zzbjmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzawa
    /* renamed from: m5 */
    public final void mo17024m5(IObjectWrapper iObjectWrapper, zzawc zzawcVar, zzavy zzavyVar) {
        Context context = (Context) ObjectWrapper.m14709k0(iObjectWrapper);
        String str = zzawcVar.f22569f;
        String str2 = zzawcVar.f22570g;
        zzcqp zzcqpVarMo15553c = this.f24941f.mo17789n().mo15552b(new zzbqy.zza().m18288e(context).m18286b(new zzcxx().m19054t(str).m19057w(new zzya().m20819a()).m19051n(zzawcVar.f22571h).m19043d()).m18287c()).mo15553c(new zzcqt(new zzcqt.zza().m18953b(str2)));
        new zzbtv.zza().m18360k();
        zzbar.m17369f(zzcqpVarMo15553c.mo15551a().mo15595a(), new C6864kn(this, zzavyVar), this.f24941f.mo17780e());
    }
}
