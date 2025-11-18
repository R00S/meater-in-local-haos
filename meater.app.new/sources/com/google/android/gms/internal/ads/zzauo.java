package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.internal.Preconditions;

@zzard
/* loaded from: classes2.dex */
public final class zzauo implements MediationRewardedAdCallback {

    /* renamed from: a */
    private final zzamv f22525a;

    public zzauo(zzamv zzamvVar) {
        this.f22525a = zzamvVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdClosed.");
        try {
            this.f22525a.onAdClosed();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(String str) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdFailedToShow.");
        String strValueOf = String.valueOf(str);
        zzbad.m17353i(strValueOf.length() != 0 ? "Mediation ad failed to show: ".concat(strValueOf) : new String("Mediation ad failed to show: "));
        try {
            this.f22525a.mo16719R(0);
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdOpened.");
        try {
            this.f22525a.onAdOpened();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(RewardItem rewardItem) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onUserEarnedReward.");
        try {
            this.f22525a.mo16725v0(new zzaup(rewardItem));
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoComplete() {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onVideoComplete.");
        try {
            this.f22525a.mo16718I6();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onVideoStart.");
        try {
            this.f22525a.mo16720b1();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called reportAdClicked.");
        try {
            this.f22525a.onAdClicked();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called reportAdImpression.");
        try {
            this.f22525a.onAdImpression();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }
}
