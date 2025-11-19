package L4;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.ProbeNumberTextView;

/* compiled from: ReadyToRestViewsBinding.java */
/* loaded from: classes2.dex */
public final class X0 {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f9723a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f9724b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f9725c;

    /* renamed from: d, reason: collision with root package name */
    public final RelativeLayout f9726d;

    /* renamed from: e, reason: collision with root package name */
    public final Guideline f9727e;

    /* renamed from: f, reason: collision with root package name */
    public final Guideline f9728f;

    /* renamed from: g, reason: collision with root package name */
    public final Guideline f9729g;

    /* renamed from: h, reason: collision with root package name */
    public final ProbeNumberTextView f9730h;

    /* renamed from: i, reason: collision with root package name */
    public final AppCompatTextView f9731i;

    private X0(RelativeLayout relativeLayout, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, RelativeLayout relativeLayout2, Guideline guideline, Guideline guideline2, Guideline guideline3, ProbeNumberTextView probeNumberTextView, AppCompatTextView appCompatTextView) {
        this.f9723a = relativeLayout;
        this.f9724b = constraintLayout;
        this.f9725c = appCompatImageView;
        this.f9726d = relativeLayout2;
        this.f9727e = guideline;
        this.f9728f = guideline2;
        this.f9729g = guideline3;
        this.f9730h = probeNumberTextView;
        this.f9731i = appCompatTextView;
    }

    public static X0 a(View view) {
        int i10 = R.id.backgroundConstraint;
        ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.backgroundConstraint);
        if (constraintLayout != null) {
            i10 = R.id.defaultProbeClipNumber;
            AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.defaultProbeClipNumber);
            if (appCompatImageView != null) {
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
                            i10 = R.id.probeNumberText;
                            ProbeNumberTextView probeNumberTextView = (ProbeNumberTextView) A3.a.a(view, R.id.probeNumberText);
                            if (probeNumberTextView != null) {
                                i10 = R.id.removeFromHeatText;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.removeFromHeatText);
                                if (appCompatTextView != null) {
                                    return new X0(relativeLayout, constraintLayout, appCompatImageView, relativeLayout, guideline, guideline2, guideline3, probeNumberTextView, appCompatTextView);
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
