package cm.aptoide.p092pt.comments.view;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.UserFeedbackAnalytics;
import cm.aptoide.p092pt.comments.CommentAdder;
import cm.aptoide.p092pt.comments.ReviewWithAppName;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import cm.aptoide.p092pt.view.recycler.displayable.DisplayablePojo;

/* loaded from: classes.dex */
public class RateAndReviewCommentDisplayable extends DisplayablePojo<ReviewWithAppName> {
    private CommentAdder commentAdder;
    private int numberComments;
    private UserFeedbackAnalytics userFeedbackAnalytics;

    public RateAndReviewCommentDisplayable() {
    }

    public CommentAdder getCommentAdder() {
        return this.commentAdder;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public int getNumberComments() {
        return this.numberComments;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.displayable_rate_and_review;
    }

    public void sendVoteDownEvent() {
        this.userFeedbackAnalytics.sendVoteDownEvent();
    }

    public void sendVoteUpEvent() {
        this.userFeedbackAnalytics.sendVoteUpEvent();
    }

    public RateAndReviewCommentDisplayable(ReviewWithAppName reviewWithAppName, CommentAdder commentAdder, int i2, UserFeedbackAnalytics userFeedbackAnalytics) {
        super(reviewWithAppName);
        this.commentAdder = commentAdder;
        this.numberComments = i2;
        this.userFeedbackAnalytics = userFeedbackAnalytics;
    }
}
