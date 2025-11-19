package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.GradientView;

/* compiled from: UsdaHelpRowBinding.java */
/* loaded from: classes2.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10295a;

    /* renamed from: b, reason: collision with root package name */
    public final RelativeLayout f10296b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f10297c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f10298d;

    /* renamed from: e, reason: collision with root package name */
    public final GradientView f10299e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatTextView f10300f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f10301g;

    /* renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f10302h;

    /* renamed from: i, reason: collision with root package name */
    public final ConstraintLayout f10303i;

    /* renamed from: j, reason: collision with root package name */
    public final GradientView f10304j;

    private o1(ConstraintLayout constraintLayout, RelativeLayout relativeLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, GradientView gradientView, AppCompatTextView appCompatTextView3, ImageView imageView, AppCompatTextView appCompatTextView4, ConstraintLayout constraintLayout2, GradientView gradientView2) {
        this.f10295a = constraintLayout;
        this.f10296b = relativeLayout;
        this.f10297c = appCompatTextView;
        this.f10298d = appCompatTextView2;
        this.f10299e = gradientView;
        this.f10300f = appCompatTextView3;
        this.f10301g = imageView;
        this.f10302h = appCompatTextView4;
        this.f10303i = constraintLayout2;
        this.f10304j = gradientView2;
    }

    public static o1 a(View view) {
        int i10 = R.id.DescriptionView;
        RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.DescriptionView);
        if (relativeLayout != null) {
            i10 = R.id.descriptionText;
            AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.descriptionText);
            if (appCompatTextView != null) {
                i10 = R.id.descriptionValue;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.descriptionValue);
                if (appCompatTextView2 != null) {
                    i10 = R.id.gradientCircle;
                    GradientView gradientView = (GradientView) A3.a.a(view, R.id.gradientCircle);
                    if (gradientView != null) {
                        i10 = R.id.presetText;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) A3.a.a(view, R.id.presetText);
                        if (appCompatTextView3 != null) {
                            i10 = R.id.rangeImage;
                            ImageView imageView = (ImageView) A3.a.a(view, R.id.rangeImage);
                            if (imageView != null) {
                                i10 = R.id.rangeText;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) A3.a.a(view, R.id.rangeText);
                                if (appCompatTextView4 != null) {
                                    i10 = R.id.rootView;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.rootView);
                                    if (constraintLayout != null) {
                                        i10 = R.id.whiteCircle;
                                        GradientView gradientView2 = (GradientView) A3.a.a(view, R.id.whiteCircle);
                                        if (gradientView2 != null) {
                                            return new o1((ConstraintLayout) view, relativeLayout, appCompatTextView, appCompatTextView2, gradientView, appCompatTextView3, imageView, appCompatTextView4, constraintLayout, gradientView2);
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

    public static o1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.usda_help_row, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10295a;
    }
}
