package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: com.google.android.gms.internal.ads.hm */
/* loaded from: classes2.dex */
final class BinderC6752hm extends zzatl {

    /* renamed from: f */
    private final /* synthetic */ zzbsv f19235f;

    /* renamed from: g */
    private final /* synthetic */ zzbri f19236g;

    /* renamed from: h */
    private final /* synthetic */ zzbse f19237h;

    /* renamed from: i */
    private final /* synthetic */ zzbvj f19238i;

    BinderC6752hm(zzcnw zzcnwVar, zzbsv zzbsvVar, zzbri zzbriVar, zzbse zzbseVar, zzbvj zzbvjVar) {
        this.f19235f = zzbsvVar;
        this.f19236g = zzbriVar;
        this.f19237h = zzbseVar;
        this.f19238i = zzbvjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: F1 */
    public final void mo15303F1(IObjectWrapper iObjectWrapper, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: G6 */
    public final void mo15304G6(IObjectWrapper iObjectWrapper) {
        this.f19236g.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: Y3 */
    public final void mo15305Y3(IObjectWrapper iObjectWrapper, zzato zzatoVar) {
        this.f19238i.mo16580P(zzatoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: Y5 */
    public final void mo15306Y5(IObjectWrapper iObjectWrapper) {
        this.f19235f.zzsz();
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: a2 */
    public final void mo15307a2(IObjectWrapper iObjectWrapper) {
        this.f19238i.mo16582r();
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: b5 */
    public final void mo15308b5(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.f19237h.m18311i0();
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: c3 */
    public final void mo15309c3(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: e4 */
    public final void mo15310e4(IObjectWrapper iObjectWrapper) {
        this.f19237h.m18309f0();
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: f1 */
    public final void mo15311f1(IObjectWrapper iObjectWrapper) {
        this.f19235f.zzta();
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: q2 */
    public final void mo15312q2(IObjectWrapper iObjectWrapper, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: w3 */
    public final void mo15313w3(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void zzb(Bundle bundle) {
    }
}
