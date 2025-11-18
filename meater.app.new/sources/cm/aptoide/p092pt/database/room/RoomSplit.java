package cm.aptoide.p092pt.database.room;

/* loaded from: classes.dex */
public class RoomSplit {
    private long fileSize;
    private String md5;
    private String name;
    private String path;
    private String type;

    public RoomSplit(String str, String str2, String str3, String str4, long j2) {
        this.md5 = str;
        this.path = str2;
        this.type = str3;
        this.name = str4;
        this.fileSize = j2;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public String getType() {
        return this.type;
    }

    public void setFileSize(long j2) {
        this.fileSize = j2;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
