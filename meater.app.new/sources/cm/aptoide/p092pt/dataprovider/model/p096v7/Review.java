package cm.aptoide.p092pt.dataprovider.model.p096v7;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

/* loaded from: classes.dex */
public class Review {

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "UTC")
    private Date added;
    private String body;
    private ListComments commentList;
    private Comments comments;

    /* renamed from: id */
    private long f8539id;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "UTC")
    private Date modified;
    private Stats stats;
    private String title;
    private User user;

    public static class Comments {
        private long total;
        private String view;

        protected boolean canEqual(Object obj) {
            return obj instanceof Comments;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Comments)) {
                return false;
            }
            Comments comments = (Comments) obj;
            if (!comments.canEqual(this) || getTotal() != comments.getTotal()) {
                return false;
            }
            String view = getView();
            String view2 = comments.getView();
            return view != null ? view.equals(view2) : view2 == null;
        }

        public long getTotal() {
            return this.total;
        }

        public String getView() {
            return this.view;
        }

        public int hashCode() {
            long total = getTotal();
            String view = getView();
            return ((((int) (total ^ (total >>> 32))) + 59) * 59) + (view == null ? 43 : view.hashCode());
        }

        public void setTotal(long j2) {
            this.total = j2;
        }

        public void setView(String str) {
            this.view = str;
        }

        public String toString() {
            return "Review.Comments(total=" + getTotal() + ", view=" + getView() + ")";
        }
    }

    public static class Stats {
        private long comments;
        private long likes;
        private long points;
        private float rating;

        protected boolean canEqual(Object obj) {
            return obj instanceof Stats;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Stats)) {
                return false;
            }
            Stats stats = (Stats) obj;
            return stats.canEqual(this) && Float.compare(getRating(), stats.getRating()) == 0 && getPoints() == stats.getPoints() && getLikes() == stats.getLikes() && getComments() == stats.getComments();
        }

        public long getComments() {
            return this.comments;
        }

        public long getLikes() {
            return this.likes;
        }

        public long getPoints() {
            return this.points;
        }

        public float getRating() {
            return this.rating;
        }

        public int hashCode() {
            int iFloatToIntBits = Float.floatToIntBits(getRating()) + 59;
            long points = getPoints();
            int i2 = (iFloatToIntBits * 59) + ((int) (points ^ (points >>> 32)));
            long likes = getLikes();
            int i3 = (i2 * 59) + ((int) (likes ^ (likes >>> 32)));
            long comments = getComments();
            return (i3 * 59) + ((int) (comments ^ (comments >>> 32)));
        }

        public void setComments(long j2) {
            this.comments = j2;
        }

        public void setLikes(long j2) {
            this.likes = j2;
        }

        public void setPoints(long j2) {
            this.points = j2;
        }

        public void setRating(float f2) {
            this.rating = f2;
        }

        public String toString() {
            return "Review.Stats(rating=" + getRating() + ", points=" + getPoints() + ", likes=" + getLikes() + ", comments=" + getComments() + ")";
        }
    }

    public static class User {
        private String avatar;

        /* renamed from: id */
        private long f8540id;
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
            return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public long getId() {
            return this.f8540id;
        }

        public String getName() {
            return this.name;
        }

        public int hashCode() {
            long id = getId();
            String name = getName();
            int iHashCode = ((((int) (id ^ (id >>> 32))) + 59) * 59) + (name == null ? 43 : name.hashCode());
            String avatar = getAvatar();
            return (iHashCode * 59) + (avatar != null ? avatar.hashCode() : 43);
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(long j2) {
            this.f8540id = j2;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String toString() {
            return "Review.User(id=" + getId() + ", name=" + getName() + ", avatar=" + getAvatar() + ")";
        }
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof Review;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Review)) {
            return false;
        }
        Review review = (Review) obj;
        if (!review.canEqual(this) || getId() != review.getId()) {
            return false;
        }
        String title = getTitle();
        String title2 = review.getTitle();
        if (title != null ? !title.equals(title2) : title2 != null) {
            return false;
        }
        String body = getBody();
        String body2 = review.getBody();
        if (body != null ? !body.equals(body2) : body2 != null) {
            return false;
        }
        Date added = getAdded();
        Date added2 = review.getAdded();
        if (added != null ? !added.equals(added2) : added2 != null) {
            return false;
        }
        Date modified = getModified();
        Date modified2 = review.getModified();
        if (modified != null ? !modified.equals(modified2) : modified2 != null) {
            return false;
        }
        User user = getUser();
        User user2 = review.getUser();
        if (user != null ? !user.equals(user2) : user2 != null) {
            return false;
        }
        Stats stats = getStats();
        Stats stats2 = review.getStats();
        if (stats != null ? !stats.equals(stats2) : stats2 != null) {
            return false;
        }
        Comments comments = getComments();
        Comments comments2 = review.getComments();
        if (comments != null ? !comments.equals(comments2) : comments2 != null) {
            return false;
        }
        ListComments commentList = getCommentList();
        ListComments commentList2 = review.getCommentList();
        return commentList != null ? commentList.equals(commentList2) : commentList2 == null;
    }

    public Date getAdded() {
        return this.added;
    }

    public String getBody() {
        return this.body;
    }

    public ListComments getCommentList() {
        return this.commentList;
    }

    public Comments getComments() {
        return this.comments;
    }

    public long getId() {
        return this.f8539id;
    }

    public Date getModified() {
        return this.modified;
    }

    public Stats getStats() {
        return this.stats;
    }

    public String getTitle() {
        return this.title;
    }

    public User getUser() {
        return this.user;
    }

    public boolean hasComments() {
        ListComments listComments = this.commentList;
        return (listComments == null || listComments.getDataList() == null || this.commentList.getDataList().getList() == null || this.commentList.getDataList().getList().isEmpty()) ? false : true;
    }

    public int hashCode() {
        long id = getId();
        String title = getTitle();
        int iHashCode = ((((int) (id ^ (id >>> 32))) + 59) * 59) + (title == null ? 43 : title.hashCode());
        String body = getBody();
        int iHashCode2 = (iHashCode * 59) + (body == null ? 43 : body.hashCode());
        Date added = getAdded();
        int iHashCode3 = (iHashCode2 * 59) + (added == null ? 43 : added.hashCode());
        Date modified = getModified();
        int iHashCode4 = (iHashCode3 * 59) + (modified == null ? 43 : modified.hashCode());
        User user = getUser();
        int iHashCode5 = (iHashCode4 * 59) + (user == null ? 43 : user.hashCode());
        Stats stats = getStats();
        int iHashCode6 = (iHashCode5 * 59) + (stats == null ? 43 : stats.hashCode());
        Comments comments = getComments();
        int iHashCode7 = (iHashCode6 * 59) + (comments == null ? 43 : comments.hashCode());
        ListComments commentList = getCommentList();
        return (iHashCode7 * 59) + (commentList != null ? commentList.hashCode() : 43);
    }

    public void setAdded(Date date) {
        this.added = date;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setCommentList(ListComments listComments) {
        this.commentList = listComments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public void setId(long j2) {
        this.f8539id = j2;
    }

    public void setModified(Date date) {
        this.modified = date;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String toString() {
        return "Review(id=" + getId() + ", title=" + getTitle() + ", body=" + getBody() + ", added=" + getAdded() + ", modified=" + getModified() + ", user=" + getUser() + ", stats=" + getStats() + ", comments=" + getComments() + ", commentList=" + getCommentList() + ")";
    }
}
