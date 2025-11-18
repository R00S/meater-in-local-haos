package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.CookGraph;
import com.apptionlabs.meater_app.views.TemperatureView;
import com.apptionlabs.meater_app.views.connectionwarning.ConnectionLostImageOverlay;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;

/* compiled from: FragmentTemperatureGraphBinding.java */
/* renamed from: L4.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1408w0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10702a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f10703b;

    /* renamed from: c, reason: collision with root package name */
    public final ConnectionLostImageOverlay f10704c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f10705d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f10706e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10707f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10708g;

    /* renamed from: h, reason: collision with root package name */
    public final CookGraph f10709h;

    /* renamed from: i, reason: collision with root package name */
    public final ProgressBar f10710i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10711j;

    /* renamed from: k, reason: collision with root package name */
    public final AppCompatRatingBar f10712k;

    /* renamed from: l, reason: collision with root package name */
    public final RelativeLayout f10713l;

    /* renamed from: m, reason: collision with root package name */
    public final ScrollView f10714m;

    /* renamed from: n, reason: collision with root package name */
    public final FrameLayout f10715n;

    /* renamed from: o, reason: collision with root package name */
    public final TabLayout f10716o;

    /* renamed from: p, reason: collision with root package name */
    public final TemperatureView f10717p;

    /* renamed from: q, reason: collision with root package name */
    public final TemperatureView f10718q;

    /* renamed from: r, reason: collision with root package name */
    public final TemperatureView f10719r;

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f10720s;

    /* renamed from: t, reason: collision with root package name */
    public final MaterialToolbar f10721t;

    private C1408w0(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, ConnectionLostImageOverlay connectionLostImageOverlay, ConstraintLayout constraintLayout2, LinearLayout linearLayout, TextView textView, TextView textView2, CookGraph cookGraph, ProgressBar progressBar, TextView textView3, AppCompatRatingBar appCompatRatingBar, RelativeLayout relativeLayout, ScrollView scrollView, FrameLayout frameLayout, TabLayout tabLayout, TemperatureView temperatureView, TemperatureView temperatureView2, TemperatureView temperatureView3, ConstraintLayout constraintLayout3, MaterialToolbar materialToolbar) {
        this.f10702a = constraintLayout;
        this.f10703b = appBarLayout;
        this.f10704c = connectionLostImageOverlay;
        this.f10705d = constraintLayout2;
        this.f10706e = linearLayout;
        this.f10707f = textView;
        this.f10708g = textView2;
        this.f10709h = cookGraph;
        this.f10710i = progressBar;
        this.f10711j = textView3;
        this.f10712k = appCompatRatingBar;
        this.f10713l = relativeLayout;
        this.f10714m = scrollView;
        this.f10715n = frameLayout;
        this.f10716o = tabLayout;
        this.f10717p = temperatureView;
        this.f10718q = temperatureView2;
        this.f10719r = temperatureView3;
        this.f10720s = constraintLayout3;
        this.f10721t = materialToolbar;
    }

    public static C1408w0 a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.connection_lost_with_image_overlay;
            ConnectionLostImageOverlay connectionLostImageOverlay = (ConnectionLostImageOverlay) A3.a.a(view, R.id.connection_lost_with_image_overlay);
            if (connectionLostImageOverlay != null) {
                i10 = R.id.cookSummaryRow;
                ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.cookSummaryRow);
                if (constraintLayout != null) {
                    i10 = R.id.fetchingHistoryLabel;
                    LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.fetchingHistoryLabel);
                    if (linearLayout != null) {
                        i10 = R.id.fetchingHistoryText;
                        TextView textView = (TextView) A3.a.a(view, R.id.fetchingHistoryText);
                        if (textView != null) {
                            i10 = R.id.fetchingHistoryTittle;
                            TextView textView2 = (TextView) A3.a.a(view, R.id.fetchingHistoryTittle);
                            if (textView2 != null) {
                                i10 = R.id.graph;
                                CookGraph cookGraph = (CookGraph) A3.a.a(view, R.id.graph);
                                if (cookGraph != null) {
                                    i10 = R.id.loading;
                                    ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.loading);
                                    if (progressBar != null) {
                                        i10 = R.id.rateText;
                                        TextView textView3 = (TextView) A3.a.a(view, R.id.rateText);
                                        if (textView3 != null) {
                                            i10 = R.id.ratingBar;
                                            AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) A3.a.a(view, R.id.ratingBar);
                                            if (appCompatRatingBar != null) {
                                                i10 = R.id.ratingBarLayout;
                                                RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.ratingBarLayout);
                                                if (relativeLayout != null) {
                                                    i10 = R.id.signInScroll;
                                                    ScrollView scrollView = (ScrollView) A3.a.a(view, R.id.signInScroll);
                                                    if (scrollView != null) {
                                                        i10 = R.id.simpleFrameLayout;
                                                        FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.simpleFrameLayout);
                                                        if (frameLayout != null) {
                                                            i10 = R.id.tabLayout;
                                                            TabLayout tabLayout = (TabLayout) A3.a.a(view, R.id.tabLayout);
                                                            if (tabLayout != null) {
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
                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) A3.a.a(view, R.id.temperatureRow);
                                                                            if (constraintLayout2 != null) {
                                                                                i10 = R.id.toolbar;
                                                                                MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                                                                                if (materialToolbar != null) {
                                                                                    return new C1408w0((ConstraintLayout) view, appBarLayout, connectionLostImageOverlay, constraintLayout, linearLayout, textView, textView2, cookGraph, progressBar, textView3, appCompatRatingBar, relativeLayout, scrollView, frameLayout, tabLayout, temperatureView, temperatureView2, temperatureView3, constraintLayout2, materialToolbar);
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
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1408w0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_temperature_graph, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10702a;
    }
}
