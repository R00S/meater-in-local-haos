package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.apptionlabs.meater_app.R;

/* compiled from: ActivityTransparentWarningBinding.java */
/* renamed from: L4.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1399s {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10529a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f10530b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f10531c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f10532d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatButton f10533e;

    /* renamed from: f, reason: collision with root package name */
    public final LottieAnimationView f10534f;

    /* renamed from: g, reason: collision with root package name */
    public final LottieAnimationView f10535g;

    /* renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f10536h;

    /* renamed from: i, reason: collision with root package name */
    public final AppCompatImageView f10537i;

    /* renamed from: j, reason: collision with root package name */
    public final AppCompatTextView f10538j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f10539k;

    /* renamed from: l, reason: collision with root package name */
    public final AppCompatImageView f10540l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f10541m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10542n;

    private C1399s(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatButton appCompatButton, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView2, LinearLayout linearLayout2, AppCompatImageView appCompatImageView3, TextView textView, TextView textView2) {
        this.f10529a = constraintLayout;
        this.f10530b = constraintLayout2;
        this.f10531c = linearLayout;
        this.f10532d = appCompatImageView;
        this.f10533e = appCompatButton;
        this.f10534f = lottieAnimationView;
        this.f10535g = lottieAnimationView2;
        this.f10536h = appCompatTextView;
        this.f10537i = appCompatImageView2;
        this.f10538j = appCompatTextView2;
        this.f10539k = linearLayout2;
        this.f10540l = appCompatImageView3;
        this.f10541m = textView;
        this.f10542n = textView2;
    }

    public static C1399s a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.bottomBars;
        LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.bottomBars);
        if (linearLayout != null) {
            i10 = R.id.deviceImage;
            AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.deviceImage);
            if (appCompatImageView != null) {
                i10 = R.id.dismissButton;
                AppCompatButton appCompatButton = (AppCompatButton) A3.a.a(view, R.id.dismissButton);
                if (appCompatButton != null) {
                    i10 = R.id.fiveSensorAnimationView;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) A3.a.a(view, R.id.fiveSensorAnimationView);
                    if (lottieAnimationView != null) {
                        i10 = R.id.flareUpAnimationView;
                        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) A3.a.a(view, R.id.flareUpAnimationView);
                        if (lottieAnimationView2 != null) {
                            i10 = R.id.moreInfo;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.moreInfo);
                            if (appCompatTextView != null) {
                                i10 = R.id.probeClipImage;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) A3.a.a(view, R.id.probeClipImage);
                                if (appCompatImageView2 != null) {
                                    i10 = R.id.probeNumber;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.probeNumber);
                                    if (appCompatTextView2 != null) {
                                        i10 = R.id.topBars;
                                        LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.topBars);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.warning_image_view;
                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) A3.a.a(view, R.id.warning_image_view);
                                            if (appCompatImageView3 != null) {
                                                i10 = R.id.warning_text1;
                                                TextView textView = (TextView) A3.a.a(view, R.id.warning_text1);
                                                if (textView != null) {
                                                    i10 = R.id.warning_text2;
                                                    TextView textView2 = (TextView) A3.a.a(view, R.id.warning_text2);
                                                    if (textView2 != null) {
                                                        return new C1399s(constraintLayout, constraintLayout, linearLayout, appCompatImageView, appCompatButton, lottieAnimationView, lottieAnimationView2, appCompatTextView, appCompatImageView2, appCompatTextView2, linearLayout2, appCompatImageView3, textView, textView2);
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

    public static C1399s c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1399s d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_transparent_warning, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10529a;
    }
}
