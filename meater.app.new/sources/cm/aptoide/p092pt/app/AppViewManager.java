package cm.aptoide.p092pt.app;

import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.p092pt.AppCoinsManager;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.aab.DynamicSplitsManager;
import cm.aptoide.p092pt.aab.DynamicSplitsModel;
import cm.aptoide.p092pt.ads.MinimalAd;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.app.appsflyer.AppsFlyerManager;
import cm.aptoide.p092pt.app.migration.AppcMigrationManager;
import cm.aptoide.p092pt.app.mmpcampaigns.CampaignManager;
import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.GenericResponseV2;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.download.InvalidAppException;
import cm.aptoide.p092pt.download.SplitAnalyticsMapper;
import cm.aptoide.p092pt.install.Install;
import cm.aptoide.p092pt.install.InstallAnalytics;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.notification.AppcPromotionNotificationStringProvider;
import cm.aptoide.p092pt.notification.NotificationAnalytics;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSync;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSyncManager;
import cm.aptoide.p092pt.promotions.Promotion;
import cm.aptoide.p092pt.promotions.PromotionsManager;
import cm.aptoide.p092pt.promotions.WalletApp;
import cm.aptoide.p092pt.search.model.SearchAdResult;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.view.app.AppCenter;
import cm.aptoide.p092pt.view.app.AppsList;
import cm.aptoide.p092pt.view.app.FlagsVote;
import java.util.List;
import okhttp3.HttpUrl;
import p319g.p320a.p321a.p322a.C9059d;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11257f;
import p456rx.p460m.InterfaceC11258g;

/* loaded from: classes.dex */
public class AppViewManager {
    private final AdsManager adsManager;
    private final AppCenter appCenter;
    private final AppCoinsManager appCoinsManager;
    private final AppViewAnalytics appViewAnalytics;
    private final AppViewModelManager appViewModelManager;
    private final AppcMigrationManager appcMigrationManager;
    private final AppcPromotionNotificationStringProvider appcPromotionNotificationStringProvider;
    private AppsFlyerManager appsFlyerManager;
    private final AptoideAccountManager aptoideAccountManager;
    private SimilarAppsViewModel cachedAppcSimilarAppsViewModel;
    private PromotionViewModel cachedPromotionViewModel;
    private SimilarAppsViewModel cachedSimilarAppsViewModel;
    private CampaignManager campaignManager;
    private final DownloadFactory downloadFactory;
    private final DownloadStateParser downloadStateParser;
    private final DynamicSplitsManager dynamicSplitsManager;
    private final FlagManager flagManager;
    private final InstallAnalytics installAnalytics;
    private final InstallManager installManager;
    private final int limit;
    private final LocalNotificationSyncManager localNotificationSyncManager;
    private final String marketName;
    private final MoPubAdsManager moPubAdsManager;
    private final NotificationAnalytics notificationAnalytics;
    private final PromotionsManager promotionsManager;
    private final ReviewsManager reviewsManager;
    private SearchAdResult searchAdResult;
    private final SplitAnalyticsMapper splitAnalyticsMapper;
    private final StoreUtilsProxy storeUtilsProxy;
    private boolean isFirstLoad = true;
    private boolean appcPromotionImpressionSent = false;
    private boolean migrationImpressionSent = false;

    public AppViewManager(AppViewModelManager appViewModelManager, InstallManager installManager, DownloadFactory downloadFactory, AppCenter appCenter, ReviewsManager reviewsManager, AdsManager adsManager, FlagManager flagManager, StoreUtilsProxy storeUtilsProxy, AptoideAccountManager aptoideAccountManager, MoPubAdsManager moPubAdsManager, DownloadStateParser downloadStateParser, AppViewAnalytics appViewAnalytics, NotificationAnalytics notificationAnalytics, InstallAnalytics installAnalytics, int i2, String str, AppCoinsManager appCoinsManager, PromotionsManager promotionsManager, AppcMigrationManager appcMigrationManager, LocalNotificationSyncManager localNotificationSyncManager, AppcPromotionNotificationStringProvider appcPromotionNotificationStringProvider, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper, AppsFlyerManager appsFlyerManager, CampaignManager campaignManager) {
        this.appViewModelManager = appViewModelManager;
        this.installManager = installManager;
        this.downloadFactory = downloadFactory;
        this.appCenter = appCenter;
        this.reviewsManager = reviewsManager;
        this.adsManager = adsManager;
        this.flagManager = flagManager;
        this.storeUtilsProxy = storeUtilsProxy;
        this.aptoideAccountManager = aptoideAccountManager;
        this.moPubAdsManager = moPubAdsManager;
        this.downloadStateParser = downloadStateParser;
        this.appViewAnalytics = appViewAnalytics;
        this.notificationAnalytics = notificationAnalytics;
        this.installAnalytics = installAnalytics;
        this.limit = i2;
        this.marketName = str;
        this.appCoinsManager = appCoinsManager;
        this.promotionsManager = promotionsManager;
        this.appcMigrationManager = appcMigrationManager;
        this.localNotificationSyncManager = localNotificationSyncManager;
        this.appcPromotionNotificationStringProvider = appcPromotionNotificationStringProvider;
        this.dynamicSplitsManager = dynamicSplitsManager;
        this.splitAnalyticsMapper = splitAnalyticsMapper;
        this.appsFlyerManager = appsFlyerManager;
        this.campaignManager = campaignManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createDownload, reason: merged with bridge method [inline-methods] */
    public C11234e<RoomDownload> m7032k(final DownloadModel.Action action, final boolean z, final AppModel appModel, final DynamicSplitsModel dynamicSplitsModel) {
        return C11234e.m40025S(appModel).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.d0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7581f.m7023b(action, appModel, dynamicSplitsModel, (AppModel) obj);
            }
        }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.h0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7601f.m7024c(appModel, action, z, dynamicSplitsModel, (Throwable) obj);
            }
        });
    }

    private C11234e<List<Promotion>> getPromotions() {
        return this.appViewModelManager.getAppModel().m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7585f.m7034m((AppModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$convertCampaign$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7022a(AppModel appModel) {
        return C9059d.m29123a(this.campaignManager.convertCampaign(appModel.getCampaign(), "Appview"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createDownload$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7023b(DownloadModel.Action action, AppModel appModel, DynamicSplitsModel dynamicSplitsModel, AppModel appModel2) {
        return C11234e.m40025S(this.downloadFactory.create(this.downloadStateParser.parseDownloadAction(action), appModel.getAppName(), appModel.getPackageName(), appModel.getMd5(), appModel.getIcon(), appModel.getVersionName(), appModel.getVersionCode(), appModel.getPath(), appModel.getPathAlt(), appModel.getObb(), appModel.hasAdvertising() || appModel.hasBilling(), appModel.getSize(), appModel.getSplits(), appModel.getRequiredSplits(), appModel.getMalware().getRank().toString(), appModel.getStore().getName(), appModel.getOemId(), dynamicSplitsModel.getDynamicSplitsList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createDownload$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7024c(AppModel appModel, DownloadModel.Action action, boolean z, DynamicSplitsModel dynamicSplitsModel, Throwable th) {
        if (th instanceof InvalidAppException) {
            this.appViewAnalytics.sendInvalidAppEventError(appModel.getPackageName(), appModel.getVersionCode(), action, action != null && action.equals(DownloadModel.Action.MIGRATE), !appModel.getSplits().isEmpty(), appModel.hasAdvertising() || appModel.hasBilling(), appModel.getMalware().getRank().toString(), appModel.getStore().getName(), z, th, appModel.getObb() != null, this.splitAnalyticsMapper.getSplitTypesAsString(appModel.hasSplits(), dynamicSplitsModel.getDynamicSplitsList()), appModel.getAppCategory(), appModel.getSize());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7025d(final DownloadModel.Action action, final boolean z, final long j2, final String str, final String str2, final AppModel appModel) {
        return C11234e.m40025S(appModel).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.v
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7655f.m7031j(appModel, (AppModel) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.g0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7590f.m7032k(action, z, appModel, (DynamicSplitsModel) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.o
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7628f.m7033l(action, j2, str, str2, z, appModel, (RoomDownload) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7026e(DownloadModel.Action action, RoomDownload roomDownload) {
        if (action == DownloadModel.Action.MIGRATE) {
            this.appcMigrationManager.addMigrationCandidate(roomDownload.getPackageName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7027f(RoomDownload roomDownload) {
        return this.installManager.m8236x(roomDownload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7028g(WalletApp walletApp, DynamicSplitsModel dynamicSplitsModel) {
        return C11234e.m40025S(this.downloadFactory.create(this.downloadStateParser.parseDownloadAction(walletApp.getDownloadModel().getAction()), walletApp.getAppName(), walletApp.getPackageName(), walletApp.getMd5sum(), walletApp.getIcon(), walletApp.getVersionName(), walletApp.getVersionCode(), walletApp.getPath(), walletApp.getPathAlt(), walletApp.getObb(), false, walletApp.getSize(), walletApp.getSplits(), walletApp.getRequiredSplits(), walletApp.getTrustedBadge(), walletApp.getStoreName(), dynamicSplitsModel.getDynamicSplitsList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7029h(WalletApp walletApp, RoomDownload roomDownload) {
        setupDownloadEvents(roomDownload, walletApp.getDownloadModel().getAction(), walletApp.getId(), walletApp.getStoreName(), walletApp.getTrustedBadge(), false, true, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7030i(RoomDownload roomDownload) {
        return this.installManager.m8236x(roomDownload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7031j(AppModel appModel, AppModel appModel2) {
        return C9059d.m29126d(this.dynamicSplitsManager.getAppSplitsByMd5(appModel.getMd5()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7033l(DownloadModel.Action action, long j2, String str, String str2, boolean z, AppModel appModel, RoomDownload roomDownload) {
        setupDownloadEvents(roomDownload, action, j2, str, str2, roomDownload.getStoreName(), z, appModel.getBdsFlags().contains("STORE_BDS"), appModel.getAppCategory());
        if (DownloadModel.Action.MIGRATE.equals(action)) {
            setupMigratorUninstallEvent(roomDownload.getPackageName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getPromotions$27, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7034m(AppModel appModel) {
        return this.promotionsManager.getPromotionsForPackage(appModel.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadAdsFromAppView$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7035n(AppModel appModel) {
        return this.adsManager.loadAds(appModel.getPackageName(), appModel.getStore().getName()).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.w0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return new SearchAdResult((MinimalAd) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadAppcSimilarAppsViewModel$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ SimilarAppsViewModel m7036o(AppsList appsList) {
        SimilarAppsViewModel similarAppsViewModel = new SimilarAppsViewModel(null, appsList.getList(), appsList.isLoading(), appsList.getError(), null);
        this.cachedAppcSimilarAppsViewModel = similarAppsViewModel;
        return similarAppsViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDownloadModel$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ DownloadModel m7037p(Install install, Boolean bool) {
        return new DownloadModel(this.downloadStateParser.parseDownloadType(install.getType(), bool.booleanValue()), install.getProgress(), this.downloadStateParser.parseDownloadState(install.getState(), install.isIndeterminate()), install.getAppSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadPromotionViewModel$22, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ PromotionViewModel m7038q(PromotionViewModel promotionViewModel, WalletApp walletApp, AppViewModel appViewModel) {
        return lambda$loadPromotionViewModel$24(walletApp, promotionViewModel.getPromotions(), appViewModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadPromotionViewModel$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7040s(List list) {
        return C11234e.m40038d(C11234e.m40025S(list), this.promotionsManager.getWalletApp(), observeAppViewModel(), new InterfaceC11258g() { // from class: cm.aptoide.pt.app.u
            @Override // p456rx.p460m.InterfaceC11258g
            /* renamed from: a */
            public final Object mo6864a(Object obj, Object obj2, Object obj3) {
                return this.f7653a.m7039r((List) obj, (WalletApp) obj2, (AppViewModel) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadPromotionViewModel$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7041t(PromotionViewModel promotionViewModel) {
        this.cachedPromotionViewModel = promotionViewModel;
    }

    static /* synthetic */ ReviewsViewModel lambda$loadReviewsViewModel$0(ReviewRequestResult reviewRequestResult) {
        return new ReviewsViewModel(reviewRequestResult.getReviewList(), reviewRequestResult.isLoading(), reviewRequestResult.getError());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadSimilarAppsViewModel$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ SimilarAppsViewModel m7042u(MinimalAdRequestResult minimalAdRequestResult, AppsList appsList) {
        SimilarAppsViewModel similarAppsViewModel = new SimilarAppsViewModel(minimalAdRequestResult.getAd(), appsList.getList(), appsList.isLoading(), appsList.getError(), minimalAdRequestResult.getError());
        this.cachedSimilarAppsViewModel = similarAppsViewModel;
        return similarAppsViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadSimilarAppsViewModel$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7043v(String str, final MinimalAdRequestResult minimalAdRequestResult) {
        return loadRecommended(this.limit, str).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.c0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7578f.m7042u(minimalAdRequestResult, (AppsList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7044w(DownloadModel.Action action, long j2, String str, boolean z, boolean z2, String str2, RoomDownload roomDownload) {
        setupDownloadEvents(roomDownload, action, j2, roomDownload.getStoreName(), str, z, z2, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7045x(RoomDownload roomDownload) {
        return this.installManager.m8236x(roomDownload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$subscribeStore$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7046y(String str) {
        this.storeUtilsProxy.subscribeStore(str, null, null, this.aptoideAccountManager);
    }

    private Single<AppsList> loadAppcRecommended(int i2, String str) {
        return this.appCenter.loadAppcRecommendedApps(i2, str);
    }

    private Single<AppsList> loadRecommended(int i2, String str) {
        return this.appCenter.loadRecommendedApps(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mergeToPromotionViewModel, reason: merged with bridge method [inline-methods] */
    public PromotionViewModel m7039r(WalletApp walletApp, List<Promotion> list, AppViewModel appViewModel) {
        return new PromotionViewModel(walletApp, list, appViewModel);
    }

    private void setupDownloadEvents(RoomDownload roomDownload, DownloadModel.Action action, long j2, String str, String str2, boolean z, boolean z2, String str3) {
        setupDownloadEvents(roomDownload, action, j2, str2, null, str, z, z2, str3);
    }

    public void allowRootInstall(Boolean bool) {
        this.installManager.rootInstallAllowed(bool.booleanValue());
    }

    public C11231b cancelDownload(String str, String str2, int i2) {
        return this.installManager.cancelInstall(str, str2, i2);
    }

    public C11231b convertCampaign() {
        return getAppModel().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7625f.m7022a((AppModel) obj);
            }
        });
    }

    public C11231b downloadApp(final DownloadModel.Action action, final long j2, final String str, final String str2, final boolean z) {
        return getAppModel().m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.t
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7646f.m7025d(action, z, j2, str, str2, (AppModel) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.r
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7641f.m7026e(action, (RoomDownload) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.b0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7576f.m7027f((RoomDownload) obj);
            }
        }).m40083X0();
    }

    public C11234e<DownloadModel> downloadStarted() {
        return this.appViewModelManager.observeAppViewModel().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.z
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return C11234e.m40025S(((AppViewModel) obj).getDownloadModel());
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.a0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((DownloadModel) obj).isDownloading());
            }
        });
    }

    public Single<Boolean> flagApk(String str, String str2, FlagsVote.VoteType voteType) {
        return this.flagManager.flagApk(str, str2, voteType.name().toLowerCase()).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                GenericResponseV2 genericResponseV2 = (GenericResponseV2) obj;
                return Boolean.valueOf(genericResponseV2.isOk() && !genericResponseV2.hasErrors());
            }
        });
    }

    public Single<AppModel> getAppModel() {
        return this.appViewModelManager.getAppModel();
    }

    public Single<AppViewModel> getAppViewModel() {
        return this.appViewModelManager.getAppViewModel();
    }

    public SimilarAppsViewModel getCachedAppcSimilarAppsViewModel() {
        return this.cachedAppcSimilarAppsViewModel;
    }

    public SimilarAppsViewModel getCachedSimilarAppsViewModel() {
        return this.cachedSimilarAppsViewModel;
    }

    public Promotion getClaimablePromotion(List<Promotion> list, Promotion.ClaimAction claimAction) {
        return this.promotionsManager.getClaimablePromotion(list, claimAction);
    }

    public String getMarketName() {
        return this.marketName;
    }

    public SearchAdResult getSearchAdResult() {
        return this.searchAdResult;
    }

    public void handleAdsLogic(SearchAdResult searchAdResult) {
        this.adsManager.handleAdsLogic(searchAdResult);
    }

    public boolean hasClaimablePromotion(Promotion.ClaimAction claimAction) {
        PromotionViewModel promotionViewModel = this.cachedPromotionViewModel;
        return (promotionViewModel == null || getClaimablePromotion(promotionViewModel.getPromotions(), claimAction) == null) ? false : true;
    }

    public boolean isAppcPromotionImpressionSent() {
        return this.appcPromotionImpressionSent;
    }

    public boolean isMigrationImpressionSent() {
        return this.migrationImpressionSent;
    }

    public Single<SearchAdResult> loadAdsFromAppView() {
        return getAppModel().m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7616f.m7035n((AppModel) obj);
            }
        });
    }

    public Single<SimilarAppsViewModel> loadAppcSimilarAppsViewModel(String str) {
        SimilarAppsViewModel similarAppsViewModel = this.cachedAppcSimilarAppsViewModel;
        return similarAppsViewModel != null ? Single.m39913m(similarAppsViewModel) : loadAppcRecommended(this.limit, str).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7619f.m7036o((AppsList) obj);
            }
        });
    }

    public C11234e<DownloadModel> loadDownloadModel(String str, String str2, int i2, String str3, long j2, boolean z) {
        return C11234e.m40041e(this.installManager.getInstall(str, str2, i2), this.appcMigrationManager.isMigrationApp(str2, str3, i2, j2, z), new InterfaceC11257f() { // from class: cm.aptoide.pt.app.y
            @Override // p456rx.p460m.InterfaceC11257f
            /* renamed from: a */
            public final Object mo6865a(Object obj, Object obj2) {
                return this.f8213f.m7037p((Install) obj, (Boolean) obj2);
            }
        });
    }

    public C11234e<PromotionViewModel> loadPromotionViewModel() {
        C11234e c11234eM40025S = C11234e.m40025S(new PromotionViewModel());
        PromotionViewModel promotionViewModel = this.cachedPromotionViewModel;
        return promotionViewModel != null ? C11234e.m40038d(C11234e.m40025S(promotionViewModel), this.promotionsManager.getWalletApp(), observeAppViewModel(), new InterfaceC11258g() { // from class: cm.aptoide.pt.app.g
            @Override // p456rx.p460m.InterfaceC11258g
            /* renamed from: a */
            public final Object mo6864a(Object obj, Object obj2, Object obj3) {
                return this.f7589a.m7038q((PromotionViewModel) obj, (WalletApp) obj2, (AppViewModel) obj3);
            }
        }) : getPromotions().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                return Boolean.valueOf(!list.isEmpty());
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.s
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7644f.m7040s((List) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.w
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8209f.m7041t((PromotionViewModel) obj);
            }
        }).m40069K0(c11234eM40025S);
    }

    public Single<ReviewsViewModel> loadReviewsViewModel(String str, String str2, String str3) {
        return this.reviewsManager.loadReviews(str, str2, 3, str3).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.e0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AppViewManager.lambda$loadReviewsViewModel$0((ReviewRequestResult) obj);
            }
        });
    }

    public Single<SimilarAppsViewModel> loadSimilarAppsViewModel(final String str, List<String> list) {
        SimilarAppsViewModel similarAppsViewModel = this.cachedSimilarAppsViewModel;
        return similarAppsViewModel != null ? Single.m39913m(similarAppsViewModel) : this.adsManager.loadAd(str, list).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7608f.m7043v(str, (MinimalAdRequestResult) obj);
            }
        });
    }

    public C11234e<AppViewModel> observeAppViewModel() {
        return this.appViewModelManager.observeAppViewModel();
    }

    public C11234e<WalletApp> observeWalletInstallStatus() {
        return this.promotionsManager.getWalletApp();
    }

    public C11231b pauseDownload(String str) {
        return this.installManager.pauseInstall(str);
    }

    public Single<Boolean> registerAppsFlyerImpression(String str) {
        return str.equals("com.igg.android.lordsmobile") ? this.appsFlyerManager.registerImpression() : Single.m39913m(Boolean.TRUE);
    }

    public C11231b resumeDownload(String str, final long j2, final DownloadModel.Action action, final String str2, final boolean z, final boolean z2, final String str3) {
        return this.installManager.getDownload(str).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.h
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7594f.m7044w(action, j2, str2, z, z2, str3, (RoomDownload) obj);
            }
        }).m39917e(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.f0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7580f.m7045x((RoomDownload) obj);
            }
        });
    }

    public void scheduleNotification(String str, String str2, String str3, String str4) {
        this.localNotificationSyncManager.schedule(String.format(this.appcPromotionNotificationStringProvider.getNotificationTitle(), str), this.appcPromotionNotificationStringProvider.getNotificationBody(), str2, C1146R.string.promo_update2appc_notification_claim_button, "aptoideinstall://package=" + str3 + "&store=" + str4 + "&show_install_popup=false", LocalNotificationSync.APPC_CAMPAIGN_NOTIFICATION, 7, LocalNotificationSyncManager.FIVE_MINUTES);
    }

    public void sendAppOpenAnalytics(String str, String str2, String str3, boolean z, boolean z2) {
        if (this.isFirstLoad) {
            this.appViewAnalytics.sendAppViewOpenedFromEvent(str, str2, str3, z, z2);
            this.isFirstLoad = false;
        }
    }

    public void sendEditorsAppOpenAnalytics(String str, String str2, String str3, boolean z, boolean z2, String str4) {
        if (this.isFirstLoad) {
            this.appViewAnalytics.sendAppViewOpenedFromEvent(str, str2, str3, z, z2);
            this.appViewAnalytics.sendEditorsChoiceClickEvent(str, str4);
            this.isFirstLoad = false;
        }
    }

    public void setAppcPromotionImpressionSent() {
        this.appcPromotionImpressionSent = true;
    }

    public void setMigrationImpressionSent() {
        this.migrationImpressionSent = true;
    }

    public void setSearchAdResult(SearchAdResult searchAdResult) {
        this.searchAdResult = searchAdResult;
    }

    public void setupMigratorUninstallEvent(String str) {
        this.installAnalytics.uninstallStarted(str, AnalyticsManager.Action.INSTALL, DownloadAnalytics.AppContext.APPVIEW);
    }

    public boolean shouldShowRootInstallWarningPopup() {
        return this.installManager.showWarning();
    }

    public C11231b subscribeStore(final String str) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.app.p
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7636f.m7046y(str);
            }
        });
    }

    public void unscheduleNotificationSync() {
        this.localNotificationSyncManager.unschedule(LocalNotificationSync.APPC_CAMPAIGN_NOTIFICATION);
    }

    private void setupDownloadEvents(RoomDownload roomDownload, DownloadModel.Action action, long j2, String str, String str2, String str3, boolean z, boolean z2, String str4) {
        int campaignId = this.notificationAnalytics.getCampaignId(roomDownload.getPackageName(), j2);
        String abTestingGroup = this.notificationAnalytics.getAbTestingGroup(roomDownload.getPackageName(), j2);
        this.appViewAnalytics.setupDownloadEvents(roomDownload, campaignId, abTestingGroup, action, AnalyticsManager.Action.CLICK, str, str2, str3, z, this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()), z2, str4);
        this.installAnalytics.installStarted(roomDownload.getPackageName(), roomDownload.getVersionCode(), AnalyticsManager.Action.INSTALL, DownloadAnalytics.AppContext.APPVIEW, this.downloadStateParser.getOrigin(roomDownload.getAction()), campaignId, abTestingGroup, action != null && action.equals(DownloadModel.Action.MIGRATE), roomDownload.hasAppc(), roomDownload.hasSplits(), str, str3, z, roomDownload.hasObbs(), this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()), z2, str4, roomDownload.getSize());
    }

    public C11231b downloadApp(final WalletApp walletApp) {
        return C9059d.m29126d(this.dynamicSplitsManager.getAppSplitsByMd5(walletApp.getMd5sum())).m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7613f.m7028g(walletApp, (DynamicSplitsModel) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.x
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8211f.m7029h(walletApp, (RoomDownload) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7639f.m7030i((RoomDownload) obj);
            }
        }).m40083X0();
    }
}
