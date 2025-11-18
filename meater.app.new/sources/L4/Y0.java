package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.media3.ui.PlayerView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.TextStepView;

/* compiled from: RecipeListItemBinding.java */
/* loaded from: classes2.dex */
public final class Y0 {

    /* renamed from: a, reason: collision with root package name */
    private final CardView f9759a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayoutCompat f9760b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f9761c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f9762d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayoutCompat f9763e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayoutCompat f9764f;

    /* renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f9765g;

    /* renamed from: h, reason: collision with root package name */
    public final AppCompatImageView f9766h;

    /* renamed from: i, reason: collision with root package name */
    public final AppCompatTextView f9767i;

    /* renamed from: j, reason: collision with root package name */
    public final Guideline f9768j;

    /* renamed from: k, reason: collision with root package name */
    public final Guideline f9769k;

    /* renamed from: l, reason: collision with root package name */
    public final Guideline f9770l;

    /* renamed from: m, reason: collision with root package name */
    public final Guideline f9771m;

    /* renamed from: n, reason: collision with root package name */
    public final AppCompatImageView f9772n;

    /* renamed from: o, reason: collision with root package name */
    public final AppCompatImageView f9773o;

    /* renamed from: p, reason: collision with root package name */
    public final AppCompatImageView f9774p;

    /* renamed from: q, reason: collision with root package name */
    public final FrameLayout f9775q;

    /* renamed from: r, reason: collision with root package name */
    public final PlayerView f9776r;

    /* renamed from: s, reason: collision with root package name */
    public final ProgressBar f9777s;

    /* renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f9778t;

    /* renamed from: u, reason: collision with root package name */
    public final TextStepView f9779u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f9780v;

    /* renamed from: w, reason: collision with root package name */
    public final TextStepView f9781w;

    private Y0(CardView cardView, LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView3, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, FrameLayout frameLayout, PlayerView playerView, ProgressBar progressBar, ConstraintLayout constraintLayout, TextStepView textStepView, ImageView imageView, TextStepView textStepView2) {
        this.f9759a = cardView;
        this.f9760b = linearLayoutCompat;
        this.f9761c = appCompatImageView;
        this.f9762d = appCompatTextView;
        this.f9763e = linearLayoutCompat2;
        this.f9764f = linearLayoutCompat3;
        this.f9765g = appCompatTextView2;
        this.f9766h = appCompatImageView2;
        this.f9767i = appCompatTextView3;
        this.f9768j = guideline;
        this.f9769k = guideline2;
        this.f9770l = guideline3;
        this.f9771m = guideline4;
        this.f9772n = appCompatImageView3;
        this.f9773o = appCompatImageView4;
        this.f9774p = appCompatImageView5;
        this.f9775q = frameLayout;
        this.f9776r = playerView;
        this.f9777s = progressBar;
        this.f9778t = constraintLayout;
        this.f9779u = textStepView;
        this.f9780v = imageView;
        this.f9781w = textStepView2;
    }

    public static Y0 a(View view) {
        int i10 = R.id.applianceHolder;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) A3.a.a(view, R.id.applianceHolder);
        if (linearLayoutCompat != null) {
            i10 = R.id.applianceImage;
            AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.applianceImage);
            if (appCompatImageView != null) {
                i10 = R.id.applianceText;
                AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.applianceText);
                if (appCompatTextView != null) {
                    i10 = R.id.bottomHolder;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) A3.a.a(view, R.id.bottomHolder);
                    if (linearLayoutCompat2 != null) {
                        i10 = R.id.complexityHolder;
                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) A3.a.a(view, R.id.complexityHolder);
                        if (linearLayoutCompat3 != null) {
                            i10 = R.id.complexityText;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.complexityText);
                            if (appCompatTextView2 != null) {
                                i10 = R.id.durationImage;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) A3.a.a(view, R.id.durationImage);
                                if (appCompatImageView2 != null) {
                                    i10 = R.id.durationText;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) A3.a.a(view, R.id.durationText);
                                    if (appCompatTextView3 != null) {
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
                                                        i10 = R.id.imgComplexity1;
                                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) A3.a.a(view, R.id.imgComplexity1);
                                                        if (appCompatImageView3 != null) {
                                                            i10 = R.id.imgComplexity2;
                                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) A3.a.a(view, R.id.imgComplexity2);
                                                            if (appCompatImageView4 != null) {
                                                                i10 = R.id.imgComplexity3;
                                                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) A3.a.a(view, R.id.imgComplexity3);
                                                                if (appCompatImageView5 != null) {
                                                                    i10 = R.id.media_container;
                                                                    FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.media_container);
                                                                    if (frameLayout != null) {
                                                                        i10 = R.id.playerView;
                                                                        PlayerView playerView = (PlayerView) A3.a.a(view, R.id.playerView);
                                                                        if (playerView != null) {
                                                                            i10 = R.id.progressBar;
                                                                            ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.progressBar);
                                                                            if (progressBar != null) {
                                                                                i10 = R.id.rootView;
                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.rootView);
                                                                                if (constraintLayout != null) {
                                                                                    i10 = R.id.subtitle;
                                                                                    TextStepView textStepView = (TextStepView) A3.a.a(view, R.id.subtitle);
                                                                                    if (textStepView != null) {
                                                                                        i10 = R.id.thumbnail;
                                                                                        ImageView imageView = (ImageView) A3.a.a(view, R.id.thumbnail);
                                                                                        if (imageView != null) {
                                                                                            i10 = R.id.title;
                                                                                            TextStepView textStepView2 = (TextStepView) A3.a.a(view, R.id.title);
                                                                                            if (textStepView2 != null) {
                                                                                                return new Y0((CardView) view, linearLayoutCompat, appCompatImageView, appCompatTextView, linearLayoutCompat2, linearLayoutCompat3, appCompatTextView2, appCompatImageView2, appCompatTextView3, guideline, guideline2, guideline3, guideline4, appCompatImageView3, appCompatImageView4, appCompatImageView5, frameLayout, playerView, progressBar, constraintLayout, textStepView, imageView, textStepView2);
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

    public static Y0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.recipe_list_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CardView b() {
        return this.f9759a;
    }
}
