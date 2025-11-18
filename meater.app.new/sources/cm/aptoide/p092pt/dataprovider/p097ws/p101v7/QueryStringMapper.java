package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetAppRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetRecommendedRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ListAppsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ListSearchAppsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.home.GetActionItemRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.home.GetHomeBundlesRequest;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class QueryStringMapper {
    private String getNodesAsString(GetAppRequest.Body body) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
            objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
            return objectMapper.writeValueAsString(body.getNodes());
        } catch (JsonProcessingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private String getWidgetArgsAsString(GetHomeBundlesRequest.Body body) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
            objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
            return objectMapper.writeValueAsString(body.getWidgetsArgs());
        } catch (JsonProcessingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private void put(String str, Object obj, Map<String, String> map) {
        if (obj != null) {
            map.put(str, String.valueOf(obj));
        }
    }

    public Map<String, String> map(BaseBody baseBody, boolean z, Map<String, String> map) {
        put("aptoide_md5sum", baseBody.getAptoideMd5sum(), map);
        put("aptoide_package", baseBody.getAptoidePackage(), map);
        put("aptoide_vercode", Integer.valueOf(baseBody.getAptoideVercode()), map);
        put("cdn", baseBody.getCdn(), map);
        put("lang", baseBody.getLang(), map);
        put("mature", Boolean.valueOf(baseBody.isMature()), map);
        put("q", baseBody.getQ(), map);
        put("refresh", Boolean.valueOf(baseBody.isRefresh()), map);
        if (z) {
            put("aptoide_uid", baseBody.getAptoideId(), map);
        }
        put("country", baseBody.getCountry(), map);
        if (baseBody.getAccessToken() != null && !baseBody.getAccessToken().equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            put("access_token", baseBody.getAccessToken(), map);
        }
        if (baseBody instanceof BaseBodyWithAlphaBetaKey) {
            BaseBodyWithAlphaBetaKey baseBodyWithAlphaBetaKey = (BaseBodyWithAlphaBetaKey) baseBody;
            if (baseBodyWithAlphaBetaKey.shouldIncludeTag()) {
                put("not_apk_tags", baseBodyWithAlphaBetaKey.getNotApkTags(), map);
            }
        }
        if (baseBody instanceof BaseBodyWithApp) {
            BaseBodyWithApp baseBodyWithApp = (BaseBodyWithApp) baseBody;
            put("store_user", baseBodyWithApp.getStoreUser(), map);
            put("store_pass_sha1", baseBodyWithApp.getStorePassSha1(), map);
        }
        return map;
    }

    public Map<String, String> map(ListAppsRequest.Body body) {
        HashMap map = new HashMap();
        map(body, false, map);
        put("aab", Boolean.TRUE, map);
        put("not_apk_tags", body.getNotApkTags(), map);
        put("store_user", body.getStoreUser(), map);
        put("store_pass_sha1", body.getStorePassSha1(), map);
        put("limit", body.getLimit(), map);
        put("offset", Integer.valueOf(body.getOffset()), map);
        put(StoreTabGridRecyclerFragment.BundleCons.GROUP_ID, body.getGroupId(), map);
        put("store_id", body.getStoreId(), map);
        if (body.getSort() != null) {
            put("sort", body.getSort().name(), map);
        }
        return map;
    }

    public Map<String, String> map(ListSearchAppsRequest.Body body) {
        HashMap map = new HashMap();
        map(body, true, map);
        put("aab", Boolean.TRUE, map);
        put("limit", body.getLimit(), map);
        put("offset", Integer.valueOf(body.getOffset()), map);
        put("query", body.getQuery(), map);
        put("trusted", body.getOnlyTrusted(), map);
        put("appc_only", body.getOnlyAppc(), map);
        if (body.getStoreIds() != null) {
            put("store_ids", body.getStoreIdsAsString(), map);
        }
        if (body.getStoreNames() != null) {
            put("store_names", body.getStoreNamesAsString(), map);
        }
        if (body.getOnlyBeta().booleanValue()) {
            put("apk_tags", "alpha,beta", map);
        }
        if (body.getStoresAuthMap() != null && !body.getStoresAuthMap().isEmpty()) {
            put("stores_auth_map", body.getStoresAuthMapAsString(), map);
        }
        return map;
    }

    public Map<String, String> map(GetAppRequest.Body body) {
        HashMap map = new HashMap();
        map(body, false, map);
        put("aab", Boolean.TRUE, map);
        put(RateAndReviewsFragment.BundleCons.APP_ID, body.getAppId(), map);
        put("nodes", getNodesAsString(body), map);
        put("package_name", body.getPackageName(), map);
        put("package_uname", body.getUname(), map);
        put("apk_md5sum", body.getMd5(), map);
        put("store_name", body.getStoreName(), map);
        return map;
    }

    public Map<String, String> map(GetHomeBundlesRequest.Body body) {
        HashMap map = new HashMap();
        map(body, true, map);
        put("limit", body.getLimit(), map);
        put("offset", Integer.valueOf(body.getOffset()), map);
        put("store_id", Long.valueOf(body.getStoreId()), map);
        put("context", body.getContext(), map);
        put("widgets_args", getWidgetArgsAsString(body), map);
        return map;
    }

    public Map<String, String> map(GetRecommendedRequest.Body body) {
        HashMap map = new HashMap();
        map(body, false, map);
        put("package_name", body.getPackageName(), map);
        put("limit", body.getLimit(), map);
        put("offset", Integer.valueOf(body.getOffset()), map);
        put("section", body.getSection(), map);
        return map;
    }

    public Map<String, String> map(GetActionItemRequest.Body body) {
        HashMap map = new HashMap();
        map(body, true, map);
        return map;
    }
}
