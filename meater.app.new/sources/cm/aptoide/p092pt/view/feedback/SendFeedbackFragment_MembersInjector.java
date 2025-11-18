package cm.aptoide.p092pt.view.feedback;

import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class SendFeedbackFragment_MembersInjector implements InterfaceC9053a<SendFeedbackFragment> {
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;

    public SendFeedbackFragment_MembersInjector(Provider<AptoideInstalledAppsRepository> provider) {
        this.aptoideInstalledAppsRepositoryProvider = provider;
    }

    public static InterfaceC9053a<SendFeedbackFragment> create(Provider<AptoideInstalledAppsRepository> provider) {
        return new SendFeedbackFragment_MembersInjector(provider);
    }

    public static void injectAptoideInstalledAppsRepository(SendFeedbackFragment sendFeedbackFragment, AptoideInstalledAppsRepository aptoideInstalledAppsRepository) {
        sendFeedbackFragment.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository;
    }

    public void injectMembers(SendFeedbackFragment sendFeedbackFragment) {
        injectAptoideInstalledAppsRepository(sendFeedbackFragment, this.aptoideInstalledAppsRepositoryProvider.get());
    }
}
