package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;

/* compiled from: ActivityCookHistoryBinding.java */
/* renamed from: L4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1372e {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9983a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f9984b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f9985c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f9986d;

    private C1372e(ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout frameLayout2, ConstraintLayout constraintLayout2) {
        this.f9983a = constraintLayout;
        this.f9984b = frameLayout;
        this.f9985c = frameLayout2;
        this.f9986d = constraintLayout2;
    }

    public static C1372e a(View view) {
        int i10 = R.id.baseLayoutContainer;
        FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.baseLayoutContainer);
        if (frameLayout != null) {
            i10 = R.id.probeCleanFragmentView;
            FrameLayout frameLayout2 = (FrameLayout) A3.a.a(view, R.id.probeCleanFragmentView);
            if (frameLayout2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new C1372e(constraintLayout, frameLayout, frameLayout2, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1372e c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1372e d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_cook_history, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9983a;
    }
}
