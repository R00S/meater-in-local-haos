package cm.aptoide.p092pt.notification;

/* loaded from: classes.dex */
public class NotificationInfo {
    private String action;
    private String notificationTrackUrl;
    private int notificationType;
    private String notificationUrl;

    public NotificationInfo(String str, int i2, String str2, String str3) {
        this.action = str;
        this.notificationType = i2;
        this.notificationTrackUrl = str2;
        this.notificationUrl = str3;
    }

    public String getAction() {
        return this.action;
    }

    public String getNotificationTrackUrl() {
        return this.notificationTrackUrl;
    }

    public int getNotificationType() {
        return this.notificationType;
    }

    public String getNotificationUrl() {
        return this.notificationUrl;
    }

    public NotificationInfo(String str) {
        this.action = str;
    }
}
