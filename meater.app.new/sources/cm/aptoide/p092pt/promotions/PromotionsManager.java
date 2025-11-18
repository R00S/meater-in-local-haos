package cm.aptoide.p092pt.promotions;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.aab.DynamicSplitsManager;
import cm.aptoide.p092pt.aab.DynamicSplitsModel;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.app.DownloadStateParser;
import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.download.SplitAnalyticsMapper;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.install.Install;
import cm.aptoide.p092pt.install.InstallAnalytics;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.notification.NotificationAnalytics;
import cm.aptoide.p092pt.promotions.Promotion;
import cm.aptoide.p092pt.wallet.WalletAppProvider;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p319g.p320a.p321a.p322a.C9059d;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class PromotionsManager {
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final DownloadFactory downloadFactory;
    private final DownloadStateParser downloadStateParser;
    private final DynamicSplitsManager dynamicSplitsManager;
    private final InstallAnalytics installAnalytics;
    private final InstallManager installManager;
    private final MoPubAdsManager moPubAdsManager;
    private final NotificationAnalytics notificationAnalytics;
    private final PackageManager packageManager;
    private final PromotionViewAppMapper promotionViewAppMapper;
    private final PromotionsAnalytics promotionsAnalytics;
    private final PromotionsService promotionsService;
    private final SplitAnalyticsMapper splitAnalyticsMapper;
    private final WalletAppProvider walletAppProvider;

    public PromotionsManager(PromotionViewAppMapper promotionViewAppMapper, InstallManager installManager, DownloadFactory downloadFactory, DownloadStateParser downloadStateParser, PromotionsAnalytics promotionsAnalytics, NotificationAnalytics notificationAnalytics, InstallAnalytics installAnalytics, PackageManager packageManager, PromotionsService promotionsService, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, MoPubAdsManager moPubAdsManager, WalletAppProvider walletAppProvider, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper) {
        this.promotionViewAppMapper = promotionViewAppMapper;
        this.installManager = installManager;
        this.downloadFactory = downloadFactory;
        this.downloadStateParser = downloadStateParser;
        this.promotionsAnalytics = promotionsAnalytics;
        this.notificationAnalytics = notificationAnalytics;
        this.installAnalytics = installAnalytics;
        this.packageManager = packageManager;
        this.promotionsService = promotionsService;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository;
        this.moPubAdsManager = moPubAdsManager;
        this.walletAppProvider = walletAppProvider;
        this.dynamicSplitsManager = dynamicSplitsManager;
        this.splitAnalyticsMapper = splitAnalyticsMapper;
    }

    private int getTotalAppc(List<PromotionApp> list) {
        Iterator<PromotionApp> it = list.iterator();
        int appcValue = 0;
        while (it.hasNext()) {
            appcValue = (int) (appcValue + it.next().getAppcValue());
        }
        return appcValue;
    }

    private boolean isWalletInstalled() {
        Iterator<ApplicationInfo> it = this.packageManager.getInstalledApplications(0).iterator();
        while (it.hasNext()) {
            if (it.next().packageName.equals(AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8520b(PromotionViewApp promotionViewApp, DynamicSplitsModel dynamicSplitsModel) {
        return C11234e.m40025S(this.downloadFactory.create(this.downloadStateParser.parseDownloadAction(promotionViewApp.getDownloadModel().getAction()), promotionViewApp.getName(), promotionViewApp.getPackageName(), promotionViewApp.getMd5(), promotionViewApp.getAppIcon(), promotionViewApp.getVersionName(), promotionViewApp.getVersionCode(), promotionViewApp.getDownloadPath(), promotionViewApp.getAlternativePath(), promotionViewApp.getObb(), promotionViewApp.hasAppc(), promotionViewApp.getSize(), promotionViewApp.getSplits(), promotionViewApp.getRequiredSplits(), promotionViewApp.getRank(), promotionViewApp.getStoreName(), dynamicSplitsModel.getDynamicSplitsList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8521c(PromotionViewApp promotionViewApp, RoomDownload roomDownload) {
        lambda$resumeDownload$7(roomDownload, promotionViewApp.getPackageName(), promotionViewApp.getAppId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8522d(RoomDownload roomDownload) {
        return this.installManager.lambda$startInstalls$25(roomDownload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getDownload$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ PromotionViewApp m8523e(PromotionApp promotionApp, Install install) {
        return this.promotionViewAppMapper.mapInstallToPromotionApp(install, promotionApp);
    }

    static /* synthetic */ String lambda$getPackageSignature$9(RoomInstalled roomInstalled) {
        return roomInstalled != null ? roomInstalled.getSignature() : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    static /* synthetic */ Iterable lambda$getPromotionsForPackage$2(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getPromotionsModel$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ PromotionsModel m8524f(PromotionMeta promotionMeta, List list) {
        return new PromotionsModel(promotionMeta.getPromotionId(), list, promotionMeta.getTitle(), promotionMeta.getBackground(), isWalletInstalled(), false, promotionMeta.getDescription(), promotionMeta.getDialogDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getPromotionsModel$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8525g(List list) {
        if (list.isEmpty()) {
            return Single.m39913m(PromotionsModel.ofError());
        }
        final PromotionMeta promotionMeta = (PromotionMeta) list.get(0);
        return getPromotionApps(promotionMeta.getPromotionId()).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.n2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10819f.m8524f(promotionMeta, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8527i(RoomDownload roomDownload) {
        return this.installManager.lambda$startInstalls$25(roomDownload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Promotion mapPromotionAction(Promotion promotion) {
        String promotionId = promotion.getPromotionId();
        promotionId.hashCode();
        if (promotionId.equals("BONUS_MIGRATION_19")) {
            promotion.setClaimActions(Collections.singletonList(Promotion.ClaimAction.MIGRATE));
        } else if (promotionId.equals("BONUS_GAME_WALLET_OFFER_19")) {
            promotion.setClaimActions(Arrays.asList(Promotion.ClaimAction.INSTALL, Promotion.ClaimAction.MIGRATE));
        }
        return promotion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupDownloadEvents, reason: merged with bridge method [inline-methods] */
    public void m8526h(RoomDownload roomDownload, String str, long j2) {
        int campaignId = this.notificationAnalytics.getCampaignId(str, j2);
        String abTestingGroup = this.notificationAnalytics.getAbTestingGroup(str, j2);
        this.promotionsAnalytics.setupDownloadEvents(roomDownload, campaignId, abTestingGroup, AnalyticsManager.Action.CLICK, this.downloadStateParser.getOrigin(roomDownload.getAction()), roomDownload.hasSplits());
        this.installAnalytics.installStarted(roomDownload.getPackageName(), roomDownload.getVersionCode(), AnalyticsManager.Action.INSTALL, DownloadAnalytics.AppContext.PROMOTIONS, this.downloadStateParser.getOrigin(roomDownload.getAction()), campaignId, abTestingGroup, false, roomDownload.hasAppc(), roomDownload.hasSplits(), roomDownload.getTrustedBadge(), roomDownload.getStoreName(), false, roomDownload.hasObbs(), this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()), roomDownload.getStoreName().equals("catappult"), HttpUrl.FRAGMENT_ENCODE_SET, roomDownload.getSize());
    }

    public void allowRootInstall(Boolean bool) {
        this.installManager.rootInstallAllowed(bool.booleanValue());
    }

    public C11231b cancelDownload(String str, String str2, int i2) {
        return this.installManager.cancelInstall(str, str2, i2);
    }

    public Single<ClaimStatusWrapper> claimPromotion(String str, String str2, String str3) {
        return this.promotionsService.claimPromotion(str, str2, str3);
    }

    public C11231b downloadApp(final PromotionViewApp promotionViewApp) {
        return C9059d.m29126d(this.dynamicSplitsManager.getAppSplitsByMd5(promotionViewApp.getMd5())).m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.j2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10779f.m8520b(promotionViewApp, (DynamicSplitsModel) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.k2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10790f.m8521c(promotionViewApp, (RoomDownload) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.i2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10770f.m8522d((RoomDownload) obj);
            }
        }).m40083X0();
    }

    public Promotion getClaimablePromotion(List<Promotion> list, Promotion.ClaimAction claimAction) {
        for (Promotion promotion : list) {
            if (promotion.getClaimActions().contains(claimAction) && promotion.isClaimable()) {
                return promotion;
            }
        }
        return null;
    }

    public C11234e<PromotionViewApp> getDownload(final PromotionApp promotionApp) {
        return this.installManager.getInstall(promotionApp.getMd5(), promotionApp.getPackageName(), promotionApp.getVersionCode()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.m2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10808f.m8523e(promotionApp, (Install) obj);
            }
        });
    }

    public C11234e<String> getPackageSignature(String str) {
        return this.aptoideInstalledAppsRepository.getInstalled(str).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.s2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return PromotionsManager.lambda$getPackageSignature$9((RoomInstalled) obj);
            }
        });
    }

    public Single<List<PromotionApp>> getPromotionApps(String str) {
        return this.promotionsService.getPromotionApps(str);
    }

    public C11234e<List<Promotion>> getPromotionsForPackage(String str) {
        return this.promotionsService.getPromotionsForPackage(str).m39915A().m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.p2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                PromotionsManager.lambda$getPromotionsForPackage$2(list);
                return list;
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.l2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10799f.mapPromotionAction((Promotion) obj);
            }
        }).m40084Y0();
    }

    public Single<PromotionsModel> getPromotionsModel(String str) {
        return this.promotionsService.getPromotions(str).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.o2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10830f.m8525g((List) obj);
            }
        });
    }

    public String getWalletAddress() {
        return this.promotionsService.getWalletAddress();
    }

    public C11234e<WalletApp> getWalletApp() {
        return this.walletAppProvider.getWalletApp();
    }

    public C11231b pauseDownload(String str) {
        return this.installManager.pauseInstall(str);
    }

    public C11231b resumeDownload(String str, final String str2, final long j2) {
        return this.installManager.getDownload(str).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.r2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10857f.m8526h(str2, j2, (RoomDownload) obj);
            }
        }).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.q2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10849f.m8527i((RoomDownload) obj);
            }
        });
    }

    public void saveWalletAddress(String str) {
        this.promotionsService.saveWalletAddress(str);
    }

    public boolean shouldShowRootInstallWarningPopup() {
        return this.installManager.showWarning();
    }
}
