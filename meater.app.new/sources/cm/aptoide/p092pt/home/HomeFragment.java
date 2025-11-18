package cm.aptoide.p092pt.home;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.aptoideviews.errors.ErrorView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationActivity;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationItem;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.editorial.CaptionBackgroundPainter;
import cm.aptoide.p092pt.editorial.EditorialFragment;
import cm.aptoide.p092pt.home.bundles.BundlesAdapter;
import cm.aptoide.p092pt.home.bundles.HomeBundlesModel;
import cm.aptoide.p092pt.home.bundles.ads.AdHomeEvent;
import cm.aptoide.p092pt.home.bundles.ads.AdsBundlesViewHolderFactory;
import cm.aptoide.p092pt.home.bundles.base.AppComingSoonPromotionalBundle;
import cm.aptoide.p092pt.home.bundles.base.AppHomeEvent;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.home.bundles.editorial.EditorialBundleViewHolder;
import cm.aptoide.p092pt.home.bundles.editorial.EditorialHomeEvent;
import cm.aptoide.p092pt.home.bundles.misc.ErrorHomeBundle;
import cm.aptoide.p092pt.home.bundles.misc.ProgressBundle;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.reactions.ReactionsHomeEvent;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import cm.aptoide.p092pt.view.fragment.NavigationTrackFragment;
import com.google.android.material.snackbar.Snackbar;
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
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class HomeFragment extends NavigationTrackFragment implements HomeView, ScrollableView {
    private static final String LIST_STATE_KEY = "cm.aptoide.pt.BottomHomeFragment.ListState";
    private static final int VISIBLE_THRESHOLD = 2;
    private C11418b<AdHomeEvent> adClickedEvents;
    private BundlesAdapter adapter;
    private BottomNavigationActivity bottomNavigationActivity;
    private RecyclerView bundlesList;

    @Inject
    CaptionBackgroundPainter captionBackgroundPainter;
    private ErrorView errorView;
    private C11418b<Boolean> firstBundleLoadListener;
    private LinearLayoutManager layoutManager;
    private Parcelable listState;

    @Inject
    @Named
    String marketName;
    private DecimalFormat oneDecimalFormatter;

    @Inject
    HomePresenter presenter;
    private ProgressBar progressBar;
    private C11418b<Void> snackListener;
    private C1020c swipeRefreshLayout;

    @Inject
    ThemeManager themeManager;
    private C11418b<HomeEvent> uiEventsListener;
    private ImageView userAvatar;
    private static final String TAG = EditorialFragment.class.getName();
    private static final BottomNavigationItem BOTTOM_NAVIGATION_ITEM = BottomNavigationItem.HOME;

    private void fireFirstBundleLoadedEvent(HomeBundlesModel homeBundlesModel) {
        try {
            if (homeBundlesModel.getList().get(0).getContent() != null) {
                this.firstBundleLoadListener.onNext(Boolean.TRUE);
            }
        } catch (Exception unused) {
        }
    }

    private EditorialBundleViewHolder getViewHolderForAdapterPosition(int i2) {
        try {
            return (EditorialBundleViewHolder) this.bundlesList.findViewHolderForAdapterPosition(i2);
        } catch (Exception unused) {
            Log.e(TAG, "Unable to find editorialViewHolder");
            return null;
        }
    }

    private boolean isEndReached() {
        return this.layoutManager.getItemCount() - this.layoutManager.findLastVisibleItemPosition() <= 2 && this.adapter.isLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$reachesBottom$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m7863e(C8967a c8967a) {
        return Boolean.valueOf(isEndReached());
    }

    static /* synthetic */ Boolean lambda$reachesBottom$1(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showLogInDialog$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7864f(View view) {
        this.snackListener.onNext(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$visibleBundles$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ HomeEvent m7865g(Integer num) {
        return new HomeEvent(this.adapter.getBundle(num.intValue()), num.intValue(), null);
    }

    static /* synthetic */ Boolean lambda$visibleBundles$5(Boolean bool) {
        return bool;
    }

    static /* synthetic */ Integer lambda$visibleBundles$6(Boolean bool) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$visibleBundles$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Integer m7866h(Object obj) {
        return Integer.valueOf(this.layoutManager.findFirstVisibleItemPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$visibleBundles$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m7867i(Integer num) {
        return Boolean.valueOf(this.adapter.getBundle(num.intValue()).getContent() != null);
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public C11234e<AdHomeEvent> adClicked() {
        return this.adClickedEvents;
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public C11234e<AppHomeEvent> appClicked() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.s3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                HomeEvent homeEvent = (HomeEvent) obj;
                return Boolean.valueOf(homeEvent.getType().equals(HomeEvent.Type.APP) || homeEvent.getType().equals(HomeEvent.Type.REWARD_APP) || homeEvent.getType().equals(HomeEvent.Type.INSTALL_PROMOTIONAL));
            }
        }).m40088b(AppHomeEvent.class);
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public C11234e<HomeEvent> bundleScrolled() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.i3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.SCROLL_RIGHT));
            }
        }).m40099m(200L, TimeUnit.MILLISECONDS);
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public C11234e<HomeEvent> cancelNotifyMeClicked() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.n3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.CANCEL_NOTIFY_ME));
            }
        });
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public C11234e<HomeEvent> dismissBundleClicked() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.q3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.DISMISS_BUNDLE));
            }
        });
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public C11234e<EditorialHomeEvent> editorialCardClicked() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.f3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.EDITORIAL));
            }
        }).m40088b(EditorialHomeEvent.class);
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName(), HttpUrl.FRAGMENT_ENCODE_SET, StoreContext.home.name());
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public void hideBundle(int i2) {
        this.adapter.remove(i2);
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

    @Override // cm.aptoide.p092pt.home.HomeView
    public C11234e<Void> imageClick() {
        return C8975a.m28573a(this.userAvatar);
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public C11234e<HomeEvent> infoBundleKnowMoreClicked() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.l3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.APPC_KNOW_MORE));
            }
        });
    }

    @Override // cm.aptoide.p092pt.home.ScrollableView
    public boolean isAtTop() {
        return ((LinearLayoutManager) this.bundlesList.getLayoutManager()).findFirstVisibleItemPosition() == 0;
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public C11234e<HomeEvent> moreClicked() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.v3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.MORE));
            }
        });
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public C11234e<HomeEvent> notifyMeClicked() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.a3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.NOTIFY_ME));
            }
        });
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof BottomNavigationActivity) {
            this.bottomNavigationActivity = (BottomNavigationActivity) activity;
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.uiEventsListener = C11418b.m40637g1();
        this.adClickedEvents = C11418b.m40637g1();
        this.snackListener = C11418b.m40637g1();
        this.firstBundleLoadListener = C11418b.m40637g1();
        this.oneDecimalFormatter = new DecimalFormat("0.0");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1146R.layout.fragment_home, viewGroup, false);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.uiEventsListener = null;
        this.oneDecimalFormatter = null;
        this.adClickedEvents = null;
        this.userAvatar = null;
        this.snackListener = null;
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
        super.onDestroyView();
    }

    @Override // cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDetach() {
        this.bottomNavigationActivity = null;
        super.onDetach();
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public C11234e<HomeEvent> onLoadMoreRetryClicked() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.o3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.LOAD_MORE_RETRY));
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        RecyclerView recyclerView = this.bundlesList;
        if (recyclerView != null) {
            bundle.putParcelable(LIST_STATE_KEY, recyclerView.getLayoutManager().onSaveInstanceState());
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BottomNavigationActivity bottomNavigationActivity = this.bottomNavigationActivity;
        if (bottomNavigationActivity != null) {
            bottomNavigationActivity.requestFocus(BOTTOM_NAVIGATION_ITEM);
        }
        if (bundle != null && bundle.containsKey(LIST_STATE_KEY)) {
            this.listState = bundle.getParcelable(LIST_STATE_KEY);
            bundle.putParcelable(LIST_STATE_KEY, null);
        }
        this.userAvatar = (ImageView) view.findViewById(C1146R.id.user_actionbar_icon);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1146R.id.bundles_list);
        this.bundlesList = recyclerView;
        recyclerView.getItemAnimator().setChangeDuration(0L);
        this.errorView = (ErrorView) view.findViewById(C1146R.id.error_view);
        this.progressBar = (ProgressBar) view.findViewById(C1146R.id.progress_bar);
        this.swipeRefreshLayout = (C1020c) view.findViewById(C1146R.id.refresh_layout);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.layoutManager = linearLayoutManager;
        this.bundlesList.setLayoutManager(linearLayoutManager);
        ArrayList arrayList = new ArrayList();
        ProgressBundle progressBundle = new ProgressBundle();
        ErrorHomeBundle errorHomeBundle = new ErrorHomeBundle();
        DecimalFormat decimalFormat = this.oneDecimalFormatter;
        C11418b<HomeEvent> c11418b = this.uiEventsListener;
        BundlesAdapter bundlesAdapter = new BundlesAdapter(arrayList, progressBundle, errorHomeBundle, decimalFormat, c11418b, new AdsBundlesViewHolderFactory(c11418b, this.adClickedEvents, decimalFormat, this.marketName), this.captionBackgroundPainter, this.marketName, this.themeManager);
        this.adapter = bundlesAdapter;
        this.bundlesList.setAdapter(bundlesAdapter);
        attachPresenter(this.presenter);
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public C11234e<Object> reachesBottom() {
        return C8969c.m28565a(this.bundlesList).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.p3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9941f.m7863e((C8967a) obj);
            }
        }).m40111t().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.d3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                HomeFragment.lambda$reachesBottom$1(bool);
                return bool;
            }
        }).m40088b(Object.class);
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public C11234e<EditorialHomeEvent> reactionButtonLongPress() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.g3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.REACT_LONG_PRESS));
            }
        }).m40088b(EditorialHomeEvent.class);
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public C11234e<ReactionsHomeEvent> reactionClicked() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.m3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.REACTION));
            }
        }).m40088b(ReactionsHomeEvent.class);
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public C11234e<EditorialHomeEvent> reactionsButtonClicked() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.h3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.REACT_SINGLE_PRESS));
            }
        }).m40088b(EditorialHomeEvent.class);
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public C11234e<Void> refreshes() {
        return C8965c.m28561a(this.swipeRefreshLayout);
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public void removeLoadMoreError() {
        this.adapter.removeLoadMoreError();
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public C11234e<Void> retryClicked() {
        return this.errorView.retryClick();
    }

    @Override // cm.aptoide.p092pt.home.HomeView, cm.aptoide.p092pt.home.ScrollableView
    public void scrollToTop() {
        if (((LinearLayoutManager) this.bundlesList.getLayoutManager()).findLastVisibleItemPosition() > 10) {
            this.bundlesList.scrollToPosition(10);
        }
        this.bundlesList.smoothScrollToPosition(0);
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public void sendDeeplinkToWalletAppView(String str) {
        Intent intent = new Intent(getContext(), (Class<?>) DeepLinkIntentReceiver.class);
        intent.setData(Uri.parse(str));
        startActivity(intent);
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public void setAdsTest(boolean z) {
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public void setUserImage(String str) {
        ImageLoader.with(getContext()).loadWithShadowCircleTransformWithPlaceholder(str, this.userAvatar, C1146R.drawable.ic_account_circle);
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public void showBundles(List<HomeBundle> list) {
        this.adapter.update(list);
        if (this.listState != null) {
            this.bundlesList.getLayoutManager().onRestoreInstanceState(this.listState);
            this.listState = null;
        }
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public void showBundlesSkeleton(HomeBundlesModel homeBundlesModel) {
        fireFirstBundleLoadedEvent(homeBundlesModel);
        this.adapter.update(homeBundlesModel.getList());
        if (this.listState != null) {
            this.bundlesList.getLayoutManager().onRestoreInstanceState(this.listState);
            this.listState = null;
        }
        hideLoading();
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public void showConsentDialog() {
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

    @Override // cm.aptoide.p092pt.home.HomeView
    public void showGenericErrorToast() {
        Snackbar.m24764a0(getView(), getString(C1146R.string.error_occured), 0).mo24744P();
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public void showLoadMore() {
        this.adapter.addLoadMore();
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public void showLoadMoreError() {
        this.adapter.showLoadMoreError();
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public void showLoading() {
        this.bundlesList.setVisibility(8);
        this.errorView.setVisibility(8);
        this.progressBar.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public void showLogInDialog() {
        ShowMessage.asSnack(getActivity(), C1146R.string.editorial_reactions_login_short, C1146R.string.login, new View.OnClickListener() { // from class: cm.aptoide.pt.home.r3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9964f.m7864f(view);
            }
        }, -1);
    }

    @Override // cm.aptoide.p092pt.home.apps.BundleView
    public void showMoreHomeBundles(List<HomeBundle> list) {
        this.adapter.add(list);
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

    @Override // cm.aptoide.p092pt.home.HomeView
    public void showNetworkErrorToast() {
        Snackbar.m24764a0(getView(), getString(C1146R.string.connection_error), 0).mo24744P();
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public void showReactionsPopup(String str, String str2, int i2) {
        EditorialBundleViewHolder viewHolderForAdapterPosition = getViewHolderForAdapterPosition(i2);
        if (viewHolderForAdapterPosition != null) {
            viewHolderForAdapterPosition.showReactions(str, str2, i2);
        }
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public C11234e<Void> snackLogInClick() {
        return this.snackListener;
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public void updateAppComingSoonStatus(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle, boolean z) {
        this.adapter.updateAppComingSoonCard(appComingSoonPromotionalBundle, z);
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
        return C11234e.m40033a0(C8969c.m28565a(this.bundlesList), this.firstBundleLoadListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.u3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                HomeFragment.lambda$visibleBundles$5(bool);
                return bool;
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.k3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return HomeFragment.lambda$visibleBundles$6((Boolean) obj);
            }
        })).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.c3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9678f.m7866h(obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.t3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() != -1);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.b3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9503f.m7867i((Integer) obj);
            }
        }).m40111t().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.e3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9702f.m7865g((Integer) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.home.HomeView
    public C11234e<HomeEvent> walletOfferCardInstallWalletClick() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.j3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.INSTALL_WALLET));
            }
        });
    }
}
