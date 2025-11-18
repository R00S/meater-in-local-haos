package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.StepProgressView;
import com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.TitleTextStepView;
import com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.VideoViewStepView;
import com.google.android.material.button.MaterialButton;

/* compiled from: FragmentRecipeStepBinding.java */
/* renamed from: L4.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1398r0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10496a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayoutCompat f10497b;

    /* renamed from: c, reason: collision with root package name */
    public final View f10498c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutCompat f10499d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialButton f10500e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialButton f10501f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialButton f10502g;

    /* renamed from: h, reason: collision with root package name */
    public final FrameLayout f10503h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f10504i;

    /* renamed from: j, reason: collision with root package name */
    public final Guideline f10505j;

    /* renamed from: k, reason: collision with root package name */
    public final Guideline f10506k;

    /* renamed from: l, reason: collision with root package name */
    public final Guideline f10507l;

    /* renamed from: m, reason: collision with root package name */
    public final Guideline f10508m;

    /* renamed from: n, reason: collision with root package name */
    public final Guideline f10509n;

    /* renamed from: o, reason: collision with root package name */
    public final Guideline f10510o;

    /* renamed from: p, reason: collision with root package name */
    public final FrameLayout f10511p;

    /* renamed from: q, reason: collision with root package name */
    public final NestedScrollView f10512q;

    /* renamed from: r, reason: collision with root package name */
    public final FrameLayout f10513r;

    /* renamed from: s, reason: collision with root package name */
    public final StepProgressView f10514s;

    /* renamed from: t, reason: collision with root package name */
    public final StepProgressView f10515t;

    /* renamed from: u, reason: collision with root package name */
    public final TitleTextStepView f10516u;

    /* renamed from: v, reason: collision with root package name */
    public final View f10517v;

    /* renamed from: w, reason: collision with root package name */
    public final VideoViewStepView f10518w;

    private C1398r0(ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, View view, LinearLayoutCompat linearLayoutCompat2, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, FrameLayout frameLayout, LinearLayout linearLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, Guideline guideline5, Guideline guideline6, FrameLayout frameLayout2, NestedScrollView nestedScrollView, FrameLayout frameLayout3, StepProgressView stepProgressView, StepProgressView stepProgressView2, TitleTextStepView titleTextStepView, View view2, VideoViewStepView videoViewStepView) {
        this.f10496a = constraintLayout;
        this.f10497b = linearLayoutCompat;
        this.f10498c = view;
        this.f10499d = linearLayoutCompat2;
        this.f10500e = materialButton;
        this.f10501f = materialButton2;
        this.f10502g = materialButton3;
        this.f10503h = frameLayout;
        this.f10504i = linearLayout;
        this.f10505j = guideline;
        this.f10506k = guideline2;
        this.f10507l = guideline3;
        this.f10508m = guideline4;
        this.f10509n = guideline5;
        this.f10510o = guideline6;
        this.f10511p = frameLayout2;
        this.f10512q = nestedScrollView;
        this.f10513r = frameLayout3;
        this.f10514s = stepProgressView;
        this.f10515t = stepProgressView2;
        this.f10516u = titleTextStepView;
        this.f10517v = view2;
        this.f10518w = videoViewStepView;
    }

    public static C1398r0 a(View view) {
        int i10 = R.id.bottomContentHolder;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) A3.a.a(view, R.id.bottomContentHolder);
        if (linearLayoutCompat != null) {
            View viewA = A3.a.a(view, R.id.bottomViewSpace);
            i10 = R.id.buttonHolder;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) A3.a.a(view, R.id.buttonHolder);
            if (linearLayoutCompat2 != null) {
                MaterialButton materialButton = (MaterialButton) A3.a.a(view, R.id.buttonLandscapeNext);
                i10 = R.id.buttonNext;
                MaterialButton materialButton2 = (MaterialButton) A3.a.a(view, R.id.buttonNext);
                if (materialButton2 != null) {
                    i10 = R.id.buttonSkip;
                    MaterialButton materialButton3 = (MaterialButton) A3.a.a(view, R.id.buttonSkip);
                    if (materialButton3 != null) {
                        i10 = R.id.container;
                        FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.container);
                        if (frameLayout != null) {
                            LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.containerHolder);
                            i10 = R.id.guidelineBottom;
                            Guideline guideline = (Guideline) A3.a.a(view, R.id.guidelineBottom);
                            if (guideline != null) {
                                i10 = R.id.guidelineEnd;
                                Guideline guideline2 = (Guideline) A3.a.a(view, R.id.guidelineEnd);
                                if (guideline2 != null) {
                                    i10 = R.id.guidelineMiddle;
                                    Guideline guideline3 = (Guideline) A3.a.a(view, R.id.guidelineMiddle);
                                    if (guideline3 != null) {
                                        i10 = R.id.guidelinePlayerMiddle;
                                        Guideline guideline4 = (Guideline) A3.a.a(view, R.id.guidelinePlayerMiddle);
                                        if (guideline4 != null) {
                                            i10 = R.id.guidelineStart;
                                            Guideline guideline5 = (Guideline) A3.a.a(view, R.id.guidelineStart);
                                            if (guideline5 != null) {
                                                i10 = R.id.guidelineTop;
                                                Guideline guideline6 = (Guideline) A3.a.a(view, R.id.guidelineTop);
                                                if (guideline6 != null) {
                                                    FrameLayout frameLayout2 = (FrameLayout) A3.a.a(view, R.id.landscapeContainer);
                                                    NestedScrollView nestedScrollView = (NestedScrollView) A3.a.a(view, R.id.nestedScrollView);
                                                    FrameLayout frameLayout3 = (FrameLayout) A3.a.a(view, R.id.probeSelectionContainer);
                                                    i10 = R.id.stepProgress;
                                                    StepProgressView stepProgressView = (StepProgressView) A3.a.a(view, R.id.stepProgress);
                                                    if (stepProgressView != null) {
                                                        StepProgressView stepProgressView2 = (StepProgressView) A3.a.a(view, R.id.stepProgressDevice);
                                                        i10 = R.id.titleTextStepView;
                                                        TitleTextStepView titleTextStepView = (TitleTextStepView) A3.a.a(view, R.id.titleTextStepView);
                                                        if (titleTextStepView != null) {
                                                            View viewA2 = A3.a.a(view, R.id.transparentView);
                                                            i10 = R.id.videoView;
                                                            VideoViewStepView videoViewStepView = (VideoViewStepView) A3.a.a(view, R.id.videoView);
                                                            if (videoViewStepView != null) {
                                                                return new C1398r0((ConstraintLayout) view, linearLayoutCompat, viewA, linearLayoutCompat2, materialButton, materialButton2, materialButton3, frameLayout, linearLayout, guideline, guideline2, guideline3, guideline4, guideline5, guideline6, frameLayout2, nestedScrollView, frameLayout3, stepProgressView, stepProgressView2, titleTextStepView, viewA2, videoViewStepView);
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

    public static C1398r0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_recipe_step, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10496a;
    }
}
