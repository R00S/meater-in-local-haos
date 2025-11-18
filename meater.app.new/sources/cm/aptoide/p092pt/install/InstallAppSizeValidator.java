package cm.aptoide.p092pt.install;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.database.room.RoomFileToDownload;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.utils.FileUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: InstallAppSizeValidator.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m32267d2 = {"Lcm/aptoide/pt/install/InstallAppSizeValidator;", HttpUrl.FRAGMENT_ENCODE_SET, "filePathProvider", "Lcm/aptoide/pt/install/FilePathProvider;", "(Lcm/aptoide/pt/install/FilePathProvider;)V", "getFilePathProvider", "()Lcm/aptoide/pt/install/FilePathProvider;", "getAvailableSpace", HttpUrl.FRAGMENT_ENCODE_SET, "hasEnoughSpaceToInstallApp", HttpUrl.FRAGMENT_ENCODE_SET, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT, "Lcm/aptoide/pt/database/room/RoomDownload;", "isAppAlreadyDownloaded", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class InstallAppSizeValidator {
    private final FilePathProvider filePathProvider;

    public InstallAppSizeValidator(FilePathProvider filePathProvider) {
        C9801m.m32346f(filePathProvider, "filePathProvider");
        this.filePathProvider = filePathProvider;
    }

    private final boolean isAppAlreadyDownloaded(RoomDownload download) {
        if (download.getFilesToDownload().isEmpty()) {
            return false;
        }
        for (RoomFileToDownload roomFileToDownload : download.getFilesToDownload()) {
            StringBuilder sb = new StringBuilder();
            FilePathProvider filePathProvider = this.filePathProvider;
            C9801m.m32345e(roomFileToDownload, "fileToDownload");
            sb.append(filePathProvider.getFilePathFromFileType(roomFileToDownload));
            sb.append(roomFileToDownload.getFileName());
            if (!FileUtils.fileExists(sb.toString())) {
                return false;
            }
        }
        return true;
    }

    public final long getAvailableSpace() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return Build.VERSION.SDK_INT < 18 ? statFs.getAvailableBlocks() * statFs.getBlockSize() : statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public final FilePathProvider getFilePathProvider() {
        return this.filePathProvider;
    }

    public final boolean hasEnoughSpaceToInstallApp(RoomDownload download) {
        C9801m.m32346f(download, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        return isAppAlreadyDownloaded(download) || download.getSize() <= getAvailableSpace();
    }
}
