package L4;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.ProbeNumberTextView;

/* compiled from: NoSetupStateViewBinding.java */
/* loaded from: classes2.dex */
public final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f9574a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f9575b;

    /* renamed from: c, reason: collision with root package name */
    public final RelativeLayout f9576c;

    /* renamed from: d, reason: collision with root package name */
    public final Guideline f9577d;

    /* renamed from: e, reason: collision with root package name */
    public final Guideline f9578e;

    /* renamed from: f, reason: collision with root package name */
    public final Guideline f9579f;

    /* renamed from: g, reason: collision with root package name */
    public final Guideline f9580g;

    /* renamed from: h, reason: collision with root package name */
    public final ProbeNumberTextView f9581h;

    /* renamed from: i, reason: collision with root package name */
    public final AppCompatTextView f9582i;

    /* renamed from: j, reason: collision with root package name */
    public final AppCompatTextView f9583j;

    private Q0(RelativeLayout relativeLayout, ConstraintLayout constraintLayout, RelativeLayout relativeLayout2, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, ProbeNumberTextView probeNumberTextView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f9574a = relativeLayout;
        this.f9575b = constraintLayout;
        this.f9576c = relativeLayout2;
        this.f9577d = guideline;
        this.f9578e = guideline2;
        this.f9579f = guideline3;
        this.f9580g = guideline4;
        this.f9581h = probeNumberTextView;
        this.f9582i = appCompatTextView;
        this.f9583j = appCompatTextView2;
    }

    public static Q0 a(View view) {
        int i10 = R.id.backgroundConstraint;
        ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.backgroundConstraint);
        if (constraintLayout != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
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
                                i10 = R.id.setUpCookText;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.setUpCookText);
                                if (appCompatTextView != null) {
                                    i10 = R.id.tapToSetupText;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.tapToSetupText);
                                    if (appCompatTextView2 != null) {
                                        return new Q0(relativeLayout, constraintLayout, relativeLayout, guideline, guideline2, guideline3, guideline4, probeNumberTextView, appCompatTextView, appCompatTextView2);
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
