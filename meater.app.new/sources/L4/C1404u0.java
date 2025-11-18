package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.MEATERScalesView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: FragmentSetupsConfirmBinding.java */
/* renamed from: L4.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1404u0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10613a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f10614b;

    /* renamed from: c, reason: collision with root package name */
    public final NestedScrollView f10615c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f10616d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f10617e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatImageView f10618f;

    /* renamed from: g, reason: collision with root package name */
    public final AppCompatImageView f10619g;

    /* renamed from: h, reason: collision with root package name */
    public final AppCompatImageView f10620h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f10621i;

    /* renamed from: j, reason: collision with root package name */
    public final AppCompatEditText f10622j;

    /* renamed from: k, reason: collision with root package name */
    public final ImageView f10623k;

    /* renamed from: l, reason: collision with root package name */
    public final LinearLayout f10624l;

    /* renamed from: m, reason: collision with root package name */
    public final RelativeLayout f10625m;

    /* renamed from: n, reason: collision with root package name */
    public final RecyclerView f10626n;

    /* renamed from: o, reason: collision with root package name */
    public final LinearLayout f10627o;

    /* renamed from: p, reason: collision with root package name */
    public final View f10628p;

    /* renamed from: q, reason: collision with root package name */
    public final View f10629q;

    /* renamed from: r, reason: collision with root package name */
    public final MEATERScalesView f10630r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f10631s;

    /* renamed from: t, reason: collision with root package name */
    public final AppCompatImageView f10632t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialToolbar f10633u;

    /* renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f10634v;

    /* renamed from: w, reason: collision with root package name */
    public final View f10635w;

    /* renamed from: x, reason: collision with root package name */
    public final AppCompatTextView f10636x;

    private C1404u0(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, NestedScrollView nestedScrollView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, ImageView imageView, AppCompatEditText appCompatEditText, ImageView imageView2, LinearLayout linearLayout, RelativeLayout relativeLayout, RecyclerView recyclerView, LinearLayout linearLayout2, View view, View view2, MEATERScalesView mEATERScalesView, TextView textView, AppCompatImageView appCompatImageView6, MaterialToolbar materialToolbar, ConstraintLayout constraintLayout2, View view3, AppCompatTextView appCompatTextView) {
        this.f10613a = constraintLayout;
        this.f10614b = appBarLayout;
        this.f10615c = nestedScrollView;
        this.f10616d = appCompatImageView;
        this.f10617e = appCompatImageView2;
        this.f10618f = appCompatImageView3;
        this.f10619g = appCompatImageView4;
        this.f10620h = appCompatImageView5;
        this.f10621i = imageView;
        this.f10622j = appCompatEditText;
        this.f10623k = imageView2;
        this.f10624l = linearLayout;
        this.f10625m = relativeLayout;
        this.f10626n = recyclerView;
        this.f10627o = linearLayout2;
        this.f10628p = view;
        this.f10629q = view2;
        this.f10630r = mEATERScalesView;
        this.f10631s = textView;
        this.f10632t = appCompatImageView6;
        this.f10633u = materialToolbar;
        this.f10634v = constraintLayout2;
        this.f10635w = view3;
        this.f10636x = appCompatTextView;
    }

    public static C1404u0 a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.baseScroll;
            NestedScrollView nestedScrollView = (NestedScrollView) A3.a.a(view, R.id.baseScroll);
            if (nestedScrollView != null) {
                i10 = R.id.clipImage;
                AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.clipImage);
                if (appCompatImageView != null) {
                    i10 = R.id.clipImage1;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) A3.a.a(view, R.id.clipImage1);
                    if (appCompatImageView2 != null) {
                        i10 = R.id.clipImage2;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) A3.a.a(view, R.id.clipImage2);
                        if (appCompatImageView3 != null) {
                            i10 = R.id.clipImage3;
                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) A3.a.a(view, R.id.clipImage3);
                            if (appCompatImageView4 != null) {
                                i10 = R.id.clipImage4;
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) A3.a.a(view, R.id.clipImage4);
                                if (appCompatImageView5 != null) {
                                    i10 = R.id.clipInfo;
                                    ImageView imageView = (ImageView) A3.a.a(view, R.id.clipInfo);
                                    if (imageView != null) {
                                        i10 = R.id.cookNameField;
                                        AppCompatEditText appCompatEditText = (AppCompatEditText) A3.a.a(view, R.id.cookNameField);
                                        if (appCompatEditText != null) {
                                            i10 = R.id.image;
                                            ImageView imageView2 = (ImageView) A3.a.a(view, R.id.image);
                                            if (imageView2 != null) {
                                                i10 = R.id.layoutUsda;
                                                LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.layoutUsda);
                                                if (linearLayout != null) {
                                                    i10 = R.id.nameLayout;
                                                    RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.nameLayout);
                                                    if (relativeLayout != null) {
                                                        i10 = R.id.preset_recycler_view;
                                                        RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.preset_recycler_view);
                                                        if (recyclerView != null) {
                                                            i10 = R.id.probeClipLayout;
                                                            LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.probeClipLayout);
                                                            if (linearLayout2 != null) {
                                                                i10 = R.id.scaleBottomDivider;
                                                                View viewA = A3.a.a(view, R.id.scaleBottomDivider);
                                                                if (viewA != null) {
                                                                    i10 = R.id.scaleTopDivider;
                                                                    View viewA2 = A3.a.a(view, R.id.scaleTopDivider);
                                                                    if (viewA2 != null) {
                                                                        i10 = R.id.temp_picker;
                                                                        MEATERScalesView mEATERScalesView = (MEATERScalesView) A3.a.a(view, R.id.temp_picker);
                                                                        if (mEATERScalesView != null) {
                                                                            i10 = R.id.titleDetail;
                                                                            TextView textView = (TextView) A3.a.a(view, R.id.titleDetail);
                                                                            if (textView != null) {
                                                                                i10 = R.id.titleImage;
                                                                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) A3.a.a(view, R.id.titleImage);
                                                                                if (appCompatImageView6 != null) {
                                                                                    i10 = R.id.toolbar;
                                                                                    MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                                                                                    if (materialToolbar != null) {
                                                                                        i10 = R.id.topViewsContainer;
                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.topViewsContainer);
                                                                                        if (constraintLayout != null) {
                                                                                            i10 = R.id.usdaDivider;
                                                                                            View viewA3 = A3.a.a(view, R.id.usdaDivider);
                                                                                            if (viewA3 != null) {
                                                                                                i10 = R.id.usdaLink;
                                                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.usdaLink);
                                                                                                if (appCompatTextView != null) {
                                                                                                    return new C1404u0((ConstraintLayout) view, appBarLayout, nestedScrollView, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, imageView, appCompatEditText, imageView2, linearLayout, relativeLayout, recyclerView, linearLayout2, viewA, viewA2, mEATERScalesView, textView, appCompatImageView6, materialToolbar, constraintLayout, viewA3, appCompatTextView);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1404u0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_setups_confirm, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10613a;
    }
}
