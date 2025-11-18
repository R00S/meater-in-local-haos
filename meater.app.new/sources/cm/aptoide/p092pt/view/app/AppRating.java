package cm.aptoide.p092pt.view.app;

import java.util.List;

/* loaded from: classes.dex */
public class AppRating {
    private final float average;
    private final int total;
    private final List<RatingVote> votes;

    public AppRating(float f2, int i2, List<RatingVote> list) {
        this.average = f2;
        this.total = i2;
        this.votes = list;
    }

    public float getAverage() {
        return this.average;
    }

    public int getTotal() {
        return this.total;
    }

    public List<RatingVote> getVotes() {
        return this.votes;
    }
}
