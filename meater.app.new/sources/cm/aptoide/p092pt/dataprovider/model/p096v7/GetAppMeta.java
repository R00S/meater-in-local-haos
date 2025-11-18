package cm.aptoide.p092pt.dataprovider.model.p096v7;

import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.AppCoinsInfo;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.File;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.Urls;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.downloadmanager.Constants;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class GetAppMeta extends BaseV7Response {
    private App data;

    public static class Age {
        private String name;
        private String pegi;
        private int rating;
        private String title;

        public String getName() {
            return this.name;
        }

        public String getPegi() {
            return this.pegi;
        }

        public int getRating() {
            return this.rating;
        }

        public String getTitle() {
            return this.title;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPegi(String str) {
            this.pegi = str;
        }

        public void setRating(int i2) {
            this.rating = i2;
        }

        public void setTitle(String str) {
            this.title = str;
        }
    }

    public static class App {
        private Aab aab;
        private String added;
        private Age age;
        private AppCoinsInfo appcoins;
        private Developer developer;
        private GetAppMetaFile file;
        private String graphic;
        private String icon;

        /* renamed from: id */
        private long f8532id;
        private Media media;
        private String modified;
        private String name;
        private Obb obb;

        @JsonProperty(Constants.PACKAGE)
        private String packageName;
        private long size;
        private Stats stats;
        private Store store;
        private String uname;
        private Urls urls;

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
            String added = getAdded();
            String added2 = app.getAdded();
            if (added != null ? !added.equals(added2) : added2 != null) {
                return false;
            }
            String modified = getModified();
            String modified2 = app.getModified();
            if (modified != null ? !modified.equals(modified2) : modified2 != null) {
                return false;
            }
            Developer developer = getDeveloper();
            Developer developer2 = app.getDeveloper();
            if (developer != null ? !developer.equals(developer2) : developer2 != null) {
                return false;
            }
            Store store = getStore();
            Store store2 = app.getStore();
            if (store != null ? !store.equals(store2) : store2 != null) {
                return false;
            }
            GetAppMetaFile file = getFile();
            GetAppMetaFile file2 = app.getFile();
            if (file != null ? !file.equals(file2) : file2 != null) {
                return false;
            }
            Media media = getMedia();
            Media media2 = app.getMedia();
            if (media != null ? !media.equals(media2) : media2 != null) {
                return false;
            }
            Urls urls = getUrls();
            Urls urls2 = app.getUrls();
            if (urls != null ? !urls.equals(urls2) : urls2 != null) {
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

        public String getAdded() {
            return this.added;
        }

        public Age getAge() {
            return this.age;
        }

        public List<String> getBdsFlags() {
            return this.appcoins.getFlags();
        }

        public Developer getDeveloper() {
            return this.developer;
        }

        public GetAppMetaFile getFile() {
            return this.file;
        }

        public String getGraphic() {
            return this.graphic;
        }

        public String getIcon() {
            return this.icon;
        }

        public long getId() {
            return this.f8532id;
        }

        public String getMd5() {
            GetAppMetaFile getAppMetaFile = this.file;
            return getAppMetaFile == null ? HttpUrl.FRAGMENT_ENCODE_SET : getAppMetaFile.getMd5sum();
        }

        public Media getMedia() {
            return this.media;
        }

        public String getModified() {
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

        public String getUname() {
            return this.uname;
        }

        public Urls getUrls() {
            return this.urls;
        }

        public boolean hasAdvertising() {
            AppCoinsInfo appCoinsInfo = this.appcoins;
            return appCoinsInfo != null && appCoinsInfo.hasAdvertising();
        }

        public boolean hasBilling() {
            AppCoinsInfo appCoinsInfo = this.appcoins;
            return appCoinsInfo != null && appCoinsInfo.hasBilling();
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
            String added = getAdded();
            int iHashCode5 = (iHashCode4 * 59) + (added == null ? 43 : added.hashCode());
            String modified = getModified();
            int iHashCode6 = (iHashCode5 * 59) + (modified == null ? 43 : modified.hashCode());
            Developer developer = getDeveloper();
            int iHashCode7 = (iHashCode6 * 59) + (developer == null ? 43 : developer.hashCode());
            Store store = getStore();
            int iHashCode8 = (iHashCode7 * 59) + (store == null ? 43 : store.hashCode());
            GetAppMetaFile file = getFile();
            int iHashCode9 = (iHashCode8 * 59) + (file == null ? 43 : file.hashCode());
            Media media = getMedia();
            int iHashCode10 = (iHashCode9 * 59) + (media == null ? 43 : media.hashCode());
            Urls urls = getUrls();
            int iHashCode11 = (iHashCode10 * 59) + (urls == null ? 43 : urls.hashCode());
            Stats stats = getStats();
            int iHashCode12 = (iHashCode11 * 59) + (stats == null ? 43 : stats.hashCode());
            Obb obb = getObb();
            return (iHashCode12 * 59) + (obb != null ? obb.hashCode() : 43);
        }

        public void setAab(Aab aab) {
            this.aab = aab;
        }

        public void setAdded(String str) {
            this.added = str;
        }

        public void setAge(Age age) {
            this.age = age;
        }

        public void setAppcoins(AppCoinsInfo appCoinsInfo) {
            this.appcoins = appCoinsInfo;
        }

        public void setDeveloper(Developer developer) {
            this.developer = developer;
        }

        public void setFile(GetAppMetaFile getAppMetaFile) {
            this.file = getAppMetaFile;
        }

        public void setGraphic(String str) {
            this.graphic = str;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setId(long j2) {
            this.f8532id = j2;
        }

        public void setMedia(Media media) {
            this.media = media;
        }

        public void setModified(String str) {
            this.modified = str;
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

        public void setStats(Stats stats) {
            this.stats = stats;
        }

        public void setStore(Store store) {
            this.store = store;
        }

        public void setUname(String str) {
            this.uname = str;
        }

        public void setUrls(Urls urls) {
            this.urls = urls;
        }

        public String toString() {
            return "GetAppMeta.App(id=" + getId() + ", name=" + getName() + ", packageName=" + getPackageName() + ", size=" + getSize() + ", icon=" + getIcon() + ", graphic=" + getGraphic() + ", added=" + getAdded() + ", modified=" + getModified() + ", developer=" + getDeveloper() + ", store=" + getStore() + ", file=" + getFile() + ", media=" + getMedia() + ", urls=" + getUrls() + ", stats=" + getStats() + ", obb=" + getObb() + ")";
        }
    }

    public static class Developer {
        private String email;
        private String name;
        private String privacy;
        private String website;

        protected boolean canEqual(Object obj) {
            return obj instanceof Developer;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Developer)) {
                return false;
            }
            Developer developer = (Developer) obj;
            if (!developer.canEqual(this)) {
                return false;
            }
            String name = getName();
            String name2 = developer.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String website = getWebsite();
            String website2 = developer.getWebsite();
            if (website != null ? !website.equals(website2) : website2 != null) {
                return false;
            }
            String email = getEmail();
            String email2 = developer.getEmail();
            if (email != null ? !email.equals(email2) : email2 != null) {
                return false;
            }
            String privacy = getPrivacy();
            String privacy2 = developer.getPrivacy();
            return privacy != null ? privacy.equals(privacy2) : privacy2 == null;
        }

        public String getEmail() {
            return this.email;
        }

        public String getName() {
            return this.name;
        }

        public String getPrivacy() {
            return this.privacy;
        }

        public String getWebsite() {
            return this.website;
        }

        public int hashCode() {
            String name = getName();
            int iHashCode = name == null ? 43 : name.hashCode();
            String website = getWebsite();
            int iHashCode2 = ((iHashCode + 59) * 59) + (website == null ? 43 : website.hashCode());
            String email = getEmail();
            int iHashCode3 = (iHashCode2 * 59) + (email == null ? 43 : email.hashCode());
            String privacy = getPrivacy();
            return (iHashCode3 * 59) + (privacy != null ? privacy.hashCode() : 43);
        }

        public void setEmail(String str) {
            this.email = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPrivacy(String str) {
            this.privacy = str;
        }

        public void setWebsite(String str) {
            this.website = str;
        }

        public String toString() {
            return "GetAppMeta.Developer(name=" + getName() + ", website=" + getWebsite() + ", email=" + getEmail() + ", privacy=" + getPrivacy() + ")";
        }
    }

    public static class GetAppMetaFile extends File {
        private Flags flags;
        private Hardware hardware;
        private Malware malware;
        private Signature signature;
        private List<String> tags;
        private List<String> usedFeatures;
        private List<String> usedPermissions;

        public static class Flags {
            public static final String GOOD = "GOOD";
            public String review;
            private List<Vote> votes;

            public static class Vote {
                private int count;
                private Type type;

                public enum Type {
                    FAKE,
                    FREEZE,
                    GOOD,
                    LICENSE,
                    VIRUS
                }

                protected boolean canEqual(Object obj) {
                    return obj instanceof Vote;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Vote)) {
                        return false;
                    }
                    Vote vote = (Vote) obj;
                    if (!vote.canEqual(this)) {
                        return false;
                    }
                    Type type = getType();
                    Type type2 = vote.getType();
                    if (type != null ? type.equals(type2) : type2 == null) {
                        return getCount() == vote.getCount();
                    }
                    return false;
                }

                public int getCount() {
                    return this.count;
                }

                public Type getType() {
                    return this.type;
                }

                public int hashCode() {
                    Type type = getType();
                    return (((type == null ? 43 : type.hashCode()) + 59) * 59) + getCount();
                }

                public void setCount(int i2) {
                    this.count = i2;
                }

                public void setType(Type type) {
                    this.type = type;
                }

                public String toString() {
                    return "GetAppMeta.GetAppMetaFile.Flags.Vote(type=" + getType() + ", count=" + getCount() + ")";
                }
            }

            protected boolean canEqual(Object obj) {
                return obj instanceof Flags;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Flags)) {
                    return false;
                }
                Flags flags = (Flags) obj;
                if (!flags.canEqual(this)) {
                    return false;
                }
                String review = getReview();
                String review2 = flags.getReview();
                if (review != null ? !review.equals(review2) : review2 != null) {
                    return false;
                }
                List<Vote> votes = getVotes();
                List<Vote> votes2 = flags.getVotes();
                return votes != null ? votes.equals(votes2) : votes2 == null;
            }

            public String getReview() {
                return this.review;
            }

            public List<Vote> getVotes() {
                return this.votes;
            }

            public int hashCode() {
                String review = getReview();
                int iHashCode = review == null ? 43 : review.hashCode();
                List<Vote> votes = getVotes();
                return ((iHashCode + 59) * 59) + (votes != null ? votes.hashCode() : 43);
            }

            public void setReview(String str) {
                this.review = str;
            }

            public void setVotes(List<Vote> list) {
                this.votes = list;
            }

            public String toString() {
                return "GetAppMeta.GetAppMetaFile.Flags(review=" + getReview() + ", votes=" + getVotes() + ")";
            }
        }

        public static class Hardware {
            private List<String> cpus;
            private List<List<Integer>> densities;
            private int gles;
            private String screen;
            private int sdk;

            protected boolean canEqual(Object obj) {
                return obj instanceof Hardware;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Hardware)) {
                    return false;
                }
                Hardware hardware = (Hardware) obj;
                if (!hardware.canEqual(this) || getSdk() != hardware.getSdk()) {
                    return false;
                }
                String screen = getScreen();
                String screen2 = hardware.getScreen();
                if (screen != null ? !screen.equals(screen2) : screen2 != null) {
                    return false;
                }
                if (getGles() != hardware.getGles()) {
                    return false;
                }
                List<String> cpus = getCpus();
                List<String> cpus2 = hardware.getCpus();
                if (cpus != null ? !cpus.equals(cpus2) : cpus2 != null) {
                    return false;
                }
                List<List<Integer>> densities = getDensities();
                List<List<Integer>> densities2 = hardware.getDensities();
                return densities != null ? densities.equals(densities2) : densities2 == null;
            }

            public List<String> getCpus() {
                return this.cpus;
            }

            public List<List<Integer>> getDensities() {
                return this.densities;
            }

            public int getGles() {
                return this.gles;
            }

            public String getScreen() {
                return this.screen;
            }

            public int getSdk() {
                return this.sdk;
            }

            public int hashCode() {
                int sdk = getSdk() + 59;
                String screen = getScreen();
                int iHashCode = (((sdk * 59) + (screen == null ? 43 : screen.hashCode())) * 59) + getGles();
                List<String> cpus = getCpus();
                int iHashCode2 = (iHashCode * 59) + (cpus == null ? 43 : cpus.hashCode());
                List<List<Integer>> densities = getDensities();
                return (iHashCode2 * 59) + (densities != null ? densities.hashCode() : 43);
            }

            public void setCpus(List<String> list) {
                this.cpus = list;
            }

            public void setDensities(List<List<Integer>> list) {
                this.densities = list;
            }

            public void setGles(int i2) {
                this.gles = i2;
            }

            public void setScreen(String str) {
                this.screen = str;
            }

            public void setSdk(int i2) {
                this.sdk = i2;
            }

            public String toString() {
                return "GetAppMeta.GetAppMetaFile.Hardware(sdk=" + getSdk() + ", screen=" + getScreen() + ", gles=" + getGles() + ", cpus=" + getCpus() + ", densities=" + getDensities() + ")";
            }
        }

        public static class Signature {
            private String owner;
            private String sha1;

            protected boolean canEqual(Object obj) {
                return obj instanceof Signature;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Signature)) {
                    return false;
                }
                Signature signature = (Signature) obj;
                if (!signature.canEqual(this)) {
                    return false;
                }
                String sha1 = getSha1();
                String sha12 = signature.getSha1();
                if (sha1 != null ? !sha1.equals(sha12) : sha12 != null) {
                    return false;
                }
                String owner = getOwner();
                String owner2 = signature.getOwner();
                return owner != null ? owner.equals(owner2) : owner2 == null;
            }

            public String getOwner() {
                return this.owner;
            }

            public String getSha1() {
                return this.sha1;
            }

            public int hashCode() {
                String sha1 = getSha1();
                int iHashCode = sha1 == null ? 43 : sha1.hashCode();
                String owner = getOwner();
                return ((iHashCode + 59) * 59) + (owner != null ? owner.hashCode() : 43);
            }

            public void setOwner(String str) {
                this.owner = str;
            }

            public void setSha1(String str) {
                this.sha1 = str;
            }

            public String toString() {
                return "GetAppMeta.GetAppMetaFile.Signature(sha1=" + getSha1() + ", owner=" + getOwner() + ")";
            }
        }

        @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.File
        protected boolean canEqual(Object obj) {
            return obj instanceof GetAppMetaFile;
        }

        @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.File
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetAppMetaFile)) {
                return false;
            }
            GetAppMetaFile getAppMetaFile = (GetAppMetaFile) obj;
            if (!getAppMetaFile.canEqual(this) || !super.equals(obj)) {
                return false;
            }
            Signature signature = getSignature();
            Signature signature2 = getAppMetaFile.getSignature();
            if (signature != null ? !signature.equals(signature2) : signature2 != null) {
                return false;
            }
            Hardware hardware = getHardware();
            Hardware hardware2 = getAppMetaFile.getHardware();
            if (hardware != null ? !hardware.equals(hardware2) : hardware2 != null) {
                return false;
            }
            Malware malware = getMalware();
            Malware malware2 = getAppMetaFile.getMalware();
            if (malware != null ? !malware.equals(malware2) : malware2 != null) {
                return false;
            }
            Flags flags = getFlags();
            Flags flags2 = getAppMetaFile.getFlags();
            if (flags != null ? !flags.equals(flags2) : flags2 != null) {
                return false;
            }
            List<String> usedFeatures = getUsedFeatures();
            List<String> usedFeatures2 = getAppMetaFile.getUsedFeatures();
            if (usedFeatures != null ? !usedFeatures.equals(usedFeatures2) : usedFeatures2 != null) {
                return false;
            }
            List<String> usedPermissions = getUsedPermissions();
            List<String> usedPermissions2 = getAppMetaFile.getUsedPermissions();
            if (usedPermissions != null ? !usedPermissions.equals(usedPermissions2) : usedPermissions2 != null) {
                return false;
            }
            List<String> tags = getTags();
            List<String> tags2 = getAppMetaFile.getTags();
            return tags != null ? tags.equals(tags2) : tags2 == null;
        }

        public Flags getFlags() {
            return this.flags;
        }

        public Hardware getHardware() {
            return this.hardware;
        }

        @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.File
        public Malware getMalware() {
            return this.malware;
        }

        public Signature getSignature() {
            return this.signature;
        }

        public List<String> getTags() {
            return this.tags;
        }

        public List<String> getUsedFeatures() {
            return this.usedFeatures;
        }

        public List<String> getUsedPermissions() {
            return this.usedPermissions;
        }

        @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.File
        public int hashCode() {
            int iHashCode = super.hashCode() + 59;
            Signature signature = getSignature();
            int iHashCode2 = (iHashCode * 59) + (signature == null ? 43 : signature.hashCode());
            Hardware hardware = getHardware();
            int iHashCode3 = (iHashCode2 * 59) + (hardware == null ? 43 : hardware.hashCode());
            Malware malware = getMalware();
            int iHashCode4 = (iHashCode3 * 59) + (malware == null ? 43 : malware.hashCode());
            Flags flags = getFlags();
            int iHashCode5 = (iHashCode4 * 59) + (flags == null ? 43 : flags.hashCode());
            List<String> usedFeatures = getUsedFeatures();
            int iHashCode6 = (iHashCode5 * 59) + (usedFeatures == null ? 43 : usedFeatures.hashCode());
            List<String> usedPermissions = getUsedPermissions();
            int iHashCode7 = (iHashCode6 * 59) + (usedPermissions == null ? 43 : usedPermissions.hashCode());
            List<String> tags = getTags();
            return (iHashCode7 * 59) + (tags != null ? tags.hashCode() : 43);
        }

        public boolean isGoodApp() {
            String str;
            Flags flags = this.flags;
            return (flags == null || (str = flags.review) == null || !str.equalsIgnoreCase(Flags.GOOD)) ? false : true;
        }

        public void setFlags(Flags flags) {
            this.flags = flags;
        }

        public void setHardware(Hardware hardware) {
            this.hardware = hardware;
        }

        @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.File
        public void setMalware(Malware malware) {
            this.malware = malware;
        }

        public void setSignature(Signature signature) {
            this.signature = signature;
        }

        public void setTags(List<String> list) {
            this.tags = list;
        }

        public void setUsedFeatures(List<String> list) {
            this.usedFeatures = list;
        }

        public void setUsedPermissions(List<String> list) {
            this.usedPermissions = list;
        }

        @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.File
        public String toString() {
            return "GetAppMeta.GetAppMetaFile(signature=" + getSignature() + ", hardware=" + getHardware() + ", malware=" + getMalware() + ", flags=" + getFlags() + ", usedFeatures=" + getUsedFeatures() + ", usedPermissions=" + getUsedPermissions() + ", tags=" + getTags() + ")";
        }
    }

    public static class Media {
        private String description;
        private List<String> keywords;
        private String news;
        private List<Screenshot> screenshots;
        private List<Video> videos;

        public static class Screenshot {
            private int height;
            private String url;
            private int width;

            protected boolean canEqual(Object obj) {
                return obj instanceof Screenshot;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Screenshot)) {
                    return false;
                }
                Screenshot screenshot = (Screenshot) obj;
                if (!screenshot.canEqual(this)) {
                    return false;
                }
                String url = getUrl();
                String url2 = screenshot.getUrl();
                if (url != null ? url.equals(url2) : url2 == null) {
                    return getHeight() == screenshot.getHeight() && getWidth() == screenshot.getWidth();
                }
                return false;
            }

            public int getHeight() {
                return this.height;
            }

            public String getOrientation() {
                return this.height > this.width ? "portrait" : "landscape";
            }

            public String getUrl() {
                return this.url;
            }

            public int getWidth() {
                return this.width;
            }

            public int hashCode() {
                String url = getUrl();
                return (((((url == null ? 43 : url.hashCode()) + 59) * 59) + getHeight()) * 59) + getWidth();
            }

            public void setHeight(int i2) {
                this.height = i2;
            }

            public void setUrl(String str) {
                this.url = str;
            }

            public void setWidth(int i2) {
                this.width = i2;
            }

            public String toString() {
                return "GetAppMeta.Media.Screenshot(url=" + getUrl() + ", height=" + getHeight() + ", width=" + getWidth() + ")";
            }
        }

        public static class Video {
            private String thumbnail;
            private String type;
            private String url;

            protected boolean canEqual(Object obj) {
                return obj instanceof Video;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Video)) {
                    return false;
                }
                Video video = (Video) obj;
                if (!video.canEqual(this)) {
                    return false;
                }
                String type = getType();
                String type2 = video.getType();
                if (type != null ? !type.equals(type2) : type2 != null) {
                    return false;
                }
                String url = getUrl();
                String url2 = video.getUrl();
                if (url != null ? !url.equals(url2) : url2 != null) {
                    return false;
                }
                String thumbnail = getThumbnail();
                String thumbnail2 = video.getThumbnail();
                return thumbnail != null ? thumbnail.equals(thumbnail2) : thumbnail2 == null;
            }

            public String getThumbnail() {
                return this.thumbnail;
            }

            public String getType() {
                return this.type;
            }

            public String getUrl() {
                return this.url;
            }

            public int hashCode() {
                String type = getType();
                int iHashCode = type == null ? 43 : type.hashCode();
                String url = getUrl();
                int iHashCode2 = ((iHashCode + 59) * 59) + (url == null ? 43 : url.hashCode());
                String thumbnail = getThumbnail();
                return (iHashCode2 * 59) + (thumbnail != null ? thumbnail.hashCode() : 43);
            }

            public void setThumbnail(String str) {
                this.thumbnail = str;
            }

            public void setType(String str) {
                this.type = str;
            }

            public void setUrl(String str) {
                this.url = str;
            }

            public String toString() {
                return "GetAppMeta.Media.Video(type=" + getType() + ", url=" + getUrl() + ", thumbnail=" + getThumbnail() + ")";
            }
        }

        protected boolean canEqual(Object obj) {
            return obj instanceof Media;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Media)) {
                return false;
            }
            Media media = (Media) obj;
            if (!media.canEqual(this)) {
                return false;
            }
            List<String> keywords = getKeywords();
            List<String> keywords2 = media.getKeywords();
            if (keywords != null ? !keywords.equals(keywords2) : keywords2 != null) {
                return false;
            }
            String description = getDescription();
            String description2 = media.getDescription();
            if (description != null ? !description.equals(description2) : description2 != null) {
                return false;
            }
            String news = getNews();
            String news2 = media.getNews();
            if (news != null ? !news.equals(news2) : news2 != null) {
                return false;
            }
            List<Screenshot> screenshots = getScreenshots();
            List<Screenshot> screenshots2 = media.getScreenshots();
            if (screenshots != null ? !screenshots.equals(screenshots2) : screenshots2 != null) {
                return false;
            }
            List<Video> videos = getVideos();
            List<Video> videos2 = media.getVideos();
            return videos != null ? videos.equals(videos2) : videos2 == null;
        }

        public String getDescription() {
            return this.description;
        }

        public List<String> getKeywords() {
            return this.keywords;
        }

        public String getNews() {
            return this.news;
        }

        public List<Screenshot> getScreenshots() {
            return this.screenshots;
        }

        public List<Video> getVideos() {
            return this.videos;
        }

        public int hashCode() {
            List<String> keywords = getKeywords();
            int iHashCode = keywords == null ? 43 : keywords.hashCode();
            String description = getDescription();
            int iHashCode2 = ((iHashCode + 59) * 59) + (description == null ? 43 : description.hashCode());
            String news = getNews();
            int iHashCode3 = (iHashCode2 * 59) + (news == null ? 43 : news.hashCode());
            List<Screenshot> screenshots = getScreenshots();
            int iHashCode4 = (iHashCode3 * 59) + (screenshots == null ? 43 : screenshots.hashCode());
            List<Video> videos = getVideos();
            return (iHashCode4 * 59) + (videos != null ? videos.hashCode() : 43);
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setKeywords(List<String> list) {
            this.keywords = list;
        }

        public void setNews(String str) {
            this.news = str;
        }

        public void setScreenshots(List<Screenshot> list) {
            this.screenshots = list;
        }

        public void setVideos(List<Video> list) {
            this.videos = list;
        }

        public String toString() {
            return "GetAppMeta.Media(keywords=" + getKeywords() + ", description=" + getDescription() + ", news=" + getNews() + ", screenshots=" + getScreenshots() + ", videos=" + getVideos() + ")";
        }
    }

    public static class Stats {
        private int downloads;

        @JsonProperty("prating")
        private Rating globalRating;
        private int pdownloads;
        private Rating rating;

        public static class Rating {
            private float avg;
            private int total;
            private List<Vote> votes;

            public static class Vote {
                private int count;
                private int value;

                protected boolean canEqual(Object obj) {
                    return obj instanceof Vote;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Vote)) {
                        return false;
                    }
                    Vote vote = (Vote) obj;
                    return vote.canEqual(this) && getValue() == vote.getValue() && getCount() == vote.getCount();
                }

                public int getCount() {
                    return this.count;
                }

                public int getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return ((getValue() + 59) * 59) + getCount();
                }

                public void setCount(int i2) {
                    this.count = i2;
                }

                public void setValue(int i2) {
                    this.value = i2;
                }

                public String toString() {
                    return "GetAppMeta.Stats.Rating.Vote(value=" + getValue() + ", count=" + getCount() + ")";
                }
            }

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
                if (!rating.canEqual(this) || Float.compare(getAvg(), rating.getAvg()) != 0 || getTotal() != rating.getTotal()) {
                    return false;
                }
                List<Vote> votes = getVotes();
                List<Vote> votes2 = rating.getVotes();
                return votes != null ? votes.equals(votes2) : votes2 == null;
            }

            public float getAvg() {
                return this.avg;
            }

            public int getTotal() {
                return this.total;
            }

            public List<Vote> getVotes() {
                return this.votes;
            }

            public int hashCode() {
                int iFloatToIntBits = ((Float.floatToIntBits(getAvg()) + 59) * 59) + getTotal();
                List<Vote> votes = getVotes();
                return (iFloatToIntBits * 59) + (votes == null ? 43 : votes.hashCode());
            }

            public void setAvg(float f2) {
                this.avg = f2;
            }

            public void setTotal(int i2) {
                this.total = i2;
            }

            public void setVotes(List<Vote> list) {
                this.votes = list;
            }

            public String toString() {
                return "GetAppMeta.Stats.Rating(avg=" + getAvg() + ", total=" + getTotal() + ", votes=" + getVotes() + ")";
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
            if (!stats.canEqual(this)) {
                return false;
            }
            Rating rating = getRating();
            Rating rating2 = stats.getRating();
            if (rating != null ? !rating.equals(rating2) : rating2 != null) {
                return false;
            }
            Rating globalRating = getGlobalRating();
            Rating globalRating2 = stats.getGlobalRating();
            if (globalRating != null ? globalRating.equals(globalRating2) : globalRating2 == null) {
                return getDownloads() == stats.getDownloads() && getPdownloads() == stats.getPdownloads();
            }
            return false;
        }

        public int getDownloads() {
            return this.downloads;
        }

        public Rating getGlobalRating() {
            return this.globalRating;
        }

        public int getPdownloads() {
            return this.pdownloads;
        }

        public Rating getRating() {
            return this.rating;
        }

        public int hashCode() {
            Rating rating = getRating();
            int iHashCode = rating == null ? 43 : rating.hashCode();
            Rating globalRating = getGlobalRating();
            return ((((((iHashCode + 59) * 59) + (globalRating != null ? globalRating.hashCode() : 43)) * 59) + getDownloads()) * 59) + getPdownloads();
        }

        public void setDownloads(int i2) {
            this.downloads = i2;
        }

        public void setGlobalRating(Rating rating) {
            this.globalRating = rating;
        }

        public void setPdownloads(int i2) {
            this.pdownloads = i2;
        }

        public void setRating(Rating rating) {
            this.rating = rating;
        }

        public String toString() {
            return "GetAppMeta.Stats(rating=" + getRating() + ", globalRating=" + getGlobalRating() + ", downloads=" + getDownloads() + ", pdownloads=" + getPdownloads() + ")";
        }
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    protected boolean canEqual(Object obj) {
        return obj instanceof GetAppMeta;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAppMeta)) {
            return false;
        }
        GetAppMeta getAppMeta = (GetAppMeta) obj;
        if (!getAppMeta.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        App data = getData();
        App data2 = getAppMeta.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public App getData() {
        return this.data;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public int hashCode() {
        int iHashCode = super.hashCode() + 59;
        App data = getData();
        return (iHashCode * 59) + (data == null ? 43 : data.hashCode());
    }

    public void setData(App app) {
        this.data = app;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public String toString() {
        return "GetAppMeta(data=" + getData() + ")";
    }
}
