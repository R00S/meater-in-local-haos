package cm.aptoide.p092pt.app;

import java.util.Date;

/* loaded from: classes.dex */
public class AppReview {
    private final Date added;
    private final String body;

    /* renamed from: id */
    private final long f7567id;
    private final Date modified;
    private final ReviewComment reviewComment;
    private final ReviewStats reviewStats;
    private final ReviewUser reviewUser;
    private final String title;

    public AppReview(long j2, String str, String str2, Date date, Date date2, ReviewStats reviewStats, ReviewComment reviewComment, ReviewUser reviewUser) {
        this.f7567id = j2;
        this.title = str;
        this.body = str2;
        this.added = date;
        this.modified = date2;
        this.reviewStats = reviewStats;
        this.reviewComment = reviewComment;
        this.reviewUser = reviewUser;
    }

    public Date getAdded() {
        return this.added;
    }

    public String getBody() {
        return this.body;
    }

    public long getId() {
        return this.f7567id;
    }

    public Date getModified() {
        return this.modified;
    }

    public ReviewComment getReviewComment() {
        return this.reviewComment;
    }

    public ReviewStats getReviewStats() {
        return this.reviewStats;
    }

    public ReviewUser getReviewUser() {
        return this.reviewUser;
    }

    public String getTitle() {
        return this.title;
    }
}
