package cm.aptoide.p092pt.view;

import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.download.view.DownloadStatusManager;
import cm.aptoide.p092pt.search.SearchManager;
import cm.aptoide.p092pt.search.SearchRepository;
import cm.aptoide.p092pt.view.app.AppCenter;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesSearchManagerFactory implements Provider {
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<AppCenter> appCenterProvider;
    private final Provider<DownloadStatusManager> downloadStatusManagerProvider;
    private final FragmentModule module;
    private final Provider<SearchRepository> searchRepositoryProvider;

    public FragmentModule_ProvidesSearchManagerFactory(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<SearchRepository> provider2, Provider<DownloadStatusManager> provider3, Provider<AppCenter> provider4) {
        this.module = fragmentModule;
        this.accountManagerProvider = provider;
        this.searchRepositoryProvider = provider2;
        this.downloadStatusManagerProvider = provider3;
        this.appCenterProvider = provider4;
    }

    public static FragmentModule_ProvidesSearchManagerFactory create(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<SearchRepository> provider2, Provider<DownloadStatusManager> provider3, Provider<AppCenter> provider4) {
        return new FragmentModule_ProvidesSearchManagerFactory(fragmentModule, provider, provider2, provider3, provider4);
    }

    public static SearchManager providesSearchManager(FragmentModule fragmentModule, AptoideAccountManager aptoideAccountManager, SearchRepository searchRepository, DownloadStatusManager downloadStatusManager, AppCenter appCenter) {
        return (SearchManager) C9055b.m29112c(fragmentModule.providesSearchManager(aptoideAccountManager, searchRepository, downloadStatusManager, appCenter));
    }

    @Override // javax.inject.Provider
    public SearchManager get() {
        return providesSearchManager(this.module, this.accountManagerProvider.get(), this.searchRepositoryProvider.get(), this.downloadStatusManagerProvider.get(), this.appCenterProvider.get());
    }
}
