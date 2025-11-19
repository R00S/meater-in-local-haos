package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.apptionlabs.meater_app.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.rd.PageIndicatorView;

/* compiled from: ActivityMeaterDetailsBinding.java */
/* renamed from: L4.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1384k {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10176a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f10177b;

    /* renamed from: c, reason: collision with root package name */
    public final PageIndicatorView f10178c;

    /* renamed from: d, reason: collision with root package name */
    public final RelativeLayout f10179d;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f10180e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewPager2 f10181f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialToolbar f10182g;

    /* renamed from: h, reason: collision with root package name */
    public final RelativeLayout f10183h;

    private C1384k(RelativeLayout relativeLayout, AppBarLayout appBarLayout, PageIndicatorView pageIndicatorView, RelativeLayout relativeLayout2, RecyclerView recyclerView, ViewPager2 viewPager2, MaterialToolbar materialToolbar, RelativeLayout relativeLayout3) {
        this.f10176a = relativeLayout;
        this.f10177b = appBarLayout;
        this.f10178c = pageIndicatorView;
        this.f10179d = relativeLayout2;
        this.f10180e = recyclerView;
        this.f10181f = viewPager2;
        this.f10182g = materialToolbar;
        this.f10183h = relativeLayout3;
    }

    public static C1384k a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.indicator;
            PageIndicatorView pageIndicatorView = (PageIndicatorView) A3.a.a(view, R.id.indicator);
            if (pageIndicatorView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i10 = R.id.menuRecycler;
                RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.menuRecycler);
                if (recyclerView != null) {
                    i10 = R.id.pager;
                    ViewPager2 viewPager2 = (ViewPager2) A3.a.a(view, R.id.pager);
                    if (viewPager2 != null) {
                        i10 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                        if (materialToolbar != null) {
                            i10 = R.id.viewMenuBackground;
                            RelativeLayout relativeLayout2 = (RelativeLayout) A3.a.a(view, R.id.viewMenuBackground);
                            if (relativeLayout2 != null) {
                                return new C1384k(relativeLayout, appBarLayout, pageIndicatorView, relativeLayout, recyclerView, viewPager2, materialToolbar, relativeLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1384k c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1384k d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_meater_details, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public RelativeLayout b() {
        return this.f10176a;
    }
}
