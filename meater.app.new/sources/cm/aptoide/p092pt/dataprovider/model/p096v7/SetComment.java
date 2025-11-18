package cm.aptoide.p092pt.dataprovider.model.p096v7;

import cm.aptoide.p092pt.dataprovider.model.p096v7.Comment;

/* loaded from: classes.dex */
public class SetComment extends BaseV7Response {
    private Data data;

    public static class Data {
        private String body;

        /* renamed from: id */
        private long f8541id;
        private String mode;
        private String status;
        private Comment.User user;

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
            String body = getBody();
            String body2 = data.getBody();
            if (body != null ? !body.equals(body2) : body2 != null) {
                return false;
            }
            Comment.User user = getUser();
            Comment.User user2 = data.getUser();
            if (user != null ? !user.equals(user2) : user2 != null) {
                return false;
            }
            String status = getStatus();
            String status2 = data.getStatus();
            if (status != null ? !status.equals(status2) : status2 != null) {
                return false;
            }
            String mode = getMode();
            String mode2 = data.getMode();
            return mode != null ? mode.equals(mode2) : mode2 == null;
        }

        public String getBody() {
            return this.body;
        }

        public long getId() {
            return this.f8541id;
        }

        public String getMode() {
            return this.mode;
        }

        public String getStatus() {
            return this.status;
        }

        public Comment.User getUser() {
            return this.user;
        }

        public int hashCode() {
            long id = getId();
            String body = getBody();
            int iHashCode = ((((int) (id ^ (id >>> 32))) + 59) * 59) + (body == null ? 43 : body.hashCode());
            Comment.User user = getUser();
            int iHashCode2 = (iHashCode * 59) + (user == null ? 43 : user.hashCode());
            String status = getStatus();
            int iHashCode3 = (iHashCode2 * 59) + (status == null ? 43 : status.hashCode());
            String mode = getMode();
            return (iHashCode3 * 59) + (mode != null ? mode.hashCode() : 43);
        }

        public void setBody(String str) {
            this.body = str;
        }

        public void setId(long j2) {
            this.f8541id = j2;
        }

        public void setMode(String str) {
            this.mode = str;
        }

        public void setStatus(String str) {
            this.status = str;
        }

        public void setUser(Comment.User user) {
            this.user = user;
        }

        public String toString() {
            return "SetComment.Data(id=" + getId() + ", body=" + getBody() + ", user=" + getUser() + ", status=" + getStatus() + ", mode=" + getMode() + ")";
        }
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    protected boolean canEqual(Object obj) {
        return obj instanceof SetComment;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetComment)) {
            return false;
        }
        SetComment setComment = (SetComment) obj;
        if (!setComment.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Data data = getData();
        Data data2 = setComment.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public Data getData() {
        return this.data;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public int hashCode() {
        int iHashCode = super.hashCode() + 59;
        Data data = getData();
        return (iHashCode * 59) + (data == null ? 43 : data.hashCode());
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public String toString() {
        return "SetComment(data=" + getData() + ")";
    }
}
