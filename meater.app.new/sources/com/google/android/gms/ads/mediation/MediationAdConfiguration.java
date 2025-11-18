package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class MediationAdConfiguration {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    private final String zzchd;
    private final int zzdga;
    private final String zzemu;
    private final Bundle zzemv;
    private final Bundle zzemw;
    private final int zzemx;
    private final Context zzlj;
    private final boolean zzmv;
    private final Location zzmw;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TagForChildDirectedTreatment {
    }

    public MediationAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, Location location, int i2, int i3, String str2) {
        this.zzemu = str;
        this.zzemv = bundle;
        this.zzemw = bundle2;
        this.zzlj = context;
        this.zzmv = z;
        this.zzmw = location;
        this.zzdga = i2;
        this.zzemx = i3;
        this.zzchd = str2;
    }

    public String getBidResponse() {
        return this.zzemu;
    }

    public Context getContext() {
        return this.zzlj;
    }

    public Location getLocation() {
        return this.zzmw;
    }

    public String getMaxAdContentRating() {
        return this.zzchd;
    }

    public Bundle getMediationExtras() {
        return this.zzemw;
    }

    public Bundle getServerParameters() {
        return this.zzemv;
    }

    public boolean isTestRequest() {
        return this.zzmv;
    }

    public int taggedForChildDirectedTreatment() {
        return this.zzdga;
    }

    public int taggedForUnderAgeTreatment() {
        return this.zzemx;
    }
}
