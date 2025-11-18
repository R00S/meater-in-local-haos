package cm.aptoide.p092pt.notification;

import cm.aptoide.p092pt.install.InstalledAppsRepository;
import cm.aptoide.p092pt.notification.policies.AlwaysShowPolicy;
import cm.aptoide.p092pt.notification.policies.CampaignPolicy;
import cm.aptoide.p092pt.notification.policies.DefaultPolicy;
import cm.aptoide.p092pt.notification.policies.SocialPolicy;

/* loaded from: classes.dex */
public class NotificationPolicyFactory {
    private final InstalledAppsRepository installedAppsRepository;
    private final NotificationProvider notificationProvider;

    public NotificationPolicyFactory(NotificationProvider notificationProvider, InstalledAppsRepository installedAppsRepository) {
        this.notificationProvider = notificationProvider;
        this.installedAppsRepository = installedAppsRepository;
    }

    Policy getPolicy(AptoideNotification aptoideNotification) {
        switch (aptoideNotification.getType()) {
            case 0:
                return new CampaignPolicy(aptoideNotification.getWhitelistedPackages(), this.installedAppsRepository);
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return new SocialPolicy(this.notificationProvider, new Integer[]{1, 2, 5, 6, 4});
            case 3:
                return new SocialPolicy(this.notificationProvider, new Integer[]{3});
            case 7:
            case 8:
            case 9:
                return new AlwaysShowPolicy();
            default:
                return new DefaultPolicy();
        }
    }
}
