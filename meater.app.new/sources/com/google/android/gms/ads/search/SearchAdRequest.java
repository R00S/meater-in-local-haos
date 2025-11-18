package com.google.android.gms.ads.search;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.ads.zzaaz;
import com.google.android.gms.internal.ads.zzaba;

@Deprecated
/* loaded from: classes2.dex */
public final class SearchAdRequest {
    public static final int BORDER_TYPE_DASHED = 1;
    public static final int BORDER_TYPE_DOTTED = 2;
    public static final int BORDER_TYPE_NONE = 0;
    public static final int BORDER_TYPE_SOLID = 3;
    public static final int CALL_BUTTON_COLOR_DARK = 2;
    public static final int CALL_BUTTON_COLOR_LIGHT = 0;
    public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    private final zzaaz zzaam;
    private final String zzckf;

    public static final class Builder {
        private final zzaba zzaan = new zzaba();
        private String zzckf;

        public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.zzaan.m16252h(cls, bundle);
            return this;
        }

        public final Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.zzaan.m16249d(networkExtras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.zzaan.m16250e(cls, bundle);
            return this;
        }

        public final Builder addTestDevice(String str) {
            this.zzaan.m16254j(str);
            return this;
        }

        public final SearchAdRequest build() {
            return new SearchAdRequest(this);
        }

        @Deprecated
        public final Builder setAnchorTextColor(int i2) {
            return this;
        }

        @Deprecated
        public final Builder setBackgroundColor(int i2) {
            return this;
        }

        @Deprecated
        public final Builder setBackgroundGradient(int i2, int i3) {
            return this;
        }

        @Deprecated
        public final Builder setBorderColor(int i2) {
            return this;
        }

        @Deprecated
        public final Builder setBorderThickness(int i2) {
            return this;
        }

        @Deprecated
        public final Builder setBorderType(int i2) {
            return this;
        }

        @Deprecated
        public final Builder setCallButtonColor(int i2) {
            return this;
        }

        @Deprecated
        public final Builder setCustomChannels(String str) {
            return this;
        }

        @Deprecated
        public final Builder setDescriptionTextColor(int i2) {
            return this;
        }

        @Deprecated
        public final Builder setFontFace(String str) {
            return this;
        }

        @Deprecated
        public final Builder setHeaderTextColor(int i2) {
            return this;
        }

        @Deprecated
        public final Builder setHeaderTextSize(int i2) {
            return this;
        }

        public final Builder setLocation(Location location) {
            this.zzaan.m16248c(location);
            return this;
        }

        public final Builder setQuery(String str) {
            this.zzckf = str;
            return this;
        }

        public final Builder setRequestAgent(String str) {
            this.zzaan.m16258o(str);
            return this;
        }

        public final Builder tagForChildDirectedTreatment(boolean z) {
            this.zzaan.m16245I(z);
            return this;
        }
    }

    private SearchAdRequest(Builder builder) {
        this.zzckf = builder.zzckf;
        this.zzaam = new zzaaz(builder.zzaan, this);
    }

    @Deprecated
    public final int getAnchorTextColor() {
        return 0;
    }

    @Deprecated
    public final int getBackgroundColor() {
        return 0;
    }

    @Deprecated
    public final int getBackgroundGradientBottom() {
        return 0;
    }

    @Deprecated
    public final int getBackgroundGradientTop() {
        return 0;
    }

    @Deprecated
    public final int getBorderColor() {
        return 0;
    }

    @Deprecated
    public final int getBorderThickness() {
        return 0;
    }

    @Deprecated
    public final int getBorderType() {
        return 0;
    }

    @Deprecated
    public final int getCallButtonColor() {
        return 0;
    }

    @Deprecated
    public final String getCustomChannels() {
        return null;
    }

    public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.zzaam.m16206c(cls);
    }

    @Deprecated
    public final int getDescriptionTextColor() {
        return 0;
    }

    @Deprecated
    public final String getFontFace() {
        return null;
    }

    @Deprecated
    public final int getHeaderTextColor() {
        return 0;
    }

    @Deprecated
    public final int getHeaderTextSize() {
        return 0;
    }

    public final Location getLocation() {
        return this.zzaam.m16210g();
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (T) this.zzaam.m16213j(cls);
    }

    public final <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.zzaam.m16214k(cls);
    }

    public final String getQuery() {
        return this.zzckf;
    }

    public final boolean isTestDevice(Context context) {
        return this.zzaam.m16217n(context);
    }

    final zzaaz zzde() {
        return this.zzaam;
    }
}
