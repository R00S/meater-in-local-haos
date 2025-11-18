package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.internal.ads.kn */
/* loaded from: classes2.dex */
final class C6864kn implements zzban<zzcrc> {

    /* renamed from: a */
    private final /* synthetic */ zzavy f19718a;

    C6864kn(zzcqq zzcqqVar, zzavy zzavyVar) {
        this.f19718a = zzavyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        try {
            this.f19718a.onError("Internal error.");
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final /* synthetic */ void mo14743b(zzcrc zzcrcVar) {
        zzcrc zzcrcVar2 = zzcrcVar;
        try {
            this.f19718a.mo17022T6(zzcrcVar2.f24955a, zzcrcVar2.f24956b);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }
}
