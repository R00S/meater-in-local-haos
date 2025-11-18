package cm.aptoide.p092pt.download.view;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.p092pt.aab.DynamicSplit;
import cm.aptoide.p092pt.aab.DynamicSplitsManager;
import cm.aptoide.p092pt.aab.DynamicSplitsModel;
import cm.aptoide.p092pt.actions.PermissionManager;
import cm.aptoide.p092pt.actions.PermissionService;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.app.migration.AppcMigrationManager;
import cm.aptoide.p092pt.app.mmpcampaigns.CampaignManager;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.database.room.RoomFileToDownload;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.download.InstallType;
import cm.aptoide.p092pt.download.InvalidAppException;
import cm.aptoide.p092pt.download.Origin;
import cm.aptoide.p092pt.download.SplitAnalyticsMapper;
import cm.aptoide.p092pt.download.view.DownloadStatusModel;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import cm.aptoide.p092pt.install.InstallAnalytics;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.notification.NotificationAnalytics;
import cm.aptoide.p092pt.presenter.ActionPresenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.search.analytics.SearchAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import okhttp3.HttpUrl;
import p319g.p320a.p321a.p322a.C9059d;
import p456rx.AbstractC11243h;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceCallableC11255d;

/* compiled from: DownloadViewActionPresenter.kt */
@Metadata(m32266d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#¢\u0006\u0002\u0010$J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0002H\u0002J$\u0010.\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0002J\u0010\u00106\u001a\u00020,2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00107\u001a\u00020,2\u0006\u00101\u001a\u000202H\u0002J\u0012\u00108\u001a\u0004\u0018\u0001092\u0006\u0010:\u001a\u00020;H\u0002J\u0010\u0010<\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0002H\u0002J\u0010\u0010=\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0002H\u0002J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0002J\u000e\u0010B\u001a\u00020;2\u0006\u0010:\u001a\u00020AJ\u0010\u0010C\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0002H\u0002J\b\u0010D\u001a\u00020EH\u0014J\u0010\u0010F\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0002H\u0002J \u0010G\u001a\u00020E2\u0006\u0010H\u001a\u00020&2\u0006\u0010I\u001a\u00020*2\b\u0010'\u001a\u0004\u0018\u00010(J8\u0010J\u001a\u00020E2\u0006\u00101\u001a\u0002002\u0006\u0010K\u001a\u00020L2\u0006\u0010@\u001a\u00020A2\b\u0010M\u001a\u0004\u0018\u00010(2\u0006\u0010N\u001a\u00020(2\u0006\u0010O\u001a\u00020(R\u000e\u0010%\u001a\u00020&X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, m32267d2 = {"Lcm/aptoide/pt/download/view/DownloadViewActionPresenter;", "Lcm/aptoide/pt/presenter/ActionPresenter;", "Lcm/aptoide/pt/download/view/DownloadClick;", "installManager", "Lcm/aptoide/pt/install/InstallManager;", "moPubAdsManager", "Lcm/aptoide/pt/ads/MoPubAdsManager;", "permissionManager", "Lcm/aptoide/pt/actions/PermissionManager;", "appcMigrationManager", "Lcm/aptoide/pt/app/migration/AppcMigrationManager;", "downloadDialogProvider", "Lcm/aptoide/pt/download/view/DownloadDialogProvider;", "downloadNavigator", "Lcm/aptoide/pt/download/view/DownloadNavigator;", "permissionService", "Lcm/aptoide/pt/actions/PermissionService;", "ioScheduler", "Lrx/Scheduler;", "viewScheduler", "downloadFactory", "Lcm/aptoide/pt/download/DownloadFactory;", "downloadAnalytics", "Lcm/aptoide/pt/download/DownloadAnalytics;", "installAnalytics", "Lcm/aptoide/pt/install/InstallAnalytics;", "notificationAnalytics", "Lcm/aptoide/pt/notification/NotificationAnalytics;", "crashReport", "Lcm/aptoide/pt/crashreports/CrashReport;", "dynamicSplitsManager", "Lcm/aptoide/pt/aab/DynamicSplitsManager;", "splitAnalyticsMapper", "Lcm/aptoide/pt/download/SplitAnalyticsMapper;", "campaignManager", "Lcm/aptoide/pt/app/mmpcampaigns/CampaignManager;", "(Lcm/aptoide/pt/install/InstallManager;Lcm/aptoide/pt/ads/MoPubAdsManager;Lcm/aptoide/pt/actions/PermissionManager;Lcm/aptoide/pt/app/migration/AppcMigrationManager;Lcm/aptoide/pt/download/view/DownloadDialogProvider;Lcm/aptoide/pt/download/view/DownloadNavigator;Lcm/aptoide/pt/actions/PermissionService;Lrx/Scheduler;Lrx/Scheduler;Lcm/aptoide/pt/download/DownloadFactory;Lcm/aptoide/pt/download/DownloadAnalytics;Lcm/aptoide/pt/install/InstallAnalytics;Lcm/aptoide/pt/notification/NotificationAnalytics;Lcm/aptoide/pt/crashreports/CrashReport;Lcm/aptoide/pt/aab/DynamicSplitsManager;Lcm/aptoide/pt/download/SplitAnalyticsMapper;Lcm/aptoide/pt/app/mmpcampaigns/CampaignManager;)V", "analyticsContext", "Lcm/aptoide/pt/download/DownloadAnalytics$AppContext;", "editorsChoicePosition", HttpUrl.FRAGMENT_ENCODE_SET, "isInApkfyContext", HttpUrl.FRAGMENT_ENCODE_SET, "cancelDownload", "Lrx/Completable;", "downloadClick", "createDownload", "Lrx/Observable;", "Lcm/aptoide/pt/database/room/RoomDownload;", DownloadAnalytics.RAKAM_DOWNLOAD_EVENT, "Lcm/aptoide/pt/download/view/Download;", "dynamicSplitsList", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/aab/DynamicSplit;", "downgradeApp", "downloadApp", "getOrigin", "Lcm/aptoide/pt/download/Origin;", "action", HttpUrl.FRAGMENT_ENCODE_SET, "handleOutOfSpaceError", "installApp", "mapDownloadAction", "Lcm/aptoide/pt/download/InstallType;", "downloadAction", "Lcm/aptoide/pt/download/view/DownloadStatusModel$Action;", "parseDownloadAction", "pauseDownload", "present", HttpUrl.FRAGMENT_ENCODE_SET, "resumeDownload", "setContextParams", "context", "isApkfy", "setupDownloadEvents", "appId", HttpUrl.FRAGMENT_ENCODE_SET, "storeName", "malwareRank", "appCategory", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public class DownloadViewActionPresenter extends ActionPresenter<DownloadClick> {
    private DownloadAnalytics.AppContext analyticsContext;
    private final AppcMigrationManager appcMigrationManager;
    private final CampaignManager campaignManager;
    private final CrashReport crashReport;
    private final DownloadAnalytics downloadAnalytics;
    private final DownloadDialogProvider downloadDialogProvider;
    private final DownloadFactory downloadFactory;
    private final DownloadNavigator downloadNavigator;
    private final DynamicSplitsManager dynamicSplitsManager;
    private String editorsChoicePosition;
    private final InstallAnalytics installAnalytics;
    private final InstallManager installManager;
    private final AbstractC11243h ioScheduler;
    private boolean isInApkfyContext;
    private final MoPubAdsManager moPubAdsManager;
    private final NotificationAnalytics notificationAnalytics;
    private final PermissionManager permissionManager;
    private final PermissionService permissionService;
    private final SplitAnalyticsMapper splitAnalyticsMapper;
    private final AbstractC11243h viewScheduler;

    /* compiled from: DownloadViewActionPresenter.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DownloadEvent.values().length];
            iArr[DownloadEvent.INSTALL.ordinal()] = 1;
            iArr[DownloadEvent.RESUME.ordinal()] = 2;
            iArr[DownloadEvent.PAUSE.ordinal()] = 3;
            iArr[DownloadEvent.CANCEL.ordinal()] = 4;
            iArr[DownloadEvent.GENERIC_ERROR.ordinal()] = 5;
            iArr[DownloadEvent.OUT_OF_SPACE_ERROR.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DownloadStatusModel.Action.values().length];
            iArr2[DownloadStatusModel.Action.MIGRATE.ordinal()] = 1;
            iArr2[DownloadStatusModel.Action.UPDATE.ordinal()] = 2;
            iArr2[DownloadStatusModel.Action.INSTALL.ordinal()] = 3;
            iArr2[DownloadStatusModel.Action.DOWNGRADE.ordinal()] = 4;
            iArr2[DownloadStatusModel.Action.OPEN.ordinal()] = 5;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DownloadViewActionPresenter(InstallManager installManager, MoPubAdsManager moPubAdsManager, PermissionManager permissionManager, AppcMigrationManager appcMigrationManager, DownloadDialogProvider downloadDialogProvider, DownloadNavigator downloadNavigator, PermissionService permissionService, AbstractC11243h abstractC11243h, AbstractC11243h abstractC11243h2, DownloadFactory downloadFactory, DownloadAnalytics downloadAnalytics, InstallAnalytics installAnalytics, NotificationAnalytics notificationAnalytics, CrashReport crashReport, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper, CampaignManager campaignManager) {
        C9801m.m32346f(installManager, "installManager");
        C9801m.m32346f(moPubAdsManager, "moPubAdsManager");
        C9801m.m32346f(permissionManager, "permissionManager");
        C9801m.m32346f(appcMigrationManager, "appcMigrationManager");
        C9801m.m32346f(downloadDialogProvider, "downloadDialogProvider");
        C9801m.m32346f(downloadNavigator, "downloadNavigator");
        C9801m.m32346f(permissionService, "permissionService");
        C9801m.m32346f(abstractC11243h, "ioScheduler");
        C9801m.m32346f(abstractC11243h2, "viewScheduler");
        C9801m.m32346f(downloadFactory, "downloadFactory");
        C9801m.m32346f(downloadAnalytics, "downloadAnalytics");
        C9801m.m32346f(installAnalytics, "installAnalytics");
        C9801m.m32346f(notificationAnalytics, "notificationAnalytics");
        C9801m.m32346f(crashReport, "crashReport");
        C9801m.m32346f(dynamicSplitsManager, "dynamicSplitsManager");
        C9801m.m32346f(splitAnalyticsMapper, "splitAnalyticsMapper");
        C9801m.m32346f(campaignManager, "campaignManager");
        this.installManager = installManager;
        this.moPubAdsManager = moPubAdsManager;
        this.permissionManager = permissionManager;
        this.appcMigrationManager = appcMigrationManager;
        this.downloadDialogProvider = downloadDialogProvider;
        this.downloadNavigator = downloadNavigator;
        this.permissionService = permissionService;
        this.ioScheduler = abstractC11243h;
        this.viewScheduler = abstractC11243h2;
        this.downloadFactory = downloadFactory;
        this.downloadAnalytics = downloadAnalytics;
        this.installAnalytics = installAnalytics;
        this.notificationAnalytics = notificationAnalytics;
        this.crashReport = crashReport;
        this.dynamicSplitsManager = dynamicSplitsManager;
        this.splitAnalyticsMapper = splitAnalyticsMapper;
        this.campaignManager = campaignManager;
    }

    private final C11231b cancelDownload(final DownloadClick downloadClick) {
        C11231b c11231bM39973a = C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.download.view.t
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                DownloadViewActionPresenter.m40758cancelDownload$lambda28(this.f8752f, downloadClick);
            }
        }).m39973a(this.installManager.cancelInstall(downloadClick.getDownload().getMd5(), downloadClick.getDownload().getPackageName(), downloadClick.getDownload().getVersionCode()));
        C9801m.m32345e(c11231bM39973a, "fromAction {\n      downl…versionCode\n      )\n    )");
        return c11231bM39973a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cancelDownload$lambda-28, reason: not valid java name */
    public static final void m40758cancelDownload$lambda28(DownloadViewActionPresenter downloadViewActionPresenter, DownloadClick downloadClick) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        C9801m.m32346f(downloadClick, "$downloadClick");
        downloadViewActionPresenter.downloadAnalytics.downloadInteractEvent(downloadClick.getDownload().getPackageName(), "cancel");
    }

    private final C11234e<RoomDownload> createDownload(final Download download, final List<DynamicSplit> list) {
        C11234e<RoomDownload> c11234eM40117w = C11234e.m40025S(list).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.e0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DownloadViewActionPresenter.m40759createDownload$lambda22(this.f8684f, download, list, (List) obj);
            }
        }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.v
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                DownloadViewActionPresenter.m40760createDownload$lambda23(this.f8755f, download, list, (Throwable) obj);
            }
        });
        C9801m.m32345e(c11234eM40117w, "just(dynamicSplitsList)\n…      )\n        }\n      }");
        return c11234eM40117w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createDownload$lambda-22, reason: not valid java name */
    public static final C11234e m40759createDownload$lambda22(DownloadViewActionPresenter downloadViewActionPresenter, Download download, List list, List list2) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        C9801m.m32346f(download, "$download");
        C9801m.m32346f(list, "$dynamicSplitsList");
        DownloadFactory downloadFactory = downloadViewActionPresenter.downloadFactory;
        DownloadStatusModel downloadModel = download.getDownloadModel();
        C9801m.m32343c(downloadModel);
        return C11234e.m40025S(downloadFactory.create(downloadViewActionPresenter.parseDownloadAction(downloadModel.getAction()), download.getAppName(), download.getPackageName(), download.getMd5(), download.getIcon(), download.getVersionName(), download.getVersionCode(), download.getPath(), download.getPathAlt(), download.getObb(), download.getHasAdvertising() || download.getHasBilling(), download.getSize(), download.getSplits(), download.getRequiredSplits(), download.getMalware().getRank().toString(), download.getStoreName(), download.getOemId(), list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createDownload$lambda-23, reason: not valid java name */
    public static final void m40760createDownload$lambda23(DownloadViewActionPresenter downloadViewActionPresenter, Download download, List list, Throwable th) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        C9801m.m32346f(download, "$download");
        C9801m.m32346f(list, "$dynamicSplitsList");
        if (th instanceof InvalidAppException) {
            DownloadAnalytics downloadAnalytics = downloadViewActionPresenter.downloadAnalytics;
            String packageName = download.getPackageName();
            int versionCode = download.getVersionCode();
            DownloadStatusModel downloadModel = download.getDownloadModel();
            C9801m.m32343c(downloadModel);
            downloadAnalytics.sendAppNotValidError(packageName, versionCode, downloadViewActionPresenter.mapDownloadAction(downloadModel.getAction()), download.getDownloadModel().getAction() == DownloadStatusModel.Action.MIGRATE, !download.getSplits().isEmpty(), download.getHasAdvertising() || download.getHasBilling(), download.getMalware().getRank().toString(), download.getStoreName(), downloadViewActionPresenter.isInApkfyContext, th, download.getObb() != null, downloadViewActionPresenter.splitAnalyticsMapper.getSplitTypesAsString(!download.getSplits().isEmpty(), list), C9801m.m32341a(download.getStoreName(), "catappult"), download.getAppCategory(), download.getSize());
        }
    }

    private final C11231b downgradeApp(final Download download) {
        C11231b c11231bM40083X0 = this.downloadDialogProvider.showDowngradeDialog().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DownloadViewActionPresenter.m40763downgradeApp$lambda9((Boolean) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.d0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                DownloadViewActionPresenter.m40761downgradeApp$lambda10(this.f8681f, (Boolean) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DownloadViewActionPresenter.m40762downgradeApp$lambda11(this.f8708f, download, (Boolean) obj);
            }
        }).m40083X0();
        C9801m.m32345e(c11231bM40083X0, "downloadDialogProvider.s… }\n      .toCompletable()");
        return c11231bM40083X0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downgradeApp$lambda-10, reason: not valid java name */
    public static final void m40761downgradeApp$lambda10(DownloadViewActionPresenter downloadViewActionPresenter, Boolean bool) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        downloadViewActionPresenter.downloadDialogProvider.showDowngradingSnackBar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downgradeApp$lambda-11, reason: not valid java name */
    public static final C11231b m40762downgradeApp$lambda11(DownloadViewActionPresenter downloadViewActionPresenter, Download download, Boolean bool) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        C9801m.m32346f(download, "$download");
        return downloadViewActionPresenter.downloadApp(download);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downgradeApp$lambda-9, reason: not valid java name */
    public static final Boolean m40763downgradeApp$lambda9(Boolean bool) {
        return bool;
    }

    private final C11231b downloadApp(final Download download) {
        C11231b c11231bM40083X0 = C11234e.m40049p(new InterfaceCallableC11255d() { // from class: cm.aptoide.pt.download.view.b0
            @Override // p456rx.p460m.InterfaceCallableC11255d, java.util.concurrent.Callable
            public final Object call() {
                return DownloadViewActionPresenter.m40764downloadApp$lambda14(this.f8674f, download);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.z
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DownloadViewActionPresenter.m40767downloadApp$lambda21(this.f8761f, download, (Download) obj);
            }
        }).m40083X0();
        C9801m.m32345e(c11231bM40083X0, "defer {\n      if (instal… }\n      .toCompletable()");
        return c11231bM40083X0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp$lambda-14, reason: not valid java name */
    public static final C11234e m40764downloadApp$lambda14(final DownloadViewActionPresenter downloadViewActionPresenter, final Download download) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        C9801m.m32346f(download, "$download");
        return downloadViewActionPresenter.installManager.showWarning() ? downloadViewActionPresenter.downloadDialogProvider.showRootInstallWarningPopup().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.p
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                DownloadViewActionPresenter.m40765downloadApp$lambda14$lambda12(this.f8747f, (Boolean) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.x
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DownloadViewActionPresenter.m40766downloadApp$lambda14$lambda13(download, (Boolean) obj);
            }
        }) : C11234e.m40025S(download);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp$lambda-14$lambda-12, reason: not valid java name */
    public static final void m40765downloadApp$lambda14$lambda12(DownloadViewActionPresenter downloadViewActionPresenter, Boolean bool) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        InstallManager installManager = downloadViewActionPresenter.installManager;
        C9801m.m32345e(bool, "answer");
        installManager.rootInstallAllowed(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp$lambda-14$lambda-13, reason: not valid java name */
    public static final Download m40766downloadApp$lambda14$lambda13(Download download, Boolean bool) {
        C9801m.m32346f(download, "$download");
        return download;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp$lambda-21, reason: not valid java name */
    public static final C11234e m40767downloadApp$lambda21(final DownloadViewActionPresenter downloadViewActionPresenter, final Download download, Download download2) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        C9801m.m32346f(download, "$download");
        return downloadViewActionPresenter.permissionManager.requestDownloadAccessWithWifiBypass(downloadViewActionPresenter.permissionService, download.getSize()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.h0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DownloadViewActionPresenter.m40768downloadApp$lambda21$lambda16(this.f8692f, download, (Void) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DownloadViewActionPresenter.m40770downloadApp$lambda21$lambda17(this.f8697f, download, (Void) obj);
            }
        }).m40095j0(downloadViewActionPresenter.ioScheduler).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.s
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DownloadViewActionPresenter.m40771downloadApp$lambda21$lambda20(this.f8750f, download, (DynamicSplitsModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp$lambda-21$lambda-16, reason: not valid java name */
    public static final C11234e m40768downloadApp$lambda21$lambda16(final DownloadViewActionPresenter downloadViewActionPresenter, final Download download, Void r3) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        C9801m.m32346f(download, "$download");
        return downloadViewActionPresenter.permissionManager.requestExternalStoragePermission(downloadViewActionPresenter.permissionService).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.m
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                DownloadViewActionPresenter.m40769downloadApp$lambda21$lambda16$lambda15(this.f8705f, download, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp$lambda-21$lambda-16$lambda-15, reason: not valid java name */
    public static final void m40769downloadApp$lambda21$lambda16$lambda15(DownloadViewActionPresenter downloadViewActionPresenter, Download download, Throwable th) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        C9801m.m32346f(download, "$download");
        DownloadAnalytics downloadAnalytics = downloadViewActionPresenter.downloadAnalytics;
        String packageName = download.getPackageName();
        int versionCode = download.getVersionCode();
        DownloadStatusModel downloadModel = download.getDownloadModel();
        C9801m.m32343c(downloadModel);
        downloadAnalytics.sendDownloadAbortEvent(packageName, versionCode, downloadViewActionPresenter.mapDownloadAction(downloadModel.getAction()), download.getDownloadModel().getAction() == DownloadStatusModel.Action.MIGRATE, !download.getSplits().isEmpty(), download.getHasBilling() || download.getHasAdvertising(), download.getMalware().getRank().name(), download.getStoreName(), downloadViewActionPresenter.isInApkfyContext, download.getObb() != null, C9801m.m32341a(download.getStoreName(), "catappult"), download.getAppCategory(), download.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp$lambda-21$lambda-17, reason: not valid java name */
    public static final Single m40770downloadApp$lambda21$lambda17(DownloadViewActionPresenter downloadViewActionPresenter, Download download, Void r2) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        C9801m.m32346f(download, "$download");
        return C9059d.m29126d(downloadViewActionPresenter.dynamicSplitsManager.getAppSplitsByMd5(download.getMd5()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp$lambda-21$lambda-20, reason: not valid java name */
    public static final C11231b m40771downloadApp$lambda21$lambda20(final DownloadViewActionPresenter downloadViewActionPresenter, final Download download, DynamicSplitsModel dynamicSplitsModel) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        C9801m.m32346f(download, "$download");
        return downloadViewActionPresenter.createDownload(download, dynamicSplitsModel.getDynamicSplitsList()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.i
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                DownloadViewActionPresenter.m40772downloadApp$lambda21$lambda20$lambda18(this.f8694f, download, (RoomDownload) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.u
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DownloadViewActionPresenter.m40773downloadApp$lambda21$lambda20$lambda19(this.f8754f, (RoomDownload) obj);
            }
        }).m40083X0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp$lambda-21$lambda-20$lambda-18, reason: not valid java name */
    public static final void m40772downloadApp$lambda21$lambda20$lambda18(DownloadViewActionPresenter downloadViewActionPresenter, Download download, RoomDownload roomDownload) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        C9801m.m32346f(download, "$download");
        C9801m.m32345e(roomDownload, "roomDownload");
        long appId = download.getAppId();
        DownloadStatusModel downloadModel = download.getDownloadModel();
        C9801m.m32343c(downloadModel);
        downloadViewActionPresenter.setupDownloadEvents(roomDownload, appId, downloadModel.getAction(), download.getStoreName(), download.getMalware().getRank().name(), download.getAppCategory());
        if (DownloadStatusModel.Action.MIGRATE == download.getDownloadModel().getAction()) {
            InstallAnalytics installAnalytics = downloadViewActionPresenter.installAnalytics;
            String packageName = download.getPackageName();
            AnalyticsManager.Action action = AnalyticsManager.Action.INSTALL;
            DownloadAnalytics.AppContext appContext = downloadViewActionPresenter.analyticsContext;
            if (appContext == null) {
                C9801m.m32363w("analyticsContext");
                appContext = null;
            }
            installAnalytics.uninstallStarted(packageName, action, appContext);
            downloadViewActionPresenter.appcMigrationManager.addMigrationCandidate(download.getPackageName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp$lambda-21$lambda-20$lambda-19, reason: not valid java name */
    public static final C11231b m40773downloadApp$lambda21$lambda20$lambda19(DownloadViewActionPresenter downloadViewActionPresenter, RoomDownload roomDownload) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        return downloadViewActionPresenter.installManager.m8236x(roomDownload);
    }

    private final Origin getOrigin(int action) {
        return action != 0 ? action != 1 ? action != 2 ? Origin.INSTALL : Origin.DOWNGRADE : Origin.UPDATE : Origin.INSTALL;
    }

    private final C11231b handleOutOfSpaceError(final DownloadClick downloadClick) {
        C11231b c11231bM39981n = C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.download.view.k
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                DownloadViewActionPresenter.m40774handleOutOfSpaceError$lambda6(this.f8701f, downloadClick);
            }
        }).m39973a(this.downloadNavigator.openOutOfSpaceDialog(downloadClick.getDownload().getSize(), downloadClick.getDownload().getPackageName())).m39974b(this.downloadNavigator.outOfSpaceDialogResult().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.g0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DownloadViewActionPresenter.m40775handleOutOfSpaceError$lambda7((OutOfSpaceNavigatorWrapper) obj);
            }
        })).m40057E().m40083X0().m39973a(resumeDownload(downloadClick)).m39981n(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.w
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                DownloadViewActionPresenter.m40776handleOutOfSpaceError$lambda8((Throwable) obj);
            }
        });
        C9801m.m32345e(c11231bM39981n, "fromAction {\n      downl…printStackTrace()\n      }");
        return c11231bM39981n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOutOfSpaceError$lambda-6, reason: not valid java name */
    public static final void m40774handleOutOfSpaceError$lambda6(DownloadViewActionPresenter downloadViewActionPresenter, DownloadClick downloadClick) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        C9801m.m32346f(downloadClick, "$downloadClick");
        downloadViewActionPresenter.downloadAnalytics.sendNotEnoughSpaceError(downloadClick.getDownload().getMd5());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOutOfSpaceError$lambda-7, reason: not valid java name */
    public static final Boolean m40775handleOutOfSpaceError$lambda7(OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper) {
        return Boolean.valueOf(outOfSpaceNavigatorWrapper.getClearedSuccessfully());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOutOfSpaceError$lambda-8, reason: not valid java name */
    public static final void m40776handleOutOfSpaceError$lambda8(Throwable th) {
        if (th != null) {
            th.printStackTrace();
        }
    }

    private final C11231b installApp(DownloadClick downloadClick) {
        DownloadStatusModel downloadModel = downloadClick.getDownload().getDownloadModel();
        DownloadAnalytics.AppContext appContext = null;
        DownloadStatusModel.Action action = downloadModel != null ? downloadModel.getAction() : null;
        int i2 = action == null ? -1 : WhenMappings.$EnumSwitchMapping$1[action.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            C11231b c11231bDownloadApp = downloadApp(downloadClick.getDownload());
            DownloadAnalytics.AppContext appContext2 = this.analyticsContext;
            if (appContext2 == null) {
                C9801m.m32363w("analyticsContext");
            } else {
                appContext = appContext2;
            }
            C11231b c11231bM39973a = c11231bDownloadApp.m39973a(appContext.equals(DownloadAnalytics.AppContext.SEARCH) ? C9059d.m29123a(this.campaignManager.convertCampaign(downloadClick.getDownload().getCampaign(), SearchAnalytics.SEARCH)) : C11231b.m39946e());
            C9801m.m32345e(c11231bM39973a, "downloadApp(downloadClic…            }\n          )");
            return c11231bM39973a;
        }
        if (i2 != 4) {
            if (i2 == 5) {
                return this.downloadNavigator.openApp(downloadClick.getDownload().getPackageName());
            }
            C11231b c11231bM39946e = C11231b.m39946e();
            C9801m.m32345e(c11231bM39946e, "complete()");
            return c11231bM39946e;
        }
        C11231b c11231bDowngradeApp = downgradeApp(downloadClick.getDownload());
        DownloadAnalytics.AppContext appContext3 = this.analyticsContext;
        if (appContext3 == null) {
            C9801m.m32363w("analyticsContext");
        } else {
            appContext = appContext3;
        }
        C11231b c11231bM39973a2 = c11231bDowngradeApp.m39973a(appContext.equals(DownloadAnalytics.AppContext.SEARCH) ? C9059d.m29123a(this.campaignManager.convertCampaign(downloadClick.getDownload().getCampaign(), SearchAnalytics.SEARCH)) : C11231b.m39946e());
        C9801m.m32345e(c11231bM39973a2, "downgradeApp(downloadCli…            }\n          )");
        return c11231bM39973a2;
    }

    private final InstallType mapDownloadAction(DownloadStatusModel.Action downloadAction) {
        int i2 = WhenMappings.$EnumSwitchMapping$1[downloadAction.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return InstallType.UPDATE;
            }
            if (i2 == 3) {
                return InstallType.INSTALL;
            }
            if (i2 == 4) {
                return InstallType.DOWNGRADE;
            }
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        throw new IllegalStateException("Mapping an invalid download action " + downloadAction.name());
    }

    private final C11231b pauseDownload(final DownloadClick downloadClick) {
        C11231b c11231bM39973a = C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.download.view.l
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                DownloadViewActionPresenter.m40777pauseDownload$lambda27(this.f8703f, downloadClick);
            }
        }).m39973a(this.installManager.pauseInstall(downloadClick.getDownload().getMd5()));
        C9801m.m32345e(c11231bM39973a, "fromAction {\n      downl…nloadClick.download.md5))");
        return c11231bM39973a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pauseDownload$lambda-27, reason: not valid java name */
    public static final void m40777pauseDownload$lambda27(DownloadViewActionPresenter downloadViewActionPresenter, DownloadClick downloadClick) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        C9801m.m32346f(downloadClick, "$downloadClick");
        downloadViewActionPresenter.downloadAnalytics.downloadInteractEvent(downloadClick.getDownload().getPackageName(), "pause");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: present$lambda-0, reason: not valid java name */
    public static final Boolean m40778present$lambda0(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: present$lambda-3, reason: not valid java name */
    public static final C11234e m40779present$lambda3(final DownloadViewActionPresenter downloadViewActionPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        return downloadViewActionPresenter.getEventObservable().m40053B0(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.y
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DownloadViewActionPresenter.m40780present$lambda3$lambda1((DownloadClick) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DownloadViewActionPresenter.m40781present$lambda3$lambda2(this.f8691f, (DownloadClick) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: present$lambda-3$lambda-1, reason: not valid java name */
    public static final Boolean m40780present$lambda3$lambda1(DownloadClick downloadClick) {
        return Boolean.valueOf(downloadClick.getAction() == DownloadEvent.GENERIC_ERROR || downloadClick.getAction() == DownloadEvent.OUT_OF_SPACE_ERROR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: present$lambda-3$lambda-2, reason: not valid java name */
    public static final C11231b m40781present$lambda3$lambda2(DownloadViewActionPresenter downloadViewActionPresenter, DownloadClick downloadClick) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        switch (WhenMappings.$EnumSwitchMapping$0[downloadClick.getAction().ordinal()]) {
            case 1:
                C9801m.m32345e(downloadClick, "event");
                return downloadViewActionPresenter.installApp(downloadClick);
            case 2:
                C9801m.m32345e(downloadClick, "event");
                return downloadViewActionPresenter.resumeDownload(downloadClick);
            case 3:
                C9801m.m32345e(downloadClick, "event");
                return downloadViewActionPresenter.pauseDownload(downloadClick);
            case 4:
                C9801m.m32345e(downloadClick, "event");
                return downloadViewActionPresenter.cancelDownload(downloadClick);
            case 5:
                return downloadViewActionPresenter.downloadDialogProvider.showGenericError();
            case 6:
                C9801m.m32345e(downloadClick, "event");
                return downloadViewActionPresenter.handleOutOfSpaceError(downloadClick);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: present$lambda-4, reason: not valid java name */
    public static final void m40782present$lambda4(DownloadClick downloadClick) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: present$lambda-5, reason: not valid java name */
    public static final void m40783present$lambda5(DownloadViewActionPresenter downloadViewActionPresenter, Throwable th) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        downloadViewActionPresenter.crashReport.log(th);
    }

    private final C11231b resumeDownload(final DownloadClick downloadClick) {
        C11231b c11231bM39921j = this.installManager.getDownload(downloadClick.getDownload().getMd5()).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.a0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                DownloadViewActionPresenter.m40784resumeDownload$lambda24(downloadClick, this, (RoomDownload) obj);
            }
        }).m39917e(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.g
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.f0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DownloadViewActionPresenter.m40786resumeDownload$lambda26(this.f8688f, (RoomDownload) obj);
            }
        });
        C9801m.m32345e(c11231bM39921j, "installManager.getDownlo…nager.install(download) }");
        return c11231bM39921j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resumeDownload$lambda-24, reason: not valid java name */
    public static final void m40784resumeDownload$lambda24(DownloadClick downloadClick, DownloadViewActionPresenter downloadViewActionPresenter, RoomDownload roomDownload) {
        C9801m.m32346f(downloadClick, "$downloadClick");
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        Download download = downloadClick.getDownload();
        C9801m.m32345e(roomDownload, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        long appId = download.getAppId();
        DownloadStatusModel downloadModel = download.getDownloadModel();
        C9801m.m32343c(downloadModel);
        downloadViewActionPresenter.setupDownloadEvents(roomDownload, appId, downloadModel.getAction(), download.getStoreName(), download.getMalware().getRank().name(), download.getAppCategory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resumeDownload$lambda-26, reason: not valid java name */
    public static final C11231b m40786resumeDownload$lambda26(DownloadViewActionPresenter downloadViewActionPresenter, RoomDownload roomDownload) {
        C9801m.m32346f(downloadViewActionPresenter, "this$0");
        return downloadViewActionPresenter.installManager.m8236x(roomDownload);
    }

    public final int parseDownloadAction(DownloadStatusModel.Action action) {
        C9801m.m32346f(action, "action");
        int i2 = WhenMappings.$EnumSwitchMapping$1[action.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 3) {
                return 0;
            }
            if (i2 != 4) {
                throw new IllegalArgumentException("Invalid action " + action);
            }
        }
        return 2;
    }

    @Override // cm.aptoide.p092pt.presenter.ActionPresenter
    protected void present() {
        if (this.analyticsContext == null) {
            throw new IllegalStateException("setContextParams must be called!");
        }
        getLifecycleView().getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DownloadViewActionPresenter.m40778present$lambda0((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.r
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return DownloadViewActionPresenter.m40779present$lambda3(this.f8749f, (View.LifecycleEvent) obj);
            }
        }).m40091f(getLifecycleView().bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.i0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                DownloadViewActionPresenter.m40782present$lambda4((DownloadClick) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.c0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                DownloadViewActionPresenter.m40783present$lambda5(this.f8679f, (Throwable) obj);
            }
        });
    }

    public final void setContextParams(DownloadAnalytics.AppContext context, boolean isApkfy, String editorsChoicePosition) {
        C9801m.m32346f(context, "context");
        this.analyticsContext = context;
        this.isInApkfyContext = isApkfy;
        this.editorsChoicePosition = editorsChoicePosition;
    }

    public final void setupDownloadEvents(RoomDownload download, long appId, DownloadStatusModel.Action downloadAction, String storeName, String malwareRank, String appCategory) {
        DownloadAnalytics.AppContext appContext;
        C9801m.m32346f(download, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        C9801m.m32346f(downloadAction, "downloadAction");
        C9801m.m32346f(malwareRank, "malwareRank");
        C9801m.m32346f(appCategory, "appCategory");
        int campaignId = this.notificationAnalytics.getCampaignId(download.getPackageName(), appId);
        String abTestingGroup = this.notificationAnalytics.getAbTestingGroup(download.getPackageName(), appId);
        InstallAnalytics installAnalytics = this.installAnalytics;
        String packageName = download.getPackageName();
        int versionCode = download.getVersionCode();
        AnalyticsManager.Action action = AnalyticsManager.Action.INSTALL;
        DownloadAnalytics.AppContext appContext2 = this.analyticsContext;
        if (appContext2 == null) {
            C9801m.m32363w("analyticsContext");
            appContext = null;
        } else {
            appContext = appContext2;
        }
        Origin origin = getOrigin(download.getAction());
        DownloadStatusModel.Action action2 = DownloadStatusModel.Action.MIGRATE;
        boolean z = downloadAction == action2;
        boolean zHasAppc = download.hasAppc();
        boolean zHasSplits = download.hasSplits();
        boolean z2 = this.isInApkfyContext;
        boolean zHasObbs = download.hasObbs();
        SplitAnalyticsMapper splitAnalyticsMapper = this.splitAnalyticsMapper;
        List<RoomFileToDownload> splits = download.getSplits();
        C9801m.m32345e(splits, "download.splits");
        installAnalytics.installStarted(packageName, versionCode, action, appContext, origin, campaignId, abTestingGroup, z, zHasAppc, zHasSplits, malwareRank, storeName, z2, zHasObbs, splitAnalyticsMapper.getSplitTypesAsString(splits), C10546u.m37516r(storeName, "catappult", false, 2, null), appCategory, download.getSize());
        if (action2 == downloadAction) {
            DownloadAnalytics downloadAnalytics = this.downloadAnalytics;
            String md5 = download.getMd5();
            int versionCode2 = download.getVersionCode();
            String packageName2 = download.getPackageName();
            String str = this.editorsChoicePosition;
            InstallType installType = InstallType.UPDATE_TO_APPC;
            boolean zHasAppc2 = download.hasAppc();
            boolean zHasSplits2 = download.hasSplits();
            boolean z3 = this.isInApkfyContext;
            boolean zHasObbs2 = download.hasObbs();
            SplitAnalyticsMapper splitAnalyticsMapper2 = this.splitAnalyticsMapper;
            List<RoomFileToDownload> splits2 = download.getSplits();
            C9801m.m32345e(splits2, "download.splits");
            downloadAnalytics.migrationClicked(md5, versionCode2, packageName2, malwareRank, str, installType, action, zHasAppc2, zHasSplits2, storeName, z3, zHasObbs2, splitAnalyticsMapper2.getSplitTypesAsString(splits2), C10546u.m37516r(storeName, "catappult", false, 2, null), appCategory, download.getSize());
            return;
        }
        DownloadAnalytics downloadAnalytics2 = this.downloadAnalytics;
        String md52 = download.getMd5();
        int versionCode3 = download.getVersionCode();
        String packageName3 = download.getPackageName();
        String str2 = this.editorsChoicePosition;
        InstallType installTypeMapDownloadAction = mapDownloadAction(downloadAction);
        boolean zHasAppc3 = download.hasAppc();
        boolean zHasSplits3 = download.hasSplits();
        boolean z4 = this.isInApkfyContext;
        boolean zHasObbs3 = download.hasObbs();
        SplitAnalyticsMapper splitAnalyticsMapper3 = this.splitAnalyticsMapper;
        List<RoomFileToDownload> splits3 = download.getSplits();
        C9801m.m32345e(splits3, "download.splits");
        downloadAnalytics2.installClicked(md52, versionCode3, packageName3, malwareRank, str2, installTypeMapDownloadAction, action, zHasAppc3, zHasSplits3, storeName, z4, zHasObbs3, splitAnalyticsMapper3.getSplitTypesAsString(splits3), C10546u.m37516r(storeName, "catappult", false, 2, null), appCategory, download.getSize());
    }
}
