package cm.aptoide.p092pt.downloadmanager;

import java.util.List;

/* loaded from: classes.dex */
public class DownloadApp {
    private String attributionId;
    private List<DownloadAppFile> downloadFiles;
    private String md5;
    private final String packageName;
    private long size;
    private final int versionCode;

    public DownloadApp(String str, int i2, List<DownloadAppFile> list, String str2, long j2, String str3) {
        this.packageName = str;
        this.versionCode = i2;
        this.downloadFiles = list;
        this.md5 = str2;
        this.size = j2;
        this.attributionId = str3;
    }

    public String getAttributionId() {
        return this.attributionId;
    }

    public List<DownloadAppFile> getDownloadFiles() {
        return this.downloadFiles;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public long getSize() {
        return this.size;
    }

    public int getVersionCode() {
        return this.versionCode;
    }
}
