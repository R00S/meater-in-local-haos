package cm.aptoide.p092pt.app;

/* loaded from: classes.dex */
public class ReviewStats {
    private final long comments;
    private final long likes;
    private final long points;
    private final float rating;

    public ReviewStats(long j2, long j3, long j4, float f2) {
        this.comments = j2;
        this.likes = j3;
        this.points = j4;
        this.rating = f2;
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
}
