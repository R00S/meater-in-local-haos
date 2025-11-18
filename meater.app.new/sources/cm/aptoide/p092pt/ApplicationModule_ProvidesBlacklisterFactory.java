package cm.aptoide.p092pt;

import cm.aptoide.p092pt.blacklist.BlacklistPersistence;
import cm.aptoide.p092pt.blacklist.Blacklister;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesBlacklisterFactory implements Provider {
    private final Provider<BlacklistPersistence> blacklistPersistenceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesBlacklisterFactory(ApplicationModule applicationModule, Provider<BlacklistPersistence> provider) {
        this.module = applicationModule;
        this.blacklistPersistenceProvider = provider;
    }

    public static ApplicationModule_ProvidesBlacklisterFactory create(ApplicationModule applicationModule, Provider<BlacklistPersistence> provider) {
        return new ApplicationModule_ProvidesBlacklisterFactory(applicationModule, provider);
    }

    public static Blacklister providesBlacklister(ApplicationModule applicationModule, BlacklistPersistence blacklistPersistence) {
        return (Blacklister) C9055b.m29112c(applicationModule.providesBlacklister(blacklistPersistence));
    }

    @Override // javax.inject.Provider
    public Blacklister get() {
        return providesBlacklister(this.module, this.blacklistPersistenceProvider.get());
    }
}
