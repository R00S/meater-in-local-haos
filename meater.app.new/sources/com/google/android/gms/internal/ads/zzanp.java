package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzanp extends zzamw {

    /* renamed from: f */
    private final Adapter f22194f;

    /* renamed from: g */
    private final zzatk f22195g;

    zzanp(Adapter adapter, zzatk zzatkVar) {
        this.f22194f = adapter;
        this.f22195g = zzatkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: F0 */
    public final void mo16717F0(zzafe zzafeVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: I6 */
    public final void mo16718I6() throws RemoteException {
        zzatk zzatkVar = this.f22195g;
        if (zzatkVar != null) {
            zzatkVar.mo15308b5(ObjectWrapper.m14708E0(this.f22194f));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: R */
    public final void mo16719R(int i2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: b1 */
    public final void mo16720b1() throws RemoteException {
        zzatk zzatkVar = this.f22195g;
        if (zzatkVar != null) {
            zzatkVar.mo15307a2(ObjectWrapper.m14708E0(this.f22194f));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: k1 */
    public final void mo16721k1(zzamy zzamyVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: m3 */
    public final void mo16722m3(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: n0 */
    public final void mo16723n0() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdClicked() throws RemoteException {
        zzatk zzatkVar = this.f22195g;
        if (zzatkVar != null) {
            zzatkVar.mo15304G6(ObjectWrapper.m14708E0(this.f22194f));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdClosed() throws RemoteException {
        zzatk zzatkVar = this.f22195g;
        if (zzatkVar != null) {
            zzatkVar.mo15306Y5(ObjectWrapper.m14708E0(this.f22194f));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdFailedToLoad(int i2) throws RemoteException {
        zzatk zzatkVar = this.f22195g;
        if (zzatkVar != null) {
            zzatkVar.mo15312q2(ObjectWrapper.m14708E0(this.f22194f), i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdImpression() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdLeftApplication() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdLoaded() throws RemoteException {
        zzatk zzatkVar = this.f22195g;
        if (zzatkVar != null) {
            zzatkVar.mo15313w3(ObjectWrapper.m14708E0(this.f22194f));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdOpened() throws RemoteException {
        zzatk zzatkVar = this.f22195g;
        if (zzatkVar != null) {
            zzatkVar.mo15311f1(ObjectWrapper.m14708E0(this.f22194f));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAppEvent(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onVideoPause() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onVideoPlay() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: t5 */
    public final void mo16724t5(zzato zzatoVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: v0 */
    public final void mo16725v0(zzatq zzatqVar) throws RemoteException {
        zzatk zzatkVar = this.f22195g;
        if (zzatkVar != null) {
            zzatkVar.mo15305Y3(ObjectWrapper.m14708E0(this.f22194f), new zzato(zzatqVar.getType(), zzatqVar.getAmount()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzb(Bundle bundle) throws RemoteException {
    }
}
