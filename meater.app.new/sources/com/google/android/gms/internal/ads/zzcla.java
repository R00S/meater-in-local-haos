package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzcla extends zzamw implements zzbsm {

    /* renamed from: f */
    private zzamv f24661f;

    /* renamed from: g */
    private zzbsn f24662g;

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: F0 */
    public final synchronized void mo16717F0(zzafe zzafeVar, String str) throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.mo16717F0(zzafeVar, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: I6 */
    public final synchronized void mo16718I6() throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.mo16718I6();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: R */
    public final synchronized void mo16719R(int i2) throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.mo16719R(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: b1 */
    public final synchronized void mo16720b1() throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.mo16720b1();
        }
    }

    /* renamed from: i7 */
    public final synchronized void m18861i7(zzamv zzamvVar) {
        this.f24661f = zzamvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: k1 */
    public final synchronized void mo16721k1(zzamy zzamyVar) throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.mo16721k1(zzamyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: m3 */
    public final synchronized void mo16722m3(String str) throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.mo16722m3(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: n0 */
    public final synchronized void mo16723n0() throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.mo16723n0();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    /* renamed from: n6 */
    public final synchronized void mo18315n6(zzbsn zzbsnVar) {
        this.f24662g = zzbsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onAdClicked() throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onAdClosed() throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.onAdClosed();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onAdFailedToLoad(int i2) throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.onAdFailedToLoad(i2);
        }
        zzbsn zzbsnVar = this.f24662g;
        if (zzbsnVar != null) {
            zzbsnVar.onAdFailedToLoad(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onAdImpression() throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onAdLeftApplication() throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.onAdLeftApplication();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onAdLoaded() throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.onAdLoaded();
        }
        zzbsn zzbsnVar = this.f24662g;
        if (zzbsnVar != null) {
            zzbsnVar.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onAdOpened() throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.onAdOpened();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onAppEvent(String str, String str2) throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.onAppEvent(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onVideoPause() throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.onVideoPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void onVideoPlay() throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.onVideoPlay();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: t5 */
    public final synchronized void mo16724t5(zzato zzatoVar) throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.mo16724t5(zzatoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: v0 */
    public final synchronized void mo16725v0(zzatq zzatqVar) throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.mo16725v0(zzatqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        zzamv zzamvVar = this.f24661f;
        if (zzamvVar != null) {
            zzamvVar.zzb(bundle);
        }
    }
}
