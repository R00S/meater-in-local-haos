package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.apptionlabs.meater_app.R;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: ActivityRecipeStepsBinding.java */
/* renamed from: L4.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1390n {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10248a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f10249b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f10250c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f10251d;

    /* renamed from: e, reason: collision with root package name */
    public final Toolbar f10252e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayoutCompat f10253f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10254g;

    /* renamed from: h, reason: collision with root package name */
    public final ViewPager2 f10255h;

    private C1390n(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, Toolbar toolbar, LinearLayoutCompat linearLayoutCompat, TextView textView, ViewPager2 viewPager2) {
        this.f10248a = constraintLayout;
        this.f10249b = appBarLayout;
        this.f10250c = appCompatImageView;
        this.f10251d = constraintLayout2;
        this.f10252e = toolbar;
        this.f10253f = linearLayoutCompat;
        this.f10254g = textView;
        this.f10255h = viewPager2;
    }

    public static C1390n a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.cookImage;
            AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.cookImage);
            if (appCompatImageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i10 = R.id.toolbar;
                Toolbar toolbar = (Toolbar) A3.a.a(view, R.id.toolbar);
                if (toolbar != null) {
                    i10 = R.id.toolbarTitleHolder;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) A3.a.a(view, R.id.toolbarTitleHolder);
                    if (linearLayoutCompat != null) {
                        i10 = R.id.toolbarTitleText;
                        TextView textView = (TextView) A3.a.a(view, R.id.toolbarTitleText);
                        if (textView != null) {
                            i10 = R.id.viewpager;
                            ViewPager2 viewPager2 = (ViewPager2) A3.a.a(view, R.id.viewpager);
                            if (viewPager2 != null) {
                                return new C1390n(constraintLayout, appBarLayout, appCompatImageView, constraintLayout, toolbar, linearLayoutCompat, textView, viewPager2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1390n c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1390n d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_recipe_steps, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10248a;
    }
}
