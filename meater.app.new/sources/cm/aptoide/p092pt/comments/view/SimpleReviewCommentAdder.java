package cm.aptoide.p092pt.comments.view;

import cm.aptoide.p092pt.comments.CommentAdder;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Comment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class SimpleReviewCommentAdder extends CommentAdder {
    private final CommentAdderView commentAdderView;

    public SimpleReviewCommentAdder(int i2, CommentAdderView commentAdderView) {
        super(i2);
        this.commentAdderView = commentAdderView;
    }

    @Override // cm.aptoide.p092pt.comments.CommentAdder
    public void addComment(List<Comment> list) {
        int itemPosition = this.commentAdderView.getAdapter().getItemPosition(this.itemIndex + 1);
        if (itemPosition == -1) {
            itemPosition = this.commentAdderView.getAdapter().getItemCount();
        }
        int i2 = itemPosition - 1;
        this.commentAdderView.getAdapter().removeDisplayable(i2);
        ArrayList arrayList = new ArrayList();
        this.commentAdderView.createDisplayableComments(list, arrayList);
        this.commentAdderView.getAdapter().addDisplayables(i2, arrayList);
    }
}
