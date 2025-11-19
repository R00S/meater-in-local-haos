package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.TextStepView;

/* compiled from: FragmentRecipePresetStepViewBinding.java */
/* renamed from: L4.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1395p0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10314a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatButton f10315b;

    /* renamed from: c, reason: collision with root package name */
    public final TextStepView f10316c;

    /* renamed from: d, reason: collision with root package name */
    public final Guideline f10317d;

    /* renamed from: e, reason: collision with root package name */
    public final Guideline f10318e;

    /* renamed from: f, reason: collision with root package name */
    public final Guideline f10319f;

    /* renamed from: g, reason: collision with root package name */
    public final Guideline f10320g;

    /* renamed from: h, reason: collision with root package name */
    public final TextStepView f10321h;

    /* renamed from: i, reason: collision with root package name */
    public final TextStepView f10322i;

    /* renamed from: j, reason: collision with root package name */
    public final TextStepView f10323j;

    /* renamed from: k, reason: collision with root package name */
    public final ConstraintLayout f10324k;

    private C1395p0(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, TextStepView textStepView, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, TextStepView textStepView2, TextStepView textStepView3, TextStepView textStepView4, ConstraintLayout constraintLayout2) {
        this.f10314a = constraintLayout;
        this.f10315b = appCompatButton;
        this.f10316c = textStepView;
        this.f10317d = guideline;
        this.f10318e = guideline2;
        this.f10319f = guideline3;
        this.f10320g = guideline4;
        this.f10321h = textStepView2;
        this.f10322i = textStepView3;
        this.f10323j = textStepView4;
        this.f10324k = constraintLayout2;
    }

    public static C1395p0 a(View view) {
        int i10 = R.id.chooseDifferentDoneness;
        AppCompatButton appCompatButton = (AppCompatButton) A3.a.a(view, R.id.chooseDifferentDoneness);
        if (appCompatButton != null) {
            i10 = R.id.cutText;
            TextStepView textStepView = (TextStepView) A3.a.a(view, R.id.cutText);
            if (textStepView != null) {
                i10 = R.id.guidelineBottom;
                Guideline guideline = (Guideline) A3.a.a(view, R.id.guidelineBottom);
                if (guideline != null) {
                    i10 = R.id.guidelineEnd;
                    Guideline guideline2 = (Guideline) A3.a.a(view, R.id.guidelineEnd);
                    if (guideline2 != null) {
                        i10 = R.id.guidelineStart;
                        Guideline guideline3 = (Guideline) A3.a.a(view, R.id.guidelineStart);
                        if (guideline3 != null) {
                            i10 = R.id.guidelineTop;
                            Guideline guideline4 = (Guideline) A3.a.a(view, R.id.guidelineTop);
                            if (guideline4 != null) {
                                i10 = R.id.internalTempText;
                                TextStepView textStepView2 = (TextStepView) A3.a.a(view, R.id.internalTempText);
                                if (textStepView2 != null) {
                                    i10 = R.id.meaterText;
                                    TextStepView textStepView3 = (TextStepView) A3.a.a(view, R.id.meaterText);
                                    if (textStepView3 != null) {
                                        i10 = R.id.recommendText;
                                        TextStepView textStepView4 = (TextStepView) A3.a.a(view, R.id.recommendText);
                                        if (textStepView4 != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                            return new C1395p0(constraintLayout, appCompatButton, textStepView, guideline, guideline2, guideline3, guideline4, textStepView2, textStepView3, textStepView4, constraintLayout);
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

    public static C1395p0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_recipe_preset_step_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10314a;
    }
}
