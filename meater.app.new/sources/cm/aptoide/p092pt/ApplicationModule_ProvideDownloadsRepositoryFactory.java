package cm.aptoide.p092pt;

import cm.aptoide.p092pt.downloadmanager.DownloadPersistence;
import cm.aptoide.p092pt.downloadmanager.DownloadsRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideDownloadsRepositoryFactory implements Provider {
    private final Provider<DownloadPersistence> downloadPersistenceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideDownloadsRepositoryFactory(ApplicationModule applicationModule, Provider<DownloadPersistence> provider) {
        this.module = applicationModule;
        this.downloadPersistenceProvider = provider;
    }

    public static ApplicationModule_ProvideDownloadsRepositoryFactory create(ApplicationModule applicationModule, Provider<DownloadPersistence> provider) {
        return new ApplicationModule_ProvideDownloadsRepositoryFactory(applicationModule, provider);
    }

    public static DownloadsRepository provideDownloadsRepository(ApplicationModule applicationModule, DownloadPersistence downloadPersistence) {
        return (DownloadsRepository) C9055b.m29112c(applicationModule.provideDownloadsRepository(downloadPersistence));
    }

    @Override // javax.inject.Provider
    public DownloadsRepository get() {
        return provideDownloadsRepository(this.module, this.downloadPersistenceProvider.get());
    }
}
