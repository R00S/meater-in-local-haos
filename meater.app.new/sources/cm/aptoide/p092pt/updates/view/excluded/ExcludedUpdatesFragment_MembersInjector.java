package cm.aptoide.p092pt.updates.view.excluded;

import cm.aptoide.p092pt.updates.UpdatePersistence;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class ExcludedUpdatesFragment_MembersInjector implements InterfaceC9053a<ExcludedUpdatesFragment> {
    private final Provider<UpdatePersistence> updatesPersistenceProvider;

    public ExcludedUpdatesFragment_MembersInjector(Provider<UpdatePersistence> provider) {
        this.updatesPersistenceProvider = provider;
    }

    public static InterfaceC9053a<ExcludedUpdatesFragment> create(Provider<UpdatePersistence> provider) {
        return new ExcludedUpdatesFragment_MembersInjector(provider);
    }

    public static void injectUpdatesPersistence(ExcludedUpdatesFragment excludedUpdatesFragment, UpdatePersistence updatePersistence) {
        excludedUpdatesFragment.updatesPersistence = updatePersistence;
    }

    public void injectMembers(ExcludedUpdatesFragment excludedUpdatesFragment) {
        injectUpdatesPersistence(excludedUpdatesFragment, this.updatesPersistenceProvider.get());
    }
}
