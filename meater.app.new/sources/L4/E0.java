package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.DialComponent;
import com.apptionlabs.meater_app.views.ProbeConnectionStatusView;
import com.apptionlabs.meater_app.views.TemperatureView;
import ru.rambler.libs.swipe_layout.SwipeLayout;

/* compiled from: ItemMeaterCardsBinding.java */
/* loaded from: classes2.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    private final SwipeLayout f9325a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f9326b;

    /* renamed from: c, reason: collision with root package name */
    public final Guideline f9327c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f9328d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f9329e;

    /* renamed from: f, reason: collision with root package name */
    public final ProbeConnectionStatusView f9330f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f9331g;

    /* renamed from: h, reason: collision with root package name */
    public final Guideline f9332h;

    /* renamed from: i, reason: collision with root package name */
    public final Guideline f9333i;

    /* renamed from: j, reason: collision with root package name */
    public final Guideline f9334j;

    /* renamed from: k, reason: collision with root package name */
    public final View f9335k;

    /* renamed from: l, reason: collision with root package name */
    public final ConstraintLayout f9336l;

    /* renamed from: m, reason: collision with root package name */
    public final DialComponent f9337m;

    /* renamed from: n, reason: collision with root package name */
    public final Guideline f9338n;

    /* renamed from: o, reason: collision with root package name */
    public final AppCompatTextView f9339o;

    /* renamed from: p, reason: collision with root package name */
    public final AppCompatImageView f9340p;

    /* renamed from: q, reason: collision with root package name */
    public final FrameLayout f9341q;

    /* renamed from: r, reason: collision with root package name */
    public final SwipeLayout f9342r;

    /* renamed from: s, reason: collision with root package name */
    public final TemperatureView f9343s;

    /* renamed from: t, reason: collision with root package name */
    public final TemperatureView f9344t;

    /* renamed from: u, reason: collision with root package name */
    public final TemperatureView f9345u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f9346v;

    /* renamed from: w, reason: collision with root package name */
    public final AppCompatTextView f9347w;

    private E0(SwipeLayout swipeLayout, ConstraintLayout constraintLayout, Guideline guideline, AppCompatTextView appCompatTextView, LinearLayout linearLayout, ProbeConnectionStatusView probeConnectionStatusView, TextView textView, Guideline guideline2, Guideline guideline3, Guideline guideline4, View view, ConstraintLayout constraintLayout2, DialComponent dialComponent, Guideline guideline5, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, FrameLayout frameLayout, SwipeLayout swipeLayout2, TemperatureView temperatureView, TemperatureView temperatureView2, TemperatureView temperatureView3, LinearLayout linearLayout2, AppCompatTextView appCompatTextView3) {
        this.f9325a = swipeLayout;
        this.f9326b = constraintLayout;
        this.f9327c = guideline;
        this.f9328d = appCompatTextView;
        this.f9329e = linearLayout;
        this.f9330f = probeConnectionStatusView;
        this.f9331g = textView;
        this.f9332h = guideline2;
        this.f9333i = guideline3;
        this.f9334j = guideline4;
        this.f9335k = view;
        this.f9336l = constraintLayout2;
        this.f9337m = dialComponent;
        this.f9338n = guideline5;
        this.f9339o = appCompatTextView2;
        this.f9340p = appCompatImageView;
        this.f9341q = frameLayout;
        this.f9342r = swipeLayout2;
        this.f9343s = temperatureView;
        this.f9344t = temperatureView2;
        this.f9345u = temperatureView3;
        this.f9346v = linearLayout2;
        this.f9347w = appCompatTextView3;
    }

    public static E0 a(View view) {
        int i10 = R.id.baseLayoutContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.baseLayoutContainer);
        if (constraintLayout != null) {
            Guideline guideline = (Guideline) A3.a.a(view, R.id.bottomGuideLine);
            AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.cancel_button);
            LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.cancel_cook_button);
            i10 = R.id.connection_image;
            ProbeConnectionStatusView probeConnectionStatusView = (ProbeConnectionStatusView) A3.a.a(view, R.id.connection_image);
            if (probeConnectionStatusView != null) {
                i10 = R.id.debug_info;
                TextView textView = (TextView) A3.a.a(view, R.id.debug_info);
                if (textView != null) {
                    Guideline guideline2 = (Guideline) A3.a.a(view, R.id.dialVertical);
                    i10 = R.id.guideline;
                    Guideline guideline3 = (Guideline) A3.a.a(view, R.id.guideline);
                    if (guideline3 != null) {
                        i10 = R.id.guideline1;
                        Guideline guideline4 = (Guideline) A3.a.a(view, R.id.guideline1);
                        if (guideline4 != null) {
                            View viewA = A3.a.a(view, R.id.hiddenBottomView);
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) A3.a.a(view, R.id.innerView);
                            i10 = R.id.meaterView;
                            DialComponent dialComponent = (DialComponent) A3.a.a(view, R.id.meaterView);
                            if (dialComponent != null) {
                                Guideline guideline5 = (Guideline) A3.a.a(view, R.id.nameLeftGuideLine);
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.recipe_step);
                                AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.recipe_step_image);
                                i10 = R.id.row_back_ground_container;
                                FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.row_back_ground_container);
                                if (frameLayout != null) {
                                    SwipeLayout swipeLayout = (SwipeLayout) view;
                                    i10 = R.id.tempIndicatorAmbient;
                                    TemperatureView temperatureView = (TemperatureView) A3.a.a(view, R.id.tempIndicatorAmbient);
                                    if (temperatureView != null) {
                                        i10 = R.id.tempIndicatorInternal;
                                        TemperatureView temperatureView2 = (TemperatureView) A3.a.a(view, R.id.tempIndicatorInternal);
                                        if (temperatureView2 != null) {
                                            i10 = R.id.tempIndicatorTarget;
                                            TemperatureView temperatureView3 = (TemperatureView) A3.a.a(view, R.id.tempIndicatorTarget);
                                            if (temperatureView3 != null) {
                                                i10 = R.id.temperatureRow;
                                                LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.temperatureRow);
                                                if (linearLayout2 != null) {
                                                    i10 = R.id.text_cook_name;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) A3.a.a(view, R.id.text_cook_name);
                                                    if (appCompatTextView3 != null) {
                                                        return new E0(swipeLayout, constraintLayout, guideline, appCompatTextView, linearLayout, probeConnectionStatusView, textView, guideline2, guideline3, guideline4, viewA, constraintLayout2, dialComponent, guideline5, appCompatTextView2, appCompatImageView, frameLayout, swipeLayout, temperatureView, temperatureView2, temperatureView3, linearLayout2, appCompatTextView3);
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

    public static E0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_meater_cards, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public SwipeLayout b() {
        return this.f9325a;
    }
}
