package cm.aptoide.p092pt.dataprovider.model.p096v7.listapp;

import cm.aptoide.p092pt.dataprovider.model.p096v7.Aab;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetAppMeta;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Obb;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.downloadmanager.Constants;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* loaded from: classes.dex */
public class App {
    private Aab aab;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private Date added;
    private AppCoinsInfo appcoins;
    private GetAppMeta.Developer developer;
    private File file;
    private String graphic;
    private String icon;

    /* renamed from: id */
    private long f8542id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private Date modified;
    private String name;
    private Obb obb;

    @JsonProperty(Constants.PACKAGE)
    private String packageName;
    private long size;
    private Stats stats;
    private Store store;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private Date updated;
    private String uptype;
    private Urls urls;

    public static class Stats {
        private int apps;
        private int downloads;
        private int pdownloads;
        private Rating rating;
        private int subscribers;

        public static class Rating {
            private float avg;
            private int total;

            protected boolean canEqual(Object obj) {
                return obj instanceof Rating;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Rating)) {
                    return false;
                }
                Rating rating = (Rating) obj;
                return rating.canEqual(this) && Float.compare(getAvg(), rating.getAvg()) == 0 && getTotal() == rating.getTotal();
            }

            public float getAvg() {
                return this.avg;
            }

            public int getTotal() {
                return this.total;
            }

            public int hashCode() {
                return ((Float.floatToIntBits(getAvg()) + 59) * 59) + getTotal();
            }

            public void setAvg(float f2) {
                this.avg = f2;
            }

            public void setTotal(int i2) {
                this.total = i2;
            }

            public String toString() {
                return "App.Stats.Rating(avg=" + getAvg() + ", total=" + getTotal() + ")";
            }
        }

        protected boolean canEqual(Object obj) {
            return obj instanceof Stats;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Stats)) {
                return false;
            }
            Stats stats = (Stats) obj;
            if (!stats.canEqual(this) || getApps() != stats.getApps() || getSubscribers() != stats.getSubscribers() || getDownloads() != stats.getDownloads() || getPdownloads() != stats.getPdownloads()) {
                return false;
            }
            Rating rating = getRating();
            Rating rating2 = stats.getRating();
            return rating != null ? rating.equals(rating2) : rating2 == null;
        }

        public int getApps() {
            return this.apps;
        }

        public int getDownloads() {
            return this.downloads;
        }

        public int getPdownloads() {
            return this.pdownloads;
        }

        public Rating getRating() {
            return this.rating;
        }

        public int getSubscribers() {
            return this.subscribers;
        }

        public int hashCode() {
            int apps = ((((((getApps() + 59) * 59) + getSubscribers()) * 59) + getDownloads()) * 59) + getPdownloads();
            Rating rating = getRating();
            return (apps * 59) + (rating == null ? 43 : rating.hashCode());
        }

        public void setApps(int i2) {
            this.apps = i2;
        }

        public void setDownloads(int i2) {
            this.downloads = i2;
        }

        public void setPdownloads(int i2) {
            this.pdownloads = i2;
        }

        public void setRating(Rating rating) {
            this.rating = rating;
        }

        public void setSubscribers(int i2) {
            this.subscribers = i2;
        }

        public String toString() {
            return "App.Stats(apps=" + getApps() + ", subscribers=" + getSubscribers() + ", downloads=" + getDownloads() + ", pdownloads=" + getPdownloads() + ", rating=" + getRating() + ")";
        }
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof App;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof App)) {
            return false;
        }
        App app = (App) obj;
        if (!app.canEqual(this) || getId() != app.getId()) {
            return false;
        }
        String name = getName();
        String name2 = app.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String packageName = getPackageName();
        String packageName2 = app.getPackageName();
        if (packageName != null ? !packageName.equals(packageName2) : packageName2 != null) {
            return false;
        }
        if (getSize() != app.getSize()) {
            return false;
        }
        String icon = getIcon();
        String icon2 = app.getIcon();
        if (icon != null ? !icon.equals(icon2) : icon2 != null) {
            return false;
        }
        String graphic = getGraphic();
        String graphic2 = app.getGraphic();
        if (graphic != null ? !graphic.equals(graphic2) : graphic2 != null) {
            return false;
        }
        Date added = getAdded();
        Date added2 = app.getAdded();
        if (added != null ? !added.equals(added2) : added2 != null) {
            return false;
        }
        Date modified = getModified();
        Date modified2 = app.getModified();
        if (modified != null ? !modified.equals(modified2) : modified2 != null) {
            return false;
        }
        Date updated = getUpdated();
        Date updated2 = app.getUpdated();
        if (updated != null ? !updated.equals(updated2) : updated2 != null) {
            return false;
        }
        String uptype = getUptype();
        String uptype2 = app.getUptype();
        if (uptype != null ? !uptype.equals(uptype2) : uptype2 != null) {
            return false;
        }
        Store store = getStore();
        Store store2 = app.getStore();
        if (store != null ? !store.equals(store2) : store2 != null) {
            return false;
        }
        File file = getFile();
        File file2 = app.getFile();
        if (file != null ? !file.equals(file2) : file2 != null) {
            return false;
        }
        Stats stats = getStats();
        Stats stats2 = app.getStats();
        if (stats != null ? !stats.equals(stats2) : stats2 != null) {
            return false;
        }
        Obb obb = getObb();
        Obb obb2 = app.getObb();
        return obb != null ? obb.equals(obb2) : obb2 == null;
    }

    public Aab getAab() {
        return this.aab;
    }

    public Date getAdded() {
        return this.added;
    }

    public AppCoinsInfo getAppcoins() {
        return this.appcoins;
    }

    public GetAppMeta.Developer getDeveloper() {
        return this.developer;
    }

    public File getFile() {
        return this.file;
    }

    public String getGraphic() {
        return this.graphic;
    }

    public String getIcon() {
        return this.icon;
    }

    public long getId() {
        return this.f8542id;
    }

    public Date getModified() {
        return this.modified;
    }

    public String getName() {
        return this.name;
    }

    public Obb getObb() {
        return this.obb;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public long getSize() {
        return this.size;
    }

    public Stats getStats() {
        return this.stats;
    }

    public Store getStore() {
        return this.store;
    }

    public Date getUpdated() {
        return this.updated;
    }

    public String getUptype() {
        return this.uptype;
    }

    public Urls getUrls() {
        return this.urls;
    }

    public boolean hasAdvertising() {
        return getAppcoins() != null && getAppcoins().hasAdvertising();
    }

    public boolean hasBilling() {
        return getAppcoins() != null && getAppcoins().hasBilling();
    }

    public boolean hasSplits() {
        Aab aab = this.aab;
        return (aab == null || aab.getRequiredSplits().isEmpty()) ? false : true;
    }

    public int hashCode() {
        long id = getId();
        String name = getName();
        int iHashCode = ((((int) (id ^ (id >>> 32))) + 59) * 59) + (name == null ? 43 : name.hashCode());
        String packageName = getPackageName();
        int i2 = iHashCode * 59;
        int iHashCode2 = packageName == null ? 43 : packageName.hashCode();
        long size = getSize();
        String icon = getIcon();
        int iHashCode3 = ((((i2 + iHashCode2) * 59) + ((int) ((size >>> 32) ^ size))) * 59) + (icon == null ? 43 : icon.hashCode());
        String graphic = getGraphic();
        int iHashCode4 = (iHashCode3 * 59) + (graphic == null ? 43 : graphic.hashCode());
        Date added = getAdded();
        int iHashCode5 = (iHashCode4 * 59) + (added == null ? 43 : added.hashCode());
        Date modified = getModified();
        int iHashCode6 = (iHashCode5 * 59) + (modified == null ? 43 : modified.hashCode());
        Date updated = getUpdated();
        int iHashCode7 = (iHashCode6 * 59) + (updated == null ? 43 : updated.hashCode());
        String uptype = getUptype();
        int iHashCode8 = (iHashCode7 * 59) + (uptype == null ? 43 : uptype.hashCode());
        Store store = getStore();
        int iHashCode9 = (iHashCode8 * 59) + (store == null ? 43 : store.hashCode());
        File file = getFile();
        int iHashCode10 = (iHashCode9 * 59) + (file == null ? 43 : file.hashCode());
        Stats stats = getStats();
        int iHashCode11 = (iHashCode10 * 59) + (stats == null ? 43 : stats.hashCode());
        Obb obb = getObb();
        return (iHashCode11 * 59) + (obb != null ? obb.hashCode() : 43);
    }

    public void setAdded(Date date) {
        this.added = date;
    }

    public void setAppcoinsInfo(AppCoinsInfo appCoinsInfo) {
        this.appcoins = appCoinsInfo;
    }

    public void setDeveloper(GetAppMeta.Developer developer) {
        this.developer = developer;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setGraphic(String str) {
        this.graphic = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setId(long j2) {
        this.f8542id = j2;
    }

    public void setModified(Date date) {
        this.modified = date;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setObb(Obb obb) {
        this.obb = obb;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setSize(long j2) {
        this.size = j2;
    }

    public void setSplits(Aab aab) {
        this.aab = aab;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public void setUpdated(Date date) {
        this.updated = date;
    }

    public void setUptype(String str) {
        this.uptype = str;
    }

    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    public String toString() {
        return "App(id=" + getId() + ", name=" + getName() + ", packageName=" + getPackageName() + ", size=" + getSize() + ", icon=" + getIcon() + ", graphic=" + getGraphic() + ", added=" + getAdded() + ", modified=" + getModified() + ", updated=" + getUpdated() + ", uptype=" + getUptype() + ", store=" + getStore() + ", file=" + getFile() + ", stats=" + getStats() + ", obb=" + getObb() + ")";
    }
}
