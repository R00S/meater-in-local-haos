package cm.aptoide.p092pt.wallet;

import android.content.pm.PackageManager;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.aab.DynamicSplitsManager;
import cm.aptoide.p092pt.aab.DynamicSplitsModel;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.app.DownloadStateParser;
import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.install.AppInstallerStatusReceiver;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.install.Install;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.packageinstaller.InstallStatus;
import cm.aptoide.p092pt.promotions.WalletApp;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p319g.p320a.p321a.p322a.C9059d;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: WalletInstallManager.kt */
@Metadata(m32266d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\u0002002\u0006\u00104\u001a\u000202J\u0016\u00105\u001a\b\u0012\u0004\u0012\u000207062\b\u00108\u001a\u0004\u0018\u000107J\f\u00109\u001a\b\u0012\u0004\u0012\u00020206J\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020;062\u0006\u00104\u001a\u000202J\f\u0010<\u001a\b\u0012\u0004\u0012\u00020.06J\f\u0010=\u001a\b\u0012\u0004\u0012\u00020.06J\u000e\u0010>\u001a\u0002002\u0006\u00101\u001a\u000202J\u0010\u0010?\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u000202J\u000e\u0010@\u001a\u0002002\u0006\u00101\u001a\u000202J\u0006\u0010A\u001a\u00020,J2\u0010B\u001a\u00020,2\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020H2\u0006\u00108\u001a\u0002072\u0006\u0010I\u001a\u000207H\u0002J\u0006\u0010J\u001a\u00020.R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006K"}, m32267d2 = {"Lcm/aptoide/pt/wallet/WalletInstallManager;", HttpUrl.FRAGMENT_ENCODE_SET, "packageManager", "Landroid/content/pm/PackageManager;", "installManager", "Lcm/aptoide/pt/install/InstallManager;", "downloadFactory", "Lcm/aptoide/pt/download/DownloadFactory;", "downloadStateParser", "Lcm/aptoide/pt/app/DownloadStateParser;", "moPubAdsManager", "Lcm/aptoide/pt/ads/MoPubAdsManager;", "walletInstallAnalytics", "Lcm/aptoide/pt/wallet/WalletInstallAnalytics;", "aptoideInstalledAppsRepository", "Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;", "walletAppProvider", "Lcm/aptoide/pt/wallet/WalletAppProvider;", "appInstallerStatusReceiver", "Lcm/aptoide/pt/install/AppInstallerStatusReceiver;", "dynamicSplitsManager", "Lcm/aptoide/pt/aab/DynamicSplitsManager;", "(Landroid/content/pm/PackageManager;Lcm/aptoide/pt/install/InstallManager;Lcm/aptoide/pt/download/DownloadFactory;Lcm/aptoide/pt/app/DownloadStateParser;Lcm/aptoide/pt/ads/MoPubAdsManager;Lcm/aptoide/pt/wallet/WalletInstallAnalytics;Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;Lcm/aptoide/pt/wallet/WalletAppProvider;Lcm/aptoide/pt/install/AppInstallerStatusReceiver;Lcm/aptoide/pt/aab/DynamicSplitsManager;)V", "getAppInstallerStatusReceiver", "()Lcm/aptoide/pt/install/AppInstallerStatusReceiver;", "getAptoideInstalledAppsRepository", "()Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;", "getDownloadFactory", "()Lcm/aptoide/pt/download/DownloadFactory;", "getDownloadStateParser", "()Lcm/aptoide/pt/app/DownloadStateParser;", "getDynamicSplitsManager", "()Lcm/aptoide/pt/aab/DynamicSplitsManager;", "getInstallManager", "()Lcm/aptoide/pt/install/InstallManager;", "getMoPubAdsManager", "()Lcm/aptoide/pt/ads/MoPubAdsManager;", "getPackageManager", "()Landroid/content/pm/PackageManager;", "getWalletAppProvider", "()Lcm/aptoide/pt/wallet/WalletAppProvider;", "getWalletInstallAnalytics", "()Lcm/aptoide/pt/wallet/WalletInstallAnalytics;", "allowRootInstall", HttpUrl.FRAGMENT_ENCODE_SET, "answer", HttpUrl.FRAGMENT_ENCODE_SET, "cancelDownload", "Lrx/Completable;", "app", "Lcm/aptoide/pt/promotions/WalletApp;", "downloadApp", "walletApp", "getAppIcon", "Lrx/Observable;", HttpUrl.FRAGMENT_ENCODE_SET, "packageName", "getWallet", "loadDownloadModel", "Lcm/aptoide/pt/app/DownloadModel;", "onWalletInstallationCanceled", "onWalletInstalled", "pauseDownload", "removeDownload", "resumeDownload", "setupAnalyticsHistoryTracker", "setupDownloadEvents", DownloadAnalytics.RAKAM_DOWNLOAD_EVENT, "Lcm/aptoide/pt/database/room/RoomDownload;", "downloadAction", "Lcm/aptoide/pt/app/DownloadModel$Action;", "appId", HttpUrl.FRAGMENT_ENCODE_SET, "developer", "shouldShowRootInstallWarningPopup", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class WalletInstallManager {
    private final AppInstallerStatusReceiver appInstallerStatusReceiver;
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final DownloadFactory downloadFactory;
    private final DownloadStateParser downloadStateParser;
    private final DynamicSplitsManager dynamicSplitsManager;
    private final InstallManager installManager;
    private final MoPubAdsManager moPubAdsManager;
    private final PackageManager packageManager;
    private final WalletAppProvider walletAppProvider;
    private final WalletInstallAnalytics walletInstallAnalytics;

    public WalletInstallManager(PackageManager packageManager, InstallManager installManager, DownloadFactory downloadFactory, DownloadStateParser downloadStateParser, MoPubAdsManager moPubAdsManager, WalletInstallAnalytics walletInstallAnalytics, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, WalletAppProvider walletAppProvider, AppInstallerStatusReceiver appInstallerStatusReceiver, DynamicSplitsManager dynamicSplitsManager) {
        C9801m.m32346f(packageManager, "packageManager");
        C9801m.m32346f(installManager, "installManager");
        C9801m.m32346f(downloadFactory, "downloadFactory");
        C9801m.m32346f(downloadStateParser, "downloadStateParser");
        C9801m.m32346f(moPubAdsManager, "moPubAdsManager");
        C9801m.m32346f(walletInstallAnalytics, "walletInstallAnalytics");
        C9801m.m32346f(aptoideInstalledAppsRepository, "aptoideInstalledAppsRepository");
        C9801m.m32346f(walletAppProvider, "walletAppProvider");
        C9801m.m32346f(appInstallerStatusReceiver, "appInstallerStatusReceiver");
        C9801m.m32346f(dynamicSplitsManager, "dynamicSplitsManager");
        this.packageManager = packageManager;
        this.installManager = installManager;
        this.downloadFactory = downloadFactory;
        this.downloadStateParser = downloadStateParser;
        this.moPubAdsManager = moPubAdsManager;
        this.walletInstallAnalytics = walletInstallAnalytics;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository;
        this.walletAppProvider = walletAppProvider;
        this.appInstallerStatusReceiver = appInstallerStatusReceiver;
        this.dynamicSplitsManager = dynamicSplitsManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cancelDownload$lambda-6, reason: not valid java name */
    public static final void m40993cancelDownload$lambda6(WalletInstallManager walletInstallManager, WalletApp walletApp) {
        C9801m.m32346f(walletInstallManager, "this$0");
        C9801m.m32346f(walletApp, "$app");
        walletInstallManager.removeDownload(walletApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp$lambda-2, reason: not valid java name */
    public static final C11234e m40994downloadApp$lambda2(WalletInstallManager walletInstallManager, WalletApp walletApp, DynamicSplitsModel dynamicSplitsModel) {
        C9801m.m32346f(walletInstallManager, "this$0");
        C9801m.m32346f(walletApp, "$walletApp");
        return C11234e.m40025S(walletInstallManager.downloadFactory.create(walletInstallManager.downloadStateParser.parseDownloadAction(DownloadModel.Action.INSTALL), walletApp.getAppName(), walletApp.getPackageName(), walletApp.getMd5sum(), walletApp.getIcon(), walletApp.getVersionName(), walletApp.getVersionCode(), walletApp.getPath(), walletApp.getPathAlt(), walletApp.getObb(), false, walletApp.getSize(), walletApp.getSplits(), walletApp.getRequiredSplits(), walletApp.getTrustedBadge(), walletApp.getStoreName(), dynamicSplitsModel.getDynamicSplitsList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp$lambda-3, reason: not valid java name */
    public static final void m40995downloadApp$lambda3(WalletInstallManager walletInstallManager, WalletApp walletApp, RoomDownload roomDownload) {
        C9801m.m32346f(walletInstallManager, "this$0");
        C9801m.m32346f(walletApp, "$walletApp");
        C9801m.m32345e(roomDownload, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        walletInstallManager.setupDownloadEvents(roomDownload, DownloadModel.Action.INSTALL, walletApp.getId(), walletApp.getPackageName(), walletApp.getDeveloper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp$lambda-4, reason: not valid java name */
    public static final C11231b m40996downloadApp$lambda4(WalletInstallManager walletInstallManager, RoomDownload roomDownload) {
        C9801m.m32346f(walletInstallManager, "this$0");
        return walletInstallManager.installManager.splitInstall(roomDownload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAppIcon$lambda-0, reason: not valid java name */
    public static final String m40997getAppIcon$lambda0(WalletInstallManager walletInstallManager, String str) {
        C9801m.m32346f(walletInstallManager, "this$0");
        PackageManager packageManager = walletInstallManager.packageManager;
        C9801m.m32343c(str);
        return AptoideUtils.SystemU.getApkIconPath(packageManager.getPackageInfo(str, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAppIcon$lambda-1, reason: not valid java name */
    public static final String m40998getAppIcon$lambda1(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDownloadModel$lambda-7, reason: not valid java name */
    public static final DownloadModel m40999loadDownloadModel$lambda7(WalletInstallManager walletInstallManager, Install install) {
        C9801m.m32346f(walletInstallManager, "this$0");
        return new DownloadModel(walletInstallManager.downloadStateParser.parseDownloadType(install.getType(), false), install.getProgress(), walletInstallManager.downloadStateParser.parseDownloadState(install.getState(), install.isIndeterminate()), install.getAppSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onWalletInstallationCanceled$lambda-10, reason: not valid java name */
    public static final Boolean m41000onWalletInstallationCanceled$lambda10(InstallStatus installStatus) {
        return Boolean.valueOf(InstallStatus.Status.CANCELED.equals(installStatus.getStatus()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onWalletInstallationCanceled$lambda-11, reason: not valid java name */
    public static final Boolean m41001onWalletInstallationCanceled$lambda11(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onWalletInstalled$lambda-5, reason: not valid java name */
    public static final Boolean m41002onWalletInstalled$lambda5(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resumeDownload$lambda-8, reason: not valid java name */
    public static final void m41003resumeDownload$lambda8(WalletInstallManager walletInstallManager, WalletApp walletApp, RoomDownload roomDownload) {
        C9801m.m32346f(walletInstallManager, "this$0");
        C9801m.m32346f(walletApp, "$app");
        C9801m.m32345e(roomDownload, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        walletInstallManager.setupDownloadEvents(roomDownload, DownloadModel.Action.INSTALL, walletApp.getId(), walletApp.getPackageName(), walletApp.getDeveloper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resumeDownload$lambda-9, reason: not valid java name */
    public static final C11231b m41004resumeDownload$lambda9(WalletInstallManager walletInstallManager, RoomDownload roomDownload) {
        C9801m.m32346f(walletInstallManager, "this$0");
        return walletInstallManager.installManager.splitInstall(roomDownload);
    }

    private final void setupDownloadEvents(RoomDownload download, DownloadModel.Action downloadAction, long appId, String packageName, String developer) {
        this.walletInstallAnalytics.setupDownloadEvents(download, downloadAction, appId);
        this.walletInstallAnalytics.sendClickOnInstallButtonEvent(packageName, developer, download.hasSplits());
    }

    public final void allowRootInstall(boolean answer) {
        this.installManager.rootInstallAllowed(answer);
    }

    public final C11231b cancelDownload(final WalletApp walletApp) {
        C9801m.m32346f(walletApp, "app");
        C11231b c11231bM39952t = C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.wallet.k
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                WalletInstallManager.m40993cancelDownload$lambda6(this.f12134f, walletApp);
            }
        });
        C9801m.m32345e(c11231bM39952t, "fromAction { removeDownload(app) }");
        return c11231bM39952t;
    }

    public final C11231b downloadApp(final WalletApp walletApp) {
        C9801m.m32346f(walletApp, "walletApp");
        DynamicSplitsManager dynamicSplitsManager = this.dynamicSplitsManager;
        String md5sum = walletApp.getMd5sum();
        C9801m.m32343c(md5sum);
        C11231b c11231bM40083X0 = C9059d.m29126d(dynamicSplitsManager.getAppSplitsByMd5(md5sum)).m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.wallet.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return WalletInstallManager.m40994downloadApp$lambda2(this.f12143f, walletApp, (DynamicSplitsModel) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.wallet.p
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                WalletInstallManager.m40995downloadApp$lambda3(this.f12146f, walletApp, (RoomDownload) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.wallet.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return WalletInstallManager.m40996downloadApp$lambda4(this.f12132f, (RoomDownload) obj);
            }
        }).m40083X0();
        C9801m.m32345e(c11231bM40083X0, "toV1Single<DynamicSplits… }\n      .toCompletable()");
        return c11231bM40083X0;
    }

    public final C11234e<String> getAppIcon(final String str) {
        C11234e<String> c11234eM40105p0 = C11234e.m40022P(new Callable() { // from class: cm.aptoide.pt.wallet.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return WalletInstallManager.m40997getAppIcon$lambda0(this.f12119f, str);
            }
        }).m40105p0(new InterfaceC11256e() { // from class: cm.aptoide.pt.wallet.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return WalletInstallManager.m40998getAppIcon$lambda1((Throwable) obj);
            }
        });
        C9801m.m32345e(c11234eM40105p0, "fromCallable {\n      Apt… }.onErrorReturn { null }");
        return c11234eM40105p0;
    }

    public final AppInstallerStatusReceiver getAppInstallerStatusReceiver() {
        return this.appInstallerStatusReceiver;
    }

    public final AptoideInstalledAppsRepository getAptoideInstalledAppsRepository() {
        return this.aptoideInstalledAppsRepository;
    }

    public final DownloadFactory getDownloadFactory() {
        return this.downloadFactory;
    }

    public final DownloadStateParser getDownloadStateParser() {
        return this.downloadStateParser;
    }

    public final DynamicSplitsManager getDynamicSplitsManager() {
        return this.dynamicSplitsManager;
    }

    public final InstallManager getInstallManager() {
        return this.installManager;
    }

    public final MoPubAdsManager getMoPubAdsManager() {
        return this.moPubAdsManager;
    }

    public final PackageManager getPackageManager() {
        return this.packageManager;
    }

    public final C11234e<WalletApp> getWallet() {
        return this.walletAppProvider.getWalletApp();
    }

    public final WalletAppProvider getWalletAppProvider() {
        return this.walletAppProvider;
    }

    public final WalletInstallAnalytics getWalletInstallAnalytics() {
        return this.walletInstallAnalytics;
    }

    public final C11234e<DownloadModel> loadDownloadModel(WalletApp walletApp) {
        C9801m.m32346f(walletApp, "walletApp");
        C11234e c11234eM40082X = this.installManager.getInstall(walletApp.getMd5sum(), walletApp.getPackageName(), walletApp.getVersionCode()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.wallet.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return WalletInstallManager.m40999loadDownloadModel$lambda7(this.f12122f, (Install) obj);
            }
        });
        C9801m.m32345e(c11234eM40082X, "installManager.getInstal…appSize\n        )\n      }");
        return c11234eM40082X;
    }

    public final C11234e<Boolean> onWalletInstallationCanceled() {
        C11234e<Boolean> c11234eM40055D = this.appInstallerStatusReceiver.getInstallerInstallStatus().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.wallet.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return WalletInstallManager.m41000onWalletInstallationCanceled$lambda10((InstallStatus) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.wallet.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return WalletInstallManager.m41001onWalletInstallationCanceled$lambda11((Boolean) obj);
            }
        });
        C9801m.m32345e(c11234eM40055D, "appInstallerStatusReceiv…sCanceled -> isCanceled }");
        return c11234eM40055D;
    }

    public final C11234e<Boolean> onWalletInstalled() {
        C11234e<Boolean> c11234eM40055D = this.aptoideInstalledAppsRepository.isInstalled(AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.wallet.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return WalletInstallManager.m41002onWalletInstalled$lambda5((Boolean) obj);
            }
        });
        C9801m.m32345e(c11234eM40055D, "aptoideInstalledAppsRepo…      isInstalled\n      }");
        return c11234eM40055D;
    }

    public final C11231b pauseDownload(WalletApp walletApp) {
        C9801m.m32346f(walletApp, "app");
        C11231b c11231bPauseInstall = this.installManager.pauseInstall(walletApp.getMd5sum());
        C9801m.m32345e(c11231bPauseInstall, "installManager.pauseInstall(app.md5sum)");
        return c11231bPauseInstall;
    }

    public final C11231b removeDownload(WalletApp walletApp) {
        C9801m.m32346f(walletApp, "app");
        return this.installManager.cancelInstall(walletApp.getMd5sum(), walletApp.getPackageName(), walletApp.getVersionCode());
    }

    public final C11231b resumeDownload(final WalletApp walletApp) {
        C9801m.m32346f(walletApp, "app");
        C11231b c11231bM39921j = this.installManager.getDownload(walletApp.getMd5sum()).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.wallet.g
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                WalletInstallManager.m41003resumeDownload$lambda8(this.f12124f, walletApp, (RoomDownload) obj);
            }
        }).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.wallet.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return WalletInstallManager.m41004resumeDownload$lambda9(this.f12139f, (RoomDownload) obj);
            }
        });
        C9801m.m32345e(c11231bM39921j, "installManager.getDownlo…Install(download)\n      }");
        return c11231bM39921j;
    }

    public final void setupAnalyticsHistoryTracker() {
        this.walletInstallAnalytics.setupHistoryTracker();
    }

    public final boolean shouldShowRootInstallWarningPopup() {
        return this.installManager.showWarning();
    }
}
