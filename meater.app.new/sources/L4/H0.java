package L4;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.ProbeNumberTextView;

/* compiled from: ListCookingStateViewBinding.java */
/* loaded from: classes2.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9404a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f9405b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f9406c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f9407d;

    /* renamed from: e, reason: collision with root package name */
    public final Guideline f9408e;

    /* renamed from: f, reason: collision with root package name */
    public final Guideline f9409f;

    /* renamed from: g, reason: collision with root package name */
    public final Guideline f9410g;

    /* renamed from: h, reason: collision with root package name */
    public final ProbeNumberTextView f9411h;

    private H0(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, Guideline guideline, Guideline guideline2, Guideline guideline3, ProbeNumberTextView probeNumberTextView) {
        this.f9404a = constraintLayout;
        this.f9405b = constraintLayout2;
        this.f9406c = appCompatImageView;
        this.f9407d = appCompatTextView;
        this.f9408e = guideline;
        this.f9409f = guideline2;
        this.f9410g = guideline3;
        this.f9411h = probeNumberTextView;
    }

    public static H0 a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.defaultProbeClipNumber;
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
                                return new H0(constraintLayout, constraintLayout, appCompatImageView, appCompatTextView, guideline, guideline2, guideline3, probeNumberTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
