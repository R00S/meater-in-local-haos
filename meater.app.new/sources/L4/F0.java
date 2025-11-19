package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.google.android.material.card.MaterialCardView;

/* compiled from: ItemProductSelectionBinding.java */
/* loaded from: classes2.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9369a;

    /* renamed from: b, reason: collision with root package name */
    public final MaterialCardView f9370b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f9371c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f9372d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f9373e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f9374f;

    private F0(ConstraintLayout constraintLayout, MaterialCardView materialCardView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, AppCompatImageView appCompatImageView, TextView textView) {
        this.f9369a = constraintLayout;
        this.f9370b = materialCardView;
        this.f9371c = constraintLayout2;
        this.f9372d = constraintLayout3;
        this.f9373e = appCompatImageView;
        this.f9374f = textView;
    }

    public static F0 a(View view) {
        int i10 = R.id.meaterProbeCardView;
        MaterialCardView materialCardView = (MaterialCardView) A3.a.a(view, R.id.meaterProbeCardView);
        if (materialCardView != null) {
            i10 = R.id.meaterProbeItem;
            ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.meaterProbeItem);
            if (constraintLayout != null) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                i10 = R.id.thumbnail;
                AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.thumbnail);
                if (appCompatImageView != null) {
                    i10 = R.id.title;
                    TextView textView = (TextView) A3.a.a(view, R.id.title);
                    if (textView != null) {
                        return new F0(constraintLayout2, materialCardView, constraintLayout, constraintLayout2, appCompatImageView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static F0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_product_selection, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9369a;
    }
}
