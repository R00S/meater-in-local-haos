package cm.aptoide.p092pt.home.more.apps;

import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class ListAppsMoreFragment_MembersInjector implements InterfaceC9053a<ListAppsMoreFragment> {
    private final Provider<ListAppsMorePresenter> presenterProvider;

    public ListAppsMoreFragment_MembersInjector(Provider<ListAppsMorePresenter> provider) {
        this.presenterProvider = provider;
    }

    public static InterfaceC9053a<ListAppsMoreFragment> create(Provider<ListAppsMorePresenter> provider) {
        return new ListAppsMoreFragment_MembersInjector(provider);
    }

    public static void injectPresenter(ListAppsMoreFragment listAppsMoreFragment, ListAppsMorePresenter listAppsMorePresenter) {
        listAppsMoreFragment.presenter = listAppsMorePresenter;
    }

    public void injectMembers(ListAppsMoreFragment listAppsMoreFragment) {
        injectPresenter(listAppsMoreFragment, this.presenterProvider.get());
    }
}
