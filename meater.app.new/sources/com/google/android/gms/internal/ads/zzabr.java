package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzabr extends zzaac {

    /* renamed from: f */
    private zzait f21569f;

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: B2 */
    public final void mo16171B2(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: C4 */
    public final float mo16172C4() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: H3 */
    public final String mo16173H3() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: J3 */
    public final boolean mo16174J3() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: N2 */
    public final void mo16175N2(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: O0 */
    public final void mo16176O0(zzamp zzampVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: T2 */
    public final List<zzaio> mo16177T2() throws RemoteException {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: Y1 */
    public final void mo16178Y1(zzait zzaitVar) throws RemoteException {
        this.f21569f = zzaitVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: a */
    public final void mo16179a() throws RemoteException {
        zzbad.m17351g("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzazt.f22735a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.h

            /* renamed from: f */
            private final zzabr f19022f;

            {
                this.f19022f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f19022f.m16366h7();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: c2 */
    public final void mo16180c2(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: e5 */
    public final void mo16181e5(String str) throws RemoteException {
    }

    /* renamed from: h7 */
    final /* synthetic */ void m16366h7() {
        zzait zzaitVar = this.f21569f;
        if (zzaitVar != null) {
            try {
                zzaitVar.mo16591u0(Collections.EMPTY_LIST);
            } catch (RemoteException e2) {
                zzbad.m17348d("Could not notify onComplete event.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: t6 */
    public final void mo16182t6(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: v5 */
    public final void mo16183v5(float f2) throws RemoteException {
    }
}
