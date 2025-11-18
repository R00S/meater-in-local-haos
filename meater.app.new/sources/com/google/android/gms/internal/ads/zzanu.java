package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.InterfaceC6227c;
import com.google.ads.mediation.InterfaceC6233d;
import com.google.ads.mediation.InterfaceC6234e;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import p241e.p254e.p255a.EnumC8781a;

@zzard
/* loaded from: classes2.dex */
public final class zzanu<NETWORK_EXTRAS extends InterfaceC6234e, SERVER_PARAMETERS extends MediationServerParameters> implements InterfaceC6227c, InterfaceC6233d {

    /* renamed from: a */
    private final zzamv f22212a;

    public zzanu(zzamv zzamvVar) {
        this.f22212a = zzamvVar;
    }

    @Override // com.google.ads.mediation.InterfaceC6227c
    /* renamed from: a */
    public final void mo13392a(MediationBannerAdapter<?, ?> mediationBannerAdapter, EnumC8781a enumC8781a) {
        String strValueOf = String.valueOf(enumC8781a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(strValueOf);
        zzbad.m17349e(sb.toString());
        zzyt.m20844a();
        if (!zzazt.m17318w()) {
            zzbad.m17350f("#008 Must be called on the main UI thread.", null);
            zzazt.f22735a.post(new RunnableC7213u2(this, enumC8781a));
        } else {
            try {
                this.f22212a.onAdFailedToLoad(zzaog.m16808a(enumC8781a));
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.ads.mediation.InterfaceC6233d
    /* renamed from: b */
    public final void mo13394b(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, EnumC8781a enumC8781a) {
        String strValueOf = String.valueOf(enumC8781a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(strValueOf);
        sb.append(".");
        zzbad.m17349e(sb.toString());
        zzyt.m20844a();
        if (!zzazt.m17318w()) {
            zzbad.m17350f("#008 Must be called on the main UI thread.", null);
            zzazt.f22735a.post(new RunnableC7287w2(this, enumC8781a));
        } else {
            try {
                this.f22212a.onAdFailedToLoad(zzaog.m16808a(enumC8781a));
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }
}
