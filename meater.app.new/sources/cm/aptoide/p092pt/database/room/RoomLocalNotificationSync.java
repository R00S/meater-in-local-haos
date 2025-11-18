package cm.aptoide.p092pt.database.room;

/* loaded from: classes.dex */
public class RoomLocalNotificationSync {
    private final int actionStringRes;
    private final String body;

    /* renamed from: id */
    private final String f8462id;
    private final String image;
    private final String navigationUrl;
    private final String notificationId;
    private final String title;
    private final long trigger;
    private final int type;

    public RoomLocalNotificationSync(String str, String str2, String str3, String str4, int i2, String str5, long j2, String str6, int i3) {
        this.notificationId = str;
        this.title = str2;
        this.body = str3;
        this.image = str4;
        this.navigationUrl = str5;
        this.trigger = j2;
        this.f8462id = str6;
        this.actionStringRes = i2;
        this.type = i3;
    }

    public int getActionStringRes() {
        return this.actionStringRes;
    }

    public String getBody() {
        return this.body;
    }

    public String getId() {
        return this.f8462id;
    }

    public String getImage() {
        return this.image;
    }

    public String getNavigationUrl() {
        return this.navigationUrl;
    }

    public String getNotificationId() {
        return this.notificationId;
    }

    public String getTitle() {
        return this.title;
    }

    public long getTrigger() {
        return this.trigger;
    }

    public int getType() {
        return this.type;
    }
}
