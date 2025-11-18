package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.TextStepView;

/* compiled from: StepsListItemBinding.java */
/* loaded from: classes2.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10133a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f10134b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f10135c;

    /* renamed from: d, reason: collision with root package name */
    public final TextStepView f10136d;

    private h1(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout2, TextStepView textStepView) {
        this.f10133a = constraintLayout;
        this.f10134b = appCompatTextView;
        this.f10135c = constraintLayout2;
        this.f10136d = textStepView;
    }

    public static h1 a(View view) {
        int i10 = R.id.indexText;
        AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.indexText);
        if (appCompatTextView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            TextStepView textStepView = (TextStepView) A3.a.a(view, R.id.titleText);
            if (textStepView != null) {
                return new h1(constraintLayout, appCompatTextView, constraintLayout, textStepView);
            }
            i10 = R.id.titleText;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static h1 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.steps_list_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
