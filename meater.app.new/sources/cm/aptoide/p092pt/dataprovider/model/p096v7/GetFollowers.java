package cm.aptoide.p092pt.dataprovider.model.p096v7;

import cm.aptoide.p092pt.dataprovider.model.p096v7.TimelineStats;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;

/* loaded from: classes.dex */
public class GetFollowers extends BaseV7EndlessDataListResponse<TimelineUser> {

    public static class TimelineUser {
        String avatar;

        /* renamed from: id */
        long f8533id;
        String name;
        TimelineStats.StatusData stats;
        Store store;

        protected boolean canEqual(Object obj) {
            return obj instanceof TimelineUser;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TimelineUser)) {
                return false;
            }
            TimelineUser timelineUser = (TimelineUser) obj;
            if (!timelineUser.canEqual(this) || getId() != timelineUser.getId()) {
                return false;
            }
            String name = getName();
            String name2 = timelineUser.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = timelineUser.getAvatar();
            if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                return false;
            }
            Store store = getStore();
            Store store2 = timelineUser.getStore();
            if (store != null ? !store.equals(store2) : store2 != null) {
                return false;
            }
            TimelineStats.StatusData stats = getStats();
            TimelineStats.StatusData stats2 = timelineUser.getStats();
            return stats != null ? stats.equals(stats2) : stats2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public long getId() {
            return this.f8533id;
        }

        public String getName() {
            return this.name;
        }

        public TimelineStats.StatusData getStats() {
            return this.stats;
        }

        public Store getStore() {
            return this.store;
        }

        public int hashCode() {
            long id = getId();
            String name = getName();
            int iHashCode = ((((int) (id ^ (id >>> 32))) + 59) * 59) + (name == null ? 43 : name.hashCode());
            String avatar = getAvatar();
            int iHashCode2 = (iHashCode * 59) + (avatar == null ? 43 : avatar.hashCode());
            Store store = getStore();
            int iHashCode3 = (iHashCode2 * 59) + (store == null ? 43 : store.hashCode());
            TimelineStats.StatusData stats = getStats();
            return (iHashCode3 * 59) + (stats != null ? stats.hashCode() : 43);
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(long j2) {
            this.f8533id = j2;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setStats(TimelineStats.StatusData statusData) {
            this.stats = statusData;
        }

        public void setStore(Store store) {
            this.store = store;
        }

        public String toString() {
            return "GetFollowers.TimelineUser(id=" + getId() + ", name=" + getName() + ", avatar=" + getAvatar() + ", store=" + getStore() + ", stats=" + getStats() + ")";
        }
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessDataListResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    protected boolean canEqual(Object obj) {
        return obj instanceof GetFollowers;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessDataListResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetFollowers) && ((GetFollowers) obj).canEqual(this);
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessDataListResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public int hashCode() {
        return 1;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessDataListResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public String toString() {
        return "GetFollowers()";
    }
}
