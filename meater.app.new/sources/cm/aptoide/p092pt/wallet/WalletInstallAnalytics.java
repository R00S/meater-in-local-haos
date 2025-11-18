package cm.aptoide.p092pt.wallet;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.app.AppViewAnalytics;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.app.DownloadStateParser;
import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.database.room.RoomFileToDownload;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.Origin;
import cm.aptoide.p092pt.download.SplitAnalyticsMapper;
import cm.aptoide.p092pt.install.InstallAnalytics;
import cm.aptoide.p092pt.notification.NotificationAnalytics;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: WalletInstallAnalytics.kt */
@Metadata(m32266d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\n\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u001e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020%J\u0010\u0010/\u001a\u00020+2\b\u00100\u001a\u0004\u0018\u00010\u0012J:\u00101\u001a\u00020+2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00122\b\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020%H\u0002J \u0010<\u001a\u00020+2\u0006\u00102\u001a\u0002032\b\u00107\u001a\u0004\u0018\u0001082\u0006\u0010=\u001a\u00020>J\u0006\u0010?\u001a\u00020+R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006@"}, m32267d2 = {"Lcm/aptoide/pt/wallet/WalletInstallAnalytics;", HttpUrl.FRAGMENT_ENCODE_SET, "downloadAnalytics", "Lcm/aptoide/pt/download/DownloadAnalytics;", "notificationAnalytics", "Lcm/aptoide/pt/notification/NotificationAnalytics;", "installAnalytics", "Lcm/aptoide/pt/install/InstallAnalytics;", "downloadStateParser", "Lcm/aptoide/pt/app/DownloadStateParser;", "analyticsManager", "Lcm/aptoide/analytics/AnalyticsManager;", "navigationTracker", "Lcm/aptoide/analytics/implementation/navigation/NavigationTracker;", "splitAnalyticsMapper", "Lcm/aptoide/pt/download/SplitAnalyticsMapper;", "(Lcm/aptoide/pt/download/DownloadAnalytics;Lcm/aptoide/pt/notification/NotificationAnalytics;Lcm/aptoide/pt/install/InstallAnalytics;Lcm/aptoide/pt/app/DownloadStateParser;Lcm/aptoide/analytics/AnalyticsManager;Lcm/aptoide/analytics/implementation/navigation/NavigationTracker;Lcm/aptoide/pt/download/SplitAnalyticsMapper;)V", "APPLICATION_NAME", HttpUrl.FRAGMENT_ENCODE_SET, "APPLICATION_PUBLISHER", "APP_BUNDLE", "CLICK_INSTALL", "TYPE", "VIEW_CONTEXT", "getAnalyticsManager", "()Lcm/aptoide/analytics/AnalyticsManager;", "getDownloadAnalytics", "()Lcm/aptoide/pt/download/DownloadAnalytics;", "getDownloadStateParser", "()Lcm/aptoide/pt/app/DownloadStateParser;", "getInstallAnalytics", "()Lcm/aptoide/pt/install/InstallAnalytics;", "getNavigationTracker", "()Lcm/aptoide/analytics/implementation/navigation/NavigationTracker;", "getNotificationAnalytics", "()Lcm/aptoide/pt/notification/NotificationAnalytics;", "shouldRegister", HttpUrl.FRAGMENT_ENCODE_SET, "getSplitAnalyticsMapper", "()Lcm/aptoide/pt/download/SplitAnalyticsMapper;", "getHistoryTracker", "Lcm/aptoide/analytics/implementation/navigation/ScreenTagHistory;", "sendClickOnInstallButtonEvent", HttpUrl.FRAGMENT_ENCODE_SET, "packageName", "applicationPublisher", "hasSplits", "sendNotEnoughSpaceErrorEvent", "md5", "setupDownloadAnalyticsEvents", DownloadAnalytics.RAKAM_DOWNLOAD_EVENT, "Lcm/aptoide/pt/database/room/RoomDownload;", "campaignId", HttpUrl.FRAGMENT_ENCODE_SET, "abTestGroup", "downloadAction", "Lcm/aptoide/pt/app/DownloadModel$Action;", "action", "Lcm/aptoide/analytics/AnalyticsManager$Action;", "hasObbs", "setupDownloadEvents", "appId", HttpUrl.FRAGMENT_ENCODE_SET, "setupHistoryTracker", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class WalletInstallAnalytics {
    private final String APPLICATION_NAME;
    private final String APPLICATION_PUBLISHER;
    private final String APP_BUNDLE;
    private final String CLICK_INSTALL;
    private final String TYPE;
    private final String VIEW_CONTEXT;
    private final AnalyticsManager analyticsManager;
    private final DownloadAnalytics downloadAnalytics;
    private final DownloadStateParser downloadStateParser;
    private final InstallAnalytics installAnalytics;
    private final NavigationTracker navigationTracker;
    private final NotificationAnalytics notificationAnalytics;
    private boolean shouldRegister;
    private final SplitAnalyticsMapper splitAnalyticsMapper;

    public WalletInstallAnalytics(DownloadAnalytics downloadAnalytics, NotificationAnalytics notificationAnalytics, InstallAnalytics installAnalytics, DownloadStateParser downloadStateParser, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, SplitAnalyticsMapper splitAnalyticsMapper) {
        C9801m.m32346f(downloadAnalytics, "downloadAnalytics");
        C9801m.m32346f(notificationAnalytics, "notificationAnalytics");
        C9801m.m32346f(installAnalytics, "installAnalytics");
        C9801m.m32346f(downloadStateParser, "downloadStateParser");
        C9801m.m32346f(analyticsManager, "analyticsManager");
        C9801m.m32346f(navigationTracker, "navigationTracker");
        C9801m.m32346f(splitAnalyticsMapper, "splitAnalyticsMapper");
        this.downloadAnalytics = downloadAnalytics;
        this.notificationAnalytics = notificationAnalytics;
        this.installAnalytics = installAnalytics;
        this.downloadStateParser = downloadStateParser;
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
        this.splitAnalyticsMapper = splitAnalyticsMapper;
        this.shouldRegister = true;
        this.APP_BUNDLE = "app_bundle";
        this.TYPE = "type";
        this.APPLICATION_NAME = "Application Name";
        this.APPLICATION_PUBLISHER = "Application Publisher";
        this.CLICK_INSTALL = AppViewAnalytics.CLICK_INSTALL;
        this.VIEW_CONTEXT = "WalletInstallActivity";
    }

    private final ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(this.VIEW_CONTEXT);
    }

    private final void setupDownloadAnalyticsEvents(RoomDownload download, int campaignId, String abTestGroup, DownloadModel.Action downloadAction, AnalyticsManager.Action action, boolean hasObbs) {
        if (downloadAction == DownloadModel.Action.INSTALL) {
            DownloadAnalytics downloadAnalytics = this.downloadAnalytics;
            String md5 = download.getMd5();
            String packageName = download.getPackageName();
            int versionCode = download.getVersionCode();
            boolean zHasAppc = download.hasAppc();
            boolean zHasSplits = download.hasSplits();
            String trustedBadge = download.getTrustedBadge();
            String storeName = download.getStoreName();
            String string = action.toString();
            SplitAnalyticsMapper splitAnalyticsMapper = this.splitAnalyticsMapper;
            List<RoomFileToDownload> splits = download.getSplits();
            C9801m.m32345e(splits, "download.splits");
            downloadAnalytics.installClicked(md5, packageName, versionCode, action, false, zHasAppc, zHasSplits, trustedBadge, (String) null, storeName, string, hasObbs, splitAnalyticsMapper.getSplitTypesAsString(splits), true, HttpUrl.FRAGMENT_ENCODE_SET, download.getSize());
        }
        if (DownloadModel.Action.MIGRATE == downloadAction) {
            DownloadAnalytics downloadAnalytics2 = this.downloadAnalytics;
            String md52 = download.getMd5();
            String packageName2 = download.getPackageName();
            int versionCode2 = download.getVersionCode();
            boolean zHasSplits2 = download.hasSplits();
            String trustedBadge2 = download.getTrustedBadge();
            String storeName2 = download.getStoreName();
            SplitAnalyticsMapper splitAnalyticsMapper2 = this.splitAnalyticsMapper;
            List<RoomFileToDownload> splits2 = download.getSplits();
            C9801m.m32345e(splits2, "download.splits");
            downloadAnalytics2.migrationClicked(md52, packageName2, versionCode2, action, zHasSplits2, trustedBadge2, null, storeName2, hasObbs, splitAnalyticsMapper2.getSplitTypesAsString(splits2), true, HttpUrl.FRAGMENT_ENCODE_SET, download.getSize());
        }
    }

    public final AnalyticsManager getAnalyticsManager() {
        return this.analyticsManager;
    }

    public final DownloadAnalytics getDownloadAnalytics() {
        return this.downloadAnalytics;
    }

    public final DownloadStateParser getDownloadStateParser() {
        return this.downloadStateParser;
    }

    public final InstallAnalytics getInstallAnalytics() {
        return this.installAnalytics;
    }

    public final NavigationTracker getNavigationTracker() {
        return this.navigationTracker;
    }

    public final NotificationAnalytics getNotificationAnalytics() {
        return this.notificationAnalytics;
    }

    public final SplitAnalyticsMapper getSplitAnalyticsMapper() {
        return this.splitAnalyticsMapper;
    }

    public final void sendClickOnInstallButtonEvent(String packageName, String applicationPublisher, boolean hasSplits) {
        C9801m.m32346f(packageName, "packageName");
        C9801m.m32346f(applicationPublisher, "applicationPublisher");
        HashMap map = new HashMap();
        map.put(this.TYPE, "Install");
        map.put(this.APPLICATION_NAME, packageName);
        map.put(this.APPLICATION_PUBLISHER, applicationPublisher);
        map.put(this.APP_BUNDLE, Boolean.valueOf(hasSplits));
        this.analyticsManager.logEvent(map, this.CLICK_INSTALL, AnalyticsManager.Action.CLICK, this.VIEW_CONTEXT);
    }

    public final void sendNotEnoughSpaceErrorEvent(String md5) {
        this.downloadAnalytics.sendNotEnoughSpaceError(md5);
    }

    public final void setupDownloadEvents(RoomDownload download, DownloadModel.Action downloadAction, long appId) {
        C9801m.m32346f(download, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        int campaignId = this.notificationAnalytics.getCampaignId(download.getPackageName(), appId);
        String abTestingGroup = this.notificationAnalytics.getAbTestingGroup(download.getPackageName(), appId);
        C9801m.m32345e(abTestingGroup, "abTestGroup");
        setupDownloadAnalyticsEvents(download, campaignId, abTestingGroup, downloadAction, AnalyticsManager.Action.CLICK, download.hasObbs());
        InstallAnalytics installAnalytics = this.installAnalytics;
        String packageName = download.getPackageName();
        int versionCode = download.getVersionCode();
        AnalyticsManager.Action action = AnalyticsManager.Action.INSTALL;
        DownloadAnalytics.AppContext appContext = DownloadAnalytics.AppContext.WALLET_INSTALL_ACTIVITY;
        Origin origin = this.downloadStateParser.getOrigin(download.getAction());
        boolean z = downloadAction != null && downloadAction == DownloadModel.Action.MIGRATE;
        boolean zHasAppc = download.hasAppc();
        boolean zHasSplits = download.hasSplits();
        String trustedBadge = download.getTrustedBadge();
        String storeName = download.getStoreName();
        boolean zHasObbs = download.hasObbs();
        SplitAnalyticsMapper splitAnalyticsMapper = this.splitAnalyticsMapper;
        List<RoomFileToDownload> splits = download.getSplits();
        C9801m.m32345e(splits, "download.splits");
        installAnalytics.installStarted(packageName, versionCode, action, appContext, origin, campaignId, abTestingGroup, z, zHasAppc, zHasSplits, trustedBadge, storeName, false, zHasObbs, splitAnalyticsMapper.getSplitTypesAsString(splits), true, HttpUrl.FRAGMENT_ENCODE_SET, download.getSize());
    }

    public final void setupHistoryTracker() {
        ScreenTagHistory historyTracker = getHistoryTracker();
        if (this.shouldRegister) {
            if (historyTracker == null) {
                throw new RuntimeException("If " + WalletInstallAnalytics.class.getSimpleName() + " should be logged to screen history, it has to return a value on method NavigationTrackFragment#getHistoryTracker");
            }
            this.navigationTracker.registerScreen(historyTracker);
        }
        this.shouldRegister = false;
    }
}
