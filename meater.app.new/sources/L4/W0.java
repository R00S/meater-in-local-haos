package L4;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.ProbeNumberTextView;

/* compiled from: ReadyStateViewsBinding.java */
/* loaded from: classes2.dex */
public final class W0 {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f9695a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f9696b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f9697c;

    /* renamed from: d, reason: collision with root package name */
    public final Guideline f9698d;

    /* renamed from: e, reason: collision with root package name */
    public final Guideline f9699e;

    /* renamed from: f, reason: collision with root package name */
    public final Guideline f9700f;

    /* renamed from: g, reason: collision with root package name */
    public final Guideline f9701g;

    /* renamed from: h, reason: collision with root package name */
    public final ProbeNumberTextView f9702h;

    /* renamed from: i, reason: collision with root package name */
    public final AppCompatTextView f9703i;

    /* renamed from: j, reason: collision with root package name */
    public final AppCompatTextView f9704j;

    /* renamed from: k, reason: collision with root package name */
    public final RelativeLayout f9705k;

    private W0(RelativeLayout relativeLayout, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, ProbeNumberTextView probeNumberTextView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, RelativeLayout relativeLayout2) {
        this.f9695a = relativeLayout;
        this.f9696b = constraintLayout;
        this.f9697c = appCompatImageView;
        this.f9698d = guideline;
        this.f9699e = guideline2;
        this.f9700f = guideline3;
        this.f9701g = guideline4;
        this.f9702h = probeNumberTextView;
        this.f9703i = appCompatTextView;
        this.f9704j = appCompatTextView2;
        this.f9705k = relativeLayout2;
    }

    public static W0 a(View view) {
        int i10 = R.id.backgroundConstraint;
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
                                i10 = R.id.probeNumberText;
                                ProbeNumberTextView probeNumberTextView = (ProbeNumberTextView) A3.a.a(view, R.id.probeNumberText);
                                if (probeNumberTextView != null) {
                                    i10 = R.id.restCookText;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.restCookText);
                                    if (appCompatTextView != null) {
                                        i10 = R.id.restingRemainingText;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.restingRemainingText);
                                        if (appCompatTextView2 != null) {
                                            RelativeLayout relativeLayout = (RelativeLayout) view;
                                            return new W0(relativeLayout, constraintLayout, appCompatImageView, guideline, guideline2, guideline3, guideline4, probeNumberTextView, appCompatTextView, appCompatTextView2, relativeLayout);
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
