package cm.aptoide.p092pt.app;

import p456rx.Single;

/* loaded from: classes.dex */
public class ReviewsRepository {
    private final ReviewsService reviewsService;

    public ReviewsRepository(ReviewsService reviewsService) {
        this.reviewsService = reviewsService;
    }

    public Single<ReviewRequestResult> loadReviews(String str, String str2, int i2, String str3) {
        return this.reviewsService.loadReviews(str, str2, i2, str3);
    }
}
