package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.listapps;

import android.content.SharedPreferences;
import android.content.res.Resources;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.ListAppVersions;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBodyWithApp;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless;
import cm.aptoide.p092pt.dataprovider.util.HashMapNotNull;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.util.LinkedList;
import java.util.List;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class ListAppVersionsRequest extends AbstractC2229V7<ListAppVersions, Body> {
    private static final Integer MAX_LIMIT = 10;

    private ListAppVersionsRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, AbstractC2229V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* renamed from: of */
    public static ListAppVersionsRequest m7477of(String str, HashMapNotNull<String, List<String>> hashMapNotNull, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources) {
        Body body = new Body(str, sharedPreferences, AptoideUtils.SystemU.getCountryCode(resources));
        body.setStoresAuthMap(hashMapNotNull);
        body.setLimit(MAX_LIMIT);
        return new ListAppVersionsRequest(body, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    public static class Body extends BaseBodyWithApp implements Endless {
        private Integer apkId;
        private String apkMd5sum;
        private Integer appId;
        private String lang;
        private Integer limit;
        private int offset;
        private Integer packageId;
        private String packageName;
        private List<Long> storeIds;
        private List<String> storeNames;
        private HashMapNotNull<String, List<String>> storesAuthMap;

        public Body(SharedPreferences sharedPreferences, String str) {
            super(sharedPreferences);
            this.lang = str;
        }

        protected boolean canEqual(Object obj) {
            return obj instanceof Body;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Body)) {
                return false;
            }
            Body body = (Body) obj;
            if (!body.canEqual(this) || !super.equals(obj)) {
                return false;
            }
            Integer apkId = getApkId();
            Integer apkId2 = body.getApkId();
            if (apkId != null ? !apkId.equals(apkId2) : apkId2 != null) {
                return false;
            }
            String apkMd5sum = getApkMd5sum();
            String apkMd5sum2 = body.getApkMd5sum();
            if (apkMd5sum != null ? !apkMd5sum.equals(apkMd5sum2) : apkMd5sum2 != null) {
                return false;
            }
            Integer appId = getAppId();
            Integer appId2 = body.getAppId();
            if (appId != null ? !appId.equals(appId2) : appId2 != null) {
                return false;
            }
            String lang = getLang();
            String lang2 = body.getLang();
            if (lang != null ? !lang.equals(lang2) : lang2 != null) {
                return false;
            }
            Integer packageId = getPackageId();
            Integer packageId2 = body.getPackageId();
            if (packageId != null ? !packageId.equals(packageId2) : packageId2 != null) {
                return false;
            }
            String packageName = getPackageName();
            String packageName2 = body.getPackageName();
            if (packageName != null ? !packageName.equals(packageName2) : packageName2 != null) {
                return false;
            }
            List<Long> storeIds = getStoreIds();
            List<Long> storeIds2 = body.getStoreIds();
            if (storeIds != null ? !storeIds.equals(storeIds2) : storeIds2 != null) {
                return false;
            }
            List<String> storeNames = getStoreNames();
            List<String> storeNames2 = body.getStoreNames();
            if (storeNames != null ? !storeNames.equals(storeNames2) : storeNames2 != null) {
                return false;
            }
            Integer limit = getLimit();
            Integer limit2 = body.getLimit();
            if (limit != null ? !limit.equals(limit2) : limit2 != null) {
                return false;
            }
            if (getOffset() != body.getOffset()) {
                return false;
            }
            HashMapNotNull<String, List<String>> storesAuthMap = getStoresAuthMap();
            HashMapNotNull<String, List<String>> storesAuthMap2 = body.getStoresAuthMap();
            return storesAuthMap != null ? storesAuthMap.equals(storesAuthMap2) : storesAuthMap2 == null;
        }

        public Integer getApkId() {
            return this.apkId;
        }

        public String getApkMd5sum() {
            return this.apkMd5sum;
        }

        public Integer getAppId() {
            return this.appId;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody
        public String getLang() {
            return this.lang;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public Integer getLimit() {
            return this.limit;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public int getOffset() {
            return this.offset;
        }

        public Integer getPackageId() {
            return this.packageId;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public List<Long> getStoreIds() {
            return this.storeIds;
        }

        public List<String> getStoreNames() {
            return this.storeNames;
        }

        public HashMapNotNull<String, List<String>> getStoresAuthMap() {
            return this.storesAuthMap;
        }

        public int hashCode() {
            int iHashCode = super.hashCode() + 59;
            Integer apkId = getApkId();
            int iHashCode2 = (iHashCode * 59) + (apkId == null ? 43 : apkId.hashCode());
            String apkMd5sum = getApkMd5sum();
            int iHashCode3 = (iHashCode2 * 59) + (apkMd5sum == null ? 43 : apkMd5sum.hashCode());
            Integer appId = getAppId();
            int iHashCode4 = (iHashCode3 * 59) + (appId == null ? 43 : appId.hashCode());
            String lang = getLang();
            int iHashCode5 = (iHashCode4 * 59) + (lang == null ? 43 : lang.hashCode());
            Integer packageId = getPackageId();
            int iHashCode6 = (iHashCode5 * 59) + (packageId == null ? 43 : packageId.hashCode());
            String packageName = getPackageName();
            int iHashCode7 = (iHashCode6 * 59) + (packageName == null ? 43 : packageName.hashCode());
            List<Long> storeIds = getStoreIds();
            int iHashCode8 = (iHashCode7 * 59) + (storeIds == null ? 43 : storeIds.hashCode());
            List<String> storeNames = getStoreNames();
            int iHashCode9 = (iHashCode8 * 59) + (storeNames == null ? 43 : storeNames.hashCode());
            Integer limit = getLimit();
            int iHashCode10 = (((iHashCode9 * 59) + (limit == null ? 43 : limit.hashCode())) * 59) + getOffset();
            HashMapNotNull<String, List<String>> storesAuthMap = getStoresAuthMap();
            return (iHashCode10 * 59) + (storesAuthMap != null ? storesAuthMap.hashCode() : 43);
        }

        public void setApkId(Integer num) {
            this.apkId = num;
        }

        public void setApkMd5sum(String str) {
            this.apkMd5sum = str;
        }

        public void setAppId(Integer num) {
            this.appId = num;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody
        public void setLang(String str) {
            this.lang = str;
        }

        public void setLimit(Integer num) {
            this.limit = num;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public void setOffset(int i2) {
            this.offset = i2;
        }

        public void setPackageId(Integer num) {
            this.packageId = num;
        }

        public void setPackageName(String str) {
            this.packageName = str;
        }

        public void setStoreIds(List<Long> list) {
            this.storeIds = list;
        }

        public void setStoreNames(List<String> list) {
            this.storeNames = list;
        }

        public void setStoresAuthMap(HashMapNotNull<String, List<String>> hashMapNotNull) {
            if (hashMapNotNull != null) {
                this.storesAuthMap = hashMapNotNull;
                this.storeNames = new LinkedList(hashMapNotNull.keySet());
            }
        }

        public String toString() {
            return "ListAppVersionsRequest.Body(apkId=" + getApkId() + ", apkMd5sum=" + getApkMd5sum() + ", appId=" + getAppId() + ", lang=" + getLang() + ", packageId=" + getPackageId() + ", packageName=" + getPackageName() + ", storeIds=" + getStoreIds() + ", storeNames=" + getStoreNames() + ", limit=" + getLimit() + ", offset=" + getOffset() + ", storesAuthMap=" + getStoresAuthMap() + ")";
        }

        public Body(String str, SharedPreferences sharedPreferences, String str2) {
            this(sharedPreferences, str2);
            this.packageName = str;
        }

        public Body(String str, List<String> list, HashMapNotNull<String, List<String>> hashMapNotNull, SharedPreferences sharedPreferences, String str2) {
            this(str, sharedPreferences, str2);
            this.storeNames = list;
            setStoresAuthMap(hashMapNotNull);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<ListAppVersions> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        return interfaces.listAppVersions((Body) this.body, z, true);
    }
}
