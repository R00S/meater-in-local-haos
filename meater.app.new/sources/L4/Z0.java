package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;

/* compiled from: RecipeLocaleListItemBinding.java */
/* loaded from: classes2.dex */
public final class Z0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9791a;

    /* renamed from: b, reason: collision with root package name */
    public final View f9792b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f9793c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f9794d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f9795e;

    /* renamed from: f, reason: collision with root package name */
    public final View f9796f;

    private Z0(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, View view2) {
        this.f9791a = constraintLayout;
        this.f9792b = view;
        this.f9793c = constraintLayout2;
        this.f9794d = appCompatImageView;
        this.f9795e = appCompatTextView;
        this.f9796f = view2;
    }

    public static Z0 a(View view) {
        int i10 = R.id.bottomBar;
        View viewA = A3.a.a(view, R.id.bottomBar);
        if (viewA != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = R.id.tickImage;
            AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.tickImage);
            if (appCompatImageView != null) {
                i10 = R.id.titleText;
                AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.titleText);
                if (appCompatTextView != null) {
                    i10 = R.id.topBar;
                    View viewA2 = A3.a.a(view, R.id.topBar);
                    if (viewA2 != null) {
                        return new Z0(constraintLayout, viewA, constraintLayout, appCompatImageView, appCompatTextView, viewA2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static Z0 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.recipe_locale_list_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
