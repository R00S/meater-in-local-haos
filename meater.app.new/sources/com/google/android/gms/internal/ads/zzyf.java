package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;

@zzard
/* loaded from: classes2.dex */
public final class zzyf extends zzzt {

    /* renamed from: f */
    private final AppEventListener f27457f;

    public zzyf(AppEventListener appEventListener) {
        this.f27457f = appEventListener;
    }

    /* renamed from: i7 */
    public final AppEventListener m20826i7() {
        return this.f27457f;
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final void onAppEvent(String str, String str2) {
        this.f27457f.onAppEvent(str, str2);
    }
}
