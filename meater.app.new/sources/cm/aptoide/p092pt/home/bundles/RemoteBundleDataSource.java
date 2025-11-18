package cm.aptoide.p092pt.home.bundles;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.view.WindowManager;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.AppCoinsManager;
import cm.aptoide.p092pt.dataprovider.exception.NoNetworkConnectionException;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetStoreWidgets;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Type;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords.AdsApplicationVersionCodeProvider;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.V7Url;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.WSWidgetsUtils;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.home.GetHomeBundlesRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetStoreWidgetsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.WidgetsArgs;
import cm.aptoide.p092pt.home.bundles.HomeBundlesModel;
import cm.aptoide.p092pt.home.bundles.base.FeaturedAppcBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.install.PackageRepository;
import cm.aptoide.p092pt.networking.IdsRepository;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class RemoteBundleDataSource implements BundleDataSource {
    private final AptoideAccountManager accountManager;
    private final AppCoinsManager appCoinsManager;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final ConnectivityManager connectivityManager;
    private final Converter.Factory converterFactory;
    private final String filters;
    private final IdsRepository idsRepository;
    private final boolean isGooglePlayServicesAvailable;
    private final int latestPackagesCount;
    private final int limit;
    private final BundlesResponseMapper mapper;
    private final OkHttpClient okHttpClient;
    private final PackageRepository packageRepository;
    private final String partnerId;
    private final int randomPackagesCount;
    private final Resources resources;
    private final SharedPreferences sharedPreferences;
    private final StoreCredentialsProvider storeCredentialsProvider;
    private final TokenInvalidator tokenInvalidator;
    private Map<String, Integer> total;
    private final AdsApplicationVersionCodeProvider versionCodeProvider;
    private final WSWidgetsUtils widgetsUtils;
    private final WindowManager windowManager;
    private Map<String, Boolean> loading = new HashMap();
    private Map<String, Boolean> error = new HashMap();

    public RemoteBundleDataSource(int i2, Map<String, Integer> map, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, BundlesResponseMapper bundlesResponseMapper, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, WSWidgetsUtils wSWidgetsUtils, StoreCredentialsProvider storeCredentialsProvider, IdsRepository idsRepository, boolean z, String str, AptoideAccountManager aptoideAccountManager, String str2, Resources resources, WindowManager windowManager, ConnectivityManager connectivityManager, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, PackageRepository packageRepository, int i3, int i4, AppCoinsManager appCoinsManager) {
        this.limit = i2;
        this.total = map;
        this.bodyInterceptor = bodyInterceptor;
        this.okHttpClient = okHttpClient;
        this.converterFactory = factory;
        this.mapper = bundlesResponseMapper;
        this.tokenInvalidator = tokenInvalidator;
        this.sharedPreferences = sharedPreferences;
        this.widgetsUtils = wSWidgetsUtils;
        this.storeCredentialsProvider = storeCredentialsProvider;
        this.idsRepository = idsRepository;
        this.isGooglePlayServicesAvailable = z;
        this.partnerId = str;
        this.accountManager = aptoideAccountManager;
        this.filters = str2;
        this.resources = resources;
        this.windowManager = windowManager;
        this.connectivityManager = connectivityManager;
        this.versionCodeProvider = adsApplicationVersionCodeProvider;
        this.packageRepository = packageRepository;
        this.latestPackagesCount = i3;
        this.randomPackagesCount = i4;
        this.appCoinsManager = appCoinsManager;
    }

    private HomeBundlesModel createErrorAppsList(Throwable th) {
        return th instanceof NoNetworkConnectionException ? new HomeBundlesModel(HomeBundlesModel.Error.NETWORK) : new HomeBundlesModel(HomeBundlesModel.Error.GENERIC);
    }

    private Single<HomeBundlesModel> getEventBundles(String str, boolean z, final String str2, int i2, int i3) {
        if (isLoading(str2)) {
            return Single.m39913m(new HomeBundlesModel(true));
        }
        return getMoreBundlesRequest(AbstractC2229V7.isUrlBaseCache(str) ? str.replace(AbstractC2229V7.getCacheHost(this.sharedPreferences), HttpUrl.FRAGMENT_ENCODE_SET) : str.replace(AbstractC2229V7.getHost(this.sharedPreferences), HttpUrl.FRAGMENT_ENCODE_SET), i2, i3).observe(z, false).m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.home.bundles.w
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f9669f.m8052a(str2);
            }
        }).m40051A(new InterfaceC11252a() { // from class: cm.aptoide.pt.home.bundles.n
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f9616f.m8053b(str2);
            }
        }).m40123z(new InterfaceC11252a() { // from class: cm.aptoide.pt.home.bundles.j
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f9601f.m8054c(str2);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.bundles.x
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9671f.m8055d(str2, (GetStoreWidgets) obj);
            }
        }).m40085Z0().m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.bundles.t
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9658f.m8056e(str2, (Throwable) obj);
            }
        });
    }

    private C11234e<HomeBundlesModel> getHomeBundles(final int i2, final int i3, final boolean z, final String str, final boolean z2) {
        return isLoading(str) ? C11234e.m40025S(new HomeBundlesModel(true)) : this.accountManager.hasMatureContentEnabled().m40057E().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.bundles.r
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9647f.m8065n(i3, i2, z, str, z2, (Boolean) obj);
            }
        });
    }

    private Single<List<String>> getPackages() {
        return C11234e.m40046h(this.packageRepository.getLatestInstalledPackages(this.latestPackagesCount), this.packageRepository.getRandomInstalledPackages(this.randomPackagesCount)).m40084Y0().m40085Z0();
    }

    private int getTotal(String str) {
        if (this.total.containsKey(str)) {
            return this.total.get(str).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean isComplete(List<HomeBundle> list) {
        for (HomeBundle homeBundle : list) {
            if (homeBundle.getContent() == null) {
                return false;
            }
            if ((homeBundle instanceof FeaturedAppcBundle) && ((FeaturedAppcBundle) homeBundle).getBonusPercentage() == -1) {
                return false;
            }
        }
        return !list.isEmpty();
    }

    private boolean isError(String str) {
        return this.error.containsKey(str) && this.error.get(str).booleanValue();
    }

    private boolean isLoading(String str) {
        return this.loading.containsKey(str) && this.loading.get(str).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getEventBundles$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8052a(String str) {
        this.loading.put(str, Boolean.TRUE);
        this.error.put(str, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getEventBundles$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8053b(String str) {
        this.loading.put(str, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getEventBundles$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8054c(String str) {
        this.loading.put(str, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getEventBundles$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ HomeBundlesModel m8056e(String str, Throwable th) {
        this.error.put(str, Boolean.TRUE);
        return createErrorAppsList(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getHomeBundles$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8057f(Boolean bool, boolean z, List list, String str, GetStoreWidgets getStoreWidgets) {
        return C11234e.m40033a0(C11234e.m40025S(getStoreWidgets), loadAppsInBundles(bool.booleanValue(), z, list, getStoreWidgets, false, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getHomeBundles$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8058g(String str) {
        this.loading.put(str, Boolean.TRUE);
        this.error.put(str, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getHomeBundles$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8059h(String str) {
        this.loading.put(str, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getHomeBundles$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8060i(String str) {
        this.loading.put(str, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getHomeBundles$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ HomeBundlesModel m8062k(String str, Throwable th) {
        th.printStackTrace();
        this.loading.put(str, Boolean.FALSE);
        this.error.put(str, Boolean.TRUE);
        return createErrorAppsList(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getHomeBundles$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8063l(int i2, int i3, final boolean z, final Boolean bool, final String str, final String str2, final boolean z2, final List list) {
        return GetHomeBundlesRequest.m7475of(i2, i3, this.okHttpClient, this.converterFactory, this.bodyInterceptor, this.tokenInvalidator, this.sharedPreferences, this.resources, this.windowManager).observe(z, false).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.bundles.s
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9653f.m8057f(bool, z, list, str, (GetStoreWidgets) obj);
            }
        }).m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.home.bundles.l
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f9605f.m8058g(str2);
            }
        }).m40051A(new InterfaceC11252a() { // from class: cm.aptoide.pt.home.bundles.q
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f9645f.m8059h(str2);
            }
        }).m40123z(new InterfaceC11252a() { // from class: cm.aptoide.pt.home.bundles.h
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f9594f.m8060i(str2);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.bundles.v
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9667f.m8061j(str2, (GetStoreWidgets) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.bundles.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(z2 || ((HomeBundlesModel) obj).isComplete());
            }
        }).m40076Q0(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.bundles.y
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeBundlesModel) obj).isComplete());
            }
        }).m40105p0(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.bundles.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9603f.m8062k(str2, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getHomeBundles$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8064m(final int i2, final int i3, final boolean z, final Boolean bool, final String str, final boolean z2, final String str2) {
        return getPackages().m39915A().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.bundles.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9619f.m8063l(i2, i3, z, bool, str2, str, z2, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getHomeBundles$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8065n(final int i2, final int i3, final boolean z, final String str, final boolean z2, final Boolean bool) {
        return this.idsRepository.getUniqueIdentifier().m39915A().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.bundles.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9587f.m8064m(i2, i3, z, bool, str, z2, (String) obj);
            }
        });
    }

    static /* synthetic */ GetStoreWidgets.WSWidget lambda$loadAppsInBundles$10(GetStoreWidgets.WSWidget wSWidget, GetStoreWidgets.WSWidget wSWidget2) {
        return wSWidget;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadAppsInBundles$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8066o(boolean z, String str, boolean z2, boolean z3, List list, final GetStoreWidgets.WSWidget wSWidget) {
        WSWidgetsUtils wSWidgetsUtils = this.widgetsUtils;
        BaseRequestWithStore.StoreCredentials storeCredentialsFromUrl = this.storeCredentialsProvider.fromUrl(HttpUrl.FRAGMENT_ENCODE_SET);
        boolean z4 = this.isGooglePlayServicesAvailable;
        String str2 = this.partnerId;
        BodyInterceptor<BaseBody> bodyInterceptor = this.bodyInterceptor;
        OkHttpClient okHttpClient = this.okHttpClient;
        Converter.Factory factory = this.converterFactory;
        String str3 = this.filters;
        TokenInvalidator tokenInvalidator = this.tokenInvalidator;
        SharedPreferences sharedPreferences = this.sharedPreferences;
        Resources resources = this.resources;
        WindowManager windowManager = this.windowManager;
        return wSWidgetsUtils.loadWidgetNode(wSWidget, storeCredentialsFromUrl, z, str, z4, str2, z2, bodyInterceptor, okHttpClient, factory, str3, tokenInvalidator, sharedPreferences, resources, windowManager, this.connectivityManager, this.versionCodeProvider, z3, Type.ADS.getPerLineCount(resources, windowManager) * 3, list, this.appCoinsManager).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.bundles.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
                RemoteBundleDataSource.lambda$loadAppsInBundles$10(wSWidget2, (GetStoreWidgets.WSWidget) obj);
                return wSWidget2;
            }
        });
    }

    static /* synthetic */ GetStoreWidgets lambda$loadAppsInBundles$12(GetStoreWidgets getStoreWidgets, GetStoreWidgets.WSWidget wSWidget) {
        return getStoreWidgets;
    }

    private C11234e<GetStoreWidgets> loadAppsInBundles(final boolean z, final boolean z2, final List<String> list, final GetStoreWidgets getStoreWidgets, final boolean z3, final String str) {
        return C11234e.m40020N(getStoreWidgets.getDataList().getList()).m40095j0(Schedulers.m40658io()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.bundles.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9607f.m8066o(z2, str, z, z3, list, (GetStoreWidgets.WSWidget) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.bundles.u
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                GetStoreWidgets getStoreWidgets2 = getStoreWidgets;
                RemoteBundleDataSource.lambda$loadAppsInBundles$12(getStoreWidgets2, (GetStoreWidgets.WSWidget) obj);
                return getStoreWidgets2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mapHomeResponse, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C11234e<HomeBundlesModel> m8061j(GetStoreWidgets getStoreWidgets, String str) {
        if (!getStoreWidgets.isOk()) {
            return C11234e.m40017C(new IllegalStateException("Could not obtain home bundles from server."));
        }
        List<HomeBundle> listFromWidgetsToBundles = this.mapper.fromWidgetsToBundles(getStoreWidgets.getDataList().getList());
        boolean zIsComplete = isComplete(listFromWidgetsToBundles);
        List<HomeBundle> listRemoveEmptyBundles = removeEmptyBundles(listFromWidgetsToBundles);
        this.total.put(str, Integer.valueOf(getStoreWidgets.getDataList().getTotal()));
        return C11234e.m40025S(new HomeBundlesModel(listRemoveEmptyBundles, false, getStoreWidgets.getDataList().getNext(), zIsComplete));
    }

    private List<HomeBundle> removeEmptyBundles(List<HomeBundle> list) {
        ArrayList arrayList = new ArrayList();
        for (HomeBundle homeBundle : list) {
            if (homeBundle.getContent() == null || (homeBundle.getType().isApp() && !homeBundle.getContent().isEmpty())) {
                arrayList.add(homeBundle);
            } else if (!homeBundle.getType().isApp()) {
                arrayList.add(homeBundle);
            }
        }
        return arrayList;
    }

    public GetStoreWidgetsRequest getMoreBundlesRequest(String str, int i2, int i3) {
        boolean zBooleanValue = this.accountManager.hasMatureContentEnabled().m40057E().m40085Z0().m39933y().m40633b().booleanValue();
        BaseRequestWithStore.StoreCredentials storeCredentialsFromUrl = this.storeCredentialsProvider.fromUrl(str);
        GetStoreWidgetsRequest.Body body = new GetStoreWidgetsRequest.Body(storeCredentialsFromUrl, WidgetsArgs.createWithLineMultiplier(this.resources, this.windowManager, 3), i3);
        body.setOffset(i2);
        return new GetStoreWidgetsRequest(new V7Url(str).remove("getStoreWidgets").get(), body, this.bodyInterceptor, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, storeCredentialsFromUrl, this.idsRepository.getUniqueIdentifier().m39933y().m40633b(), this.isGooglePlayServicesAvailable, this.partnerId, zBooleanValue, this.filters, this.resources, this.windowManager, this.connectivityManager, this.versionCodeProvider, new WSWidgetsUtils(), this.appCoinsManager);
    }

    @Override // cm.aptoide.p092pt.home.bundles.BundleDataSource
    public boolean hasMore(Integer num, String str) {
        return (num.intValue() >= getTotal(str) || isLoading(str) || isError(str)) ? false : true;
    }

    @Override // cm.aptoide.p092pt.home.bundles.BundleDataSource
    public Single<HomeBundlesModel> loadFreshBundleForEvent(String str, String str2) {
        return getEventBundles(str, true, str2, 0, this.limit);
    }

    @Override // cm.aptoide.p092pt.home.bundles.BundleDataSource
    public C11234e<HomeBundlesModel> loadFreshHomeBundles(String str) {
        return getHomeBundles(0, this.limit, true, str, false);
    }

    @Override // cm.aptoide.p092pt.home.bundles.BundleDataSource
    public Single<HomeBundlesModel> loadNextBundleForEvent(String str, int i2, String str2, int i3) {
        return getEventBundles(str, false, str2, i2, i3);
    }

    @Override // cm.aptoide.p092pt.home.bundles.BundleDataSource
    public C11234e<HomeBundlesModel> loadNextHomeBundles(int i2, int i3, String str, boolean z) {
        return getHomeBundles(i2, i3, false, str, z);
    }
}
