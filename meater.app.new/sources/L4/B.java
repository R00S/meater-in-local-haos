package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: ChooseApplianceScreenBinding.java */
/* loaded from: classes2.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9289a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f9290b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f9291c;

    /* renamed from: d, reason: collision with root package name */
    public final GridView f9292d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f9293e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialToolbar f9294f;

    private B(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, AppCompatTextView appCompatTextView, GridView gridView, AppCompatTextView appCompatTextView2, MaterialToolbar materialToolbar) {
        this.f9289a = constraintLayout;
        this.f9290b = appBarLayout;
        this.f9291c = appCompatTextView;
        this.f9292d = gridView;
        this.f9293e = appCompatTextView2;
        this.f9294f = materialToolbar;
    }

    public static B a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.body1;
            AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.body1);
            if (appCompatTextView != null) {
                i10 = R.id.grid_view;
                GridView gridView = (GridView) A3.a.a(view, R.id.grid_view);
                if (gridView != null) {
                    i10 = R.id.title;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.title);
                    if (appCompatTextView2 != null) {
                        i10 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                        if (materialToolbar != null) {
                            return new B((ConstraintLayout) view, appBarLayout, appCompatTextView, gridView, appCompatTextView2, materialToolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static B c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.choose_appliance_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9289a;
    }
}
