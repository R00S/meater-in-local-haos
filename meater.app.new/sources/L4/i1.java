package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.google.android.material.card.MaterialCardView;

/* compiled from: SummaryListPreparationItemBinding.java */
/* loaded from: classes2.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    private final MaterialCardView f10142a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatCheckBox f10143b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f10144c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f10145d;

    /* renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f10146e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatTextView f10147f;

    private i1(MaterialCardView materialCardView, AppCompatCheckBox appCompatCheckBox, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView2) {
        this.f10142a = materialCardView;
        this.f10143b = appCompatCheckBox;
        this.f10144c = appCompatImageView;
        this.f10145d = appCompatTextView;
        this.f10146e = constraintLayout;
        this.f10147f = appCompatTextView2;
    }

    public static i1 a(View view) {
        int i10 = R.id.checkBox;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) A3.a.a(view, R.id.checkBox);
        if (appCompatCheckBox != null) {
            i10 = R.id.expandImage;
            AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.expandImage);
            if (appCompatImageView != null) {
                i10 = R.id.informationText;
                AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.informationText);
                if (appCompatTextView != null) {
                    i10 = R.id.rootView;
                    ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.rootView);
                    if (constraintLayout != null) {
                        i10 = R.id.titleText;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.titleText);
                        if (appCompatTextView2 != null) {
                            return new i1((MaterialCardView) view, appCompatCheckBox, appCompatImageView, appCompatTextView, constraintLayout, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static i1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.summary_list_preparation_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public MaterialCardView b() {
        return this.f10142a;
    }
}
