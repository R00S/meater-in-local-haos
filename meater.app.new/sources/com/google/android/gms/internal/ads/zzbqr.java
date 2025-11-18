package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzbqr implements zzbtk {

    /* renamed from: f */
    private final Context f23495f;

    /* renamed from: g */
    private final zzcxv f23496g;

    /* renamed from: h */
    private final zzbai f23497h;

    /* renamed from: i */
    private final zzaxb f23498i;

    /* renamed from: j */
    private final zzcgb f23499j;

    public zzbqr(Context context, zzcxv zzcxvVar, zzbai zzbaiVar, zzaxb zzaxbVar, zzcgb zzcgbVar) {
        this.f23495f = context;
        this.f23496g = zzcxvVar;
        this.f23497h = zzbaiVar;
        this.f23498i = zzaxbVar;
        this.f23499j = zzcgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    /* renamed from: N */
    public final void mo15437N(zzarx zzarxVar) throws JSONException {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21766c3)).booleanValue()) {
            zzk.zzlo().zza(this.f23495f, this.f23497h, this.f23496g.f25295f, this.f23498i.mo17103q());
        }
        this.f23499j.m18769k();
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    /* renamed from: q */
    public final void mo15438q(zzcxu zzcxuVar) {
    }
}
