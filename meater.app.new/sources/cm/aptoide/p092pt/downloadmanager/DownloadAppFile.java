package cm.aptoide.p092pt.downloadmanager;

/* loaded from: classes.dex */
public class DownloadAppFile {
    private String alternativeDownloadPath;
    private String downloadMd5;
    private String fileName;
    private FileType fileType;
    private String mainDownloadPath;
    private String packageName;
    private int versionCode;

    public enum FileType {
        APK(0),
        OBB(1),
        GENERIC(2),
        SPLIT(3);

        private final int type;

        FileType(int i2) {
            this.type = i2;
        }

        public int getType() {
            return this.type;
        }
    }

    public DownloadAppFile(String str, String str2, String str3, int i2, String str4, String str5, FileType fileType) {
        this.mainDownloadPath = str;
        this.alternativeDownloadPath = str2;
        this.downloadMd5 = str3;
        this.versionCode = i2;
        this.packageName = str4;
        this.fileName = str5;
        this.fileType = fileType;
    }

    public String getAlternativeDownloadPath() {
        return this.alternativeDownloadPath;
    }

    public String getDownloadMd5() {
        return this.downloadMd5;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getFileType() {
        return this.fileType.getType();
    }

    public String getMainDownloadPath() {
        return this.mainDownloadPath;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getVersionCode() {
        return this.versionCode;
    }
}
