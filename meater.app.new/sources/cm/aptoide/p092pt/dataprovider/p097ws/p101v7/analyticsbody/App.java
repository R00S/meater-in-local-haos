package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.analyticsbody;

import cm.aptoide.p092pt.downloadmanager.Constants;
import com.fasterxml.jackson.annotation.JsonProperty;

/* loaded from: classes.dex */
public class App {
    private String mirror;

    @JsonProperty(Constants.PACKAGE)
    private String packageName;
    private String url;

    public String getMirror() {
        return this.mirror;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getUrl() {
        return this.url;
    }

    public void setMirror(String str) {
        this.mirror = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
