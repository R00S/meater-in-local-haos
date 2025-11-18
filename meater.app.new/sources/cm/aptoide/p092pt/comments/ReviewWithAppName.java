package cm.aptoide.p092pt.comments;

import cm.aptoide.p092pt.dataprovider.model.p096v7.Review;

/* loaded from: classes.dex */
public final class ReviewWithAppName {
    private final String appName;
    private final Review review;

    public ReviewWithAppName(String str, Review review) {
        this.appName = str;
        this.review = review;
    }

    public String getAppName() {
        return this.appName;
    }

    public Review getReview() {
        return this.review;
    }
}
