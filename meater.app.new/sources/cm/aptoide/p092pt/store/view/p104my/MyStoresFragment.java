package cm.aptoide.p092pt.store.view.p104my;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.accountmanager.Account;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationActivity;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationItem;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetStoreWidgets;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import cm.aptoide.p092pt.store.view.GridStoreDisplayable;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import cm.aptoide.p092pt.store.view.StoreTabWidgetsGridRecyclerFragment;
import cm.aptoide.p092pt.timeline.view.displayable.FollowStoreDisplayable;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import cm.aptoide.p092pt.view.recycler.displayable.DisplayableGroup;
import com.trello.rxlifecycle.p234g.EnumC8762b;
import java.util.List;
import javax.inject.Inject;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class MyStoresFragment extends StoreTabWidgetsGridRecyclerFragment implements MyStoresView {
    private BottomNavigationActivity bottomNavigationActivity;

    @Inject
    MyStoresPresenter myStoresPresenter;

    @Inject
    RoomStoreRepository storeRepository;
    private ImageView userAvatar;
    private static final String TAG = MyStoresFragment.class.getSimpleName();
    private static final BottomNavigationItem BOTTOM_NAVIGATION_ITEM = BottomNavigationItem.STORES;

    /* JADX INFO: Access modifiers changed from: private */
    public List<Displayable> addFollowStoreDisplayable(List<Displayable> list) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= list.size()) {
                i3 = 0;
                break;
            }
            if (list.get(i3) instanceof DisplayableGroup) {
                break;
            }
            i3++;
        }
        List<Displayable> children = ((DisplayableGroup) list.get(i3)).getChildren();
        int i4 = 0;
        while (true) {
            if (i4 >= children.size()) {
                break;
            }
            if (children.get(i4) instanceof GridStoreDisplayable) {
                i2 = i4;
                break;
            }
            i4++;
        }
        ((DisplayableGroup) list.get(i3)).getChildren().add(i2, new FollowStoreDisplayable());
        if (children.size() > 6) {
            ((DisplayableGroup) list.get(i3)).getChildren().remove(children.size() - 1);
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$registerForViewChanges$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8831h(Account account) {
        reloadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$registerForViewChanges$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8832i(List list) {
        Logger.getInstance().m8273d(TAG, "Store database changed, reloading...");
        reloadData();
    }

    static /* synthetic */ void lambda$registerForViewChanges$2(Object obj) {
    }

    public static MyStoresFragment newInstance(Event event, String str, String str2, StoreContext storeContext) {
        Bundle bundleBuildBundle = StoreTabGridRecyclerFragment.buildBundle(event, HomeEvent.Type.NO_OP, null, str, str2, storeContext, false);
        MyStoresFragment myStoresFragment = new MyStoresFragment();
        myStoresFragment.setArguments(bundleBuildBundle);
        return myStoresFragment;
    }

    private void registerForViewChanges() {
        C11234e.m40033a0(((AptoideApplication) getContext().getApplicationContext()).getAccountManager().accountStatus().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.my.e
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11371f.m8831h((Account) obj);
            }
        }), this.storeRepository.getAll().m40122y0(1).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.my.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11363f.m8832i((List) obj);
            }
        })).m40095j0(C11250a.m40156b()).m40091f(bindUntilEvent(EnumC8762b.DESTROY_VIEW)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.my.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyStoresFragment.lambda$registerForViewChanges$2(obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.my.f
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
    }

    private void reloadData() {
        super.load(false, true, null);
    }

    @Override // cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment
    protected C11234e<List<Displayable>> buildDisplayables(boolean z, String str, boolean z2) {
        return this.requestFactoryCdnPool.newStoreWidgets(str).observe(z, z2).m40095j0(Schedulers.m40658io()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.my.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11359f.parseDisplayables((GetStoreWidgets) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.my.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11367f.addFollowStoreDisplayable((List) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment
    protected boolean displayHomeUpAsEnabled() {
        return false;
    }

    @Override // cm.aptoide.p092pt.store.view.p104my.MyStoresView
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

    @Override // cm.aptoide.p092pt.store.view.StoreTabWidgetsGridRecyclerFragment, cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment, cm.aptoide.p092pt.view.fragment.AptoideBaseFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
    }

    @Override // cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(C1146R.layout.my_stores, viewGroup, false);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.userAvatar = null;
        super.onDestroyView();
    }

    @Override // cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDetach() {
        this.bottomNavigationActivity = null;
        super.onDetach();
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BottomNavigationActivity bottomNavigationActivity = this.bottomNavigationActivity;
        if (bottomNavigationActivity != null) {
            bottomNavigationActivity.requestFocus(BOTTOM_NAVIGATION_ITEM);
        }
        registerForViewChanges();
        if (getView() != null) {
            this.userAvatar = (ImageView) getView().findViewById(C1146R.id.user_actionbar_icon);
        }
        attachPresenter(this.myStoresPresenter);
    }

    @Override // cm.aptoide.p092pt.store.view.p104my.MyStoresView
    public void scrollToTop() {
        RecyclerView recyclerView = getRecyclerView();
        if (((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition() > 10) {
            recyclerView.scrollToPosition(10);
        }
        recyclerView.smoothScrollToPosition(0);
    }

    @Override // cm.aptoide.p092pt.store.view.p104my.MyStoresView
    public void setDefaultUserImage() {
        ImageLoader.with(getContext()).loadUsingCircleTransform(C1146R.drawable.ic_account_circle, this.userAvatar);
    }

    @Override // cm.aptoide.p092pt.store.view.p104my.MyStoresView
    public void setUserImage(String str) {
        if (this.userAvatar != null) {
            ImageLoader.with(getContext()).loadWithShadowCircleTransformWithPlaceholder(str, this.userAvatar, C1146R.drawable.ic_account_circle);
        }
    }

    @Override // cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment
    public void setupToolbarDetails(Toolbar toolbar) {
        toolbar.setTitle((CharSequence) null);
        toolbar.setLogo((Drawable) null);
    }

    @Override // cm.aptoide.p092pt.store.view.p104my.MyStoresView
    public void showAvatar() {
        ImageView imageView = this.userAvatar;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    public static Fragment newInstance() {
        return new MyStoresFragment();
    }
}
