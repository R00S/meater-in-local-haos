package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;

/* compiled from: ViewTemperatureBinding.java */
/* loaded from: classes2.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10674a;

    /* renamed from: b, reason: collision with root package name */
    public final Guideline f10675b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f10676c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f10677d;

    private v1(ConstraintLayout constraintLayout, Guideline guideline, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f10674a = constraintLayout;
        this.f10675b = guideline;
        this.f10676c = appCompatTextView;
        this.f10677d = appCompatTextView2;
    }

    public static v1 a(View view) {
        int i10 = R.id.guideline1;
        Guideline guideline = (Guideline) A3.a.a(view, R.id.guideline1);
        if (guideline != null) {
            i10 = R.id.indicatorName;
            AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.indicatorName);
            if (appCompatTextView != null) {
                i10 = R.id.indicatorText;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.indicatorText);
                if (appCompatTextView2 != null) {
                    return new v1((ConstraintLayout) view, guideline, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static v1 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_temperature_, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
