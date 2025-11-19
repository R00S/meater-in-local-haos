package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.apptionlabs.meater_app.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* compiled from: ActivityMainBinding.java */
/* renamed from: L4.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1382j {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10148a;

    /* renamed from: b, reason: collision with root package name */
    public final BottomNavigationView f10149b;

    /* renamed from: c, reason: collision with root package name */
    public final FragmentContainerView f10150c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f10151d;

    private C1382j(ConstraintLayout constraintLayout, BottomNavigationView bottomNavigationView, FragmentContainerView fragmentContainerView, ConstraintLayout constraintLayout2) {
        this.f10148a = constraintLayout;
        this.f10149b = bottomNavigationView;
        this.f10150c = fragmentContainerView;
        this.f10151d = constraintLayout2;
    }

    public static C1382j a(View view) {
        int i10 = R.id.bottomNavigation;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) A3.a.a(view, R.id.bottomNavigation);
        if (bottomNavigationView != null) {
            i10 = R.id.container;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) A3.a.a(view, R.id.container);
            if (fragmentContainerView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new C1382j(constraintLayout, bottomNavigationView, fragmentContainerView, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1382j c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1382j d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10148a;
    }
}
