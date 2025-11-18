package cm.aptoide.p092pt.dataprovider.p097ws.p100v3;

import cm.aptoide.p092pt.dataprovider.model.p095v3.BaseV3Response;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* loaded from: classes.dex */
public class GetPushNotificationsResponse extends BaseV3Response {
    private List<Notification> results;

    public static class Notification {

        /* renamed from: id */
        private int f8554id;
        private Images images;
        private String message;

        @JsonProperty("target_url")
        private String targetUrl;
        private String title;

        @JsonProperty("track_url")
        private String trackUrl;

        public static class Images {

            @JsonProperty("banner_url")
            private String bannerUrl;

            @JsonProperty("icon_url")
            private String iconUrl;

            protected boolean canEqual(Object obj) {
                return obj instanceof Images;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Images)) {
                    return false;
                }
                Images images = (Images) obj;
                if (!images.canEqual(this)) {
                    return false;
                }
                String bannerUrl = getBannerUrl();
                String bannerUrl2 = images.getBannerUrl();
                if (bannerUrl != null ? !bannerUrl.equals(bannerUrl2) : bannerUrl2 != null) {
                    return false;
                }
                String iconUrl = getIconUrl();
                String iconUrl2 = images.getIconUrl();
                return iconUrl != null ? iconUrl.equals(iconUrl2) : iconUrl2 == null;
            }

            public String getBannerUrl() {
                return this.bannerUrl;
            }

            public String getIconUrl() {
                return this.iconUrl;
            }

            public int hashCode() {
                String bannerUrl = getBannerUrl();
                int iHashCode = bannerUrl == null ? 43 : bannerUrl.hashCode();
                String iconUrl = getIconUrl();
                return ((iHashCode + 59) * 59) + (iconUrl != null ? iconUrl.hashCode() : 43);
            }

            public void setBannerUrl(String str) {
                this.bannerUrl = str;
            }

            public void setIconUrl(String str) {
                this.iconUrl = str;
            }

            public String toString() {
                return "GetPushNotificationsResponse.Notification.Images(bannerUrl=" + getBannerUrl() + ", iconUrl=" + getIconUrl() + ")";
            }
        }

        protected boolean canEqual(Object obj) {
            return obj instanceof Notification;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Notification)) {
                return false;
            }
            Notification notification = (Notification) obj;
            if (!notification.canEqual(this) || getId() != notification.getId()) {
                return false;
            }
            String title = getTitle();
            String title2 = notification.getTitle();
            if (title != null ? !title.equals(title2) : title2 != null) {
                return false;
            }
            String message = getMessage();
            String message2 = notification.getMessage();
            if (message != null ? !message.equals(message2) : message2 != null) {
                return false;
            }
            String targetUrl = getTargetUrl();
            String targetUrl2 = notification.getTargetUrl();
            if (targetUrl != null ? !targetUrl.equals(targetUrl2) : targetUrl2 != null) {
                return false;
            }
            String trackUrl = getTrackUrl();
            String trackUrl2 = notification.getTrackUrl();
            if (trackUrl != null ? !trackUrl.equals(trackUrl2) : trackUrl2 != null) {
                return false;
            }
            Images images = getImages();
            Images images2 = notification.getImages();
            return images != null ? images.equals(images2) : images2 == null;
        }

        public int getId() {
            return this.f8554id;
        }

        public Images getImages() {
            return this.images;
        }

        public String getMessage() {
            return this.message;
        }

        public String getTargetUrl() {
            return this.targetUrl;
        }

        public String getTitle() {
            return this.title;
        }

        public String getTrackUrl() {
            return this.trackUrl;
        }

        public int hashCode() {
            int id = getId() + 59;
            String title = getTitle();
            int iHashCode = (id * 59) + (title == null ? 43 : title.hashCode());
            String message = getMessage();
            int iHashCode2 = (iHashCode * 59) + (message == null ? 43 : message.hashCode());
            String targetUrl = getTargetUrl();
            int iHashCode3 = (iHashCode2 * 59) + (targetUrl == null ? 43 : targetUrl.hashCode());
            String trackUrl = getTrackUrl();
            int iHashCode4 = (iHashCode3 * 59) + (trackUrl == null ? 43 : trackUrl.hashCode());
            Images images = getImages();
            return (iHashCode4 * 59) + (images != null ? images.hashCode() : 43);
        }

        public void setId(int i2) {
            this.f8554id = i2;
        }

        public void setImages(Images images) {
            this.images = images;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        public void setTargetUrl(String str) {
            this.targetUrl = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setTrackUrl(String str) {
            this.trackUrl = str;
        }

        public String toString() {
            return "GetPushNotificationsResponse.Notification(id=" + getId() + ", title=" + getTitle() + ", message=" + getMessage() + ", targetUrl=" + getTargetUrl() + ", trackUrl=" + getTrackUrl() + ", images=" + getImages() + ")";
        }
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p095v3.BaseV3Response
    protected boolean canEqual(Object obj) {
        return obj instanceof GetPushNotificationsResponse;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p095v3.BaseV3Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPushNotificationsResponse)) {
            return false;
        }
        GetPushNotificationsResponse getPushNotificationsResponse = (GetPushNotificationsResponse) obj;
        if (!getPushNotificationsResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        List<Notification> results = getResults();
        List<Notification> results2 = getPushNotificationsResponse.getResults();
        return results != null ? results.equals(results2) : results2 == null;
    }

    public List<Notification> getResults() {
        return this.results;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p095v3.BaseV3Response
    public int hashCode() {
        int iHashCode = super.hashCode() + 59;
        List<Notification> results = getResults();
        return (iHashCode * 59) + (results == null ? 43 : results.hashCode());
    }

    public void setResults(List<Notification> list) {
        this.results = list;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p095v3.BaseV3Response
    public String toString() {
        return "GetPushNotificationsResponse(results=" + getResults() + ")";
    }
}
