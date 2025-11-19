package L4;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.ProbeNumberTextView;

/* compiled from: ListReadyToRestViewBinding.java */
/* loaded from: classes2.dex */
public final class K0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9463a;

    /* renamed from: b, reason: collision with root package name */
    public final View f9464b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f9465c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f9466d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f9467e;

    /* renamed from: f, reason: collision with root package name */
    public final Guideline f9468f;

    /* renamed from: g, reason: collision with root package name */
    public final Guideline f9469g;

    /* renamed from: h, reason: collision with root package name */
    public final Guideline f9470h;

    /* renamed from: i, reason: collision with root package name */
    public final ProbeNumberTextView f9471i;

    private K0(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, Guideline guideline, Guideline guideline2, Guideline guideline3, ProbeNumberTextView probeNumberTextView) {
        this.f9463a = constraintLayout;
        this.f9464b = view;
        this.f9465c = constraintLayout2;
        this.f9466d = appCompatImageView;
        this.f9467e = appCompatTextView;
        this.f9468f = guideline;
        this.f9469g = guideline2;
        this.f9470h = guideline3;
        this.f9471i = probeNumberTextView;
    }

    public static K0 a(View view) {
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
                                    return new K0(constraintLayout, viewA, constraintLayout, appCompatImageView, appCompatTextView, guideline, guideline2, guideline3, probeNumberTextView);
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
