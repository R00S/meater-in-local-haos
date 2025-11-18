package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.t4 */
/* loaded from: classes2.dex */
final class RunnableC7178t4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Context f20554f;

    /* renamed from: g */
    private final /* synthetic */ zzbbr f20555g;

    RunnableC7178t4(zzawg zzawgVar, Context context, zzbbr zzbbrVar) {
        this.f20554f = context;
        this.f20555g = zzbbrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f20555g.m17385a(AdvertisingIdClient.getAdvertisingIdInfo(this.f20554f));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e2) {
            this.f20555g.m17386c(e2);
            zzbad.m17347c("Exception while getting advertising Id info", e2);
        }
    }
}
