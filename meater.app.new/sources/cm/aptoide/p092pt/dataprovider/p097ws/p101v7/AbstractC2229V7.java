package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import android.accounts.NetworkErrorException;
import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.exception.AptoideWsV7Exception;
import cm.aptoide.p092pt.dataprovider.exception.NoNetworkConnectionException;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.model.p096v7.EditorialCard;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetApp;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetFollowers;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetMySubscribedStoresResponse;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetStoreWidgets;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetUserInfo;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListAppCoinsCampaigns;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListApps;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListComments;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListFullReviews;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListReviews;
import cm.aptoide.p092pt.dataprovider.model.p096v7.SetComment;
import cm.aptoide.p092pt.dataprovider.model.p096v7.TimelineStats;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.ListAppVersions;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.ListAppsUpdates;
import cm.aptoide.p092pt.dataprovider.model.p096v7.search.ListSearchApps;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetHome;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetHomeMeta;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStore;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStoreDisplays;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStoreMeta;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.ListStores;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.RefreshBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.EditorialListRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetAppCoinsCampaignsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetFollowersRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetMySubscribedStoresRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetTimelineStatsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetUserInfoRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ListCommentsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ListFullReviewsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ListReviewsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.PostCommentForReview;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.PostReviewRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.SetReviewRatingRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.SetUserRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.SetUserSettings;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.SimpleSetStoreRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.analyticsbody.DownloadInstallAnalyticsBaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.home.ActionItemResponse;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.listapps.ListAppVersionsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.listapps.ListAppsUpdatesRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.promotions.ClaimPromotionRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.promotions.GetPackagePromotionsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.promotions.GetPackagePromotionsResponse;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.promotions.GetPromotionAppsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.promotions.GetPromotionAppsResponse;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.promotions.GetPromotionsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.promotions.GetPromotionsResponse;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.ChangeStoreSubscriptionRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetHomeBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetHomeMetaRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetMyStoreListRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetRecommendedStoresRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetStoreBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetStoreDisplaysRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetStoreWidgetsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetUserRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.ListStoresRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.PostCommentForStore;
import cm.aptoide.p092pt.dataprovider.util.HashMapNotNull;
import cm.aptoide.p092pt.dataprovider.util.ToRetryThrowable;
import cm.aptoide.p092pt.preferences.toolbox.ToolboxManager;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11257f;
import p456rx.schedulers.Schedulers;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.adapter.rxjava.HttpException;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.V7 */
/* loaded from: classes.dex */
public abstract class AbstractC2229V7<U, B extends RefreshBody> extends WebService<Interfaces, U> {
    private final String INVALID_ACCESS_TOKEN_CODE;
    private final int MAX_RETRY_COUNT;
    private boolean accessTokenRetry;
    protected final B body;
    protected final BodyInterceptor bodyInterceptor;
    private QueryStringMapper queryStringMapper;
    private final TokenInvalidator tokenInvalidator;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.V7$Interfaces */
    public interface Interfaces {
        @POST("user/addEvent/name={name}/action={action}/context={context}")
        C11234e<BaseV7Response> addEvent(@Path("name") String str, @Path("action") String str2, @Path("context") String str3, @Body BiUtmAnalyticsRequestBody biUtmAnalyticsRequestBody);

        @POST("user/addEvent/name={name}/action={action}/context={context}")
        C11234e<BaseV7Response> addEvent(@Path("name") String str, @Path("action") String str2, @Path("context") String str3, @Body DownloadInstallAnalyticsBaseBody downloadInstallAnalyticsBaseBody);

        @POST("store/subscription/set")
        C11234e<ChangeStoreSubscriptionResponse> changeStoreSubscription(@Header(WebService.BYPASS_HEADER_KEY) boolean z, @Body ChangeStoreSubscriptionRequest.Body body);

        @POST("appcoins/promotions/claim")
        C11234e<BaseV7Response> claimPromotion(@Body ClaimPromotionRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("store/set")
        C11234e<BaseV7Response> editStore(@Body SimpleSetStoreRequest.Body body);

        @POST("store/set")
        @Multipart
        C11234e<BaseV7Response> editStore(@Part MultipartBody.Part part, @PartMap HashMapNotNull<String, RequestBody> hashMapNotNull);

        @POST("user/set")
        @Multipart
        C11234e<BaseV7Response> editUser(@Part MultipartBody.Part part, @PartMap HashMapNotNull<String, RequestBody> hashMapNotNull);

        @GET("{url}")
        C11234e<ActionItemResponse> getActionItem(@Path(encoded = true, value = "url") String str, @QueryMap(encoded = true) Map<String, String> map, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @GET("getApp")
        C11234e<GetApp> getApp(@Header("Cache-Control") String str, @QueryMap(encoded = true) Map<String, String> map);

        @POST("appcoins/catappult/campaigns/get/limit={limit}")
        C11234e<ListAppCoinsCampaigns> getAppCoinsAds(@Body GetAppCoinsCampaignsRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z, @Path("limit") int i2, @Query("aab") boolean z2);

        @GET("getApp/{url}")
        C11234e<GetApp> getAppMeta(@Header(WebService.BYPASS_HEADER_KEY) boolean z, @Path(encoded = true, value = "url") String str);

        @POST("user/action/item/card/get/id={cardId}")
        C11234e<EditorialCard> getEditorialFromCardId(@Path("cardId") String str, @Body BaseBody baseBody, @Query("aab") boolean z);

        @POST("user/action/item/card/get/slug={slug}")
        C11234e<EditorialCard> getEditorialFromSlug(@Path("slug") String str, @Body BaseBody baseBody, @Query("aab") boolean z);

        @POST("user/action/item/cards/get/type=CURATION_1/limit={limit}")
        C11234e<EditorialListResponse> getEditorialList(@Path("limit") int i2, @Body EditorialListRequest.Body body);

        @POST("home/get")
        C11234e<GetHome> getHome(@Body GetHomeBody getHomeBody, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @GET("getStoreWidgets/")
        C11234e<GetStoreWidgets> getHomeBundles(@Header(WebService.BYPASS_HEADER_KEY) boolean z, @QueryMap(encoded = true) Map<String, String> map);

        @POST("home/getMeta{url}")
        C11234e<GetHomeMeta> getHomeMeta(@Path(encoded = true, value = "url") String str, @Body GetHomeMetaRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("my/stores/getSubscribed")
        C11234e<ListStores> getMyStoreList(@Body GetMyStoreListRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("{url}")
        C11234e<ListStores> getMyStoreList(@Path(encoded = true, value = "url") String str, @Body GetMyStoreListRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("{url}")
        C11234e<ListStores> getMyStoreListEndless(@Path(encoded = true, value = "url") String str, @Body GetMyStoreListRequest.EndlessBody endlessBody, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("my/store/getMeta")
        C11234e<GetStoreMeta> getMyStoreMeta(@Body BaseBody baseBody, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("my/stores/getSubscribed/")
        C11234e<GetMySubscribedStoresResponse> getMySubscribedStores(@Header(WebService.BYPASS_HEADER_KEY) boolean z, @Body GetMySubscribedStoresRequest.Body body);

        @POST("appcoins/promotions/promotion/get/limit={limit}")
        C11234e<GetPromotionAppsResponse> getPromotionApps(@Path("limit") int i2, @Body GetPromotionAppsRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z, @Query("aab") boolean z2);

        @POST("appcoins/promotions/get")
        C11234e<GetPromotionsResponse> getPromotions(@Body GetPromotionsRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z, @Query("aab") boolean z2);

        @POST("appcoins/promotions/packages/getPromotions")
        C11234e<GetPackagePromotionsResponse> getPromotionsForPackage(@Body GetPackagePromotionsRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @GET("apps/getRecommended")
        C11234e<ListApps> getRecommended(@Header("Cache-Control") String str, @QueryMap(encoded = true) Map<String, String> map);

        @POST("{url}")
        C11234e<ListStores> getRecommendedStore(@Path(encoded = true, value = "url") String str, @Body GetRecommendedStoresRequest.EndlessBody endlessBody, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("getStore{url}")
        C11234e<GetStore> getStore(@Path(encoded = true, value = "url") String str, @Body GetStoreBody getStoreBody, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("getStoreDisplays{url}")
        C11234e<GetStoreDisplays> getStoreDisplays(@Path(encoded = true, value = "url") String str, @Body GetStoreDisplaysRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("store/getMeta")
        C11234e<GetStoreMeta> getStoreMeta(@Body GetHomeMetaRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("{url}")
        C11234e<GetStoreMeta> getStoreMeta(@Path(encoded = true, value = "url") String str, @Body GetHomeMetaRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("getStoreWidgets{url}")
        C11234e<GetStoreWidgets> getStoreWidgets(@Path(encoded = true, value = "url") String str, @Body GetStoreWidgetsRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("user/getFollowers")
        C11234e<GetFollowers> getTimelineFollowers(@Body GetFollowersRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("user/getFollowing")
        C11234e<GetFollowers> getTimelineGetFollowing(@Body GetFollowersRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("user/getTimelineStats")
        C11234e<TimelineStats> getTimelineStats(@Body GetTimelineStatsRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("user/get{url}")
        C11234e<GetStore> getUser(@Path(encoded = true, value = "url") String str, @Body GetUserRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("user/get")
        C11234e<GetUserInfo> getUserInfo(@Body GetUserInfoRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("listAppVersions")
        C11234e<ListAppVersions> listAppVersions(@Body ListAppVersionsRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z, @Query("aab") boolean z2);

        @GET("listApps{url}")
        C11234e<ListApps> listApps(@Path(encoded = true, value = "url") String str, @Header("Cache-Control") String str2, @QueryMap(encoded = true) Map<String, String> map);

        @POST("listAppsUpdates")
        C11234e<ListAppsUpdates> listAppsUpdates(@Body ListAppsUpdatesRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z, @Query("aab") boolean z2);

        @POST("listComments")
        C11234e<ListComments> listComments(@Body ListCommentsRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST
        C11234e<ListComments> listComments(@Url String str, @Body ListCommentsRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("listFullReviews")
        C11234e<ListFullReviews> listFullReviews(@Body ListFullReviewsRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("listFullReviews{url}")
        C11234e<ListFullReviews> listFullReviews(@Path(encoded = true, value = "url") String str, @Body ListFullReviewsRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("listReviews")
        C11234e<ListReviews> listReviews(@Body ListReviewsRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @GET("listSearchApps")
        C11234e<ListSearchApps> listSearchApps(@Header("Cache-Control") String str, @QueryMap(encoded = true) Map<String, String> map);

        @POST("listStores{url}")
        C11234e<ListStores> listStores(@Path(encoded = true, value = "url") String str, @Body ListStoresRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("listStores/sort/{sort}/limit/{limit}")
        C11234e<ListStores> listTopStores(@Path(encoded = true, value = "sort") String str, @Path(encoded = true, value = "limit") int i2, @Body ListStoresRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("setReview")
        C11234e<BaseV7Response> postReview(@Body PostReviewRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("setComment")
        C11234e<BaseV7Response> postReviewComment(@Body PostCommentForReview.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("setComment")
        C11234e<SetComment> postStoreComment(@Body PostCommentForStore.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("review/set/access_token={accessToken}/card_uid={cardUid}/rating={rating}")
        C11234e<BaseV7Response> setReview(@Body BaseBody baseBody, @Path("cardUid") String str, @Path("accessToken") String str2, @Path("rating") String str3, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("setReviewVote")
        C11234e<BaseV7Response> setReviewVote(@Body SetReviewRatingRequest.Body body, @Header(WebService.BYPASS_HEADER_KEY) boolean z);

        @POST("user/set")
        C11234e<BaseV7Response> setUser(@Body SetUserRequest.Body body);

        @POST("user/settings/set")
        C11234e<BaseV7Response> setUserSettings(@Body SetUserSettings.Body body);
    }

    protected AbstractC2229V7(B b2, String str, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator) {
        super(Interfaces.class, okHttpClient, factory, str);
        this.INVALID_ACCESS_TOKEN_CODE = "AUTH-2";
        this.MAX_RETRY_COUNT = 3;
        this.accessTokenRetry = false;
        this.body = b2;
        this.bodyInterceptor = bodyInterceptor;
        this.tokenInvalidator = tokenInvalidator;
    }

    public static String getCacheHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_V7_CACHE_HOST);
        sb.append("/api/7.20240701/");
        return sb.toString();
    }

    public static String getErrorMessage(BaseV7Response baseV7Response) {
        StringBuilder sb = new StringBuilder();
        if (baseV7Response == null || baseV7Response.getErrors() == null) {
            sb.append("Server returned null response.");
        } else {
            Iterator<BaseV7Response.Error> it = baseV7Response.getErrors().iterator();
            while (it.hasNext()) {
                sb.append(it.next().getDescription());
                sb.append(". ");
            }
            if (sb.length() == 0) {
                sb.append("Server failed with empty error list.");
            }
        }
        return sb.toString();
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_V7_HOST);
        sb.append("/api/7.20240701/");
        return sb.toString();
    }

    private C11234e<U> handleToken(C11234e<U> c11234e, final boolean z) {
        return c11234e.m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8571f.m7466c(z, (Throwable) obj);
            }
        });
    }

    public static boolean isUrlBaseCache(String str) {
        return str != null && str.contains(BuildConfig.APTOIDE_WEB_SERVICES_V7_CACHE_HOST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleToken$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7466c(boolean z, Throwable th) {
        if (!(th instanceof AptoideWsV7Exception)) {
            return C11234e.m40017C(th);
        }
        if (!"AUTH-2".equals(((AptoideWsV7Exception) th).getBaseResponse().getError().getCode())) {
            return C11234e.m40017C(th);
        }
        if (this.accessTokenRetry) {
            return C11234e.m40017C(new NetworkErrorException());
        }
        this.accessTokenRetry = true;
        return this.tokenInvalidator.invalidateAccessToken().m39978j(500L, TimeUnit.MILLISECONDS).m39974b(observe(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observe$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Object m7467d(boolean z, Object obj) {
        return handleToken(retryOnTicket(super.observe(z)), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$retryOnTicket$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7468e(Object obj) {
        BaseV7Response baseV7Response;
        if (obj instanceof Response) {
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                baseV7Response = (BaseV7Response) response.body();
            } else {
                try {
                    BaseV7Response baseV7Response2 = (BaseV7Response) this.retrofit.responseBodyConverter(BaseV7Response.class, new Annotation[0]).convert(((Response) obj).errorBody());
                    if (response.code() == 401) {
                        AptoideWsV7Exception aptoideWsV7Exception = new AptoideWsV7Exception();
                        aptoideWsV7Exception.setBaseResponse(baseV7Response2);
                        return C11234e.m40017C(aptoideWsV7Exception);
                    }
                    baseV7Response = baseV7Response2;
                } catch (IOException e2) {
                    return C11234e.m40017C(e2);
                }
            }
        } else {
            baseV7Response = (BaseV7Response) obj;
        }
        return (baseV7Response.getInfo() == null || !BaseV7Response.Info.Status.QUEUED.equals(baseV7Response.getInfo().getStatus())) ? C11234e.m40025S(obj) : C11234e.m40017C(new ToRetryThrowable());
    }

    private /* synthetic */ Object lambda$retryOnTicket$2(Throwable th, Integer num) {
        if ((th instanceof ToRetryThrowable) && num.intValue() < 3) {
            return null;
        }
        if (isNoNetworkException(th)) {
            throw new NoNetworkConnectionException(th);
        }
        if (th instanceof AptoideWsV7Exception) {
            throw ((AptoideWsV7Exception) th);
        }
        if (!(th instanceof HttpException)) {
            throw new RuntimeException(th);
        }
        try {
            AptoideWsV7Exception aptoideWsV7Exception = new AptoideWsV7Exception(th);
            aptoideWsV7Exception.setBaseResponse((BaseV7Response) this.converterFactory.responseBodyConverter(BaseV7Response.class, null, null).convert(((HttpException) th).response().errorBody()));
            throw aptoideWsV7Exception;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$retryOnTicket$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7470g(C11234e c11234e) {
        return c11234e.m40090e1(C11234e.m40050r0(1, 3), new InterfaceC11257f() { // from class: cm.aptoide.pt.dataprovider.ws.v7.g
            @Override // p456rx.p460m.InterfaceC11257f
            /* renamed from: a */
            public final Object mo6865a(Object obj, Object obj2) {
                this.f8582f.m7469f((Throwable) obj, (Integer) obj2);
                return null;
            }
        }).m40106q(500L, TimeUnit.MILLISECONDS);
    }

    private C11234e<U> retryOnTicket(C11234e<U> c11234e) {
        return c11234e.m40065I0(Schedulers.m40658io()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8568f.m7468e(obj);
            }
        }).m40112t0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8579f.m7470g((C11234e) obj);
            }
        });
    }

    /* renamed from: f */
    public /* synthetic */ Object m7469f(Throwable th, Integer num) {
        lambda$retryOnTicket$2(th, num);
        return null;
    }

    public B getBody() {
        return this.body;
    }

    protected QueryStringMapper getQueryStringMapper() {
        if (this.queryStringMapper == null) {
            this.queryStringMapper = new QueryStringMapper();
        }
        return this.queryStringMapper;
    }

    protected TokenInvalidator getTokenInvalidator() {
        return this.tokenInvalidator;
    }

    public C11234e<U> observe(boolean z, boolean z2) {
        B b2 = this.body;
        if (b2 != null) {
            b2.setRefresh(z2);
        }
        return observe(z);
    }

    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<U> observe(final boolean z) {
        B b2 = this.body;
        if (b2 == null) {
            return handleToken(retryOnTicket(super.observe(z)), z);
        }
        return this.bodyInterceptor.intercept(b2).m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8575f.m7467d(z, obj);
            }
        });
    }
}
