package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import com.apptionlabs.meater_app.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: FragmentConfirmSetupInstructionBinding.java */
/* loaded from: classes2.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9706a;

    /* renamed from: b, reason: collision with root package name */
    public final LottieAnimationView f9707b;

    /* renamed from: c, reason: collision with root package name */
    public final AppBarLayout f9708c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f9709d;

    /* renamed from: e, reason: collision with root package name */
    public final View f9710e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f9711f;

    /* renamed from: g, reason: collision with root package name */
    public final View f9712g;

    /* renamed from: h, reason: collision with root package name */
    public final View f9713h;

    /* renamed from: i, reason: collision with root package name */
    public final Guideline f9714i;

    /* renamed from: j, reason: collision with root package name */
    public final Guideline f9715j;

    /* renamed from: k, reason: collision with root package name */
    public final Guideline f9716k;

    /* renamed from: l, reason: collision with root package name */
    public final LinearLayout f9717l;

    /* renamed from: m, reason: collision with root package name */
    public final View f9718m;

    /* renamed from: n, reason: collision with root package name */
    public final ScrollView f9719n;

    /* renamed from: o, reason: collision with root package name */
    public final MaterialToolbar f9720o;

    /* renamed from: p, reason: collision with root package name */
    public final ImageView f9721p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f9722q;

    private X(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, AppBarLayout appBarLayout, TextView textView, View view, TextView textView2, View view2, View view3, Guideline guideline, Guideline guideline2, Guideline guideline3, LinearLayout linearLayout, View view4, ScrollView scrollView, MaterialToolbar materialToolbar, ImageView imageView, TextView textView3) {
        this.f9706a = constraintLayout;
        this.f9707b = lottieAnimationView;
        this.f9708c = appBarLayout;
        this.f9709d = textView;
        this.f9710e = view;
        this.f9711f = textView2;
        this.f9712g = view2;
        this.f9713h = view3;
        this.f9714i = guideline;
        this.f9715j = guideline2;
        this.f9716k = guideline3;
        this.f9717l = linearLayout;
        this.f9718m = view4;
        this.f9719n = scrollView;
        this.f9720o = materialToolbar;
        this.f9721p = imageView;
        this.f9722q = textView3;
    }

    public static X a(View view) {
        int i10 = R.id.animationView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) A3.a.a(view, R.id.animationView);
        if (lottieAnimationView != null) {
            i10 = R.id.appBarLayout;
            AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
            if (appBarLayout != null) {
                i10 = R.id.detail;
                TextView textView = (TextView) A3.a.a(view, R.id.detail);
                if (textView != null) {
                    View viewA = A3.a.a(view, R.id.detailDivider);
                    i10 = R.id.doNotShowButton;
                    TextView textView2 = (TextView) A3.a.a(view, R.id.doNotShowButton);
                    if (textView2 != null) {
                        View viewA2 = A3.a.a(view, R.id.doNotShowButtonDivider);
                        View viewA3 = A3.a.a(view, R.id.doNotShowDivider);
                        Guideline guideline = (Guideline) A3.a.a(view, R.id.guideline1);
                        Guideline guideline2 = (Guideline) A3.a.a(view, R.id.guideline2);
                        Guideline guideline3 = (Guideline) A3.a.a(view, R.id.guidelineCenter);
                        i10 = R.id.instructionVideo;
                        LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.instructionVideo);
                        if (linearLayout != null) {
                            View viewA4 = A3.a.a(view, R.id.instructionVideoDivider);
                            ScrollView scrollView = (ScrollView) A3.a.a(view, R.id.signInScroll);
                            i10 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                            if (materialToolbar != null) {
                                i10 = R.id.video_image;
                                ImageView imageView = (ImageView) A3.a.a(view, R.id.video_image);
                                if (imageView != null) {
                                    i10 = R.id.video_title;
                                    TextView textView3 = (TextView) A3.a.a(view, R.id.video_title);
                                    if (textView3 != null) {
                                        return new X((ConstraintLayout) view, lottieAnimationView, appBarLayout, textView, viewA, textView2, viewA2, viewA3, guideline, guideline2, guideline3, linearLayout, viewA4, scrollView, materialToolbar, imageView, textView3);
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

    public static X c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_confirm_setup_instruction, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9706a;
    }
}
