package cm.aptoide.p092pt;

import cm.aptoide.p092pt.install.DownloadService;
import cm.aptoide.p092pt.install.InstalledIntentService;
import cm.aptoide.p092pt.notification.PullingContentService;
import cm.aptoide.p092pt.toolbox.ToolboxContentProvider;
import cm.aptoide.p092pt.view.ActivityComponent;
import cm.aptoide.p092pt.view.ActivityModule;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes.dex */
public interface ApplicationComponent {
    void inject(AptoideApplication aptoideApplication);

    void inject(AptoideFirebaseNotificationService aptoideFirebaseNotificationService);

    void inject(NotificationApplicationView notificationApplicationView);

    void inject(DownloadService downloadService);

    void inject(InstalledIntentService installedIntentService);

    void inject(PullingContentService pullingContentService);

    void inject(ToolboxContentProvider toolboxContentProvider);

    ActivityComponent plus(ActivityModule activityModule, FlavourActivityModule flavourActivityModule);
}
