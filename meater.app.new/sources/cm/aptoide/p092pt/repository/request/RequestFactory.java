package cm.aptoide.p092pt.repository.request;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.view.WindowManager;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.AppCoinsManager;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords.AdsApplicationVersionCodeProvider;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetRecommendedRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ListAppsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ListFullReviewsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetRecommendedStoresRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetStoreRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetStoreWidgetsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetUserRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.ListStoresRequest;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import okhttp3.OkHttpClient;
import retrofit2.Converter;

@Deprecated
/* loaded from: classes.dex */
public class RequestFactory {
    private final AppCoinsManager appCoinsManager;
    private final GetRecommendedRequestFactory getRecommendedRequestFactory;
    private final GetStoreRecommendedRequestFactory getStoreRecommendedRequestFactory;
    private final GetStoreRequestFactory getStoreRequestFactory;
    private final GetStoreWidgetsRequestFactory getStoreWidgetsRequestFactory;
    private final GetUserRequestFactory getUserRequestFactory;
    private final boolean googlePlayServicesAvailable;
    private final ListAppsRequestFactory listAppsRequestFactory;
    private final ListFullReviewsRequestFactory listFullReviewsRequestFactory;
    private final ListStoresRequestFactory listStoresRequestFactory;
    private final StoreCredentialsProvider storeCredentialsProvider;

    public RequestFactory(StoreCredentialsProvider storeCredentialsProvider, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager, String str, String str2, AptoideAccountManager aptoideAccountManager, String str3, ConnectivityManager connectivityManager, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, boolean z, AppCoinsManager appCoinsManager) {
        this.storeCredentialsProvider = storeCredentialsProvider;
        this.googlePlayServicesAvailable = z;
        this.appCoinsManager = appCoinsManager;
        this.listStoresRequestFactory = new ListStoresRequestFactory(bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
        this.listAppsRequestFactory = new ListAppsRequestFactory(bodyInterceptor, storeCredentialsProvider, okHttpClient, factory, tokenInvalidator, sharedPreferences, resources, windowManager);
        this.listFullReviewsRequestFactory = new ListFullReviewsRequestFactory(bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
        this.getStoreRequestFactory = new GetStoreRequestFactory(storeCredentialsProvider, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, resources, windowManager);
        this.getStoreWidgetsRequestFactory = new GetStoreWidgetsRequestFactory(storeCredentialsProvider, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, resources, windowManager, str, str2, aptoideAccountManager, str3, connectivityManager, adsApplicationVersionCodeProvider, appCoinsManager);
        this.getUserRequestFactory = new GetUserRequestFactory(bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, resources, windowManager, storeCredentialsProvider, str, str2, aptoideAccountManager, str3, connectivityManager, adsApplicationVersionCodeProvider, appCoinsManager);
        this.getStoreRecommendedRequestFactory = new GetStoreRecommendedRequestFactory(bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
        this.getRecommendedRequestFactory = new GetRecommendedRequestFactory(bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    @Deprecated
    public GetRecommendedRequest newGetRecommendedRequest(int i2, String str) {
        return this.getRecommendedRequestFactory.newGetRecommendedRequest(i2, str);
    }

    @Deprecated
    public GetRecommendedStoresRequest newGetRecommendedStores(String str) {
        return this.getStoreRecommendedRequestFactory.newRecommendedStore(str);
    }

    @Deprecated
    public GetUserRequest newGetUser(String str) {
        return this.getUserRequestFactory.newGetUser(str, this.googlePlayServicesAvailable);
    }

    @Deprecated
    public ListAppsRequest newListAppsRequest(String str) {
        return this.listAppsRequestFactory.newListAppsRequest(str);
    }

    @Deprecated
    public ListFullReviewsRequest newListFullReviews(String str, boolean z) {
        return this.listFullReviewsRequestFactory.newListFullReviews(str, z, this.storeCredentialsProvider.fromUrl(str));
    }

    @Deprecated
    public ListStoresRequest newListStoresRequest(int i2, int i3) {
        return this.listStoresRequestFactory.newListStoresRequest(i2, i3);
    }

    @Deprecated
    public GetStoreRequest newStore(String str) {
        return this.getStoreRequestFactory.newStore(str);
    }

    @Deprecated
    public GetStoreWidgetsRequest newStoreWidgets(String str) {
        return this.getStoreWidgetsRequestFactory.newStoreWidgets(str, this.googlePlayServicesAvailable);
    }

    @Deprecated
    public ListStoresRequest newListStoresRequest(String str) {
        return this.listStoresRequestFactory.newListStoresRequest(str);
    }
}
