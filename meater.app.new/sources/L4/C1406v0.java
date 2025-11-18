package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: FragmentSignupBinding.java */
/* renamed from: L4.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1406v0 {

    /* renamed from: A, reason: collision with root package name */
    public final TextInputLayout f10642A;

    /* renamed from: B, reason: collision with root package name */
    public final ScrollView f10643B;

    /* renamed from: C, reason: collision with root package name */
    public final LinearLayoutCompat f10644C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f10645D;

    /* renamed from: E, reason: collision with root package name */
    public final AppCompatTextView f10646E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f10647F;

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10648a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f10649b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f10650c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10651d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialButton f10652e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialButton f10653f;

    /* renamed from: g, reason: collision with root package name */
    public final AppCompatCheckBox f10654g;

    /* renamed from: h, reason: collision with root package name */
    public final AppCompatEditText f10655h;

    /* renamed from: i, reason: collision with root package name */
    public final TextInputEditText f10656i;

    /* renamed from: j, reason: collision with root package name */
    public final TextInputEditText f10657j;

    /* renamed from: k, reason: collision with root package name */
    public final TextInputLayout f10658k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10659l;

    /* renamed from: m, reason: collision with root package name */
    public final TextInputLayout f10660m;

    /* renamed from: n, reason: collision with root package name */
    public final AppCompatEditText f10661n;

    /* renamed from: o, reason: collision with root package name */
    public final Guideline f10662o;

    /* renamed from: p, reason: collision with root package name */
    public final Guideline f10663p;

    /* renamed from: q, reason: collision with root package name */
    public final Guideline f10664q;

    /* renamed from: r, reason: collision with root package name */
    public final ImageView f10665r;

    /* renamed from: s, reason: collision with root package name */
    public final TextInputLayout f10666s;

    /* renamed from: t, reason: collision with root package name */
    public final AppCompatEditText f10667t;

    /* renamed from: u, reason: collision with root package name */
    public final ProgressBar f10668u;

    /* renamed from: v, reason: collision with root package name */
    public final TextInputLayout f10669v;

    /* renamed from: w, reason: collision with root package name */
    public final RadioButton f10670w;

    /* renamed from: x, reason: collision with root package name */
    public final RadioButton f10671x;

    /* renamed from: y, reason: collision with root package name */
    public final RadioGroup f10672y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f10673z;

    private C1406v0(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, LinearLayout linearLayout, TextView textView, MaterialButton materialButton, MaterialButton materialButton2, AppCompatCheckBox appCompatCheckBox, AppCompatEditText appCompatEditText, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, TextView textView2, TextInputLayout textInputLayout2, AppCompatEditText appCompatEditText2, Guideline guideline, Guideline guideline2, Guideline guideline3, ImageView imageView, TextInputLayout textInputLayout3, AppCompatEditText appCompatEditText3, ProgressBar progressBar, TextInputLayout textInputLayout4, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, TextView textView3, TextInputLayout textInputLayout5, ScrollView scrollView, LinearLayoutCompat linearLayoutCompat, TextView textView4, AppCompatTextView appCompatTextView2, TextView textView5) {
        this.f10648a = constraintLayout;
        this.f10649b = appCompatTextView;
        this.f10650c = linearLayout;
        this.f10651d = textView;
        this.f10652e = materialButton;
        this.f10653f = materialButton2;
        this.f10654g = appCompatCheckBox;
        this.f10655h = appCompatEditText;
        this.f10656i = textInputEditText;
        this.f10657j = textInputEditText2;
        this.f10658k = textInputLayout;
        this.f10659l = textView2;
        this.f10660m = textInputLayout2;
        this.f10661n = appCompatEditText2;
        this.f10662o = guideline;
        this.f10663p = guideline2;
        this.f10664q = guideline3;
        this.f10665r = imageView;
        this.f10666s = textInputLayout3;
        this.f10667t = appCompatEditText3;
        this.f10668u = progressBar;
        this.f10669v = textInputLayout4;
        this.f10670w = radioButton;
        this.f10671x = radioButton2;
        this.f10672y = radioGroup;
        this.f10673z = textView3;
        this.f10642A = textInputLayout5;
        this.f10643B = scrollView;
        this.f10644C = linearLayoutCompat;
        this.f10645D = textView4;
        this.f10646E = appCompatTextView2;
        this.f10647F = textView5;
    }

    public static C1406v0 a(View view) {
        int i10 = R.id.agreeToTerm;
        AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.agreeToTerm);
        if (appCompatTextView != null) {
            i10 = R.id.alertView;
            LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.alertView);
            if (linearLayout != null) {
                i10 = R.id.body;
                TextView textView = (TextView) A3.a.a(view, R.id.body);
                if (textView != null) {
                    i10 = R.id.btnSignup;
                    MaterialButton materialButton = (MaterialButton) A3.a.a(view, R.id.btnSignup);
                    if (materialButton != null) {
                        i10 = R.id.btnSkip;
                        MaterialButton materialButton2 = (MaterialButton) A3.a.a(view, R.id.btnSkip);
                        if (materialButton2 != null) {
                            i10 = R.id.checkAgreeToTerm;
                            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) A3.a.a(view, R.id.checkAgreeToTerm);
                            if (appCompatCheckBox != null) {
                                i10 = R.id.editTextEmail;
                                AppCompatEditText appCompatEditText = (AppCompatEditText) A3.a.a(view, R.id.editTextEmail);
                                if (appCompatEditText != null) {
                                    i10 = R.id.editTextPassword;
                                    TextInputEditText textInputEditText = (TextInputEditText) A3.a.a(view, R.id.editTextPassword);
                                    if (textInputEditText != null) {
                                        i10 = R.id.editTextRePassword;
                                        TextInputEditText textInputEditText2 = (TextInputEditText) A3.a.a(view, R.id.editTextRePassword);
                                        if (textInputEditText2 != null) {
                                            i10 = R.id.email_field;
                                            TextInputLayout textInputLayout = (TextInputLayout) A3.a.a(view, R.id.email_field);
                                            if (textInputLayout != null) {
                                                i10 = R.id.errorText;
                                                TextView textView2 = (TextView) A3.a.a(view, R.id.errorText);
                                                if (textView2 != null) {
                                                    i10 = R.id.firstName;
                                                    TextInputLayout textInputLayout2 = (TextInputLayout) A3.a.a(view, R.id.firstName);
                                                    if (textInputLayout2 != null) {
                                                        i10 = R.id.firstNameEdit;
                                                        AppCompatEditText appCompatEditText2 = (AppCompatEditText) A3.a.a(view, R.id.firstNameEdit);
                                                        if (appCompatEditText2 != null) {
                                                            i10 = R.id.guidelineCheckboxStart;
                                                            Guideline guideline = (Guideline) A3.a.a(view, R.id.guidelineCheckboxStart);
                                                            if (guideline != null) {
                                                                i10 = R.id.guidelineEnd;
                                                                Guideline guideline2 = (Guideline) A3.a.a(view, R.id.guidelineEnd);
                                                                if (guideline2 != null) {
                                                                    i10 = R.id.guidelineStart;
                                                                    Guideline guideline3 = (Guideline) A3.a.a(view, R.id.guidelineStart);
                                                                    if (guideline3 != null) {
                                                                        i10 = R.id.infoImage;
                                                                        ImageView imageView = (ImageView) A3.a.a(view, R.id.infoImage);
                                                                        if (imageView != null) {
                                                                            i10 = R.id.lastName;
                                                                            TextInputLayout textInputLayout3 = (TextInputLayout) A3.a.a(view, R.id.lastName);
                                                                            if (textInputLayout3 != null) {
                                                                                i10 = R.id.lastNameEdit;
                                                                                AppCompatEditText appCompatEditText3 = (AppCompatEditText) A3.a.a(view, R.id.lastNameEdit);
                                                                                if (appCompatEditText3 != null) {
                                                                                    i10 = R.id.loading;
                                                                                    ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.loading);
                                                                                    if (progressBar != null) {
                                                                                        i10 = R.id.passwordField;
                                                                                        TextInputLayout textInputLayout4 = (TextInputLayout) A3.a.a(view, R.id.passwordField);
                                                                                        if (textInputLayout4 != null) {
                                                                                            i10 = R.id.radioAgreeNewsletter;
                                                                                            RadioButton radioButton = (RadioButton) A3.a.a(view, R.id.radioAgreeNewsletter);
                                                                                            if (radioButton != null) {
                                                                                                i10 = R.id.radioDisagreeNewsletter;
                                                                                                RadioButton radioButton2 = (RadioButton) A3.a.a(view, R.id.radioDisagreeNewsletter);
                                                                                                if (radioButton2 != null) {
                                                                                                    i10 = R.id.radioGroupNewsletter;
                                                                                                    RadioGroup radioGroup = (RadioGroup) A3.a.a(view, R.id.radioGroupNewsletter);
                                                                                                    if (radioGroup != null) {
                                                                                                        i10 = R.id.radioTitle;
                                                                                                        TextView textView3 = (TextView) A3.a.a(view, R.id.radioTitle);
                                                                                                        if (textView3 != null) {
                                                                                                            i10 = R.id.rePasswordField;
                                                                                                            TextInputLayout textInputLayout5 = (TextInputLayout) A3.a.a(view, R.id.rePasswordField);
                                                                                                            if (textInputLayout5 != null) {
                                                                                                                i10 = R.id.scrollView;
                                                                                                                ScrollView scrollView = (ScrollView) A3.a.a(view, R.id.scrollView);
                                                                                                                if (scrollView != null) {
                                                                                                                    i10 = R.id.termsHolder;
                                                                                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) A3.a.a(view, R.id.termsHolder);
                                                                                                                    if (linearLayoutCompat != null) {
                                                                                                                        i10 = R.id.termsTitle;
                                                                                                                        TextView textView4 = (TextView) A3.a.a(view, R.id.termsTitle);
                                                                                                                        if (textView4 != null) {
                                                                                                                            i10 = R.id.title;
                                                                                                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.title);
                                                                                                                            if (appCompatTextView2 != null) {
                                                                                                                                i10 = R.id.whyDoINeed;
                                                                                                                                TextView textView5 = (TextView) A3.a.a(view, R.id.whyDoINeed);
                                                                                                                                if (textView5 != null) {
                                                                                                                                    return new C1406v0((ConstraintLayout) view, appCompatTextView, linearLayout, textView, materialButton, materialButton2, appCompatCheckBox, appCompatEditText, textInputEditText, textInputEditText2, textInputLayout, textView2, textInputLayout2, appCompatEditText2, guideline, guideline2, guideline3, imageView, textInputLayout3, appCompatEditText3, progressBar, textInputLayout4, radioButton, radioButton2, radioGroup, textView3, textInputLayout5, scrollView, linearLayoutCompat, textView4, appCompatTextView2, textView5);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1406v0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_signup, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10648a;
    }
}
