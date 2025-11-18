package cm.aptoide.p092pt.notification;

import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.updates.UpdateRepository;
import javax.inject.Named;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class PullingContentService_MembersInjector implements InterfaceC9053a<PullingContentService> {
    private final Provider<DownloadFactory> downloadFactoryProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<UpdateRepository> updateRepositoryProvider;

    public PullingContentService_MembersInjector(Provider<String> provider, Provider<DownloadFactory> provider2, Provider<UpdateRepository> provider3) {
        this.marketNameProvider = provider;
        this.downloadFactoryProvider = provider2;
        this.updateRepositoryProvider = provider3;
    }

    public static InterfaceC9053a<PullingContentService> create(Provider<String> provider, Provider<DownloadFactory> provider2, Provider<UpdateRepository> provider3) {
        return new PullingContentService_MembersInjector(provider, provider2, provider3);
    }

    public static void injectDownloadFactory(PullingContentService pullingContentService, DownloadFactory downloadFactory) {
        pullingContentService.downloadFactory = downloadFactory;
    }

    @Named
    public static void injectMarketName(PullingContentService pullingContentService, String str) {
        pullingContentService.marketName = str;
    }

    public static void injectUpdateRepository(PullingContentService pullingContentService, UpdateRepository updateRepository) {
        pullingContentService.updateRepository = updateRepository;
    }

    public void injectMembers(PullingContentService pullingContentService) {
        injectMarketName(pullingContentService, this.marketNameProvider.get());
        injectDownloadFactory(pullingContentService, this.downloadFactoryProvider.get());
        injectUpdateRepository(pullingContentService, this.updateRepositoryProvider.get());
    }
}
