package cm.aptoide.p092pt.packageinstaller;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInstaller;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import cm.aptoide.p092pt.packageinstaller.InstallStatus;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class AppInstaller {
    private static final float CLICK_INSTALL_PROGRESS_CALLBACK_VALUE = 0.90000004f;
    static final String INSTALL_SESSION_API_COMPLETE_ACTION = "install_session_api_complete";
    private static final int REQUEST_INSTALL = 22;
    private static final int SESSION_INSTALL_REQUEST_CODE = 18;
    private final Context context;
    private final InstallResultCallback installResultCallback;

    public AppInstaller(Context context, InstallResultCallback installResultCallback) {
        this.context = context;
        this.installResultCallback = installResultCallback;
        if (Build.VERSION.SDK_INT >= 21) {
            registerInstallResultBroadcastReceiver();
            observeInstallSession();
        }
    }

    private void addApkToInstallSession(File file, PackageInstaller.Session session) throws IOException {
        try {
            OutputStream outputStreamOpenWrite = session.openWrite(file.getName(), 0L, file.length());
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int i2 = fileInputStream.read(bArr);
                if (i2 < 0) {
                    session.fsync(outputStreamOpenWrite);
                    outputStreamOpenWrite.close();
                    fileInputStream.close();
                    return;
                }
                outputStreamOpenWrite.write(bArr, 0, i2);
            }
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    private void installWithActionInstallPackageIntent(File file, String str) {
        Intent intent = new Intent("android.intent.action.INSTALL_PACKAGE");
        intent.putExtra("android.intent.extra.RETURN_RESULT", true);
        intent.putExtra("android.intent.extra.INSTALLER_PACKAGE_NAME", this.context.getApplicationContext().getPackageName());
        intent.setData(Uri.fromFile(file));
        intent.setFlags(1);
        intent.setFlags(276824064);
        this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.INSTALLING, "Installing...", str));
        this.context.startActivity(intent);
    }

    private void installWithPackageInstaller(AppInstall appInstall) throws IOException {
        PackageInstaller.Session sessionOpenSession = null;
        try {
            PackageInstaller packageInstaller = this.context.getPackageManager().getPackageInstaller();
            PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
            sessionParams.setAppPackageName(appInstall.getPackageName());
            sessionParams.setInstallLocation(0);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 26) {
                sessionParams.setInstallReason(4);
            }
            if (i2 >= 24) {
                sessionParams.setOriginatingUid(Process.myUid());
            }
            sessionOpenSession = packageInstaller.openSession(packageInstaller.createSession(sessionParams));
            addApkToInstallSession(appInstall.getBaseApk(), sessionOpenSession);
            if (!appInstall.getSplitApks().isEmpty()) {
                Iterator<File> it = appInstall.getSplitApks().iterator();
                while (it.hasNext()) {
                    addApkToInstallSession(it.next(), sessionOpenSession);
                }
            }
            int i3 = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
            this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.WAITING_INSTALL_FEEDBACK, "Installing...", appInstall.getPackageName()));
            sessionOpenSession.commit(PendingIntent.getBroadcast(this.context, 18, new Intent(INSTALL_SESSION_API_COMPLETE_ACTION), i3).getIntentSender());
        } catch (IOException e2) {
            throw new RuntimeException("Couldn't install package", e2);
        } catch (RuntimeException e3) {
            if (sessionOpenSession != null) {
                sessionOpenSession.abandon();
            }
            this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.UNKNOWN_ERROR, e3.getMessage(), appInstall.getPackageName()));
        }
    }

    private void observeInstallSession() {
        this.context.getPackageManager().getPackageInstaller().registerSessionCallback(new PackageInstaller.SessionCallback() { // from class: cm.aptoide.pt.packageinstaller.AppInstaller.2
            @Override // android.content.pm.PackageInstaller.SessionCallback
            public void onActiveChanged(int i2, boolean z) {
            }

            @Override // android.content.pm.PackageInstaller.SessionCallback
            public void onBadgingChanged(int i2) {
            }

            @Override // android.content.pm.PackageInstaller.SessionCallback
            public void onCreated(int i2) {
            }

            @Override // android.content.pm.PackageInstaller.SessionCallback
            public void onFinished(int i2, boolean z) {
            }

            @Override // android.content.pm.PackageInstaller.SessionCallback
            public void onProgressChanged(int i2, float f2) {
                if (Float.compare(f2, AppInstaller.CLICK_INSTALL_PROGRESS_CALLBACK_VALUE) >= 0) {
                    PackageInstaller.SessionInfo sessionInfo = AppInstaller.this.context.getPackageManager().getPackageInstaller().getSessionInfo(i2);
                    if (sessionInfo == null) {
                        AppInstaller.this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.FAIL, "Context - Activity Not Found", "n/a"));
                        return;
                    }
                    try {
                        AppInstaller.this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.INSTALLING, "Installing...", sessionInfo.getAppPackageName()));
                    } catch (ActivityNotFoundException unused) {
                        AppInstaller.this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.FAIL, "Context - Activity Not Found", "n/a"));
                    }
                }
            }
        });
    }

    private void registerInstallResultBroadcastReceiver() {
        this.context.registerReceiver(new InstallResultReceiver(new PackageInstallerResultCallback() { // from class: cm.aptoide.pt.packageinstaller.AppInstaller.1
            @Override // cm.aptoide.p092pt.packageinstaller.PackageInstallerResultCallback
            public void onInstallationResult(InstallStatus installStatus) {
                AppInstaller.this.installResultCallback.onInstallationResult(installStatus);
            }

            @Override // cm.aptoide.p092pt.packageinstaller.PackageInstallerResultCallback
            public void onPendingUserAction(Bundle bundle) {
                Intent intent = (Intent) bundle.get("android.intent.extra.INTENT");
                if (intent != null) {
                    intent.setFlags(276824064);
                    intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
                }
                try {
                    AppInstaller.this.context.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    AppInstaller.this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.FAIL, "Context - Activity Not Found", "n/a"));
                }
            }
        }), new IntentFilter(INSTALL_SESSION_API_COMPLETE_ACTION), null, null);
    }

    public void install(AppInstall appInstall) throws IOException {
        if (Build.VERSION.SDK_INT >= 21) {
            installWithPackageInstaller(appInstall);
        } else if (appInstall.getSplitApks().isEmpty()) {
            installWithActionInstallPackageIntent(appInstall.getBaseApk(), appInstall.getPackageName());
        } else {
            this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.FAIL, "Can't install split apks in devices bellow api 21", appInstall.getPackageName()));
        }
    }

    public void onActivityResult(int i2, int i3) {
        if (i2 == 22) {
            if (i3 == -1) {
                this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.SUCCESS, "Install succeeded", "n/a"));
            } else if (i3 == 0) {
                this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.CANCELED, "Install canceled", "n/a"));
            } else {
                this.installResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.FAIL, "Install failed", "n/a"));
            }
        }
    }
}
