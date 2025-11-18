package cm.aptoide.p092pt.reviews;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener;
import cm.aptoide.p092pt.dataprovider.model.p096v7.FullReview;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListFullReviews;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ListFullReviewsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.store.StoreAnalytics;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtils;
import cm.aptoide.p092pt.view.fragment.GridRecyclerSwipeFragment;
import cm.aptoide.p092pt.view.recycler.EndlessRecyclerOnScrollListener;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p456rx.p460m.InterfaceC11253b;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class LatestReviewsFragment extends GridRecyclerSwipeFragment {
    private static final int REVIEWS_LIMIT = 25;
    private static final String STORE_CONTEXT = "STORE_CONTEXT";
    private static final String STORE_ID = "storeId";

    @Inject
    AnalyticsManager analyticsManager;
    private BodyInterceptor<BaseBody> baseBodyInterceptor;
    private Converter.Factory converterFactory;
    private List<Displayable> displayables;
    private EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener;
    private OkHttpClient httpClient;

    @Inject
    NavigationTracker navigationTracker;
    private StoreAnalytics storeAnalytics;
    private StoreContext storeContext;

    @Inject
    StoreCredentialsProvider storeCredentialsProvider;
    private long storeId;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$load$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8599e(ListFullReviews listFullReviews) {
        List<FullReview> list = listFullReviews.getDataList().getList();
        this.displayables = new LinkedList();
        Iterator<FullReview> it = list.iterator();
        while (it.hasNext()) {
            this.displayables.add(new RowReviewDisplayable(it.next(), this.storeAnalytics));
        }
        addDisplayables(this.displayables);
    }

    public static LatestReviewsFragment newInstance(long j2, StoreContext storeContext) {
        LatestReviewsFragment latestReviewsFragment = new LatestReviewsFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("storeId", j2);
        bundle.putSerializable("STORE_CONTEXT", storeContext);
        latestReviewsFragment.setArguments(bundle);
        return latestReviewsFragment;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void bindViews(View view) {
        super.bindViews(view);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment
    protected boolean displayHomeUpAsEnabled() {
        return true;
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        String simpleName = getClass().getSimpleName();
        StoreContext storeContext = this.storeContext;
        return ScreenTagHistory.Builder.build(simpleName, HttpUrl.FRAGMENT_ENCODE_SET, storeContext != null ? storeContext.name() : null);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [cm.aptoide.pt.view.recycler.BaseAdapter] */
    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.LoadInterface
    public void load(boolean z, boolean z2, Bundle bundle) {
        super.load(z, z2, bundle);
        if (!z && !z2) {
            getRecyclerView().addOnScrollListener(this.endlessRecyclerOnScrollListener);
            return;
        }
        long j2 = this.storeId;
        ListFullReviewsRequest listFullReviewsRequestM7451of = ListFullReviewsRequest.m7451of(j2, 25, 0, StoreUtils.getStoreCredentials(j2, this.storeCredentialsProvider), this.baseBodyInterceptor, this.httpClient, this.converterFactory, ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator(), ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences());
        InterfaceC11253b interfaceC11253b = new InterfaceC11253b() { // from class: cm.aptoide.pt.reviews.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10962f.m8599e((ListFullReviews) obj);
            }
        };
        getRecyclerView().clearOnScrollListeners();
        this.endlessRecyclerOnScrollListener = new EndlessRecyclerOnScrollListener(getAdapter(), listFullReviewsRequestM7451of, interfaceC11253b, new ErrorRequestListener() { // from class: cm.aptoide.pt.reviews.b
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener
            public final void onError(Throwable th) {
                th.printStackTrace();
            }
        }, true, z2);
        getRecyclerView().addOnScrollListener(this.endlessRecyclerOnScrollListener);
        this.endlessRecyclerOnScrollListener.onLoadMore(z2, z2);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        this.storeId = bundle.getLong("storeId", -1L);
        this.storeContext = (StoreContext) bundle.getSerializable("STORE_CONTEXT");
    }

    @Override // cm.aptoide.p092pt.view.fragment.AptoideBaseFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.baseBodyInterceptor = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        this.httpClient = ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.storeAnalytics = new StoreAnalytics(this.analyticsManager, this.navigationTracker);
        setHasOptionsMenu(true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1146R.menu.menu_empty, menu);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }
}
