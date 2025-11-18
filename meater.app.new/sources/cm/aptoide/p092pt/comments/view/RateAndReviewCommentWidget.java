package cm.aptoide.p092pt.comments.view;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.fragment.app.ActivityC0468d;
import androidx.fragment.app.FragmentManager;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.comments.CommentAdder;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener;
import cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListComments;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Review;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ListCommentsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.SetReviewRatingRequest;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import com.trello.rxlifecycle.p234g.EnumC8762b;
import java.util.Iterator;
import java.util.List;
import okhttp3.OkHttpClient;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class RateAndReviewCommentWidget extends Widget<RateAndReviewCommentDisplayable> {
    private static final int FULL_COMMENTS_LIMIT = 3;
    private static final String TAG = "RateAndReviewCommentWidget";
    private AptoideAccountManager accountManager;
    private AccountNavigator accountNavigator;
    private BodyInterceptor<BaseBody> bodyInterceptor;
    private Converter.Factory converterFactory;
    private ImageView helpfulButton;
    private OkHttpClient httpClient;
    private boolean isCommentsCollapsed;
    private ImageView notHelpfulButton;
    private AppCompatRatingBar ratingBar;
    private TextView reply;
    private TextView reviewDate;
    private TextView reviewText;
    private TextView reviewTitle;
    private TextView showHideReplies;
    private TokenInvalidator tokenInvalidator;
    private ImageView userImage;
    private TextView username;

    public RateAndReviewCommentWidget(View view) {
        super(view);
        this.isCommentsCollapsed = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7366a(CommentAdder commentAdder, long j2, EnumC8762b enumC8762b) {
        ManagerPreferences.setForceServerRefreshFlag(true, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences());
        commentAdder.collapseComments();
        loadCommentsForThisReview(j2, 3, commentAdder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7367b(Review review, Void r3) {
        setReviewRating(review.getId(), false);
    }

    static /* synthetic */ void lambda$bindView$12(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7368c(Review review, RateAndReviewCommentDisplayable rateAndReviewCommentDisplayable, Void r6) {
        if (this.isCommentsCollapsed) {
            loadCommentsForThisReview(review.getId(), 3, rateAndReviewCommentDisplayable.getCommentAdder());
            this.showHideReplies.setCompoundDrawablesWithIntrinsicBounds(0, 0, C1146R.drawable.ic_up_arrow, 0);
            this.isCommentsCollapsed = false;
        } else {
            rateAndReviewCommentDisplayable.getCommentAdder().collapseComments();
            this.showHideReplies.setCompoundDrawablesWithIntrinsicBounds(0, 0, C1146R.drawable.ic_down_arrow, 0);
            this.isCommentsCollapsed = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7369d(View view) {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.REPLY_REVIEW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7370e(ActivityC0468d activityC0468d, Review review, String str, final CommentAdder commentAdder, final long j2, Void r9) {
        if (!this.accountManager.isLoggedIn()) {
            return ShowMessage.asObservableSnack(this.ratingBar, C1146R.string.you_need_to_be_logged_in, C1146R.string.login, new View.OnClickListener() { // from class: cm.aptoide.pt.comments.view.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8288f.m7369d(view);
                }
            }).m39968M();
        }
        FragmentManager supportFragmentManager = activityC0468d.getSupportFragmentManager();
        CommentDialogFragment commentDialogFragmentNewInstanceReviewReply = CommentDialogFragment.newInstanceReviewReply(review.getId(), str);
        commentDialogFragmentNewInstanceReviewReply.show(supportFragmentManager, "fragment_comment_dialog");
        return commentDialogFragmentNewInstanceReviewReply.lifecycle().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.q0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((EnumC8762b) obj).equals(EnumC8762b.DESTROY_VIEW));
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.t0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8343f.m7366a(commentAdder, j2, (EnumC8762b) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.r0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return C11234e.m40016B();
            }
        });
    }

    static /* synthetic */ void lambda$bindView$5(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7371f(Review review, Void r3) {
        setReviewRating(review.getId(), true);
    }

    static /* synthetic */ void lambda$bindView$9(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadCommentsForThisReview$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7372g(CommentAdder commentAdder, ListComments listComments) {
        if (listComments.isOk()) {
            commentAdder.addComment(listComments.getDataList().getList());
        } else {
            Logger.getInstance().m8277e(TAG, "error loading comments");
            ShowMessage.asSnack(this.helpfulButton, C1146R.string.unknown_error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadCommentsForThisReview$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7373h(Throwable th) {
        Logger.getInstance().m8279e(TAG, th);
        ShowMessage.asSnack(this.helpfulButton, C1146R.string.unknown_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setReviewRating$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7374i(long j2, boolean z, BaseV7Response baseV7Response) {
        if (baseV7Response == null) {
            Logger.getInstance().m8277e(TAG, "empty response");
            return;
        }
        if (baseV7Response.getError() != null) {
            Logger.getInstance().m8277e(TAG, baseV7Response.getError().getDescription());
            return;
        }
        List<BaseV7Response.Error> errors = baseV7Response.getErrors();
        if (errors != null && !errors.isEmpty()) {
            Iterator<BaseV7Response.Error> it = errors.iterator();
            while (it.hasNext()) {
                Logger.getInstance().m8277e(TAG, it.next().getDescription());
            }
            return;
        }
        Logger logger = Logger.getInstance();
        String str = TAG;
        Object[] objArr = new Object[2];
        objArr[0] = Long.valueOf(j2);
        objArr[1] = z ? "positive" : "negative";
        logger.m8273d(str, String.format("review %d was marked as %s", objArr));
        setHelpButtonsClickable(true);
        ShowMessage.asSnack(this.helpfulButton, C1146R.string.thank_you_for_your_opinion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setReviewRating$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7375j(Throwable th) {
        ShowMessage.asSnack(this.helpfulButton, C1146R.string.unknown_error);
        Logger.getInstance().m8279e(TAG, th);
        setHelpButtonsClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setReviewRating$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7376k(View view) {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.REVIEW_FEEDBACK);
    }

    private void loadCommentsForThisReview(long j2, int i2, final CommentAdder commentAdder) {
        ListCommentsRequest.m7449of(j2, i2, true, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences()).execute(new SuccessRequestListener() { // from class: cm.aptoide.pt.comments.view.l0
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener, p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8315f.m7372g(commentAdder, (ListComments) obj);
            }
        }, new ErrorRequestListener() { // from class: cm.aptoide.pt.comments.view.n0
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener
            public final void onError(Throwable th) {
                this.f8325a.m7373h(th);
            }
        }, true);
    }

    private void setHelpButtonsClickable(boolean z) {
        this.notHelpfulButton.setClickable(z);
        this.helpfulButton.setClickable(z);
    }

    private void setReviewRating(final long j2, final boolean z) {
        setHelpButtonsClickable(false);
        if (this.accountManager.isLoggedIn()) {
            SetReviewRatingRequest.m7460of(j2, z, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences()).execute(new SuccessRequestListener() { // from class: cm.aptoide.pt.comments.view.o0
                @Override // cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener, p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f8328f.m7374i(j2, z, (BaseV7Response) obj);
                }
            }, new ErrorRequestListener() { // from class: cm.aptoide.pt.comments.view.s0
                @Override // cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener
                public final void onError(Throwable th) {
                    this.f8341a.m7375j(th);
                }
            }, true);
        } else {
            ShowMessage.asSnack(getContext(), C1146R.string.you_need_to_be_logged_in, C1146R.string.login, new View.OnClickListener() { // from class: cm.aptoide.pt.comments.view.j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8306f.m7376k(view);
                }
            }, -1);
            setHelpButtonsClickable(true);
        }
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.reply = (TextView) view.findViewById(C1146R.id.write_reply_btn);
        this.showHideReplies = (TextView) view.findViewById(C1146R.id.show_replies_btn);
        this.ratingBar = (AppCompatRatingBar) view.findViewById(C1146R.id.rating_bar);
        this.reviewTitle = (TextView) view.findViewById(C1146R.id.comment_title);
        this.reviewDate = (TextView) view.findViewById(C1146R.id.added_date);
        this.reviewText = (TextView) view.findViewById(C1146R.id.comment);
        this.userImage = (ImageView) view.findViewById(C1146R.id.user_icon);
        this.username = (TextView) view.findViewById(C1146R.id.user_name);
        this.helpfulButton = (ImageView) view.findViewById(C1146R.id.helpful_button);
        this.notHelpfulButton = (ImageView) view.findViewById(C1146R.id.not_helpful_button);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(final RateAndReviewCommentDisplayable rateAndReviewCommentDisplayable, int i2) {
        final Review review = rateAndReviewCommentDisplayable.getPojo().getReview();
        final String appName = rateAndReviewCommentDisplayable.getPojo().getAppName();
        this.tokenInvalidator = ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator();
        this.httpClient = ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.bodyInterceptor = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        this.accountNavigator = ((ActivityResultNavigator) getContext()).getAccountNavigator();
        final ActivityC0468d context = getContext();
        ImageLoader.with(context).loadWithCircleTransformAndPlaceHolderAvatarSize(review.getUser().getAvatar(), this.userImage, C1146R.drawable.layer_1);
        this.username.setText(review.getUser().getName());
        this.ratingBar.setRating(review.getStats().getRating());
        this.reviewTitle.setText(review.getTitle());
        this.reviewText.setText(review.getBody());
        this.reviewDate.setText(AptoideUtils.DateTimeU.getInstance(getContext()).getTimeDiffString(context, review.getAdded().getTime(), getContext().getResources()));
        final CommentAdder commentAdder = rateAndReviewCommentDisplayable.getCommentAdder();
        final long id = review.getId();
        this.compositeSubscription.m40667a(C8975a.m28573a(this.reply).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.e0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8277f.m7370e(context, review, appName, commentAdder, id, (Void) obj);
            }
        }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.h0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                RateAndReviewCommentWidget.lambda$bindView$5(obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.u0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }));
        this.compositeSubscription.m40667a(C8975a.m28573a(this.helpfulButton).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.p0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8332f.m7371f(review, (Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.f0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                rateAndReviewCommentDisplayable.sendVoteUpEvent();
            }
        }).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.v0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                RateAndReviewCommentWidget.lambda$bindView$9((Void) obj);
            }
        }));
        this.compositeSubscription.m40667a(C8975a.m28573a(this.notHelpfulButton).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.k0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8311f.m7367b(review, (Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.m0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                rateAndReviewCommentDisplayable.sendVoteDownEvent();
            }
        }).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.i0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                RateAndReviewCommentWidget.lambda$bindView$12((Void) obj);
            }
        }));
        this.compositeSubscription.m40667a(C8975a.m28573a(this.showHideReplies).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.w0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8353f.m7368c(review, rateAndReviewCommentDisplayable, (Void) obj);
            }
        }));
        Resources.Theme theme = context.getTheme();
        Resources resources = context.getResources();
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        theme.resolveAttribute(C1146R.attr.widgetBackgroundColorPrimary, typedValue, true);
        theme.resolveAttribute(C1146R.attr.widgetBackgroundColorSecondary, typedValue2, true);
        int i3 = getItemId() % 2 == 0 ? typedValue.resourceId : typedValue2.resourceId;
        if (Build.VERSION.SDK_INT >= 23) {
            this.itemView.setBackgroundColor(resources.getColor(i3, theme));
        } else {
            this.itemView.setBackgroundColor(resources.getColor(i3));
        }
        int numberComments = rateAndReviewCommentDisplayable.getNumberComments();
        if (numberComments <= 0) {
            this.showHideReplies.setVisibility(8);
        } else {
            this.showHideReplies.setVisibility(0);
            this.showHideReplies.setText(AptoideUtils.StringU.getFormattedString(C1146R.string.reviews_expand_button, getContext().getResources(), Integer.valueOf(numberComments)));
        }
    }
}
