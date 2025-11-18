package cm.aptoide.p092pt.dataprovider.model.p096v7;

/* loaded from: classes.dex */
public class GetUserSettings extends BaseV7Response {
    private Data data;

    public static class Access {
        private boolean confirmed;

        protected boolean canEqual(Object obj) {
            return obj instanceof Access;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Access)) {
                return false;
            }
            Access access = (Access) obj;
            return access.canEqual(this) && isConfirmed() == access.isConfirmed();
        }

        public int hashCode() {
            return 59 + (isConfirmed() ? 79 : 97);
        }

        public boolean isConfirmed() {
            return this.confirmed;
        }

        public void setConfirmed(boolean z) {
            this.confirmed = z;
        }

        public String toString() {
            return "GetUserSettings.Access(confirmed=" + isConfirmed() + ")";
        }
    }

    public static class Data {
        private Access access;
        private boolean mature;

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
            if (!data.canEqual(this) || isMature() != data.isMature()) {
                return false;
            }
            Access access = getAccess();
            Access access2 = data.getAccess();
            return access != null ? access.equals(access2) : access2 == null;
        }

        public Access getAccess() {
            return this.access;
        }

        public int hashCode() {
            int i2 = isMature() ? 79 : 97;
            Access access = getAccess();
            return ((i2 + 59) * 59) + (access == null ? 43 : access.hashCode());
        }

        public boolean isMature() {
            return this.mature;
        }

        public void setAccess(Access access) {
            this.access = access;
        }

        public void setMature(boolean z) {
            this.mature = z;
        }

        public String toString() {
            return "GetUserSettings.Data(mature=" + isMature() + ", access=" + getAccess() + ")";
        }
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    protected boolean canEqual(Object obj) {
        return obj instanceof GetUserSettings;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetUserSettings)) {
            return false;
        }
        GetUserSettings getUserSettings = (GetUserSettings) obj;
        if (!getUserSettings.canEqual(this)) {
            return false;
        }
        Data data = getData();
        Data data2 = getUserSettings.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public Data getData() {
        return this.data;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public int hashCode() {
        Data data = getData();
        return 59 + (data == null ? 43 : data.hashCode());
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public String toString() {
        return "GetUserSettings(data=" + getData() + ")";
    }
}
