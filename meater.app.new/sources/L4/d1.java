package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;

/* compiled from: RoundImageWithTextBinding.java */
/* loaded from: classes2.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9979a;

    /* renamed from: b, reason: collision with root package name */
    public final Guideline f9980b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f9981c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f9982d;

    private d1(ConstraintLayout constraintLayout, Guideline guideline, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.f9979a = constraintLayout;
        this.f9980b = guideline;
        this.f9981c = appCompatImageView;
        this.f9982d = appCompatTextView;
    }

    public static d1 a(View view) {
        int i10 = R.id.guideline1;
        Guideline guideline = (Guideline) A3.a.a(view, R.id.guideline1);
        if (guideline != null) {
            i10 = R.id.indicatorImage;
            AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.indicatorImage);
            if (appCompatImageView != null) {
                i10 = R.id.indicatorName;
                AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.indicatorName);
                if (appCompatTextView != null) {
                    return new d1((ConstraintLayout) view, guideline, appCompatImageView, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static d1 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.round_image_with_text, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
