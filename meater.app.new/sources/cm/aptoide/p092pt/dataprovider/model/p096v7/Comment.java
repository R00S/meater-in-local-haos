package cm.aptoide.p092pt.dataprovider.model.p096v7;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

/* loaded from: classes.dex */
public class Comment {

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "UTC")
    private Date added;
    private String body;

    /* renamed from: id */
    private long f8527id;
    private Parent parent;
    private Long parentReview;
    private User user;

    public enum Access {
        PUBLIC,
        PRIVATE,
        UNLISTED
    }

    public static class Parent {

        /* renamed from: id */
        private long f8528id;

        protected boolean canEqual(Object obj) {
            return obj instanceof Parent;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Parent)) {
                return false;
            }
            Parent parent = (Parent) obj;
            return parent.canEqual(this) && getId() == parent.getId();
        }

        public long getId() {
            return this.f8528id;
        }

        public int hashCode() {
            long id = getId();
            return 59 + ((int) (id ^ (id >>> 32)));
        }

        public void setId(long j2) {
            this.f8528id = j2;
        }

        public String toString() {
            return "Comment.Parent(id=" + getId() + ")";
        }
    }

    public static class User {
        private Access access;
        private String avatar;

        /* renamed from: id */
        private long f8529id;
        private String name;

        protected boolean canEqual(Object obj) {
            return obj instanceof User;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            if (!user.canEqual(this) || getId() != user.getId()) {
                return false;
            }
            String name = getName();
            String name2 = user.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = user.getAvatar();
            if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                return false;
            }
            Access access = getAccess();
            Access access2 = user.getAccess();
            return access != null ? access.equals(access2) : access2 == null;
        }

        public Access getAccess() {
            return this.access;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public long getId() {
            return this.f8529id;
        }

        public String getName() {
            return this.name;
        }

        public int hashCode() {
            long id = getId();
            String name = getName();
            int iHashCode = ((((int) (id ^ (id >>> 32))) + 59) * 59) + (name == null ? 43 : name.hashCode());
            String avatar = getAvatar();
            int iHashCode2 = (iHashCode * 59) + (avatar == null ? 43 : avatar.hashCode());
            Access access = getAccess();
            return (iHashCode2 * 59) + (access != null ? access.hashCode() : 43);
        }

        public void setAccess(Access access) {
            this.access = access;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(long j2) {
            this.f8529id = j2;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String toString() {
            return "Comment.User(id=" + getId() + ", name=" + getName() + ", avatar=" + getAvatar() + ", access=" + getAccess() + ")";
        }
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof Comment;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Comment)) {
            return false;
        }
        Comment comment = (Comment) obj;
        if (!comment.canEqual(this) || getId() != comment.getId()) {
            return false;
        }
        String body = getBody();
        String body2 = comment.getBody();
        if (body != null ? !body.equals(body2) : body2 != null) {
            return false;
        }
        Date added = getAdded();
        Date added2 = comment.getAdded();
        if (added != null ? !added.equals(added2) : added2 != null) {
            return false;
        }
        User user = getUser();
        User user2 = comment.getUser();
        if (user != null ? !user.equals(user2) : user2 != null) {
            return false;
        }
        Long parentReview = getParentReview();
        Long parentReview2 = comment.getParentReview();
        if (parentReview != null ? !parentReview.equals(parentReview2) : parentReview2 != null) {
            return false;
        }
        Parent parent = getParent();
        Parent parent2 = comment.getParent();
        return parent != null ? parent.equals(parent2) : parent2 == null;
    }

    public Date getAdded() {
        return this.added;
    }

    public String getBody() {
        return this.body;
    }

    public long getId() {
        return this.f8527id;
    }

    public Parent getParent() {
        return this.parent;
    }

    public Long getParentReview() {
        return this.parentReview;
    }

    public User getUser() {
        return this.user;
    }

    public int hashCode() {
        long id = getId();
        String body = getBody();
        int iHashCode = ((((int) (id ^ (id >>> 32))) + 59) * 59) + (body == null ? 43 : body.hashCode());
        Date added = getAdded();
        int iHashCode2 = (iHashCode * 59) + (added == null ? 43 : added.hashCode());
        User user = getUser();
        int iHashCode3 = (iHashCode2 * 59) + (user == null ? 43 : user.hashCode());
        Long parentReview = getParentReview();
        int iHashCode4 = (iHashCode3 * 59) + (parentReview == null ? 43 : parentReview.hashCode());
        Parent parent = getParent();
        return (iHashCode4 * 59) + (parent != null ? parent.hashCode() : 43);
    }

    public void setAdded(Date date) {
        this.added = date;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setId(long j2) {
        this.f8527id = j2;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public void setParentReview(Long l) {
        this.parentReview = l;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String toString() {
        return "Comment(id=" + getId() + ", body=" + getBody() + ", added=" + getAdded() + ", user=" + getUser() + ", parentReview=" + getParentReview() + ", parent=" + getParent() + ")";
    }
}
