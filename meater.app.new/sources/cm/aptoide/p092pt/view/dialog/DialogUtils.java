package cm.aptoide.p092pt.view.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.text.SpannableString;
import android.text.style.BulletSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.UserFeedbackAnalytics;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener;
import cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.PostReviewRequest;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.util.MarketResourceFormatter;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import okhttp3.OkHttpClient;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p474t.C11429e;
import retrofit2.Converter;

@Deprecated
/* loaded from: classes.dex */
public class DialogUtils {
    private static final String TAG = "DialogUtils";
    private final Locale LOCALE = Locale.getDefault();
    private final AptoideAccountManager accountManager;
    private final AccountNavigator accountNavigator;
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private final MarketResourceFormatter marketResourceFormatter;
    private final SharedPreferences sharedPreferences;
    private final ThemeManager themeManager;
    private final TokenInvalidator tokenInvalidator;
    private final UserFeedbackAnalytics userFeedbackAnalytics;

    public DialogUtils(AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, MarketResourceFormatter marketResourceFormatter, ThemeManager themeManager, UserFeedbackAnalytics userFeedbackAnalytics) {
        this.accountManager = aptoideAccountManager;
        this.accountNavigator = accountNavigator;
        this.bodyInterceptor = bodyInterceptor;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository;
        this.tokenInvalidator = tokenInvalidator;
        this.sharedPreferences = sharedPreferences;
        this.marketResourceFormatter = marketResourceFormatter;
        this.themeManager = themeManager;
        this.userFeedbackAnalytics = userFeedbackAnalytics;
    }

    private boolean isAppInstalled(String str) {
        return this.aptoideInstalledAppsRepository.contains(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showRateDialog$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8976a(View view) {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.RATE_DIALOG);
    }

    static /* synthetic */ void lambda$showRateDialog$1(AlertDialog alertDialog) {
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showRateDialog$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8977b(Activity activity, InterfaceC11252a interfaceC11252a, BaseV7Response baseV7Response) {
        if (!baseV7Response.isOk()) {
            ShowMessage.asSnack(activity, C1146R.string.error_occured);
            return;
        }
        Logger.getInstance().m8273d(TAG, "review added");
        ShowMessage.asSnack(activity, C1146R.string.review_success);
        ManagerPreferences.setForceServerRefreshFlag(true, this.sharedPreferences);
        if (interfaceC11252a != null) {
            interfaceC11252a.call();
        }
    }

    static /* synthetic */ void lambda$showRateDialog$11(Activity activity, Throwable th) {
        CrashReport.getInstance().log(th);
        ShowMessage.asSnack(activity, C1146R.string.error_occured);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showRateDialog$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8978c(final Activity activity, TextInputLayout textInputLayout, AppCompatRatingBar appCompatRatingBar, AlertDialog alertDialog, final InterfaceC11252a interfaceC11252a, String str, String str2, View view) {
        AptoideUtils.SystemU.hideKeyboard(activity);
        String string = textInputLayout.getEditText().getText().toString();
        int iRound = Math.round(appCompatRatingBar.getRating());
        alertDialog.dismiss();
        SuccessRequestListener successRequestListener = new SuccessRequestListener() { // from class: cm.aptoide.pt.view.dialog.e
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener, p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11793f.m8977b(activity, interfaceC11252a, (BaseV7Response) obj);
            }
        };
        ErrorRequestListener errorRequestListener = new ErrorRequestListener() { // from class: cm.aptoide.pt.view.dialog.h
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener
            public final void onError(Throwable th) {
                DialogUtils.lambda$showRateDialog$11(activity, th);
            }
        };
        if (str != null) {
            PostReviewRequest.m7459of(str, str2, string, Integer.valueOf(iRound), this.bodyInterceptor, this.httpClient, this.converterFactory, isAppInstalled(str2), this.tokenInvalidator, this.sharedPreferences).execute(successRequestListener, errorRequestListener);
        } else {
            PostReviewRequest.m7458of(str2, string, Integer.valueOf(iRound), this.bodyInterceptor, this.httpClient, this.converterFactory, isAppInstalled(str2), this.tokenInvalidator, this.sharedPreferences).execute(successRequestListener, errorRequestListener);
        }
    }

    static /* synthetic */ void lambda$showRateDialog$2(AbstractC11245j abstractC11245j, View view) {
        abstractC11245j.onNext(GenericDialogs.EResponse.CANCEL);
        abstractC11245j.onCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showRateDialog$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8979d(Activity activity, AbstractC11245j abstractC11245j, BaseV7Response baseV7Response) {
        if (!baseV7Response.isOk()) {
            ShowMessage.asSnack(activity, C1146R.string.error_occured);
            abstractC11245j.onNext(GenericDialogs.EResponse.CANCEL);
            abstractC11245j.onCompleted();
        } else {
            Logger.getInstance().m8273d(TAG, "review added");
            ShowMessage.asSnack(activity, C1146R.string.review_success);
            ManagerPreferences.setForceServerRefreshFlag(true, this.sharedPreferences);
            abstractC11245j.onNext(GenericDialogs.EResponse.YES);
            abstractC11245j.onCompleted();
        }
    }

    static /* synthetic */ void lambda$showRateDialog$5(Activity activity, AbstractC11245j abstractC11245j, Throwable th) {
        CrashReport.getInstance().log(th);
        ShowMessage.asSnack(activity, C1146R.string.error_occured);
        abstractC11245j.onNext(GenericDialogs.EResponse.CANCEL);
        abstractC11245j.onCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showRateDialog$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8980e(final Activity activity, TextInputLayout textInputLayout, AppCompatRatingBar appCompatRatingBar, View view, AlertDialog alertDialog, final AbstractC11245j abstractC11245j, String str, String str2, View view2) {
        AptoideUtils.SystemU.hideKeyboard(activity);
        String string = textInputLayout.getEditText().getText().toString();
        int iRound = Math.round(appCompatRatingBar.getRating());
        if (iRound == 0) {
            ((TextView) view.findViewById(C1146R.id.tap_to_rate)).setTextColor(activity.getResources().getColor(C1146R.color.red));
            ShowMessage.asSnack(activity, "Please choose a rating");
            return;
        }
        alertDialog.dismiss();
        this.userFeedbackAnalytics.sendSubmitAppRateEvent(!string.isEmpty());
        SuccessRequestListener successRequestListener = new SuccessRequestListener() { // from class: cm.aptoide.pt.view.dialog.d
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener, p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11790f.m8979d(activity, abstractC11245j, (BaseV7Response) obj);
            }
        };
        ErrorRequestListener errorRequestListener = new ErrorRequestListener() { // from class: cm.aptoide.pt.view.dialog.b
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener
            public final void onError(Throwable th) {
                DialogUtils.lambda$showRateDialog$5(activity, abstractC11245j, th);
            }
        };
        if (str != null) {
            PostReviewRequest.m7459of(str, str2, string, Integer.valueOf(iRound), this.bodyInterceptor, this.httpClient, this.converterFactory, isAppInstalled(str2), this.tokenInvalidator, this.sharedPreferences).execute(successRequestListener, errorRequestListener);
        } else {
            PostReviewRequest.m7458of(str2, string, Integer.valueOf(iRound), this.bodyInterceptor, this.httpClient, this.converterFactory, isAppInstalled(str2), this.tokenInvalidator, this.sharedPreferences).execute(successRequestListener, errorRequestListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showRateDialog$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8981f(final Activity activity, String str, final String str2, final String str3, final AbstractC11245j abstractC11245j) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId);
        if (!this.accountManager.isLoggedIn()) {
            ShowMessage.asSnack(activity, C1146R.string.you_need_to_be_logged_in, C1146R.string.login, new View.OnClickListener() { // from class: cm.aptoide.pt.view.dialog.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11807f.m8976a(view);
                }
            }, -1);
            abstractC11245j.onNext(GenericDialogs.EResponse.CANCEL);
            abstractC11245j.onCompleted();
            return;
        }
        final View viewInflate = LayoutInflater.from(contextThemeWrapper).inflate(C1146R.layout.dialog_rate_app, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(C1146R.id.title);
        final AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) viewInflate.findViewById(C1146R.id.rating_bar);
        final TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(C1146R.id.input_layout_review);
        Button button = (Button) viewInflate.findViewById(C1146R.id.cancel_button);
        Button button2 = (Button) viewInflate.findViewById(C1146R.id.rate_button);
        TextView textView2 = (TextView) viewInflate.findViewById(C1146R.id.highlighted_reviews_explanation_1);
        TextView textView3 = (TextView) viewInflate.findViewById(C1146R.id.highlighted_reviews_explanation_2);
        TextView textView4 = (TextView) viewInflate.findViewById(C1146R.id.highlighted_reviews_explanation_3);
        TextView textView5 = (TextView) viewInflate.findViewById(C1146R.id.highlighted_reviews_explanation_4);
        textView.setText(String.format(this.LOCALE, activity.getString(C1146R.string.rate_app), str));
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(contextThemeWrapper).setView(viewInflate).create();
        abstractC11245j.add(C11429e.m40674a(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.dialog.n
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                DialogUtils.lambda$showRateDialog$1(alertDialogCreate);
            }
        }));
        button.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.view.dialog.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogUtils.lambda$showRateDialog$2(abstractC11245j, view);
            }
        });
        appCompatRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: cm.aptoide.pt.view.dialog.k
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(RatingBar ratingBar, float f2, boolean z) {
                ((TextView) viewInflate.findViewById(C1146R.id.tap_to_rate)).setTextColor(activity.getResources().getColor(C1146R.color.grey_fog_dark));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.view.dialog.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11810f.m8980e(activity, textInputLayout, appCompatRatingBar, viewInflate, alertDialogCreate, abstractC11245j, str2, str3, view);
            }
        });
        textView2.setText(activity.getResources().getString(C1146R.string.reviewappview_highlighted_reviews_explanation_1));
        setBulletText(textView3, activity.getResources().getString(C1146R.string.reviewappview_highlighted_reviews_explanation_2));
        setBulletText(textView4, activity.getResources().getString(C1146R.string.reviewappview_highlighted_reviews_explanation_3));
        setBulletText(textView5, this.marketResourceFormatter.formatString(viewInflate.getContext(), C1146R.string.reviewappview_highlighted_reviews_explanation_4, new String[0]));
        alertDialogCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showRateDialog$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8982g(View view) {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.RATE_DIALOG);
    }

    public void setBulletText(TextView textView, String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new BulletSpan(16, this.themeManager.getAttributeForTheme(C1146R.attr.colorPrimaryDark).data), 0, str.length(), 0);
        textView.setText(spannableString);
    }

    public C11234e<GenericDialogs.EResponse> showRateDialog(final Activity activity, final String str, final String str2, final String str3) {
        return C11234e.m40048l(new C11234e.a() { // from class: cm.aptoide.pt.view.dialog.m
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11819f.m8981f(activity, str, str3, str2, (AbstractC11245j) obj);
            }
        });
    }

    public void showRateDialog(final Activity activity, String str, final String str2, final String str3, final InterfaceC11252a interfaceC11252a) {
        if (!this.accountManager.isLoggedIn()) {
            ShowMessage.asSnack(activity, C1146R.string.you_need_to_be_logged_in, C1146R.string.login, new View.OnClickListener() { // from class: cm.aptoide.pt.view.dialog.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11789f.m8982g(view);
                }
            }, -1);
            return;
        }
        View viewInflate = LayoutInflater.from(activity).inflate(C1146R.layout.dialog_rate_app, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(C1146R.id.title);
        final AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) viewInflate.findViewById(C1146R.id.rating_bar);
        final TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(C1146R.id.input_layout_review);
        Button button = (Button) viewInflate.findViewById(C1146R.id.cancel_button);
        Button button2 = (Button) viewInflate.findViewById(C1146R.id.rate_button);
        textView.setText(String.format(this.LOCALE, activity.getString(C1146R.string.rate_app), str));
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(viewInflate).create();
        button.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.view.dialog.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                alertDialogCreate.dismiss();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.view.dialog.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11796f.m8978c(activity, textInputLayout, appCompatRatingBar, alertDialogCreate, interfaceC11252a, str3, str2, view);
            }
        });
        alertDialogCreate.show();
    }
}
