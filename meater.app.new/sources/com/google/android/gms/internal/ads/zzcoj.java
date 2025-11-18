package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zzcoj extends zzamw {

    /* renamed from: f */
    private final zzbri f24809f;

    /* renamed from: g */
    private final zzbrt f24810g;

    /* renamed from: h */
    private final zzbse f24811h;

    /* renamed from: i */
    private final zzbso f24812i;

    /* renamed from: j */
    private final zzbtp f24813j;

    /* renamed from: k */
    private final zzbsv f24814k;

    /* renamed from: l */
    private final zzbvq f24815l;

    public zzcoj(zzbri zzbriVar, zzbrt zzbrtVar, zzbse zzbseVar, zzbso zzbsoVar, zzbtp zzbtpVar, zzbsv zzbsvVar, zzbvq zzbvqVar) {
        this.f24809f = zzbriVar;
        this.f24810g = zzbrtVar;
        this.f24811h = zzbseVar;
        this.f24812i = zzbsoVar;
        this.f24813j = zzbtpVar;
        this.f24814k = zzbsvVar;
        this.f24815l = zzbvqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: F0 */
    public final void mo16717F0(zzafe zzafeVar, String str) {
    }

    /* renamed from: I6 */
    public void mo16718I6() throws RemoteException {
    }

    /* renamed from: R */
    public void mo16719R(int i2) throws RemoteException {
    }

    /* renamed from: b1 */
    public void mo16720b1() {
        this.f24815l.m18398i0();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: k1 */
    public final void mo16721k1(zzamy zzamyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: m3 */
    public final void mo16722m3(String str) {
    }

    /* renamed from: n0 */
    public void mo16723n0() {
        this.f24815l.m18395Y();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdClicked() {
        this.f24809f.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdClosed() {
        this.f24814k.zzsz();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdFailedToLoad(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdImpression() {
        this.f24810g.m18301Y();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdLeftApplication() {
        this.f24811h.m18309f0();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdLoaded() {
        this.f24812i.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdOpened() {
        this.f24814k.zzta();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAppEvent(String str, String str2) {
        this.f24813j.onAppEvent(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onVideoPause() {
        this.f24815l.m18396f0();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onVideoPlay() throws RemoteException {
        this.f24815l.m18397g0();
    }

    /* renamed from: t5 */
    public void mo16724t5(zzato zzatoVar) {
    }

    /* renamed from: v0 */
    public void mo16725v0(zzatq zzatqVar) throws RemoteException {
    }

    public void zzb(Bundle bundle) throws RemoteException {
    }
}
