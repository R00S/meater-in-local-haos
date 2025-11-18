package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.account.AgentPersistence;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAgentPersistenceFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> secureSharedPreferencesProvider;

    public ApplicationModule_ProvidesAgentPersistenceFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.secureSharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvidesAgentPersistenceFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvidesAgentPersistenceFactory(applicationModule, provider);
    }

    public static AgentPersistence providesAgentPersistence(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        return (AgentPersistence) C9055b.m29112c(applicationModule.providesAgentPersistence(sharedPreferences));
    }

    @Override // javax.inject.Provider
    public AgentPersistence get() {
        return providesAgentPersistence(this.module, this.secureSharedPreferencesProvider.get());
    }
}
