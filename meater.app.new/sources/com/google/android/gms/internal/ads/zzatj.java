package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
/* loaded from: classes2.dex */
public final class zzatj implements RewardedVideoAd {

    /* renamed from: a */
    private final zzasw f22509a;

    /* renamed from: b */
    private final Context f22510b;

    /* renamed from: c */
    private final Object f22511c = new Object();

    /* renamed from: d */
    private final zzatg f22512d = new zzatg(null);

    /* renamed from: e */
    private String f22513e;

    /* renamed from: f */
    private String f22514f;

    public zzatj(Context context, zzasw zzaswVar) {
        this.f22509a = zzaswVar == null ? new zzabx() : zzaswVar;
        this.f22510b = context.getApplicationContext();
    }

    /* renamed from: a */
    private final void m16940a(String str, zzaaz zzaazVar) {
        synchronized (this.f22511c) {
            zzasw zzaswVar = this.f22509a;
            if (zzaswVar == null) {
                return;
            }
            try {
                zzaswVar.mo16390i4(new zzath(zzyc.m20820a(this.f22510b, zzaazVar), str));
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void destroy() {
        destroy(null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final Bundle getAdMetadata() {
        synchronized (this.f22511c) {
            zzasw zzaswVar = this.f22509a;
            if (zzaswVar != null) {
                try {
                    return zzaswVar.getAdMetadata();
                } catch (RemoteException e2) {
                    zzbad.m17350f("#007 Could not call remote method.", e2);
                }
            }
            return new Bundle();
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final String getCustomData() {
        String str;
        synchronized (this.f22511c) {
            str = this.f22514f;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final String getMediationAdapterClassName() {
        try {
            zzasw zzaswVar = this.f22509a;
            if (zzaswVar != null) {
                return zzaswVar.getMediationAdapterClassName();
            }
            return null;
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        RewardedVideoAdListener rewardedVideoAdListenerM16938i7;
        synchronized (this.f22511c) {
            rewardedVideoAdListenerM16938i7 = this.f22512d.m16938i7();
        }
        return rewardedVideoAdListenerM16938i7;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final String getUserId() {
        String str;
        synchronized (this.f22511c) {
            str = this.f22513e;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final boolean isLoaded() {
        synchronized (this.f22511c) {
            zzasw zzaswVar = this.f22509a;
            if (zzaswVar == null) {
                return false;
            }
            try {
                return zzaswVar.isLoaded();
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
                return false;
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void loadAd(String str, AdRequest adRequest) {
        m16940a(str, adRequest.zzde());
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void pause() {
        pause(null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void resume() {
        resume(null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        synchronized (this.f22511c) {
            zzasw zzaswVar = this.f22509a;
            if (zzaswVar != null) {
                try {
                    zzaswVar.mo16392z0(new zzxy(adMetadataListener));
                } catch (RemoteException e2) {
                    zzbad.m17350f("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setCustomData(String str) {
        synchronized (this.f22511c) {
            zzasw zzaswVar = this.f22509a;
            if (zzaswVar != null) {
                try {
                    zzaswVar.setCustomData(str);
                    this.f22514f = str;
                } catch (RemoteException e2) {
                    zzbad.m17350f("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setImmersiveMode(boolean z) {
        synchronized (this.f22511c) {
            zzasw zzaswVar = this.f22509a;
            if (zzaswVar != null) {
                try {
                    zzaswVar.setImmersiveMode(z);
                } catch (RemoteException e2) {
                    zzbad.m17350f("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        synchronized (this.f22511c) {
            this.f22512d.m16939j7(rewardedVideoAdListener);
            zzasw zzaswVar = this.f22509a;
            if (zzaswVar != null) {
                try {
                    zzaswVar.mo16389h0(this.f22512d);
                } catch (RemoteException e2) {
                    zzbad.m17350f("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setUserId(String str) {
        synchronized (this.f22511c) {
            this.f22513e = str;
            zzasw zzaswVar = this.f22509a;
            if (zzaswVar != null) {
                try {
                    zzaswVar.setUserId(str);
                } catch (RemoteException e2) {
                    zzbad.m17350f("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void show() {
        synchronized (this.f22511c) {
            zzasw zzaswVar = this.f22509a;
            if (zzaswVar == null) {
                return;
            }
            try {
                zzaswVar.show();
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void destroy(Context context) {
        synchronized (this.f22511c) {
            this.f22512d.m16939j7(null);
            zzasw zzaswVar = this.f22509a;
            if (zzaswVar == null) {
                return;
            }
            try {
                zzaswVar.mo16387d2(ObjectWrapper.m14708E0(context));
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void loadAd(String str, PublisherAdRequest publisherAdRequest) {
        m16940a(str, publisherAdRequest.zzde());
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void pause(Context context) {
        synchronized (this.f22511c) {
            zzasw zzaswVar = this.f22509a;
            if (zzaswVar == null) {
                return;
            }
            try {
                zzaswVar.mo16384M6(ObjectWrapper.m14708E0(context));
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void resume(Context context) {
        synchronized (this.f22511c) {
            zzasw zzaswVar = this.f22509a;
            if (zzaswVar == null) {
                return;
            }
            try {
                zzaswVar.mo16386T5(ObjectWrapper.m14708E0(context));
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }
}
