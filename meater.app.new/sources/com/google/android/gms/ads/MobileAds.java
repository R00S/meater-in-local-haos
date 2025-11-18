package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzabe;
import com.google.android.gms.internal.ads.zzabi;

/* loaded from: classes2.dex */
public class MobileAds {

    public static final class Settings {
        private final zzabi zzaat = new zzabi();

        @Deprecated
        public final String getTrackingId() {
            return null;
        }

        @Deprecated
        public final boolean isGoogleAnalyticsEnabled() {
            return false;
        }

        @Deprecated
        public final Settings setGoogleAnalyticsEnabled(boolean z) {
            return this;
        }

        @Deprecated
        public final Settings setTrackingId(String str) {
            return this;
        }

        final zzabi zzdg() {
            return this.zzaat;
        }
    }

    private MobileAds() {
    }

    public static RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        return zzabe.m16315j().m16316a(context);
    }

    @KeepForSdk
    public static String getVersionString() {
        return zzabe.m16315j().m16317b();
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    public static void openDebugMenu(Context context, String str) {
        zzabe.m16315j().m16318c(context, str);
    }

    @KeepForSdk
    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        zzabe.m16315j().m16319d(cls);
    }

    public static void setAppMuted(boolean z) {
        zzabe.m16315j().m16320e(z);
    }

    public static void setAppVolume(float f2) {
        zzabe.m16315j().m16321f(f2);
    }

    @Deprecated
    public static void initialize(Context context, String str, Settings settings) {
        zzabe.m16315j().m16322g(context, str, settings == null ? null : settings.zzdg(), null);
    }

    public static void initialize(Context context) {
        initialize(context, null, null);
    }
}
