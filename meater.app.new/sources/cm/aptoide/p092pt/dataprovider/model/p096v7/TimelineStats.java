package cm.aptoide.p092pt.dataprovider.model.p096v7;

/* loaded from: classes.dex */
public class TimelineStats extends BaseV7Response {
    private StatusData data;

    public static class StatusData {
        private long followers;
        private long following;

        protected boolean canEqual(Object obj) {
            return obj instanceof StatusData;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StatusData)) {
                return false;
            }
            StatusData statusData = (StatusData) obj;
            return statusData.canEqual(this) && getFollowers() == statusData.getFollowers() && getFollowing() == statusData.getFollowing();
        }

        public long getFollowers() {
            return this.followers;
        }

        public long getFollowing() {
            return this.following;
        }

        public int hashCode() {
            long followers = getFollowers();
            int i2 = ((int) (followers ^ (followers >>> 32))) + 59;
            long following = getFollowing();
            return (i2 * 59) + ((int) (following ^ (following >>> 32)));
        }

        public void setFollowers(long j2) {
            this.followers = j2;
        }

        public void setFollowing(long j2) {
            this.following = j2;
        }

        public String toString() {
            return "TimelineStats.StatusData(followers=" + getFollowers() + ", following=" + getFollowing() + ")";
        }
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    protected boolean canEqual(Object obj) {
        return obj instanceof TimelineStats;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimelineStats)) {
            return false;
        }
        TimelineStats timelineStats = (TimelineStats) obj;
        if (!timelineStats.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        StatusData data = getData();
        StatusData data2 = timelineStats.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public StatusData getData() {
        return this.data;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public int hashCode() {
        int iHashCode = super.hashCode() + 59;
        StatusData data = getData();
        return (iHashCode * 59) + (data == null ? 43 : data.hashCode());
    }

    public void setData(StatusData statusData) {
        this.data = statusData;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public String toString() {
        return "TimelineStats(data=" + getData() + ")";
    }
}
