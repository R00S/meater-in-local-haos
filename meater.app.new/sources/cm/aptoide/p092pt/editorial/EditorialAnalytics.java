package cm.aptoide.p092pt.editorial;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.app.AppViewAnalytics;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.InstallType;
import cm.aptoide.p092pt.download.SplitAnalyticsMapper;
import cm.aptoide.p092pt.install.InstallAnalytics;
import java.util.HashMap;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class EditorialAnalytics {
    private static final String ACTION = "action";
    private static final String APPLICATION_NAME = "Application Name";
    private static final String CONTEXT = "context";
    public static final String CURATION_CARD_INSTALL = "Curation_Card_Install";
    private static final String CURATION_DETAIL = "curation_detail";
    public static final String EDITORIAL_BN_CURATION_CARD_INSTALL = "Editorial_BN_Curation_Card_Install";
    public static final String REACTION_INTERACT = "Reaction_Interact";
    private static final String TYPE = "type";
    private static final String WHERE = "where";
    private final AnalyticsManager analyticsManager;
    private final DownloadAnalytics downloadAnalytics;
    private final boolean fromHome;
    private final InstallAnalytics installAnalytics;
    private final NavigationTracker navigationTracker;
    private final SplitAnalyticsMapper splitAnalyticsMapper;

    /* renamed from: cm.aptoide.pt.editorial.EditorialAnalytics$1 */
    static /* synthetic */ class C24731 {
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

    public EditorialAnalytics(DownloadAnalytics downloadAnalytics, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, boolean z, InstallAnalytics installAnalytics, SplitAnalyticsMapper splitAnalyticsMapper) {
        this.downloadAnalytics = downloadAnalytics;
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
        this.fromHome = z;
        this.installAnalytics = installAnalytics;
        this.splitAnalyticsMapper = splitAnalyticsMapper;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    private InstallType mapDownloadAction(DownloadModel.Action action) {
        InstallType installType = InstallType.INSTALL;
        int i2 = C24731.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[action.ordinal()];
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

    public void clickOnInstallButton(String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, boolean z4, List<String> list, long j2) {
        String viewName = getViewName(true);
        String str6 = !this.fromHome ? EDITORIAL_BN_CURATION_CARD_INSTALL : CURATION_CARD_INSTALL;
        HashMap map = new HashMap();
        map.put(APPLICATION_NAME, str);
        map.put("type", str2);
        map.put(CONTEXT, viewName);
        this.installAnalytics.clickOnInstallEvent(str, str2, z, z2, z3, str3, str4, str5, false, z4, list.contains("STORE_BDS"), HttpUrl.FRAGMENT_ENCODE_SET, Long.valueOf(j2));
        AnalyticsManager analyticsManager = this.analyticsManager;
        AnalyticsManager.Action action = AnalyticsManager.Action.CLICK;
        analyticsManager.logEvent(map, str6, action, viewName);
        this.analyticsManager.logEvent(map, AppViewAnalytics.CLICK_INSTALL, action, viewName);
    }

    public void sendDeletedEvent() {
        HashMap map = new HashMap();
        map.put("action", "delete_reaction");
        map.put(WHERE, CURATION_DETAIL);
        this.analyticsManager.logEvent(map, REACTION_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
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

    public void sendNotEnoughSpaceErrorEvent(String str) {
        this.downloadAnalytics.sendNotEnoughSpaceError(str);
    }

    public void sendReactedEvent() {
        HashMap map = new HashMap();
        map.put("action", "click_to_react");
        map.put(WHERE, CURATION_DETAIL);
        this.analyticsManager.logEvent(map, REACTION_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendReactionButtonClickEvent() {
        HashMap map = new HashMap();
        map.put("action", "view_reactions");
        map.put(WHERE, CURATION_DETAIL);
        this.analyticsManager.logEvent(map, REACTION_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void setupDownloadEvents(RoomDownload roomDownload, int i2, String str, AnalyticsManager.Action action, String str2, String str3, String str4, boolean z) {
        this.downloadAnalytics.installClicked(roomDownload.getMd5(), roomDownload.getPackageName(), roomDownload.getVersionCode(), action, false, roomDownload.hasAppc(), roomDownload.hasSplits(), str2, (String) null, str3, str4, roomDownload.hasObbs(), this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()), z, HttpUrl.FRAGMENT_ENCODE_SET, roomDownload.getSize());
    }
}
