package com.google.android.gms.ads.rewarded;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class ServerSideVerificationOptions {
    private final String zzdqs;
    private final String zzdqt;

    public static final class Builder {
        private String zzdqs = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzdqt = HttpUrl.FRAGMENT_ENCODE_SET;

        public final ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this);
        }

        public final Builder setCustomData(String str) {
            this.zzdqt = str;
            return this;
        }

        public final Builder setUserId(String str) {
            this.zzdqs = str;
            return this;
        }
    }

    private ServerSideVerificationOptions(Builder builder) {
        this.zzdqs = builder.zzdqs;
        this.zzdqt = builder.zzdqt;
    }

    public String getCustomData() {
        return this.zzdqt;
    }

    public String getUserId() {
        return this.zzdqs;
    }
}
