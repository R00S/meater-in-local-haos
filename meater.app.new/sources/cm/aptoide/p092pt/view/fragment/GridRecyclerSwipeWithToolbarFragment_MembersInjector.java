package cm.aptoide.p092pt.view.fragment;

import javax.inject.Named;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class GridRecyclerSwipeWithToolbarFragment_MembersInjector implements InterfaceC9053a<GridRecyclerSwipeWithToolbarFragment> {
    private final Provider<String> marketNameProvider;

    public GridRecyclerSwipeWithToolbarFragment_MembersInjector(Provider<String> provider) {
        this.marketNameProvider = provider;
    }

    public static InterfaceC9053a<GridRecyclerSwipeWithToolbarFragment> create(Provider<String> provider) {
        return new GridRecyclerSwipeWithToolbarFragment_MembersInjector(provider);
    }

    @Named
    public static void injectMarketName(GridRecyclerSwipeWithToolbarFragment gridRecyclerSwipeWithToolbarFragment, String str) {
        gridRecyclerSwipeWithToolbarFragment.marketName = str;
    }

    public void injectMembers(GridRecyclerSwipeWithToolbarFragment gridRecyclerSwipeWithToolbarFragment) {
        injectMarketName(gridRecyclerSwipeWithToolbarFragment, this.marketNameProvider.get());
    }
}
