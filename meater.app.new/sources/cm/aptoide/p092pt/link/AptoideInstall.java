package cm.aptoide.p092pt.link;

/* loaded from: classes.dex */
public class AptoideInstall {
    private final long appId;
    private final String openType;
    private final String origin;
    private final String packageName;
    private final String storeName;
    private final String uname;

    public AptoideInstall(long j2, String str, String str2) {
        this.appId = j2;
        this.packageName = str;
        this.openType = str2;
        this.origin = null;
        this.uname = null;
        this.storeName = null;
    }

    public long getAppId() {
        return this.appId;
    }

    public String getOpenType() {
        return this.openType;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getUname() {
        return this.uname;
    }

    public AptoideInstall(String str, String str2, String str3, String str4) {
        this.storeName = str;
        this.packageName = str2;
        this.openType = str3;
        this.origin = str4;
        this.uname = null;
        this.appId = -1L;
    }

    public AptoideInstall(String str, String str2) {
        this.uname = str;
        this.packageName = str2;
        this.openType = null;
        this.appId = -1L;
        this.storeName = null;
        this.origin = null;
    }
}
