package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaaz;
import com.google.android.gms.internal.ads.zzaba;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.List;
import java.util.Set;

@VisibleForTesting
/* loaded from: classes2.dex */
public final class PublisherAdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    private final zzaaz zzaam;

    @VisibleForTesting
    public static final class Builder {
        private final zzaba zzaan = new zzaba();

        public final Builder addCategoryExclusion(String str) {
            this.zzaan.m16259p(str);
            return this;
        }

        public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.zzaan.m16252h(cls, bundle);
            return this;
        }

        public final Builder addCustomTargeting(String str, String str2) {
            this.zzaan.m16263v(str, str2);
            return this;
        }

        public final Builder addKeyword(String str) {
            this.zzaan.m16253i(str);
            return this;
        }

        public final Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.zzaan.m16249d(networkExtras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
            this.zzaan.m16250e(cls, bundle);
            return this;
        }

        public final Builder addTestDevice(String str) {
            this.zzaan.m16254j(str);
            return this;
        }

        public final PublisherAdRequest build() {
            return new PublisherAdRequest(this);
        }

        @Deprecated
        public final Builder setBirthday(Date date) {
            this.zzaan.m16251f(date);
            return this;
        }

        public final Builder setContentUrl(String str) {
            Preconditions.m14373l(str, "Content URL must be non-null.");
            Preconditions.m14369h(str, "Content URL must be non-empty.");
            Preconditions.m14364c(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH), Integer.valueOf(str.length()));
            this.zzaan.m16256l(str);
            return this;
        }

        @Deprecated
        public final Builder setGender(int i2) {
            this.zzaan.m16261r(i2);
            return this;
        }

        @Deprecated
        public final Builder setIsDesignedForFamilies(boolean z) {
            this.zzaan.m16246J(z);
            return this;
        }

        public final Builder setLocation(Location location) {
            this.zzaan.m16248c(location);
            return this;
        }

        @Deprecated
        public final Builder setManualImpressionsEnabled(boolean z) {
            this.zzaan.m16247a(z);
            return this;
        }

        public final Builder setMaxAdContentRating(String str) {
            this.zzaan.m16260q(str);
            return this;
        }

        public final Builder setPublisherProvidedId(String str) {
            this.zzaan.m16257n(str);
            return this;
        }

        public final Builder setRequestAgent(String str) {
            this.zzaan.m16258o(str);
            return this;
        }

        public final Builder setTagForUnderAgeOfConsent(int i2) {
            this.zzaan.m16262s(i2);
            return this;
        }

        public final Builder tagForChildDirectedTreatment(boolean z) {
            this.zzaan.m16245I(z);
            return this;
        }

        public final Builder addCustomTargeting(String str, List<String> list) {
            if (list != null) {
                this.zzaan.m16263v(str, TextUtils.join(",", list));
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface MaxAdContentRating {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TagForUnderAgeOfConsent {
    }

    private PublisherAdRequest(Builder builder) {
        this.zzaam = new zzaaz(builder.zzaan);
    }

    public static void updateCorrelator() {
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zzaam.m16204a();
    }

    public final String getContentUrl() {
        return this.zzaam.m16205b();
    }

    public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.zzaam.m16206c(cls);
    }

    public final Bundle getCustomTargeting() {
        return this.zzaam.m16207d();
    }

    @Deprecated
    public final int getGender() {
        return this.zzaam.m16208e();
    }

    public final Set<String> getKeywords() {
        return this.zzaam.m16209f();
    }

    public final Location getLocation() {
        return this.zzaam.m16210g();
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzaam.m16211h();
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (T) this.zzaam.m16213j(cls);
    }

    public final <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.zzaam.m16214k(cls);
    }

    public final String getPublisherProvidedId() {
        return this.zzaam.m16215l();
    }

    public final boolean isTestDevice(Context context) {
        return this.zzaam.m16217n(context);
    }

    public final zzaaz zzde() {
        return this.zzaam;
    }
}
