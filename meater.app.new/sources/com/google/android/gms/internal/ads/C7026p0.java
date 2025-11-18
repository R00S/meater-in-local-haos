package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.p0 */
/* loaded from: classes2.dex */
final class C7026p0 implements zzbal<zzaig, ParcelFileDescriptor> {

    /* renamed from: a */
    private final /* synthetic */ zzaia f20231a;

    C7026p0(zzaii zzaiiVar, zzaia zzaiaVar) {
        this.f20231a = zzaiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbal
    public final /* synthetic */ zzbbh<ParcelFileDescriptor> zzf(zzaig zzaigVar) throws Exception {
        zzbbr zzbbrVar = new zzbbr();
        zzaigVar.mo16585b3(this.f20231a, new BinderC7063q0(this, zzbbrVar));
        return zzbbrVar;
    }
}
