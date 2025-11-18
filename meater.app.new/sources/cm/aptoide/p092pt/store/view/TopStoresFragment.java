package cm.aptoide.p092pt.store.view;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener;
import cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.ListStores;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless;
import cm.aptoide.p092pt.store.StoreAnalytics;
import cm.aptoide.p092pt.view.fragment.GridRecyclerFragmentWithDecorator;
import cm.aptoide.p092pt.view.recycler.BaseAdapter;
import cm.aptoide.p092pt.view.recycler.EndlessRecyclerOnScrollListener;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import com.trello.rxlifecycle.p234g.EnumC8762b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class TopStoresFragment extends GridRecyclerFragmentWithDecorator<BaseAdapter> implements Endless {
    public static final int STORES_LIMIT_PER_REQUEST = 10;
    public static String TAG = TopStoresFragment.class.getSimpleName();

    @Inject
    AnalyticsManager analyticsManager;

    @Inject
    NavigationTracker navigationTracker;
    private StoreAnalytics storeAnalytics;
    private int offset = 0;
    private SuccessRequestListener<ListStores> listener = new SuccessRequestListener() { // from class: cm.aptoide.pt.store.view.v1
        @Override // cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener, p456rx.p460m.InterfaceC11253b
        public final void call(Object obj) {
            this.f11481f.m8826g((ListStores) obj);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createDisplayables, reason: merged with bridge method [inline-methods] */
    public List<Displayable> m8824e(ListStores listStores) {
        ArrayList arrayList = new ArrayList();
        Iterator<Store> it = listStores.getDataList().getList().iterator();
        while (it.hasNext()) {
            arrayList.add(new GridStoreDisplayable(it.next(), "Add Store Dialog Top Stores", this.storeAnalytics));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [cm.aptoide.pt.view.recycler.BaseAdapter] */
    private void fetchStores() {
        EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener = new EndlessRecyclerOnScrollListener(getAdapter(), this.requestFactoryCdnPool.newListStoresRequest(this.offset, 10), this.listener, new ErrorRequestListener() { // from class: cm.aptoide.pt.store.view.w1
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener
            public final void onError(Throwable th) {
                th.printStackTrace();
            }
        });
        getRecyclerView().addOnScrollListener(endlessRecyclerOnScrollListener);
        endlessRecyclerOnScrollListener.onLoadMore(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8825f(List list) {
        addDisplayables(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8826g(final ListStores listStores) {
        C11234e.m40022P(new Callable() { // from class: cm.aptoide.pt.store.view.x1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f11493f.m8824e(listStores);
            }
        }).m40091f(bindUntilEvent(EnumC8762b.DESTROY_VIEW)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.u1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11474f.m8825f((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.y1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
    }

    public static TopStoresFragment newInstance() {
        return new TopStoresFragment();
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment
    protected boolean displayHomeUpAsEnabled() {
        return true;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public int getContentViewId() {
        return C1146R.layout.fragment_with_toolbar_no_theme;
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
    public Integer getLimit() {
        return 10;
    }

    @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
    public int getOffset() {
        return this.offset;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.LoadInterface
    public void load(boolean z, boolean z2, Bundle bundle) {
        super.load(z, z2, bundle);
        fetchStores();
    }

    @Override // cm.aptoide.p092pt.view.fragment.AptoideBaseFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.storeAnalytics = new StoreAnalytics(this.analyticsManager, this.navigationTracker);
        setHasOptionsMenu(true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }

    @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
    public void setOffset(int i2) {
        this.offset = i2;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment
    public void setupToolbarDetails(Toolbar toolbar) {
        toolbar.setTitle(C1146R.string.top_stores_fragment_title);
        toolbar.setLogo(C1146R.drawable.logo_toolbar);
    }

    @Override // cm.aptoide.p092pt.view.fragment.GridRecyclerFragmentWithDecorator, cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void setupViews() {
        super.setupViews();
        setupToolbar();
    }
}
