package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.TextStepView;

/* compiled from: FragmentRecipeDescriptionBinding.java */
/* renamed from: L4.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1391n0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10256a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayoutCompat f10257b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f10258c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f10259d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayoutCompat f10260e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatTextView f10261f;

    /* renamed from: g, reason: collision with root package name */
    public final ScrollView f10262g;

    /* renamed from: h, reason: collision with root package name */
    public final TextStepView f10263h;

    /* renamed from: i, reason: collision with root package name */
    public final View f10264i;

    /* renamed from: j, reason: collision with root package name */
    public final AppCompatImageView f10265j;

    /* renamed from: k, reason: collision with root package name */
    public final AppCompatTextView f10266k;

    /* renamed from: l, reason: collision with root package name */
    public final AppCompatImageView f10267l;

    /* renamed from: m, reason: collision with root package name */
    public final AppCompatImageView f10268m;

    /* renamed from: n, reason: collision with root package name */
    public final AppCompatImageView f10269n;

    /* renamed from: o, reason: collision with root package name */
    public final LinearLayoutCompat f10270o;

    private C1391n0(ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, LinearLayoutCompat linearLayoutCompat2, AppCompatTextView appCompatTextView2, ScrollView scrollView, TextStepView textStepView, View view, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, LinearLayoutCompat linearLayoutCompat3) {
        this.f10256a = constraintLayout;
        this.f10257b = linearLayoutCompat;
        this.f10258c = appCompatImageView;
        this.f10259d = appCompatTextView;
        this.f10260e = linearLayoutCompat2;
        this.f10261f = appCompatTextView2;
        this.f10262g = scrollView;
        this.f10263h = textStepView;
        this.f10264i = view;
        this.f10265j = appCompatImageView2;
        this.f10266k = appCompatTextView3;
        this.f10267l = appCompatImageView3;
        this.f10268m = appCompatImageView4;
        this.f10269n = appCompatImageView5;
        this.f10270o = linearLayoutCompat3;
    }

    public static C1391n0 a(View view) {
        int i10 = R.id.applianceHolder;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) A3.a.a(view, R.id.applianceHolder);
        if (linearLayoutCompat != null) {
            i10 = R.id.applianceImage;
            AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.applianceImage);
            if (appCompatImageView != null) {
                i10 = R.id.applianceText;
                AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.applianceText);
                if (appCompatTextView != null) {
                    i10 = R.id.complexityHolder;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) A3.a.a(view, R.id.complexityHolder);
                    if (linearLayoutCompat2 != null) {
                        i10 = R.id.complexityText;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.complexityText);
                        if (appCompatTextView2 != null) {
                            ScrollView scrollView = (ScrollView) A3.a.a(view, R.id.descriptionScrollview);
                            i10 = R.id.descriptionText;
                            TextStepView textStepView = (TextStepView) A3.a.a(view, R.id.descriptionText);
                            if (textStepView != null) {
                                i10 = R.id.divider;
                                View viewA = A3.a.a(view, R.id.divider);
                                if (viewA != null) {
                                    i10 = R.id.durationImage;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) A3.a.a(view, R.id.durationImage);
                                    if (appCompatImageView2 != null) {
                                        i10 = R.id.durationText;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) A3.a.a(view, R.id.durationText);
                                        if (appCompatTextView3 != null) {
                                            i10 = R.id.imgComplexity1;
                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) A3.a.a(view, R.id.imgComplexity1);
                                            if (appCompatImageView3 != null) {
                                                i10 = R.id.imgComplexity2;
                                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) A3.a.a(view, R.id.imgComplexity2);
                                                if (appCompatImageView4 != null) {
                                                    i10 = R.id.imgComplexity3;
                                                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) A3.a.a(view, R.id.imgComplexity3);
                                                    if (appCompatImageView5 != null) {
                                                        i10 = R.id.summaryHolder;
                                                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) A3.a.a(view, R.id.summaryHolder);
                                                        if (linearLayoutCompat3 != null) {
                                                            return new C1391n0((ConstraintLayout) view, linearLayoutCompat, appCompatImageView, appCompatTextView, linearLayoutCompat2, appCompatTextView2, scrollView, textStepView, viewA, appCompatImageView2, appCompatTextView3, appCompatImageView3, appCompatImageView4, appCompatImageView5, linearLayoutCompat3);
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

    public static C1391n0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_recipe_description, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10256a;
    }
}
