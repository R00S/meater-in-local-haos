package cm.aptoide.p092pt.download.view;

import cm.aptoide.p092pt.app.migration.AppcMigrationManager;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.database.room.RoomStore;
import cm.aptoide.p092pt.download.view.DownloadStatusModel;
import cm.aptoide.p092pt.install.Install;
import cm.aptoide.p092pt.install.InstallManager;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11257f;

/* compiled from: DownloadStatusManager.kt */
@Metadata(m32266d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J@\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0013H\u0002J\u001a\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m32267d2 = {"Lcm/aptoide/pt/download/view/DownloadStatusManager;", HttpUrl.FRAGMENT_ENCODE_SET, "installManager", "Lcm/aptoide/pt/install/InstallManager;", "appcMigrationManager", "Lcm/aptoide/pt/app/migration/AppcMigrationManager;", "(Lcm/aptoide/pt/install/InstallManager;Lcm/aptoide/pt/app/migration/AppcMigrationManager;)V", "loadDownloadModel", "Lrx/Observable;", "Lcm/aptoide/pt/download/view/DownloadStatusModel;", "md5", HttpUrl.FRAGMENT_ENCODE_SET, "packageName", RoomInstalled.VERSION_CODE, HttpUrl.FRAGMENT_ENCODE_SET, RoomInstalled.SIGNATURE, RoomStore.STORE_ID, HttpUrl.FRAGMENT_ENCODE_SET, "hasAppc", HttpUrl.FRAGMENT_ENCODE_SET, "parseStatusDownloadState", "Lcm/aptoide/pt/download/view/DownloadStatusModel$DownloadState;", "state", "Lcm/aptoide/pt/install/Install$InstallationStatus;", "isIndeterminate", "parseStatusDownloadType", "Lcm/aptoide/pt/download/view/DownloadStatusModel$Action;", "type", "Lcm/aptoide/pt/install/Install$InstallationType;", "isMigration", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class DownloadStatusManager {
    private final AppcMigrationManager appcMigrationManager;
    private final InstallManager installManager;

    /* compiled from: DownloadStatusManager.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Install.InstallationType.values().length];
            iArr[Install.InstallationType.INSTALLED.ordinal()] = 1;
            iArr[Install.InstallationType.DOWNGRADE.ordinal()] = 2;
            iArr[Install.InstallationType.UPDATE.ordinal()] = 3;
            iArr[Install.InstallationType.INSTALL.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Install.InstallationStatus.values().length];
            iArr2[Install.InstallationStatus.INSTALLATION_TIMEOUT.ordinal()] = 1;
            iArr2[Install.InstallationStatus.GENERIC_ERROR.ordinal()] = 2;
            iArr2[Install.InstallationStatus.NOT_ENOUGH_SPACE_ERROR.ordinal()] = 3;
            iArr2[Install.InstallationStatus.IN_QUEUE.ordinal()] = 4;
            iArr2[Install.InstallationStatus.PAUSED.ordinal()] = 5;
            iArr2[Install.InstallationStatus.DOWNLOADING.ordinal()] = 6;
            iArr2[Install.InstallationStatus.INITIAL_STATE.ordinal()] = 7;
            iArr2[Install.InstallationStatus.INSTALLED.ordinal()] = 8;
            iArr2[Install.InstallationStatus.UNINSTALLED.ordinal()] = 9;
            iArr2[Install.InstallationStatus.INSTALLING.ordinal()] = 10;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DownloadStatusManager(InstallManager installManager, AppcMigrationManager appcMigrationManager) {
        C9801m.m32346f(installManager, "installManager");
        C9801m.m32346f(appcMigrationManager, "appcMigrationManager");
        this.installManager = installManager;
        this.appcMigrationManager = appcMigrationManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDownloadModel$lambda-0, reason: not valid java name */
    public static final DownloadStatusModel m40757loadDownloadModel$lambda0(DownloadStatusManager downloadStatusManager, Install install, Boolean bool) {
        C9801m.m32346f(downloadStatusManager, "this$0");
        Install.InstallationType type = install.getType();
        C9801m.m32345e(bool, "isMigration");
        return new DownloadStatusModel(downloadStatusManager.parseStatusDownloadType(type, bool.booleanValue()), install.getProgress(), downloadStatusManager.parseStatusDownloadState(install.getState(), install.isIndeterminate()));
    }

    private final DownloadStatusModel.DownloadState parseStatusDownloadState(Install.InstallationStatus state, boolean isIndeterminate) {
        if (isIndeterminate) {
            return DownloadStatusModel.DownloadState.IN_QUEUE;
        }
        switch (state == null ? -1 : WhenMappings.$EnumSwitchMapping$1[state.ordinal()]) {
            case 1:
            case 2:
                return DownloadStatusModel.DownloadState.GENERIC_ERROR;
            case 3:
                return DownloadStatusModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR;
            case 4:
                return DownloadStatusModel.DownloadState.IN_QUEUE;
            case 5:
                return DownloadStatusModel.DownloadState.PAUSE;
            case 6:
                return DownloadStatusModel.DownloadState.ACTIVE;
            case 7:
            case 8:
            case 9:
                return DownloadStatusModel.DownloadState.STANDBY;
            case 10:
                return DownloadStatusModel.DownloadState.INSTALLING;
            default:
                throw new IllegalStateException("Wrong type of download state");
        }
    }

    private final DownloadStatusModel.Action parseStatusDownloadType(Install.InstallationType type, boolean isMigration) {
        if (isMigration) {
            return DownloadStatusModel.Action.MIGRATE;
        }
        int i2 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? DownloadStatusModel.Action.INSTALL : DownloadStatusModel.Action.INSTALL : DownloadStatusModel.Action.UPDATE : DownloadStatusModel.Action.DOWNGRADE : DownloadStatusModel.Action.OPEN;
    }

    public final C11234e<DownloadStatusModel> loadDownloadModel(String str, String str2, int i2, String str3, long j2, boolean z) {
        C9801m.m32346f(str, "md5");
        C9801m.m32346f(str2, "packageName");
        return C11234e.m40041e(this.installManager.getInstall(str, str2, i2), this.appcMigrationManager.isMigrationApp(str2, str3, i2, j2, z), new InterfaceC11257f() { // from class: cm.aptoide.pt.download.view.f
            @Override // p456rx.p460m.InterfaceC11257f
            /* renamed from: a */
            public final Object mo6865a(Object obj, Object obj2) {
                return DownloadStatusManager.m40757loadDownloadModel$lambda0(this.f8687f, (Install) obj, (Boolean) obj2);
            }
        }).m40077R0(200L, TimeUnit.MILLISECONDS);
    }
}
