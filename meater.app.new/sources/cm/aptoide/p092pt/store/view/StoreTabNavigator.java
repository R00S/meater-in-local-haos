package cm.aptoide.p092pt.store.view;

import cm.aptoide.p092pt.comments.view.CommentListFragment;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.dataprovider.util.CommentType;
import cm.aptoide.p092pt.navigator.FragmentNavigator;

/* loaded from: classes.dex */
public class StoreTabNavigator {
    private final FragmentNavigator fragmentNavigator;

    public StoreTabNavigator(FragmentNavigator fragmentNavigator) {
        this.fragmentNavigator = fragmentNavigator;
    }

    public void navigateToCommentGridRecyclerView(CommentType commentType, String str, String str2, StoreContext storeContext) {
        this.fragmentNavigator.navigateTo(CommentListFragment.newInstanceUrl(commentType, str, str2, storeContext), true);
    }

    public void navigateToStoreTabGridRecyclerView(Event event, String str, String str2, String str3, StoreContext storeContext, boolean z) {
        this.fragmentNavigator.navigateTo(StoreTabGridRecyclerFragment.newInstance(event, str, str2, str3, storeContext, z), true);
    }
}
