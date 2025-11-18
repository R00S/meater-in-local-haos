package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ph */
/* loaded from: classes2.dex */
final class C7043ph implements com.google.android.gms.ads.internal.overlay.zzo, com.google.android.gms.ads.internal.overlay.zzu, zzagv, zzagx, zzxr {

    /* renamed from: f */
    private zzxr f20298f;

    /* renamed from: g */
    private zzagv f20299g;

    /* renamed from: h */
    private com.google.android.gms.ads.internal.overlay.zzo f20300h;

    /* renamed from: i */
    private zzagx f20301i;

    /* renamed from: j */
    private com.google.android.gms.ads.internal.overlay.zzu f20302j;

    private C7043ph() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized void m15746b(zzxr zzxrVar, zzagv zzagvVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzagx zzagxVar, com.google.android.gms.ads.internal.overlay.zzu zzuVar) {
        this.f20298f = zzxrVar;
        this.f20299g = zzagvVar;
        this.f20300h = zzoVar;
        this.f20301i = zzagxVar;
        this.f20302j = zzuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagv
    /* renamed from: k */
    public final synchronized void mo15747k(String str, Bundle bundle) {
        zzagv zzagvVar = this.f20299g;
        if (zzagvVar != null) {
            zzagvVar.mo15747k(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final synchronized void onAdClicked() {
        zzxr zzxrVar = this.f20298f;
        if (zzxrVar != null) {
            zzxrVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagx
    public final synchronized void onAppEvent(String str, String str2) {
        zzagx zzagxVar = this.f20301i;
        if (zzagxVar != null) {
            zzagxVar.onAppEvent(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onPause() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.f20300h;
        if (zzoVar != null) {
            zzoVar.onPause();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onResume() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.f20300h;
        if (zzoVar != null) {
            zzoVar.onResume();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzsz() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.f20300h;
        if (zzoVar != null) {
            zzoVar.zzsz();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzta() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.f20300h;
        if (zzoVar != null) {
            zzoVar.zzta();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzu
    public final synchronized void zztq() {
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.f20302j;
        if (zzuVar != null) {
            zzuVar.zztq();
        }
    }

    /* synthetic */ C7043ph(C6895lh c6895lh) {
        this();
    }
}
