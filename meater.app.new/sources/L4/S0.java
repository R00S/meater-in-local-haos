package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.ArrowView;
import com.apptionlabs.meater_app.views.GradientView;

/* compiled from: PresetRowRangesBinding.java */
/* loaded from: classes2.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f9594a;

    /* renamed from: b, reason: collision with root package name */
    public final RelativeLayout f9595b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f9596c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f9597d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f9598e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatTextView f9599f;

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f9600g;

    /* renamed from: h, reason: collision with root package name */
    public final RelativeLayout f9601h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f9602i;

    /* renamed from: j, reason: collision with root package name */
    public final GradientView f9603j;

    /* renamed from: k, reason: collision with root package name */
    public final ImageView f9604k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrowView f9605l;

    private S0(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView, ImageView imageView2, TextView textView, AppCompatTextView appCompatTextView, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, ImageView imageView3, GradientView gradientView, ImageView imageView4, ArrowView arrowView) {
        this.f9594a = relativeLayout;
        this.f9595b = relativeLayout2;
        this.f9596c = imageView;
        this.f9597d = imageView2;
        this.f9598e = textView;
        this.f9599f = appCompatTextView;
        this.f9600g = relativeLayout3;
        this.f9601h = relativeLayout4;
        this.f9602i = imageView3;
        this.f9603j = gradientView;
        this.f9604k = imageView4;
        this.f9605l = arrowView;
    }

    public static S0 a(View view) {
        int i10 = R.id.frontSquare;
        RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.frontSquare);
        if (relativeLayout != null) {
            i10 = R.id.imgLogo;
            ImageView imageView = (ImageView) A3.a.a(view, R.id.imgLogo);
            if (imageView != null) {
                i10 = R.id.presetImage;
                ImageView imageView2 = (ImageView) A3.a.a(view, R.id.presetImage);
                if (imageView2 != null) {
                    i10 = R.id.presetTemp;
                    TextView textView = (TextView) A3.a.a(view, R.id.presetTemp);
                    if (textView != null) {
                        i10 = R.id.presetText;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.presetText);
                        if (appCompatTextView != null) {
                            RelativeLayout relativeLayout2 = (RelativeLayout) view;
                            i10 = R.id.row;
                            RelativeLayout relativeLayout3 = (RelativeLayout) A3.a.a(view, R.id.row);
                            if (relativeLayout3 != null) {
                                i10 = R.id.tickImage;
                                ImageView imageView3 = (ImageView) A3.a.a(view, R.id.tickImage);
                                if (imageView3 != null) {
                                    i10 = R.id.tickImageBack;
                                    GradientView gradientView = (GradientView) A3.a.a(view, R.id.tickImageBack);
                                    if (gradientView != null) {
                                        i10 = R.id.usdaImage;
                                        ImageView imageView4 = (ImageView) A3.a.a(view, R.id.usdaImage);
                                        if (imageView4 != null) {
                                            i10 = R.id.viewArrow;
                                            ArrowView arrowView = (ArrowView) A3.a.a(view, R.id.viewArrow);
                                            if (arrowView != null) {
                                                return new S0(relativeLayout2, relativeLayout, imageView, imageView2, textView, appCompatTextView, relativeLayout2, relativeLayout3, imageView3, gradientView, imageView4, arrowView);
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

    public static S0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.preset_row_ranges, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.f9594a;
    }
}
