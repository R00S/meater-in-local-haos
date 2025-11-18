package cm.aptoide.p092pt.install;

/* loaded from: classes.dex */
public class Install {
    private final String appName;
    private final long appSize;
    private final String icon;
    private final boolean isIndeterminate;
    private final String md5;
    private final String packageName;
    private final int progress;
    private final int speed;
    private final InstallationStatus state;
    private final InstallationType type;
    private final int versionCode;
    private final String versionName;

    public enum InstallationStatus {
        DOWNLOADING,
        PAUSED,
        INSTALLED,
        UNINSTALLED,
        INSTALLATION_TIMEOUT,
        GENERIC_ERROR,
        NOT_ENOUGH_SPACE_ERROR,
        INITIAL_STATE,
        IN_QUEUE,
        INSTALLING
    }

    public enum InstallationType {
        INSTALLED,
        INSTALL,
        UPDATE,
        DOWNGRADE
    }

    public Install(int i2, InstallationStatus installationStatus, InstallationType installationType, boolean z, int i3, String str, String str2, int i4, String str3, String str4, String str5, long j2) {
        this.progress = i2;
        this.state = installationStatus;
        this.type = installationType;
        this.isIndeterminate = z;
        this.speed = i3;
        this.md5 = str;
        this.packageName = str2;
        this.versionCode = i4;
        this.versionName = str3;
        this.appName = str4;
        this.icon = str5;
        this.appSize = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Install install = (Install) obj;
        if (this.versionName.equals(install.versionName) && this.versionCode == install.versionCode && this.state == install.state && this.md5.equals(install.md5) && this.progress == install.progress) {
            return this.packageName.equals(install.packageName);
        }
        return false;
    }

    public String getAppName() {
        return this.appName;
    }

    public long getAppSize() {
        return this.appSize;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getProgress() {
        return this.progress;
    }

    public int getSpeed() {
        return this.speed;
    }

    public InstallationStatus getState() {
        return this.state;
    }

    public InstallationType getType() {
        return this.type;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public boolean hasDownloadStarted() {
        InstallationStatus installationStatus = this.state;
        return (installationStatus == InstallationStatus.IN_QUEUE || installationStatus == InstallationStatus.INITIAL_STATE || installationStatus == InstallationStatus.PAUSED) ? false : true;
    }

    public int hashCode() {
        return (((((((this.state.hashCode() * 31) + this.md5.hashCode()) * 31) + this.packageName.hashCode()) * 31) + this.versionName.hashCode()) * 31) + this.versionCode;
    }

    public boolean isFailed() {
        InstallationStatus installationStatus = this.state;
        return installationStatus == InstallationStatus.GENERIC_ERROR || installationStatus == InstallationStatus.INSTALLATION_TIMEOUT || installationStatus == InstallationStatus.NOT_ENOUGH_SPACE_ERROR;
    }

    public boolean isIndeterminate() {
        return this.isIndeterminate;
    }

    public String toString() {
        return "Install{state=" + this.state + ", isIndeterminate=" + this.isIndeterminate + '}';
    }
}
