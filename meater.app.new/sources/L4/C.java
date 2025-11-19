package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.apptionlabs.meater_app.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: ClipInfoFragmentBinding.java */
/* loaded from: classes2.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9299a;

    /* renamed from: b, reason: collision with root package name */
    public final LottieAnimationView f9300b;

    /* renamed from: c, reason: collision with root package name */
    public final AppBarLayout f9301c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f9302d;

    /* renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f9303e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f9304f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialToolbar f9305g;

    private C(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, AppBarLayout appBarLayout, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, MaterialToolbar materialToolbar) {
        this.f9299a = constraintLayout;
        this.f9300b = lottieAnimationView;
        this.f9301c = appBarLayout;
        this.f9302d = textView;
        this.f9303e = constraintLayout2;
        this.f9304f = textView2;
        this.f9305g = materialToolbar;
    }

    public static C a(View view) {
        int i10 = R.id.animationView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) A3.a.a(view, R.id.animationView);
        if (lottieAnimationView != null) {
            i10 = R.id.appBarLayout;
            AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
            if (appBarLayout != null) {
                i10 = R.id.button;
                TextView textView = (TextView) A3.a.a(view, R.id.button);
                if (textView != null) {
                    i10 = R.id.mainContainer;
                    ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.mainContainer);
                    if (constraintLayout != null) {
                        i10 = R.id.screenSubTitle;
                        TextView textView2 = (TextView) A3.a.a(view, R.id.screenSubTitle);
                        if (textView2 != null) {
                            i10 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                            if (materialToolbar != null) {
                                return new C((ConstraintLayout) view, lottieAnimationView, appBarLayout, textView, constraintLayout, textView2, materialToolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.clip_info_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9299a;
    }
}
