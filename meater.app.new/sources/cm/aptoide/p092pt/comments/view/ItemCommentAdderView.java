package cm.aptoide.p092pt.comments.view;

import cm.aptoide.p092pt.comments.view.CommentsAdapter;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;

/* loaded from: classes.dex */
public interface ItemCommentAdderView<Titem, Tadapter extends CommentsAdapter> extends CommentAdderView<Tadapter> {
    Displayable createReadMoreDisplayable(int i2, Titem titem);
}
