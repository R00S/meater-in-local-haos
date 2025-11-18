package cm.aptoide.p092pt.downloadmanager;

import cm.aptoide.p092pt.database.room.RoomDownload;

/* loaded from: classes.dex */
public interface DownloadAnalytics {
    void onDownloadCancel(String str, long j2, long j3, long j4);

    void onDownloadComplete(String str, String str2, int i2, long j2, long j3, long j4);

    void onError(String str, int i2, String str2, Throwable th, String str3, String str4, long j2, long j3, long j4);

    void startProgress(RoomDownload roomDownload);
}
