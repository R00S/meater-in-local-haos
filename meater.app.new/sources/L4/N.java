package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.DialViews;
import com.apptionlabs.meater_app.views.MaskLayerView;
import com.apptionlabs.meater_app.views.ProgressArcView;
import com.apptionlabs.meater_app.views.RippleBackgroundForList;

/* compiled from: DialComponentBinding.java */
/* loaded from: classes2.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9531a;

    /* renamed from: b, reason: collision with root package name */
    public final RippleBackgroundForList f9532b;

    /* renamed from: c, reason: collision with root package name */
    public final DialViews f9533c;

    /* renamed from: d, reason: collision with root package name */
    public final MaskLayerView f9534d;

    /* renamed from: e, reason: collision with root package name */
    public final ProgressArcView f9535e;

    /* renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f9536f;

    private N(ConstraintLayout constraintLayout, RippleBackgroundForList rippleBackgroundForList, DialViews dialViews, MaskLayerView maskLayerView, ProgressArcView progressArcView, ConstraintLayout constraintLayout2) {
        this.f9531a = constraintLayout;
        this.f9532b = rippleBackgroundForList;
        this.f9533c = dialViews;
        this.f9534d = maskLayerView;
        this.f9535e = progressArcView;
        this.f9536f = constraintLayout2;
    }

    public static N a(View view) {
        int i10 = R.id.circleRippleView;
        RippleBackgroundForList rippleBackgroundForList = (RippleBackgroundForList) A3.a.a(view, R.id.circleRippleView);
        if (rippleBackgroundForList != null) {
            i10 = R.id.dialViews;
            DialViews dialViews = (DialViews) A3.a.a(view, R.id.dialViews);
            if (dialViews != null) {
                i10 = R.id.maskLayerView;
                MaskLayerView maskLayerView = (MaskLayerView) A3.a.a(view, R.id.maskLayerView);
                if (maskLayerView != null) {
                    i10 = R.id.progressArcView;
                    ProgressArcView progressArcView = (ProgressArcView) A3.a.a(view, R.id.progressArcView);
                    if (progressArcView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        return new N(constraintLayout, rippleBackgroundForList, dialViews, maskLayerView, progressArcView, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static N b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dial_component, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
