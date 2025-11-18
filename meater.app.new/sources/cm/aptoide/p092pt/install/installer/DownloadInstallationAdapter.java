package cm.aptoide.p092pt.install.installer;

import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.database.room.RoomFileToDownload;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.downloadmanager.DownloadPersistence;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import java.io.File;
import java.util.List;
import p456rx.C11231b;

/* loaded from: classes.dex */
public class DownloadInstallationAdapter implements Installation {
    private final RoomDownload download;
    private DownloadPersistence downloadPersistence;
    private RoomInstalled installed;
    private AptoideInstalledAppsRepository ongoingInstallProvider;

    public DownloadInstallationAdapter(RoomDownload roomDownload, DownloadPersistence downloadPersistence, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, RoomInstalled roomInstalled) {
        this.download = roomDownload;
        this.downloadPersistence = downloadPersistence;
        this.ongoingInstallProvider = aptoideInstalledAppsRepository;
        this.installed = roomInstalled;
    }

    @Override // cm.aptoide.p092pt.install.installer.Installation
    public File getFile() {
        return new File(this.download.getFilesToDownload().get(0).getFilePath());
    }

    @Override // cm.aptoide.p092pt.install.installer.Installation
    public List<RoomFileToDownload> getFiles() {
        return this.download.getFilesToDownload();
    }

    @Override // cm.aptoide.p092pt.install.installer.Installation
    public String getId() {
        return this.download.getMd5();
    }

    @Override // cm.aptoide.p092pt.install.installer.Installation
    public String getPackageName() {
        return this.download.getFilesToDownload().get(0).getPackageName();
    }

    @Override // cm.aptoide.p092pt.install.installer.Installation
    public int getStatus() {
        return this.installed.getStatus();
    }

    @Override // cm.aptoide.p092pt.install.installer.Installation
    public int getType() {
        return this.installed.getType();
    }

    @Override // cm.aptoide.p092pt.install.installer.Installation
    public int getVersionCode() {
        return this.download.getFilesToDownload().get(0).getVersionCode();
    }

    @Override // cm.aptoide.p092pt.install.installer.Installation
    public String getVersionName() {
        return this.download.getVersionName();
    }

    @Override // cm.aptoide.p092pt.install.installer.Installation
    public C11231b save() {
        return this.ongoingInstallProvider.save(this.installed);
    }

    @Override // cm.aptoide.p092pt.install.installer.Installation
    public C11231b saveFileChanges() {
        return this.downloadPersistence.save(this.download);
    }

    @Override // cm.aptoide.p092pt.install.installer.Installation
    public void setStatus(int i2) {
        this.installed.setStatus(i2);
    }

    @Override // cm.aptoide.p092pt.install.installer.Installation
    public void setType(int i2) {
        this.installed.setType(i2);
    }
}
