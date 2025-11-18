package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzawv;
import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxo;

@zzard
/* loaded from: classes2.dex */
final class zzk extends zzawv {
    final /* synthetic */ zzd zzdki;

    private zzk(zzd zzdVar) {
        this.zzdki = zzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zzto() {
        Bitmap bitmapM17277a = com.google.android.gms.ads.internal.zzk.zzlz().m17277a(Integer.valueOf(this.zzdki.zzdjl.zzdkt.zzbrj));
        if (bitmapM17277a != null) {
            zzaxo zzaxoVarZzli = com.google.android.gms.ads.internal.zzk.zzli();
            zzd zzdVar = this.zzdki;
            Activity activity = zzdVar.mActivity;
            com.google.android.gms.ads.internal.zzh zzhVar = zzdVar.zzdjl.zzdkt;
            final Drawable drawableMo17194e = zzaxoVarZzli.mo17194e(activity, bitmapM17277a, zzhVar.zzbrh, zzhVar.zzbri);
            zzaxi.f22654a.post(new Runnable(this, drawableMo17194e) { // from class: com.google.android.gms.ads.internal.overlay.zzl
                private final zzk zzdkj;
                private final Drawable zzdkk;

                {
                    this.zzdkj = this;
                    this.zzdkk = drawableMo17194e;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzk zzkVar = this.zzdkj;
                    zzkVar.zzdki.mActivity.getWindow().setBackgroundDrawable(this.zzdkk);
                }
            });
        }
    }
}
