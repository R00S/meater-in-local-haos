package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;

/* loaded from: classes2.dex */
public class MediationBannerAdConfiguration extends MediationAdConfiguration {
    private final AdSize zzdh;

    public MediationBannerAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, Location location, int i2, int i3, String str2, AdSize adSize) {
        super(context, str, bundle, bundle2, z, location, i2, i3, str2);
        this.zzdh = adSize;
    }

    public AdSize getAdSize() {
        return this.zzdh;
    }
}
