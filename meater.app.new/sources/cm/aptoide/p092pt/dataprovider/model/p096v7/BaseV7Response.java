package cm.aptoide.p092pt.dataprovider.model.p096v7;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* loaded from: classes.dex */
public class BaseV7Response {
    private List<Error> errors;
    private Info info;

    public static class Details {

        @JsonProperty("store_links")
        private List<StoreLinks> storeLinks;

        protected boolean canEqual(Object obj) {
            return obj instanceof Details;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Details)) {
                return false;
            }
            Details details = (Details) obj;
            if (!details.canEqual(this)) {
                return false;
            }
            List<StoreLinks> storeLinks = getStoreLinks();
            List<StoreLinks> storeLinks2 = details.getStoreLinks();
            return storeLinks != null ? storeLinks.equals(storeLinks2) : storeLinks2 == null;
        }

        public List<StoreLinks> getStoreLinks() {
            return this.storeLinks;
        }

        public int hashCode() {
            List<StoreLinks> storeLinks = getStoreLinks();
            return 59 + (storeLinks == null ? 43 : storeLinks.hashCode());
        }

        public void setStoreLinks(List<StoreLinks> list) {
            this.storeLinks = list;
        }

        public String toString() {
            return "BaseV7Response.Details(storeLinks=" + getStoreLinks() + ")";
        }
    }

    public static class Error {
        private String code;
        private String description;
        private Details details;

        protected boolean canEqual(Object obj) {
            return obj instanceof Error;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            if (!error.canEqual(this)) {
                return false;
            }
            String code = getCode();
            String code2 = error.getCode();
            if (code != null ? !code.equals(code2) : code2 != null) {
                return false;
            }
            String description = getDescription();
            String description2 = error.getDescription();
            if (description != null ? !description.equals(description2) : description2 != null) {
                return false;
            }
            Details details = getDetails();
            Details details2 = error.getDetails();
            return details != null ? details.equals(details2) : details2 == null;
        }

        public String getCode() {
            return this.code;
        }

        public String getDescription() {
            return this.description;
        }

        public Details getDetails() {
            return this.details;
        }

        public int hashCode() {
            String code = getCode();
            int iHashCode = code == null ? 43 : code.hashCode();
            String description = getDescription();
            int iHashCode2 = ((iHashCode + 59) * 59) + (description == null ? 43 : description.hashCode());
            Details details = getDetails();
            return (iHashCode2 * 59) + (details != null ? details.hashCode() : 43);
        }

        public void setCode(String str) {
            this.code = str;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setDetails(Details details) {
            this.details = details;
        }

        public String toString() {
            return "BaseV7Response.Error(code=" + getCode() + ", description=" + getDescription() + ", details=" + getDetails() + ")";
        }
    }

    public static class Info {
        private Status status;
        private Time time;

        public enum Status {
            OK,
            QUEUED,
            FAIL,
            Processing
        }

        public static class Time {
            private String human;
            private double seconds;

            protected boolean canEqual(Object obj) {
                return obj instanceof Time;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Time)) {
                    return false;
                }
                Time time = (Time) obj;
                if (!time.canEqual(this) || Double.compare(getSeconds(), time.getSeconds()) != 0) {
                    return false;
                }
                String human = getHuman();
                String human2 = time.getHuman();
                return human != null ? human.equals(human2) : human2 == null;
            }

            public String getHuman() {
                return this.human;
            }

            public double getSeconds() {
                return this.seconds;
            }

            public int hashCode() {
                long jDoubleToLongBits = Double.doubleToLongBits(getSeconds());
                String human = getHuman();
                return ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 59) * 59) + (human == null ? 43 : human.hashCode());
            }

            public void setHuman(String str) {
                this.human = str;
            }

            public void setSeconds(double d2) {
                this.seconds = d2;
            }

            public String toString() {
                return "BaseV7Response.Info.Time(seconds=" + getSeconds() + ", human=" + getHuman() + ")";
            }
        }

        public Info() {
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
            if (!info.canEqual(this)) {
                return false;
            }
            Status status = getStatus();
            Status status2 = info.getStatus();
            if (status != null ? !status.equals(status2) : status2 != null) {
                return false;
            }
            Time time = getTime();
            Time time2 = info.getTime();
            return time != null ? time.equals(time2) : time2 == null;
        }

        public Status getStatus() {
            return this.status;
        }

        public Time getTime() {
            return this.time;
        }

        public int hashCode() {
            Status status = getStatus();
            int iHashCode = status == null ? 43 : status.hashCode();
            Time time = getTime();
            return ((iHashCode + 59) * 59) + (time != null ? time.hashCode() : 43);
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public void setTime(Time time) {
            this.time = time;
        }

        public String toString() {
            return "BaseV7Response.Info(status=" + getStatus() + ", time=" + getTime() + ")";
        }

        public Info(Status status, Time time) {
            this.status = status;
            this.time = time;
        }
    }

    public static class StoreLinks {
        private String error;
        private Type type;
        private String url;

        protected boolean canEqual(Object obj) {
            return obj instanceof StoreLinks;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StoreLinks)) {
                return false;
            }
            StoreLinks storeLinks = (StoreLinks) obj;
            if (!storeLinks.canEqual(this)) {
                return false;
            }
            Type type = getType();
            Type type2 = storeLinks.getType();
            if (type != null ? !type.equals(type2) : type2 != null) {
                return false;
            }
            String url = getUrl();
            String url2 = storeLinks.getUrl();
            if (url != null ? !url.equals(url2) : url2 != null) {
                return false;
            }
            String error = getError();
            String error2 = storeLinks.getError();
            return error != null ? error.equals(error2) : error2 == null;
        }

        public String getError() {
            return this.error;
        }

        public Type getType() {
            return this.type;
        }

        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            Type type = getType();
            int iHashCode = type == null ? 43 : type.hashCode();
            String url = getUrl();
            int iHashCode2 = ((iHashCode + 59) * 59) + (url == null ? 43 : url.hashCode());
            String error = getError();
            return (iHashCode2 * 59) + (error != null ? error.hashCode() : 43);
        }

        public void setError(String str) {
            this.error = str;
        }

        public void setType(Type type) {
            this.type = type;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public String toString() {
            return "BaseV7Response.StoreLinks(type=" + getType() + ", url=" + getUrl() + ", error=" + getError() + ")";
        }
    }

    public enum Type {
        FACEBOOK_1,
        FACEBOOK_2,
        TWITCH_1,
        TWITCH_2,
        TWITTER_1,
        TWITTER_2,
        YOUTUBE_1,
        YOUTUBE_2
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof BaseV7Response;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseV7Response)) {
            return false;
        }
        BaseV7Response baseV7Response = (BaseV7Response) obj;
        if (!baseV7Response.canEqual(this)) {
            return false;
        }
        Info info = getInfo();
        Info info2 = baseV7Response.getInfo();
        if (info != null ? !info.equals(info2) : info2 != null) {
            return false;
        }
        List<Error> errors = getErrors();
        List<Error> errors2 = baseV7Response.getErrors();
        return errors != null ? errors.equals(errors2) : errors2 == null;
    }

    public Error getError() {
        List<Error> list = this.errors;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.errors.get(0);
    }

    public List<Error> getErrors() {
        return this.errors;
    }

    public Info getInfo() {
        return this.info;
    }

    public int hashCode() {
        Info info = getInfo();
        int iHashCode = info == null ? 43 : info.hashCode();
        List<Error> errors = getErrors();
        return ((iHashCode + 59) * 59) + (errors != null ? errors.hashCode() : 43);
    }

    public boolean isOk() {
        Info info = this.info;
        return info != null && info.getStatus() == Info.Status.OK;
    }

    public void setErrors(List<Error> list) {
        this.errors = list;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public String toString() {
        return "BaseV7Response(info=" + getInfo() + ", errors=" + getErrors() + ")";
    }
}
