package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzxr;

@zzard
/* loaded from: classes2.dex */
public final class zzm {
    public static void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.zzdkr == 4 && adOverlayInfoParcel.zzdkm == null) {
            zzxr zzxrVar = adOverlayInfoParcel.zzcgi;
            if (zzxrVar != null) {
                zzxrVar.onAdClicked();
            }
            com.google.android.gms.ads.internal.zzk.zzle();
            zza.zza(context, adOverlayInfoParcel.zzdkl, adOverlayInfoParcel.zzdkq);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzbtc.f22753i);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.zza(intent, adOverlayInfoParcel);
        if (!PlatformVersion.m14644h()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        com.google.android.gms.ads.internal.zzk.zzlg();
        zzaxi.m17155i(context, intent);
    }
}
