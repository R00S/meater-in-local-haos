package L4;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.ProbeNumberTextView;

/* compiled from: ListRestingStateViewBinding.java */
/* loaded from: classes2.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9503a;

    /* renamed from: b, reason: collision with root package name */
    public final View f9504b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f9505c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f9506d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f9507e;

    /* renamed from: f, reason: collision with root package name */
    public final Guideline f9508f;

    /* renamed from: g, reason: collision with root package name */
    public final Guideline f9509g;

    /* renamed from: h, reason: collision with root package name */
    public final Guideline f9510h;

    /* renamed from: i, reason: collision with root package name */
    public final ProbeNumberTextView f9511i;

    private L0(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, Guideline guideline, Guideline guideline2, Guideline guideline3, ProbeNumberTextView probeNumberTextView) {
        this.f9503a = constraintLayout;
        this.f9504b = view;
        this.f9505c = constraintLayout2;
        this.f9506d = appCompatImageView;
        this.f9507e = appCompatTextView;
        this.f9508f = guideline;
        this.f9509g = guideline2;
        this.f9510h = guideline3;
        this.f9511i = probeNumberTextView;
    }

    public static L0 a(View view) {
        int i10 = R.id.backgroundView;
        View viewA = A3.a.a(view, R.id.backgroundView);
        if (viewA != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = R.id.defaultProbeClipNumber;
            AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.defaultProbeClipNumber);
            if (appCompatImageView != null) {
                i10 = R.id.estimateLabel;
                AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.estimateLabel);
                if (appCompatTextView != null) {
                    i10 = R.id.guideline1;
                    Guideline guideline = (Guideline) A3.a.a(view, R.id.guideline1);
                    if (guideline != null) {
                        i10 = R.id.guideline2;
                        Guideline guideline2 = (Guideline) A3.a.a(view, R.id.guideline2);
                        if (guideline2 != null) {
                            i10 = R.id.guideline3;
                            Guideline guideline3 = (Guideline) A3.a.a(view, R.id.guideline3);
                            if (guideline3 != null) {
                                i10 = R.id.probeNumberText;
                                ProbeNumberTextView probeNumberTextView = (ProbeNumberTextView) A3.a.a(view, R.id.probeNumberText);
                                if (probeNumberTextView != null) {
                                    return new L0(constraintLayout, viewA, constraintLayout, appCompatImageView, appCompatTextView, guideline, guideline2, guideline3, probeNumberTextView);
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
