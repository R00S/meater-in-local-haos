package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.search.ListSearchApps;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.util.HashMapNotNull;
import cm.aptoide.p092pt.preferences.toolbox.ToolboxManager;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Collections;
import java.util.List;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class ListSearchAppsRequest extends AbstractC2229V7<ListSearchApps, Body> {
    private static final int LIMIT = 15;

    private ListSearchAppsRequest(Body body, String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator) {
        super(body, str, okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_V7_CACHE_HOST);
        sb.append("/api/7.20240701/");
        return sb.toString();
    }

    /* renamed from: of */
    public static ListSearchAppsRequest m7455of(String str, int i2, String str2, boolean z, boolean z2, boolean z3, Boolean bool, HashMapNotNull<String, List<String>> hashMapNotNull, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new ListSearchAppsRequest(new Body((Integer) 15, i2, str, hashMapNotNull, (List<String>) (str2 != null ? Collections.singletonList(str2) : null), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), sharedPreferences, bool), getHost(sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<ListSearchApps> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        return interfaces.listSearchApps(z ? "no-cache" : null, getQueryStringMapper().map((Body) this.body));
    }

    /* renamed from: of */
    public static ListSearchAppsRequest m7456of(String str, int i2, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool, List<Long> list, HashMapNotNull<String, List<String>> hashMapNotNull, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        Body body;
        if (z) {
            body = new Body((Integer) 15, i2, str, list, hashMapNotNull, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), sharedPreferences, bool);
        } else {
            body = new Body(15, i2, str, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), sharedPreferences, bool);
        }
        return new ListSearchAppsRequest(body, getHost(sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator);
    }

    public static class Body extends BaseBodyWithAlphaBetaKey implements Endless {
        private Integer limit;
        private int offset;
        private Boolean onlyAppc;
        private Boolean onlyBeta;
        private Boolean onlyTrusted;
        private String query;
        private List<Long> storeIds;
        private List<String> storeNames;
        private HashMapNotNull<String, List<String>> storesAuthMap;

        public Body(Integer num, int i2, String str, List<Long> list, HashMapNotNull<String, List<String>> hashMapNotNull, Boolean bool, Boolean bool2, Boolean bool3, SharedPreferences sharedPreferences, Boolean bool4) {
            super(sharedPreferences);
            this.limit = num;
            this.offset = i2;
            this.query = str;
            this.storeIds = list;
            this.storesAuthMap = hashMapNotNull;
            this.onlyTrusted = bool;
            setMature(bool4.booleanValue());
            this.onlyBeta = bool2;
            this.onlyAppc = bool3;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public Integer getLimit() {
            return this.limit;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public int getOffset() {
            return this.offset;
        }

        public Boolean getOnlyAppc() {
            return this.onlyAppc;
        }

        public Boolean getOnlyBeta() {
            return this.onlyBeta;
        }

        public Boolean getOnlyTrusted() {
            return this.onlyTrusted;
        }

        public String getQuery() {
            return this.query;
        }

        public List<Long> getStoreIds() {
            return this.storeIds;
        }

        public String getStoreIdsAsString() {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < this.storeIds.size(); i2++) {
                if (i2 != this.storeIds.size() - 1) {
                    sb.append(this.storeIds.get(i2));
                    sb.append(",");
                } else {
                    sb.append(this.storeIds.get(i2));
                }
            }
            return sb.toString();
        }

        public List<String> getStoreNames() {
            return this.storeNames;
        }

        public String getStoreNamesAsString() {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < this.storeNames.size(); i2++) {
                if (i2 != this.storeNames.size() - 1) {
                    sb.append(this.storeNames.get(i2));
                    sb.append(",");
                } else {
                    sb.append(this.storeNames.get(i2));
                }
            }
            return sb.toString();
        }

        public HashMapNotNull<String, List<String>> getStoresAuthMap() {
            return this.storesAuthMap;
        }

        public String getStoresAuthMapAsString() {
            String strWriteValueAsString = null;
            try {
                strWriteValueAsString = new ObjectMapper().writeValueAsString(this.storesAuthMap);
                System.out.println("json = " + strWriteValueAsString);
                return strWriteValueAsString;
            } catch (JsonProcessingException e2) {
                e2.printStackTrace();
                return strWriteValueAsString;
            }
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public void setOffset(int i2) {
            this.offset = i2;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBodyWithAlphaBetaKey
        public boolean shouldIncludeTag() {
            return !this.onlyBeta.booleanValue();
        }

        public Body(Integer num, int i2, String str, HashMapNotNull<String, List<String>> hashMapNotNull, List<String> list, Boolean bool, Boolean bool2, Boolean bool3, SharedPreferences sharedPreferences, Boolean bool4) {
            super(sharedPreferences);
            this.limit = num;
            this.offset = i2;
            this.query = str;
            this.storesAuthMap = hashMapNotNull;
            this.storeNames = list;
            this.onlyTrusted = bool;
            this.onlyBeta = bool2;
            this.onlyAppc = bool3;
            setMature(bool4.booleanValue());
        }

        public Body(Integer num, int i2, String str, Boolean bool, Boolean bool2, Boolean bool3, SharedPreferences sharedPreferences, Boolean bool4) {
            super(sharedPreferences);
            this.limit = num;
            this.offset = i2;
            this.query = str;
            this.onlyTrusted = bool;
            setMature(bool4.booleanValue());
            this.onlyBeta = bool2;
            this.onlyAppc = bool3;
        }
    }
}
