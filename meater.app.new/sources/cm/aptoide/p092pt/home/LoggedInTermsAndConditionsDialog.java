package cm.aptoide.p092pt.home;

import android.app.AlertDialog;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import cm.aptoide.analytics.implementation.CrashLogger;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.crashreports.CrashReport;
import okhttp3.HttpUrl;
import p456rx.C11234e;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class LoggedInTermsAndConditionsDialog {
    private static final String GDPR_DIALOG_EVENT_LISTENER_IS_NULL = "GDPR_DIALOG_EVENT_LISTENER_IS_NULL";
    private Button continueButton;
    private AlertDialog dialog;
    private Button logoutButton;
    private C11418b<String> uiEvents = C11418b.m40637g1();
    private CrashLogger crashReport = CrashReport.getInstance();

    public LoggedInTermsAndConditionsDialog(Context context) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.dialog = new AlertDialog.Builder(context).create();
        View viewInflate = layoutInflaterFrom.inflate(C1146R.layout.dialog_logged_in_accept_tos, (ViewGroup) null);
        this.dialog.setView(viewInflate);
        this.continueButton = (Button) viewInflate.findViewById(C1146R.id.accept_continue);
        this.logoutButton = (Button) viewInflate.findViewById(C1146R.id.log_out);
        setPrivacyPolicyLinks(viewInflate, context, this.uiEvents);
        this.dialog.setCancelable(false);
        this.dialog.setCanceledOnTouchOutside(false);
        this.continueButton.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.ea
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9709f.m7951a(view);
            }
        });
        this.logoutButton.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.da
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9697f.m7952b(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7951a(View view) {
        C11418b<String> c11418b = this.uiEvents;
        if (c11418b == null) {
            this.crashReport.log(GDPR_DIALOG_EVENT_LISTENER_IS_NULL, HttpUrl.FRAGMENT_ENCODE_SET);
        } else {
            c11418b.onNext("continue");
            this.dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7952b(View view) {
        C11418b<String> c11418b = this.uiEvents;
        if (c11418b != null) {
            c11418b.onNext("logout");
        } else {
            this.crashReport.log(GDPR_DIALOG_EVENT_LISTENER_IS_NULL, HttpUrl.FRAGMENT_ENCODE_SET);
        }
        this.dialog.dismiss();
    }

    private void setPrivacyPolicyLinks(View view, Context context, final C11418b<String> c11418b) {
        ClickableSpan clickableSpan = new ClickableSpan() { // from class: cm.aptoide.pt.home.LoggedInTermsAndConditionsDialog.1
            @Override // android.text.style.ClickableSpan
            public void onClick(View view2) {
                C11418b c11418b2 = c11418b;
                if (c11418b2 != null) {
                    c11418b2.onNext("terms");
                } else {
                    LoggedInTermsAndConditionsDialog.this.crashReport.log(LoggedInTermsAndConditionsDialog.GDPR_DIALOG_EVENT_LISTENER_IS_NULL, HttpUrl.FRAGMENT_ENCODE_SET);
                }
            }
        };
        ClickableSpan clickableSpan2 = new ClickableSpan() { // from class: cm.aptoide.pt.home.LoggedInTermsAndConditionsDialog.2
            @Override // android.text.style.ClickableSpan
            public void onClick(View view2) {
                C11418b c11418b2 = c11418b;
                if (c11418b2 != null) {
                    c11418b2.onNext("privacy");
                } else {
                    LoggedInTermsAndConditionsDialog.this.crashReport.log(LoggedInTermsAndConditionsDialog.GDPR_DIALOG_EVENT_LISTENER_IS_NULL, HttpUrl.FRAGMENT_ENCODE_SET);
                }
            }
        };
        String string = context.getString(C1146R.string.accept_terms_message_loggedin);
        String string2 = context.getString(C1146R.string.terms_and_conditions_privacy_sign_up_message);
        String string3 = context.getString(C1146R.string.settings_terms_conditions);
        String string4 = context.getString(C1146R.string.settings_privacy_policy);
        String str = String.format(string, string3, string4);
        ((Button) view.findViewById(C1146R.id.accept_continue)).setText(String.format(string2, string3, string4));
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(clickableSpan, str.indexOf(string3), str.indexOf(string3) + string3.length(), 33);
        spannableString.setSpan(clickableSpan2, str.indexOf(string4), str.indexOf(string4) + string4.length(), 33);
        TextView textView = (TextView) view.findViewById(C1146R.id.tos_info);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void destroyDialog() {
        if (this.dialog.isShowing()) {
            this.dialog.dismiss();
        }
        this.dialog = null;
        Button button = this.continueButton;
        if (button != null) {
            button.setOnClickListener(null);
        }
        Button button2 = this.logoutButton;
        if (button2 != null) {
            button2.setOnClickListener(null);
        }
        this.continueButton = null;
        this.logoutButton = null;
        this.uiEvents = null;
    }

    public C11234e<String> dialogClicked() {
        return this.uiEvents;
    }

    public void showDialog() {
        this.dialog.show();
    }
}
