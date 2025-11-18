package cm.aptoide.p092pt.comments;

import cm.aptoide.p092pt.dataprovider.model.p096v7.Comment;
import java.util.List;

/* loaded from: classes.dex */
public abstract class CommentAdder {
    protected final int itemIndex;

    public CommentAdder(int i2) {
        this.itemIndex = i2;
    }

    public abstract void addComment(List<Comment> list);

    public void collapseComments() {
    }
}
