package cm.aptoide.p092pt.comments;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.UserFeedbackAnalytics;
import cm.aptoide.p092pt.comments.view.CommentsAdapter;
import cm.aptoide.p092pt.comments.view.ConcreteItemCommentAdder;
import cm.aptoide.p092pt.comments.view.RateAndReviewCommentDisplayable;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListComments;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListReviews;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Review;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ListCommentsRequest;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtils;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import com.trello.rxlifecycle.p234g.EnumC8762b;
import java.util.LinkedList;
import java.util.List;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class ListFullReviewsSuccessRequestListener implements SuccessRequestListener<ListReviews> {
    private final BodyInterceptor<BaseBody> bodyBodyInterceptor;
    private final Converter.Factory converterFactory;
    private final RateAndReviewsFragment fragment;
    private final OkHttpClient httpClient;
    private final SharedPreferences sharedPreferences;
    private final StoreCredentialsProvider storeCredentialsProvider;
    private final TokenInvalidator tokenInvalidator;
    private final UserFeedbackAnalytics userFeedbackAnalytics;

    public ListFullReviewsSuccessRequestListener(RateAndReviewsFragment rateAndReviewsFragment, StoreCredentialsProvider storeCredentialsProvider, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, UserFeedbackAnalytics userFeedbackAnalytics) {
        this.fragment = rateAndReviewsFragment;
        this.httpClient = okHttpClient;
        this.storeCredentialsProvider = storeCredentialsProvider;
        this.bodyBodyInterceptor = bodyInterceptor;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator;
        this.sharedPreferences = sharedPreferences;
        this.userFeedbackAnalytics = userFeedbackAnalytics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void addRateAndReviewDisplayables(List<Review> list, List<Displayable> list2) {
        int i2 = -1;
        int i3 = 0;
        for (Review review : list) {
            list2.add(new RateAndReviewCommentDisplayable(new ReviewWithAppName(this.fragment.getAppName(), review), new ConcreteItemCommentAdder(i3, this.fragment, review), review.getCommentList().getTotal(), this.userFeedbackAnalytics));
            if (review.getId() == this.fragment.getReviewId()) {
                i2 = i3;
            }
            if (review.getCommentList() != null && review.getCommentList().getDataList() != null && review.getCommentList().getDataList().getLimit() != null) {
                this.fragment.createDisplayableComments(review.getCommentList().getDataList().getList(), list2);
                if (review.getCommentList().getDataList().getList().size() > 2) {
                    list2.add(this.fragment.createReadMoreDisplayable(i3, review));
                }
            }
            i3++;
        }
        int i4 = ((CommentsAdapter) this.fragment.getAdapter()).getItemCount() != 0 ? i2 : 0;
        this.fragment.checkAndRemoveProgressBarDisplayable();
        this.fragment.addDisplayables(list2);
        if (i4 >= 0) {
            this.fragment.getLayoutManager().scrollToPosition(((CommentsAdapter) this.fragment.getAdapter()).getItemPosition(i4));
        }
    }

    static /* synthetic */ Review lambda$call$0(Review review, ListComments listComments) {
        review.setCommentList(listComments);
        return review;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$call$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7347a(final Review review) {
        return ListCommentsRequest.m7450of(review.getComments().getView(), review.getId(), 3, StoreUtils.getStoreCredentials(this.fragment.getStoreName(), this.storeCredentialsProvider), true, this.bodyBodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe().m40065I0(Schedulers.m40658io()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Review review2 = review;
                ListFullReviewsSuccessRequestListener.lambda$call$0(review2, (ListComments) obj);
                return review2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$call$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7348b(List list, List list2, List list3) {
        addRateAndReviewDisplayables(list, list2);
    }

    @Override // cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener, p456rx.p460m.InterfaceC11253b
    public void call(ListReviews listReviews) {
        final List<Review> list = listReviews.getDataList().getList();
        final LinkedList linkedList = new LinkedList();
        C11234e.m40020N(list).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8255f.m7347a((Review) obj);
            }
        }).m40084Y0().m40095j0(C11250a.m40156b()).m40091f(this.fragment.bindUntilEvent(EnumC8762b.DESTROY_VIEW)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8252f.m7348b(list, linkedList, (List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.a
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
    }
}
