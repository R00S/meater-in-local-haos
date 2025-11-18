package cm.aptoide.p092pt.search;

/* loaded from: classes.dex */
public class SearchHostProvider {
    private final String aptoideWebServicesScheme;
    private final String aptoideWebServicesSearchHost;
    private final String aptoideWebServicesSearchSslHost;
    private final boolean isToolboxEnableHttpScheme;

    public SearchHostProvider(boolean z, String str, String str2, String str3) {
        this.isToolboxEnableHttpScheme = z;
        this.aptoideWebServicesScheme = str;
        this.aptoideWebServicesSearchHost = str2;
        this.aptoideWebServicesSearchSslHost = str3;
    }

    public String getSearchHost() {
        String str = this.isToolboxEnableHttpScheme ? "http" : this.aptoideWebServicesScheme;
        if ("http".equals(str)) {
            return str + "://" + this.aptoideWebServicesSearchHost + "/v1/";
        }
        return str + "://" + this.aptoideWebServicesSearchSslHost + "/v1/";
    }
}
