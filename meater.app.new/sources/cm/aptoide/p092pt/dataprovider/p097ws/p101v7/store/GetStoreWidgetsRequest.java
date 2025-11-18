package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.view.WindowManager;
import cm.aptoide.p092pt.AppCoinsManager;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetStoreWidgets;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Type;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords.AdsApplicationVersionCodeProvider;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBodyWithStore;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless;
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
public class GetStoreWidgetsRequest extends BaseRequestWithStore<GetStoreWidgets, Body> {
    private final boolean accountMature;
    private final AppCoinsManager appCoinsManager;
    private boolean bypassServerCache;
    private final String clientUniqueId;
    private final ConnectivityManager connectivityManager;
    private final String filters;
    private final boolean isGooglePlayServicesAvailable;
    private final String partnerId;
    private final Resources resources;
    private final SharedPreferences sharedPreferences;
    private final BaseRequestWithStore.StoreCredentials storeCredentials;
    private final String url;
    private final AdsApplicationVersionCodeProvider versionCodeProvider;
    private final WSWidgetsUtils widgetsUtils;
    private final WindowManager windowManager;

    public GetStoreWidgetsRequest(String str, Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, BaseRequestWithStore.StoreCredentials storeCredentials, String str2, boolean z, String str3, boolean z2, String str4, Resources resources, WindowManager windowManager, ConnectivityManager connectivityManager, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, WSWidgetsUtils wSWidgetsUtils, AppCoinsManager appCoinsManager) {
        super(body, okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences);
        this.url = str;
        this.storeCredentials = storeCredentials;
        this.clientUniqueId = str2;
        this.isGooglePlayServicesAvailable = z;
        this.partnerId = str3;
        this.accountMature = z2;
        this.filters = str4;
        this.resources = resources;
        this.windowManager = windowManager;
        this.connectivityManager = connectivityManager;
        this.versionCodeProvider = adsApplicationVersionCodeProvider;
        this.sharedPreferences = sharedPreferences;
        this.widgetsUtils = wSWidgetsUtils;
        this.appCoinsManager = appCoinsManager;
    }

    static /* synthetic */ GetStoreWidgets lambda$loadDataFromNetwork$0(GetStoreWidgets getStoreWidgets, List list) {
        return getStoreWidgets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDataFromNetwork$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7492h(boolean z, final GetStoreWidgets getStoreWidgets) {
        return loadGetStoreWidgets(getStoreWidgets, z).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.store.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                GetStoreWidgets getStoreWidgets2 = getStoreWidgets;
                GetStoreWidgetsRequest.lambda$loadDataFromNetwork$0(getStoreWidgets2, (List) obj);
                return getStoreWidgets2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadGetStoreWidgets$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7493i(boolean z, GetStoreWidgets.WSWidget wSWidget) {
        WSWidgetsUtils wSWidgetsUtils = this.widgetsUtils;
        BaseRequestWithStore.StoreCredentials storeCredentials = this.storeCredentials;
        String str = this.clientUniqueId;
        boolean z2 = this.isGooglePlayServicesAvailable;
        String str2 = this.partnerId;
        boolean z3 = this.accountMature;
        BodyInterceptor<BaseBody> bodyInterceptor = this.bodyInterceptor;
        OkHttpClient httpClient = getHttpClient();
        Converter.Factory factory = this.converterFactory;
        String str3 = this.filters;
        TokenInvalidator tokenInvalidator = getTokenInvalidator();
        SharedPreferences sharedPreferences = this.sharedPreferences;
        Resources resources = this.resources;
        WindowManager windowManager = this.windowManager;
        return wSWidgetsUtils.loadWidgetNode(wSWidget, storeCredentials, z, str, z2, str2, z3, bodyInterceptor, httpClient, factory, str3, tokenInvalidator, sharedPreferences, resources, windowManager, this.connectivityManager, this.versionCodeProvider, this.bypassServerCache, Type.ADS.getPerLineCount(resources, windowManager), Collections.emptyList(), this.appCoinsManager);
    }

    private C11234e<List<GetStoreWidgets.WSWidget>> loadGetStoreWidgets(final GetStoreWidgets getStoreWidgets, final boolean z) {
        return C11234e.m40020N(getStoreWidgets.getDataList().getList()).m40095j0(Schedulers.m40658io()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.store.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8637f.m7493i(z, (GetStoreWidgets.WSWidget) obj);
            }
        }).m40084Y0().m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.store.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return getStoreWidgets.getDataList().getList();
            }
        }).m40084Y0().m40057E();
    }

    public static GetStoreWidgetsRequest ofAction(String str, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager, String str2, boolean z, String str3, boolean z2, String str4, ConnectivityManager connectivityManager, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, AppCoinsManager appCoinsManager) {
        return new GetStoreWidgetsRequest(new V7Url(str).remove("getStoreWidgets").get(), new Body(storeCredentials, WidgetsArgs.createDefault(resources, windowManager)), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, storeCredentials, str2, z, str3, z2, str4, resources, windowManager, connectivityManager, adsApplicationVersionCodeProvider, new WSWidgetsUtils(), appCoinsManager);
    }

    public String getUrl() {
        return this.url;
    }

    @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7
    public C11234e<GetStoreWidgets> observe(boolean z, boolean z2) {
        this.bypassServerCache = z2;
        return super.observe(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<GetStoreWidgets> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, final boolean z) {
        return interfaces.getStoreWidgets(this.url, (Body) this.body, z).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.store.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8635f.m7492h(z, (GetStoreWidgets) obj);
            }
        });
    }

    public static class Body extends BaseBodyWithStore implements Endless {
        private StoreContext context;
        private Integer limit;
        private int offset;
        private String storeName;
        private WidgetsArgs widgetsArgs;

        public Body(BaseRequestWithStore.StoreCredentials storeCredentials, WidgetsArgs widgetsArgs) {
            super(storeCredentials);
            this.widgetsArgs = widgetsArgs;
            this.limit = 5;
        }

        public StoreContext getContext() {
            return this.context;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public Integer getLimit() {
            return this.limit;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public int getOffset() {
            return this.offset;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBodyWithStore
        public String getStoreName() {
            return this.storeName;
        }

        public WidgetsArgs getWidgetsArgs() {
            return this.widgetsArgs;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public void setOffset(int i2) {
            this.offset = i2;
        }

        public Body(BaseRequestWithStore.StoreCredentials storeCredentials, WidgetsArgs widgetsArgs, int i2) {
            super(storeCredentials);
            this.widgetsArgs = widgetsArgs;
            this.limit = Integer.valueOf(i2);
        }

        public Body(BaseRequestWithStore.StoreCredentials storeCredentials, WidgetsArgs widgetsArgs, StoreContext storeContext, String str) {
            super(storeCredentials);
            this.widgetsArgs = widgetsArgs;
            this.context = storeContext;
            this.storeName = str;
        }
    }
}
