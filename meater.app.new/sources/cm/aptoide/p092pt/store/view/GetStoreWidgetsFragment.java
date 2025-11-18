package cm.aptoide.p092pt.store.view;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetStoreWidgets;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class GetStoreWidgetsFragment extends GetStoreEndlessFragment<GetStoreWidgets> {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$buildAction$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8789h(GetStoreWidgets getStoreWidgets) {
        addDisplayables(parseDisplayables(getStoreWidgets).m40081W0().m40551b());
    }

    public static Fragment newInstance() {
        return new GetStoreWidgetsFragment();
    }

    @Override // cm.aptoide.p092pt.store.view.GetStoreEndlessFragment
    protected InterfaceC11253b<GetStoreWidgets> buildAction() {
        return new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.d0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11318f.m8789h((GetStoreWidgets) obj);
            }
        };
    }

    @Override // cm.aptoide.p092pt.store.view.GetStoreEndlessFragment
    protected AbstractC2229V7<GetStoreWidgets, ? extends Endless> buildRequest(boolean z, String str) {
        return this.requestFactoryCdnPool.newStoreWidgets(str);
    }

    @Override // cm.aptoide.p092pt.store.view.GetStoreEndlessFragment, cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment, cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.LoadInterface
    public void load(boolean z, boolean z2, Bundle bundle) {
        super.load(z, z2, bundle);
    }

    @Override // cm.aptoide.p092pt.store.view.StoreTabWidgetsGridRecyclerFragment, cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment, cm.aptoide.p092pt.view.fragment.AptoideBaseFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }
}
