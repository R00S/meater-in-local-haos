package L4;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.ProbeNumberTextView;

/* compiled from: ListReadyStateViewBinding.java */
/* loaded from: classes2.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9442a;

    /* renamed from: b, reason: collision with root package name */
    public final View f9443b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f9444c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f9445d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f9446e;

    /* renamed from: f, reason: collision with root package name */
    public final Guideline f9447f;

    /* renamed from: g, reason: collision with root package name */
    public final Guideline f9448g;

    /* renamed from: h, reason: collision with root package name */
    public final Guideline f9449h;

    /* renamed from: i, reason: collision with root package name */
    public final ProbeNumberTextView f9450i;

    private J0(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, Guideline guideline, Guideline guideline2, Guideline guideline3, ProbeNumberTextView probeNumberTextView) {
        this.f9442a = constraintLayout;
        this.f9443b = view;
        this.f9444c = constraintLayout2;
        this.f9445d = appCompatImageView;
        this.f9446e = appCompatTextView;
        this.f9447f = guideline;
        this.f9448g = guideline2;
        this.f9449h = guideline3;
        this.f9450i = probeNumberTextView;
    }

    public static J0 a(View view) {
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
                                    return new J0(constraintLayout, viewA, constraintLayout, appCompatImageView, appCompatTextView, guideline, guideline2, guideline3, probeNumberTextView);
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
