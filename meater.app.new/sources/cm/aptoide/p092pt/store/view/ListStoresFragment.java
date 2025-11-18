package cm.aptoide.p092pt.store.view;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.ListStores;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless;
import cm.aptoide.p092pt.store.StoreAnalytics;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class ListStoresFragment extends GetStoreEndlessFragment<ListStores> {

    @Inject
    AnalyticsManager analyticsManager;

    @Inject
    NavigationTracker navigationTracker;
    private StoreAnalytics storeAnalytics;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$buildAction$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8809h(ListStores listStores) {
        List<Store> list = listStores.getDataList().getList();
        LinkedList linkedList = new LinkedList();
        Iterator<Store> it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(new GridStoreDisplayable(it.next(), "Home " + getToolbar().getTitle().toString(), this.storeAnalytics));
        }
        addDisplayables(linkedList);
    }

    public static Fragment newInstance() {
        return new ListStoresFragment();
    }

    @Override // cm.aptoide.p092pt.store.view.GetStoreEndlessFragment
    protected InterfaceC11253b<ListStores> buildAction() {
        return new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.y0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11496f.m8809h((ListStores) obj);
            }
        };
    }

    @Override // cm.aptoide.p092pt.store.view.GetStoreEndlessFragment
    protected AbstractC2229V7<ListStores, ? extends Endless> buildRequest(boolean z, String str) {
        return this.requestFactoryCdnPool.newListStoresRequest(str);
    }

    @Override // cm.aptoide.p092pt.store.view.StoreTabWidgetsGridRecyclerFragment, cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment, cm.aptoide.p092pt.view.fragment.AptoideBaseFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.storeAnalytics = new StoreAnalytics(this.analyticsManager, this.navigationTracker);
    }
}
