package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

/* compiled from: FragmentLoginBinding.java */
/* renamed from: L4.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1373e0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9987a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f9988b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f9989c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialButton f9990d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialButton f9991e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatEditText f9992f;

    /* renamed from: g, reason: collision with root package name */
    public final TextInputEditText f9993g;

    /* renamed from: h, reason: collision with root package name */
    public final MEATERTextInputLayout f9994h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f9995i;

    /* renamed from: j, reason: collision with root package name */
    public final AppCompatTextView f9996j;

    /* renamed from: k, reason: collision with root package name */
    public final ImageView f9997k;

    /* renamed from: l, reason: collision with root package name */
    public final ProgressBar f9998l;

    /* renamed from: m, reason: collision with root package name */
    public final MEATERTextInputLayout f9999m;

    /* renamed from: n, reason: collision with root package name */
    public final AppCompatTextView f10000n;

    /* renamed from: o, reason: collision with root package name */
    public final AppCompatTextView f10001o;

    private C1373e0(ConstraintLayout constraintLayout, LinearLayout linearLayout, AppCompatTextView appCompatTextView, MaterialButton materialButton, MaterialButton materialButton2, AppCompatEditText appCompatEditText, TextInputEditText textInputEditText, MEATERTextInputLayout mEATERTextInputLayout, TextView textView, AppCompatTextView appCompatTextView2, ImageView imageView, ProgressBar progressBar, MEATERTextInputLayout mEATERTextInputLayout2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.f9987a = constraintLayout;
        this.f9988b = linearLayout;
        this.f9989c = appCompatTextView;
        this.f9990d = materialButton;
        this.f9991e = materialButton2;
        this.f9992f = appCompatEditText;
        this.f9993g = textInputEditText;
        this.f9994h = mEATERTextInputLayout;
        this.f9995i = textView;
        this.f9996j = appCompatTextView2;
        this.f9997k = imageView;
        this.f9998l = progressBar;
        this.f9999m = mEATERTextInputLayout2;
        this.f10000n = appCompatTextView3;
        this.f10001o = appCompatTextView4;
    }

    public static C1373e0 a(View view) {
        int i10 = R.id.alertView;
        LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.alertView);
        if (linearLayout != null) {
            i10 = R.id.body1;
            AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.body1);
            if (appCompatTextView != null) {
                i10 = R.id.btnLogin;
                MaterialButton materialButton = (MaterialButton) A3.a.a(view, R.id.btnLogin);
                if (materialButton != null) {
                    i10 = R.id.btnSkip;
                    MaterialButton materialButton2 = (MaterialButton) A3.a.a(view, R.id.btnSkip);
                    if (materialButton2 != null) {
                        i10 = R.id.editTextEmail;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) A3.a.a(view, R.id.editTextEmail);
                        if (appCompatEditText != null) {
                            i10 = R.id.editTextPassword;
                            TextInputEditText textInputEditText = (TextInputEditText) A3.a.a(view, R.id.editTextPassword);
                            if (textInputEditText != null) {
                                i10 = R.id.email_field;
                                MEATERTextInputLayout mEATERTextInputLayout = (MEATERTextInputLayout) A3.a.a(view, R.id.email_field);
                                if (mEATERTextInputLayout != null) {
                                    i10 = R.id.errorText;
                                    TextView textView = (TextView) A3.a.a(view, R.id.errorText);
                                    if (textView != null) {
                                        i10 = R.id.forgotPassword;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.forgotPassword);
                                        if (appCompatTextView2 != null) {
                                            i10 = R.id.infoImage;
                                            ImageView imageView = (ImageView) A3.a.a(view, R.id.infoImage);
                                            if (imageView != null) {
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
                                                                return new C1373e0((ConstraintLayout) view, linearLayout, appCompatTextView, materialButton, materialButton2, appCompatEditText, textInputEditText, mEATERTextInputLayout, textView, appCompatTextView2, imageView, progressBar, mEATERTextInputLayout2, appCompatTextView3, appCompatTextView4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1373e0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_login, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9987a;
    }
}
