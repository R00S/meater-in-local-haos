package cm.aptoide.p092pt.editorialList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.aptoideviews.errors.ErrorView;
import cm.aptoide.aptoideviews.skeleton.Skeleton;
import cm.aptoide.aptoideviews.skeleton.SkeletonUtils;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.bonus.BonusAppcModel;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationActivity;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationItem;
import cm.aptoide.p092pt.editorial.CaptionBackgroundPainter;
import cm.aptoide.p092pt.editorial.EditorialFragment;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.home.bundles.editorial.EditorialBundleViewHolder;
import cm.aptoide.p092pt.home.bundles.editorial.EditorialHomeEvent;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.reactions.ReactionsHomeEvent;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import cm.aptoide.p092pt.view.fragment.NavigationTrackFragment;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import p024c.p085v.p086a.C1020c;
import p241e.p294g.p295a.p297b.p300b.p301a.C8965c;
import p241e.p294g.p295a.p297b.p302c.p303a.C8967a;
import p241e.p294g.p295a.p297b.p302c.p303a.C8969c;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class EditorialListFragment extends NavigationTrackFragment implements EditorialListView {
    private static final int VISIBLE_THRESHOLD = 1;
    private EditorialListAdapter adapter;
    private BottomNavigationActivity bottomNavigationActivity;

    @Inject
    CaptionBackgroundPainter captionBackgroundPainter;
    private RecyclerView editorialList;
    private ErrorView errorView;
    private ScrollControlLinearLayoutManager layoutManager;

    @Inject
    public EditorialListPresenter presenter;
    private ProgressBar progressBar;
    private Skeleton skeleton;
    private C11418b<Void> snackListener;
    private C1020c swipeRefreshLayout;

    @Inject
    ThemeManager themeAttributeProvider;
    private C11418b<HomeEvent> uiEventsListener;
    private ImageView userAvatar;
    private static final String TAG = EditorialFragment.class.getName();
    private static final BottomNavigationItem BOTTOM_NAVIGATION_ITEM = BottomNavigationItem.CURATION;

    private EditorialBundleViewHolder getViewHolderForAdapterPosition(int i2) {
        if (i2 == -1) {
            return null;
        }
        EditorialBundleViewHolder editorialBundleViewHolder = (EditorialBundleViewHolder) this.editorialList.findViewHolderForAdapterPosition(i2);
        if (editorialBundleViewHolder == null) {
            Log.e(TAG, "Unable to find editorialBundleViewHolder");
        }
        return editorialBundleViewHolder;
    }

    private boolean isEndReached() {
        return this.layoutManager.getItemCount() - this.layoutManager.findLastVisibleItemPosition() <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$reachesBottom$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m7747e(C8967a c8967a) {
        return Boolean.valueOf(isEndReached());
    }

    static /* synthetic */ Boolean lambda$reachesBottom$3(Boolean bool) {
        return bool;
    }

    private /* synthetic */ EditorialHomeEvent lambda$reactionButtonLongPress$9(EditorialHomeEvent editorialHomeEvent) {
        setScrollEnabled(Boolean.FALSE);
        return editorialHomeEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showLogInDialog$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7749g(View view) {
        this.snackListener.onNext(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$visibleCards$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Integer m7750h(C8967a c8967a) {
        return Integer.valueOf(this.layoutManager.findFirstVisibleItemPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$visibleCards$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ EditorialListEvent m7751i(Integer num) {
        return new EditorialListEvent(this.adapter.getCard(num.intValue()).getId(), num.intValue());
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public C11234e<EditorialHomeEvent> editorialCardClicked() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.EDITORIAL));
            }
        }).m40088b(EditorialHomeEvent.class);
    }

    /* renamed from: f */
    public /* synthetic */ EditorialHomeEvent m7748f(EditorialHomeEvent editorialHomeEvent) {
        lambda$reactionButtonLongPress$9(editorialHomeEvent);
        return editorialHomeEvent;
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public void hideLoadMore() {
        EditorialListAdapter editorialListAdapter = this.adapter;
        if (editorialListAdapter != null) {
            editorialListAdapter.removeLoadMore();
        }
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public void hideLoading() {
        this.errorView.setVisibility(8);
        this.skeleton.showOriginal();
        this.swipeRefreshLayout.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public void hideRefresh() {
        this.swipeRefreshLayout.setRefreshing(false);
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public C11234e<Void> imageClick() {
        return C8975a.m28573a(this.userAvatar);
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
        this.snackListener = C11418b.m40637g1();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(C1146R.layout.fragment_editorial_list, viewGroup, false);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.uiEventsListener = null;
        this.snackListener = null;
        super.onDestroy();
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.editorialList = null;
        this.adapter = null;
        this.layoutManager = null;
        this.progressBar = null;
        this.errorView = null;
        this.userAvatar = null;
        this.swipeRefreshLayout = null;
        super.onDestroyView();
    }

    @Override // cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDetach() {
        this.bottomNavigationActivity = null;
        super.onDetach();
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public C11234e<EditorialHomeEvent> onPopupDismiss() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.POPUP_DISMISS));
            }
        }).m40088b(EditorialHomeEvent.class);
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BottomNavigationActivity bottomNavigationActivity = this.bottomNavigationActivity;
        if (bottomNavigationActivity != null) {
            bottomNavigationActivity.requestFocus(BOTTOM_NAVIGATION_ITEM);
        }
        this.userAvatar = (ImageView) view.findViewById(C1146R.id.user_actionbar_icon);
        this.layoutManager = new ScrollControlLinearLayoutManager(getContext());
        this.adapter = new EditorialListAdapter(new ArrayList(), new ProgressCard(), this.uiEventsListener, this.captionBackgroundPainter, this.themeAttributeProvider);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1146R.id.editorial_list);
        this.editorialList = recyclerView;
        recyclerView.setLayoutManager(this.layoutManager);
        this.editorialList.setAdapter(this.adapter);
        this.editorialList.getItemAnimator().setChangeDuration(0L);
        this.swipeRefreshLayout = (C1020c) view.findViewById(C1146R.id.refresh_layout);
        this.errorView = (ErrorView) view.findViewById(C1146R.id.error_view);
        this.progressBar = (ProgressBar) view.findViewById(C1146R.id.progress_bar);
        this.skeleton = SkeletonUtils.applySkeleton(this.editorialList, C1146R.layout.editorial_list_action_item_skeleton, 4);
        attachPresenter(this.presenter);
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public void populateView(List<CurationCard> list, BonusAppcModel bonusAppcModel) {
        this.editorialList.setVisibility(0);
        this.adapter.add(list, bonusAppcModel);
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public C11234e<Object> reachesBottom() {
        return C8969c.m28565a(this.editorialList).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9234f.m7747e((C8967a) obj);
            }
        }).m40111t().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                EditorialListFragment.lambda$reachesBottom$3(bool);
                return bool;
            }
        }).m40088b(Object.class);
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public C11234e<EditorialHomeEvent> reactionButtonLongPress() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.REACT_LONG_PRESS));
            }
        }).m40088b(EditorialHomeEvent.class).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                EditorialHomeEvent editorialHomeEvent = (EditorialHomeEvent) obj;
                this.f9267f.m7748f(editorialHomeEvent);
                return editorialHomeEvent;
            }
        });
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public C11234e<ReactionsHomeEvent> reactionClicked() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.REACTION));
            }
        }).m40088b(ReactionsHomeEvent.class);
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public C11234e<EditorialHomeEvent> reactionsButtonClicked() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.REACT_SINGLE_PRESS));
            }
        }).m40088b(EditorialHomeEvent.class);
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public C11234e<Void> refreshes() {
        return C8965c.m28561a(this.swipeRefreshLayout);
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public C11234e<Void> retryClicked() {
        return this.errorView.retryClick();
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public void setDefaultUserImage() {
        ImageLoader.with(getContext()).loadUsingCircleTransform(C1146R.drawable.ic_account_circle, this.userAvatar);
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public void setScrollEnabled(Boolean bool) {
        this.layoutManager.setScrollEnabled(bool.booleanValue());
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public void setUserImage(String str) {
        ImageLoader.with(getContext()).loadWithShadowCircleTransformWithPlaceholder(str, this.userAvatar, C1146R.drawable.ic_account_circle);
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public void showAvatar() {
        this.userAvatar.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public void showGenericError() {
        this.errorView.setError(ErrorView.Error.GENERIC);
        this.errorView.setVisibility(0);
        this.editorialList.setVisibility(8);
        this.progressBar.setVisibility(8);
        if (this.swipeRefreshLayout.isRefreshing()) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public void showGenericErrorToast() {
        Snackbar.m24764a0(getView(), getString(C1146R.string.error_occured), 0).mo24744P();
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public void showLoadMore() {
        EditorialListAdapter editorialListAdapter = this.adapter;
        if (editorialListAdapter != null) {
            editorialListAdapter.addLoadMore();
        }
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public void showLoading() {
        this.errorView.setVisibility(8);
        this.skeleton.showSkeleton();
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public void showLogInDialog() {
        ShowMessage.asSnack(getActivity(), C1146R.string.editorial_reactions_login_short, C1146R.string.login, new View.OnClickListener() { // from class: cm.aptoide.pt.editorialList.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9275f.m7749g(view);
            }
        }, -1);
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public void showNetworkError() {
        this.errorView.setError(ErrorView.Error.NO_NETWORK);
        this.errorView.setVisibility(0);
        this.editorialList.setVisibility(8);
        this.progressBar.setVisibility(8);
        if (this.swipeRefreshLayout.isRefreshing()) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public void showNetworkErrorToast() {
        Snackbar.m24764a0(getView(), getString(C1146R.string.connection_error), 0).mo24744P();
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public void showReactionsPopup(String str, String str2, int i2) {
        EditorialBundleViewHolder viewHolderForAdapterPosition = getViewHolderForAdapterPosition(i2);
        if (viewHolderForAdapterPosition != null) {
            viewHolderForAdapterPosition.showReactions(str, str2, i2);
        }
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public C11234e<Void> snackLogInClick() {
        return this.snackListener;
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public void update(List<CurationCard> list) {
        this.editorialList.setVisibility(0);
        EditorialListAdapter editorialListAdapter = this.adapter;
        if (editorialListAdapter != null) {
            editorialListAdapter.update(list);
        }
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public void updateEditorialCard(CurationCard curationCard) {
        this.adapter.updateEditorialCard(curationCard);
    }

    @Override // cm.aptoide.p092pt.editorialList.EditorialListView
    public C11234e<EditorialListEvent> visibleCards() {
        return C8969c.m28565a(this.editorialList).m40065I0(C11250a.m40156b()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9243f.m7750h((C8967a) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.r
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() != -1);
            }
        }).m40111t().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9259f.m7751i((Integer) obj);
            }
        });
    }
}
