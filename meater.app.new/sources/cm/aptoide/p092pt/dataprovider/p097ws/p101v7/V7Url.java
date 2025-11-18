package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import cm.aptoide.p092pt.utils.AptoideUtils;
import java.util.regex.Matcher;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class V7Url {
    private String url;

    public V7Url(String str) {
        this.url = str;
    }

    public boolean containsLimit() {
        return this.url.contains("limit=");
    }

    public String get() {
        return this.url;
    }

    public Long getStoreId() {
        Matcher matcher = AptoideUtils.RegexU.getStoreIdFromGetUrlPattern().matcher(this.url);
        if (matcher.find()) {
            return Long.valueOf(Long.parseLong(matcher.group(1)));
        }
        return null;
    }

    public String getStoreName() {
        Matcher matcher = AptoideUtils.RegexU.getStoreNameFromGetUrlPattern().matcher(this.url);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public V7Url remove(String str) {
        this.url = this.url.replace(str, HttpUrl.FRAGMENT_ENCODE_SET);
        return this;
    }
}
