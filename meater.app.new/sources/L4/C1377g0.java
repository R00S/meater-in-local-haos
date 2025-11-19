package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.DialComponent;
import com.apptionlabs.meater_app.views.RoundedImageWithLabel;
import com.apptionlabs.meater_app.views.TemperatureView;
import com.apptionlabs.meater_app.views.connectionwarning.ConnectionLostImageOverlay;

/* compiled from: FragmentMeaterDetailsBinding.java */
/* renamed from: L4.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1377g0 {

    /* renamed from: a, reason: collision with root package name */
    private final View f10033a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f10034b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f10035c;

    /* renamed from: d, reason: collision with root package name */
    public final RoundedImageWithLabel f10036d;

    /* renamed from: e, reason: collision with root package name */
    public final ConnectionLostImageOverlay f10037e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatTextView f10038f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f10039g;

    /* renamed from: h, reason: collision with root package name */
    public final Guideline f10040h;

    /* renamed from: i, reason: collision with root package name */
    public final Guideline f10041i;

    /* renamed from: j, reason: collision with root package name */
    public final AppCompatImageView f10042j;

    /* renamed from: k, reason: collision with root package name */
    public final RoundedImageWithLabel f10043k;

    /* renamed from: l, reason: collision with root package name */
    public final View f10044l;

    /* renamed from: m, reason: collision with root package name */
    public final RelativeLayout f10045m;

    /* renamed from: n, reason: collision with root package name */
    public final RoundedImageWithLabel f10046n;

    /* renamed from: o, reason: collision with root package name */
    public final AppCompatImageView f10047o;

    /* renamed from: p, reason: collision with root package name */
    public final Guideline f10048p;

    /* renamed from: q, reason: collision with root package name */
    public final Guideline f10049q;

    /* renamed from: r, reason: collision with root package name */
    public final Guideline f10050r;

    /* renamed from: s, reason: collision with root package name */
    public final Guideline f10051s;

    /* renamed from: t, reason: collision with root package name */
    public final TemperatureView f10052t;

    /* renamed from: u, reason: collision with root package name */
    public final TemperatureView f10053u;

    /* renamed from: v, reason: collision with root package name */
    public final TemperatureView f10054v;

    /* renamed from: w, reason: collision with root package name */
    public final DialComponent f10055w;

    /* renamed from: x, reason: collision with root package name */
    public final RelativeLayout f10056x;

    /* renamed from: y, reason: collision with root package name */
    public final Guideline f10057y;

    private C1377g0(View view, AppCompatTextView appCompatTextView, TextView textView, RoundedImageWithLabel roundedImageWithLabel, ConnectionLostImageOverlay connectionLostImageOverlay, AppCompatTextView appCompatTextView2, FrameLayout frameLayout, Guideline guideline, Guideline guideline2, AppCompatImageView appCompatImageView, RoundedImageWithLabel roundedImageWithLabel2, View view2, RelativeLayout relativeLayout, RoundedImageWithLabel roundedImageWithLabel3, AppCompatImageView appCompatImageView2, Guideline guideline3, Guideline guideline4, Guideline guideline5, Guideline guideline6, TemperatureView temperatureView, TemperatureView temperatureView2, TemperatureView temperatureView3, DialComponent dialComponent, RelativeLayout relativeLayout2, Guideline guideline7) {
        this.f10033a = view;
        this.f10034b = appCompatTextView;
        this.f10035c = textView;
        this.f10036d = roundedImageWithLabel;
        this.f10037e = connectionLostImageOverlay;
        this.f10038f = appCompatTextView2;
        this.f10039g = frameLayout;
        this.f10040h = guideline;
        this.f10041i = guideline2;
        this.f10042j = appCompatImageView;
        this.f10043k = roundedImageWithLabel2;
        this.f10044l = view2;
        this.f10045m = relativeLayout;
        this.f10046n = roundedImageWithLabel3;
        this.f10047o = appCompatImageView2;
        this.f10048p = guideline3;
        this.f10049q = guideline4;
        this.f10050r = guideline5;
        this.f10051s = guideline6;
        this.f10052t = temperatureView;
        this.f10053u = temperatureView2;
        this.f10054v = temperatureView3;
        this.f10055w = dialComponent;
        this.f10056x = relativeLayout2;
        this.f10057y = guideline7;
    }

    public static C1377g0 a(View view) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.AdjustLabel);
        TextView textView = (TextView) A3.a.a(view, R.id.alertCounter);
        RoundedImageWithLabel roundedImageWithLabel = (RoundedImageWithLabel) A3.a.a(view, R.id.cancelCookBtn);
        int i10 = R.id.connection_lost_with_image_overlay;
        ConnectionLostImageOverlay connectionLostImageOverlay = (ConnectionLostImageOverlay) A3.a.a(view, R.id.connection_lost_with_image_overlay);
        if (connectionLostImageOverlay != null) {
            i10 = R.id.cookNameLabel;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.cookNameLabel);
            if (appCompatTextView2 != null) {
                FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.counterCircle);
                Guideline guideline = (Guideline) A3.a.a(view, R.id.dialBottom);
                Guideline guideline2 = (Guideline) A3.a.a(view, R.id.dialGuideTop);
                AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.fabAddAlarm);
                RoundedImageWithLabel roundedImageWithLabel2 = (RoundedImageWithLabel) A3.a.a(view, R.id.fabAlertBtn);
                View viewA = A3.a.a(view, R.id.fabBtn);
                RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.fabButtonContainer);
                RoundedImageWithLabel roundedImageWithLabel3 = (RoundedImageWithLabel) A3.a.a(view, R.id.graphBtn);
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) A3.a.a(view, R.id.graphImage);
                Guideline guideline3 = (Guideline) A3.a.a(view, R.id.guideline1);
                Guideline guideline4 = (Guideline) A3.a.a(view, R.id.guideline2);
                Guideline guideline5 = (Guideline) A3.a.a(view, R.id.guideline3);
                Guideline guideline6 = (Guideline) A3.a.a(view, R.id.guideline4);
                i10 = R.id.indicatorAmbient;
                TemperatureView temperatureView = (TemperatureView) A3.a.a(view, R.id.indicatorAmbient);
                if (temperatureView != null) {
                    i10 = R.id.indicatorInternal;
                    TemperatureView temperatureView2 = (TemperatureView) A3.a.a(view, R.id.indicatorInternal);
                    if (temperatureView2 != null) {
                        i10 = R.id.indicatorTarget;
                        TemperatureView temperatureView3 = (TemperatureView) A3.a.a(view, R.id.indicatorTarget);
                        if (temperatureView3 != null) {
                            i10 = R.id.meaterView;
                            DialComponent dialComponent = (DialComponent) A3.a.a(view, R.id.meaterView);
                            if (dialComponent != null) {
                                return new C1377g0(view, appCompatTextView, textView, roundedImageWithLabel, connectionLostImageOverlay, appCompatTextView2, frameLayout, guideline, guideline2, appCompatImageView, roundedImageWithLabel2, viewA, relativeLayout, roundedImageWithLabel3, appCompatImageView2, guideline3, guideline4, guideline5, guideline6, temperatureView, temperatureView2, temperatureView3, dialComponent, (RelativeLayout) A3.a.a(view, R.id.portraitGraphImage), (Guideline) A3.a.a(view, R.id.topLine));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1377g0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_meater_details, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public View b() {
        return this.f10033a;
    }
}
