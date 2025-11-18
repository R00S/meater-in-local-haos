package cm.aptoide.p092pt;

import cm.aptoide.p092pt.search.suggestions.SearchSuggestionManager;
import cm.aptoide.p092pt.search.suggestions.SearchSuggestionRemoteRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesSearchSuggestionManagerFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<SearchSuggestionRemoteRepository> remoteRepositoryProvider;

    public ApplicationModule_ProvidesSearchSuggestionManagerFactory(ApplicationModule applicationModule, Provider<SearchSuggestionRemoteRepository> provider) {
        this.module = applicationModule;
        this.remoteRepositoryProvider = provider;
    }

    public static ApplicationModule_ProvidesSearchSuggestionManagerFactory create(ApplicationModule applicationModule, Provider<SearchSuggestionRemoteRepository> provider) {
        return new ApplicationModule_ProvidesSearchSuggestionManagerFactory(applicationModule, provider);
    }

    public static SearchSuggestionManager providesSearchSuggestionManager(ApplicationModule applicationModule, SearchSuggestionRemoteRepository searchSuggestionRemoteRepository) {
        return (SearchSuggestionManager) C9055b.m29112c(applicationModule.providesSearchSuggestionManager(searchSuggestionRemoteRepository));
    }

    @Override // javax.inject.Provider
    public SearchSuggestionManager get() {
        return providesSearchSuggestionManager(this.module, this.remoteRepositoryProvider.get());
    }
}
