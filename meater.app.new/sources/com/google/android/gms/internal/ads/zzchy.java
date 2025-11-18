package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes2.dex */
public final class zzchy extends zzars {

    /* renamed from: f */
    private final /* synthetic */ zzchx f24348f;

    protected zzchy(zzchx zzchxVar) {
        this.f24348f = zzchxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzarr
    /* renamed from: K5 */
    public final void mo16896K5(zzaym zzaymVar) {
        this.f24348f.f24342f.m17386c(new zzayn(zzaymVar.f22683f, zzaymVar.f22684g));
    }

    @Override // com.google.android.gms.internal.ads.zzarr
    /* renamed from: V0 */
    public final void mo16897V0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f24348f.f24342f.m17385a(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
