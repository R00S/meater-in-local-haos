package cm.aptoide.p092pt.dataprovider.model.p094v2;

import cm.aptoide.p092pt.downloadmanager.Constants;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
public class GetAdsResponse {
    private List<C2220Ad> ads;
    private Options options;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v2.GetAdsResponse$Ad */
    public static class C2220Ad {
        private Data data;
        private Info info;
        private Partner partner;
        private Partner tracker;

        protected boolean canEqual(Object obj) {
            return obj instanceof C2220Ad;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2220Ad)) {
                return false;
            }
            C2220Ad c2220Ad = (C2220Ad) obj;
            if (!c2220Ad.canEqual(this)) {
                return false;
            }
            Data data = getData();
            Data data2 = c2220Ad.getData();
            if (data != null ? !data.equals(data2) : data2 != null) {
                return false;
            }
            Info info = getInfo();
            Info info2 = c2220Ad.getInfo();
            if (info != null ? !info.equals(info2) : info2 != null) {
                return false;
            }
            Partner partner = getPartner();
            Partner partner2 = c2220Ad.getPartner();
            if (partner != null ? !partner.equals(partner2) : partner2 != null) {
                return false;
            }
            Partner tracker = getTracker();
            Partner tracker2 = c2220Ad.getTracker();
            return tracker != null ? tracker.equals(tracker2) : tracker2 == null;
        }

        public Data getData() {
            return this.data;
        }

        public Info getInfo() {
            return this.info;
        }

        public Partner getPartner() {
            return this.partner;
        }

        public Partner getTracker() {
            return this.tracker;
        }

        public int hashCode() {
            Data data = getData();
            int iHashCode = data == null ? 43 : data.hashCode();
            Info info = getInfo();
            int iHashCode2 = ((iHashCode + 59) * 59) + (info == null ? 43 : info.hashCode());
            Partner partner = getPartner();
            int iHashCode3 = (iHashCode2 * 59) + (partner == null ? 43 : partner.hashCode());
            Partner tracker = getTracker();
            return (iHashCode3 * 59) + (tracker != null ? tracker.hashCode() : 43);
        }

        public void setData(Data data) {
            this.data = data;
        }

        public void setInfo(Info info) {
            this.info = info;
        }

        public void setPartner(Partner partner) {
            this.partner = partner;
        }

        public void setTracker(Partner partner) {
            this.tracker = partner;
        }

        public String toString() {
            return "GetAdsResponse.Ad(data=" + getData() + ", info=" + getInfo() + ", partner=" + getPartner() + ", tracker=" + getTracker() + ")";
        }
    }

    public static class Data {

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
        private Date added;
        private String description;
        private int downloads;
        private String icon;

        /* renamed from: id */
        private long f8521id;
        private String md5sum;

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
        private Date modified;
        private String name;

        @JsonProperty(Constants.PACKAGE)
        private String packageName;
        private String repo;
        private long size;
        private int stars;

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
        private Date updated;
        private int vercode;
        private String vername;

        protected boolean canEqual(Object obj) {
            return obj instanceof Data;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            if (!data.canEqual(this) || getId() != data.getId()) {
                return false;
            }
            String name = getName();
            String name2 = data.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String repo = getRepo();
            String repo2 = data.getRepo();
            if (repo != null ? !repo.equals(repo2) : repo2 != null) {
                return false;
            }
            String packageName = getPackageName();
            String packageName2 = data.getPackageName();
            if (packageName != null ? !packageName.equals(packageName2) : packageName2 != null) {
                return false;
            }
            String md5sum = getMd5sum();
            String md5sum2 = data.getMd5sum();
            if (md5sum != null ? !md5sum.equals(md5sum2) : md5sum2 != null) {
                return false;
            }
            if (getSize() != data.getSize() || getVercode() != data.getVercode()) {
                return false;
            }
            String vername = getVername();
            String vername2 = data.getVername();
            if (vername != null ? !vername.equals(vername2) : vername2 != null) {
                return false;
            }
            String icon = getIcon();
            String icon2 = data.getIcon();
            if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                return false;
            }
            if (getDownloads() != data.getDownloads() || getStars() != data.getStars()) {
                return false;
            }
            String description = getDescription();
            String description2 = data.getDescription();
            if (description != null ? !description.equals(description2) : description2 != null) {
                return false;
            }
            Date added = getAdded();
            Date added2 = data.getAdded();
            if (added != null ? !added.equals(added2) : added2 != null) {
                return false;
            }
            Date modified = getModified();
            Date modified2 = data.getModified();
            if (modified != null ? !modified.equals(modified2) : modified2 != null) {
                return false;
            }
            Date updated = getUpdated();
            Date updated2 = data.getUpdated();
            return updated != null ? updated.equals(updated2) : updated2 == null;
        }

        public Date getAdded() {
            return this.added;
        }

        public String getDescription() {
            return this.description;
        }

        public int getDownloads() {
            return this.downloads;
        }

        public String getIcon() {
            return this.icon;
        }

        public long getId() {
            return this.f8521id;
        }

        public String getMd5sum() {
            return this.md5sum;
        }

        public Date getModified() {
            return this.modified;
        }

        public String getName() {
            return this.name;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getRepo() {
            return this.repo;
        }

        public long getSize() {
            return this.size;
        }

        public int getStars() {
            return this.stars;
        }

        public Date getUpdated() {
            return this.updated;
        }

        public int getVercode() {
            return this.vercode;
        }

        public String getVername() {
            return this.vername;
        }

        public int hashCode() {
            long id = getId();
            String name = getName();
            int iHashCode = ((((int) (id ^ (id >>> 32))) + 59) * 59) + (name == null ? 43 : name.hashCode());
            String repo = getRepo();
            int iHashCode2 = (iHashCode * 59) + (repo == null ? 43 : repo.hashCode());
            String packageName = getPackageName();
            int iHashCode3 = (iHashCode2 * 59) + (packageName == null ? 43 : packageName.hashCode());
            String md5sum = getMd5sum();
            int i2 = iHashCode3 * 59;
            int iHashCode4 = md5sum == null ? 43 : md5sum.hashCode();
            long size = getSize();
            int vercode = ((((i2 + iHashCode4) * 59) + ((int) ((size >>> 32) ^ size))) * 59) + getVercode();
            String vername = getVername();
            int iHashCode5 = (vercode * 59) + (vername == null ? 43 : vername.hashCode());
            String icon = getIcon();
            int iHashCode6 = (((((iHashCode5 * 59) + (icon == null ? 43 : icon.hashCode())) * 59) + getDownloads()) * 59) + getStars();
            String description = getDescription();
            int iHashCode7 = (iHashCode6 * 59) + (description == null ? 43 : description.hashCode());
            Date added = getAdded();
            int iHashCode8 = (iHashCode7 * 59) + (added == null ? 43 : added.hashCode());
            Date modified = getModified();
            int iHashCode9 = (iHashCode8 * 59) + (modified == null ? 43 : modified.hashCode());
            Date updated = getUpdated();
            return (iHashCode9 * 59) + (updated != null ? updated.hashCode() : 43);
        }

        public void setAdded(Date date) {
            this.added = date;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setDownloads(int i2) {
            this.downloads = i2;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setId(long j2) {
            this.f8521id = j2;
        }

        public void setMd5sum(String str) {
            this.md5sum = str;
        }

        public void setModified(Date date) {
            this.modified = date;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPackageName(String str) {
            this.packageName = str;
        }

        public void setRepo(String str) {
            this.repo = str;
        }

        public void setSize(long j2) {
            this.size = j2;
        }

        public void setStars(int i2) {
            this.stars = i2;
        }

        public void setUpdated(Date date) {
            this.updated = date;
        }

        public void setVercode(int i2) {
            this.vercode = i2;
        }

        public void setVername(String str) {
            this.vername = str;
        }

        public String toString() {
            return "GetAdsResponse.Data(id=" + getId() + ", name=" + getName() + ", repo=" + getRepo() + ", packageName=" + getPackageName() + ", md5sum=" + getMd5sum() + ", size=" + getSize() + ", vercode=" + getVercode() + ", vername=" + getVername() + ", icon=" + getIcon() + ", downloads=" + getDownloads() + ", stars=" + getStars() + ", description=" + getDescription() + ", added=" + getAdded() + ", modified=" + getModified() + ", updated=" + getUpdated() + ")";
        }
    }

    public static class Info {
        private long adId;
        private String adType;
        private String cpcUrl;
        private String cpdUrl;
        private String cpiUrl;
        private Payout payout;

        public static class Fiat {
            private double amount;
            private String currency;
            private String symbol;

            public double getAmount() {
                return this.amount;
            }

            public String getCurrency() {
                return this.currency;
            }

            public String getSymbol() {
                return this.symbol;
            }

            public void setAmount(double d2) {
                this.amount = d2;
            }

            public void setCurrency(String str) {
                this.currency = str;
            }

            public void setSymbol(String str) {
                this.symbol = str;
            }
        }

        public static class Payout {
            private double appc;
            private Fiat fiat;

            public double getAppc() {
                return this.appc;
            }

            public Fiat getFiat() {
                return this.fiat;
            }

            public void setAppc(double d2) {
                this.appc = d2;
            }

            public void setFiat(Fiat fiat) {
                this.fiat = fiat;
            }
        }

        protected boolean canEqual(Object obj) {
            return obj instanceof Info;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            if (!info.canEqual(this) || getAdId() != info.getAdId()) {
                return false;
            }
            String adType = getAdType();
            String adType2 = info.getAdType();
            if (adType != null ? !adType.equals(adType2) : adType2 != null) {
                return false;
            }
            String cpcUrl = getCpcUrl();
            String cpcUrl2 = info.getCpcUrl();
            if (cpcUrl != null ? !cpcUrl.equals(cpcUrl2) : cpcUrl2 != null) {
                return false;
            }
            String cpiUrl = getCpiUrl();
            String cpiUrl2 = info.getCpiUrl();
            if (cpiUrl != null ? !cpiUrl.equals(cpiUrl2) : cpiUrl2 != null) {
                return false;
            }
            String cpdUrl = getCpdUrl();
            String cpdUrl2 = info.getCpdUrl();
            if (cpdUrl != null ? !cpdUrl.equals(cpdUrl2) : cpdUrl2 != null) {
                return false;
            }
            Payout payout = getPayout();
            Payout payout2 = info.getPayout();
            return payout != null ? payout.equals(payout2) : payout2 == null;
        }

        public long getAdId() {
            return this.adId;
        }

        public String getAdType() {
            return this.adType;
        }

        public String getCpcUrl() {
            return this.cpcUrl;
        }

        public String getCpdUrl() {
            return this.cpdUrl;
        }

        public String getCpiUrl() {
            return this.cpiUrl;
        }

        public Payout getPayout() {
            return this.payout;
        }

        public int hashCode() {
            long adId = getAdId();
            String adType = getAdType();
            int iHashCode = ((((int) (adId ^ (adId >>> 32))) + 59) * 59) + (adType == null ? 43 : adType.hashCode());
            String cpcUrl = getCpcUrl();
            int iHashCode2 = (iHashCode * 59) + (cpcUrl == null ? 43 : cpcUrl.hashCode());
            String cpiUrl = getCpiUrl();
            int iHashCode3 = (iHashCode2 * 59) + (cpiUrl == null ? 43 : cpiUrl.hashCode());
            String cpdUrl = getCpdUrl();
            int iHashCode4 = (iHashCode3 * 59) + (cpdUrl == null ? 43 : cpdUrl.hashCode());
            Payout payout = getPayout();
            return (iHashCode4 * 59) + (payout != null ? payout.hashCode() : 43);
        }

        public void setAdId(long j2) {
            this.adId = j2;
        }

        public void setAdType(String str) {
            this.adType = str;
        }

        public void setCpcUrl(String str) {
            this.cpcUrl = str;
        }

        public void setCpdUrl(String str) {
            this.cpdUrl = str;
        }

        public void setCpiUrl(String str) {
            this.cpiUrl = str;
        }

        public void setPayout(Payout payout) {
            this.payout = payout;
        }

        public String toString() {
            return "GetAdsResponse.Info(adId=" + getAdId() + ", adType=" + getAdType() + ", cpcUrl=" + getCpcUrl() + ", cpiUrl=" + getCpiUrl() + ", cpdUrl=" + getCpdUrl() + ", payout=" + this.payout.toString() + ")";
        }
    }

    public static class Options {
        private Boolean mediation = Boolean.TRUE;

        protected boolean canEqual(Object obj) {
            return obj instanceof Options;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Options)) {
                return false;
            }
            Options options = (Options) obj;
            if (!options.canEqual(this)) {
                return false;
            }
            Boolean mediation = getMediation();
            Boolean mediation2 = options.getMediation();
            return mediation != null ? mediation.equals(mediation2) : mediation2 == null;
        }

        public Boolean getMediation() {
            return this.mediation;
        }

        public int hashCode() {
            Boolean mediation = getMediation();
            return 59 + (mediation == null ? 43 : mediation.hashCode());
        }

        public void setMediation(Boolean bool) {
            this.mediation = bool;
        }

        public String toString() {
            return "GetAdsResponse.Options(mediation=" + getMediation() + ")";
        }
    }

    public static class Partner {
        private Data data;
        private Info info;

        public static class Data {
            private String clickUrl;
            private String impressionUrl;

            protected boolean canEqual(Object obj) {
                return obj instanceof Data;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Data)) {
                    return false;
                }
                Data data = (Data) obj;
                if (!data.canEqual(this)) {
                    return false;
                }
                String clickUrl = getClickUrl();
                String clickUrl2 = data.getClickUrl();
                if (clickUrl != null ? !clickUrl.equals(clickUrl2) : clickUrl2 != null) {
                    return false;
                }
                String impressionUrl = getImpressionUrl();
                String impressionUrl2 = data.getImpressionUrl();
                return impressionUrl != null ? impressionUrl.equals(impressionUrl2) : impressionUrl2 == null;
            }

            public String getClickUrl() {
                return this.clickUrl;
            }

            public String getImpressionUrl() {
                return this.impressionUrl;
            }

            public int hashCode() {
                String clickUrl = getClickUrl();
                int iHashCode = clickUrl == null ? 43 : clickUrl.hashCode();
                String impressionUrl = getImpressionUrl();
                return ((iHashCode + 59) * 59) + (impressionUrl != null ? impressionUrl.hashCode() : 43);
            }

            public void setClickUrl(String str) {
                this.clickUrl = str;
            }

            public void setImpressionUrl(String str) {
                this.impressionUrl = str;
            }

            public String toString() {
                return "GetAdsResponse.Partner.Data(clickUrl=" + getClickUrl() + ", impressionUrl=" + getImpressionUrl() + ")";
            }
        }

        public static class Info {

            /* renamed from: id */
            private int f8522id;
            private String name;

            protected boolean canEqual(Object obj) {
                return obj instanceof Info;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Info)) {
                    return false;
                }
                Info info = (Info) obj;
                if (!info.canEqual(this) || getId() != info.getId()) {
                    return false;
                }
                String name = getName();
                String name2 = info.getName();
                return name != null ? name.equals(name2) : name2 == null;
            }

            public int getId() {
                return this.f8522id;
            }

            public String getName() {
                return this.name;
            }

            public int hashCode() {
                int id = getId() + 59;
                String name = getName();
                return (id * 59) + (name == null ? 43 : name.hashCode());
            }

            public void setId(int i2) {
                this.f8522id = i2;
            }

            public void setName(String str) {
                this.name = str;
            }

            public String toString() {
                return "GetAdsResponse.Partner.Info(id=" + getId() + ", name=" + getName() + ")";
            }
        }

        protected boolean canEqual(Object obj) {
            return obj instanceof Partner;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Partner)) {
                return false;
            }
            Partner partner = (Partner) obj;
            if (!partner.canEqual(this)) {
                return false;
            }
            Info info = getInfo();
            Info info2 = partner.getInfo();
            if (info != null ? !info.equals(info2) : info2 != null) {
                return false;
            }
            Data data = getData();
            Data data2 = partner.getData();
            return data != null ? data.equals(data2) : data2 == null;
        }

        public Data getData() {
            return this.data;
        }

        public Info getInfo() {
            return this.info;
        }

        public int hashCode() {
            Info info = getInfo();
            int iHashCode = info == null ? 43 : info.hashCode();
            Data data = getData();
            return ((iHashCode + 59) * 59) + (data != null ? data.hashCode() : 43);
        }

        public void setData(Data data) {
            this.data = data;
        }

        public void setInfo(Info info) {
            this.info = info;
        }

        public String toString() {
            return "GetAdsResponse.Partner(info=" + getInfo() + ", data=" + getData() + ")";
        }
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof GetAdsResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAdsResponse)) {
            return false;
        }
        GetAdsResponse getAdsResponse = (GetAdsResponse) obj;
        if (!getAdsResponse.canEqual(this)) {
            return false;
        }
        List<C2220Ad> ads = getAds();
        List<C2220Ad> ads2 = getAdsResponse.getAds();
        if (ads != null ? !ads.equals(ads2) : ads2 != null) {
            return false;
        }
        Options options = getOptions();
        Options options2 = getAdsResponse.getOptions();
        return options != null ? options.equals(options2) : options2 == null;
    }

    public List<C2220Ad> getAds() {
        return this.ads;
    }

    public Options getOptions() {
        return this.options;
    }

    public int hashCode() {
        List<C2220Ad> ads = getAds();
        int iHashCode = ads == null ? 43 : ads.hashCode();
        Options options = getOptions();
        return ((iHashCode + 59) * 59) + (options != null ? options.hashCode() : 43);
    }

    public void setAds(List<C2220Ad> list) {
        this.ads = list;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public String toString() {
        return "GetAdsResponse(ads=" + getAds() + ", options=" + getOptions() + ")";
    }
}
