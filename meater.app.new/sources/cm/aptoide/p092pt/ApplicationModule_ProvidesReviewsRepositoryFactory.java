package cm.aptoide.p092pt;

import cm.aptoide.p092pt.app.ReviewsRepository;
import cm.aptoide.p092pt.app.ReviewsService;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesReviewsRepositoryFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<ReviewsService> reviewsServiceProvider;

    public ApplicationModule_ProvidesReviewsRepositoryFactory(ApplicationModule applicationModule, Provider<ReviewsService> provider) {
        this.module = applicationModule;
        this.reviewsServiceProvider = provider;
    }

    public static ApplicationModule_ProvidesReviewsRepositoryFactory create(ApplicationModule applicationModule, Provider<ReviewsService> provider) {
        return new ApplicationModule_ProvidesReviewsRepositoryFactory(applicationModule, provider);
    }

    public static ReviewsRepository providesReviewsRepository(ApplicationModule applicationModule, ReviewsService reviewsService) {
        return (ReviewsRepository) C9055b.m29112c(applicationModule.providesReviewsRepository(reviewsService));
    }

    @Override // javax.inject.Provider
    public ReviewsRepository get() {
        return providesReviewsRepository(this.module, this.reviewsServiceProvider.get());
    }
}
