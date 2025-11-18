package cm.aptoide.p092pt.comments.view;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.UserFeedbackAnalytics;
import cm.aptoide.p092pt.comments.CommentDialogCallbackContract;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.PostCommentForReview;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.PostCommentForStore;
import cm.aptoide.p092pt.dataprovider.util.CommentType;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.store.StoreAnalytics;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import cm.aptoide.p092pt.view.fragment.BaseDialogFragment;
import com.google.android.material.textfield.TextInputLayout;
import com.trello.rxlifecycle.p234g.EnumC8762b;
import javax.inject.Inject;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class CommentDialogFragment extends BaseDialogFragment {
    private static final String APP_OR_STORE_NAME = "app_or_store_name";
    private static final String COMMENT_TYPE = "comment_type";
    private static final String PREVIOUS_COMMENT_ID = "previous_comment_id";
    private static final String RESOURCE_ID_AS_LONG = "resource_id_as_long";
    private static final String RESOURCE_ID_AS_STRING = "resource_id_as_string";
    private AnalyticsManager analyticsManager;
    private String appOrStoreName;
    private BodyInterceptor<BaseBody> baseBodyBodyInterceptor;
    private Button commentButton;
    private CommentDialogCallbackContract commentDialogCallbackContract;
    private CommentType commentType;
    private Converter.Factory converterFactory;
    private OkHttpClient httpClient;
    private long idAsLong;
    private String idAsString;
    private NavigationTracker navigationTracker;
    private String onEmptyTextError;
    private Long previousCommentId;
    private SharedPreferences sharedPreferences;
    private StoreAnalytics storeAnalytics;
    private TextInputLayout textInputLayout;
    private TokenInvalidator tokenInvalidator;

    @Inject
    UserFeedbackAnalytics userFeedbackAnalytics;

    /* renamed from: cm.aptoide.pt.comments.view.CommentDialogFragment$2 */
    static /* synthetic */ class C20082 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$util$CommentType;

        static {
            int[] iArr = new int[CommentType.values().length];
            $SwitchMap$cm$aptoide$pt$dataprovider$util$CommentType = iArr;
            try {
                iArr[CommentType.REVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$util$CommentType[CommentType.STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disableError() {
        this.textInputLayout.setErrorEnabled(false);
    }

    private void enableError(String str) {
        this.textInputLayout.setError(str);
    }

    private String getText() {
        TextInputLayout textInputLayout = this.textInputLayout;
        if (textInputLayout != null) {
            return textInputLayout.getEditText().getEditableText().toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7349d(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupLogic$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7350e(Void r1) {
        return C11234e.m40025S(getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupLogic$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m7351f(String str) {
        if (TextUtils.isEmpty(str)) {
            enableError(this.onEmptyTextError);
            return Boolean.FALSE;
        }
        disableError();
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupLogic$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7352g(Throwable th) {
        CrashReport.getInstance().log(th);
        ShowMessage.asSnack(this, C1146R.string.error_occured);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupLogic$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7353h(String str) {
        return submitComment(str, this.idAsLong, this.previousCommentId).m40095j0(C11250a.m40156b()).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.e
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8276f.m7352g((Throwable) obj);
            }
        }).m40110s0().m40091f(bindUntilEvent(EnumC8762b.DESTROY_VIEW));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupLogic$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7354i(BaseV7Response baseV7Response) {
        if (!baseV7Response.isOk()) {
            ShowMessage.asSnack(this, C1146R.string.error_occured);
            return;
        }
        dismiss();
        CommentDialogCallbackContract commentDialogCallbackContract = this.commentDialogCallbackContract;
        if (commentDialogCallbackContract != null) {
            commentDialogCallbackContract.okSelected(baseV7Response, this.idAsLong, this.previousCommentId, this.idAsString);
        }
    }

    private void loadArguments() {
        Bundle arguments = getArguments();
        this.appOrStoreName = arguments.getString(APP_OR_STORE_NAME, HttpUrl.FRAGMENT_ENCODE_SET);
        this.commentType = CommentType.valueOf(arguments.getString(COMMENT_TYPE));
        this.idAsString = arguments.getString(RESOURCE_ID_AS_STRING);
        this.idAsLong = arguments.getLong(RESOURCE_ID_AS_LONG);
        if (arguments.containsKey(PREVIOUS_COMMENT_ID)) {
            this.previousCommentId = Long.valueOf(arguments.getLong(PREVIOUS_COMMENT_ID));
        }
    }

    public static CommentDialogFragment newInstanceReviewReply(long j2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(COMMENT_TYPE, CommentType.REVIEW.name());
        bundle.putLong(RESOURCE_ID_AS_LONG, j2);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(APP_OR_STORE_NAME, str);
        }
        CommentDialogFragment commentDialogFragment = new CommentDialogFragment();
        commentDialogFragment.setArguments(bundle);
        return commentDialogFragment;
    }

    public static CommentDialogFragment newInstanceStoreComment(long j2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(COMMENT_TYPE, CommentType.STORE.name());
        bundle.putLong(RESOURCE_ID_AS_LONG, j2);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(APP_OR_STORE_NAME, str);
        }
        CommentDialogFragment commentDialogFragment = new CommentDialogFragment();
        commentDialogFragment.setArguments(bundle);
        return commentDialogFragment;
    }

    public static CommentDialogFragment newInstanceStoreCommentReply(long j2, long j3, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(COMMENT_TYPE, CommentType.STORE.name());
        bundle.putLong(RESOURCE_ID_AS_LONG, j2);
        bundle.putLong(PREVIOUS_COMMENT_ID, j3);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(APP_OR_STORE_NAME, str);
        }
        CommentDialogFragment commentDialogFragment = new CommentDialogFragment();
        commentDialogFragment.setArguments(bundle);
        return commentDialogFragment;
    }

    private void setupLogic() {
        this.textInputLayout.getEditText().addTextChangedListener(new TextWatcher() { // from class: cm.aptoide.pt.comments.view.CommentDialogFragment.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                if (charSequence.length() > 0) {
                    CommentDialogFragment.this.disableError();
                }
            }
        });
        C8975a.m28573a(this.commentButton).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8287f.m7350e((Void) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8284f.m7351f((String) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8266f.m7353h((String) obj);
            }
        }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8262f.m7354i((BaseV7Response) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.a
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
    }

    private C11234e<? extends BaseV7Response> submitComment(String str, long j2, Long l) {
        int i2 = C20082.$SwitchMap$cm$aptoide$pt$dataprovider$util$CommentType[this.commentType.ordinal()];
        if (i2 == 1) {
            this.userFeedbackAnalytics.sendAppReviewReplyComment();
            return PostCommentForReview.m7457of(j2, str, this.baseBodyBodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(true, true);
        }
        if (i2 != 2) {
            Logger.getInstance().m8277e(getTag(), "Unable to create reply due to missing comment type");
            return C11234e.m40016B();
        }
        if (l == null) {
            this.userFeedbackAnalytics.sendStoreCommentEvent();
            this.storeAnalytics.sendStoreInteractEvent("Write a Comment", "Home", this.appOrStoreName);
            return PostCommentForStore.m7498of(j2, str, this.baseBodyBodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(true, true);
        }
        this.userFeedbackAnalytics.sendStoreCommentReplyEvent();
        this.storeAnalytics.sendStoreInteractEvent("Reply to Comment", "Home", this.appOrStoreName);
        return PostCommentForStore.m7497of(j2, l.longValue(), str, this.baseBodyBodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(true, true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseDialogFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        this.sharedPreferences = aptoideApplication.getDefaultSharedPreferences();
        this.tokenInvalidator = aptoideApplication.getTokenInvalidator();
        this.baseBodyBodyInterceptor = aptoideApplication.getAccountSettingsBodyInterceptorPoolV7();
        this.httpClient = aptoideApplication.getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.onEmptyTextError = AptoideUtils.StringU.getResString(C1146R.string.ws_error_MARG_107, getContext().getResources());
        this.analyticsManager = aptoideApplication.getAnalyticsManager();
        this.navigationTracker = aptoideApplication.getNavigationTracker();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        loadArguments();
        View viewInflate = layoutInflater.inflate(C1146R.layout.dialog_comment_on_review, viewGroup);
        TextView textView = (TextView) viewInflate.findViewById(C1146R.id.title);
        textView.setVisibility(0);
        int i2 = C20082.$SwitchMap$cm$aptoide$pt$dataprovider$util$CommentType[this.commentType.ordinal()];
        if (i2 == 1) {
            textView.setText(getString(C1146R.string.dialog_title_comment));
        } else if (i2 == 2) {
            textView.setText(TextUtils.isEmpty(this.appOrStoreName) ? getString(C1146R.string.comment_store_title) : getString(C1146R.string.commentlist_title_comment_on_store, this.appOrStoreName));
        }
        ((Button) viewInflate.findViewById(C1146R.id.cancel_button)).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.comments.view.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8273f.m7349d(view);
            }
        });
        this.textInputLayout = (TextInputLayout) viewInflate.findViewById(C1146R.id.input_layout_title);
        this.commentButton = (Button) viewInflate.findViewById(C1146R.id.comment_button);
        setupLogic();
        this.storeAnalytics = new StoreAnalytics(this.analyticsManager, this.navigationTracker);
        return viewInflate;
    }

    public void setCommentDialogCallbackContract(CommentDialogCallbackContract commentDialogCallbackContract) {
        this.commentDialogCallbackContract = commentDialogCallbackContract;
    }
}
