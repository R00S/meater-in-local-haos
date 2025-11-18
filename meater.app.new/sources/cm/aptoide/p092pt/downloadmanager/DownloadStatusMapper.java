package cm.aptoide.p092pt.downloadmanager;

import cm.aptoide.p092pt.downloadmanager.AppDownloadStatus;

/* loaded from: classes.dex */
public class DownloadStatusMapper {

    /* renamed from: cm.aptoide.pt.downloadmanager.DownloadStatusMapper$1 */
    static /* synthetic */ class C23971 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$downloadmanager$AppDownloadStatus$AppDownloadState */
        static final /* synthetic */ int[] f8765x5e1d6a72;

        static {
            int[] iArr = new int[AppDownloadStatus.AppDownloadState.values().length];
            f8765x5e1d6a72 = iArr;
            try {
                iArr[AppDownloadStatus.AppDownloadState.PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8765x5e1d6a72[AppDownloadStatus.AppDownloadState.INVALID_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8765x5e1d6a72[AppDownloadStatus.AppDownloadState.VERIFYING_FILE_INTEGRITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8765x5e1d6a72[AppDownloadStatus.AppDownloadState.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8765x5e1d6a72[AppDownloadStatus.AppDownloadState.PENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8765x5e1d6a72[AppDownloadStatus.AppDownloadState.PAUSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8765x5e1d6a72[AppDownloadStatus.AppDownloadState.WARN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8765x5e1d6a72[AppDownloadStatus.AppDownloadState.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8765x5e1d6a72[AppDownloadStatus.AppDownloadState.ERROR_MD5_DOES_NOT_MATCH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8765x5e1d6a72[AppDownloadStatus.AppDownloadState.ERROR_NOT_ENOUGH_SPACE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8765x5e1d6a72[AppDownloadStatus.AppDownloadState.ERROR_FILE_NOT_FOUND.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public int mapAppDownloadStatus(AppDownloadStatus.AppDownloadState appDownloadState) {
        switch (C23971.f8765x5e1d6a72[appDownloadState.ordinal()]) {
            case 1:
                return 5;
            case 2:
                return 0;
            case 3:
                return 15;
            case 4:
                return 1;
            case 5:
                return 4;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
            case 9:
            case 10:
            case 11:
                return 9;
            default:
                throw new IllegalArgumentException("Invalid app download state " + appDownloadState);
        }
    }

    public int mapDownloadError(AppDownloadStatus.AppDownloadState appDownloadState) {
        switch (C23971.f8765x5e1d6a72[appDownloadState.ordinal()]) {
            case 8:
            case 9:
            case 11:
                return 1;
            case 10:
                return 2;
            default:
                return 0;
        }
    }
}
