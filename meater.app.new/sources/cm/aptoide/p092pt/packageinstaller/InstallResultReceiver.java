package cm.aptoide.p092pt.packageinstaller;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import cm.aptoide.p092pt.packageinstaller.InstallStatus;

/* loaded from: classes.dex */
class InstallResultReceiver extends BroadcastReceiver {
    private final PackageInstallerResultCallback packageInstallerResultCallback;

    public InstallResultReceiver(PackageInstallerResultCallback packageInstallerResultCallback) {
        this.packageInstallerResultCallback = packageInstallerResultCallback;
    }

    @Override // android.content.BroadcastReceiver
    @TargetApi(21)
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || !"install_session_api_complete".equals(intent.getAction())) {
            return;
        }
        int i2 = extras.getInt("android.content.pm.extra.STATUS");
        String string = extras.getString("android.content.pm.extra.STATUS_MESSAGE");
        String string2 = extras.getString("android.content.pm.extra.PACKAGE_NAME");
        switch (i2) {
            case -1:
                this.packageInstallerResultCallback.onPendingUserAction(extras);
                return;
            case 0:
                this.packageInstallerResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.SUCCESS, "Install succeeded", string2));
                return;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
                this.packageInstallerResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.FAIL, "Install failed " + i2 + ", " + string, string2));
                return;
            case 3:
                this.packageInstallerResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.CANCELED, "Install failed " + i2 + ", " + string, string2));
                break;
        }
        this.packageInstallerResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.UNKNOWN_ERROR, "Unrecognized status received from installer", string2));
    }
}
