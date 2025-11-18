package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.apptionlabs.meater_app.R;

/* compiled from: ActivityQsgBinding.java */
/* renamed from: L4.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1388m {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10227a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f10228b;

    /* renamed from: c, reason: collision with root package name */
    public final FragmentContainerView f10229c;

    private C1388m(ConstraintLayout constraintLayout, FrameLayout frameLayout, FragmentContainerView fragmentContainerView) {
        this.f10227a = constraintLayout;
        this.f10228b = frameLayout;
        this.f10229c = fragmentContainerView;
    }

    public static C1388m a(View view) {
        int i10 = R.id.frame_container;
        FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.frame_container);
        if (frameLayout != null) {
            i10 = R.id.qsg;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) A3.a.a(view, R.id.qsg);
            if (fragmentContainerView != null) {
                return new C1388m((ConstraintLayout) view, frameLayout, fragmentContainerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1388m c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1388m d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_qsg, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10227a;
    }
}
