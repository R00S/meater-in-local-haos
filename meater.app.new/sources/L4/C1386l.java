package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;

/* compiled from: ActivityMeaterSetupsBinding.java */
/* renamed from: L4.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1386l {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10201a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f10202b;

    private C1386l(ConstraintLayout constraintLayout, FrameLayout frameLayout) {
        this.f10201a = constraintLayout;
        this.f10202b = frameLayout;
    }

    public static C1386l a(View view) {
        FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.baseLayoutContainer);
        if (frameLayout != null) {
            return new C1386l((ConstraintLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.baseLayoutContainer)));
    }

    public static C1386l c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1386l d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_meater_setups, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10201a;
    }
}
