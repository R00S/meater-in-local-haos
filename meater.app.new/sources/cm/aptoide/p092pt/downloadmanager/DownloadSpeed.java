package cm.aptoide.p092pt.downloadmanager;

/* loaded from: classes.dex */
public class DownloadSpeed {
    private long averageApkSpeed;
    private long averageObbSpeed;
    private long averageSplitSpeed;

    public DownloadSpeed(long j2, long j3, long j4) {
        this.averageApkSpeed = j2;
        this.averageObbSpeed = j3;
        this.averageSplitSpeed = j4;
    }

    public long getAverageApkSpeed() {
        return this.averageApkSpeed;
    }

    public long getAverageObbSpeed() {
        return this.averageObbSpeed;
    }

    public long getAverageSplitSpeed() {
        return this.averageSplitSpeed;
    }
}
