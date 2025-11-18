package cm.aptoide.p092pt.notification;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: classes.dex */
public class AptoideNotification {
    public static final int APPC_PROMOTION = 7;
    public static final int APPS_READY_TO_INSTALL = 9;
    public static final int CAMPAIGN = 0;
    public static final int COMMENT = 1;
    public static final int LIKE = 2;
    public static final int NEW_ACTIVITY = 6;
    public static final int NEW_FEATURE = 8;
    public static final int NEW_FOLLOWER = 4;
    public static final int NEW_SHARE = 5;
    public static final int NOT_DISMISSED = -1;
    public static final int POPULAR = 3;
    private String abTestingGroup;
    private int actionStringRes;
    private String appName;
    private String body;
    private int campaignId;
    private long dismissed;
    private Long expire;
    private String graphic;
    private String img;
    private String lang;
    private String notificationCenterUrlTrack;
    private String ownerId;
    private boolean processed;
    private long timeStamp;
    private String title;
    private int type;
    private String url;
    private String urlTrack;
    private List<String> whitelistedPackages;

    @Retention(RetentionPolicy.SOURCE)
    public @interface NotificationType {
    }

    public AptoideNotification(String str, String str2, String str3, String str4, int i2, long j2, String str5, String str6, long j3, String str7, String str8, String str9, boolean z, Long l, int i3) {
        this.actionStringRes = -1;
        this.body = str;
        this.img = str2;
        this.title = str3;
        this.url = str4;
        this.type = i2;
        this.timeStamp = j2;
        this.appName = str5;
        this.graphic = str6;
        this.dismissed = j3;
        this.ownerId = str7;
        this.expire = l;
        this.urlTrack = str8;
        this.notificationCenterUrlTrack = str9;
        this.processed = z;
        this.actionStringRes = i3;
    }

    public String getAbTestingGroup() {
        return this.abTestingGroup;
    }

    public int getActionStringRes() {
        return this.actionStringRes;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getBody() {
        return this.body;
    }

    public int getCampaignId() {
        return this.campaignId;
    }

    public long getDismissed() {
        return this.dismissed;
    }

    public Long getExpire() {
        return this.expire;
    }

    public String getGraphic() {
        return this.graphic;
    }

    public String getImg() {
        return this.img;
    }

    public String getLang() {
        return this.lang;
    }

    public String getNotificationCenterUrlTrack() {
        return this.notificationCenterUrlTrack;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUrlTrack() {
        return this.urlTrack;
    }

    public List<String> getWhitelistedPackages() {
        return this.whitelistedPackages;
    }

    public boolean isProcessed() {
        return this.processed;
    }

    public void setProcessed(boolean z) {
        this.processed = z;
    }

    public void setWhitelistedPackages(List<String> list) {
        this.whitelistedPackages = list;
    }

    public String toString() {
        return "AptoideNotification{title='" + this.title + "'}";
    }

    public AptoideNotification(String str, String str2, String str3, String str4, int i2, String str5, String str6, long j2, String str7, String str8, String str9, boolean z, long j3, Long l, String str10, int i3, String str11, int i4, List<String> list) {
        this(str, str2, str3, str4, i2, j3, str5, str6, j2, str7, str8, str9, z, l, i4);
        this.abTestingGroup = str10;
        this.campaignId = i3;
        this.lang = str11;
        this.whitelistedPackages = list;
    }

    public AptoideNotification(String str, String str2, String str3, String str4, String str5, int i2, int i3, long j2, String str6) {
        this.actionStringRes = -1;
        this.img = str;
        this.title = str2;
        this.url = str3;
        this.urlTrack = str4;
        this.graphic = str5;
        this.type = i2;
        this.campaignId = i3;
        this.timeStamp = j2;
        this.ownerId = str6;
    }

    public AptoideNotification(String str, String str2, String str3, String str4, int i2) {
        this.actionStringRes = -1;
        this.img = str;
        this.url = str3;
        this.graphic = str4;
        this.type = i2;
        this.appName = str2;
    }
}
