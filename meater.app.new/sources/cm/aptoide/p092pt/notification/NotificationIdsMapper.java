package cm.aptoide.p092pt.notification;

/* loaded from: classes.dex */
public class NotificationIdsMapper {
    int getNotificationId(int i2) throws RuntimeException {
        switch (i2) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return 1;
            case 3:
                return 2;
            case 7:
                return 3;
            case 8:
                return 4;
            case 9:
                return 5;
            default:
                throw new IllegalArgumentException("unknown notification type " + i2);
        }
    }

    Integer[] getNotificationType(int i2) throws RuntimeException {
        if (i2 == 0) {
            return new Integer[]{0};
        }
        if (i2 == 1) {
            return new Integer[]{2, 1, 5, 6, 4};
        }
        if (i2 == 2) {
            return new Integer[]{3};
        }
        if (i2 == 3) {
            return new Integer[]{7};
        }
        if (i2 == 4) {
            return new Integer[]{8};
        }
        if (i2 == 5) {
            return new Integer[]{9};
        }
        throw new IllegalArgumentException("unknown notification notificationId " + i2);
    }
}
