package cm.aptoide.p092pt.app.view;

import cm.aptoide.p092pt.store.RoomStoreRepository;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class OtherVersionsFragment_MembersInjector implements InterfaceC9053a<OtherVersionsFragment> {
    private final Provider<RoomStoreRepository> storeRepositoryProvider;

    public OtherVersionsFragment_MembersInjector(Provider<RoomStoreRepository> provider) {
        this.storeRepositoryProvider = provider;
    }

    public static InterfaceC9053a<OtherVersionsFragment> create(Provider<RoomStoreRepository> provider) {
        return new OtherVersionsFragment_MembersInjector(provider);
    }

    public static void injectStoreRepository(OtherVersionsFragment otherVersionsFragment, RoomStoreRepository roomStoreRepository) {
        otherVersionsFragment.storeRepository = roomStoreRepository;
    }

    public void injectMembers(OtherVersionsFragment otherVersionsFragment) {
        injectStoreRepository(otherVersionsFragment, this.storeRepositoryProvider.get());
    }
}
