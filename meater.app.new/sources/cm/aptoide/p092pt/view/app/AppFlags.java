package cm.aptoide.p092pt.view.app;

import java.util.List;

/* loaded from: classes.dex */
public class AppFlags {
    private final String review;
    private final List<FlagsVote> votes;

    public AppFlags(String str, List<FlagsVote> list) {
        this.review = str;
        this.votes = list;
    }

    public String getReview() {
        return this.review;
    }

    public List<FlagsVote> getVotes() {
        return this.votes;
    }
}
