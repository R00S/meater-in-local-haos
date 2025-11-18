package cm.aptoide.p092pt.app;

import cm.aptoide.p092pt.AppCoinsManager;
import cm.aptoide.p092pt.account.view.store.StoreManager;
import cm.aptoide.p092pt.app.migration.AppcMigrationManager;
import cm.aptoide.p092pt.app.view.AppCoinsViewModel;
import cm.aptoide.p092pt.bonus.BonusAppcModel;
import cm.aptoide.p092pt.install.Install;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.view.AppViewConfiguration;
import cm.aptoide.p092pt.view.app.AppCenter;
import cm.aptoide.p092pt.view.app.AppStats;
import cm.aptoide.p092pt.view.app.DetailedApp;
import cm.aptoide.p092pt.view.app.DetailedAppRequestResult;
import p319g.p320a.p321a.p322a.C9059d;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11257f;
import p456rx.p460m.InterfaceC11258g;

/* loaded from: classes.dex */
public class AppViewModelManager {
    private final AppCenter appCenter;
    private final AppCoinsAdvertisingManager appCoinsAdvertisingManager;
    private final AppCoinsManager appCoinsManager;
    private final AppViewConfiguration appViewConfiguration;
    private final AppcMigrationManager appcMigrationManager;
    private AppModel cachedApp;
    private AppCoinsViewModel cachedAppCoinsViewModel;
    private final DownloadStateParser downloadStateParser;
    private final InstallManager installManager;
    private final String marketName;
    private final StoreManager storeManager;

    public AppViewModelManager(AppViewConfiguration appViewConfiguration, StoreManager storeManager, String str, AppCenter appCenter, DownloadStateParser downloadStateParser, InstallManager installManager, AppcMigrationManager appcMigrationManager, AppCoinsAdvertisingManager appCoinsAdvertisingManager, AppCoinsManager appCoinsManager) {
        this.appViewConfiguration = appViewConfiguration;
        this.storeManager = storeManager;
        this.marketName = str;
        this.appCenter = appCenter;
        this.downloadStateParser = downloadStateParser;
        this.installManager = installManager;
        this.appcMigrationManager = appcMigrationManager;
        this.appCoinsAdvertisingManager = appCoinsAdvertisingManager;
        this.appCoinsManager = appCoinsManager;
    }

    private Single<AppModel> createAppViewViewModel(final DetailedApp detailedApp) {
        final AppStats stats = detailedApp.getStats();
        return isStoreFollowed(detailedApp.getStore().getId()).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.j0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7610f.m7048b(detailedApp, stats, (Boolean) obj);
            }
        });
    }

    private C11234e<AppCoinsViewModel> getAppCoinsViewModel(final AppModel appModel) {
        AppCoinsViewModel appCoinsViewModel = this.cachedAppCoinsViewModel;
        if (appCoinsViewModel != null) {
            return C11234e.m40025S(appCoinsViewModel);
        }
        Single singleM39913m = Single.m39913m(new BonusAppcModel(false, 0));
        Single<AppCoinsAdvertisingModel> singleM39913m2 = Single.m39913m(new AppCoinsAdvertisingModel());
        if (appModel.hasBilling()) {
            singleM39913m = C9059d.m29126d(this.appCoinsManager.getBonusAppc());
        }
        if (appModel.hasAdvertising()) {
            singleM39913m2 = this.appCoinsAdvertisingManager.getAdvertising(appModel.getPackageName(), appModel.getVersionCode());
        }
        return Single.m39907C(singleM39913m2, singleM39913m, new InterfaceC11257f() { // from class: cm.aptoide.pt.app.n0
            @Override // p456rx.p460m.InterfaceC11257f
            /* renamed from: a */
            public final Object mo6865a(Object obj, Object obj2) {
                return this.f7626f.m7049c(appModel, (AppCoinsAdvertisingModel) obj, (BonusAppcModel) obj2);
            }
        }).m39915A();
    }

    private C11234e<DownloadModel> getDownloadModel(AppModel appModel) {
        return loadDownloadModel(appModel.getMd5(), appModel.getPackageName(), appModel.getVersionCode(), appModel.getSignature(), appModel.getStore().getId(), appModel.hasAdvertising() || appModel.hasBilling());
    }

    private C11234e<MigrationModel> getMigrationModel(AppModel appModel) {
        return this.appcMigrationManager.isAppMigrated(appModel.getPackageName()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.q0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return new MigrationModel(((Boolean) obj).booleanValue());
            }
        });
    }

    private Single<Boolean> isStoreFollowed(long j2) {
        return this.storeManager.isSubscribed(j2).m40057E().m40085Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createAppViewViewModel$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ AppModel m7048b(DetailedApp detailedApp, AppStats appStats, Boolean bool) {
        AppModel appModel = new AppModel(detailedApp.getId(), detailedApp.getName(), detailedApp.getStore(), this.appViewConfiguration.getStoreTheme(), detailedApp.isGoodApp(), detailedApp.getMalware(), detailedApp.getAppFlags(), detailedApp.getTags(), detailedApp.getUsedFeatures(), detailedApp.getUsedPermissions(), detailedApp.getFileSize(), detailedApp.getMd5(), detailedApp.getPath(), detailedApp.getPathAlt(), detailedApp.getVersionCode(), detailedApp.getVersionName(), detailedApp.getPackageName(), detailedApp.getSize(), appStats.getDownloads(), appStats.getGlobalRating(), appStats.getPackageDownloads(), appStats.getRating(), detailedApp.getDeveloper(), detailedApp.getGraphic(), detailedApp.getIcon(), detailedApp.getMedia(), detailedApp.getModified(), detailedApp.getAdded(), detailedApp.getObb(), detailedApp.isLatestTrustedVersion(), detailedApp.getUniqueName(), this.appViewConfiguration.shouldInstall(), this.appViewConfiguration.getAppc(), this.appViewConfiguration.getMinimalAd(), this.appViewConfiguration.getEditorsChoice(), this.appViewConfiguration.getOriginTag(), bool.booleanValue(), this.marketName, detailedApp.hasBilling(), detailedApp.hasAdvertising(), detailedApp.getBdsFlags(), this.appViewConfiguration.getCampaignUrl(), detailedApp.getSignature(), detailedApp.isMature(), detailedApp.getSplits(), detailedApp.getRequiredSplits(), this.appViewConfiguration.getOemId(), detailedApp.isBeta(), detailedApp.getAppCategory(), detailedApp.getCampaign());
        this.cachedApp = appModel;
        return appModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAppCoinsViewModel$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ AppCoinsViewModel m7049c(AppModel appModel, AppCoinsAdvertisingModel appCoinsAdvertisingModel, BonusAppcModel bonusAppcModel) {
        AppCoinsViewModel appCoinsViewModel = new AppCoinsViewModel(false, appModel.hasBilling(), appCoinsAdvertisingModel, bonusAppcModel);
        this.cachedAppCoinsViewModel = appCoinsViewModel;
        return appCoinsViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDownloadModel$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ DownloadModel m7052f(Install install, Boolean bool) {
        return new DownloadModel(this.downloadStateParser.parseDownloadType(install.getType(), bool.booleanValue()), install.getProgress(), this.downloadStateParser.parseDownloadState(install.getState(), install.isIndeterminate()), install.getAppSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeAppViewModel$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7054h(final AppModel appModel) {
        return C11234e.m40038d(getDownloadModel(appModel), getAppCoinsViewModel(appModel), getMigrationModel(appModel), new InterfaceC11258g() { // from class: cm.aptoide.pt.app.l0
            @Override // p456rx.p460m.InterfaceC11258g
            /* renamed from: a */
            public final Object mo6864a(Object obj, Object obj2, Object obj3) {
                return this.f7617a.m7053g(appModel, (DownloadModel) obj, (AppCoinsViewModel) obj2, (MigrationModel) obj3);
            }
        });
    }

    private Single<AppModel> loadAppModel(long j2, String str, String str2) {
        AppModel appModel = this.cachedApp;
        return appModel != null ? Single.m39913m(appModel) : this.appCenter.loadDetailedApp(j2, str, str2).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.m0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7620f.m7050d((DetailedAppRequestResult) obj);
            }
        });
    }

    private Single<AppModel> loadAppModelFromMd5(String str) {
        AppModel appModel = this.cachedApp;
        return (appModel == null || !appModel.getMd5().equals(str)) ? this.appCenter.loadDetailedAppFromMd5(str).m39920i(new C1468i0(this)) : Single.m39913m(this.cachedApp);
    }

    private Single<AppModel> loadAppViewViewModelFromUniqueName(String str) {
        AppModel appModel = this.cachedApp;
        return (appModel == null || !appModel.getUniqueName().equals(str)) ? this.appCenter.loadDetailedAppFromUniqueName(str).m39920i(new C1468i0(this)) : Single.m39913m(this.cachedApp);
    }

    private C11234e<DownloadModel> loadDownloadModel(String str, String str2, int i2, String str3, long j2, boolean z) {
        return C11234e.m40041e(this.installManager.getInstall(str, str2, i2), this.appcMigrationManager.isMigrationApp(str2, str3, i2, j2, z), new InterfaceC11257f() { // from class: cm.aptoide.pt.app.k0
            @Override // p456rx.p460m.InterfaceC11257f
            /* renamed from: a */
            public final Object mo6865a(Object obj, Object obj2) {
                return this.f7615f.m7052f((Install) obj, (Boolean) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: map, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Single<AppModel> m7051e(DetailedAppRequestResult detailedAppRequestResult) {
        return detailedAppRequestResult.getDetailedApp() != null ? createAppViewViewModel(detailedAppRequestResult.getDetailedApp()) : detailedAppRequestResult.isLoading() ? Single.m39913m(new AppModel(detailedAppRequestResult.isLoading())) : detailedAppRequestResult.hasError() ? Single.m39913m(new AppModel(detailedAppRequestResult.getError())) : Single.m39913m(new AppModel(DetailedAppRequestResult.Error.GENERIC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mergeToAppViewModel, reason: merged with bridge method [inline-methods] */
    public AppViewModel m7053g(AppModel appModel, DownloadModel downloadModel, AppCoinsViewModel appCoinsViewModel, MigrationModel migrationModel) {
        return new AppViewModel(appModel, downloadModel, appCoinsViewModel, migrationModel);
    }

    public Single<AppModel> getAppModel() {
        return this.appViewConfiguration.getAppId() >= 0 ? loadAppModel(this.appViewConfiguration.getAppId(), this.appViewConfiguration.getStoreName(), this.appViewConfiguration.getPackageName()) : this.appViewConfiguration.hasMd5() ? loadAppModelFromMd5(this.appViewConfiguration.getMd5()) : this.appViewConfiguration.hasUniqueName() ? loadAppViewViewModelFromUniqueName(this.appViewConfiguration.getUniqueName()) : loadAppModel(this.appViewConfiguration.getPackageName(), this.appViewConfiguration.getStoreName());
    }

    public Single<AppViewModel> getAppViewModel() {
        return observeAppViewModel().m40057E().m40085Z0();
    }

    public C11234e<AppViewModel> observeAppViewModel() {
        return getAppModel().m39915A().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.p0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7638f.m7054h((AppModel) obj);
            }
        });
    }

    private Single<AppModel> loadAppModel(String str, String str2) {
        AppModel appModel = this.cachedApp;
        if (appModel != null && appModel.getPackageName().equals(str)) {
            return Single.m39913m(this.cachedApp);
        }
        return this.appCenter.loadDetailedApp(str, str2).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.o0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7635f.m7051e((DetailedAppRequestResult) obj);
            }
        });
    }
}
