package cm.aptoide.p092pt.packageinstaller;

/* loaded from: classes.dex */
public final class InstallStatus {
    private final String message;
    private final String packageName;
    private final Status status;

    public enum Status {
        INSTALLING,
        SUCCESS,
        FAIL,
        CANCELED,
        UNKNOWN_ERROR,
        WAITING_INSTALL_FEEDBACK
    }

    InstallStatus(Status status, String str, String str2) {
        this.message = str;
        this.status = status;
        this.packageName = str2;
    }

    public String getMessage() {
        return this.message;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public Status getStatus() {
        return this.status;
    }
}
