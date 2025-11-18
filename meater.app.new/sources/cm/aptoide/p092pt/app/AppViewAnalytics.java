package cm.aptoide.p092pt.app;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.AdultContentAnalytics;
import cm.aptoide.p092pt.ads.data.ApplicationAd;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.app.view.AppViewSimilarAppsAdapter;
import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.InstallType;
import cm.aptoide.p092pt.install.InstallAnalytics;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.store.StoreAnalytics;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AppViewAnalytics {
    private static final String ACTION = "Action";
    public static final String ADS_BLOCK_BY_OFFER = "Ads_Block_By_Offer";
    public static final String APPC_SIMILAR_APP_INTERACT = "Appc_Similar_App_Interact";
    private static final String APPLICATION_NAME = "Application Name";
    private static final String APPLICATION_PUBLISHER = "Application Publisher";
    private static final String APP_BUNDLE = "app_bundle";
    private static final String APP_SHORTCUT = "App_Shortcut";
    public static final String APP_VIEW_INTERACT = "App_View_Interact";
    public static final String APP_VIEW_OPEN_FROM = "App_Viewed_Open_From";
    public static final String BONUS_GAME_WALLET_OFFER_19 = "Bonus_Game_Wallet_Offer_19_App_View";
    public static final String BONUS_MIGRATION_APPVIEW = "Bonus_Migration_19_App_View";
    public static final String CLICK_INSTALL = "Clicked on install button";
    private static final String CONTEXT = "context";
    public static final String EDITORS_CHOICE_CLICKS = "Editors_Choice_Clicks";
    public static final String HOME_PAGE_EDITORS_CHOICE_FLURRY = "Home_Page_Editors_Choice";
    private static final String IMPRESSION = "impression";
    private static final String IS_AD = "Is_ad";
    private static final String IS_APKFY = "apkfy_app_install";
    private static final String NETWORK = "network";
    private static final String PACKAGE_NAME = "Package_name";
    private static final String POSITION = "Position";
    public static final String SIMILAR_APP_INTERACT = "Similar_App_Interact";
    private static final String TAP_ON_APP = "tap_on_app";
    private static final String TYPE = "type";
    private final AnalyticsManager analyticsManager;
    private final DownloadAnalytics downloadAnalytics;
    private final InstallAnalytics installAnalytics;
    private final NavigationTracker navigationTracker;
    private final StoreAnalytics storeAnalytics;

    /* renamed from: cm.aptoide.pt.app.AppViewAnalytics$1 */
    static /* synthetic */ class C14481 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;

        static {
            int[] iArr = new int[DownloadModel.Action.values().length];
            $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action = iArr;
            try {
                iArr[DownloadModel.Action.DOWNGRADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.INSTALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.MIGRATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.OPEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public AppViewAnalytics(DownloadAnalytics downloadAnalytics, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, StoreAnalytics storeAnalytics, InstallAnalytics installAnalytics) {
        this.downloadAnalytics = downloadAnalytics;
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
        this.storeAnalytics = storeAnalytics;
        this.installAnalytics = installAnalytics;
    }

    private HashMap<String, Object> createAppViewedFromMap(ScreenTagHistory screenTagHistory, ScreenTagHistory screenTagHistory2, String str, String str2, String str3, boolean z, boolean z2) throws NullPointerException {
        HashMap<String, Object> map = new HashMap<>();
        if (screenTagHistory != null) {
            if (screenTagHistory.getFragment() != null) {
                map.put("fragment", screenTagHistory.getFragment());
            }
            if (screenTagHistory.getStore() != null) {
                map.put(AccountAnalytics.STORE, screenTagHistory.getStore());
            }
        }
        if (screenTagHistory2 != null && screenTagHistory2.getTag() != null) {
            map.put(StoreTabGridRecyclerFragment.BundleCons.TAG, screenTagHistory2.getTag());
        }
        map.put("appcoins_type", mapAppCoinsInfo(z, z2));
        map.put("package_name", str);
        map.put("application_publisher", str2);
        map.put("trusted_badge", str3);
        return map;
    }

    private Map<String, Object> createEditorsChoiceClickEventMap(ScreenTagHistory screenTagHistory, String str, String str2) {
        HashMap map = new HashMap();
        if (screenTagHistory != null && screenTagHistory.getFragment() != null) {
            map.put("fragment", screenTagHistory.getFragment());
        }
        map.put("package_name", str);
        map.put("position", str2);
        return map;
    }

    private Map<String, Object> createEditorsClickEventMap(ScreenTagHistory screenTagHistory, String str, String str2) {
        HashMap map = new HashMap();
        map.put(APPLICATION_NAME, str);
        map.put("Search Position", str2);
        if (screenTagHistory != null && screenTagHistory.getFragment() != null) {
            map.put("fragment", screenTagHistory.getFragment());
        }
        return map;
    }

    private Map<String, Object> createFlagAppEventData(String str, String str2) {
        HashMap map = new HashMap();
        map.put(ACTION, str);
        map.put("flag_details", str2);
        return map;
    }

    private Map<String, Object> createMapData(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }

    private Map<String, Object> createSimilarAppsEventData(String str) {
        HashMap map = new HashMap();
        map.put(ACTION, "Open App on Recommended for you");
        map.put("bundle_tag", str);
        return map;
    }

    private HashMap<String, Object> getABTestMap(String str) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("group", str);
        return map;
    }

    private HashMap<String, Object> getSimilarABTestData(boolean z) {
        return getABTestMap(z ? "control" : "appc_bundle");
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    private String mapAppCoinsInfo(boolean z, boolean z2) {
        return (z && z2) ? "AppCoins Ads IAB" : z ? "AppCoins IAB" : z2 ? "AppCoins Ads" : "None";
    }

    private InstallType mapDownloadAction(DownloadModel.Action action) {
        InstallType installType = InstallType.INSTALL;
        int i2 = C14481.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[action.ordinal()];
        if (i2 == 1) {
            return InstallType.DOWNGRADE;
        }
        if (i2 == 2) {
            return installType;
        }
        if (i2 == 3) {
            return InstallType.UPDATE;
        }
        if (i2 != 4 && i2 != 5) {
            return installType;
        }
        throw new IllegalStateException("Mapping an invalid download action " + action.name());
    }

    private String mapToPromotionOffer(String str) {
        return str.equals("BONUS_MIGRATION_19") ? BONUS_MIGRATION_APPVIEW : str.equals("BONUS_GAME_WALLET_OFFER_19") ? BONUS_GAME_WALLET_OFFER_19 : "N/A";
    }

    private void sendClickOnClaimAppcWalletPromotion(String str) {
        HashMap map = new HashMap();
        map.put(ACTION, "claim");
        this.analyticsManager.logEvent(map, str, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    private void sendClickOnNoThanksWalletInstall(String str) {
        HashMap map = new HashMap();
        map.put(ACTION, "no thanks");
        this.analyticsManager.logEvent(map, str, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    private void sendInstallAppcWalletEvent(String str) {
        HashMap map = new HashMap();
        map.put(ACTION, "install wallet");
        this.analyticsManager.logEvent(map, str, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    private void sendPromotionImpressionEvent(String str) {
        HashMap map = new HashMap();
        map.put(ACTION, IMPRESSION);
        this.analyticsManager.logEvent(map, str, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    private void similarAppInteract(ApplicationAd.Network network, String str, String str2, int i2, boolean z) {
        HashMap map = new HashMap();
        if (z) {
            map.put(NETWORK, network.getName());
        }
        map.put(ACTION, str);
        map.put(IS_AD, z ? "true" : AdultContentAnalytics.UNLOCK);
        if (str.equals(TAP_ON_APP)) {
            map.put(PACKAGE_NAME, str2);
            map.put(POSITION, Integer.valueOf(i2));
        }
        this.analyticsManager.logEvent(map, SIMILAR_APP_INTERACT, str.equals(IMPRESSION) ? AnalyticsManager.Action.IMPRESSION : AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    private void similarAppcAppClick(int i2, String str) {
        HashMap map = new HashMap();
        map.put(ACTION, TAP_ON_APP);
        map.put(PACKAGE_NAME, str);
        map.put(POSITION, Integer.valueOf(i2));
        this.analyticsManager.logEvent(map, APPC_SIMILAR_APP_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void clickOnInstallButton(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, String str5, String str6, boolean z4, boolean z5, List<String> list, String str7, long j2) {
        String viewName = getViewName(true);
        HashMap map = new HashMap();
        map.put("type", str3);
        map.put(APPLICATION_NAME, str);
        map.put(APPLICATION_PUBLISHER, str2);
        map.put(APP_BUNDLE, Boolean.valueOf(z));
        map.put(CONTEXT, viewName);
        map.put(IS_APKFY, Boolean.valueOf(z4));
        this.installAnalytics.clickOnInstallEvent(str, str3, z, z2, z3, str4, str5, str6, z4, z5, list.contains("STORE_BDS"), str7, Long.valueOf(j2));
        this.analyticsManager.logEvent(map, CLICK_INSTALL, AnalyticsManager.Action.CLICK, viewName);
    }

    public void sendAppShareEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "App Share"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendAppViewOpenedFromEvent(String str, String str2, String str3, boolean z, boolean z2) {
        this.analyticsManager.logEvent(createAppViewedFromMap(this.navigationTracker.getPreviousScreen(), this.navigationTracker.getCurrentScreen(), str, str2, str3, z, z2), APP_VIEW_OPEN_FROM, AnalyticsManager.Action.CLICK, getViewName(false));
    }

    public void sendAppcInfoInteractEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "AppCoins Info View"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendAppcMigrationAppOpen() {
        HashMap map = new HashMap();
        map.put(ACTION, "open");
        this.analyticsManager.logEvent(map, BONUS_MIGRATION_APPVIEW, AnalyticsManager.Action.OPEN, this.navigationTracker.getViewName(true));
    }

    public void sendAppcMigrationUpdateClick() {
        HashMap map = new HashMap();
        map.put(ACTION, "update to appc");
        this.analyticsManager.logEvent(map, BONUS_MIGRATION_APPVIEW, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendBadgeClickEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Open Badge"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendClickOnClaimAppViewPromotion(String str) {
        sendClickOnClaimAppcWalletPromotion(mapToPromotionOffer(str));
    }

    public void sendClickOnNoThanksWallet(String str) {
        sendClickOnNoThanksWalletInstall(mapToPromotionOffer(str));
    }

    public void sendDownloadAbortEvent(String str, int i2, DownloadModel.Action action, boolean z, boolean z2, boolean z3, String str2, String str3, boolean z4, boolean z5, boolean z6, String str4, long j2) {
        this.downloadAnalytics.sendDownloadAbortEvent(str, i2, mapDownloadAction(action), z, z2, z3, str2, str3, z4, z5, z6, str4, j2);
    }

    public void sendDownloadCancelEvent(String str) {
        this.downloadAnalytics.downloadInteractEvent(str, "cancel");
    }

    public void sendDownloadPauseEvent(String str) {
        this.downloadAnalytics.downloadInteractEvent(str, "pause");
    }

    public void sendEditorsChoiceClickEvent(String str, String str2) {
        AnalyticsManager analyticsManager = this.analyticsManager;
        Map<String, Object> mapCreateEditorsChoiceClickEventMap = createEditorsChoiceClickEventMap(this.navigationTracker.getPreviousScreen(), str, str2);
        AnalyticsManager.Action action = AnalyticsManager.Action.CLICK;
        analyticsManager.logEvent(mapCreateEditorsChoiceClickEventMap, EDITORS_CHOICE_CLICKS, action, getViewName(false));
        this.analyticsManager.logEvent(createEditorsClickEventMap(this.navigationTracker.getPreviousScreen(), str, str2), HOME_PAGE_EDITORS_CHOICE_FLURRY, action, getViewName(false));
    }

    public void sendFlagAppEvent(String str) {
        this.analyticsManager.logEvent(createFlagAppEventData("Flag App", str), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendFollowStoreEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Follow Store"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendInstallAppcWallet(String str) {
        sendInstallAppcWalletEvent(mapToPromotionOffer(str));
    }

    public void sendInstallPromotionApp() {
        HashMap map = new HashMap();
        map.put(ACTION, "install appc app");
        this.analyticsManager.logEvent(map, BONUS_GAME_WALLET_OFFER_19, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendInvalidAppEventError(String str, int i2, DownloadModel.Action action, boolean z, boolean z2, boolean z3, String str2, String str3, boolean z4, Throwable th, boolean z5, String str4, String str5, long j2) {
        this.downloadAnalytics.sendAppNotValidError(str, i2, mapDownloadAction(action), z, z2, z3, str2, str3, z4, th, z5, str4, str3.equals("catappult"), str5, j2);
    }

    public void sendNotEnoughSpaceErrorEvent(String str) {
        this.downloadAnalytics.sendNotEnoughSpaceError(str);
    }

    public void sendOpenScreenshotEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Open Screenshot"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendOpenStoreEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Open Store"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendOpenVideoEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Open Video"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendOtherVersionsEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Other Versions"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendPromotionImpression(String str) {
        if (str.equals("BONUS_MIGRATION_19")) {
            sendPromotionImpressionEvent(BONUS_MIGRATION_APPVIEW);
        } else if (str.equals("BONUS_GAME_WALLET_OFFER_19")) {
            sendPromotionImpressionEvent(BONUS_GAME_WALLET_OFFER_19);
        }
    }

    public void sendRateThisAppEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Rate This App"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendReadAllEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Read All"), APP_VIEW_INTERACT, AnalyticsManager.Action.VIEW, getViewName(true));
    }

    public void sendReadMoreEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Read More"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendRemoteInstallEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Install on TV"), APP_VIEW_INTERACT, AnalyticsManager.Action.INSTALL, getViewName(true));
    }

    public void sendSimilarABTestGroupEvent(boolean z) {
        Logger.getInstance().m8273d("AppViewAnalytics", "similar_apps_control_group: " + z);
    }

    public void sendSimilarAppsInteractEvent(String str) {
        this.analyticsManager.logEvent(createSimilarAppsEventData(str), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendStoreOpenEvent(Store store) {
        this.storeAnalytics.sendStoreOpenEvent("App View", store.getName(), true);
    }

    public void setupDownloadEvents(RoomDownload roomDownload, int i2, String str, DownloadModel.Action action, AnalyticsManager.Action action2, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6) {
        if (DownloadModel.Action.MIGRATE.equals(action)) {
            this.downloadAnalytics.migrationClicked(roomDownload.getMd5(), roomDownload.getVersionCode(), roomDownload.getPackageName(), str2, str3, InstallType.UPDATE_TO_APPC, action2, roomDownload.hasAppc(), roomDownload.hasSplits(), str4, z, roomDownload.hasObbs(), str5, z2, str6, roomDownload.getSize());
        } else {
            this.downloadAnalytics.installClicked(roomDownload.getMd5(), roomDownload.getVersionCode(), roomDownload.getPackageName(), str2, str3, mapDownloadAction(action), action2, roomDownload.hasAppc(), roomDownload.hasSplits(), str4, z, roomDownload.hasObbs(), str5, z2, str6, roomDownload.getSize());
        }
    }

    public void similarAppBundleImpression(ApplicationAd.Network network, boolean z) {
        similarAppInteract(network, IMPRESSION, null, -1, z);
    }

    public void similarAppClick(AppViewSimilarAppsAdapter.SimilarAppType similarAppType, ApplicationAd.Network network, String str, int i2, boolean z) {
        if (similarAppType.equals(AppViewSimilarAppsAdapter.SimilarAppType.APPC_SIMILAR_APPS)) {
            similarAppcAppClick(i2, str);
        } else if (similarAppType.equals(AppViewSimilarAppsAdapter.SimilarAppType.SIMILAR_APPS)) {
            similarAppInteract(network, TAP_ON_APP, str, i2, z);
        }
    }

    public void similarAppcAppBundleImpression() {
        HashMap map = new HashMap();
        map.put(IS_AD, Boolean.FALSE);
        String lowerCase = ACTION.toLowerCase();
        AnalyticsManager.Action action = AnalyticsManager.Action.IMPRESSION;
        map.put(lowerCase, action.name().toLowerCase());
        this.analyticsManager.logEvent(map, APPC_SIMILAR_APP_INTERACT, action, this.navigationTracker.getViewName(true));
    }
}
