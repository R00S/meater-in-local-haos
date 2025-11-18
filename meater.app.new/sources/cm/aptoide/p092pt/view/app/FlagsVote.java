package cm.aptoide.p092pt.view.app;

/* loaded from: classes.dex */
public class FlagsVote {
    private final int count;
    private final VoteType voteType;

    public enum VoteType {
        FAKE,
        FREEZE,
        GOOD,
        LICENSE,
        VIRUS
    }

    public FlagsVote(int i2, VoteType voteType) {
        this.count = i2;
        this.voteType = voteType;
    }

    public int getCount() {
        return this.count;
    }

    public VoteType getVoteType() {
        return this.voteType;
    }
}
