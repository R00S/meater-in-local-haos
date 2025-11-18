package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbmd implements zzbro {

    /* renamed from: f */
    private final zzcxo f23219f;

    /* renamed from: g */
    private final zzcxu f23220g;

    /* renamed from: h */
    private final zzdae f23221h;

    public zzbmd(zzcxu zzcxuVar, zzdae zzdaeVar) {
        this.f23220g = zzcxuVar;
        this.f23221h = zzdaeVar;
        this.f23219f = zzcxuVar.f25289b.f25284b;
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final void onAdFailedToLoad(int i2) {
        this.f23221h.m19132a(this.f23220g, null, this.f23219f.f25272a);
    }
}
