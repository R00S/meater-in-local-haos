package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.util.Pair;
import android.view.WindowManager;
import cm.aptoide.p092pt.AppCoinsManager;
import cm.aptoide.p092pt.bonus.BonusAppcModel;
import cm.aptoide.p092pt.dataprovider.exception.AptoideWsV7Exception;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p094v2.GetAdsResponse;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetApp;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetStoreWidgets;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Layout;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListAppCoinsCampaigns;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListApps;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListComments;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListFullReviews;
import cm.aptoide.p092pt.dataprovider.model.p096v7.TimelineStats;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Type;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetHomeMeta;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStoreDisplays;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStoreMeta;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.ListStores;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords.AdsApplicationVersionCodeProvider;
import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords.GetAdsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetAppCoinsCampaignsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.home.ActionItemResponse;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.home.BonusAppcBundle;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.home.EditorialActionItem;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.home.GetActionItemRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetHomeMetaRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetMyStoreListRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetMyStoreMetaRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetStoreDisplaysRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetStoreMetaRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.ListStoresRequest;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p319g.p320a.p321a.p322a.C9059d;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11257f;
import p456rx.schedulers.Schedulers;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class WSWidgetsUtils {
    private static final String USER_DONT_HAVE_STORE_ERROR = "MYSTORE-1";
    private static final String USER_NOT_LOGGED_ERROR = "AUTH-5";

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.WSWidgetsUtils$1 */
    static /* synthetic */ class C22301 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type = iArr;
            try {
                iArr[Type.APPCOINS_FEATURED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.APPS_TOP_GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.APPS_GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.STORES_GROUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.DISPLAYS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.ADS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.APPCOINS_ADS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.HOME_META.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.COMMENTS_GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.REVIEWS_GROUP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.MY_STORES_SUBSCRIBED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.STORES_RECOMMENDED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.MY_STORE_META.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.STORE_META.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.NEW_APP_VERSION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.NEW_APP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.NEWS_ITEM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.IN_GAME_EVENT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.ACTION_ITEM.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.APP_COMING_SOON.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    private TimelineStats createErrorTimelineStatus() {
        TimelineStats timelineStats = new TimelineStats();
        TimelineStats.StatusData statusData = new TimelineStats.StatusData();
        statusData.setFollowers(0L);
        statusData.setFollowing(0L);
        timelineStats.setData(statusData);
        return timelineStats;
    }

    static /* synthetic */ BonusAppcBundle lambda$loadWidgetNode$0(ListApps listApps, BonusAppcModel bonusAppcModel) {
        return new BonusAppcBundle(listApps, bonusAppcModel);
    }

    static /* synthetic */ GetStoreWidgets.WSWidget lambda$loadWidgetNode$12(GetStoreWidgets.WSWidget wSWidget, GetStoreDisplays getStoreDisplays) {
        return wSWidget;
    }

    static /* synthetic */ GetStoreWidgets.WSWidget lambda$loadWidgetNode$15(GetStoreWidgets.WSWidget wSWidget, GetAdsResponse getAdsResponse) {
        return wSWidget;
    }

    static /* synthetic */ GetStoreWidgets.WSWidget lambda$loadWidgetNode$18(GetStoreWidgets.WSWidget wSWidget, ListAppCoinsCampaigns listAppCoinsCampaigns) {
        return wSWidget;
    }

    static /* synthetic */ GetStoreWidgets.WSWidget lambda$loadWidgetNode$21(GetStoreWidgets.WSWidget wSWidget, GetHomeMeta getHomeMeta) {
        return wSWidget;
    }

    static /* synthetic */ GetStoreWidgets.WSWidget lambda$loadWidgetNode$24(GetStoreWidgets.WSWidget wSWidget, ListComments listComments) {
        return wSWidget;
    }

    static /* synthetic */ GetStoreWidgets.WSWidget lambda$loadWidgetNode$27(GetStoreWidgets.WSWidget wSWidget, ListFullReviews listFullReviews) {
        return wSWidget;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadWidgetNode$29, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7471a(GetStoreWidgets.WSWidget wSWidget, Throwable th) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(USER_NOT_LOGGED_ERROR);
        if ((th instanceof AptoideWsV7Exception) && shouldAddObjectView(linkedList, th)) {
            wSWidget.setViewObject(((AptoideWsV7Exception) th).getBaseResponse());
        }
    }

    static /* synthetic */ GetStoreWidgets.WSWidget lambda$loadWidgetNode$3(GetStoreWidgets.WSWidget wSWidget, BonusAppcBundle bonusAppcBundle) {
        return wSWidget;
    }

    static /* synthetic */ GetStoreWidgets.WSWidget lambda$loadWidgetNode$31(GetStoreWidgets.WSWidget wSWidget, ListStores listStores) {
        return wSWidget;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadWidgetNode$32, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ TimelineStats m7472b(Throwable th) {
        return createErrorTimelineStatus();
    }

    static /* synthetic */ GetHomeMeta lambda$loadWidgetNode$33(GetStoreMeta getStoreMeta) {
        GetHomeMeta.Data data = new GetHomeMeta.Data();
        data.setStore(getStoreMeta.getData());
        GetHomeMeta getHomeMeta = new GetHomeMeta();
        getHomeMeta.setData(data);
        return getHomeMeta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadWidgetNode$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7473c(Throwable th) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(USER_NOT_LOGGED_ERROR);
        linkedList.add(USER_DONT_HAVE_STORE_ERROR);
        return shouldAddObjectView(linkedList, th) ? C11234e.m40025S(null) : C11234e.m40017C(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadWidgetNode$35, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ MyStore m7474d(TimelineStats timelineStats, GetHomeMeta getHomeMeta) {
        return timelineStats.getData() == null ? new MyStore(createErrorTimelineStatus(), getHomeMeta) : new MyStore(timelineStats, getHomeMeta);
    }

    static /* synthetic */ GetStoreWidgets.WSWidget lambda$loadWidgetNode$38(GetStoreWidgets.WSWidget wSWidget, MyStore myStore) {
        return wSWidget;
    }

    static /* synthetic */ GetStoreWidgets.WSWidget lambda$loadWidgetNode$41(GetStoreWidgets.WSWidget wSWidget, GetStoreMeta getStoreMeta) {
        return wSWidget;
    }

    static /* synthetic */ GetStoreWidgets.WSWidget lambda$loadWidgetNode$43(GetStoreWidgets.WSWidget wSWidget, AppPromoItem appPromoItem) {
        return wSWidget;
    }

    static /* synthetic */ NewAppCoinsAppPromoItem lambda$loadWidgetNode$44(GetApp getApp, BonusAppcModel bonusAppcModel) {
        return new NewAppCoinsAppPromoItem(getApp, bonusAppcModel);
    }

    static /* synthetic */ GetStoreWidgets.WSWidget lambda$loadWidgetNode$47(GetStoreWidgets.WSWidget wSWidget, NewAppCoinsAppPromoItem newAppCoinsAppPromoItem) {
        return wSWidget;
    }

    static /* synthetic */ EditorialActionItem lambda$loadWidgetNode$48(ActionItemResponse actionItemResponse, BonusAppcModel bonusAppcModel) {
        return new EditorialActionItem(actionItemResponse, bonusAppcModel);
    }

    static /* synthetic */ GetStoreWidgets.WSWidget lambda$loadWidgetNode$52(GetStoreWidgets.WSWidget wSWidget, EditorialActionItem editorialActionItem) {
        return wSWidget;
    }

    static /* synthetic */ GetStoreWidgets.WSWidget lambda$loadWidgetNode$55(GetStoreWidgets.WSWidget wSWidget, ActionItemResponse actionItemResponse) {
        return wSWidget;
    }

    static /* synthetic */ GetStoreWidgets.WSWidget lambda$loadWidgetNode$58(GetStoreWidgets.WSWidget wSWidget, ActionItemResponse actionItemResponse) {
        return wSWidget;
    }

    static /* synthetic */ GetStoreWidgets.WSWidget lambda$loadWidgetNode$6(GetStoreWidgets.WSWidget wSWidget, ListApps listApps) {
        return wSWidget;
    }

    static /* synthetic */ GetStoreWidgets.WSWidget lambda$loadWidgetNode$9(GetStoreWidgets.WSWidget wSWidget, ListStores listStores) {
        return wSWidget;
    }

    private C11234e<ActionItemResponse> loadActionItem(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, boolean z, boolean z2) {
        return GetActionItemRequest.ofAction(str, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z, z2).m40095j0(Schedulers.m40658io());
    }

    private C11234e<BonusAppcModel> loadAppcBonusModel(AppCoinsManager appCoinsManager) {
        return C9059d.m29126d(appCoinsManager.getBonusAppc()).m39915A().m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.l0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        });
    }

    private C11234e<ListApps> loadListApps(String str, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager, boolean z, boolean z2) {
        return ListAppsRequest.ofAction(str, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, resources, windowManager).observe(z, z2);
    }

    public C11234e<GetStoreWidgets.WSWidget> loadWidgetNode(final GetStoreWidgets.WSWidget wSWidget, final BaseRequestWithStore.StoreCredentials storeCredentials, boolean z, String str, boolean z2, String str2, boolean z3, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, String str3, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager, ConnectivityManager connectivityManager, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, boolean z4, int i2, List<String> list, AppCoinsManager appCoinsManager) {
        if (wSWidget.getType() == null) {
            return C11234e.m40016B();
        }
        String strReplace = wSWidget.getView() != null ? AbstractC2229V7.isUrlBaseCache(wSWidget.getView()) ? wSWidget.getView().replace(AbstractC2229V7.getCacheHost(sharedPreferences), HttpUrl.FRAGMENT_ENCODE_SET) : wSWidget.getView().replace(AbstractC2229V7.getHost(sharedPreferences), HttpUrl.FRAGMENT_ENCODE_SET) : null;
        if (wSWidget.getTag().equals("appcoins-iab-featured")) {
            wSWidget.setType(Type.APPCOINS_FEATURED);
        }
        switch (C22301.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[wSWidget.getType().ordinal()]) {
            case 1:
                return C11234e.m40040d1(loadListApps(strReplace, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, resources, windowManager, z, z4), loadAppcBonusModel(appCoinsManager), new InterfaceC11257f() { // from class: cm.aptoide.pt.dataprovider.ws.v7.m
                    @Override // p456rx.p460m.InterfaceC11257f
                    /* renamed from: a */
                    public final Object mo6865a(Object obj, Object obj2) {
                        return WSWidgetsUtils.lambda$loadWidgetNode$0((ListApps) obj, (BonusAppcModel) obj2);
                    }
                }).m40095j0(Schedulers.m40658io()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.g1
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        wSWidget.setViewObject((BonusAppcBundle) obj);
                    }
                }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.x
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return C11234e.m40016B();
                    }
                }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.n
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
                        WSWidgetsUtils.lambda$loadWidgetNode$3(wSWidget2, (BonusAppcBundle) obj);
                        return wSWidget2;
                    }
                });
            case 2:
            case 3:
                return loadListApps(strReplace, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, resources, windowManager, z, z4).m40095j0(Schedulers.m40658io()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.v
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        wSWidget.setViewObject((ListApps) obj);
                    }
                }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.w
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return C11234e.m40016B();
                    }
                }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.l1
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
                        WSWidgetsUtils.lambda$loadWidgetNode$6(wSWidget2, (ListApps) obj);
                        return wSWidget2;
                    }
                });
            case 4:
                return ListStoresRequest.ofAction(strReplace, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z, z4).m40095j0(Schedulers.m40658io()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.j0
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        wSWidget.setViewObject((ListStores) obj);
                    }
                }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.j
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return C11234e.m40016B();
                    }
                }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.k1
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
                        WSWidgetsUtils.lambda$loadWidgetNode$9(wSWidget2, (ListStores) obj);
                        return wSWidget2;
                    }
                });
            case 5:
                return GetStoreDisplaysRequest.ofAction(strReplace, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z, z4).m40095j0(Schedulers.m40658io()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.f0
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        wSWidget.setViewObject((GetStoreDisplays) obj);
                    }
                }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.x0
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return C11234e.m40016B();
                    }
                }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.b0
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
                        WSWidgetsUtils.lambda$loadWidgetNode$12(wSWidget2, (GetStoreDisplays) obj);
                        return wSWidget2;
                    }
                });
            case 6:
                return GetAdsRequest.ofHomepage(str, z2, str2, z3, okHttpClient, factory, str3, sharedPreferences, resources, connectivityManager, adsApplicationVersionCodeProvider, i2).observe(z).m40095j0(Schedulers.m40658io()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.h0
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        wSWidget.setViewObject((GetAdsResponse) obj);
                    }
                }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.p
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return C11234e.m40016B();
                    }
                }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.p0
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
                        WSWidgetsUtils.lambda$loadWidgetNode$15(wSWidget2, (GetAdsResponse) obj);
                        return wSWidget2;
                    }
                });
            case 7:
                return new GetAppCoinsCampaignsRequest(new GetAppCoinsCampaignsRequest.Body(0, i2), okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences).observe(z, z4).m40095j0(Schedulers.m40658io()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.s
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        wSWidget.setViewObject((ListAppCoinsCampaigns) obj);
                    }
                }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.r
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return C11234e.m40016B();
                    }
                }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.n1
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
                        WSWidgetsUtils.lambda$loadWidgetNode$18(wSWidget2, (ListAppCoinsCampaigns) obj);
                        return wSWidget2;
                    }
                });
            case 8:
                return GetHomeMetaRequest.ofAction(strReplace, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z, z4).m40095j0(Schedulers.m40658io()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.a0
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        wSWidget.setViewObject((GetHomeMeta) obj);
                    }
                }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.t0
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return C11234e.m40016B();
                    }
                }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.i1
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
                        WSWidgetsUtils.lambda$loadWidgetNode$21(wSWidget2, (GetHomeMeta) obj);
                        return wSWidget2;
                    }
                });
            case 9:
                return ListCommentsRequest.ofStoreAction(strReplace, z, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z, z4).m40095j0(Schedulers.m40658io()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.h1
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        wSWidget.setViewObject(new Pair((ListComments) obj, storeCredentials));
                    }
                }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.o
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return C11234e.m40016B();
                    }
                }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.i0
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
                        WSWidgetsUtils.lambda$loadWidgetNode$24(wSWidget2, (ListComments) obj);
                        return wSWidget2;
                    }
                });
            case 10:
                return ListFullReviewsRequest.ofAction(strReplace, z, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z, z4).m40095j0(Schedulers.m40658io()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.v0
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        wSWidget.setViewObject((ListFullReviews) obj);
                    }
                }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.f1
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return C11234e.m40016B();
                    }
                }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.y
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
                        WSWidgetsUtils.lambda$loadWidgetNode$27(wSWidget2, (ListFullReviews) obj);
                        return wSWidget2;
                    }
                });
            case 11:
            case 12:
                return GetMyStoreListRequest.m7487of(strReplace, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, resources, windowManager).observe(z, z4).m40095j0(Schedulers.m40658io()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.j1
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        wSWidget.setViewObject((ListStores) obj);
                    }
                }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.o0
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        this.f8622f.m7471a(wSWidget, (Throwable) obj);
                    }
                }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.s0
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return C11234e.m40016B();
                    }
                }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.a1
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
                        WSWidgetsUtils.lambda$loadWidgetNode$31(wSWidget2, (ListStores) obj);
                        return wSWidget2;
                    }
                });
            case 13:
                return C11234e.m40040d1(GetTimelineStatsRequest.m7446of(bodyInterceptor, null, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z, z4).m40105p0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.d0
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return this.f8573f.m7472b((Throwable) obj);
                    }
                }), GetMyStoreMetaRequest.m7489of(bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z, z4).m40095j0(Schedulers.m40658io()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.h
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return WSWidgetsUtils.lambda$loadWidgetNode$33((GetStoreMeta) obj);
                    }
                }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.m0
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return this.f8616f.m7473c((Throwable) obj);
                    }
                }), new InterfaceC11257f() { // from class: cm.aptoide.pt.dataprovider.ws.v7.q
                    @Override // p456rx.p460m.InterfaceC11257f
                    /* renamed from: a */
                    public final Object mo6865a(Object obj, Object obj2) {
                        return this.f8627f.m7474d((TimelineStats) obj, (GetHomeMeta) obj2);
                    }
                }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.u0
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        wSWidget.setViewObject((MyStore) obj);
                    }
                }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.z
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return C11234e.m40016B();
                    }
                }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.g0
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
                        WSWidgetsUtils.lambda$loadWidgetNode$38(wSWidget2, (MyStore) obj);
                        return wSWidget2;
                    }
                });
            case 14:
                return GetStoreMetaRequest.ofAction(strReplace, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z, z4).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.c1
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        wSWidget.setViewObject((GetStoreMeta) obj);
                    }
                }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.w0
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return C11234e.m40016B();
                    }
                }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.k0
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
                        WSWidgetsUtils.lambda$loadWidgetNode$41(wSWidget2, (GetStoreMeta) obj);
                        return wSWidget2;
                    }
                });
            case 15:
                return GetAppMetaRequest.ofAction(strReplace, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z, z4).m40095j0(Schedulers.m40658io()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.b
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return new AppPromoItem((GetApp) obj);
                    }
                }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.a
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        wSWidget.setViewObject((AppPromoItem) obj);
                    }
                }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.i
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return C11234e.m40016B();
                    }
                }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.e0
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
                        WSWidgetsUtils.lambda$loadWidgetNode$43(wSWidget2, (AppPromoItem) obj);
                        return wSWidget2;
                    }
                });
            case 16:
                return C11234e.m40040d1(GetAppMetaRequest.ofAction(strReplace, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z, z4), loadAppcBonusModel(appCoinsManager), new InterfaceC11257f() { // from class: cm.aptoide.pt.dataprovider.ws.v7.t
                    @Override // p456rx.p460m.InterfaceC11257f
                    /* renamed from: a */
                    public final Object mo6865a(Object obj, Object obj2) {
                        return WSWidgetsUtils.lambda$loadWidgetNode$44((GetApp) obj, (BonusAppcModel) obj2);
                    }
                }).m40095j0(Schedulers.m40658io()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.l
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        wSWidget.setViewObject((NewAppCoinsAppPromoItem) obj);
                    }
                }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.z0
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return C11234e.m40016B();
                    }
                }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.c0
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
                        WSWidgetsUtils.lambda$loadWidgetNode$47(wSWidget2, (NewAppCoinsAppPromoItem) obj);
                        return wSWidget2;
                    }
                });
            case 17:
            case 18:
            case 19:
                return (wSWidget.getData().getLayout().equals(Layout.CURATION_1) || wSWidget.getData().getLayout().equals(Layout.PROMO_GRAPHIC)) ? C11234e.m40040d1(loadActionItem(strReplace, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, z, z4), loadAppcBonusModel(appCoinsManager), new InterfaceC11257f() { // from class: cm.aptoide.pt.dataprovider.ws.v7.u
                    @Override // p456rx.p460m.InterfaceC11257f
                    /* renamed from: a */
                    public final Object mo6865a(Object obj, Object obj2) {
                        return WSWidgetsUtils.lambda$loadWidgetNode$48((ActionItemResponse) obj, (BonusAppcModel) obj2);
                    }
                }).m40095j0(Schedulers.m40658io()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.d1
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        wSWidget.setViewObject((EditorialActionItem) obj);
                    }
                }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.k
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return C11234e.m40016B();
                    }
                }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.r0
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        ((Throwable) obj).printStackTrace();
                    }
                }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.e1
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
                        WSWidgetsUtils.lambda$loadWidgetNode$52(wSWidget2, (EditorialActionItem) obj);
                        return wSWidget2;
                    }
                }) : loadActionItem(strReplace, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, z, z4).m40095j0(Schedulers.m40658io()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.n0
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        wSWidget.setViewObject((ActionItemResponse) obj);
                    }
                }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.b1
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return C11234e.m40016B();
                    }
                }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.q0
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
                        WSWidgetsUtils.lambda$loadWidgetNode$55(wSWidget2, (ActionItemResponse) obj);
                        return wSWidget2;
                    }
                });
            case 20:
                return loadActionItem(strReplace, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, z, z4).m40095j0(Schedulers.m40658io()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.ws.v7.y0
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        wSWidget.setViewObject((ActionItemResponse) obj);
                    }
                }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.o1
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return C11234e.m40016B();
                    }
                }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.ws.v7.m1
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
                        WSWidgetsUtils.lambda$loadWidgetNode$58(wSWidget2, (ActionItemResponse) obj);
                        return wSWidget2;
                    }
                });
            default:
                return C11234e.m40016B();
        }
    }

    @Deprecated
    public boolean shouldAddObjectView(List<String> list, Throwable th) {
        if (!(th instanceof AptoideWsV7Exception)) {
            return false;
        }
        Iterator<BaseV7Response.Error> it = ((AptoideWsV7Exception) th).getBaseResponse().getErrors().iterator();
        while (it.hasNext()) {
            if (list.contains(it.next().getCode())) {
                return true;
            }
        }
        return false;
    }
}
