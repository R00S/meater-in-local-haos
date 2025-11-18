package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzaug {

    /* renamed from: a */
    private final zzatt f22518a;

    /* renamed from: b */
    private final Context f22519b;

    public zzaug(Context context, String str) {
        this.f22519b = context.getApplicationContext();
        this.f22518a = zzyt.m20845b().m20843j(context, str, new zzamo());
    }

    /* renamed from: a */
    public final Bundle m16953a() {
        try {
            return this.f22518a.getAdMetadata();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            return new Bundle();
        }
    }

    /* renamed from: b */
    public final String m16954b() {
        try {
            return this.f22518a.getMediationAdapterClassName();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* renamed from: c */
    public final RewardItem m16955c() {
        try {
            zzatq zzatqVarMo16378O6 = this.f22518a.mo16378O6();
            if (zzatqVarMo16378O6 == null) {
                return null;
            }
            return new zzauh(zzatqVarMo16378O6);
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            return null;
        }
    }

    /* renamed from: d */
    public final boolean m16956d() {
        try {
            return this.f22518a.isLoaded();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            return false;
        }
    }

    /* renamed from: e */
    public final void m16957e(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.f22518a.mo16375G5(new zzabz(onAdMetadataChangedListener));
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: f */
    public final void m16958f(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            this.f22518a.mo16382m2(new zzaum(serverSideVerificationOptions));
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: g */
    public final void m16959g(Activity activity, RewardedAdCallback rewardedAdCallback) {
        try {
            this.f22518a.mo16377L5(new zzaui(rewardedAdCallback));
            this.f22518a.mo16381f5(ObjectWrapper.m14708E0(activity));
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: h */
    public final void m16960h(Activity activity, RewardedAdCallback rewardedAdCallback, boolean z) {
        try {
            this.f22518a.mo16377L5(new zzaui(rewardedAdCallback));
            this.f22518a.mo16380e7(ObjectWrapper.m14708E0(activity), z);
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: i */
    public final void m16961i(zzaaz zzaazVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            this.f22518a.mo16379W1(zzyc.m20820a(this.f22519b, zzaazVar), new zzaul(rewardedAdLoadCallback));
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }
}
