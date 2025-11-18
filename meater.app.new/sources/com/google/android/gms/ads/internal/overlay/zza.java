package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzacu;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzawz;
import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzyt;

@zzard
/* loaded from: classes2.dex */
public final class zza {
    public static boolean zza(Context context, zzc zzcVar, zzu zzuVar) throws NumberFormatException {
        int i2 = 0;
        if (zzcVar == null) {
            zzbad.m17353i("No intent data for launcher overlay.");
            return false;
        }
        zzacu.m16423a(context);
        Intent intent = zzcVar.intent;
        if (intent != null) {
            return zza(context, intent, zzuVar);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzcVar.url)) {
            zzbad.m17353i("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(zzcVar.mimeType)) {
            intent2.setData(Uri.parse(zzcVar.url));
        } else {
            intent2.setDataAndType(Uri.parse(zzcVar.url), zzcVar.mimeType);
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzcVar.packageName)) {
            intent2.setPackage(zzcVar.packageName);
        }
        if (!TextUtils.isEmpty(zzcVar.zzdjh)) {
            String[] strArrSplit = zzcVar.zzdjh.split("/", 2);
            if (strArrSplit.length < 2) {
                String strValueOf = String.valueOf(zzcVar.zzdjh);
                zzbad.m17353i(strValueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(strValueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str = zzcVar.zzdji;
        if (!TextUtils.isEmpty(str)) {
            try {
                i2 = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                zzbad.m17353i("Could not parse intent flags.");
            }
            intent2.addFlags(i2);
        }
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21632G3)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21626F3)).booleanValue()) {
                com.google.android.gms.ads.internal.zzk.zzlg();
                zzaxi.m17129I(context, intent2);
            }
        }
        return zza(context, intent2, zzuVar);
    }

    private static boolean zza(Context context, Intent intent, zzu zzuVar) {
        try {
            String strValueOf = String.valueOf(intent.toURI());
            zzawz.m17082m(strValueOf.length() != 0 ? "Launching an intent: ".concat(strValueOf) : new String("Launching an intent: "));
            com.google.android.gms.ads.internal.zzk.zzlg();
            zzaxi.m17155i(context, intent);
            if (zzuVar == null) {
                return true;
            }
            zzuVar.zztq();
            return true;
        } catch (ActivityNotFoundException e2) {
            zzbad.m17353i(e2.getMessage());
            return false;
        }
    }
}
