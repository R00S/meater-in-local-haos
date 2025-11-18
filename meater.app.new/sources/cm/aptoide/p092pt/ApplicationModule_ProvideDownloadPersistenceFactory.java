package cm.aptoide.p092pt;

import cm.aptoide.p092pt.database.room.AptoideDatabase;
import cm.aptoide.p092pt.downloadmanager.DownloadPersistence;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideDownloadPersistenceFactory implements Provider {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideDownloadPersistenceFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        this.module = applicationModule;
        this.databaseProvider = provider;
    }

    public static ApplicationModule_ProvideDownloadPersistenceFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        return new ApplicationModule_ProvideDownloadPersistenceFactory(applicationModule, provider);
    }

    public static DownloadPersistence provideDownloadPersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase) {
        return (DownloadPersistence) C9055b.m29112c(applicationModule.provideDownloadPersistence(aptoideDatabase));
    }

    @Override // javax.inject.Provider
    public DownloadPersistence get() {
        return provideDownloadPersistence(this.module, this.databaseProvider.get());
    }
}
