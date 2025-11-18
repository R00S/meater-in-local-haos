package cm.aptoide.p092pt.downloadmanager;

import cm.aptoide.p092pt.downloadmanager.DownloadAppFile;
import cm.aptoide.p092pt.logger.Logger;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AppDownloadStatus {
    private static final int PROGRESS_MAX_VALUE = 100;
    private AppDownloadState appDownloadState;
    private long downloadSize;
    private List<FileDownloadCallback> fileDownloadCallbackList;
    private String md5;

    /* renamed from: cm.aptoide.pt.downloadmanager.AppDownloadStatus$1 */
    static /* synthetic */ class C23961 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$downloadmanager$AppDownloadStatus$AppDownloadState */
        static final /* synthetic */ int[] f8764x5e1d6a72;

        static {
            int[] iArr = new int[AppDownloadState.values().length];
            f8764x5e1d6a72 = iArr;
            try {
                iArr[AppDownloadState.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8764x5e1d6a72[AppDownloadState.ERROR_MD5_DOES_NOT_MATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8764x5e1d6a72[AppDownloadState.ERROR_FILE_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8764x5e1d6a72[AppDownloadState.ERROR_NOT_ENOUGH_SPACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8764x5e1d6a72[AppDownloadState.WARN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8764x5e1d6a72[AppDownloadState.PAUSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8764x5e1d6a72[AppDownloadState.INVALID_STATUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8764x5e1d6a72[AppDownloadState.VERIFYING_FILE_INTEGRITY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8764x5e1d6a72[AppDownloadState.COMPLETED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8764x5e1d6a72[AppDownloadState.PENDING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public enum AppDownloadState {
        INVALID_STATUS,
        COMPLETED,
        PENDING,
        PAUSED,
        WARN,
        ERROR,
        ERROR_FILE_NOT_FOUND,
        ERROR_NOT_ENOUGH_SPACE,
        ERROR_MD5_DOES_NOT_MATCH,
        PROGRESS,
        WAITING_TO_MOVE_FILES,
        VERIFYING_FILE_INTEGRITY
    }

    public AppDownloadStatus(String str, List<FileDownloadCallback> list, AppDownloadState appDownloadState, long j2) {
        this.md5 = str;
        this.fileDownloadCallbackList = list;
        this.appDownloadState = appDownloadState;
        this.downloadSize = j2;
    }

    private int calculateProgressByFileNumber(int i2) {
        return this.fileDownloadCallbackList.size() > 0 ? i2 / this.fileDownloadCallbackList.size() : i2;
    }

    private int calculateProgressByFileSize(long j2) {
        double d2 = j2;
        double d3 = this.downloadSize;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return (int) ((d2 / d3) * 100.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private AppDownloadState getAppDownloadState() {
        AppDownloadState downloadState = null;
        for (FileDownloadCallback fileDownloadCallback : this.fileDownloadCallbackList) {
            if (fileDownloadCallback.getDownloadState() != null) {
                switch (C23961.f8764x5e1d6a72[fileDownloadCallback.getDownloadState().ordinal()]) {
                    case 1:
                        return AppDownloadState.ERROR;
                    case 2:
                        return AppDownloadState.ERROR_MD5_DOES_NOT_MATCH;
                    case 3:
                        return AppDownloadState.ERROR_FILE_NOT_FOUND;
                    case 4:
                        return AppDownloadState.ERROR_NOT_ENOUGH_SPACE;
                    case 5:
                        return AppDownloadState.WARN;
                    case 6:
                        return AppDownloadState.PAUSED;
                    case 7:
                        return AppDownloadState.INVALID_STATUS;
                    case 8:
                        if (downloadState != null && downloadState != AppDownloadState.VERIFYING_FILE_INTEGRITY && downloadState != AppDownloadState.COMPLETED) {
                            return AppDownloadState.PROGRESS;
                        }
                        if (this.fileDownloadCallbackList.indexOf(fileDownloadCallback) == this.fileDownloadCallbackList.size() - 1) {
                            return AppDownloadState.VERIFYING_FILE_INTEGRITY;
                        }
                        downloadState = fileDownloadCallback.getDownloadState();
                        break;
                    case 9:
                        if (downloadState != null && downloadState != AppDownloadState.COMPLETED) {
                            return AppDownloadState.PROGRESS;
                        }
                        if (this.fileDownloadCallbackList.indexOf(fileDownloadCallback) == this.fileDownloadCallbackList.size() - 1) {
                            Logger.getInstance().m8273d("AppDownloadState", "emitting APPDOWNLOADSTATE completed " + this.md5);
                            return AppDownloadState.COMPLETED;
                        }
                        downloadState = fileDownloadCallback.getDownloadState();
                        break;
                        break;
                    case 10:
                        if (downloadState != null && downloadState != AppDownloadState.PENDING) {
                            return AppDownloadState.PROGRESS;
                        }
                        if (this.fileDownloadCallbackList.indexOf(fileDownloadCallback) == this.fileDownloadCallbackList.size() - 1) {
                            return AppDownloadState.PENDING;
                        }
                        downloadState = fileDownloadCallback.getDownloadState();
                        break;
                    default:
                        downloadState = fileDownloadCallback.getDownloadState();
                        break;
                }
            }
        }
        return AppDownloadState.PROGRESS;
    }

    private long getAverageDownloadSpeedByFileType(DownloadAppFile.FileType fileType) {
        int i2 = 0;
        int downloadSpeed = 0;
        int i3 = 1;
        for (FileDownloadCallback fileDownloadCallback : this.fileDownloadCallbackList) {
            if (fileDownloadCallback.getFileType() == fileType.getType()) {
                i2++;
                downloadSpeed += fileDownloadCallback.getDownloadSpeed();
                if (fileDownloadCallback.getDownloadState() != AppDownloadState.PENDING && fileDownloadCallback.getDownloadState() != AppDownloadState.WARN) {
                    i3++;
                }
            }
        }
        if (i2 <= 0) {
            return -1L;
        }
        if (downloadSpeed > 0) {
            return downloadSpeed / i3;
        }
        return 0L;
    }

    private FileDownloadCallback getFileDownloadCallback(String str) {
        for (FileDownloadCallback fileDownloadCallback : this.fileDownloadCallbackList) {
            if (fileDownloadCallback.getMd5().equals(str)) {
                return fileDownloadCallback;
            }
        }
        return null;
    }

    private int getFileDownloadProgressAsPercentage(FileDownloadCallback fileDownloadCallback) {
        double downloadedBytes = fileDownloadCallback.getDownloadProgress().getDownloadedBytes();
        double totalFileBytes = fileDownloadCallback.getDownloadProgress().getTotalFileBytes();
        Double.isNaN(downloadedBytes);
        Double.isNaN(totalFileBytes);
        return (int) Math.floor((downloadedBytes / totalFileBytes) * 100.0d);
    }

    private long getOverallProgressAsBytes() {
        Iterator<FileDownloadCallback> it = this.fileDownloadCallbackList.iterator();
        long downloadedBytes = 0;
        while (it.hasNext()) {
            downloadedBytes += it.next().getDownloadProgress().getDownloadedBytes();
        }
        return downloadedBytes;
    }

    private int getOverallProgressAsPercentage() {
        Iterator<FileDownloadCallback> it = this.fileDownloadCallbackList.iterator();
        int fileDownloadProgressAsPercentage = 0;
        while (it.hasNext()) {
            fileDownloadProgressAsPercentage += getFileDownloadProgressAsPercentage(it.next());
        }
        return fileDownloadProgressAsPercentage;
    }

    private void refreshAppDownloadState() {
        this.appDownloadState = getAppDownloadState();
    }

    public DownloadSpeed getAverageDownloadSpeed() {
        return new DownloadSpeed(getAverageDownloadSpeedByFileType(DownloadAppFile.FileType.APK), getAverageDownloadSpeedByFileType(DownloadAppFile.FileType.OBB), getAverageDownloadSpeedByFileType(DownloadAppFile.FileType.SPLIT));
    }

    public AppDownloadState getDownloadStatus() {
        return this.appDownloadState;
    }

    public int getFileDownloadProgress(String str) {
        FileDownloadCallback fileDownloadCallback = getFileDownloadCallback(str);
        if (fileDownloadCallback == null) {
            return 0;
        }
        return getFileDownloadProgressAsPercentage(fileDownloadCallback);
    }

    public AppDownloadState getFileDownloadStatus(String str) {
        FileDownloadCallback fileDownloadCallback = getFileDownloadCallback(str);
        return fileDownloadCallback == null ? AppDownloadState.PROGRESS : fileDownloadCallback.getDownloadState();
    }

    public String getMd5() {
        return this.md5;
    }

    public int getOverallProgress() {
        return this.downloadSize == 0 ? calculateProgressByFileNumber(getOverallProgressAsPercentage()) : calculateProgressByFileSize(getOverallProgressAsBytes());
    }

    public boolean isAppDownloadOver() {
        AppDownloadState appDownloadState = this.appDownloadState;
        return appDownloadState == AppDownloadState.COMPLETED || appDownloadState == AppDownloadState.PAUSED || appDownloadState == AppDownloadState.ERROR || appDownloadState == AppDownloadState.ERROR_FILE_NOT_FOUND || appDownloadState == AppDownloadState.ERROR_NOT_ENOUGH_SPACE || appDownloadState == AppDownloadState.ERROR_MD5_DOES_NOT_MATCH || appDownloadState == AppDownloadState.WAITING_TO_MOVE_FILES || appDownloadState == AppDownloadState.VERIFYING_FILE_INTEGRITY;
    }

    public void setFileDownloadCallback(FileDownloadCallback fileDownloadCallback) {
        if (this.fileDownloadCallbackList.contains(fileDownloadCallback)) {
            this.fileDownloadCallbackList.set(this.fileDownloadCallbackList.indexOf(fileDownloadCallback), fileDownloadCallback);
        } else {
            this.fileDownloadCallbackList.add(fileDownloadCallback);
        }
        refreshAppDownloadState();
    }
}
