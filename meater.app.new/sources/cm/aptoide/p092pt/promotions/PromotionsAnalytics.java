package cm.aptoide.p092pt.promotions;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.app.AppViewAnalytics;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.InstallType;
import cm.aptoide.p092pt.download.Origin;
import cm.aptoide.p092pt.install.InstallAnalytics;
import java.util.HashMap;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class PromotionsAnalytics {
    private static final String ACTION = "action";
    private static final String ACTION_CLAIM = "claim";
    private static final String ACTION_INSTALL = "install";
    private static final String ACTION_UPDATE = "update";
    private static final String AMOUNT = "amount";
    private static final String APPLICATION_NAME = "Application Name";
    private static final String CONTEXT = "context";
    private static final String PACKAGE = "package";
    public static final String PROMOTIONS_INTERACT = "Promotions_Interact";
    public static final String PROMOTION_DIALOG = "Promotion_Dialog";
    public static final String VALENTINE_MIGRATOR = "Valentine_Migrator";
    private static final String VIEW = "view";
    private final AnalyticsManager analyticsManager;
    private final DownloadAnalytics downloadAnalytics;
    private final InstallAnalytics installAnalytics;
    private final NavigationTracker navigationTracker;
    private final String NEXT = "next";
    private final String CANCEL = "cancel";
    private final String OPEN_WALLET = "open wallet";
    private final String WALLET_DIALOG = "wallet dialog";
    private final String SIGNATURE = RoomInstalled.SIGNATURE;
    private final String ACTION_OPEN = "open";

    /* renamed from: cm.aptoide.pt.promotions.PromotionsAnalytics$1 */
    static /* synthetic */ class C39061 {
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

    public PromotionsAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker, DownloadAnalytics downloadAnalytics, InstallAnalytics installAnalytics) {
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
        this.downloadAnalytics = downloadAnalytics;
        this.installAnalytics = installAnalytics;
    }

    private HashMap<String, Object> createPromotionsInteractMap(String str, String str2, float f2) {
        HashMap<String, Object> mapPutPromotionAppAction = putPromotionAppAction(str, new HashMap<>());
        mapPutPromotionAppAction.put("package", str2);
        mapPutPromotionAppAction.put(AMOUNT, Float.valueOf(f2));
        return mapPutPromotionAppAction;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    private InstallType mapDownloadAction(DownloadModel.Action action) {
        InstallType installType = InstallType.INSTALL;
        int i2 = C39061.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[action.ordinal()];
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

    private HashMap<String, Object> putPromotionAppAction(String str, HashMap<String, Object> map) {
        map.put("action", str);
        return map;
    }

    public void sendClickOnWalletDialogCancel(String str) {
        HashMap map = new HashMap();
        map.put("action", "cancel");
        map.put("package", str);
        map.put(VIEW, "wallet dialog");
        this.analyticsManager.logEvent(map, PROMOTION_DIALOG, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendClickOnWalletDialogFindWallet(String str) {
        HashMap map = new HashMap();
        map.put("action", "open wallet");
        map.put("package", str);
        map.put(VIEW, "wallet dialog");
        this.analyticsManager.logEvent(map, PROMOTION_DIALOG, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendClickOnWalletDialogNext(String str) {
        HashMap map = new HashMap();
        map.put("action", "next");
        map.put("package", str);
        map.put(VIEW, "wallet dialog");
        this.analyticsManager.logEvent(map, PROMOTION_DIALOG, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendDownloadAbortEvent(String str, int i2, DownloadModel.Action action, boolean z, boolean z2, boolean z3, String str2, String str3, boolean z4, boolean z5, boolean z6, String str4, long j2) {
        this.downloadAnalytics.sendDownloadAbortEvent(str, i2, mapDownloadAction(action), z, z2, z3, str2, str3, z4, z5, z6, str4, j2);
    }

    public void sendNotEnoughSpaceErrorEvent(String str) {
        this.downloadAnalytics.sendNotEnoughSpaceError(str);
    }

    public void sendOpenPromotionsFragmentEvent() {
        this.analyticsManager.logEvent(putPromotionAppAction("open", new HashMap<>()), PROMOTIONS_INTERACT, AnalyticsManager.Action.CLICK, getViewName(false));
    }

    public void sendPromotionsAppInteractClaimEvent(String str, float f2) {
        this.analyticsManager.logEvent(createPromotionsInteractMap(ACTION_CLAIM, str, f2), PROMOTIONS_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendPromotionsAppInteractInstallEvent(String str, float f2, DownloadModel.Action action, boolean z, boolean z2, String str2, String str3, String str4, boolean z3, List<String> list, long j2) {
        String viewName = getViewName(true);
        String str5 = action == DownloadModel.Action.INSTALL ? "install" : action == DownloadModel.Action.UPDATE ? ACTION_UPDATE : null;
        HashMap map = new HashMap();
        map.put(APPLICATION_NAME, str);
        map.put(CONTEXT, viewName);
        map.put("action", str5);
        if (str5 != null) {
            this.installAnalytics.clickOnInstallEvent(str, str5, z, z2, str5.equals(DownloadModel.Action.MIGRATE.toString()), str2, str3, str4, false, z3, list.contains("STORE_BDS"), HttpUrl.FRAGMENT_ENCODE_SET, Long.valueOf(j2));
            AnalyticsManager analyticsManager = this.analyticsManager;
            HashMap<String, Object> mapCreatePromotionsInteractMap = createPromotionsInteractMap(str5, str, f2);
            AnalyticsManager.Action action2 = AnalyticsManager.Action.CLICK;
            analyticsManager.logEvent(mapCreatePromotionsInteractMap, PROMOTIONS_INTERACT, action2, viewName);
            this.analyticsManager.logEvent(map, AppViewAnalytics.CLICK_INSTALL, action2, viewName);
        }
    }

    public void sendValentineMigratorEvent(String str, Boolean bool) {
        HashMap map = new HashMap();
        map.put("package", str);
        map.put(RoomInstalled.SIGNATURE, bool.booleanValue() ? "same" : "different");
        this.analyticsManager.logEvent(map, VALENTINE_MIGRATOR, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void setupDownloadEvents(RoomDownload roomDownload, int i2, String str, AnalyticsManager.Action action, Origin origin, boolean z) {
        this.downloadAnalytics.downloadCompleteEvent(roomDownload.getMd5(), roomDownload.getPackageName(), HttpUrl.FRAGMENT_ENCODE_SET, action, z);
    }
}
