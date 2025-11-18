package cm.aptoide.p092pt.social.data;

/* loaded from: classes.dex */
public class User {
    public static final int NO_FOLLOWERS = -1;
    public static final int NO_FOLLOWINGS = -1;
    public static final int NO_NOTIFICATION_ID = -1;
    private final String analyticsUrl;
    private final String bodyMessage;
    private final long followers;
    private final long following;
    private final String image;
    private boolean isLogged;
    private final int notificationId;
    private final String urlAction;

    public User(String str, String str2, String str3, int i2, boolean z, String str4) {
        this.bodyMessage = str;
        this.image = str2;
        this.urlAction = str3;
        this.notificationId = i2;
        this.isLogged = z;
        this.analyticsUrl = str4;
        this.followers = -1L;
        this.following = -1L;
    }

    public String getAnalyticsUrl() {
        return this.analyticsUrl;
    }

    public String getBodyMessage() {
        return this.bodyMessage;
    }

    public long getFollowers() {
        return this.followers;
    }

    public long getFollowing() {
        return this.following;
    }

    public String getImage() {
        return this.image;
    }

    public int getNotificationId() {
        return this.notificationId;
    }

    public String getUrlAction() {
        return this.urlAction;
    }

    public boolean hasNotification() {
        return (this.bodyMessage == null || this.image == null || this.urlAction == null || this.notificationId == -1) ? false : true;
    }

    public boolean hasStats() {
        return (getFollowers() == -1 || getFollowing() == -1) ? false : true;
    }

    public boolean isLogged() {
        return this.isLogged;
    }

    public User(boolean z) {
        this.isLogged = z;
        this.bodyMessage = null;
        this.image = null;
        this.urlAction = null;
        this.notificationId = -1;
        this.followers = -1L;
        this.following = -1L;
        this.analyticsUrl = null;
    }

    public User(long j2, long j3, boolean z) {
        this.followers = j2;
        this.following = j3;
        this.isLogged = z;
        this.bodyMessage = null;
        this.image = null;
        this.urlAction = null;
        this.notificationId = -1;
        this.analyticsUrl = null;
    }
}
