package cm.aptoide.p092pt.install;

/* loaded from: classes.dex */
public interface InstallerAnalytics {
    void installationType(boolean z, boolean z2);

    void logInstallCancelEvent(String str, int i2);

    void rootInstallCancelled();

    void rootInstallCompleted(int i2);

    void rootInstallFail(Exception exc);

    void rootInstallStart();

    void rootInstallTimeout();
}
