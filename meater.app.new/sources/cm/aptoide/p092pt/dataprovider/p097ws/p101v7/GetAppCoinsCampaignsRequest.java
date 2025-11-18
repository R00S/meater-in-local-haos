package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListAppCoinsCampaigns;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.preferences.toolbox.ToolboxManager;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class GetAppCoinsCampaignsRequest extends AbstractC2229V7<ListAppCoinsCampaigns, Body> {
    public GetAppCoinsCampaignsRequest(Body body, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_V7_HOST);
        sb.append("/api/7.20191202/");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<ListAppCoinsCampaigns> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        B b2 = this.body;
        return interfaces.getAppCoinsAds((Body) b2, z, ((Body) b2).getLimit().intValue(), true);
    }

    public static class Body extends BaseBody implements Endless {
        private int limit;
        private int offset;
        private String packageName;
        private Integer vercode;

        public Body(int i2, int i3) {
            this.offset = i2;
            this.limit = i3;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public Integer getLimit() {
            return Integer.valueOf(this.limit);
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public int getOffset() {
            return this.offset;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public Integer getVercode() {
            return this.vercode;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public void setOffset(int i2) {
            this.offset = i2;
        }

        public Body(String str, int i2) {
            this.packageName = str;
            this.vercode = Integer.valueOf(i2);
            this.limit = 5;
            this.offset = 0;
        }
    }
}
