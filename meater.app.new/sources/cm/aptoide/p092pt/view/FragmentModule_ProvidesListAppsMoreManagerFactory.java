package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.ads.AdsRepository;
import cm.aptoide.p092pt.home.more.apps.ListAppsMoreManager;
import cm.aptoide.p092pt.home.more.apps.ListAppsMoreRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesListAppsMoreManagerFactory implements Provider {
    private final Provider<AdsRepository> adsRepositoryProvider;
    private final Provider<ListAppsMoreRepository> listAppsMoreRepositoryProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesListAppsMoreManagerFactory(FragmentModule fragmentModule, Provider<ListAppsMoreRepository> provider, Provider<AdsRepository> provider2) {
        this.module = fragmentModule;
        this.listAppsMoreRepositoryProvider = provider;
        this.adsRepositoryProvider = provider2;
    }

    public static FragmentModule_ProvidesListAppsMoreManagerFactory create(FragmentModule fragmentModule, Provider<ListAppsMoreRepository> provider, Provider<AdsRepository> provider2) {
        return new FragmentModule_ProvidesListAppsMoreManagerFactory(fragmentModule, provider, provider2);
    }

    public static ListAppsMoreManager providesListAppsMoreManager(FragmentModule fragmentModule, ListAppsMoreRepository listAppsMoreRepository, AdsRepository adsRepository) {
        return (ListAppsMoreManager) C9055b.m29112c(fragmentModule.providesListAppsMoreManager(listAppsMoreRepository, adsRepository));
    }

    @Override // javax.inject.Provider
    public ListAppsMoreManager get() {
        return providesListAppsMoreManager(this.module, this.listAppsMoreRepositoryProvider.get(), this.adsRepositoryProvider.get());
    }
}
