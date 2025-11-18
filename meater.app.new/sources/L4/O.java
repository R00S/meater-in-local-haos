package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.apptionlabs.meater_app.R;

/* compiled from: DialViewsBinding.java */
/* loaded from: classes2.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f9549a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f9550b;

    private O(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f9549a = frameLayout;
        this.f9550b = frameLayout2;
    }

    public static O a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new O(frameLayout, frameLayout);
    }

    public static O b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dial_views, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
