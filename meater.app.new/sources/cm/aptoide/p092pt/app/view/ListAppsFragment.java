package cm.aptoide.p092pt.app.view;

import androidx.fragment.app.Fragment;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Layout;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListApps;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.store.view.GetStoreEndlessFragment;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import cm.aptoide.p092pt.store.view.StoreTabWidgetsGridRecyclerFragment;
import cm.aptoide.p092pt.store.view.featured.AppBrickListDisplayable;
import cm.aptoide.p092pt.store.view.top.TopAppListDisplayable;
import java.util.LinkedList;
import java.util.List;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class ListAppsFragment extends GetStoreEndlessFragment<ListApps> {

    /* renamed from: cm.aptoide.pt.app.view.ListAppsFragment$1 */
    static /* synthetic */ class C15031 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Layout;

        static {
            int[] iArr = new int[Layout.values().length];
            $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Layout = iArr;
            try {
                iArr[Layout.GRAPHIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$buildAction$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7278h(ListApps listApps) {
        List<App> list = listApps.getDataList().getList();
        LinkedList linkedList = new LinkedList();
        if (this.homeEventType.equals(HomeEvent.Type.MORE_TOP)) {
            for (App app : list) {
                app.getStore().setAppearance(new Store.Appearance(((StoreTabGridRecyclerFragment) this).storeTheme, null));
                linkedList.add(new TopAppListDisplayable(app, this.tag, ((StoreTabWidgetsGridRecyclerFragment) this).navigationTracker, this.storeContext));
            }
        } else {
            Layout layout = this.layout;
            if (layout == null) {
                for (App app2 : list) {
                    app2.getStore().setAppearance(new Store.Appearance(((StoreTabGridRecyclerFragment) this).storeTheme, null));
                    linkedList.add(new GridAppDisplayable(app2, this.tag, ((StoreTabWidgetsGridRecyclerFragment) this).navigationTracker, this.storeContext));
                }
            } else if (C15031.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Layout[layout.ordinal()] != 1) {
                for (App app3 : list) {
                    app3.getStore().setAppearance(new Store.Appearance(((StoreTabGridRecyclerFragment) this).storeTheme, null));
                    linkedList.add(new GridAppDisplayable(app3, this.tag, ((StoreTabWidgetsGridRecyclerFragment) this).navigationTracker, this.storeContext));
                }
            } else {
                for (App app4 : list) {
                    app4.getStore().setAppearance(new Store.Appearance(((StoreTabGridRecyclerFragment) this).storeTheme, null));
                    linkedList.add(new AppBrickListDisplayable(app4, this.tag, ((StoreTabWidgetsGridRecyclerFragment) this).navigationTracker, this.storeContext));
                }
            }
        }
        addDisplayables(linkedList);
    }

    public static Fragment newInstance() {
        return new ListAppsFragment();
    }

    @Override // cm.aptoide.p092pt.store.view.GetStoreEndlessFragment
    protected InterfaceC11253b<ListApps> buildAction() {
        return new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.pd
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7994f.m7278h((ListApps) obj);
            }
        };
    }

    @Override // cm.aptoide.p092pt.store.view.GetStoreEndlessFragment
    protected AbstractC2229V7<ListApps, ? extends Endless> buildRequest(boolean z, String str) {
        return this.requestFactoryCdnPool.newListAppsRequest(str);
    }
}
