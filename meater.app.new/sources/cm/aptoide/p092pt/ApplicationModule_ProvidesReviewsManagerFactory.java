package cm.aptoide.p092pt;

import cm.aptoide.p092pt.app.ReviewsManager;
import cm.aptoide.p092pt.app.ReviewsRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesReviewsManagerFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<ReviewsRepository> reviewsRepositoryProvider;

    public ApplicationModule_ProvidesReviewsManagerFactory(ApplicationModule applicationModule, Provider<ReviewsRepository> provider) {
        this.module = applicationModule;
        this.reviewsRepositoryProvider = provider;
    }

    public static ApplicationModule_ProvidesReviewsManagerFactory create(ApplicationModule applicationModule, Provider<ReviewsRepository> provider) {
        return new ApplicationModule_ProvidesReviewsManagerFactory(applicationModule, provider);
    }

    public static ReviewsManager providesReviewsManager(ApplicationModule applicationModule, ReviewsRepository reviewsRepository) {
        return (ReviewsManager) C9055b.m29112c(applicationModule.providesReviewsManager(reviewsRepository));
    }

    @Override // javax.inject.Provider
    public ReviewsManager get() {
        return providesReviewsManager(this.module, this.reviewsRepositoryProvider.get());
    }
}
