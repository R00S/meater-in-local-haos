package cm.aptoide.p092pt.database.room;

/* loaded from: classes.dex */
public class RoomInstallation {
    public static final String PACKAGE_NAME = "packageName";
    private String icon;
    private String name;
    private String packageName;
    private int versionCode;
    private String versionName;

    public RoomInstallation(String str, String str2, String str3, int i2, String str4) {
        this.packageName = str;
        this.name = str2;
        this.icon = str3;
        this.versionCode = i2;
        this.versionName = str4;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setVersionCode(int i2) {
        this.versionCode = i2;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }
}
