package cm.aptoide.p092pt.install.installer;

import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class InstallationState {
    private static final int DEFAULT_APP_SIZE = 0;
    private final long appSize;
    private final String icon;
    private final String name;
    private final String packageName;
    private final int status;
    private final int type;
    private final int versionCode;
    private final String versionName;

    public InstallationState(String str, int i2, int i3, int i4, long j2) {
        this.packageName = str;
        this.versionCode = i2;
        this.status = i3;
        this.type = i4;
        this.appSize = j2;
        this.name = null;
        this.icon = null;
        this.versionName = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public long getAppSize() {
        return this.appSize;
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

    public int getStatus() {
        return this.status;
    }

    public int getType() {
        return this.type;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public InstallationState(String str, int i2, int i3, int i4) {
        this.packageName = str;
        this.versionCode = i2;
        this.status = i3;
        this.type = i4;
        this.appSize = 0L;
        this.name = null;
        this.icon = null;
        this.versionName = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public InstallationState(String str, int i2, String str2, int i3, int i4, String str3, String str4, long j2) {
        this.packageName = str;
        this.versionCode = i2;
        this.versionName = str2;
        this.status = i3;
        this.type = i4;
        this.name = str3;
        this.icon = str4;
        this.appSize = j2;
    }
}
