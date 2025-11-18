package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzbxg implements zzbrl, zzbur {

    /* renamed from: f */
    private final zzavf f23681f;

    /* renamed from: g */
    private final Context f23682g;

    /* renamed from: h */
    private final zzavg f23683h;

    /* renamed from: i */
    private final View f23684i;

    /* renamed from: j */
    private String f23685j;

    /* renamed from: k */
    private final int f23686k;

    public zzbxg(zzavf zzavfVar, Context context, zzavg zzavgVar, View view, int i2) {
        this.f23681f = zzavfVar;
        this.f23682g = context;
        this.f23683h = zzavgVar;
        this.f23684i = view;
        this.f23686k = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    /* renamed from: a */
    public final void mo17882a(zzasr zzasrVar, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f23683h.m17002D(this.f23682g)) {
            try {
                zzavg zzavgVar = this.f23683h;
                Context context = this.f23682g;
                zzavgVar.m17005g(context, zzavgVar.m17009n(context), this.f23681f.m16985j(), zzasrVar.getType(), zzasrVar.getAmount());
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception to get reward item.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdClosed() {
        this.f23681f.m16986k(false);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdOpened() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view = this.f23684i;
        if (view != null && this.f23685j != null) {
            this.f23683h.m17014t(view.getContext(), this.f23685j);
        }
        this.f23681f.m16986k(true);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbur
    /* renamed from: y */
    public final void mo18380y() {
        String strM17003F = this.f23683h.m17003F(this.f23682g);
        this.f23685j = strM17003F;
        String strValueOf = String.valueOf(strM17003F);
        String str = this.f23686k == 7 ? "/Rewarded" : "/Interstitial";
        this.f23685j = str.length() != 0 ? strValueOf.concat(str) : new String(strValueOf);
    }
}
