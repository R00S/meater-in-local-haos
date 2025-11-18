package cm.aptoide.p092pt.notification.sync;

import cm.aptoide.p092pt.notification.AptoideNotification;
import cm.aptoide.p092pt.notification.NotificationProvider;
import cm.aptoide.p092pt.sync.Sync;
import okhttp3.HttpUrl;
import p456rx.C11231b;

/* loaded from: classes.dex */
public class LocalNotificationSync extends Sync {
    public static final String APPC_CAMPAIGN_NOTIFICATION = "APPC_CAMPAIGN";
    public static final String NEW_FEATURE = "NEW_FEATURE";
    private static final long TWENTY_FOUR_HOURS = 86400000;
    private final int actionString;
    private final String body;

    /* renamed from: id */
    private final String f10457id;
    private final String image;
    private final String navigationUrl;
    private final NotificationProvider notificationProvider;
    private final String title;
    private final long trigger;
    private final int type;

    public LocalNotificationSync(NotificationProvider notificationProvider, boolean z, boolean z2, long j2, long j3, String str, String str2, String str3, int i2, String str4, String str5, int i3) {
        super(str5, z, z2, j3, j2);
        this.notificationProvider = notificationProvider;
        this.title = str;
        this.body = str2;
        this.image = str3;
        this.navigationUrl = str4;
        this.trigger = j3;
        this.f10457id = str5;
        this.actionString = i2;
        this.type = i3;
    }

    private AptoideNotification createNotification() {
        return new AptoideNotification(this.body, this.image, this.title, this.navigationUrl, this.type, System.currentTimeMillis(), HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, -1L, this.f10457id, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, false, Long.valueOf(System.currentTimeMillis() + 86400000), this.actionString);
    }

    @Override // cm.aptoide.p092pt.sync.Sync
    public C11231b execute() {
        return this.notificationProvider.save(createNotification());
    }

    public int getActionString() {
        return this.actionString;
    }

    public String getBody() {
        return this.body;
    }

    @Override // cm.aptoide.p092pt.sync.Sync
    public String getId() {
        return this.f10457id;
    }

    public String getImage() {
        return this.image;
    }

    public String getNavigationUrl() {
        return this.navigationUrl;
    }

    public String getTitle() {
        return this.title;
    }

    @Override // cm.aptoide.p092pt.sync.Sync
    public long getTrigger() {
        return this.trigger;
    }

    public int getType() {
        return this.type;
    }
}
