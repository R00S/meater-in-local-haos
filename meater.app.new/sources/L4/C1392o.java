package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: ActivityRecipeSummaryBinding.java */
/* renamed from: L4.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1392o {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10281a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f10282b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f10283c;

    /* renamed from: d, reason: collision with root package name */
    public final Guideline f10284d;

    /* renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f10285e;

    /* renamed from: f, reason: collision with root package name */
    public final Toolbar f10286f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayoutCompat f10287g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10288h;

    private C1392o(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, FrameLayout frameLayout, Guideline guideline, ConstraintLayout constraintLayout2, Toolbar toolbar, LinearLayoutCompat linearLayoutCompat, TextView textView) {
        this.f10281a = constraintLayout;
        this.f10282b = appBarLayout;
        this.f10283c = frameLayout;
        this.f10284d = guideline;
        this.f10285e = constraintLayout2;
        this.f10286f = toolbar;
        this.f10287g = linearLayoutCompat;
        this.f10288h = textView;
    }

    public static C1392o a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.container;
            FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.container);
            if (frameLayout != null) {
                i10 = R.id.guidelineMiddle;
                Guideline guideline = (Guideline) A3.a.a(view, R.id.guidelineMiddle);
                if (guideline != null) {
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
                                return new C1392o(constraintLayout, appBarLayout, frameLayout, guideline, constraintLayout, toolbar, linearLayoutCompat, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1392o c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1392o d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_recipe_summary, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10281a;
    }
}
