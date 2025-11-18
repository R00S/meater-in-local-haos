package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.ArrowView;
import com.apptionlabs.meater_app.views.DiagonalLinesView;
import com.apptionlabs.meater_app.views.GradientView;

/* compiled from: DonennesViewsBinding.java */
/* loaded from: classes2.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f9554a;

    /* renamed from: b, reason: collision with root package name */
    public final GradientView f9555b;

    /* renamed from: c, reason: collision with root package name */
    public final GradientView f9556c;

    /* renamed from: d, reason: collision with root package name */
    public final GradientView f9557d;

    /* renamed from: e, reason: collision with root package name */
    public final GradientView f9558e;

    /* renamed from: f, reason: collision with root package name */
    public final GradientView f9559f;

    /* renamed from: g, reason: collision with root package name */
    public final GradientView f9560g;

    /* renamed from: h, reason: collision with root package name */
    public final GradientView f9561h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f9562i;

    /* renamed from: j, reason: collision with root package name */
    public final DiagonalLinesView f9563j;

    /* renamed from: k, reason: collision with root package name */
    public final AppCompatTextView f9564k;

    /* renamed from: l, reason: collision with root package name */
    public final AppCompatTextView f9565l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrowView f9566m;

    private P(RelativeLayout relativeLayout, GradientView gradientView, GradientView gradientView2, GradientView gradientView3, GradientView gradientView4, GradientView gradientView5, GradientView gradientView6, GradientView gradientView7, LinearLayout linearLayout, DiagonalLinesView diagonalLinesView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ArrowView arrowView) {
        this.f9554a = relativeLayout;
        this.f9555b = gradientView;
        this.f9556c = gradientView2;
        this.f9557d = gradientView3;
        this.f9558e = gradientView4;
        this.f9559f = gradientView5;
        this.f9560g = gradientView6;
        this.f9561h = gradientView7;
        this.f9562i = linearLayout;
        this.f9563j = diagonalLinesView;
        this.f9564k = appCompatTextView;
        this.f9565l = appCompatTextView2;
        this.f9566m = arrowView;
    }

    public static P a(View view) {
        int i10 = R.id.gView0;
        GradientView gradientView = (GradientView) A3.a.a(view, R.id.gView0);
        if (gradientView != null) {
            i10 = R.id.gView1;
            GradientView gradientView2 = (GradientView) A3.a.a(view, R.id.gView1);
            if (gradientView2 != null) {
                i10 = R.id.gView2;
                GradientView gradientView3 = (GradientView) A3.a.a(view, R.id.gView2);
                if (gradientView3 != null) {
                    i10 = R.id.gView3;
                    GradientView gradientView4 = (GradientView) A3.a.a(view, R.id.gView3);
                    if (gradientView4 != null) {
                        i10 = R.id.gView4;
                        GradientView gradientView5 = (GradientView) A3.a.a(view, R.id.gView4);
                        if (gradientView5 != null) {
                            i10 = R.id.gView5;
                            GradientView gradientView6 = (GradientView) A3.a.a(view, R.id.gView5);
                            if (gradientView6 != null) {
                                i10 = R.id.gView6;
                                GradientView gradientView7 = (GradientView) A3.a.a(view, R.id.gView6);
                                if (gradientView7 != null) {
                                    i10 = R.id.gradientBar;
                                    LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.gradientBar);
                                    if (linearLayout != null) {
                                        i10 = R.id.mView1;
                                        DiagonalLinesView diagonalLinesView = (DiagonalLinesView) A3.a.a(view, R.id.mView1);
                                        if (diagonalLinesView != null) {
                                            i10 = R.id.tView1;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.tView1);
                                            if (appCompatTextView != null) {
                                                i10 = R.id.usdaLinkText1;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.usdaLinkText1);
                                                if (appCompatTextView2 != null) {
                                                    i10 = R.id.viewArrow;
                                                    ArrowView arrowView = (ArrowView) A3.a.a(view, R.id.viewArrow);
                                                    if (arrowView != null) {
                                                        return new P((RelativeLayout) view, gradientView, gradientView2, gradientView3, gradientView4, gradientView5, gradientView6, gradientView7, linearLayout, diagonalLinesView, appCompatTextView, appCompatTextView2, arrowView);
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

    public static P b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.donennes_views, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
