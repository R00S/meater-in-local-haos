package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.qsg.ui.views.MEATERTextInputLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

/* compiled from: WifiSiginScreenBinding.java */
/* loaded from: classes2.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10797a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f10798b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f10799c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f10800d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f10801e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialButton f10802f;

    /* renamed from: g, reason: collision with root package name */
    public final AppCompatEditText f10803g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputEditText f10804h;

    /* renamed from: i, reason: collision with root package name */
    public final MEATERTextInputLayout f10805i;

    /* renamed from: j, reason: collision with root package name */
    public final AppCompatTextView f10806j;

    /* renamed from: k, reason: collision with root package name */
    public final ProgressBar f10807k;

    /* renamed from: l, reason: collision with root package name */
    public final MEATERTextInputLayout f10808l;

    /* renamed from: m, reason: collision with root package name */
    public final AppCompatTextView f10809m;

    /* renamed from: n, reason: collision with root package name */
    public final AppCompatTextView f10810n;

    private y1(ConstraintLayout constraintLayout, TextView textView, TextView textView2, LinearLayout linearLayout, AppCompatTextView appCompatTextView, MaterialButton materialButton, AppCompatEditText appCompatEditText, TextInputEditText textInputEditText, MEATERTextInputLayout mEATERTextInputLayout, AppCompatTextView appCompatTextView2, ProgressBar progressBar, MEATERTextInputLayout mEATERTextInputLayout2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.f10797a = constraintLayout;
        this.f10798b = textView;
        this.f10799c = textView2;
        this.f10800d = linearLayout;
        this.f10801e = appCompatTextView;
        this.f10802f = materialButton;
        this.f10803g = appCompatEditText;
        this.f10804h = textInputEditText;
        this.f10805i = mEATERTextInputLayout;
        this.f10806j = appCompatTextView2;
        this.f10807k = progressBar;
        this.f10808l = mEATERTextInputLayout2;
        this.f10809m = appCompatTextView3;
        this.f10810n = appCompatTextView4;
    }

    public static y1 a(View view) {
        int i10 = R.id.alertMessage;
        TextView textView = (TextView) A3.a.a(view, R.id.alertMessage);
        if (textView != null) {
            i10 = R.id.alertTitle;
            TextView textView2 = (TextView) A3.a.a(view, R.id.alertTitle);
            if (textView2 != null) {
                i10 = R.id.alertView;
                LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.alertView);
                if (linearLayout != null) {
                    i10 = R.id.body1;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.body1);
                    if (appCompatTextView != null) {
                        i10 = R.id.btnLogin;
                        MaterialButton materialButton = (MaterialButton) A3.a.a(view, R.id.btnLogin);
                        if (materialButton != null) {
                            i10 = R.id.editTextEmail;
                            AppCompatEditText appCompatEditText = (AppCompatEditText) A3.a.a(view, R.id.editTextEmail);
                            if (appCompatEditText != null) {
                                i10 = R.id.editTextPassword;
                                TextInputEditText textInputEditText = (TextInputEditText) A3.a.a(view, R.id.editTextPassword);
                                if (textInputEditText != null) {
                                    i10 = R.id.email_field;
                                    MEATERTextInputLayout mEATERTextInputLayout = (MEATERTextInputLayout) A3.a.a(view, R.id.email_field);
                                    if (mEATERTextInputLayout != null) {
                                        i10 = R.id.iCannotLogin;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.iCannotLogin);
                                        if (appCompatTextView2 != null) {
                                            i10 = R.id.loading;
                                            ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.loading);
                                            if (progressBar != null) {
                                                i10 = R.id.password_field;
                                                MEATERTextInputLayout mEATERTextInputLayout2 = (MEATERTextInputLayout) A3.a.a(view, R.id.password_field);
                                                if (mEATERTextInputLayout2 != null) {
                                                    i10 = R.id.title;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) A3.a.a(view, R.id.title);
                                                    if (appCompatTextView3 != null) {
                                                        i10 = R.id.whyDoINeed;
                                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) A3.a.a(view, R.id.whyDoINeed);
                                                        if (appCompatTextView4 != null) {
                                                            return new y1((ConstraintLayout) view, textView, textView2, linearLayout, appCompatTextView, materialButton, appCompatEditText, textInputEditText, mEATERTextInputLayout, appCompatTextView2, progressBar, mEATERTextInputLayout2, appCompatTextView3, appCompatTextView4);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static y1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.wifi_sigin_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10797a;
    }
}
