package cm.aptoide.p092pt.install;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.core.app.C0245i;
import cm.aptoide.p092pt.AppInBackgroundTracker;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.BaseService;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.downloadmanager.AptoideDownloadManager;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.notification.NotificationProvider;
import java.util.Locale;
import javax.inject.Inject;

/* loaded from: classes.dex */
public class DownloadService extends BaseService implements DownloadsNotification {
    public static final String ACTION_INSTALL_FINISHED = "INSTALL_FINISHED";
    public static final String ACTION_STOP_INSTALL = "STOP_INSTALL";
    public static final String DOWNLOAD_APP_ACTION = "DOWNLOAD_APP";
    public static final String EXTRA_INSTALLATION_MD5 = "INSTALLATION_MD5";
    private static final int NOTIFICATION_ID = 8;
    public static final int PROGRESS_MAX_VALUE = 100;
    public static final String TAG = "InstallService";

    @Inject
    AppInBackgroundTracker appInBackgroundTracker;

    @Inject
    AptoideDownloadManager downloadManager;
    private DownloadsNotificationsPresenter downloadsNotificationsPresenter;
    private InstallManager installManager;

    @Inject
    NotificationProvider notificationProvider;
    private Notification progressNotification;
    private final int PAUSE_DOWNLOAD_REQUEST_CODE = 111;
    private final int OPEN_DOWNLOAD_MANAGER_REQUEST_CODE = 222;
    private final int OPEN_APPVIEW_REQUEST_CODE = 333;
    private final String CHANNEL_ID = "download_notification_channel";

    private Notification buildNotification(String str, int i2, boolean z, C0245i.a aVar, C0245i.a aVar2, PendingIntent pendingIntent) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            createNotificationChannel();
        }
        C0245i.e eVar = i3 >= 26 ? new C0245i.e(this, "download_notification_channel") : new C0245i.e(this);
        C0245i.e eVarM1597l = eVar.m1609y(R.drawable.stat_sys_download).m1597l(String.format(Locale.ENGLISH, getResources().getString(C1146R.string.aptoide_downloading), getString(C1146R.string.app_name)));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" - ");
        sb.append(getString(C1146R.string.download_progress));
        eVarM1597l.m1596k(sb).m1595j(pendingIntent).m1607w(100, i2, z).m1589b(aVar).m1589b(aVar2);
        return eVar.m1590c();
    }

    private Intent createDeeplinkingIntent() {
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), AptoideApplication.getActivityProvider().getMainActivityFragmentClass());
        intent.setFlags(276824064);
        return intent;
    }

    private void createNotificationChannel() {
        ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("download_notification_channel", "Download notifications", 0));
    }

    private C0245i.a getAction(int i2, String str, PendingIntent pendingIntent) {
        return new C0245i.a(i2, str, pendingIntent);
    }

    private PendingIntent getAppViewOpeningPendingIntent(String str) {
        Intent intentCreateDeeplinkingIntent = createDeeplinkingIntent();
        Bundle bundle = new Bundle();
        bundle.putBoolean(DeepLinkIntentReceiver.DeepLinksTargets.APP_VIEW_FRAGMENT, true);
        bundle.putString("md5", str);
        intentCreateDeeplinkingIntent.putExtras(bundle);
        return PendingIntent.getActivity(this, 333, intentCreateDeeplinkingIntent, 167772160);
    }

    private NotificationChannel getChannel() {
        NotificationChannel notificationChannel = new NotificationChannel("download_notification_channel", "Download notifications", 4);
        notificationChannel.setDescription("Download");
        return notificationChannel;
    }

    private C0245i.a getDownloadManagerAction(int i2) {
        return getAction(C1146R.drawable.ic_manager, getString(C1146R.string.open_apps_manager), getOpenDownloadManagerPendingIntent(i2));
    }

    private PendingIntent getOpenDownloadManagerPendingIntent(int i2) {
        Intent intentCreateDeeplinkingIntent = createDeeplinkingIntent();
        intentCreateDeeplinkingIntent.putExtra(DeepLinkIntentReceiver.DeepLinksTargets.FROM_DOWNLOAD_NOTIFICATION, true);
        return PendingIntent.getActivity(this, 222, intentCreateDeeplinkingIntent, 67108864);
    }

    private C0245i.a getPauseAction(String str) {
        return getAction(C1146R.drawable.media_pause, getString(C1146R.string.pause_download), getPausePendingIntent(str));
    }

    private PendingIntent getPausePendingIntent(String str) {
        Intent intent = new Intent(this, (Class<?>) DownloadService.class);
        if (!TextUtils.isEmpty(str)) {
            Bundle bundle = new Bundle();
            bundle.putString(EXTRA_INSTALLATION_MD5, str);
            intent.putExtras(bundle);
        }
        intent.setAction(ACTION_STOP_INSTALL);
        return PendingIntent.getService(this, 111, intent, 167772160);
    }

    public static Intent newInstanceForDownloads(Context context) {
        Intent intent = new Intent(context, (Class<?>) DownloadService.class);
        intent.setAction(DOWNLOAD_APP_ACTION);
        return intent;
    }

    private void pauseDownload(String str) {
        this.progressNotification = null;
        this.downloadManager.pauseDownload(str).m39964H();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        getApplicationComponent().inject(this);
        Logger.getInstance().m8273d(TAG, "Install service is starting");
        this.installManager = ((AptoideApplication) getApplicationContext()).getInstallManager();
        DownloadsNotificationsPresenter downloadsNotificationsPresenter = new DownloadsNotificationsPresenter(this, this.installManager, this.appInBackgroundTracker, this.notificationProvider);
        this.downloadsNotificationsPresenter = downloadsNotificationsPresenter;
        downloadsNotificationsPresenter.present();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Logger.getInstance().m8273d(getClass().getName(), "InstallService.onDestroy");
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        if (intent == null || !ACTION_STOP_INSTALL.equals(intent.getAction())) {
            return 1;
        }
        String stringExtra = intent.getStringExtra(EXTRA_INSTALLATION_MD5);
        Logger.getInstance().m8273d(TAG, "received intent pausing download: " + stringExtra);
        pauseDownload(stringExtra);
        return 1;
    }

    @Override // cm.aptoide.p092pt.install.DownloadsNotification
    public void removeProgressNotificationAndStop() {
        this.downloadsNotificationsPresenter.onDestroy();
        this.progressNotification = null;
        stopForeground(true);
        stopSelf();
    }

    @Override // cm.aptoide.p092pt.install.DownloadsNotification
    public void setupProgressNotification(String str, String str2, int i2, boolean z) {
        C0245i.a downloadManagerAction = getDownloadManagerAction(str.hashCode());
        PendingIntent appViewOpeningPendingIntent = getAppViewOpeningPendingIntent(str);
        C0245i.a pauseAction = getPauseAction(str);
        Notification notification = this.progressNotification;
        if (notification == null) {
            this.progressNotification = buildNotification(str2, i2, z, pauseAction, downloadManagerAction, appViewOpeningPendingIntent);
        } else {
            long j2 = notification.when;
            Notification notificationBuildNotification = buildNotification(str2, i2, z, pauseAction, downloadManagerAction, appViewOpeningPendingIntent);
            this.progressNotification = notificationBuildNotification;
            notificationBuildNotification.when = j2;
        }
        startForeground(8, this.progressNotification);
    }
}
