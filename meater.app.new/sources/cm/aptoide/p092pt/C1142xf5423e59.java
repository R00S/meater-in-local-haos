package cm.aptoide.p092pt;

import cm.aptoide.p092pt.search.suggestions.SearchSuggestionRemoteRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;
import retrofit2.Retrofit;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesSearchSuggestionRemoteRepositoryFactory */
/* loaded from: classes.dex */
public final class C1142xf5423e59 implements Provider {
    private final ApplicationModule module;
    private final Provider<Retrofit> retrofitProvider;

    public C1142xf5423e59(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        this.module = applicationModule;
        this.retrofitProvider = provider;
    }

    public static C1142xf5423e59 create(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        return new C1142xf5423e59(applicationModule, provider);
    }

    public static SearchSuggestionRemoteRepository providesSearchSuggestionRemoteRepository(ApplicationModule applicationModule, Retrofit retrofit) {
        return (SearchSuggestionRemoteRepository) C9055b.m29112c(applicationModule.providesSearchSuggestionRemoteRepository(retrofit));
    }

    @Override // javax.inject.Provider
    public SearchSuggestionRemoteRepository get() {
        return providesSearchSuggestionRemoteRepository(this.module, this.retrofitProvider.get());
    }
}
