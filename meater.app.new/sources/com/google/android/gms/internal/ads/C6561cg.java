package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.cg */
/* loaded from: classes2.dex */
final class C6561cg implements zzaho<Object> {

    /* renamed from: a */
    private final /* synthetic */ zzagd f18449a;

    /* renamed from: b */
    private final /* synthetic */ zzbzq f18450b;

    C6561cg(zzbzq zzbzqVar, zzagd zzagdVar) {
        this.f18450b = zzbzqVar;
        this.f18449a = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final void mo14739a(Object obj, Map<String, String> map) {
        try {
            this.f18450b.f23908k = Long.valueOf(Long.parseLong(map.get("timestamp")));
        } catch (NumberFormatException unused) {
            zzbad.m17351g("Failed to call parse unconfirmedClickTimestamp.");
        }
        this.f18450b.f23907j = map.get(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
        String str = map.get("asset_id");
        zzagd zzagdVar = this.f18449a;
        if (zzagdVar == null) {
            zzbad.m17349e("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            zzagdVar.onUnconfirmedClickReceived(str);
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }
}
