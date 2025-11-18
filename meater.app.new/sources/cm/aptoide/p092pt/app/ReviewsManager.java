package cm.aptoide.p092pt.app;

import p456rx.Single;

/* loaded from: classes.dex */
public class ReviewsManager {
    private final ReviewsRepository reviewsRepository;

    public ReviewsManager(ReviewsRepository reviewsRepository) {
        this.reviewsRepository = reviewsRepository;
    }

    public Single<ReviewRequestResult> loadReviews(String str, String str2, int i2, String str3) {
        return this.reviewsRepository.loadReviews(str, str2, i2, str3);
    }
}
