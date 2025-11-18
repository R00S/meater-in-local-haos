package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.qsg.ui.views.MEATERTextInputLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;

/* compiled from: FragmentBaseFirmwareBinding.java */
/* loaded from: classes2.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9628a;

    /* renamed from: b, reason: collision with root package name */
    public final LottieAnimationView f9629b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayoutCompat f9630c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialButton f9631d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialButton f9632e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatEditText f9633f;

    /* renamed from: g, reason: collision with root package name */
    public final TextInputEditText f9634g;

    /* renamed from: h, reason: collision with root package name */
    public final MEATERTextInputLayout f9635h;

    /* renamed from: i, reason: collision with root package name */
    public final LottieAnimationView f9636i;

    /* renamed from: j, reason: collision with root package name */
    public final ProgressBar f9637j;

    /* renamed from: k, reason: collision with root package name */
    public final ProgressBar f9638k;

    /* renamed from: l, reason: collision with root package name */
    public final RecyclerView f9639l;

    /* renamed from: m, reason: collision with root package name */
    public final MEATERTextInputLayout f9640m;

    /* renamed from: n, reason: collision with root package name */
    public final LinearProgressIndicator f9641n;

    /* renamed from: o, reason: collision with root package name */
    public final LinearProgressIndicator f9642o;

    /* renamed from: p, reason: collision with root package name */
    public final LinearProgressIndicator f9643p;

    /* renamed from: q, reason: collision with root package name */
    public final LinearProgressIndicator f9644q;

    /* renamed from: r, reason: collision with root package name */
    public final LinearProgressIndicator f9645r;

    /* renamed from: s, reason: collision with root package name */
    public final LinearLayoutCompat f9646s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f9647t;

    /* renamed from: u, reason: collision with root package name */
    public final AppCompatTextView f9648u;

    /* renamed from: v, reason: collision with root package name */
    public final NestedScrollView f9649v;

    /* renamed from: w, reason: collision with root package name */
    public final FrameLayout f9650w;

    /* renamed from: x, reason: collision with root package name */
    public final AppCompatTextView f9651x;

    /* renamed from: y, reason: collision with root package name */
    public final AppCompatTextView f9652y;

    private U(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, LinearLayoutCompat linearLayoutCompat, MaterialButton materialButton, MaterialButton materialButton2, AppCompatEditText appCompatEditText, TextInputEditText textInputEditText, MEATERTextInputLayout mEATERTextInputLayout, LottieAnimationView lottieAnimationView2, ProgressBar progressBar, ProgressBar progressBar2, RecyclerView recyclerView, MEATERTextInputLayout mEATERTextInputLayout2, LinearProgressIndicator linearProgressIndicator, LinearProgressIndicator linearProgressIndicator2, LinearProgressIndicator linearProgressIndicator3, LinearProgressIndicator linearProgressIndicator4, LinearProgressIndicator linearProgressIndicator5, LinearLayoutCompat linearLayoutCompat2, TextView textView, AppCompatTextView appCompatTextView, NestedScrollView nestedScrollView, FrameLayout frameLayout, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.f9628a = constraintLayout;
        this.f9629b = lottieAnimationView;
        this.f9630c = linearLayoutCompat;
        this.f9631d = materialButton;
        this.f9632e = materialButton2;
        this.f9633f = appCompatEditText;
        this.f9634g = textInputEditText;
        this.f9635h = mEATERTextInputLayout;
        this.f9636i = lottieAnimationView2;
        this.f9637j = progressBar;
        this.f9638k = progressBar2;
        this.f9639l = recyclerView;
        this.f9640m = mEATERTextInputLayout2;
        this.f9641n = linearProgressIndicator;
        this.f9642o = linearProgressIndicator2;
        this.f9643p = linearProgressIndicator3;
        this.f9644q = linearProgressIndicator4;
        this.f9645r = linearProgressIndicator5;
        this.f9646s = linearLayoutCompat2;
        this.f9647t = textView;
        this.f9648u = appCompatTextView;
        this.f9649v = nestedScrollView;
        this.f9650w = frameLayout;
        this.f9651x = appCompatTextView2;
        this.f9652y = appCompatTextView3;
    }

    public static U a(View view) {
        int i10 = R.id.animationView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) A3.a.a(view, R.id.animationView);
        if (lottieAnimationView != null) {
            i10 = R.id.bottomHolder;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) A3.a.a(view, R.id.bottomHolder);
            if (linearLayoutCompat != null) {
                i10 = R.id.button;
                MaterialButton materialButton = (MaterialButton) A3.a.a(view, R.id.button);
                if (materialButton != null) {
                    i10 = R.id.button0;
                    MaterialButton materialButton2 = (MaterialButton) A3.a.a(view, R.id.button0);
                    if (materialButton2 != null) {
                        i10 = R.id.editTextEmail;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) A3.a.a(view, R.id.editTextEmail);
                        if (appCompatEditText != null) {
                            i10 = R.id.editTextPassword;
                            TextInputEditText textInputEditText = (TextInputEditText) A3.a.a(view, R.id.editTextPassword);
                            if (textInputEditText != null) {
                                i10 = R.id.emailField;
                                MEATERTextInputLayout mEATERTextInputLayout = (MEATERTextInputLayout) A3.a.a(view, R.id.emailField);
                                if (mEATERTextInputLayout != null) {
                                    i10 = R.id.greenTick;
                                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) A3.a.a(view, R.id.greenTick);
                                    if (lottieAnimationView2 != null) {
                                        i10 = R.id.loading;
                                        ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.loading);
                                        if (progressBar != null) {
                                            i10 = R.id.mainProgress;
                                            ProgressBar progressBar2 = (ProgressBar) A3.a.a(view, R.id.mainProgress);
                                            if (progressBar2 != null) {
                                                i10 = R.id.nearByDevices;
                                                RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.nearByDevices);
                                                if (recyclerView != null) {
                                                    i10 = R.id.passwordField;
                                                    MEATERTextInputLayout mEATERTextInputLayout2 = (MEATERTextInputLayout) A3.a.a(view, R.id.passwordField);
                                                    if (mEATERTextInputLayout2 != null) {
                                                        i10 = R.id.progress;
                                                        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) A3.a.a(view, R.id.progress);
                                                        if (linearProgressIndicator != null) {
                                                            i10 = R.id.progress1;
                                                            LinearProgressIndicator linearProgressIndicator2 = (LinearProgressIndicator) A3.a.a(view, R.id.progress1);
                                                            if (linearProgressIndicator2 != null) {
                                                                i10 = R.id.progress2;
                                                                LinearProgressIndicator linearProgressIndicator3 = (LinearProgressIndicator) A3.a.a(view, R.id.progress2);
                                                                if (linearProgressIndicator3 != null) {
                                                                    i10 = R.id.progress3;
                                                                    LinearProgressIndicator linearProgressIndicator4 = (LinearProgressIndicator) A3.a.a(view, R.id.progress3);
                                                                    if (linearProgressIndicator4 != null) {
                                                                        i10 = R.id.progress4;
                                                                        LinearProgressIndicator linearProgressIndicator5 = (LinearProgressIndicator) A3.a.a(view, R.id.progress4);
                                                                        if (linearProgressIndicator5 != null) {
                                                                            i10 = R.id.progressHolder;
                                                                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) A3.a.a(view, R.id.progressHolder);
                                                                            if (linearLayoutCompat2 != null) {
                                                                                i10 = R.id.screenSubTitle;
                                                                                TextView textView = (TextView) A3.a.a(view, R.id.screenSubTitle);
                                                                                if (textView != null) {
                                                                                    i10 = R.id.screenTitle;
                                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.screenTitle);
                                                                                    if (appCompatTextView != null) {
                                                                                        i10 = R.id.scrollView;
                                                                                        NestedScrollView nestedScrollView = (NestedScrollView) A3.a.a(view, R.id.scrollView);
                                                                                        if (nestedScrollView != null) {
                                                                                            i10 = R.id.subTitleHolder;
                                                                                            FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.subTitleHolder);
                                                                                            if (frameLayout != null) {
                                                                                                i10 = R.id.textProgress;
                                                                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.textProgress);
                                                                                                if (appCompatTextView2 != null) {
                                                                                                    i10 = R.id.whyDoINeed;
                                                                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) A3.a.a(view, R.id.whyDoINeed);
                                                                                                    if (appCompatTextView3 != null) {
                                                                                                        return new U((ConstraintLayout) view, lottieAnimationView, linearLayoutCompat, materialButton, materialButton2, appCompatEditText, textInputEditText, mEATERTextInputLayout, lottieAnimationView2, progressBar, progressBar2, recyclerView, mEATERTextInputLayout2, linearProgressIndicator, linearProgressIndicator2, linearProgressIndicator3, linearProgressIndicator4, linearProgressIndicator5, linearLayoutCompat2, textView, appCompatTextView, nestedScrollView, frameLayout, appCompatTextView2, appCompatTextView3);
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

    public static U c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_base_firmware, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9628a;
    }
}
