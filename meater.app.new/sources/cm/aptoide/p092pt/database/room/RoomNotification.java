package cm.aptoide.p092pt.database.room;

import java.util.List;

/* loaded from: classes.dex */
public class RoomNotification {
    public static final String KEY = "key";
    public static final int NOT_DISMISSED = -1;
    private final String abTestingGroup;
    private final int actionStringRes;
    private final String appName;
    private final String body;
    private final int campaignId;
    private long dismissed;
    private final Long expire;
    private final String graphic;
    private final String img;
    private String key;
    private final String lang;
    private final String notificationCenterUrlTrack;
    private final String ownerId;
    private final boolean processed;
    private final long timeStamp;
    private final String title;
    private final int type;
    private final String url;
    private final String urlTrack;
    private final List<String> whitelistedPackages;

    public RoomNotification(Long l, String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, long j2, int i3, long j3, String str9, String str10, String str11, boolean z, int i4, List<String> list) {
        this.expire = l;
        this.body = str2;
        this.img = str3;
        this.title = str5;
        this.url = str6;
        this.notificationCenterUrlTrack = str8;
        this.type = i3;
        this.abTestingGroup = str;
        this.campaignId = i2;
        this.lang = str4;
        this.urlTrack = str7;
        this.timeStamp = j2;
        this.dismissed = j3;
        this.appName = str9;
        this.graphic = str10;
        this.ownerId = str11;
        this.processed = z;
        this.actionStringRes = i4;
        this.whitelistedPackages = list;
        this.key = String.valueOf(j2 + i3);
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

    public String getKey() {
        return this.key;
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

    public boolean isDismissed() {
        return this.dismissed != -1;
    }

    public boolean isProcessed() {
        return this.processed;
    }

    public void setDismissed(long j2) {
        this.dismissed = j2;
    }

    public void setKey(String str) {
        this.key = str;
    }
}
