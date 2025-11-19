package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.google.android.material.card.MaterialCardView;

/* compiled from: ItemChooseProductBinding.java */
/* loaded from: classes2.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9306a;

    /* renamed from: b, reason: collision with root package name */
    public final MaterialCardView f9307b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f9308c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f9309d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f9310e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f9311f;

    private C0(ConstraintLayout constraintLayout, MaterialCardView materialCardView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, AppCompatImageView appCompatImageView, TextView textView) {
        this.f9306a = constraintLayout;
        this.f9307b = materialCardView;
        this.f9308c = constraintLayout2;
        this.f9309d = constraintLayout3;
        this.f9310e = appCompatImageView;
        this.f9311f = textView;
    }

    public static C0 a(View view) {
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
                        return new C0(constraintLayout2, materialCardView, constraintLayout, constraintLayout2, appCompatImageView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_choose_product, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9306a;
    }
}
