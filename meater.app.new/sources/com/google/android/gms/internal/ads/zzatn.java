package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzatn implements MediationRewardedVideoAdListener {

    /* renamed from: a */
    private final zzatk f22515a;

    public zzatn(zzatk zzatkVar) {
        this.f22515a = zzatkVar;
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onAdClicked(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdClicked.");
        try {
            this.f22515a.mo15304G6(ObjectWrapper.m14708E0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onAdClosed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdClosed.");
        try {
            this.f22515a.mo15306Y5(ObjectWrapper.m14708E0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onAdFailedToLoad(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i2) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdFailedToLoad.");
        try {
            this.f22515a.mo15312q2(ObjectWrapper.m14708E0(mediationRewardedVideoAdAdapter), i2);
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onAdLeftApplication(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdLeftApplication.");
        try {
            this.f22515a.mo15310e4(ObjectWrapper.m14708E0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onAdLoaded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdLoaded.");
        try {
            this.f22515a.mo15313w3(ObjectWrapper.m14708E0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onAdOpened(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdOpened.");
        try {
            this.f22515a.mo15311f1(ObjectWrapper.m14708E0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onInitializationFailed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i2) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onInitializationFailed.");
        try {
            this.f22515a.mo15303F1(ObjectWrapper.m14708E0(mediationRewardedVideoAdAdapter), i2);
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onInitializationSucceeded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onInitializationSucceeded.");
        try {
            this.f22515a.mo15309c3(ObjectWrapper.m14708E0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onRewarded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, RewardItem rewardItem) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onRewarded.");
        try {
            if (rewardItem != null) {
                this.f22515a.mo15305Y3(ObjectWrapper.m14708E0(mediationRewardedVideoAdAdapter), new zzato(rewardItem));
            } else {
                this.f22515a.mo15305Y3(ObjectWrapper.m14708E0(mediationRewardedVideoAdAdapter), new zzato(HttpUrl.FRAGMENT_ENCODE_SET, 1));
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onVideoCompleted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onVideoCompleted.");
        try {
            this.f22515a.mo15308b5(ObjectWrapper.m14708E0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onVideoStarted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onVideoStarted.");
        try {
            this.f22515a.mo15307a2(ObjectWrapper.m14708E0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void zzb(Bundle bundle) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdMetadataChanged.");
        try {
            this.f22515a.zzb(bundle);
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }
}
