package L4;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.ProbeNumberTextView;

/* compiled from: CookingStateViewsBinding.java */
/* loaded from: classes2.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9451a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f9452b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f9453c;

    /* renamed from: d, reason: collision with root package name */
    public final Guideline f9454d;

    /* renamed from: e, reason: collision with root package name */
    public final Guideline f9455e;

    /* renamed from: f, reason: collision with root package name */
    public final Guideline f9456f;

    /* renamed from: g, reason: collision with root package name */
    public final Guideline f9457g;

    /* renamed from: h, reason: collision with root package name */
    public final ProgressBar f9458h;

    /* renamed from: i, reason: collision with root package name */
    public final ProbeNumberTextView f9459i;

    /* renamed from: j, reason: collision with root package name */
    public final AppCompatTextView f9460j;

    /* renamed from: k, reason: collision with root package name */
    public final Guideline f9461k;

    /* renamed from: l, reason: collision with root package name */
    public final AppCompatTextView f9462l;

    private K(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, ProgressBar progressBar, ProbeNumberTextView probeNumberTextView, AppCompatTextView appCompatTextView2, Guideline guideline5, AppCompatTextView appCompatTextView3) {
        this.f9451a = constraintLayout;
        this.f9452b = appCompatImageView;
        this.f9453c = appCompatTextView;
        this.f9454d = guideline;
        this.f9455e = guideline2;
        this.f9456f = guideline3;
        this.f9457g = guideline4;
        this.f9458h = progressBar;
        this.f9459i = probeNumberTextView;
        this.f9460j = appCompatTextView2;
        this.f9461k = guideline5;
        this.f9462l = appCompatTextView3;
    }

    public static K a(View view) {
        int i10 = R.id.defaultProbeClipNumber;
        AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.defaultProbeClipNumber);
        if (appCompatImageView != null) {
            i10 = R.id.estimatedTextView;
            AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.estimatedTextView);
            if (appCompatTextView != null) {
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
                                i10 = R.id.mProgressBar;
                                ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.mProgressBar);
                                if (progressBar != null) {
                                    i10 = R.id.probeNumberText;
                                    ProbeNumberTextView probeNumberTextView = (ProbeNumberTextView) A3.a.a(view, R.id.probeNumberText);
                                    if (probeNumberTextView != null) {
                                        i10 = R.id.timeLabel;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.timeLabel);
                                        if (appCompatTextView2 != null) {
                                            i10 = R.id.timeLabelBottomLine;
                                            Guideline guideline5 = (Guideline) A3.a.a(view, R.id.timeLabelBottomLine);
                                            if (guideline5 != null) {
                                                i10 = R.id.timeValue;
                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) A3.a.a(view, R.id.timeValue);
                                                if (appCompatTextView3 != null) {
                                                    return new K((ConstraintLayout) view, appCompatImageView, appCompatTextView, guideline, guideline2, guideline3, guideline4, progressBar, probeNumberTextView, appCompatTextView2, guideline5, appCompatTextView3);
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
