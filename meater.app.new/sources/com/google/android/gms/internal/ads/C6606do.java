package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.do */
/* loaded from: classes2.dex */
final class C6606do implements zzcuz<Bundle> {

    /* renamed from: a */
    private final String f18696a;

    /* renamed from: b */
    private final Bundle f18697b;

    private C6606do(String str, Bundle bundle) {
        this.f18696a = str;
        this.f18697b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("consent_string", this.f18696a);
        bundle2.putBundle("iab_consent_info", this.f18697b);
    }
}
