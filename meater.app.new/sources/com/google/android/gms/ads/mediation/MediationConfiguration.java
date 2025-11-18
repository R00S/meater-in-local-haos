package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;

/* loaded from: classes2.dex */
public class MediationConfiguration {
    private final Bundle zzemv;
    private final AdFormat zzemz;

    public MediationConfiguration(AdFormat adFormat, Bundle bundle) {
        this.zzemz = adFormat;
        this.zzemv = bundle;
    }

    public AdFormat getFormat() {
        return this.zzemz;
    }

    public Bundle getServerParameters() {
        return this.zzemv;
    }
}
