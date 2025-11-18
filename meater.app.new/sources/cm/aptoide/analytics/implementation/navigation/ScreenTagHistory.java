package cm.aptoide.analytics.implementation.navigation;

import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class ScreenTagHistory {
    private static final String NO_HISTORY = "NO_HISTORY";
    private String fragment;
    private String store;
    private String tag;

    public static class Builder {
        public static final String APTOIDE_MAIN_HISTORY_STORE = "aptoide_main";

        private Builder() {
        }

        public static ScreenTagHistory build(String str) {
            return build(str, HttpUrl.FRAGMENT_ENCODE_SET);
        }

        public static ScreenTagHistory build(String str, String str2) {
            return build(str, str2, "home");
        }

        public static ScreenTagHistory build(String str, String str2, String str3) {
            if (str3 == null) {
                str3 = HttpUrl.FRAGMENT_ENCODE_SET;
            } else if (str3.equals("home")) {
                str3 = APTOIDE_MAIN_HISTORY_STORE;
            }
            return new ScreenTagHistory(str, str2, str3);
        }
    }

    public String getFragment() {
        String str = this.fragment;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public String getStore() {
        String str = this.store;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public String getTag() {
        String str = this.tag;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public void setFragment(String str) {
        this.fragment = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public String toString() {
        return "ScreenTagHistory{fragment='" + this.fragment + "', tag='" + this.tag + "', store='" + this.store + "'}";
    }

    public ScreenTagHistory() {
        this(NO_HISTORY, NO_HISTORY, NO_HISTORY);
    }

    private ScreenTagHistory(String str, String str2, String str3) {
        this.fragment = str;
        this.tag = str2;
        this.store = str3;
    }
}
