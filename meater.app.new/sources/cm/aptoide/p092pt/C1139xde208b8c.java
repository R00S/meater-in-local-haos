package cm.aptoide.p092pt;

import cm.aptoide.p092pt.database.room.AptoideDatabase;
import cm.aptoide.p092pt.home.AppComingSoonRegistrationPersistence;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppComingSoonRegistrationPersistenceFactory */
/* loaded from: classes.dex */
public final class C1139xde208b8c implements Provider {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;

    public C1139xde208b8c(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        this.module = applicationModule;
        this.databaseProvider = provider;
    }

    public static C1139xde208b8c create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        return new C1139xde208b8c(applicationModule, provider);
    }

    public static AppComingSoonRegistrationPersistence providesAppComingSoonRegistrationPersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase) {
        return (AppComingSoonRegistrationPersistence) C9055b.m29112c(applicationModule.providesAppComingSoonRegistrationPersistence(aptoideDatabase));
    }

    @Override // javax.inject.Provider
    public AppComingSoonRegistrationPersistence get() {
        return providesAppComingSoonRegistrationPersistence(this.module, this.databaseProvider.get());
    }
}
