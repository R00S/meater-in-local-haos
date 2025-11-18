package cm.aptoide.p092pt;

import cm.aptoide.accountmanager.AccountService;
import cm.aptoide.accountmanager.AdultContent;
import cm.aptoide.p092pt.preferences.LocalPersistenceAdultContent;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FlavourApplicationModule_ProvideAdultContentFactory implements Provider {
    private final Provider<AccountService> accountServiceProvider;
    private final Provider<LocalPersistenceAdultContent> localAdultContentProvider;
    private final FlavourApplicationModule module;

    public FlavourApplicationModule_ProvideAdultContentFactory(FlavourApplicationModule flavourApplicationModule, Provider<LocalPersistenceAdultContent> provider, Provider<AccountService> provider2) {
        this.module = flavourApplicationModule;
        this.localAdultContentProvider = provider;
        this.accountServiceProvider = provider2;
    }

    public static FlavourApplicationModule_ProvideAdultContentFactory create(FlavourApplicationModule flavourApplicationModule, Provider<LocalPersistenceAdultContent> provider, Provider<AccountService> provider2) {
        return new FlavourApplicationModule_ProvideAdultContentFactory(flavourApplicationModule, provider, provider2);
    }

    public static AdultContent provideAdultContent(FlavourApplicationModule flavourApplicationModule, LocalPersistenceAdultContent localPersistenceAdultContent, AccountService accountService) {
        return (AdultContent) C9055b.m29112c(flavourApplicationModule.provideAdultContent(localPersistenceAdultContent, accountService));
    }

    @Override // javax.inject.Provider
    public AdultContent get() {
        return provideAdultContent(this.module, this.localAdultContentProvider.get(), this.accountServiceProvider.get());
    }
}
