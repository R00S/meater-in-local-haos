package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.view.WindowManager;
import cm.aptoide.p092pt.AppCoinsManager;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetStoreWidgets;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Type;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStore;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords.AdsApplicationVersionCodeProvider;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.V7Url;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.WSWidgetsUtils;
import java.util.Collections;
import java.util.List;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class GetUserRequest extends AbstractC2229V7<GetStore, Body> {
    private final boolean accountMature;
    private final AppCoinsManager appCoinsManager;
    private boolean bypassServerCache;
    private final String clientUniqueId;
    private final ConnectivityManager connectivityManager;
    private final String filters;
    private final OkHttpClient httpClient;
    private final boolean isGooglePlayServicesAvailable;
    private final String partnerId;
    private final Resources resources;
    private final SharedPreferences sharedPreferences;
    private final BaseRequestWithStore.StoreCredentials storeCredentials;
    private final TokenInvalidator tokenInvalidator;
    private String url;
    private final AdsApplicationVersionCodeProvider versionCodeProvider;
    private final WindowManager windowManager;

    public static class Body extends BaseBody {
        private WidgetsArgs widgetsArgs;

        public Body(WidgetsArgs widgetsArgs) {
            this.widgetsArgs = widgetsArgs;
        }

        public WidgetsArgs getWidgetsArgs() {
            return this.widgetsArgs;
        }
    }

    public GetUserRequest(String str, Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, BaseRequestWithStore.StoreCredentials storeCredentials, String str2, boolean z, String str3, boolean z2, String str4, SharedPreferences sharedPreferences2, Resources resources, WindowManager windowManager, ConnectivityManager connectivityManager, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, AppCoinsManager appCoinsManager) {
        super(body, AbstractC2229V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.url = str;
        this.httpClient = okHttpClient;
        this.tokenInvalidator = tokenInvalidator;
        this.storeCredentials = storeCredentials;
        this.clientUniqueId = str2;
        this.isGooglePlayServicesAvailable = z;
        this.partnerId = str3;
        this.accountMature = z2;
        this.filters = str4;
        this.sharedPreferences = sharedPreferences2;
        this.resources = resources;
        this.windowManager = windowManager;
        this.connectivityManager = connectivityManager;
        this.versionCodeProvider = adsApplicationVersionCodeProvider;
        this.appCoinsManager = appCoinsManager;
    }

    static /* synthetic */ GetStore lambda$loadDataFromNetwork$0(GetStore getStore, List list) {
        return getStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDataFromNetwork$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7495h(final GetStore getStore) {
        return loadGetStoreWidgets(getStore).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.store.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                GetStore getStore2 = getStore;
                GetUserRequest.lambda$loadDataFromNetwork$0(getStore2, (List) obj);
                return getStore2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadGetStoreWidgets$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7496i(GetStoreWidgets.WSWidget wSWidget) {
        WSWidgetsUtils wSWidgetsUtils = new WSWidgetsUtils();
        BaseRequestWithStore.StoreCredentials storeCredentials = this.storeCredentials;
        String str = this.clientUniqueId;
        boolean z = this.isGooglePlayServicesAvailable;
        String str2 = this.partnerId;
        boolean z2 = this.accountMature;
        BodyInterceptor<BaseBody> bodyInterceptor = this.bodyInterceptor;
        OkHttpClient okHttpClient = this.httpClient;
        Converter.Factory factory = this.converterFactory;
        String str3 = this.filters;
        TokenInvalidator tokenInvalidator = this.tokenInvalidator;
        SharedPreferences sharedPreferences = this.sharedPreferences;
        Resources resources = this.resources;
        WindowManager windowManager = this.windowManager;
        return wSWidgetsUtils.loadWidgetNode(wSWidget, storeCredentials, false, str, z, str2, z2, bodyInterceptor, okHttpClient, factory, str3, tokenInvalidator, sharedPreferences, resources, windowManager, this.connectivityManager, this.versionCodeProvider, this.bypassServerCache, Type.ADS.getPerLineCount(resources, windowManager), Collections.emptyList(), this.appCoinsManager);
    }

    /* renamed from: of */
    public static GetUserRequest m7494of(String str, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager, String str2, boolean z, String str3, boolean z2, String str4, ConnectivityManager connectivityManager, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, AppCoinsManager appCoinsManager) {
        return new GetUserRequest(new V7Url(str).remove("user/get").get(), new Body(WidgetsArgs.createDefault(resources, windowManager)), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, storeCredentials, str2, z, str3, z2, str4, sharedPreferences, resources, windowManager, connectivityManager, adsApplicationVersionCodeProvider, appCoinsManager);
    }

    protected C11234e<List<GetStoreWidgets.WSWidget>> loadGetStoreWidgets(final GetStore getStore) {
        return C11234e.m40020N(getStore.getNodes().getWidgets().getDataList().getList()).m40095j0(Schedulers.m40658io()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.store.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8640f.m7496i((GetStoreWidgets.WSWidget) obj);
            }
        }).m40084Y0().m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.store.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return getStore.getNodes().getWidgets().getDataList().getList();
            }
        }).m40084Y0().m40057E();
    }

    @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7
    public C11234e<GetStore> observe(boolean z, boolean z2) {
        this.bypassServerCache = z2;
        return super.observe(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<GetStore> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        return interfaces.getUser(this.url, (Body) this.body, z).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.store.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8642f.m7495h((GetStore) obj);
            }
        });
    }
}
