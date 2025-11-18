package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
/* loaded from: classes2.dex */
public class zzaxu extends zzaxs {
    @Override // com.google.android.gms.internal.ads.zzaxs, com.google.android.gms.internal.ads.zzaxo
    /* renamed from: b */
    public final boolean mo17191b(View view) {
        return view.isAttachedToWindow();
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    /* renamed from: t */
    public final ViewGroup.LayoutParams mo17206t() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
