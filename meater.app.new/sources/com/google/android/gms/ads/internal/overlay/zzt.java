package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqh;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzxr;

@zzard
/* loaded from: classes2.dex */
public final class zzt extends zzaqh {
    private AdOverlayInfoParcel zzdkw;
    private boolean zzdkx = false;
    private boolean zzdky = false;
    private Activity zzzd;

    public zzt(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzdkw = adOverlayInfoParcel;
        this.zzzd = activity;
    }

    private final synchronized void zztp() {
        if (!this.zzdky) {
            zzo zzoVar = this.zzdkw.zzdkm;
            if (zzoVar != null) {
                zzoVar.zzsz();
            }
            this.zzdky = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onActivityResult(int i2, int i3, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onBackPressed() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onCreate(Bundle bundle) {
        zzo zzoVar;
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdkw;
        if (adOverlayInfoParcel == null) {
            this.zzzd.finish();
            return;
        }
        if (z) {
            this.zzzd.finish();
            return;
        }
        if (bundle == null) {
            zzxr zzxrVar = adOverlayInfoParcel.zzcgi;
            if (zzxrVar != null) {
                zzxrVar.onAdClicked();
            }
            if (this.zzzd.getIntent() != null && this.zzzd.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzoVar = this.zzdkw.zzdkm) != null) {
                zzoVar.zzta();
            }
        }
        com.google.android.gms.ads.internal.zzk.zzle();
        Activity activity = this.zzzd;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdkw;
        if (zza.zza(activity, adOverlayInfoParcel2.zzdkl, adOverlayInfoParcel2.zzdkq)) {
            return;
        }
        this.zzzd.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onDestroy() throws RemoteException {
        if (this.zzzd.isFinishing()) {
            zztp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onPause() throws RemoteException {
        zzo zzoVar = this.zzdkw.zzdkm;
        if (zzoVar != null) {
            zzoVar.onPause();
        }
        if (this.zzzd.isFinishing()) {
            zztp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onRestart() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onResume() throws RemoteException {
        if (this.zzdkx) {
            this.zzzd.finish();
            return;
        }
        this.zzdkx = true;
        zzo zzoVar = this.zzdkw.zzdkm;
        if (zzoVar != null) {
            zzoVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdkx);
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onStart() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onStop() throws RemoteException {
        if (this.zzzd.isFinishing()) {
            zztp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void zzac(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void zzdd() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final boolean zztg() throws RemoteException {
        return false;
    }
}
