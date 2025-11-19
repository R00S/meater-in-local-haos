package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.CookGraph;
import com.apptionlabs.meater_app.views.CookSummaryDonennessView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: SocialShareFragmentBinding.java */
/* loaded from: classes2.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10058a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f10059b;

    /* renamed from: c, reason: collision with root package name */
    public final AppBarLayout f10060c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f10061d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f10062e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f10063f;

    /* renamed from: g, reason: collision with root package name */
    public final AppCompatImageView f10064g;

    /* renamed from: h, reason: collision with root package name */
    public final CookGraph f10065h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10066i;

    /* renamed from: j, reason: collision with root package name */
    public final LinearLayout f10067j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f10068k;

    /* renamed from: l, reason: collision with root package name */
    public final CookSummaryDonennessView f10069l;

    /* renamed from: m, reason: collision with root package name */
    public final ImageView f10070m;

    /* renamed from: n, reason: collision with root package name */
    public final ImageView f10071n;

    /* renamed from: o, reason: collision with root package name */
    public final SwitchCompat f10072o;

    /* renamed from: p, reason: collision with root package name */
    public final SwitchCompat f10073p;

    /* renamed from: q, reason: collision with root package name */
    public final SwitchCompat f10074q;

    /* renamed from: r, reason: collision with root package name */
    public final MaterialToolbar f10075r;

    private g1(ConstraintLayout constraintLayout, TextView textView, AppBarLayout appBarLayout, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, LinearLayout linearLayout, AppCompatImageView appCompatImageView, CookGraph cookGraph, TextView textView2, LinearLayout linearLayout2, LinearLayout linearLayout3, CookSummaryDonennessView cookSummaryDonennessView, ImageView imageView, ImageView imageView2, SwitchCompat switchCompat, SwitchCompat switchCompat2, SwitchCompat switchCompat3, MaterialToolbar materialToolbar) {
        this.f10058a = constraintLayout;
        this.f10059b = textView;
        this.f10060c = appBarLayout;
        this.f10061d = constraintLayout2;
        this.f10062e = appCompatTextView;
        this.f10063f = linearLayout;
        this.f10064g = appCompatImageView;
        this.f10065h = cookGraph;
        this.f10066i = textView2;
        this.f10067j = linearLayout2;
        this.f10068k = linearLayout3;
        this.f10069l = cookSummaryDonennessView;
        this.f10070m = imageView;
        this.f10071n = imageView2;
        this.f10072o = switchCompat;
        this.f10073p = switchCompat2;
        this.f10074q = switchCompat3;
        this.f10075r = materialToolbar;
    }

    public static g1 a(View view) {
        int i10 = R.id.addPhotoText;
        TextView textView = (TextView) A3.a.a(view, R.id.addPhotoText);
        if (textView != null) {
            i10 = R.id.appBarLayout;
            AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
            if (appBarLayout != null) {
                i10 = R.id.baseLayoutContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.baseLayoutContainer);
                if (constraintLayout != null) {
                    i10 = R.id.cookDescription;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.cookDescription);
                    if (appCompatTextView != null) {
                        i10 = R.id.cookDetails;
                        LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.cookDetails);
                        if (linearLayout != null) {
                            i10 = R.id.cookIcon;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.cookIcon);
                            if (appCompatImageView != null) {
                                i10 = R.id.graph;
                                CookGraph cookGraph = (CookGraph) A3.a.a(view, R.id.graph);
                                if (cookGraph != null) {
                                    i10 = R.id.hashTagText;
                                    TextView textView2 = (TextView) A3.a.a(view, R.id.hashTagText);
                                    if (textView2 != null) {
                                        i10 = R.id.shareCombineLayout;
                                        LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.shareCombineLayout);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.share_cook_details;
                                            LinearLayout linearLayout3 = (LinearLayout) A3.a.a(view, R.id.share_cook_details);
                                            if (linearLayout3 != null) {
                                                i10 = R.id.shareGradientBarLayout;
                                                CookSummaryDonennessView cookSummaryDonennessView = (CookSummaryDonennessView) A3.a.a(view, R.id.shareGradientBarLayout);
                                                if (cookSummaryDonennessView != null) {
                                                    i10 = R.id.shareImage1;
                                                    ImageView imageView = (ImageView) A3.a.a(view, R.id.shareImage1);
                                                    if (imageView != null) {
                                                        i10 = R.id.shareLogo;
                                                        ImageView imageView2 = (ImageView) A3.a.a(view, R.id.shareLogo);
                                                        if (imageView2 != null) {
                                                            i10 = R.id.showCookDetail;
                                                            SwitchCompat switchCompat = (SwitchCompat) A3.a.a(view, R.id.showCookDetail);
                                                            if (switchCompat != null) {
                                                                i10 = R.id.showGraph;
                                                                SwitchCompat switchCompat2 = (SwitchCompat) A3.a.a(view, R.id.showGraph);
                                                                if (switchCompat2 != null) {
                                                                    i10 = R.id.showPhoto;
                                                                    SwitchCompat switchCompat3 = (SwitchCompat) A3.a.a(view, R.id.showPhoto);
                                                                    if (switchCompat3 != null) {
                                                                        i10 = R.id.toolbar;
                                                                        MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                                                                        if (materialToolbar != null) {
                                                                            return new g1((ConstraintLayout) view, textView, appBarLayout, constraintLayout, appCompatTextView, linearLayout, appCompatImageView, cookGraph, textView2, linearLayout2, linearLayout3, cookSummaryDonennessView, imageView, imageView2, switchCompat, switchCompat2, switchCompat3, materialToolbar);
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

    public static g1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.social_share_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10058a;
    }
}
