package cm.aptoide.p092pt.downloadmanager;

/* loaded from: classes.dex */
public class FileDownloadProgressResult {
    private long downloadedBytes;
    private long totalFileBytes;

    public FileDownloadProgressResult(long j2, long j3) {
        this.downloadedBytes = j2;
        this.totalFileBytes = j3;
    }

    public long getDownloadedBytes() {
        return this.downloadedBytes;
    }

    public long getTotalFileBytes() {
        return this.totalFileBytes;
    }
}
