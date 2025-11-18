package cm.aptoide.p092pt.home.apps;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationActivity;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationItem;
import cm.aptoide.p092pt.home.apps.AppClick;
import cm.aptoide.p092pt.home.apps.list.AppsController;
import cm.aptoide.p092pt.home.apps.model.InstalledApp;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.view.fragment.NavigationTrackFragment;
import cm.aptoide.p092pt.view.p107rx.RxAlertDialog;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;
import javax.inject.Inject;
import okhttp3.HttpUrl;
import p024c.p085v.p086a.C1020c;
import p241e.p294g.p295a.p297b.p300b.p301a.C8965c;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class AppsFragment extends NavigationTrackFragment implements AppsFragmentView {
    private static final BottomNavigationItem BOTTOM_NAVIGATION_ITEM = BottomNavigationItem.APPS;
    private AppsController appsController;

    @Inject
    AppsPresenter appsPresenter;
    private EpoxyRecyclerView appsRecyclerView;
    private BottomNavigationActivity bottomNavigationActivity;
    private RxAlertDialog ignoreUpdateDialog;
    private ProgressBar progressBar;
    private C1020c swipeRefreshLayout;

    @Inject
    ThemeManager themeManager;
    private ImageView userAvatar;

    private void buildIgnoreUpdatesDialog() {
        this.ignoreUpdateDialog = new RxAlertDialog.Builder(getContext(), this.themeManager).setTitle(C1146R.string.apps_title_ignore_updates).setPositiveButton(C1146R.string.apps_button_ignore_updates_yes).setNegativeButton(C1146R.string.apps_button_ignore_updates_no).build();
    }

    private void hideLoadingProgressBar() {
        this.progressBar.setVisibility(8);
    }

    public static AppsFragment newInstance() {
        return new AppsFragment();
    }

    private void setupRecyclerView() {
        AppsController appsController = new AppsController(this.themeManager);
        this.appsController = appsController;
        this.appsRecyclerView.setController(appsController);
        this.appsController.getAdapter().registerAdapterDataObserver(new RecyclerView.AbstractC0596i() { // from class: cm.aptoide.pt.home.apps.AppsFragment.1
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
            public void onItemRangeInserted(int i2, int i3) {
                if (i2 == 0) {
                    AppsFragment.this.appsRecyclerView.scrollToPosition(0);
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public C11234e<App> cancelDownload() {
        return this.appsController.getAppEventListener().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((AppClick) obj).getClickType() == AppClick.ClickType.CANCEL_CLICK);
            }
        }).m40082X(C2950w3.f9483f);
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public C11234e<App> cardClick() {
        return this.appsController.getAppEventListener().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((AppClick) obj).getClickType() == AppClick.ClickType.CARD_CLICK);
            }
        }).m40082X(C2950w3.f9483f);
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public void hidePullToRefresh() {
        if (this.swipeRefreshLayout.isRefreshing()) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public C11234e<Void> imageClick() {
        return C8975a.m28573a(this.userAvatar);
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public C11234e<App> installApp() {
        return this.appsController.getAppEventListener().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((AppClick) obj).getClickType() == AppClick.ClickType.INSTALL_CLICK);
            }
        }).m40082X(C2950w3.f9483f);
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
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(C1146R.layout.fragment_apps, viewGroup, false);
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.progressBar = null;
        this.swipeRefreshLayout = null;
        this.ignoreUpdateDialog = null;
        this.appsRecyclerView = null;
        this.userAvatar = null;
    }

    @Override // cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDetach() {
        this.bottomNavigationActivity = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AppsController appsController = this.appsController;
        if (appsController != null) {
            appsController.onSaveInstanceState(bundle);
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BottomNavigationActivity bottomNavigationActivity = this.bottomNavigationActivity;
        if (bottomNavigationActivity != null) {
            bottomNavigationActivity.requestFocus(BOTTOM_NAVIGATION_ITEM);
        }
        this.appsRecyclerView = (EpoxyRecyclerView) view.findViewById(C1146R.id.fragment_apps_recycler_view);
        setupRecyclerView();
        this.swipeRefreshLayout = (C1020c) view.findViewById(C1146R.id.fragment_apps_swipe_container);
        ProgressBar progressBar = (ProgressBar) view.findViewById(C1146R.id.progress_bar);
        this.progressBar = progressBar;
        progressBar.setVisibility(0);
        buildIgnoreUpdatesDialog();
        this.userAvatar = (ImageView) view.findViewById(C1146R.id.user_actionbar_icon);
        attachPresenter(this.appsPresenter);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        AppsController appsController = this.appsController;
        if (appsController != null) {
            appsController.onRestoreInstanceState(bundle);
        }
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public C11234e<App> pauseDownload() {
        return this.appsController.getAppEventListener().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((AppClick) obj).getClickType() == AppClick.ClickType.PAUSE_CLICK);
            }
        }).m40082X(C2950w3.f9483f);
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public C11234e<Void> refreshApps() {
        return C8965c.m28561a(this.swipeRefreshLayout);
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public C11234e<App> resumeDownload() {
        return this.appsController.getAppEventListener().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((AppClick) obj).getClickType() == AppClick.ClickType.RESUME_CLICK);
            }
        }).m40082X(C2950w3.f9483f);
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public void scrollToTop() {
        if (((LinearLayoutManager) this.appsRecyclerView.getLayoutManager()).findLastVisibleItemPosition() > 10) {
            this.appsRecyclerView.scrollToPosition(10);
        }
        this.appsRecyclerView.smoothScrollToPosition(0);
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public void setDefaultUserImage() {
        ImageLoader.with(getContext()).loadUsingCircleTransform(C1146R.drawable.ic_account_circle, this.userAvatar);
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public void setUserImage(String str) {
        ImageLoader.with(getContext()).loadWithShadowCircleTransformWithPlaceholder(str, this.userAvatar, C1146R.drawable.ic_account_circle);
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public void showAvatar() {
        this.userAvatar.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public Single<RxAlertDialog.Result> showIgnoreUpdateDialog() {
        return this.ignoreUpdateDialog.showWithResult();
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public void showModel(AppsModel appsModel) {
        hideLoadingProgressBar();
        this.appsController.setData2(appsModel.getUpdates(), (List<? extends InstalledApp>) appsModel.getInstalled(), appsModel.getDownloads());
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public C11234e<Boolean> showRootWarning() {
        return GenericDialogs.createGenericYesNoCancelMessage(getContext(), HttpUrl.FRAGMENT_ENCODE_SET, AptoideUtils.StringU.getFormattedString(C1146R.string.root_access_dialog, getResources(), new Object[0]), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((GenericDialogs.EResponse) obj).equals(GenericDialogs.EResponse.YES));
            }
        });
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public void showUnknownErrorMessage() {
        Snackbar.m24763Z(getView(), C1146R.string.unknown_error, -1).mo24744P();
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public C11234e<App> startDownload() {
        return this.appsController.getAppEventListener().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((AppClick) obj).getClickType() == AppClick.ClickType.DOWNLOAD_ACTION_CLICK);
            }
        }).m40082X(C2950w3.f9483f);
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public C11234e<Void> updateAll() {
        return this.appsController.getUpdateAllEvent();
    }

    @Override // cm.aptoide.p092pt.home.apps.AppsFragmentView
    public C11234e<App> updateLongClick() {
        return this.appsController.getAppEventListener().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((AppClick) obj).getClickType() == AppClick.ClickType.CARD_LONG_CLICK);
            }
        }).m40082X(C2950w3.f9483f);
    }
}
