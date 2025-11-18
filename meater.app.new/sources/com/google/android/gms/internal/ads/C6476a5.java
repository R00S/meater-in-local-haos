package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.a5 */
/* loaded from: classes2.dex */
final class C6476a5 extends zzawv {

    /* renamed from: a */
    private Context f18081a;

    C6476a5(Context context) {
        this.f18081a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zzto() {
        boolean isAdIdFakeForDebugLogging;
        try {
            isAdIdFakeForDebugLogging = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f18081a);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e2) {
            zzbad.m17347c("Fail to get isAdIdFakeForDebugLogging", e2);
            isAdIdFakeForDebugLogging = false;
        }
        zzazx.m17331l(isAdIdFakeForDebugLogging);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(isAdIdFakeForDebugLogging);
        zzbad.m17353i(sb.toString());
    }
}
