package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.zzaaz;

/* loaded from: classes2.dex */
public final class DynamicHeightSearchAdRequest {
    private final SearchAdRequest zzgnv;

    public static final class Builder {
        private final SearchAdRequest.Builder zzgnw = new SearchAdRequest.Builder();
        private final Bundle zzgnx = new Bundle();

        public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.zzgnw.addCustomEventExtrasBundle(cls, bundle);
            return this;
        }

        public final Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.zzgnw.addNetworkExtras(networkExtras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.zzgnw.addNetworkExtrasBundle(cls, bundle);
            return this;
        }

        public final DynamicHeightSearchAdRequest build() {
            this.zzgnw.addNetworkExtrasBundle(AdMobAdapter.class, this.zzgnx);
            return new DynamicHeightSearchAdRequest(this);
        }

        public final Builder setAdBorderSelectors(String str) {
            this.zzgnx.putString("csa_adBorderSelectors", str);
            return this;
        }

        public final Builder setAdTest(boolean z) {
            this.zzgnx.putString("csa_adtest", z ? "on" : "off");
            return this;
        }

        public final Builder setAdjustableLineHeight(int i2) {
            this.zzgnx.putString("csa_adjustableLineHeight", Integer.toString(i2));
            return this;
        }

        public final Builder setAdvancedOptionValue(String str, String str2) {
            this.zzgnx.putString(str, str2);
            return this;
        }

        public final Builder setAttributionSpacingBelow(int i2) {
            this.zzgnx.putString("csa_attributionSpacingBelow", Integer.toString(i2));
            return this;
        }

        public final Builder setBorderSelections(String str) {
            this.zzgnx.putString("csa_borderSelections", str);
            return this;
        }

        public final Builder setChannel(String str) {
            this.zzgnx.putString("csa_channel", str);
            return this;
        }

        public final Builder setColorAdBorder(String str) {
            this.zzgnx.putString("csa_colorAdBorder", str);
            return this;
        }

        public final Builder setColorAdSeparator(String str) {
            this.zzgnx.putString("csa_colorAdSeparator", str);
            return this;
        }

        public final Builder setColorAnnotation(String str) {
            this.zzgnx.putString("csa_colorAnnotation", str);
            return this;
        }

        public final Builder setColorAttribution(String str) {
            this.zzgnx.putString("csa_colorAttribution", str);
            return this;
        }

        public final Builder setColorBackground(String str) {
            this.zzgnx.putString("csa_colorBackground", str);
            return this;
        }

        public final Builder setColorBorder(String str) {
            this.zzgnx.putString("csa_colorBorder", str);
            return this;
        }

        public final Builder setColorDomainLink(String str) {
            this.zzgnx.putString("csa_colorDomainLink", str);
            return this;
        }

        public final Builder setColorText(String str) {
            this.zzgnx.putString("csa_colorText", str);
            return this;
        }

        public final Builder setColorTitleLink(String str) {
            this.zzgnx.putString("csa_colorTitleLink", str);
            return this;
        }

        public final Builder setCssWidth(int i2) {
            this.zzgnx.putString("csa_width", Integer.toString(i2));
            return this;
        }

        public final Builder setDetailedAttribution(boolean z) {
            this.zzgnx.putString("csa_detailedAttribution", Boolean.toString(z));
            return this;
        }

        public final Builder setFontFamily(String str) {
            this.zzgnx.putString("csa_fontFamily", str);
            return this;
        }

        public final Builder setFontFamilyAttribution(String str) {
            this.zzgnx.putString("csa_fontFamilyAttribution", str);
            return this;
        }

        public final Builder setFontSizeAnnotation(int i2) {
            this.zzgnx.putString("csa_fontSizeAnnotation", Integer.toString(i2));
            return this;
        }

        public final Builder setFontSizeAttribution(int i2) {
            this.zzgnx.putString("csa_fontSizeAttribution", Integer.toString(i2));
            return this;
        }

        public final Builder setFontSizeDescription(int i2) {
            this.zzgnx.putString("csa_fontSizeDescription", Integer.toString(i2));
            return this;
        }

        public final Builder setFontSizeDomainLink(int i2) {
            this.zzgnx.putString("csa_fontSizeDomainLink", Integer.toString(i2));
            return this;
        }

        public final Builder setFontSizeTitle(int i2) {
            this.zzgnx.putString("csa_fontSizeTitle", Integer.toString(i2));
            return this;
        }

        public final Builder setHostLanguage(String str) {
            this.zzgnx.putString("csa_hl", str);
            return this;
        }

        public final Builder setIsClickToCallEnabled(boolean z) {
            this.zzgnx.putString("csa_clickToCall", Boolean.toString(z));
            return this;
        }

        public final Builder setIsLocationEnabled(boolean z) {
            this.zzgnx.putString("csa_location", Boolean.toString(z));
            return this;
        }

        public final Builder setIsPlusOnesEnabled(boolean z) {
            this.zzgnx.putString("csa_plusOnes", Boolean.toString(z));
            return this;
        }

        public final Builder setIsSellerRatingsEnabled(boolean z) {
            this.zzgnx.putString("csa_sellerRatings", Boolean.toString(z));
            return this;
        }

        public final Builder setIsSiteLinksEnabled(boolean z) {
            this.zzgnx.putString("csa_siteLinks", Boolean.toString(z));
            return this;
        }

        public final Builder setIsTitleBold(boolean z) {
            this.zzgnx.putString("csa_titleBold", Boolean.toString(z));
            return this;
        }

        public final Builder setIsTitleUnderlined(boolean z) {
            this.zzgnx.putString("csa_noTitleUnderline", Boolean.toString(!z));
            return this;
        }

        public final Builder setLocationColor(String str) {
            this.zzgnx.putString("csa_colorLocation", str);
            return this;
        }

        public final Builder setLocationFontSize(int i2) {
            this.zzgnx.putString("csa_fontSizeLocation", Integer.toString(i2));
            return this;
        }

        public final Builder setLongerHeadlines(boolean z) {
            this.zzgnx.putString("csa_longerHeadlines", Boolean.toString(z));
            return this;
        }

        public final Builder setNumber(int i2) {
            this.zzgnx.putString("csa_number", Integer.toString(i2));
            return this;
        }

        public final Builder setPage(int i2) {
            this.zzgnx.putString("csa_adPage", Integer.toString(i2));
            return this;
        }

        public final Builder setQuery(String str) {
            this.zzgnw.setQuery(str);
            return this;
        }

        public final Builder setVerticalSpacing(int i2) {
            this.zzgnx.putString("csa_verticalSpacing", Integer.toString(i2));
            return this;
        }
    }

    private DynamicHeightSearchAdRequest(Builder builder) {
        this.zzgnv = builder.zzgnw.build();
    }

    public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.zzgnv.getCustomEventExtrasBundle(cls);
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (T) this.zzgnv.getNetworkExtras(cls);
    }

    public final <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.zzgnv.getNetworkExtrasBundle(cls);
    }

    public final String getQuery() {
        return this.zzgnv.getQuery();
    }

    public final boolean isTestDevice(Context context) {
        return this.zzgnv.isTestDevice(context);
    }

    final zzaaz zzde() {
        return this.zzgnv.zzde();
    }
}
