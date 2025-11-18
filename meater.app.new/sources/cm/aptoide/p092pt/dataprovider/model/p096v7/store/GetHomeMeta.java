package cm.aptoide.p092pt.dataprovider.model.p096v7.store;

import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;

/* loaded from: classes.dex */
public class GetHomeMeta extends BaseV7Response {
    private Data data;

    public static class Data {
        private Stats stats;
        private Store store;
        private HomeUser user;

        public Stats getStats() {
            return this.stats;
        }

        public Store getStore() {
            return this.store;
        }

        public HomeUser getUser() {
            return this.user;
        }

        public void setStats(Stats stats) {
            this.stats = stats;
        }

        public void setStore(Store store) {
            this.store = store;
        }

        public void setUser(HomeUser homeUser) {
            this.user = homeUser;
        }
    }

    public static class Stats {
        private long followers;
        private long following;

        public long getFollowers() {
            return this.followers;
        }

        public long getFollowing() {
            return this.following;
        }

        public void setFollowers(long j2) {
            this.followers = j2;
        }

        public void setFollowing(long j2) {
            this.following = j2;
        }
    }

    public Data getData() {
        return this.data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
