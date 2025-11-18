package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzazt;
import com.google.android.gms.internal.ads.zzyd;
import com.google.android.gms.internal.ads.zzyt;

@VisibleForTesting
/* loaded from: classes2.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int height;
    private final int width;
    private final String zzaap;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize zzaao = new AdSize(50, 50, "50x50_mb");
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");

    public AdSize(int i2, int i3) {
        String strValueOf = i2 == -1 ? "FULL" : String.valueOf(i2);
        String strValueOf2 = i3 == -2 ? "AUTO" : String.valueOf(i3);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 4 + String.valueOf(strValueOf2).length());
        sb.append(strValueOf);
        sb.append("x");
        sb.append(strValueOf2);
        sb.append("_as");
        this(i2, i3, sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.width == adSize.width && this.height == adSize.height && this.zzaap.equals(adSize.zzaap);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getHeightInPixels(Context context) {
        int i2 = this.height;
        if (i2 == -4 || i2 == -3) {
            return -1;
        }
        if (i2 == -2) {
            return zzyd.m20825z(context.getResources().getDisplayMetrics());
        }
        zzyt.m20844a();
        return zzazt.m17300a(context, this.height);
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getWidthInPixels(Context context) {
        int i2 = this.width;
        if (i2 == -4 || i2 == -3) {
            return -1;
        }
        if (i2 == -1) {
            return zzyd.m20824y(context.getResources().getDisplayMetrics());
        }
        zzyt.m20844a();
        return zzazt.m17300a(context, this.width);
    }

    public final int hashCode() {
        return this.zzaap.hashCode();
    }

    public final boolean isAutoHeight() {
        return this.height == -2;
    }

    public final boolean isFluid() {
        return this.width == -3 && this.height == -4;
    }

    public final boolean isFullWidth() {
        return this.width == -1;
    }

    public final String toString() {
        return this.zzaap;
    }

    AdSize(int i2, int i3, String str) {
        if (i2 < 0 && i2 != -1 && i2 != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i3 < 0 && i3 != -2 && i3 != -4) {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i3);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.width = i2;
        this.height = i3;
        this.zzaap = str;
    }
}
