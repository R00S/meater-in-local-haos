package cm.aptoide.p092pt.dataprovider.model.p096v7.store;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

/* loaded from: classes.dex */
public class Store {
    public static final String PUBLIC_ACCESS = "PUBLIC";
    private String access;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "UTC")
    private Date added;
    private Appearance appearance;
    private String avatar;
    private Badge badge;

    /* renamed from: id */
    private long f8544id;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "UTC")
    private Date modified;
    private String name;
    private Stats stats;
    private String status;
    private Urls urls;

    public static class Appearance {
        private String description;
        private String theme;

        public Appearance() {
        }

        public String getDescription() {
            return this.description;
        }

        public String getTheme() {
            return this.theme;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setTheme(String str) {
            this.theme = str;
        }

        public Appearance(String str, String str2) {
            this.theme = str;
            this.description = str2;
        }
    }

    public static class Badge {
        BadgeType name;

        public BadgeType getName() {
            return this.name;
        }

        public void setName(BadgeType badgeType) {
            this.name = badgeType;
        }
    }

    public enum BadgeType {
        NONE,
        BRONZE,
        SILVER,
        GOLD,
        PLATINUM
    }

    public static class Stats {
        private int apps;
        private long downloads;
        private int subscribers;

        public int getApps() {
            return this.apps;
        }

        public long getDownloads() {
            return this.downloads;
        }

        public int getSubscribers() {
            return this.subscribers;
        }

        public void setApps(int i2) {
            this.apps = i2;
        }

        public void setDownloads(long j2) {
            this.downloads = j2;
        }

        public void setSubscribers(int i2) {
            this.subscribers = i2;
        }
    }

    public static class Urls {
        private String mobile;

        protected boolean canEqual(Object obj) {
            return obj instanceof Urls;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Urls)) {
                return false;
            }
            Urls urls = (Urls) obj;
            if (!urls.canEqual(this)) {
                return false;
            }
            String mobile = getMobile();
            String mobile2 = urls.getMobile();
            return mobile != null ? mobile.equals(mobile2) : mobile2 == null;
        }

        public String getMobile() {
            return this.mobile;
        }

        public int hashCode() {
            String mobile = getMobile();
            return 59 + (mobile == null ? 43 : mobile.hashCode());
        }

        public void setMobile(String str) {
            this.mobile = str;
        }

        public String toString() {
            return "Store.Urls(mobile=" + getMobile() + ")";
        }
    }

    public String getAccess() {
        return this.access;
    }

    public Date getAdded() {
        return this.added;
    }

    public Appearance getAppearance() {
        return this.appearance;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public Badge getBadge() {
        return this.badge;
    }

    public long getId() {
        return this.f8544id;
    }

    public Date getModified() {
        return this.modified;
    }

    public String getName() {
        return this.name;
    }

    public Stats getStats() {
        return this.stats;
    }

    public String getStatus() {
        return this.status;
    }

    public Urls getUrls() {
        return this.urls;
    }

    public void setAccess(String str) {
        this.access = str;
    }

    public void setAdded(Date date) {
        this.added = date;
    }

    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setBadge(Badge badge) {
        this.badge = badge;
    }

    public void setId(long j2) {
        this.f8544id = j2;
    }

    public void setModified(Date date) {
        this.modified = date;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setUrls(Urls urls) {
        this.urls = urls;
    }
}
