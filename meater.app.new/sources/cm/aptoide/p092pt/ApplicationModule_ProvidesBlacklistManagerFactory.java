package cm.aptoide.p092pt;

import cm.aptoide.p092pt.blacklist.BlacklistManager;
import cm.aptoide.p092pt.blacklist.BlacklistUnitMapper;
import cm.aptoide.p092pt.blacklist.Blacklister;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesBlacklistManagerFactory implements Provider {
    private final Provider<BlacklistUnitMapper> blacklistUnitMapperProvider;
    private final Provider<Blacklister> blacklisterProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesBlacklistManagerFactory(ApplicationModule applicationModule, Provider<Blacklister> provider, Provider<BlacklistUnitMapper> provider2) {
        this.module = applicationModule;
        this.blacklisterProvider = provider;
        this.blacklistUnitMapperProvider = provider2;
    }

    public static ApplicationModule_ProvidesBlacklistManagerFactory create(ApplicationModule applicationModule, Provider<Blacklister> provider, Provider<BlacklistUnitMapper> provider2) {
        return new ApplicationModule_ProvidesBlacklistManagerFactory(applicationModule, provider, provider2);
    }

    public static BlacklistManager providesBlacklistManager(ApplicationModule applicationModule, Blacklister blacklister, BlacklistUnitMapper blacklistUnitMapper) {
        return (BlacklistManager) C9055b.m29112c(applicationModule.providesBlacklistManager(blacklister, blacklistUnitMapper));
    }

    @Override // javax.inject.Provider
    public BlacklistManager get() {
        return providesBlacklistManager(this.module, this.blacklisterProvider.get(), this.blacklistUnitMapperProvider.get());
    }
}
