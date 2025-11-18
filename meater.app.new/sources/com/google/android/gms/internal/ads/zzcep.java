package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzwl;

/* loaded from: classes2.dex */
public final class zzcep implements zzbro, zzbrw, zzbsr, zzbtk, zzxr {

    /* renamed from: f */
    private final zzwj f24184f;

    /* renamed from: g */
    private boolean f24185g = false;

    /* renamed from: h */
    private boolean f24186h = false;

    public zzcep(zzwj zzwjVar) {
        this.f24184f = zzwjVar;
        zzwjVar.m20698b(zzwl.zza.zzb.AD_REQUEST);
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    /* renamed from: N */
    public final void mo15437N(zzarx zzarxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final synchronized void onAdClicked() {
        if (this.f24186h) {
            this.f24184f.m20698b(zzwl.zza.zzb.AD_SUBSEQUENT_CLICK);
        } else {
            this.f24184f.m20698b(zzwl.zza.zzb.AD_FIRST_CLICK);
            this.f24186h = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final void onAdFailedToLoad(int i2) {
        switch (i2) {
            case 1:
                this.f24184f.m20698b(zzwl.zza.zzb.AD_FAILED_TO_LOAD_INVALID_REQUEST);
                break;
            case 2:
                this.f24184f.m20698b(zzwl.zza.zzb.AD_FAILED_TO_LOAD_NETWORK_ERROR);
                break;
            case 3:
                this.f24184f.m20698b(zzwl.zza.zzb.AD_FAILED_TO_LOAD_NO_FILL);
                break;
            case 4:
                this.f24184f.m20698b(zzwl.zza.zzb.AD_FAILED_TO_LOAD_TIMEOUT);
                break;
            case 5:
                this.f24184f.m20698b(zzwl.zza.zzb.AD_FAILED_TO_LOAD_CANCELLED);
                break;
            case 6:
                this.f24184f.m20698b(zzwl.zza.zzb.AD_FAILED_TO_LOAD_NO_ERROR);
                break;
            case 7:
                this.f24184f.m20698b(zzwl.zza.zzb.AD_FAILED_TO_LOAD_NOT_FOUND);
                break;
            default:
                this.f24184f.m20698b(zzwl.zza.zzb.AD_FAILED_TO_LOAD);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final synchronized void onAdImpression() {
        this.f24184f.m20698b(zzwl.zza.zzb.AD_IMPRESSION);
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void onAdLoaded() {
        this.f24184f.m20698b(zzwl.zza.zzb.AD_LOADED);
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    /* renamed from: q */
    public final void mo15438q(final zzcxu zzcxuVar) {
        this.f24184f.m20697a(new zzwk(zzcxuVar) { // from class: com.google.android.gms.internal.ads.gi

            /* renamed from: a */
            private final zzcxu f18979a;

            {
                this.f18979a = zzcxuVar;
            }

            @Override // com.google.android.gms.internal.ads.zzwk
            /* renamed from: a */
            public final void mo14971a(zzxn zzxnVar) {
                zzcxu zzcxuVar2 = this.f18979a;
                zzxnVar.f27374l.f27344f.f27352c = zzcxuVar2.f25289b.f25284b.f25273b;
            }
        });
    }
}
