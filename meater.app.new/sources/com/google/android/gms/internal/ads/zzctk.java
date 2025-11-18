package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzctk implements zzcuz<Bundle> {

    /* renamed from: a */
    private final zzcxk f25054a;

    public zzctk(zzcxk zzcxkVar) {
        this.f25054a = zzcxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzcxk zzcxkVar = this.f25054a;
        if (zzcxkVar != null) {
            bundle2.putBoolean("render_in_browser", zzcxkVar.m19018b());
            bundle2.putBoolean("disable_ml", this.f25054a.m19019c());
        }
    }
}
