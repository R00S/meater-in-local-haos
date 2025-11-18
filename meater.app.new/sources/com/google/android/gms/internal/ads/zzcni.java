package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzcni extends zzcoj {

    /* renamed from: m */
    private zzbvj f24768m;

    /* renamed from: n */
    private zzbrp f24769n;

    public zzcni(zzbri zzbriVar, zzbrt zzbrtVar, zzbse zzbseVar, zzbso zzbsoVar, zzbrp zzbrpVar, zzbtp zzbtpVar, zzbvq zzbvqVar, zzbsv zzbsvVar, zzbvj zzbvjVar) {
        super(zzbriVar, zzbrtVar, zzbseVar, zzbsoVar, zzbtpVar, zzbsvVar, zzbvqVar);
        this.f24768m = zzbvjVar;
        this.f24769n = zzbrpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcoj, com.google.android.gms.internal.ads.zzamv
    /* renamed from: I6 */
    public final void mo16718I6() throws RemoteException {
        this.f24768m.mo16581j();
    }

    @Override // com.google.android.gms.internal.ads.zzcoj, com.google.android.gms.internal.ads.zzamv
    /* renamed from: R */
    public final void mo16719R(int i2) throws RemoteException {
        this.f24769n.mo18300R(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcoj, com.google.android.gms.internal.ads.zzamv
    /* renamed from: b1 */
    public final void mo16720b1() {
        this.f24768m.mo16582r();
    }

    @Override // com.google.android.gms.internal.ads.zzcoj, com.google.android.gms.internal.ads.zzamv
    /* renamed from: n0 */
    public final void mo16723n0() {
        this.f24768m.mo16581j();
    }

    @Override // com.google.android.gms.internal.ads.zzcoj, com.google.android.gms.internal.ads.zzamv
    /* renamed from: t5 */
    public final void mo16724t5(zzato zzatoVar) {
        this.f24768m.mo16580P(zzatoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcoj, com.google.android.gms.internal.ads.zzamv
    /* renamed from: v0 */
    public final void mo16725v0(zzatq zzatqVar) throws RemoteException {
        this.f24768m.mo16580P(new zzato(zzatqVar.getType(), zzatqVar.getAmount()));
    }

    @Override // com.google.android.gms.internal.ads.zzcoj, com.google.android.gms.internal.ads.zzamv
    public final void zzb(Bundle bundle) throws RemoteException {
    }
}
