package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;

/* compiled from: IngredientTipListItemBinding.java */
/* loaded from: classes2.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9295a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f9296b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f9297c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f9298d;

    private B0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView) {
        this.f9295a = constraintLayout;
        this.f9296b = appCompatImageView;
        this.f9297c = constraintLayout2;
        this.f9298d = appCompatTextView;
    }

    public static B0 a(View view) {
        int i10 = R.id.indexBullet;
        AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.indexBullet);
        if (appCompatImageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.titleText);
            if (appCompatTextView != null) {
                return new B0(constraintLayout, appCompatImageView, constraintLayout, appCompatTextView);
            }
            i10 = R.id.titleText;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static B0 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.ingredient_tip_list_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
