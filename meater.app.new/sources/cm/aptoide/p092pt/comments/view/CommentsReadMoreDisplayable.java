package cm.aptoide.p092pt.comments.view;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.comments.CommentAdder;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;

/* loaded from: classes.dex */
public class CommentsReadMoreDisplayable extends Displayable {
    private final CommentAdder commentAdder;
    private final boolean isReview;
    private final int next;
    private final long resourceId;

    public CommentsReadMoreDisplayable() {
        this(-1L, true, 0, null);
    }

    public CommentAdder getCommentAdder() {
        return this.commentAdder;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public int getNext() {
        return this.next;
    }

    public long getResourceId() {
        return this.resourceId;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.comments_read_more_layout;
    }

    public boolean isReview() {
        return this.isReview;
    }

    public CommentsReadMoreDisplayable(long j2, boolean z, int i2, CommentAdder commentAdder) {
        this.commentAdder = commentAdder;
        this.next = i2;
        this.resourceId = j2;
        this.isReview = z;
    }
}
