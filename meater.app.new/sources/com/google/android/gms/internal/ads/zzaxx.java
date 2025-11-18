package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.zzk;

@TargetApi(26)
/* loaded from: classes2.dex */
public class zzaxx extends zzaxw {
    @Override // com.google.android.gms.internal.ads.zzaxo
    /* renamed from: h */
    public final zzwx mo17197h(Context context, TelephonyManager telephonyManager) {
        zzk.zzlg();
        return zzaxi.m17152f0(context, "android.permission.ACCESS_NETWORK_STATE") ? telephonyManager.isDataEnabled() ? zzwx.ENUM_TRUE : zzwx.ENUM_FALSE : zzwx.ENUM_FALSE;
    }
}
