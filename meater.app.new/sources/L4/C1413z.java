package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.BlockStandAloneAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: BlockAnimaitonActivityBinding.java */
/* renamed from: L4.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1413z {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f10811a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f10812b;

    /* renamed from: c, reason: collision with root package name */
    public final BlockStandAloneAnimationView f10813c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialToolbar f10814d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f10815e;

    private C1413z(LinearLayout linearLayout, AppBarLayout appBarLayout, BlockStandAloneAnimationView blockStandAloneAnimationView, MaterialToolbar materialToolbar, LinearLayout linearLayout2) {
        this.f10811a = linearLayout;
        this.f10812b = appBarLayout;
        this.f10813c = blockStandAloneAnimationView;
        this.f10814d = materialToolbar;
        this.f10815e = linearLayout2;
    }

    public static C1413z a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.blockImageAnimated;
            BlockStandAloneAnimationView blockStandAloneAnimationView = (BlockStandAloneAnimationView) A3.a.a(view, R.id.blockImageAnimated);
            if (blockStandAloneAnimationView != null) {
                i10 = R.id.toolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                if (materialToolbar != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new C1413z(linearLayout, appBarLayout, blockStandAloneAnimationView, materialToolbar, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1413z c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1413z d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.block_animaiton_activity, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.f10811a;
    }
}
