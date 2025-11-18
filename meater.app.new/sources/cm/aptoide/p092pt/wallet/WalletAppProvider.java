package cm.aptoide.p092pt.wallet;

import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.aab.Split;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.app.DownloadStateParser;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Obb;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.install.Install;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.promotions.WalletApp;
import cm.aptoide.p092pt.view.app.AppCenter;
import cm.aptoide.p092pt.view.app.DetailedApp;
import cm.aptoide.p092pt.view.app.DetailedAppRequestResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11258g;

/* compiled from: WalletAppProvider.kt */
@Metadata(m32266d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J0\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$H\u0002J \u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006*"}, m32267d2 = {"Lcm/aptoide/pt/wallet/WalletAppProvider;", HttpUrl.FRAGMENT_ENCODE_SET, "appCenter", "Lcm/aptoide/pt/view/app/AppCenter;", "aptoideInstalledAppsRepository", "Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;", "installManager", "Lcm/aptoide/pt/install/InstallManager;", "downloadStateParser", "Lcm/aptoide/pt/app/DownloadStateParser;", "(Lcm/aptoide/pt/view/app/AppCenter;Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;Lcm/aptoide/pt/install/InstallManager;Lcm/aptoide/pt/app/DownloadStateParser;)V", "getAppCenter", "()Lcm/aptoide/pt/view/app/AppCenter;", "getAptoideInstalledAppsRepository", "()Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;", "getDownloadStateParser", "()Lcm/aptoide/pt/app/DownloadStateParser;", "getInstallManager", "()Lcm/aptoide/pt/install/InstallManager;", "getWalletApp", "Lrx/Observable;", "Lcm/aptoide/pt/promotions/WalletApp;", "mapToDownloadModel", "Lcm/aptoide/pt/app/DownloadModel;", "type", "Lcm/aptoide/pt/install/Install$InstallationType;", "progress", HttpUrl.FRAGMENT_ENCODE_SET, "state", "Lcm/aptoide/pt/install/Install$InstallationStatus;", "isIndeterminate", HttpUrl.FRAGMENT_ENCODE_SET, "appSize", HttpUrl.FRAGMENT_ENCODE_SET, "mapToWalletApp", "result", "Lcm/aptoide/pt/view/app/DetailedAppRequestResult;", "mergeToWalletApp", "walletApp", "isInstalled", "walletDownload", "Lcm/aptoide/pt/install/Install;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class WalletAppProvider {
    private final AppCenter appCenter;
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final DownloadStateParser downloadStateParser;
    private final InstallManager installManager;

    public WalletAppProvider(AppCenter appCenter, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, InstallManager installManager, DownloadStateParser downloadStateParser) {
        C9801m.m32346f(appCenter, "appCenter");
        C9801m.m32346f(aptoideInstalledAppsRepository, "aptoideInstalledAppsRepository");
        C9801m.m32346f(installManager, "installManager");
        C9801m.m32346f(downloadStateParser, "downloadStateParser");
        this.appCenter = appCenter;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository;
        this.installManager = installManager;
        this.downloadStateParser = downloadStateParser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getWalletApp$lambda-0, reason: not valid java name */
    public static final WalletApp m40989getWalletApp$lambda0(WalletAppProvider walletAppProvider, DetailedAppRequestResult detailedAppRequestResult) {
        C9801m.m32346f(walletAppProvider, "this$0");
        C9801m.m32345e(detailedAppRequestResult, "app");
        return walletAppProvider.mapToWalletApp(detailedAppRequestResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getWalletApp$lambda-2, reason: not valid java name */
    public static final C11234e m40990getWalletApp$lambda2(final WalletAppProvider walletAppProvider, WalletApp walletApp) {
        C9801m.m32346f(walletAppProvider, "this$0");
        return C11234e.m40038d(C11234e.m40025S(walletApp), walletAppProvider.aptoideInstalledAppsRepository.isInstalled(walletApp.getPackageName()), walletAppProvider.installManager.getInstall(walletApp.getMd5sum(), walletApp.getPackageName(), walletApp.getVersionCode()), new InterfaceC11258g() { // from class: cm.aptoide.pt.wallet.b
            @Override // p456rx.p460m.InterfaceC11258g
            /* renamed from: a */
            public final Object mo6864a(Object obj, Object obj2, Object obj3) {
                return WalletAppProvider.m40991getWalletApp$lambda2$lambda1(this.f12113a, (WalletApp) obj, (Boolean) obj2, (Install) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getWalletApp$lambda-2$lambda-1, reason: not valid java name */
    public static final WalletApp m40991getWalletApp$lambda2$lambda1(WalletAppProvider walletAppProvider, WalletApp walletApp, Boolean bool, Install install) {
        C9801m.m32346f(walletAppProvider, "this$0");
        C9801m.m32345e(walletApp, "walletApp");
        C9801m.m32345e(bool, "isInstalled");
        boolean zBooleanValue = bool.booleanValue();
        C9801m.m32345e(install, "walletDownload");
        return walletAppProvider.mergeToWalletApp(walletApp, zBooleanValue, install);
    }

    private final DownloadModel mapToDownloadModel(Install.InstallationType type, int progress, Install.InstallationStatus state, boolean isIndeterminate, long appSize) {
        return new DownloadModel(this.downloadStateParser.parseDownloadType(type, false), progress, this.downloadStateParser.parseDownloadState(state, isIndeterminate), appSize);
    }

    private final WalletApp mapToWalletApp(DetailedAppRequestResult result) {
        if (result.hasError() || result.isLoading()) {
            return new WalletApp(null, false, null, null, 0L, null, null, 0, null, null, null, null, 0L, null, 0.0f, null, null, null, null, 524287, null);
        }
        DetailedApp detailedApp = result.getDetailedApp();
        String name = detailedApp.getName();
        C9801m.m32345e(name, "app.name");
        String icon = detailedApp.getIcon();
        C9801m.m32345e(icon, "app.icon");
        long id = detailedApp.getId();
        String packageName = detailedApp.getPackageName();
        C9801m.m32345e(packageName, "app.packageName");
        String md5 = detailedApp.getMd5();
        int versionCode = detailedApp.getVersionCode();
        String versionName = detailedApp.getVersionName();
        String path = detailedApp.getPath();
        String pathAlt = detailedApp.getPathAlt();
        Obb obb = detailedApp.getObb();
        long size = detailedApp.getSize();
        String name2 = detailedApp.getDeveloper().getName();
        C9801m.m32345e(name2, "app.developer.name");
        float average = detailedApp.getStats().getRating().getAverage();
        List<Split> splits = detailedApp.getSplits();
        C9801m.m32345e(splits, "app.splits");
        List<String> requiredSplits = detailedApp.getRequiredSplits();
        C9801m.m32345e(requiredSplits, "app.requiredSplits");
        return new WalletApp(null, false, name, icon, id, packageName, md5, versionCode, versionName, path, pathAlt, obb, size, name2, average, splits, requiredSplits, null, null, 393216, null);
    }

    private final WalletApp mergeToWalletApp(WalletApp walletApp, boolean isInstalled, Install walletDownload) {
        Install.InstallationType type = walletDownload.getType();
        C9801m.m32345e(type, "walletDownload.type");
        int progress = walletDownload.getProgress();
        Install.InstallationStatus state = walletDownload.getState();
        C9801m.m32345e(state, "walletDownload.state");
        walletApp.setDownloadModel(mapToDownloadModel(type, progress, state, walletDownload.isIndeterminate(), walletDownload.getAppSize()));
        walletApp.setInstalled(isInstalled);
        return walletApp;
    }

    public final AppCenter getAppCenter() {
        return this.appCenter;
    }

    public final AptoideInstalledAppsRepository getAptoideInstalledAppsRepository() {
        return this.aptoideInstalledAppsRepository;
    }

    public final DownloadStateParser getDownloadStateParser() {
        return this.downloadStateParser;
    }

    public final InstallManager getInstallManager() {
        return this.installManager;
    }

    public final C11234e<WalletApp> getWalletApp() {
        C11234e<WalletApp> c11234eM40060G = this.appCenter.loadDetailedApp(AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME, "catappult").m39915A().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.wallet.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return WalletAppProvider.m40989getWalletApp$lambda0(this.f12110f, (DetailedAppRequestResult) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.wallet.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return WalletAppProvider.m40990getWalletApp$lambda2(this.f12115f, (WalletApp) obj);
            }
        });
        C9801m.m32345e(c11234eM40060G, "appCenter.loadDetailedAp…wnload)\n        }\n      }");
        return c11234eM40060G;
    }
}
