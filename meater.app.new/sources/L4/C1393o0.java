package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;

/* compiled from: FragmentRecipeIngredientsBinding.java */
/* renamed from: L4.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1393o0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10289a;

    /* renamed from: b, reason: collision with root package name */
    public final View f10290b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f10291c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10292d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f10293e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f10294f;

    private C1393o0(ConstraintLayout constraintLayout, View view, RecyclerView recyclerView, TextView textView, AppCompatTextView appCompatTextView, FrameLayout frameLayout) {
        this.f10289a = constraintLayout;
        this.f10290b = view;
        this.f10291c = recyclerView;
        this.f10292d = textView;
        this.f10293e = appCompatTextView;
        this.f10294f = frameLayout;
    }

    public static C1393o0 a(View view) {
        int i10 = R.id.divider;
        View viewA = A3.a.a(view, R.id.divider);
        if (viewA != null) {
            i10 = R.id.list;
            RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.list);
            if (recyclerView != null) {
                i10 = R.id.rightCornerText;
                TextView textView = (TextView) A3.a.a(view, R.id.rightCornerText);
                if (textView != null) {
                    i10 = R.id.selectAllText;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.selectAllText);
                    if (appCompatTextView != null) {
                        i10 = R.id.topViewHolder;
                        FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.topViewHolder);
                        if (frameLayout != null) {
                            return new C1393o0((ConstraintLayout) view, viewA, recyclerView, textView, appCompatTextView, frameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1393o0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_recipe_ingredients, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10289a;
    }
}
