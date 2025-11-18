package cm.aptoide.p092pt.comments.view;

import cm.aptoide.p092pt.comments.view.CommentsAdapter;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Comment;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import java.util.List;

/* loaded from: classes.dex */
public interface CommentAdderView<Tadapter extends CommentsAdapter> {
    void createDisplayableComments(List<Comment> list, List<Displayable> list2);

    Tadapter getAdapter();
}
