package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.view.View;

@TargetApi(18)
/* loaded from: classes2.dex */
public class zzaxs extends zzaxr {
    @Override // com.google.android.gms.internal.ads.zzaxo
    /* renamed from: b */
    public boolean mo17191b(View view) {
        return super.mo17191b(view) || view.getWindowId() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    /* renamed from: s */
    public final int mo17205s() {
        return 14;
    }
}
