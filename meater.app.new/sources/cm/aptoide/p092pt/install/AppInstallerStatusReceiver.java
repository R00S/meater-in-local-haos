package cm.aptoide.p092pt.install;

import cm.aptoide.p092pt.packageinstaller.InstallStatus;
import p456rx.C11234e;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class AppInstallerStatusReceiver {
    private C11418b<InstallStatus> installStatusPublishSubject;

    public AppInstallerStatusReceiver(C11418b<InstallStatus> c11418b) {
        this.installStatusPublishSubject = c11418b;
    }

    public C11234e<InstallStatus> getInstallerInstallStatus() {
        return this.installStatusPublishSubject;
    }

    public void onStatusReceived(InstallStatus installStatus) {
        this.installStatusPublishSubject.onNext(installStatus);
    }
}
