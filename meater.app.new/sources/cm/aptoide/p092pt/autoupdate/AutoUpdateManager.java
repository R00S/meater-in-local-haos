package cm.aptoide.p092pt.autoupdate;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.actions.PermissionManager;
import cm.aptoide.p092pt.actions.PermissionService;
import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.install.Install;
import cm.aptoide.p092pt.install.InstallManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: AutoUpdateManager.kt */
@Metadata(m32266d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017H\u0002J\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00172\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0015J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0!J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180!H\u0002J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0017J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0017J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0018H\u0002J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\u0006\u0010'\u001a\u00020\u001cR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m32267d2 = {"Lcm/aptoide/pt/autoupdate/AutoUpdateManager;", HttpUrl.FRAGMENT_ENCODE_SET, "downloadFactory", "Lcm/aptoide/pt/download/DownloadFactory;", "permissionManager", "Lcm/aptoide/pt/actions/PermissionManager;", "installManager", "Lcm/aptoide/pt/install/InstallManager;", "downloadAnalytics", "Lcm/aptoide/pt/download/DownloadAnalytics;", "localVersionCode", HttpUrl.FRAGMENT_ENCODE_SET, "autoUpdateRepository", "Lcm/aptoide/pt/autoupdate/AutoUpdateRepository;", "localVersionSdk", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lcm/aptoide/pt/download/DownloadFactory;Lcm/aptoide/pt/actions/PermissionManager;Lcm/aptoide/pt/install/InstallManager;Lcm/aptoide/pt/download/DownloadAnalytics;ILcm/aptoide/pt/autoupdate/AutoUpdateRepository;ILandroid/content/SharedPreferences;)V", "AUTO_UPDATE_SHOW", HttpUrl.FRAGMENT_ENCODE_SET, "clearAutoUpdateShow", HttpUrl.FRAGMENT_ENCODE_SET, "getAutoUpdateModel", "Lrx/Observable;", "Lcm/aptoide/pt/autoupdate/AutoUpdateModel;", "getInstall", "Lcm/aptoide/pt/install/Install;", "hasDownloadPermissions", HttpUrl.FRAGMENT_ENCODE_SET, "permissionService", "Lcm/aptoide/pt/actions/PermissionService;", "incrementAutoUpdateShow", "isDownloadComplete", "Lrx/Single;", "loadAutoUpdateModel", "shouldShowAutoUpdateDialog", "shouldUpdate", "autoUpdateModel", "startUpdate", "shouldInstall", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public class AutoUpdateManager {
    private final String AUTO_UPDATE_SHOW;
    private final AutoUpdateRepository autoUpdateRepository;
    private final DownloadAnalytics downloadAnalytics;
    private final DownloadFactory downloadFactory;
    private final InstallManager installManager;
    private final int localVersionCode;
    private final int localVersionSdk;
    private final PermissionManager permissionManager;
    private final SharedPreferences sharedPreferences;

    public AutoUpdateManager(DownloadFactory downloadFactory, PermissionManager permissionManager, InstallManager installManager, DownloadAnalytics downloadAnalytics, int i2, AutoUpdateRepository autoUpdateRepository, int i3, SharedPreferences sharedPreferences) {
        C9801m.m32346f(downloadFactory, "downloadFactory");
        C9801m.m32346f(permissionManager, "permissionManager");
        C9801m.m32346f(installManager, "installManager");
        C9801m.m32346f(downloadAnalytics, "downloadAnalytics");
        C9801m.m32346f(autoUpdateRepository, "autoUpdateRepository");
        C9801m.m32346f(sharedPreferences, "sharedPreferences");
        this.downloadFactory = downloadFactory;
        this.permissionManager = permissionManager;
        this.installManager = installManager;
        this.downloadAnalytics = downloadAnalytics;
        this.localVersionCode = i2;
        this.autoUpdateRepository = autoUpdateRepository;
        this.localVersionSdk = i3;
        this.sharedPreferences = sharedPreferences;
        this.AUTO_UPDATE_SHOW = "showAutoUpdate";
    }

    private final C11234e<AutoUpdateModel> getAutoUpdateModel() {
        C11234e<AutoUpdateModel> c11234eM39915A = this.autoUpdateRepository.loadAutoUpdateModel().m39915A();
        C9801m.m32345e(c11234eM39915A, "autoUpdateRepository.loa…ateModel().toObservable()");
        return c11234eM39915A;
    }

    private final C11234e<Install> getInstall() {
        C11234e c11234eM40060G = getAutoUpdateModel().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.autoupdate.r
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AutoUpdateManager.m40738getInstall$lambda7(this.f8233f, (AutoUpdateModel) obj);
            }
        });
        C9801m.m32345e(c11234eM40060G, "getAutoUpdateModel().fla…DownloadStarted() }\n    }");
        return c11234eM40060G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getInstall$lambda-7, reason: not valid java name */
    public static final C11234e m40738getInstall$lambda7(AutoUpdateManager autoUpdateManager, AutoUpdateModel autoUpdateModel) {
        C9801m.m32346f(autoUpdateManager, "this$0");
        return autoUpdateManager.installManager.getInstall(autoUpdateModel.getMd5(), autoUpdateModel.getPackageName(), autoUpdateModel.getVersionCode()).m40059F(new InterfaceC11256e() { // from class: cm.aptoide.pt.autoupdate.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AutoUpdateManager.m40739getInstall$lambda7$lambda6((Install) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getInstall$lambda-7$lambda-6, reason: not valid java name */
    public static final Boolean m40739getInstall$lambda7$lambda6(Install install) {
        return Boolean.valueOf(install.hasDownloadStarted());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isDownloadComplete$lambda-3, reason: not valid java name */
    public static final Single m40740isDownloadComplete$lambda3(AutoUpdateManager autoUpdateManager, AutoUpdateModel autoUpdateModel) {
        C9801m.m32346f(autoUpdateManager, "this$0");
        return autoUpdateManager.installManager.getDownload(autoUpdateModel.getMd5());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isDownloadComplete$lambda-4, reason: not valid java name */
    public static final Boolean m40741isDownloadComplete$lambda4(RoomDownload roomDownload) {
        return Boolean.valueOf(roomDownload != null && roomDownload.getOverallDownloadStatus() == 1);
    }

    private final Single<AutoUpdateModel> loadAutoUpdateModel() {
        Single singleM39920i = this.autoUpdateRepository.loadFreshAutoUpdateModel().m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.autoupdate.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AutoUpdateManager.m40742loadAutoUpdateModel$lambda5(this.f8228f, (AutoUpdateModel) obj);
            }
        });
        C9801m.m32345e(singleM39920i, "autoUpdateRepository.loa…utoUpdateModel)\n        }");
        return singleM39920i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAutoUpdateModel$lambda-5, reason: not valid java name */
    public static final Single m40742loadAutoUpdateModel$lambda5(AutoUpdateManager autoUpdateManager, AutoUpdateModel autoUpdateModel) {
        C9801m.m32346f(autoUpdateManager, "this$0");
        if (!autoUpdateModel.wasSuccess()) {
            Single.m39911h(new Throwable(autoUpdateModel.getStatus().toString()));
        }
        C9801m.m32345e(autoUpdateModel, "it");
        if (autoUpdateManager.shouldUpdate(autoUpdateModel)) {
            autoUpdateModel = autoUpdateModel.copy((223 & 1) != 0 ? autoUpdateModel.versionCode : 0, (223 & 2) != 0 ? autoUpdateModel.uri : null, (223 & 4) != 0 ? autoUpdateModel.md5 : null, (223 & 8) != 0 ? autoUpdateModel.minSdk : null, (223 & 16) != 0 ? autoUpdateModel.packageName : null, (223 & 32) != 0 ? autoUpdateModel.shouldUpdate : true, (223 & 64) != 0 ? autoUpdateModel.status : null, (223 & 128) != 0 ? autoUpdateModel.loading : false);
        }
        return Single.m39913m(autoUpdateModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldUpdate$lambda-0, reason: not valid java name */
    public static final Boolean m40743shouldUpdate$lambda0(AutoUpdateModel autoUpdateModel) {
        return Boolean.valueOf(autoUpdateModel.getShouldUpdate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startUpdate$lambda-2, reason: not valid java name */
    public static final C11234e m40744startUpdate$lambda2(final AutoUpdateManager autoUpdateManager, final boolean z, AutoUpdateModel autoUpdateModel) {
        C9801m.m32346f(autoUpdateManager, "this$0");
        return C11234e.m40025S(autoUpdateManager.downloadFactory.create(autoUpdateModel.getMd5(), autoUpdateModel.getVersionCode(), autoUpdateModel.getPackageName(), autoUpdateModel.getUri(), false)).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.autoupdate.s
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AutoUpdateManager.m40745startUpdate$lambda2$lambda1(this.f8234f, z, (RoomDownload) obj);
            }
        }).m40083X0().m39974b(autoUpdateManager.getInstall());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startUpdate$lambda-2$lambda-1, reason: not valid java name */
    public static final C11231b m40745startUpdate$lambda2$lambda1(AutoUpdateManager autoUpdateManager, boolean z, RoomDownload roomDownload) {
        C9801m.m32346f(autoUpdateManager, "this$0");
        return autoUpdateManager.installManager.install(roomDownload, z);
    }

    public final void clearAutoUpdateShow() {
        this.sharedPreferences.edit().putInt(this.AUTO_UPDATE_SHOW, 0).apply();
    }

    public final C11234e<Boolean> hasDownloadPermissions(PermissionService permissionService) {
        C9801m.m32346f(permissionService, "permissionService");
        C11234e<Boolean> c11234eHasDownloadAccess = this.permissionManager.hasDownloadAccess(permissionService);
        C9801m.m32345e(c11234eHasDownloadAccess, "permissionManager.hasDow…Access(permissionService)");
        return c11234eHasDownloadAccess;
    }

    public final void incrementAutoUpdateShow() {
        this.sharedPreferences.edit().putInt(this.AUTO_UPDATE_SHOW, this.sharedPreferences.getInt(this.AUTO_UPDATE_SHOW, 0) + 1).apply();
    }

    public final Single<Boolean> isDownloadComplete() {
        Single<Boolean> singleM40085Z0 = loadAutoUpdateModel().m39915A().m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.autoupdate.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AutoUpdateManager.m40740isDownloadComplete$lambda3(this.f8232f, (AutoUpdateModel) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.autoupdate.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AutoUpdateManager.m40741isDownloadComplete$lambda4((RoomDownload) obj);
            }
        }).m40085Z0();
        C9801m.m32345e(singleM40085Z0, "loadAutoUpdateModel().to…TED }\n        .toSingle()");
        return singleM40085Z0;
    }

    public final C11234e<Boolean> shouldShowAutoUpdateDialog() {
        int i2 = this.sharedPreferences.getInt(this.AUTO_UPDATE_SHOW, 0);
        C11234e<Boolean> c11234eM40025S = C11234e.m40025S(Boolean.valueOf(i2 % 5 == 0 || i2 == 1));
        C9801m.m32345e(c11234eM40025S, "just(result % 5 == 0 || result == 1)");
        return c11234eM40025S;
    }

    public final C11234e<Boolean> shouldUpdate() {
        C11234e c11234eM40082X = loadAutoUpdateModel().m39915A().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.autoupdate.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AutoUpdateManager.m40743shouldUpdate$lambda0((AutoUpdateModel) obj);
            }
        });
        C9801m.m32345e(c11234eM40082X, "loadAutoUpdateModel().to…).map { it.shouldUpdate }");
        return c11234eM40082X;
    }

    public final C11234e<Install> startUpdate(final boolean z) {
        C11234e c11234eM40060G = getAutoUpdateModel().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.autoupdate.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AutoUpdateManager.m40744startUpdate$lambda2(this.f8229f, z, (AutoUpdateModel) obj);
            }
        });
        C9801m.m32345e(c11234eM40060G, "getAutoUpdateModel().fla…dThen(getInstall())\n    }");
        return c11234eM40060G;
    }

    private final boolean shouldUpdate(AutoUpdateModel autoUpdateModel) {
        return autoUpdateModel.getVersionCode() > this.localVersionCode && this.localVersionSdk >= Integer.parseInt(autoUpdateModel.getMinSdk());
    }
}
