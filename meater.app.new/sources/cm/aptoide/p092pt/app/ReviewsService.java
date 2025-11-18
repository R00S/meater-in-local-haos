package cm.aptoide.p092pt.app;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.app.ReviewRequestResult;
import cm.aptoide.p092pt.dataprovider.exception.NoNetworkConnectionException;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListReviews;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Review;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ListReviewsRequest;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class ReviewsService {
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private boolean loading;
    private final SharedPreferences sharedPreferences;
    private final StoreCredentialsProvider storeCredentialsProvider;
    private final TokenInvalidator tokenInvalidator;

    public ReviewsService(StoreCredentialsProvider storeCredentialsProvider, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        this.storeCredentialsProvider = storeCredentialsProvider;
        this.bodyInterceptor = bodyInterceptor;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator;
        this.sharedPreferences = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createReviewRequestResultError, reason: merged with bridge method [inline-methods] */
    public ReviewRequestResult m7059e(Throwable th) {
        return th instanceof NoNetworkConnectionException ? new ReviewRequestResult(ReviewRequestResult.Error.NETWORK) : new ReviewRequestResult(ReviewRequestResult.Error.GENERIC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadReviews$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7055a() {
        this.loading = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadReviews$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7056b() {
        this.loading = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadReviews$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7057c() {
        this.loading = false;
    }

    private List<AppReview> map(List<Review> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Review review : list) {
                Review.Stats stats = review.getStats();
                Review.User user = review.getUser();
                arrayList.add(new AppReview(review.getId(), review.getTitle(), review.getBody(), review.getAdded(), review.getModified(), new ReviewStats(stats.getComments(), stats.getLikes(), stats.getPoints(), stats.getRating()), new ReviewComment(review.getComments().getView(), review.getComments().getTotal()), new ReviewUser(user.getId(), user.getAvatar(), user.getName())));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mapListReviews, reason: merged with bridge method [inline-methods] */
    public C11234e<ReviewRequestResult> m7058d(ListReviews listReviews) {
        return listReviews.isOk() ? C11234e.m40025S(new ReviewRequestResult(map(listReviews.getDataList().getList()))) : C11234e.m40017C(new IllegalStateException("Could not obtain request from server."));
    }

    public Single<ReviewRequestResult> loadReviews(String str, String str2, int i2, String str3) {
        return this.loading ? Single.m39913m(new ReviewRequestResult(true)) : ListReviewsRequest.ofTopReviews(str, str2, i2, this.storeCredentialsProvider.get(str), this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, str3).observe().m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.app.v0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7657f.m7055a();
            }
        }).m40051A(new InterfaceC11252a() { // from class: cm.aptoide.pt.app.t0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7652f.m7056b();
            }
        }).m40123z(new InterfaceC11252a() { // from class: cm.aptoide.pt.app.r0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7643f.m7057c();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.s0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7645f.m7058d((ListReviews) obj);
            }
        }).m40085Z0().m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.u0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7654f.m7059e((Throwable) obj);
            }
        });
    }
}
