package cm.aptoide.p092pt.dataprovider.model.p096v7;

import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;

/* loaded from: classes.dex */
public class GetUserMeta extends BaseV7Response {
    private Data data;

    public static class Data {
        private String access;
        private String added;
        private String avatar;

        /* renamed from: id */
        private long f8535id;
        private Identity identity;
        private int level;
        private String modified;
        private String name;
        private Store store;

        public String getAccess() {
            return this.access;
        }

        public String getAdded() {
            return this.added;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public long getId() {
            return this.f8535id;
        }

        public Identity getIdentity() {
            return this.identity;
        }

        public int getLevel() {
            return this.level;
        }

        public String getModified() {
            return this.modified;
        }

        public String getName() {
            return this.name;
        }

        public Store getStore() {
            return this.store;
        }

        public void setAccess(String str) {
            this.access = str;
        }

        public void setAdded(String str) {
            this.added = str;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(long j2) {
            this.f8535id = j2;
        }

        public void setIdentity(Identity identity) {
            this.identity = identity;
        }

        public void setLevel(int i2) {
            this.level = i2;
        }

        public void setModified(String str) {
            this.modified = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setStore(Store store) {
            this.store = store;
        }
    }

    public static class Identity {
        private String email;
        private String phone;
        private String username;

        public String getEmail() {
            return this.email;
        }

        public String getPhone() {
            return this.phone;
        }

        public String getUsername() {
            return this.username;
        }

        public void setEmail(String str) {
            this.email = str;
        }

        public void setPhone(String str) {
            this.phone = str;
        }

        public void setUsername(String str) {
            this.username = str;
        }
    }

    public Data getData() {
        return this.data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
