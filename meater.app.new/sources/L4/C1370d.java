package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;

/* compiled from: ActivityCookFeedBackBinding.java */
/* renamed from: L4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1370d {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9961a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f9962b;

    private C1370d(ConstraintLayout constraintLayout, FrameLayout frameLayout) {
        this.f9961a = constraintLayout;
        this.f9962b = frameLayout;
    }

    public static C1370d a(View view) {
        FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.baseLayout);
        if (frameLayout != null) {
            return new C1370d((ConstraintLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.baseLayout)));
    }

    public static C1370d c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1370d d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_cook_feed_back, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9961a;
    }
}
