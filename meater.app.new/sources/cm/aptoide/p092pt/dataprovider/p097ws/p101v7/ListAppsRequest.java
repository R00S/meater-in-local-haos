package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.WindowManager;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListApps;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Type;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.preferences.toolbox.ToolboxManager;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class ListAppsRequest extends AbstractC2229V7<ListApps, Body> {
    private static final int LINES_PER_REQUEST = 6;
    private String url;

    public enum Sort {
        latest,
        trending7d,
        trending60d
    }

    public ListAppsRequest(String str, Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.url = str;
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_V7_CACHE_HOST);
        sb.append("/api/7.20240701/");
        return sb.toString();
    }

    public static ListAppsRequest ofAction(String str, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager) {
        V7Url v7UrlRemove = new V7Url(str).remove("listApps");
        return v7UrlRemove.containsLimit() ? new ListAppsRequest(v7UrlRemove.get(), new Body(storeCredentials, sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences) : new ListAppsRequest(v7UrlRemove.get(), new Body(storeCredentials, Type.APPS_GROUP.getPerLineCount(resources, windowManager) * 6, sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<ListApps> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        String str = this.url;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return interfaces.listApps(str, z ? "no-cache" : null, getQueryStringMapper().map((Body) this.body));
    }

    public ListAppsRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    public static class Body extends BaseBody implements Endless {
        private Long groupId;
        private Integer limit;
        private String notApkTags;
        private int offset;
        private Sort sort;
        private Long storeId;
        private String storePassSha1;
        private String storeUser;

        public Body(BaseRequestWithStore.StoreCredentials storeCredentials, SharedPreferences sharedPreferences) {
            this.storeUser = storeCredentials.getUsername();
            this.storePassSha1 = storeCredentials.getPasswordSha1();
            setNotApkTags(sharedPreferences);
        }

        private void setNotApkTags(SharedPreferences sharedPreferences) {
            if (ManagerPreferences.getUpdatesFilterAlphaBetaKey(sharedPreferences)) {
                this.notApkTags = "alpha,beta";
            }
        }

        public Long getGroupId() {
            return this.groupId;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public Integer getLimit() {
            return this.limit;
        }

        public String getNotApkTags() {
            return this.notApkTags;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public int getOffset() {
            return this.offset;
        }

        public Sort getSort() {
            return this.sort;
        }

        public Long getStoreId() {
            return this.storeId;
        }

        public String getStorePassSha1() {
            return this.storePassSha1;
        }

        public String getStoreUser() {
            return this.storeUser;
        }

        public void setGroupId(Long l) {
            this.groupId = l;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public void setOffset(int i2) {
            this.offset = i2;
        }

        public void setSort(Sort sort) {
            this.sort = sort;
        }

        public void setStoreId(long j2) {
            this.storeId = Long.valueOf(j2);
        }

        public Body(BaseRequestWithStore.StoreCredentials storeCredentials, int i2, SharedPreferences sharedPreferences) {
            this.storeUser = storeCredentials.getUsername();
            this.storePassSha1 = storeCredentials.getPasswordSha1();
            this.limit = Integer.valueOf(i2);
            setNotApkTags(sharedPreferences);
        }

        public Body(BaseRequestWithStore.StoreCredentials storeCredentials, int i2, SharedPreferences sharedPreferences, Sort sort) {
            this.storeUser = storeCredentials.getUsername();
            this.storePassSha1 = storeCredentials.getPasswordSha1();
            this.limit = Integer.valueOf(i2);
            this.sort = sort;
            setNotApkTags(sharedPreferences);
        }

        public Body(BaseRequestWithStore.StoreCredentials storeCredentials, Long l, int i2, SharedPreferences sharedPreferences, Sort sort) {
            this.storeUser = storeCredentials.getUsername();
            this.storePassSha1 = storeCredentials.getPasswordSha1();
            this.groupId = l;
            this.limit = Integer.valueOf(i2);
            this.sort = sort;
            setNotApkTags(sharedPreferences);
        }
    }
}
