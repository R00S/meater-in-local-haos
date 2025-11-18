package cm.aptoide.p092pt.comments;

import cm.aptoide.p092pt.dataprovider.model.p096v7.Comment;
import p456rx.C11231b;

/* loaded from: classes.dex */
public class ComplexComment extends Comment {
    private final int level;
    private final C11231b onClickReplyAction;

    public ComplexComment(CommentNode commentNode, C11231b c11231b) {
        this.level = commentNode.getLevel();
        Comment comment = commentNode.getComment();
        setAdded(comment.getAdded());
        setBody(comment.getBody());
        setId(comment.getId());
        if (comment.getParent() != null) {
            setParent(comment.getParent());
        }
        setParentReview(comment.getParentReview());
        setUser(comment.getUser());
        this.onClickReplyAction = c11231b;
    }

    public int getLevel() {
        return this.level;
    }

    public C11231b observeReplySubmission() {
        return this.onClickReplyAction;
    }
}
