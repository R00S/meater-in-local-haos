package cm.aptoide.p092pt.store.view;

import android.os.Bundle;
import android.view.WindowManager;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetStoreWidgets;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import cm.aptoide.p092pt.store.StoreAnalytics;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import cm.aptoide.p092pt.view.recycler.displayable.DisplayablesFactory;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public abstract class StoreTabWidgetsGridRecyclerFragment extends StoreTabGridRecyclerFragment {
    protected AptoideAccountManager accountManager;

    @Inject
    AnalyticsManager analyticsManager;

    @Inject
    AptoideInstalledAppsRepository aptoideInstalledAppsRepository;

    @Inject
    @Named
    String marketName;
    protected NavigationTracker navigationTracker;
    protected StoreAnalytics storeAnalytics;

    @Inject
    StoreCredentialsProvider storeCredentialsProvider;

    @Inject
    RoomStoreRepository storeRepository;
    private StoreTabNavigator storeTabNavigator;

    @Inject
    StoreUtilsProxy storeUtilsProxy;

    @Inject
    ThemeManager themeManager;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$parseDisplayables$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8823f(GetStoreWidgets.WSWidget wSWidget) {
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        return DisplayablesFactory.parse(this.marketName, wSWidget, ((StoreTabGridRecyclerFragment) this).storeTheme, this.storeRepository, this.storeCredentialsProvider, this.storeContext, getContext(), this.accountManager, this.storeUtilsProxy, (WindowManager) getContext().getSystemService("window"), getContext().getResources(), this.aptoideInstalledAppsRepository, this.storeAnalytics, this.storeTabNavigator, this.navigationTracker, new BadgeDialogFactory(getActivity(), this.themeManager), ((ActivityResultNavigator) getContext()).getFragmentNavigator(), aptoideApplication.getBodyInterceptorPoolV7(), aptoideApplication.getDefaultClient(), WebService.getDefaultConverter(), aptoideApplication.getTokenInvalidator(), aptoideApplication.getDefaultSharedPreferences(), this.themeManager);
    }

    @Override // cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment, cm.aptoide.p092pt.view.fragment.AptoideBaseFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.navigationTracker = ((AptoideApplication) getContext().getApplicationContext()).getNavigationTracker();
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.storeAnalytics = new StoreAnalytics(this.analyticsManager, this.navigationTracker);
        this.storeTabNavigator = new StoreTabNavigator(getFragmentNavigator());
    }

    public C11234e<List<Displayable>> parseDisplayables(GetStoreWidgets getStoreWidgets) {
        int i2 = getContext().getResources().getConfiguration().uiMode & 48;
        return C11234e.m40020N(getStoreWidgets.getDataList().getList()).m40094j(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.t1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11460f.m8823f((GetStoreWidgets.WSWidget) obj);
            }
        }).m40084Y0().m40057E();
    }
}
