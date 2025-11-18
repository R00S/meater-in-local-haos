package cm.aptoide.p092pt.view.fragment;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.view.ReloadInterface;
import cm.aptoide.p092pt.view.recycler.BaseAdapter;
import cm.aptoide.p092pt.view.swipe.LoaderLayoutHandler;
import cm.aptoide.p092pt.view.swipe.SwipeLoaderLayoutHandler;

/* loaded from: classes.dex */
public abstract class GridRecyclerSwipeFragment<T extends BaseAdapter> extends GridRecyclerFragmentWithDecorator<T> implements ReloadInterface {
    protected String storeTheme;

    protected static class BundleCons {
        public static final String STORE_THEME = "storeTheme";

        protected BundleCons() {
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderFragment
    protected LoaderLayoutHandler createLoaderLayoutHandler() {
        return getViewsToShowAfterLoadingId().length > 0 ? new SwipeLoaderLayoutHandler(getViewsToShowAfterLoadingId(), this) : new SwipeLoaderLayoutHandler(getViewToShowAfterLoadingId(), this);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public int getContentViewId() {
        return C1146R.layout.recycler_swipe_fragment;
    }

    @Override // cm.aptoide.p092pt.view.ReloadInterface
    public void reload() {
        load(false, true, null);
    }
}
