package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;

/* compiled from: ActivityHelpBinding.java */
/* renamed from: L4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1380i {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10137a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f10138b;

    private C1380i(ConstraintLayout constraintLayout, FrameLayout frameLayout) {
        this.f10137a = constraintLayout;
        this.f10138b = frameLayout;
    }

    public static C1380i a(View view) {
        FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.container);
        if (frameLayout != null) {
            return new C1380i((ConstraintLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.container)));
    }

    public static C1380i c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1380i d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_help, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10137a;
    }
}
