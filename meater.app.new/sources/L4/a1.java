package L4;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.ProbeNumberTextView;

/* compiled from: RestingStateViewsBinding.java */
/* loaded from: classes2.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f9831a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f9832b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f9833c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f9834d;

    /* renamed from: e, reason: collision with root package name */
    public final Guideline f9835e;

    /* renamed from: f, reason: collision with root package name */
    public final Guideline f9836f;

    /* renamed from: g, reason: collision with root package name */
    public final Guideline f9837g;

    /* renamed from: h, reason: collision with root package name */
    public final Guideline f9838h;

    /* renamed from: i, reason: collision with root package name */
    public final Guideline f9839i;

    /* renamed from: j, reason: collision with root package name */
    public final Guideline f9840j;

    /* renamed from: k, reason: collision with root package name */
    public final ProbeNumberTextView f9841k;

    /* renamed from: l, reason: collision with root package name */
    public final AppCompatTextView f9842l;

    /* renamed from: m, reason: collision with root package name */
    public final AppCompatTextView f9843m;

    /* renamed from: n, reason: collision with root package name */
    public final RelativeLayout f9844n;

    private a1(RelativeLayout relativeLayout, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, Guideline guideline5, Guideline guideline6, ProbeNumberTextView probeNumberTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, RelativeLayout relativeLayout2) {
        this.f9831a = relativeLayout;
        this.f9832b = appCompatTextView;
        this.f9833c = constraintLayout;
        this.f9834d = appCompatImageView;
        this.f9835e = guideline;
        this.f9836f = guideline2;
        this.f9837g = guideline3;
        this.f9838h = guideline4;
        this.f9839i = guideline5;
        this.f9840j = guideline6;
        this.f9841k = probeNumberTextView;
        this.f9842l = appCompatTextView2;
        this.f9843m = appCompatTextView3;
        this.f9844n = relativeLayout2;
    }

    public static a1 a(View view) {
        int i10 = R.id.almostThere;
        AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.almostThere);
        if (appCompatTextView != null) {
            i10 = R.id.backgroundConstraint;
            ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.backgroundConstraint);
            if (constraintLayout != null) {
                i10 = R.id.defaultProbeClipNumber;
                AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.defaultProbeClipNumber);
                if (appCompatImageView != null) {
                    i10 = R.id.guideline1;
                    Guideline guideline = (Guideline) A3.a.a(view, R.id.guideline1);
                    if (guideline != null) {
                        i10 = R.id.guideline11;
                        Guideline guideline2 = (Guideline) A3.a.a(view, R.id.guideline11);
                        if (guideline2 != null) {
                            i10 = R.id.guideline2;
                            Guideline guideline3 = (Guideline) A3.a.a(view, R.id.guideline2);
                            if (guideline3 != null) {
                                i10 = R.id.guideline3;
                                Guideline guideline4 = (Guideline) A3.a.a(view, R.id.guideline3);
                                if (guideline4 != null) {
                                    i10 = R.id.guideline4;
                                    Guideline guideline5 = (Guideline) A3.a.a(view, R.id.guideline4);
                                    if (guideline5 != null) {
                                        i10 = R.id.guideline5;
                                        Guideline guideline6 = (Guideline) A3.a.a(view, R.id.guideline5);
                                        if (guideline6 != null) {
                                            i10 = R.id.probeNumberText;
                                            ProbeNumberTextView probeNumberTextView = (ProbeNumberTextView) A3.a.a(view, R.id.probeNumberText);
                                            if (probeNumberTextView != null) {
                                                i10 = R.id.restCookText;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.restCookText);
                                                if (appCompatTextView2 != null) {
                                                    i10 = R.id.restingStateTimeLabel;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) A3.a.a(view, R.id.restingStateTimeLabel);
                                                    if (appCompatTextView3 != null) {
                                                        RelativeLayout relativeLayout = (RelativeLayout) view;
                                                        return new a1(relativeLayout, appCompatTextView, constraintLayout, appCompatImageView, guideline, guideline2, guideline3, guideline4, guideline5, guideline6, probeNumberTextView, appCompatTextView2, appCompatTextView3, relativeLayout);
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
}
