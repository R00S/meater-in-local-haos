package cm.aptoide.p092pt.database.room;

import android.text.TextUtils;
import cm.aptoide.p092pt.utils.IdUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class RoomFileToDownload {
    public static final int APK = 0;
    public static final int ASSET = 12;
    public static final int BASE = 10;
    public static final int FEATURE = 11;
    public static final int GENERIC = 2;
    public static final int MAIN = 13;
    public static final int OBB = 1;
    public static final int PATCH = 14;
    public static final int SPLIT = 3;
    public static final int SUBTYPE_APK = 15;
    private String altLink;
    private int downloadId;
    private String fileName;
    private String link;
    private String md5;
    private String packageName;
    private String path;
    private int progress;
    private int status;
    private int versionCode;
    private String versionName;
    private int fileType = 2;
    private int subFileType = 10;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FileSubType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FileType {
    }

    public static RoomFileToDownload createFileToDownload(String str, String str2, String str3, String str4, int i2, String str5, int i3, String str6, String str7, int i4) {
        RoomFileToDownload roomFileToDownload = new RoomFileToDownload();
        roomFileToDownload.setLink(str);
        roomFileToDownload.setMd5(str3);
        roomFileToDownload.setAltLink(str2);
        roomFileToDownload.versionCode = i3;
        roomFileToDownload.versionName = str6;
        roomFileToDownload.setFileType(i2);
        roomFileToDownload.setSubFileType(i4);
        roomFileToDownload.setPath(str7);
        if (!TextUtils.isEmpty(str4)) {
            if (i2 == 0 || i2 == 3) {
                roomFileToDownload.setFileName(str4 + ".apk");
            } else {
                roomFileToDownload.setFileName(str4);
            }
        }
        roomFileToDownload.setPackageName(str5);
        return roomFileToDownload;
    }

    private void setAltLink(String str) {
        this.altLink = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoomFileToDownload roomFileToDownload = (RoomFileToDownload) obj;
        if (getDownloadId() != roomFileToDownload.getDownloadId() || getFileType() != roomFileToDownload.getFileType() || getSubFileType() != roomFileToDownload.getSubFileType() || getProgress() != roomFileToDownload.getProgress() || getStatus() != roomFileToDownload.getStatus() || getVersionCode() != roomFileToDownload.getVersionCode() || !getMd5().equals(roomFileToDownload.getMd5())) {
            return false;
        }
        if (getAltLink() == null ? roomFileToDownload.getAltLink() != null : !getAltLink().equals(roomFileToDownload.getAltLink())) {
            return false;
        }
        if (getLink() == null ? roomFileToDownload.getLink() != null : !getLink().equals(roomFileToDownload.getLink())) {
            return false;
        }
        if (getPackageName() == null ? roomFileToDownload.getPackageName() != null : !getPackageName().equals(roomFileToDownload.getPackageName())) {
            return false;
        }
        if (getPath() == null ? roomFileToDownload.getPath() != null : !getPath().equals(roomFileToDownload.getPath())) {
            return false;
        }
        if (getFileName() == null ? roomFileToDownload.getFileName() == null : getFileName().equals(roomFileToDownload.getFileName())) {
            return getVersionName() != null ? getVersionName().equals(roomFileToDownload.getVersionName()) : roomFileToDownload.getVersionName() == null;
        }
        return false;
    }

    public String getAltLink() {
        return this.altLink;
    }

    public int getDownloadId() {
        return this.downloadId;
    }

    public String getFileName() {
        return TextUtils.isEmpty(this.fileName) ? TextUtils.isEmpty(getMd5()) ? IdUtils.randomString() : getMd5() : this.fileName;
    }

    public String getFilePath() {
        return getPath() + getFileName();
    }

    public int getFileType() {
        return this.fileType;
    }

    public String getLink() {
        return this.link;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPath() {
        return this.path;
    }

    public int getProgress() {
        return this.progress;
    }

    public int getStatus() {
        return this.status;
    }

    public int getSubFileType() {
        return this.subFileType;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return (((((((((((((((((((((((getMd5().hashCode() * 31) + getDownloadId()) * 31) + (getAltLink() != null ? getAltLink().hashCode() : 0)) * 31) + (getLink() != null ? getLink().hashCode() : 0)) * 31) + (getPackageName() != null ? getPackageName().hashCode() : 0)) * 31) + (getPath() != null ? getPath().hashCode() : 0)) * 31) + getFileType()) * 31) + getSubFileType()) * 31) + getProgress()) * 31) + getStatus()) * 31) + (getFileName() != null ? getFileName().hashCode() : 0)) * 31) + getVersionCode()) * 31) + (getVersionName() != null ? getVersionName().hashCode() : 0);
    }

    public void setDownloadId(int i2) {
        this.downloadId = i2;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFileType(int i2) {
        this.fileType = i2;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setProgress(int i2) {
        this.progress = i2;
    }

    public void setStatus(int i2) {
        this.status = i2;
    }

    public void setSubFileType(int i2) {
        this.subFileType = i2;
    }
}
