package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.apptionlabs.meater_app.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;

/* compiled from: FragmentRecipeBrowseBinding.java */
/* renamed from: L4.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1389m0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10230a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f10231b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f10232c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f10233d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10234e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f10235f;

    /* renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f10236g;

    /* renamed from: h, reason: collision with root package name */
    public final SearchView f10237h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10238i;

    /* renamed from: j, reason: collision with root package name */
    public final SwipeRefreshLayout f10239j;

    /* renamed from: k, reason: collision with root package name */
    public final TabLayout f10240k;

    /* renamed from: l, reason: collision with root package name */
    public final MaterialToolbar f10241l;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayoutCompat f10242m;

    /* renamed from: n, reason: collision with root package name */
    public final AppCompatButton f10243n;

    private C1389m0(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, TextView textView, RecyclerView recyclerView, AppCompatTextView appCompatTextView2, SearchView searchView, TextView textView2, SwipeRefreshLayout swipeRefreshLayout, TabLayout tabLayout, MaterialToolbar materialToolbar, LinearLayoutCompat linearLayoutCompat, AppCompatButton appCompatButton) {
        this.f10230a = constraintLayout;
        this.f10231b = appBarLayout;
        this.f10232c = constraintLayout2;
        this.f10233d = appCompatTextView;
        this.f10234e = textView;
        this.f10235f = recyclerView;
        this.f10236g = appCompatTextView2;
        this.f10237h = searchView;
        this.f10238i = textView2;
        this.f10239j = swipeRefreshLayout;
        this.f10240k = tabLayout;
        this.f10241l = materialToolbar;
        this.f10242m = linearLayoutCompat;
        this.f10243n = appCompatButton;
    }

    public static C1389m0 a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.errorHolder;
            ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.errorHolder);
            if (constraintLayout != null) {
                i10 = R.id.errorText;
                AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.errorText);
                if (appCompatTextView != null) {
                    i10 = R.id.firstTitleText;
                    TextView textView = (TextView) A3.a.a(view, R.id.firstTitleText);
                    if (textView != null) {
                        i10 = R.id.list;
                        RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.list);
                        if (recyclerView != null) {
                            i10 = R.id.searchErrorLabel;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.searchErrorLabel);
                            if (appCompatTextView2 != null) {
                                i10 = R.id.searchView;
                                SearchView searchView = (SearchView) A3.a.a(view, R.id.searchView);
                                if (searchView != null) {
                                    i10 = R.id.secondTitleText;
                                    TextView textView2 = (TextView) A3.a.a(view, R.id.secondTitleText);
                                    if (textView2 != null) {
                                        i10 = R.id.swipeRefresh;
                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) A3.a.a(view, R.id.swipeRefresh);
                                        if (swipeRefreshLayout != null) {
                                            i10 = R.id.tabLayout;
                                            TabLayout tabLayout = (TabLayout) A3.a.a(view, R.id.tabLayout);
                                            if (tabLayout != null) {
                                                i10 = R.id.toolbar;
                                                MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                                                if (materialToolbar != null) {
                                                    i10 = R.id.toolbarTitleHolder;
                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) A3.a.a(view, R.id.toolbarTitleHolder);
                                                    if (linearLayoutCompat != null) {
                                                        i10 = R.id.tryRefreshButton;
                                                        AppCompatButton appCompatButton = (AppCompatButton) A3.a.a(view, R.id.tryRefreshButton);
                                                        if (appCompatButton != null) {
                                                            return new C1389m0((ConstraintLayout) view, appBarLayout, constraintLayout, appCompatTextView, textView, recyclerView, appCompatTextView2, searchView, textView2, swipeRefreshLayout, tabLayout, materialToolbar, linearLayoutCompat, appCompatButton);
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

    public static C1389m0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_recipe_browse, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10230a;
    }
}
