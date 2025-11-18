package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.media3.ui.PlayerView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.TextStepView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;

/* compiled from: FragmentRecipeSummaryBinding.java */
/* renamed from: L4.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1400s0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10543a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f10544b;

    /* renamed from: c, reason: collision with root package name */
    public final Guideline f10545c;

    /* renamed from: d, reason: collision with root package name */
    public final Guideline f10546d;

    /* renamed from: e, reason: collision with root package name */
    public final Guideline f10547e;

    /* renamed from: f, reason: collision with root package name */
    public final Guideline f10548f;

    /* renamed from: g, reason: collision with root package name */
    public final Guideline f10549g;

    /* renamed from: h, reason: collision with root package name */
    public final Guideline f10550h;

    /* renamed from: i, reason: collision with root package name */
    public final FrameLayout f10551i;

    /* renamed from: j, reason: collision with root package name */
    public final PlayerView f10552j;

    /* renamed from: k, reason: collision with root package name */
    public final ConstraintLayout f10553k;

    /* renamed from: l, reason: collision with root package name */
    public final MaterialButton f10554l;

    /* renamed from: m, reason: collision with root package name */
    public final TextStepView f10555m;

    /* renamed from: n, reason: collision with root package name */
    public final TabLayout f10556n;

    /* renamed from: o, reason: collision with root package name */
    public final ImageView f10557o;

    /* renamed from: p, reason: collision with root package name */
    public final TextStepView f10558p;

    private C1400s0(ConstraintLayout constraintLayout, FrameLayout frameLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, Guideline guideline5, Guideline guideline6, FrameLayout frameLayout2, PlayerView playerView, ConstraintLayout constraintLayout2, MaterialButton materialButton, TextStepView textStepView, TabLayout tabLayout, ImageView imageView, TextStepView textStepView2) {
        this.f10543a = constraintLayout;
        this.f10544b = frameLayout;
        this.f10545c = guideline;
        this.f10546d = guideline2;
        this.f10547e = guideline3;
        this.f10548f = guideline4;
        this.f10549g = guideline5;
        this.f10550h = guideline6;
        this.f10551i = frameLayout2;
        this.f10552j = playerView;
        this.f10553k = constraintLayout2;
        this.f10554l = materialButton;
        this.f10555m = textStepView;
        this.f10556n = tabLayout;
        this.f10557o = imageView;
        this.f10558p = textStepView2;
    }

    public static C1400s0 a(View view) {
        int i10 = R.id.container;
        FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.container);
        if (frameLayout != null) {
            Guideline guideline = (Guideline) A3.a.a(view, R.id.guidelineBottom);
            i10 = R.id.guidelineEnd;
            Guideline guideline2 = (Guideline) A3.a.a(view, R.id.guidelineEnd);
            if (guideline2 != null) {
                Guideline guideline3 = (Guideline) A3.a.a(view, R.id.guidelineMiddle);
                Guideline guideline4 = (Guideline) A3.a.a(view, R.id.guidelinePlayerMiddle);
                i10 = R.id.guidelineStart;
                Guideline guideline5 = (Guideline) A3.a.a(view, R.id.guidelineStart);
                if (guideline5 != null) {
                    i10 = R.id.guidelineTop;
                    Guideline guideline6 = (Guideline) A3.a.a(view, R.id.guidelineTop);
                    if (guideline6 != null) {
                        i10 = R.id.mediaContainer;
                        FrameLayout frameLayout2 = (FrameLayout) A3.a.a(view, R.id.mediaContainer);
                        if (frameLayout2 != null) {
                            i10 = R.id.playerView;
                            PlayerView playerView = (PlayerView) A3.a.a(view, R.id.playerView);
                            if (playerView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i10 = R.id.startButton;
                                MaterialButton materialButton = (MaterialButton) A3.a.a(view, R.id.startButton);
                                if (materialButton != null) {
                                    i10 = R.id.subtitleText;
                                    TextStepView textStepView = (TextStepView) A3.a.a(view, R.id.subtitleText);
                                    if (textStepView != null) {
                                        i10 = R.id.tabs;
                                        TabLayout tabLayout = (TabLayout) A3.a.a(view, R.id.tabs);
                                        if (tabLayout != null) {
                                            i10 = R.id.thumbnail;
                                            ImageView imageView = (ImageView) A3.a.a(view, R.id.thumbnail);
                                            if (imageView != null) {
                                                i10 = R.id.titleText;
                                                TextStepView textStepView2 = (TextStepView) A3.a.a(view, R.id.titleText);
                                                if (textStepView2 != null) {
                                                    return new C1400s0(constraintLayout, frameLayout, guideline, guideline2, guideline3, guideline4, guideline5, guideline6, frameLayout2, playerView, constraintLayout, materialButton, textStepView, tabLayout, imageView, textStepView2);
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

    public static C1400s0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_recipe_summary, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10543a;
    }
}
