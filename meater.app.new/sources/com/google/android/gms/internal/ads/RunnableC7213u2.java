package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p241e.p254e.p255a.EnumC8781a;

/* renamed from: com.google.android.gms.internal.ads.u2 */
/* loaded from: classes2.dex */
final class RunnableC7213u2 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ EnumC8781a f20605f;

    /* renamed from: g */
    private final /* synthetic */ zzanu f20606g;

    RunnableC7213u2(zzanu zzanuVar, EnumC8781a enumC8781a) {
        this.f20606g = zzanuVar;
        this.f20605f = enumC8781a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f20606g.f22212a.onAdFailedToLoad(zzaog.m16808a(this.f20605f));
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }
}
