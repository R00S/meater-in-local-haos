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

/* compiled from: FragmentBaseInfoBinding.java */
/* loaded from: classes2.dex */
public final class V {

    /* renamed from: A, reason: collision with root package name */
    public final AppCompatTextView f9656A;

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9657a;

    /* renamed from: b, reason: collision with root package name */
    public final LottieAnimationView f9658b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f9659c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutCompat f9660d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialButton f9661e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayoutCompat f9662f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialButton f9663g;

    /* renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f9664h;

    /* renamed from: i, reason: collision with root package name */
    public final AppCompatEditText f9665i;

    /* renamed from: j, reason: collision with root package name */
    public final TextInputEditText f9666j;

    /* renamed from: k, reason: collision with root package name */
    public final MEATERTextInputLayout f9667k;

    /* renamed from: l, reason: collision with root package name */
    public final LottieAnimationView f9668l;

    /* renamed from: m, reason: collision with root package name */
    public final ProgressBar f9669m;

    /* renamed from: n, reason: collision with root package name */
    public final ProgressBar f9670n;

    /* renamed from: o, reason: collision with root package name */
    public final RecyclerView f9671o;

    /* renamed from: p, reason: collision with root package name */
    public final MEATERTextInputLayout f9672p;

    /* renamed from: q, reason: collision with root package name */
    public final LinearProgressIndicator f9673q;

    /* renamed from: r, reason: collision with root package name */
    public final LinearProgressIndicator f9674r;

    /* renamed from: s, reason: collision with root package name */
    public final LinearProgressIndicator f9675s;

    /* renamed from: t, reason: collision with root package name */
    public final LinearProgressIndicator f9676t;

    /* renamed from: u, reason: collision with root package name */
    public final LinearLayoutCompat f9677u;

    /* renamed from: v, reason: collision with root package name */
    public final AppCompatTextView f9678v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f9679w;

    /* renamed from: x, reason: collision with root package name */
    public final AppCompatTextView f9680x;

    /* renamed from: y, reason: collision with root package name */
    public final NestedScrollView f9681y;

    /* renamed from: z, reason: collision with root package name */
    public final FrameLayout f9682z;

    private V(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, ConstraintLayout constraintLayout2, LinearLayoutCompat linearLayoutCompat, MaterialButton materialButton, LinearLayoutCompat linearLayoutCompat2, MaterialButton materialButton2, AppCompatTextView appCompatTextView, AppCompatEditText appCompatEditText, TextInputEditText textInputEditText, MEATERTextInputLayout mEATERTextInputLayout, LottieAnimationView lottieAnimationView2, ProgressBar progressBar, ProgressBar progressBar2, RecyclerView recyclerView, MEATERTextInputLayout mEATERTextInputLayout2, LinearProgressIndicator linearProgressIndicator, LinearProgressIndicator linearProgressIndicator2, LinearProgressIndicator linearProgressIndicator3, LinearProgressIndicator linearProgressIndicator4, LinearLayoutCompat linearLayoutCompat3, AppCompatTextView appCompatTextView2, TextView textView, AppCompatTextView appCompatTextView3, NestedScrollView nestedScrollView, FrameLayout frameLayout, AppCompatTextView appCompatTextView4) {
        this.f9657a = constraintLayout;
        this.f9658b = lottieAnimationView;
        this.f9659c = constraintLayout2;
        this.f9660d = linearLayoutCompat;
        this.f9661e = materialButton;
        this.f9662f = linearLayoutCompat2;
        this.f9663g = materialButton2;
        this.f9664h = appCompatTextView;
        this.f9665i = appCompatEditText;
        this.f9666j = textInputEditText;
        this.f9667k = mEATERTextInputLayout;
        this.f9668l = lottieAnimationView2;
        this.f9669m = progressBar;
        this.f9670n = progressBar2;
        this.f9671o = recyclerView;
        this.f9672p = mEATERTextInputLayout2;
        this.f9673q = linearProgressIndicator;
        this.f9674r = linearProgressIndicator2;
        this.f9675s = linearProgressIndicator3;
        this.f9676t = linearProgressIndicator4;
        this.f9677u = linearLayoutCompat3;
        this.f9678v = appCompatTextView2;
        this.f9679w = textView;
        this.f9680x = appCompatTextView3;
        this.f9681y = nestedScrollView;
        this.f9682z = frameLayout;
        this.f9656A = appCompatTextView4;
    }

    public static V a(View view) {
        int i10 = R.id.animationView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) A3.a.a(view, R.id.animationView);
        if (lottieAnimationView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = R.id.bottomHolder;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) A3.a.a(view, R.id.bottomHolder);
            if (linearLayoutCompat != null) {
                i10 = R.id.button;
                MaterialButton materialButton = (MaterialButton) A3.a.a(view, R.id.button);
                if (materialButton != null) {
                    i10 = R.id.buttonHolder;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) A3.a.a(view, R.id.buttonHolder);
                    if (linearLayoutCompat2 != null) {
                        i10 = R.id.buttonSkip;
                        MaterialButton materialButton2 = (MaterialButton) A3.a.a(view, R.id.buttonSkip);
                        if (materialButton2 != null) {
                            i10 = R.id.deviceInofText;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.deviceInofText);
                            if (appCompatTextView != null) {
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
                                                                i10 = R.id.progress1;
                                                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) A3.a.a(view, R.id.progress1);
                                                                if (linearProgressIndicator != null) {
                                                                    i10 = R.id.progress2;
                                                                    LinearProgressIndicator linearProgressIndicator2 = (LinearProgressIndicator) A3.a.a(view, R.id.progress2);
                                                                    if (linearProgressIndicator2 != null) {
                                                                        i10 = R.id.progress3;
                                                                        LinearProgressIndicator linearProgressIndicator3 = (LinearProgressIndicator) A3.a.a(view, R.id.progress3);
                                                                        if (linearProgressIndicator3 != null) {
                                                                            i10 = R.id.progress4;
                                                                            LinearProgressIndicator linearProgressIndicator4 = (LinearProgressIndicator) A3.a.a(view, R.id.progress4);
                                                                            if (linearProgressIndicator4 != null) {
                                                                                i10 = R.id.progressHolder;
                                                                                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) A3.a.a(view, R.id.progressHolder);
                                                                                if (linearLayoutCompat3 != null) {
                                                                                    i10 = R.id.reSelect;
                                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.reSelect);
                                                                                    if (appCompatTextView2 != null) {
                                                                                        i10 = R.id.screenSubTitle;
                                                                                        TextView textView = (TextView) A3.a.a(view, R.id.screenSubTitle);
                                                                                        if (textView != null) {
                                                                                            i10 = R.id.screenTitle;
                                                                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) A3.a.a(view, R.id.screenTitle);
                                                                                            if (appCompatTextView3 != null) {
                                                                                                i10 = R.id.scrollView;
                                                                                                NestedScrollView nestedScrollView = (NestedScrollView) A3.a.a(view, R.id.scrollView);
                                                                                                if (nestedScrollView != null) {
                                                                                                    i10 = R.id.subTitleHolder;
                                                                                                    FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.subTitleHolder);
                                                                                                    if (frameLayout != null) {
                                                                                                        i10 = R.id.whyDoINeed;
                                                                                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) A3.a.a(view, R.id.whyDoINeed);
                                                                                                        if (appCompatTextView4 != null) {
                                                                                                            return new V(constraintLayout, lottieAnimationView, constraintLayout, linearLayoutCompat, materialButton, linearLayoutCompat2, materialButton2, appCompatTextView, appCompatEditText, textInputEditText, mEATERTextInputLayout, lottieAnimationView2, progressBar, progressBar2, recyclerView, mEATERTextInputLayout2, linearProgressIndicator, linearProgressIndicator2, linearProgressIndicator3, linearProgressIndicator4, linearLayoutCompat3, appCompatTextView2, textView, appCompatTextView3, nestedScrollView, frameLayout, appCompatTextView4);
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

    public static V c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_base_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9657a;
    }
}
