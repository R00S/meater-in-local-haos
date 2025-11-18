package cm.aptoide.p092pt.notification;

import cm.aptoide.p092pt.database.room.RoomLocalNotificationSync;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSync;

/* loaded from: classes.dex */
public class RoomLocalNotificationSyncMapper {
    public RoomLocalNotificationSync map(LocalNotificationSync localNotificationSync) {
        return new RoomLocalNotificationSync(localNotificationSync.getId(), localNotificationSync.getTitle(), localNotificationSync.getBody(), localNotificationSync.getImage(), localNotificationSync.getActionString(), localNotificationSync.getNavigationUrl(), localNotificationSync.getTrigger(), localNotificationSync.getId(), localNotificationSync.getType());
    }

    public LocalNotificationSync map(RoomLocalNotificationSync roomLocalNotificationSync, NotificationProvider notificationProvider) {
        return new LocalNotificationSync(notificationProvider, false, false, 0L, roomLocalNotificationSync.getTrigger(), roomLocalNotificationSync.getTitle(), roomLocalNotificationSync.getBody(), roomLocalNotificationSync.getImage(), roomLocalNotificationSync.getActionStringRes(), roomLocalNotificationSync.getNavigationUrl(), roomLocalNotificationSync.getId(), roomLocalNotificationSync.getType());
    }
}
