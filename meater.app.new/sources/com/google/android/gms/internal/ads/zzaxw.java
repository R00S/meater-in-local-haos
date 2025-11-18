package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzk;

@TargetApi(24)
/* loaded from: classes2.dex */
public class zzaxw extends zzaxv {
    /* renamed from: w */
    private static boolean m17208w(int i2, int i3, int i4) {
        return Math.abs(i2 - i3) <= i4;
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    /* renamed from: j */
    public final boolean mo17199j(Activity activity, Configuration configuration) {
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21680O3)).booleanValue()) {
            return false;
        }
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21692Q3)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        zzyt.m20844a();
        int iM17300a = zzazt.m17300a(activity, configuration.screenHeightDp);
        int iM17300a2 = zzazt.m17300a(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        zzk.zzlg();
        DisplayMetrics displayMetricsM17143b = zzaxi.m17143b(windowManager);
        int i2 = displayMetricsM17143b.heightPixels;
        int i3 = displayMetricsM17143b.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        double d2 = activity.getResources().getDisplayMetrics().density;
        Double.isNaN(d2);
        int iRound = ((int) Math.round(d2 + 0.5d)) * ((Integer) zzyt.m20848e().m16421c(zzacu.f21674N3)).intValue();
        return !(m17208w(i2, iM17300a + dimensionPixelSize, iRound) && m17208w(i3, iM17300a2, iRound));
    }
}
