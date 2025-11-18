package cm.aptoide.p092pt.app.view;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.app.ActivityC0067d;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.aptoideviews.errors.ErrorView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.editorial.CaptionBackgroundPainter;
import cm.aptoide.p092pt.home.ScrollableView;
import cm.aptoide.p092pt.home.bundles.BundlesAdapter;
import cm.aptoide.p092pt.home.bundles.ads.AdHomeEvent;
import cm.aptoide.p092pt.home.bundles.ads.AdsBundlesViewHolderFactory;
import cm.aptoide.p092pt.home.bundles.base.AppHomeEvent;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.home.bundles.misc.ErrorHomeBundle;
import cm.aptoide.p092pt.home.bundles.misc.ProgressBundle;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.Translator;
import cm.aptoide.p092pt.view.fragment.NavigationTrackFragment;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Named;
import okhttp3.HttpUrl;
import p024c.p085v.p086a.C1020c;
import p241e.p294g.p295a.p297b.p300b.p301a.C8965c;
import p241e.p294g.p295a.p297b.p302c.p303a.C8967a;
import p241e.p294g.p295a.p297b.p302c.p303a.C8969c;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class MoreBundleFragment extends NavigationTrackFragment implements MoreBundleView, ScrollableView {
    private static final String MORE_LIST_STATE_KEY = "cm.aptoide.pt.more.ListState";
    private static final int VISIBLE_THRESHOLD = 1;
    private C11418b<AdHomeEvent> adClickedEvents;
    private BundlesAdapter adapter;
    private RecyclerView bundlesList;

    @Inject
    CaptionBackgroundPainter captionBackgroundPainter;
    private ErrorView errorView;
    private LinearLayoutManager layoutManager;
    private Parcelable listState;

    @Inject
    @Named
    String marketName;
    private C11418b<Boolean> notifyItemsAdded;
    private DecimalFormat oneDecimalFormatter;

    @Inject
    MoreBundlePresenter presenter;
    private ProgressBar progressBar;
    private C1020c swipeRefreshLayout;

    @Inject
    ThemeManager themeAttributeProvider;
    private Toolbar toolbar;
    private View toolbarElement;
    private C11418b<HomeEvent> uiEventsListener;

    private boolean isEndReached() {
        return this.layoutManager.getItemCount() - this.layoutManager.findLastVisibleItemPosition() <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$reachesBottom$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m7279e(C8967a c8967a) {
        return Boolean.valueOf(isEndReached());
    }

    static /* synthetic */ Boolean lambda$reachesBottom$1(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$visibleBundles$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Integer m7280f(C8967a c8967a) {
        return Integer.valueOf(this.layoutManager.findFirstVisibleItemPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$visibleBundles$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ HomeEvent m7281g(Integer num) {
        return new HomeEvent(this.adapter.getBundle(num.intValue()), num.intValue(), null);
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public C11234e<AdHomeEvent> adClicked() {
        return this.adClickedEvents;
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public C11234e<AppHomeEvent> appClicked() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.vd
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.APP));
            }
        }).m40088b(AppHomeEvent.class);
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public C11234e<HomeEvent> bundleScrolled() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.xd
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.SCROLL_RIGHT));
            }
        }).m40099m(200L, TimeUnit.MILLISECONDS);
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName(), HttpUrl.FRAGMENT_ENCODE_SET, StoreContext.home.name());
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public void hideLoading() {
        this.bundlesList.setVisibility(0);
        this.errorView.setVisibility(8);
        this.progressBar.setVisibility(8);
        this.swipeRefreshLayout.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public void hideRefresh() {
        this.swipeRefreshLayout.setRefreshing(false);
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public void hideShowMore() {
        BundlesAdapter bundlesAdapter = this.adapter;
        if (bundlesAdapter != null) {
            bundlesAdapter.removeLoadMore();
        }
    }

    @Override // cm.aptoide.p092pt.home.ScrollableView
    public boolean isAtTop() {
        return ((LinearLayoutManager) this.bundlesList.getLayoutManager()).findFirstVisibleItemPosition() == 0;
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public C11234e<HomeEvent> moreClicked() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.rd
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                HomeEvent homeEvent = (HomeEvent) obj;
                return Boolean.valueOf(homeEvent.getType().equals(HomeEvent.Type.MORE) || homeEvent.getType().equals(HomeEvent.Type.MORE_TOP));
            }
        });
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.uiEventsListener = C11418b.m40637g1();
        this.adClickedEvents = C11418b.m40637g1();
        this.notifyItemsAdded = C11418b.m40637g1();
        this.oneDecimalFormatter = new DecimalFormat("0.0");
        setHasOptionsMenu(true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1146R.menu.menu_empty, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1146R.layout.more_bundles_view, viewGroup, false);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.uiEventsListener = null;
        this.oneDecimalFormatter = null;
        this.adClickedEvents = null;
        super.onDestroy();
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.listState = this.bundlesList.getLayoutManager().onSaveInstanceState();
        this.bundlesList = null;
        this.adapter = null;
        this.layoutManager = null;
        this.swipeRefreshLayout = null;
        this.errorView = null;
        this.progressBar = null;
        this.toolbar = null;
        super.onDestroyView();
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        RecyclerView recyclerView = this.bundlesList;
        if (recyclerView != null) {
            bundle.putParcelable(MORE_LIST_STATE_KEY, recyclerView.getLayoutManager().onSaveInstanceState());
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getFragmentComponent(bundle).inject(this);
        if (bundle != null && bundle.containsKey(MORE_LIST_STATE_KEY)) {
            this.listState = bundle.getParcelable(MORE_LIST_STATE_KEY);
            bundle.putParcelable(MORE_LIST_STATE_KEY, null);
        }
        this.bundlesList = (RecyclerView) view.findViewById(C1146R.id.more_bundles_list);
        this.toolbarElement = view.findViewById(C1146R.id.action_bar);
        this.errorView = (ErrorView) view.findViewById(C1146R.id.error_view);
        this.progressBar = (ProgressBar) view.findViewById(C1146R.id.progress_bar);
        this.swipeRefreshLayout = (C1020c) view.findViewById(C1146R.id.more_refresh_layout);
        this.toolbar = (Toolbar) view.findViewById(C1146R.id.toolbar);
        ArrayList arrayList = new ArrayList();
        ProgressBundle progressBundle = new ProgressBundle();
        ErrorHomeBundle errorHomeBundle = new ErrorHomeBundle();
        DecimalFormat decimalFormat = this.oneDecimalFormatter;
        C11418b<HomeEvent> c11418b = this.uiEventsListener;
        this.adapter = new BundlesAdapter(arrayList, progressBundle, errorHomeBundle, decimalFormat, c11418b, new AdsBundlesViewHolderFactory(c11418b, this.adClickedEvents, decimalFormat, this.marketName), this.captionBackgroundPainter, this.marketName, this.themeAttributeProvider);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.layoutManager = linearLayoutManager;
        this.bundlesList.setLayoutManager(linearLayoutManager);
        this.bundlesList.setAdapter(this.adapter);
        ActivityC0067d activityC0067d = (ActivityC0067d) getActivity();
        if (getArguments().getBoolean(StoreTabGridRecyclerFragment.BundleCons.TOOLBAR, true)) {
            activityC0067d.setSupportActionBar(this.toolbar);
            AbstractC0064a supportActionBar = activityC0067d.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo227r(true);
            }
        } else {
            this.toolbarElement.setVisibility(8);
        }
        attachPresenter(this.presenter);
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public C11234e<Object> reachesBottom() {
        return C11234e.m40033a0(C8969c.m28565a(this.bundlesList).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.qd
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8013f.m7279e((C8967a) obj);
            }
        }), this.notifyItemsAdded).m40111t().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.sd
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                MoreBundleFragment.lambda$reachesBottom$1(bool);
                return bool;
            }
        }).m40088b(Object.class);
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public C11234e<Void> refreshes() {
        return C8965c.m28561a(this.swipeRefreshLayout);
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public C11234e<Void> retryClicked() {
        return this.errorView.retryClick();
    }

    @Override // cm.aptoide.p092pt.home.ScrollableView
    public void scrollToTop() {
        if (((LinearLayoutManager) this.bundlesList.getLayoutManager()).findLastVisibleItemPosition() > 10) {
            this.bundlesList.scrollToPosition(10);
        }
        this.bundlesList.smoothScrollToPosition(0);
    }

    @Override // cm.aptoide.p092pt.app.view.MoreBundleView
    public void setToolbarInfo(String str) {
        this.toolbar.setTitle(Translator.translate(str, getContext(), HttpUrl.FRAGMENT_ENCODE_SET));
        this.toolbar.setLogo(C1146R.drawable.logo_toolbar);
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public void showBundles(List<HomeBundle> list) {
        this.adapter.update(list);
        if (this.listState != null) {
            this.bundlesList.getLayoutManager().onRestoreInstanceState(this.listState);
            this.listState = null;
        }
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public void showGenericError() {
        this.errorView.setError(ErrorView.Error.GENERIC);
        this.errorView.setVisibility(0);
        this.bundlesList.setVisibility(8);
        this.progressBar.setVisibility(8);
        if (this.swipeRefreshLayout.isRefreshing()) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public void showLoadMore() {
        this.adapter.addLoadMore();
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public void showLoading() {
        this.bundlesList.setVisibility(8);
        this.errorView.setVisibility(8);
        this.progressBar.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public void showMoreHomeBundles(List<HomeBundle> list) {
        this.adapter.add(list);
        this.notifyItemsAdded.onNext(Boolean.FALSE);
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public void showNetworkError() {
        this.errorView.setError(ErrorView.Error.NO_NETWORK);
        this.errorView.setVisibility(0);
        this.bundlesList.setVisibility(8);
        this.progressBar.setVisibility(8);
        if (this.swipeRefreshLayout.isRefreshing()) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public void updateEditorialCards() {
        this.adapter.updateEditorials();
        if (this.listState != null) {
            this.bundlesList.getLayoutManager().onRestoreInstanceState(this.listState);
            this.listState = null;
        }
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public C11234e<HomeEvent> visibleBundles() {
        return C8969c.m28565a(this.bundlesList).m40065I0(C11250a.m40156b()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ud
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8099f.m7280f((C8967a) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.td
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() != -1);
            }
        }).m40111t().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.wd
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8135f.m7281g((Integer) obj);
            }
        });
    }
}
