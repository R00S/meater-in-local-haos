package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.uj */
/* loaded from: classes2.dex */
final class C7230uj implements zzban<ParcelFileDescriptor> {

    /* renamed from: a */
    private final /* synthetic */ zzarr f20635a;

    C7230uj(zzcig zzcigVar, zzarr zzarrVar) {
        this.f20635a = zzarrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        try {
            this.f20635a.mo16896K5(zzaym.m17245y(th, zzcgm.m18773b(th)));
        } catch (RemoteException e2) {
            zzawz.m17081l("Service can't call client", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final /* synthetic */ void mo14743b(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.f20635a.mo16897V0(parcelFileDescriptor);
        } catch (RemoteException e2) {
            zzawz.m17081l("Service can't call client", e2);
        }
    }
}
