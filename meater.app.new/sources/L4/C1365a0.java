package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.qsg.ui.views.MEATERTextInputLayout;
import com.google.android.material.button.MaterialButton;

/* compiled from: FragmentForgotPasswordBinding.java */
/* renamed from: L4.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1365a0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9822a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f9823b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialButton f9824c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialButton f9825d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatEditText f9826e;

    /* renamed from: f, reason: collision with root package name */
    public final MEATERTextInputLayout f9827f;

    /* renamed from: g, reason: collision with root package name */
    public final ProgressBar f9828g;

    /* renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f9829h;

    /* renamed from: i, reason: collision with root package name */
    public final AppCompatTextView f9830i;

    private C1365a0(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, MaterialButton materialButton, MaterialButton materialButton2, AppCompatEditText appCompatEditText, MEATERTextInputLayout mEATERTextInputLayout, ProgressBar progressBar, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.f9822a = constraintLayout;
        this.f9823b = appCompatTextView;
        this.f9824c = materialButton;
        this.f9825d = materialButton2;
        this.f9826e = appCompatEditText;
        this.f9827f = mEATERTextInputLayout;
        this.f9828g = progressBar;
        this.f9829h = appCompatTextView2;
        this.f9830i = appCompatTextView3;
    }

    public static C1365a0 a(View view) {
        int i10 = R.id.body1;
        AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.body1);
        if (appCompatTextView != null) {
            i10 = R.id.btnSendEmail;
            MaterialButton materialButton = (MaterialButton) A3.a.a(view, R.id.btnSendEmail);
            if (materialButton != null) {
                i10 = R.id.btnSkip;
                MaterialButton materialButton2 = (MaterialButton) A3.a.a(view, R.id.btnSkip);
                if (materialButton2 != null) {
                    i10 = R.id.editTextEmail;
                    AppCompatEditText appCompatEditText = (AppCompatEditText) A3.a.a(view, R.id.editTextEmail);
                    if (appCompatEditText != null) {
                        i10 = R.id.email_field;
                        MEATERTextInputLayout mEATERTextInputLayout = (MEATERTextInputLayout) A3.a.a(view, R.id.email_field);
                        if (mEATERTextInputLayout != null) {
                            i10 = R.id.loading;
                            ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.loading);
                            if (progressBar != null) {
                                i10 = R.id.title;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.title);
                                if (appCompatTextView2 != null) {
                                    i10 = R.id.whyDoINeed;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) A3.a.a(view, R.id.whyDoINeed);
                                    if (appCompatTextView3 != null) {
                                        return new C1365a0((ConstraintLayout) view, appCompatTextView, materialButton, materialButton2, appCompatEditText, mEATERTextInputLayout, progressBar, appCompatTextView2, appCompatTextView3);
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

    public static C1365a0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_forgot_password, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9822a;
    }
}
