package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzctv implements zzcuz<Bundle> {

    /* renamed from: a */
    private final String f25067a;

    public zzctv(String str) {
        this.f25067a = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m18979b(Set<String> set) {
        return set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner");
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(Bundle bundle) {
        zzcxz.m19063e(bundle, "omid_v", this.f25067a);
    }
}
