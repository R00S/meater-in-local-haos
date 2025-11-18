package cm.aptoide.p092pt.view.recycler.displayable;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.MyStoreManager;
import cm.aptoide.p092pt.account.view.LoginDisplayable;
import cm.aptoide.p092pt.account.view.user.CreateStoreDisplayable;
import cm.aptoide.p092pt.ads.MinimalAdMapper;
import cm.aptoide.p092pt.app.view.GridAppDisplayable;
import cm.aptoide.p092pt.app.view.GridAppListDisplayable;
import cm.aptoide.p092pt.database.room.RoomStore;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p094v2.GetAdsResponse;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetStoreWidgets;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Layout;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListApps;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListComments;
import cm.aptoide.p092pt.dataprovider.model.p096v7.TimelineStats;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Type;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetHomeMeta;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStoreDisplays;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStoreMeta;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.ListStores;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.MyStore;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import cm.aptoide.p092pt.store.StoreAnalytics;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.store.view.BadgeDialogFactory;
import cm.aptoide.p092pt.store.view.GridDisplayDisplayable;
import cm.aptoide.p092pt.store.view.GridStoreDisplayable;
import cm.aptoide.p092pt.store.view.GridStoreMetaDisplayable;
import cm.aptoide.p092pt.store.view.StoreAddCommentDisplayable;
import cm.aptoide.p092pt.store.view.StoreGridHeaderDisplayable;
import cm.aptoide.p092pt.store.view.StoreLatestCommentsDisplayable;
import cm.aptoide.p092pt.store.view.StoreTabNavigator;
import cm.aptoide.p092pt.store.view.featured.AppBrickDisplayable;
import cm.aptoide.p092pt.store.view.p104my.StoreDisplayable;
import cm.aptoide.p092pt.store.view.recommended.RecommendedStoreDisplayable;
import cm.aptoide.p092pt.themes.StoreTheme;
import cm.aptoide.p092pt.themes.ThemeManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class DisplayablesFactory {

    /* renamed from: cm.aptoide.pt.view.recycler.displayable.DisplayablesFactory$1 */
    static /* synthetic */ class C48481 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type = iArr;
            try {
                iArr[Type.APPS_GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.MY_STORES_SUBSCRIBED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.STORES_GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.DISPLAYS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.ADS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.HOME_META.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.MY_STORE_META.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.STORE_META.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.STORES_RECOMMENDED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.COMMENTS_GROUP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private static List<Displayable> createCommentsGroup(String str, GetStoreWidgets.WSWidget wSWidget, StoreTheme storeTheme, String str2, StoreContext storeContext, StoreTabNavigator storeTabNavigator, NavigationTracker navigationTracker, ThemeManager themeManager) {
        LinkedList linkedList = new LinkedList();
        Pair pair = (Pair) wSWidget.getViewObject();
        ListComments listComments = (ListComments) pair.first;
        linkedList.add(new StoreGridHeaderDisplayable(str, wSWidget, storeTheme.getThemeName(), str2, storeContext, storeTabNavigator, navigationTracker, themeManager.getAttributeForTheme(storeTheme.getThemeName(), C1146R.attr.themeTextColor).data));
        if (listComments == null || listComments.getDataList() == null || listComments.getDataList().getList().size() <= 0) {
            linkedList.add(new StoreAddCommentDisplayable(((BaseRequestWithStore.StoreCredentials) pair.second).getId().longValue(), ((BaseRequestWithStore.StoreCredentials) pair.second).getName(), storeTheme, themeManager.getAttributeForTheme(storeTheme.getThemeName(), C1146R.attr.raisedButtonSecondaryBackground).resourceId));
        } else {
            linkedList.add(new StoreLatestCommentsDisplayable(((BaseRequestWithStore.StoreCredentials) pair.second).getId().longValue(), ((BaseRequestWithStore.StoreCredentials) pair.second).getName(), listComments.getDataList().getList(), themeManager));
        }
        return linkedList;
    }

    private static List<Displayable> createMyStoreDisplayables(Object obj, StoreAnalytics storeAnalytics, StoreContext storeContext, AptoideAccountManager aptoideAccountManager, Context context, String str, ThemeManager themeManager) {
        LinkedList linkedList = new LinkedList();
        if (obj instanceof MyStore) {
            MyStore myStore = (MyStore) obj;
            if (!myStore.isCreateStore()) {
                TimelineStats.StatusData data = myStore.getTimelineStats().getData();
                linkedList.add(new StoreDisplayable(myStore.getGetHomeMeta().getData().getStore(), storeContext, data.getFollowing(), data.getFollowers(), C1146R.string.storetab_short_followings, C1146R.string.storetab_short_followers, true, getStoreDescriptionMessage(context, myStore.getGetHomeMeta().getData().getStore()), themeManager.getAttributeForTheme(str, C1146R.attr.themeTextColor).data));
            } else if (!aptoideAccountManager.isLoggedIn()) {
                linkedList.add(new LoginDisplayable());
            } else if (MyStoreManager.shouldShowCreateStore()) {
                linkedList.add(new CreateStoreDisplayable(storeAnalytics, myStore.getTimelineStats(), themeManager.getAttributeForTheme(C1146R.attr.themeTextColor).data));
            }
        }
        return linkedList;
    }

    private static Displayable createRecommendedStores(String str, GetStoreWidgets.WSWidget wSWidget, String str2, RoomStoreRepository roomStoreRepository, StoreCredentialsProvider storeCredentialsProvider, StoreContext storeContext, Context context, AptoideAccountManager aptoideAccountManager, StoreUtilsProxy storeUtilsProxy, WindowManager windowManager, Resources resources, StoreTabNavigator storeTabNavigator, NavigationTracker navigationTracker, ThemeManager themeManager) {
        ListStores listStores = (ListStores) wSWidget.getViewObject();
        if (listStores == null) {
            return new EmptyDisplayable();
        }
        List<Store> list = listStores.getDataList().getList();
        LinkedList linkedList = new LinkedList();
        linkedList.add(new StoreGridHeaderDisplayable(str, wSWidget, str2, wSWidget.getTag(), storeContext, storeTabNavigator, navigationTracker, themeManager.getAttributeForTheme(str2, C1146R.attr.themeTextColor).data));
        for (Store store : list) {
            if (wSWidget.getData().getLayout() == Layout.LIST) {
                linkedList.add(new RecommendedStoreDisplayable(store, roomStoreRepository, aptoideAccountManager, storeUtilsProxy, storeCredentialsProvider));
            } else {
                linkedList.add(new GridStoreDisplayable(store));
            }
        }
        return new DisplayableGroup(linkedList, windowManager, resources);
    }

    private static List<Displayable> createStoreDisplayables(Object obj, StoreContext storeContext, String str, ThemeManager themeManager) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof GetStoreMeta) {
            Store data = ((GetStoreMeta) obj).getData();
            arrayList.add(new StoreDisplayable(data, storeContext, data.getStats().getApps(), data.getStats().getDownloads(), C1146R.string.storehometab_short_apps, C1146R.string.storehometab_short_downloads, false, data.getAppearance().getDescription(), themeManager.getAttributeForTheme(str, C1146R.attr.themeTextColor).data));
        }
        return arrayList;
    }

    private static List<Displayable> getAds(GetStoreWidgets.WSWidget wSWidget, MinimalAdMapper minimalAdMapper, NavigationTracker navigationTracker) {
        GetAdsResponse getAdsResponse = (GetAdsResponse) wSWidget.getViewObject();
        if (getAdsResponse == null || getAdsResponse.getAds() == null || getAdsResponse.getAds().size() <= 0) {
            return Collections.emptyList();
        }
        List<GetAdsResponse.C2220Ad> ads = getAdsResponse.getAds();
        ArrayList arrayList = new ArrayList(ads.size());
        Iterator<GetAdsResponse.C2220Ad> it = ads.iterator();
        while (it.hasNext()) {
            arrayList.add(new GridAdDisplayable(minimalAdMapper.map(it.next()), wSWidget.getTag(), navigationTracker));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    private static Displayable getApps(String str, GetStoreWidgets.WSWidget wSWidget, String str2, StoreContext storeContext, Resources resources, WindowManager windowManager, StoreTabNavigator storeTabNavigator, NavigationTracker navigationTracker, ThemeManager themeManager) throws Resources.NotFoundException {
        boolean z;
        ListApps listApps = (ListApps) wSWidget.getViewObject();
        if (listApps == null) {
            return new EmptyDisplayable();
        }
        List<App> list = listApps.getDataList().getList();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<App> it = list.iterator();
        while (it.hasNext()) {
            it.next().getStore().setAppearance(new Store.Appearance(str2, null));
        }
        if (Layout.BRICK.equals(wSWidget.getData().getLayout())) {
            if (list.size() > 0) {
                boolean z2 = resources.getBoolean(C1146R.bool.use_big_app_brick);
                int iMin = Math.min(resources.getInteger(C1146R.integer.nr_small_app_bricks), list.size());
                if (list.size() == 1) {
                    z = true;
                } else {
                    z = z2;
                    if (list.size() == 2) {
                        z = false;
                    }
                }
                if (z) {
                    arrayList.add(new AppBrickDisplayable(list.get(0), wSWidget.getTag(), navigationTracker).setFullRow());
                    iMin++;
                }
                if (list.size() > 1) {
                    for (?? r0 = z; r0 < iMin; r0++) {
                        arrayList.add(new AppBrickDisplayable(list.get(r0), wSWidget.getTag(), navigationTracker));
                    }
                }
            }
        } else if (Layout.LIST.equals(wSWidget.getData().getLayout())) {
            if (list.size() > 0) {
                arrayList.add(new StoreGridHeaderDisplayable(str, wSWidget, storeTabNavigator, navigationTracker, themeManager.getAttributeForTheme(str2, C1146R.attr.themeTextColor).data));
            }
            Iterator<App> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new GridAppListDisplayable(it2.next(), wSWidget.getTag()));
            }
        } else {
            if (list.size() > 0) {
                arrayList.add(new StoreGridHeaderDisplayable(str, wSWidget, str2, wSWidget.getTag(), storeContext, storeTabNavigator, navigationTracker, themeManager.getAttributeForTheme(str2, C1146R.attr.themeTextColor).data));
            }
            Iterator<App> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(new GridAppDisplayable(it3.next(), wSWidget.getTag(), navigationTracker, storeContext));
            }
        }
        return new DisplayableGroup(arrayList, windowManager, resources);
    }

    private static Displayable getDisplays(GetStoreWidgets.WSWidget wSWidget, String str, StoreContext storeContext, WindowManager windowManager, Resources resources, AptoideInstalledAppsRepository aptoideInstalledAppsRepository) {
        GetStoreDisplays getStoreDisplays = (GetStoreDisplays) wSWidget.getViewObject();
        if (getStoreDisplays == null) {
            return new EmptyDisplayable();
        }
        List<GetStoreDisplays.EventImage> list = getStoreDisplays.getList();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<GetStoreDisplays.EventImage> it = list.iterator();
        while (it.hasNext()) {
            GridDisplayDisplayable gridDisplayDisplayable = new GridDisplayDisplayable(it.next(), str, wSWidget.getTag(), storeContext, aptoideInstalledAppsRepository);
            Event.Name name = gridDisplayDisplayable.getPojo().getEvent().getName();
            if (Event.Name.facebook.equals(name) || Event.Name.twitch.equals(name) || Event.Name.youtube.equals(name)) {
                gridDisplayDisplayable.setFullRow();
            }
            arrayList.add(gridDisplayDisplayable);
        }
        return new DisplayableGroup(arrayList, windowManager, resources);
    }

    private static C11234e<Displayable> getMyStores(final String str, final GetStoreWidgets.WSWidget wSWidget, RoomStoreRepository roomStoreRepository, final String str2, final StoreContext storeContext, final WindowManager windowManager, final Resources resources, Context context, final StoreAnalytics storeAnalytics, final StoreTabNavigator storeTabNavigator, final NavigationTracker navigationTracker, final ThemeManager themeManager) {
        return loadLocalSubscribedStores(roomStoreRepository).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.recycler.displayable.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DisplayablesFactory.lambda$getMyStores$1(wSWidget, storeAnalytics, str, str2, storeContext, storeTabNavigator, navigationTracker, themeManager, windowManager, resources, (List) obj);
            }
        });
    }

    private static String getStoreDescriptionMessage(Context context, Store store) {
        return TextUtils.isEmpty(store.getAppearance().getDescription()) ? context.getString(C1146R.string.create_store_displayable_empty_description_message) : store.getAppearance().getDescription();
    }

    private static Displayable getStores(String str, GetStoreWidgets.WSWidget wSWidget, String str2, StoreContext storeContext, WindowManager windowManager, Resources resources, Context context, StoreAnalytics storeAnalytics, StoreTabNavigator storeTabNavigator, NavigationTracker navigationTracker, ThemeManager themeManager) {
        ListStores listStores = (ListStores) wSWidget.getViewObject();
        if (listStores == null) {
            return new EmptyDisplayable();
        }
        List<Store> list = listStores.getDataList().getList();
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add(new StoreGridHeaderDisplayable(str, wSWidget, str2, wSWidget.getTag(), storeContext, storeTabNavigator, navigationTracker, themeManager.getAttributeForTheme(str2, C1146R.attr.themeTextColor).data));
        Iterator<Store> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new GridStoreDisplayable(it.next(), "Home", storeAnalytics));
        }
        return new DisplayableGroup(arrayList, windowManager, resources);
    }

    static /* synthetic */ Displayable lambda$getMyStores$1(GetStoreWidgets.WSWidget wSWidget, StoreAnalytics storeAnalytics, String str, String str2, StoreContext storeContext, StoreTabNavigator storeTabNavigator, NavigationTracker navigationTracker, ThemeManager themeManager, WindowManager windowManager, Resources resources, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        if (wSWidget.getViewObject() instanceof ListStores) {
            ListStores listStores = (ListStores) wSWidget.getViewObject();
            list.addAll(listStores.getDataList().getList());
            size = listStores.getDataList().getLimit().intValue() > list.size() ? list.size() : listStores.getDataList().getLimit().intValue();
        }
        Collections.sort(list, new Comparator() { // from class: cm.aptoide.pt.view.recycler.displayable.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Store) obj).getName().compareTo(((Store) obj2).getName());
            }
        });
        for (int i2 = 0; i2 < list.size() && arrayList.size() < size; i2++) {
            if (i2 == 0 || ((Store) list.get(i2 - 1)).getId() != ((Store) list.get(i2)).getId()) {
                arrayList.add(new GridStoreDisplayable((Store) list.get(i2), "Open a Followed Store", storeAnalytics));
            }
        }
        if (arrayList.size() > 0) {
            StoreGridHeaderDisplayable storeGridHeaderDisplayable = new StoreGridHeaderDisplayable(str, wSWidget, str2, wSWidget.getTag(), storeContext, storeTabNavigator, navigationTracker, themeManager.getAttributeForTheme(str2, C1146R.attr.themeTextColor).data);
            if (list.size() <= size) {
                storeGridHeaderDisplayable.getModel().setMoreVisible(false);
            }
            arrayList.add(0, storeGridHeaderDisplayable);
        }
        return new DisplayableGroup(arrayList, windowManager, resources);
    }

    static /* synthetic */ Store lambda$loadLocalSubscribedStores$2(RoomStore roomStore) {
        Store store = new Store();
        store.setName(roomStore.getStoreName());
        store.setId(roomStore.getStoreId());
        store.setAvatar(roomStore.getIconPath());
        Store.Appearance appearance = new Store.Appearance();
        appearance.setTheme(roomStore.getTheme());
        store.setAppearance(appearance);
        return store;
    }

    public static C11234e<List<Store>> loadLocalSubscribedStores(RoomStoreRepository roomStoreRepository) {
        return roomStoreRepository.getAll().m40057E().m40095j0(Schedulers.computation()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.recycler.displayable.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return C11234e.m40020N((List) obj).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.recycler.displayable.b
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj2) {
                        return DisplayablesFactory.lambda$loadLocalSubscribedStores$2((RoomStore) obj2);
                    }
                }).m40084Y0();
            }
        });
    }

    public static C11234e<Displayable> parse(String str, GetStoreWidgets.WSWidget wSWidget, String str2, RoomStoreRepository roomStoreRepository, StoreCredentialsProvider storeCredentialsProvider, StoreContext storeContext, Context context, AptoideAccountManager aptoideAccountManager, StoreUtilsProxy storeUtilsProxy, WindowManager windowManager, Resources resources, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, StoreAnalytics storeAnalytics, StoreTabNavigator storeTabNavigator, NavigationTracker navigationTracker, BadgeDialogFactory badgeDialogFactory, FragmentNavigator fragmentNavigator, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, ThemeManager themeManager) {
        LinkedList linkedList = new LinkedList();
        if (wSWidget.getType() != null && wSWidget.getViewObject() != null) {
            switch (C48481.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[wSWidget.getType().ordinal()]) {
                case 1:
                    return C11234e.m40025S(getApps(str, wSWidget, str2, storeContext, context.getApplicationContext().getResources(), windowManager, storeTabNavigator, navigationTracker, themeManager));
                case 2:
                    return getMyStores(str, wSWidget, roomStoreRepository, str2, storeContext, windowManager, resources, context, storeAnalytics, storeTabNavigator, navigationTracker, themeManager);
                case 3:
                    return C11234e.m40025S(getStores(str, wSWidget, str2, storeContext, windowManager, resources, context, storeAnalytics, storeTabNavigator, navigationTracker, themeManager));
                case 4:
                    return C11234e.m40025S(getDisplays(wSWidget, str2, storeContext, windowManager, resources, aptoideInstalledAppsRepository));
                case 5:
                    List<Displayable> ads = getAds(wSWidget, new MinimalAdMapper(), navigationTracker);
                    if (ads.size() <= 0) {
                        return C11234e.m40016B();
                    }
                    DisplayableGroup displayableGroup = new DisplayableGroup(ads, windowManager, resources);
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.add(new GetStoreWidgets.WSWidget.Action().setEvent(new Event().setName(Event.Name.getAds)));
                    wSWidget.setActions(linkedList2);
                    linkedList.add(new StoreGridHeaderDisplayable(str, wSWidget, null, wSWidget.getTag(), StoreContext.meta, storeTabNavigator, navigationTracker, themeManager.getAttributeForTheme(str2, C1146R.attr.themeTextColor).data));
                    linkedList.add(displayableGroup);
                    return C11234e.m40020N(linkedList);
                case 6:
                    return C11234e.m40025S(new GridStoreMetaDisplayable((GetHomeMeta) wSWidget.getViewObject(), storeCredentialsProvider, storeAnalytics, badgeDialogFactory, fragmentNavigator, roomStoreRepository, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, themeManager, storeUtilsProxy, aptoideAccountManager));
                case 7:
                    return C11234e.m40020N(createMyStoreDisplayables(wSWidget.getViewObject(), storeAnalytics, storeContext, aptoideAccountManager, context, str2, themeManager));
                case 8:
                    return C11234e.m40020N(createStoreDisplayables(wSWidget.getViewObject(), storeContext, str2, themeManager));
                case 9:
                    return C11234e.m40025S(createRecommendedStores(str, wSWidget, str2, roomStoreRepository, storeCredentialsProvider, storeContext, context, aptoideAccountManager, storeUtilsProxy, windowManager, resources, storeTabNavigator, navigationTracker, themeManager));
                case 10:
                    return C11234e.m40020N(createCommentsGroup(str, wSWidget, themeManager.getStoreTheme(str2), wSWidget.getTag(), storeContext, storeTabNavigator, navigationTracker, themeManager));
            }
        }
        return C11234e.m40016B();
    }
}
