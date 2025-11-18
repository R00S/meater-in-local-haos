package cm.aptoide.p092pt.comments.view;

import android.view.View;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Comment;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.store.view.StoreFragment;
import cm.aptoide.p092pt.view.FragmentProvider;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import com.google.android.material.snackbar.Snackbar;

/* loaded from: classes.dex */
public class CommentDisplayable extends Displayable {
    private final Comment comment;
    private FragmentNavigator fragmentNavigator;
    private FragmentProvider fragmentProvider;

    public CommentDisplayable(Comment comment, FragmentNavigator fragmentNavigator, FragmentProvider fragmentProvider) {
        this.comment = comment;
        this.fragmentNavigator = fragmentNavigator;
        this.fragmentProvider = fragmentProvider;
    }

    public Comment getComment() {
        return this.comment;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.comment_layout;
    }

    public void itemClicked(View view) {
        if (this.comment.getUser().getAccess() == Comment.Access.PUBLIC) {
            this.fragmentNavigator.navigateTo(this.fragmentProvider.newStoreFragment(this.comment.getUser().getId(), "DEFAULT", StoreFragment.OpenType.GetHome), true);
        } else {
            Snackbar.m24763Z(view, C1146R.string.stores_message_private_user, -1).mo24744P();
        }
    }

    public CommentDisplayable() {
        this.comment = null;
    }
}
