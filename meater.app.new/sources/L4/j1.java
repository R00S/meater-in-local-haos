package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;

/* compiled from: SummaryListTitleItemBinding.java */
/* loaded from: classes2.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10173a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f10174b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f10175c;

    private j1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView) {
        this.f10173a = constraintLayout;
        this.f10174b = constraintLayout2;
        this.f10175c = appCompatTextView;
    }

    public static j1 a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.titleText);
        if (appCompatTextView != null) {
            return new j1(constraintLayout, constraintLayout, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.titleText)));
    }

    public static j1 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.summary_list_title_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
