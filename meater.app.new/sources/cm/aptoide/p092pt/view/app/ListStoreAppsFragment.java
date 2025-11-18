package cm.aptoide.p092pt.view.app;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ProgressBar;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.app.ActivityC0067d;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.aptoideviews.errors.ErrorView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.BackButtonFragment;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import p024c.p085v.p086a.C1020c;
import p241e.p294g.p295a.p297b.p302c.p303a.C8967a;
import p241e.p294g.p295a.p297b.p302c.p303a.C8969c;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class ListStoreAppsFragment extends BackButtonFragment implements ListStoreAppsView {
    private static final String LIST_STATE_KEY = "cm.aptoide.pt.ListStoreAppsFragment.ListState";
    public static final int LOAD_THRESHOLD = 5;
    public static final String STORE_ID = "cm.aptoide.pt.ListStoreAppsFragment.storeId";
    private ListStoreAppsAdapter adapter;

    @Inject
    AppCenter appCenter;
    private C11418b<Application> appClicks;
    private ErrorView errorView;
    private GridLayoutManager layoutManager;
    private Parcelable listState;

    @Inject
    ListStoreAppsNavigator listStoreAppsNavigator;
    private RecyclerView recyclerView;
    private C11418b<Void> refreshEvent;
    private ProgressBar startingLoadingLayout;
    private long storeId;
    private C1020c swipeRefreshLayout;

    private boolean isEndReached() {
        return this.layoutManager.getItemCount() - this.layoutManager.findLastVisibleItemPosition() <= 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onViewCreated$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8954e() {
        this.refreshEvent.onNext(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$reachesBottom$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8955f(C8967a c8967a) {
        return Boolean.valueOf(isEndReached());
    }

    public static Fragment newInstance(long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong(STORE_ID, j2);
        ListStoreAppsFragment listStoreAppsFragment = new ListStoreAppsFragment();
        listStoreAppsFragment.setArguments(bundle);
        return listStoreAppsFragment;
    }

    private void showApps() {
        this.recyclerView.setVisibility(0);
        this.startingLoadingLayout.setVisibility(8);
        this.errorView.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.view.app.ListStoreAppsView
    public void addApps(List<Application> list) {
        this.adapter.addApps(list);
        showApps();
    }

    @Override // cm.aptoide.p092pt.view.app.ListStoreAppsView
    public C11234e<Application> getAppClick() {
        return this.appClicks;
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.view.app.ListStoreAppsView
    public C11418b<Void> getRefreshEvent() {
        return this.refreshEvent;
    }

    @Override // cm.aptoide.p092pt.view.app.ListStoreAppsView
    public C11234e<Void> getRetryEvent() {
        return this.errorView.retryClick();
    }

    public int getSpanSize(int i2) {
        return (int) ((AptoideUtils.ScreenU.getScreenWidthInDip((WindowManager) getContext().getSystemService("window"), getContext().getResources()) / 360.0f) * i2);
    }

    @Override // cm.aptoide.p092pt.view.app.ListStoreAppsView
    public void hideLoading() {
        this.adapter.hideLoading();
    }

    @Override // cm.aptoide.p092pt.view.app.ListStoreAppsView
    public void hideRefreshLoading() {
        this.swipeRefreshLayout.setRefreshing(false);
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.storeId = getArguments().getLong(STORE_ID);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(true);
        return layoutInflater.inflate(C1146R.layout.list_store_apps_fragment_layout, viewGroup, false);
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.listState = this.layoutManager.onSaveInstanceState();
        this.recyclerView = null;
        this.adapter = null;
        this.layoutManager.setSpanSizeLookup(new GridLayoutManager.C0577a());
        this.layoutManager = null;
        this.startingLoadingLayout = null;
        this.swipeRefreshLayout = null;
        this.appClicks = null;
        this.refreshEvent = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.adapter != null) {
            bundle.putParcelable(LIST_STATE_KEY, this.layoutManager.onSaveInstanceState());
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null && bundle.containsKey(LIST_STATE_KEY)) {
            this.listState = bundle.getParcelable(LIST_STATE_KEY);
            bundle.putParcelable(LIST_STATE_KEY, null);
        }
        this.appClicks = C11418b.m40637g1();
        this.refreshEvent = C11418b.m40637g1();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1146R.id.recycler_view);
        this.recyclerView = recyclerView;
        recyclerView.setVisibility(8);
        this.swipeRefreshLayout = (C1020c) view.findViewById(C1146R.id.swipe_container);
        this.errorView = (ErrorView) view.findViewById(C1146R.id.error_view);
        this.swipeRefreshLayout.setOnRefreshListener(new C1020c.j() { // from class: cm.aptoide.pt.view.app.a1
            @Override // p024c.p085v.p086a.C1020c.j
            /* renamed from: a */
            public final void mo6522a() {
                this.f11693a.m8954e();
            }
        });
        setupToolbar(view);
        ListStoreAppsAdapter listStoreAppsAdapter = new ListStoreAppsAdapter(new ArrayList(), this.appClicks);
        this.adapter = listStoreAppsAdapter;
        this.recyclerView.setAdapter(listStoreAppsAdapter);
        final int spanSize = getSpanSize(3);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), spanSize);
        this.layoutManager = gridLayoutManager;
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.AbstractC0579c() { // from class: cm.aptoide.pt.view.app.ListStoreAppsFragment.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0579c
            public int getSpanSize(int i2) {
                if (ListStoreAppsFragment.this.adapter == null || !(ListStoreAppsFragment.this.adapter.getItem(i2) instanceof AppLoading)) {
                    return 1;
                }
                return spanSize;
            }
        });
        this.recyclerView.setLayoutManager(this.layoutManager);
        ProgressBar progressBar = (ProgressBar) view.findViewById(C1146R.id.progress_bar);
        this.startingLoadingLayout = progressBar;
        progressBar.setVisibility(0);
        this.recyclerView.addItemDecoration(new RecyclerView.AbstractC0601n() { // from class: cm.aptoide.pt.view.app.ListStoreAppsFragment.2
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0601n
            public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView2, RecyclerView.C0613z c0613z) {
                if (ListStoreAppsFragment.this.getHost() != null) {
                    int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(5, ListStoreAppsFragment.this.getResources());
                    rect.set(pixelsForDip, pixelsForDip, pixelsForDip, pixelsForDip);
                }
            }
        });
        attachPresenter(new ListStoreAppsPresenter(this, this.storeId, C11250a.m40156b(), this.appCenter, CrashReport.getInstance(), this.listStoreAppsNavigator, spanSize * 10));
    }

    @Override // cm.aptoide.p092pt.view.app.ListStoreAppsView
    public C11234e<Object> reachesBottom() {
        return C8969c.m28565a(this.recyclerView).m40111t().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.b1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11697f.m8955f((C8967a) obj);
            }
        }).m40088b(Object.class);
    }

    @Override // cm.aptoide.p092pt.view.app.ListStoreAppsView
    public void setApps(List<Application> list) {
        this.adapter.setApps(list);
        Parcelable parcelable = this.listState;
        if (parcelable != null) {
            this.layoutManager.onRestoreInstanceState(parcelable);
            this.listState = null;
        }
        showApps();
    }

    public void setupToolbar(View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(C1146R.id.toolbar);
        ((ActivityC0067d) getActivity()).setSupportActionBar(toolbar);
        AbstractC0064a supportActionBar = ((ActivityC0067d) getActivity()).getSupportActionBar();
        supportActionBar.mo227r(true);
        toolbar.setTitle(C1146R.string.list_store_apps_fragment_title);
        supportActionBar.mo231v(toolbar.getTitle());
    }

    @Override // cm.aptoide.p092pt.view.app.ListStoreAppsView
    public void showGenericError() {
        this.errorView.setError(ErrorView.Error.GENERIC);
        this.errorView.setVisibility(0);
        this.startingLoadingLayout.setVisibility(8);
        this.recyclerView.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.view.app.ListStoreAppsView
    public void showLoading() {
        this.adapter.showLoading();
    }

    @Override // cm.aptoide.p092pt.view.app.ListStoreAppsView
    public void showNetworkError() {
        this.errorView.setError(ErrorView.Error.NO_NETWORK);
        this.errorView.setVisibility(0);
        this.startingLoadingLayout.setVisibility(8);
        this.recyclerView.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.view.app.ListStoreAppsView
    public void showStartingLoading() {
        this.startingLoadingLayout.setVisibility(0);
        this.recyclerView.setVisibility(8);
        this.errorView.setVisibility(8);
    }
}
