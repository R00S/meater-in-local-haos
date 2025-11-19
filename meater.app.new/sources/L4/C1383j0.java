package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.RoundedLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: FragmentPreviousCooksBinding.java */
/* renamed from: L4.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1383j0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10152a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f10153b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10154c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10155d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10156e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10157f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f10158g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f10159h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10160i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10161j;

    /* renamed from: k, reason: collision with root package name */
    public final View f10162k;

    /* renamed from: l, reason: collision with root package name */
    public final LinearLayout f10163l;

    /* renamed from: m, reason: collision with root package name */
    public final RoundedLayout f10164m;

    /* renamed from: n, reason: collision with root package name */
    public final RecyclerView f10165n;

    /* renamed from: o, reason: collision with root package name */
    public final ProgressBar f10166o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f10167p;

    /* renamed from: q, reason: collision with root package name */
    public final SearchView f10168q;

    /* renamed from: r, reason: collision with root package name */
    public final SwipeRefreshLayout f10169r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f10170s;

    /* renamed from: t, reason: collision with root package name */
    public final MaterialToolbar f10171t;

    /* renamed from: u, reason: collision with root package name */
    public final LinearLayout f10172u;

    private C1383j0(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView4, TextView textView5, View view, LinearLayout linearLayout3, RoundedLayout roundedLayout, RecyclerView recyclerView, ProgressBar progressBar, TextView textView6, SearchView searchView, SwipeRefreshLayout swipeRefreshLayout, TextView textView7, MaterialToolbar materialToolbar, LinearLayout linearLayout4) {
        this.f10152a = constraintLayout;
        this.f10153b = appBarLayout;
        this.f10154c = imageView;
        this.f10155d = textView;
        this.f10156e = textView2;
        this.f10157f = textView3;
        this.f10158g = linearLayout;
        this.f10159h = linearLayout2;
        this.f10160i = textView4;
        this.f10161j = textView5;
        this.f10162k = view;
        this.f10163l = linearLayout3;
        this.f10164m = roundedLayout;
        this.f10165n = recyclerView;
        this.f10166o = progressBar;
        this.f10167p = textView6;
        this.f10168q = searchView;
        this.f10169r = swipeRefreshLayout;
        this.f10170s = textView7;
        this.f10171t = materialToolbar;
        this.f10172u = linearLayout4;
    }

    public static C1383j0 a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.clockImage;
            ImageView imageView = (ImageView) A3.a.a(view, R.id.clockImage);
            if (imageView != null) {
                i10 = R.id.cloudLayoutText;
                TextView textView = (TextView) A3.a.a(view, R.id.cloudLayoutText);
                if (textView != null) {
                    i10 = R.id.cloudLayoutTitleText;
                    TextView textView2 = (TextView) A3.a.a(view, R.id.cloudLayoutTitleText);
                    if (textView2 != null) {
                        i10 = R.id.cloudLoginButtonText;
                        TextView textView3 = (TextView) A3.a.a(view, R.id.cloudLoginButtonText);
                        if (textView3 != null) {
                            i10 = R.id.cloud_login_layout;
                            LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.cloud_login_layout);
                            if (linearLayout != null) {
                                i10 = R.id.emptyCookContainer;
                                LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.emptyCookContainer);
                                if (linearLayout2 != null) {
                                    i10 = R.id.moreInformationText;
                                    TextView textView4 = (TextView) A3.a.a(view, R.id.moreInformationText);
                                    if (textView4 != null) {
                                        i10 = R.id.noResultsText;
                                        TextView textView5 = (TextView) A3.a.a(view, R.id.noResultsText);
                                        if (textView5 != null) {
                                            i10 = R.id.pCookHeader;
                                            View viewA = A3.a.a(view, R.id.pCookHeader);
                                            if (viewA != null) {
                                                i10 = R.id.previousCookContainer;
                                                LinearLayout linearLayout3 = (LinearLayout) A3.a.a(view, R.id.previousCookContainer);
                                                if (linearLayout3 != null) {
                                                    i10 = R.id.previousCookRoundedView;
                                                    RoundedLayout roundedLayout = (RoundedLayout) A3.a.a(view, R.id.previousCookRoundedView);
                                                    if (roundedLayout != null) {
                                                        i10 = R.id.previousCooksRecyclerView;
                                                        RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.previousCooksRecyclerView);
                                                        if (recyclerView != null) {
                                                            i10 = R.id.progressBar;
                                                            ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.progressBar);
                                                            if (progressBar != null) {
                                                                i10 = R.id.searchTextView;
                                                                TextView textView6 = (TextView) A3.a.a(view, R.id.searchTextView);
                                                                if (textView6 != null) {
                                                                    i10 = R.id.searchView;
                                                                    SearchView searchView = (SearchView) A3.a.a(view, R.id.searchView);
                                                                    if (searchView != null) {
                                                                        i10 = R.id.swipRefreshLayout;
                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) A3.a.a(view, R.id.swipRefreshLayout);
                                                                        if (swipeRefreshLayout != null) {
                                                                            i10 = R.id.titleText;
                                                                            TextView textView7 = (TextView) A3.a.a(view, R.id.titleText);
                                                                            if (textView7 != null) {
                                                                                i10 = R.id.toolbar;
                                                                                MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                                                                                if (materialToolbar != null) {
                                                                                    i10 = R.id.top_layout;
                                                                                    LinearLayout linearLayout4 = (LinearLayout) A3.a.a(view, R.id.top_layout);
                                                                                    if (linearLayout4 != null) {
                                                                                        return new C1383j0((ConstraintLayout) view, appBarLayout, imageView, textView, textView2, textView3, linearLayout, linearLayout2, textView4, textView5, viewA, linearLayout3, roundedLayout, recyclerView, progressBar, textView6, searchView, swipeRefreshLayout, textView7, materialToolbar, linearLayout4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1383j0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_previous_cooks, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10152a;
    }
}
