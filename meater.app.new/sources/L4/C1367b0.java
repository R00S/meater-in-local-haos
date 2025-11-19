package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.CookSummaryDonennessView;

/* compiled from: FragmentGraphDetailBinding.java */
/* renamed from: L4.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1367b0 {

    /* renamed from: a, reason: collision with root package name */
    private final ScrollView f9862a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f9863b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f9864c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f9865d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f9866e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f9867f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f9868g;

    /* renamed from: h, reason: collision with root package name */
    public final View f9869h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f9870i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f9871j;

    /* renamed from: k, reason: collision with root package name */
    public final CookSummaryDonennessView f9872k;

    /* renamed from: l, reason: collision with root package name */
    public final View f9873l;

    /* renamed from: m, reason: collision with root package name */
    public final View f9874m;

    /* renamed from: n, reason: collision with root package name */
    public final ImageView f9875n;

    private C1367b0(ScrollView scrollView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view, TextView textView5, TextView textView6, CookSummaryDonennessView cookSummaryDonennessView, View view2, View view3, ImageView imageView) {
        this.f9862a = scrollView;
        this.f9863b = appCompatTextView;
        this.f9864c = appCompatImageView;
        this.f9865d = textView;
        this.f9866e = textView2;
        this.f9867f = textView3;
        this.f9868g = textView4;
        this.f9869h = view;
        this.f9870i = textView5;
        this.f9871j = textView6;
        this.f9872k = cookSummaryDonennessView;
        this.f9873l = view2;
        this.f9874m = view3;
        this.f9875n = imageView;
    }

    public static C1367b0 a(View view) {
        int i10 = R.id.cook_description;
        AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.cook_description);
        if (appCompatTextView != null) {
            i10 = R.id.cook_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.cook_icon);
            if (appCompatImageView != null) {
                i10 = R.id.cook_started;
                TextView textView = (TextView) A3.a.a(view, R.id.cook_started);
                if (textView != null) {
                    i10 = R.id.cook_started_value;
                    TextView textView2 = (TextView) A3.a.a(view, R.id.cook_started_value);
                    if (textView2 != null) {
                        i10 = R.id.cookTime;
                        TextView textView3 = (TextView) A3.a.a(view, R.id.cookTime);
                        if (textView3 != null) {
                            i10 = R.id.cookTimeLabel;
                            TextView textView4 = (TextView) A3.a.a(view, R.id.cookTimeLabel);
                            if (textView4 != null) {
                                i10 = R.id.estimateDivider;
                                View viewA = A3.a.a(view, R.id.estimateDivider);
                                if (viewA != null) {
                                    i10 = R.id.estimateLabel;
                                    TextView textView5 = (TextView) A3.a.a(view, R.id.estimateLabel);
                                    if (textView5 != null) {
                                        i10 = R.id.estimateTime;
                                        TextView textView6 = (TextView) A3.a.a(view, R.id.estimateTime);
                                        if (textView6 != null) {
                                            i10 = R.id.gradientBarLayout;
                                            CookSummaryDonennessView cookSummaryDonennessView = (CookSummaryDonennessView) A3.a.a(view, R.id.gradientBarLayout);
                                            if (cookSummaryDonennessView != null) {
                                                i10 = R.id.top_divider_3;
                                                View viewA2 = A3.a.a(view, R.id.top_divider_3);
                                                if (viewA2 != null) {
                                                    i10 = R.id.top_divider_4;
                                                    View viewA3 = A3.a.a(view, R.id.top_divider_4);
                                                    if (viewA3 != null) {
                                                        i10 = R.id.usdaImage;
                                                        ImageView imageView = (ImageView) A3.a.a(view, R.id.usdaImage);
                                                        if (imageView != null) {
                                                            return new C1367b0((ScrollView) view, appCompatTextView, appCompatImageView, textView, textView2, textView3, textView4, viewA, textView5, textView6, cookSummaryDonennessView, viewA2, viewA3, imageView);
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

    public static C1367b0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_graph_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.f9862a;
    }
}
