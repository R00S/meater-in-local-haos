package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;

/* compiled from: NewsOffersListItemBinding.java */
/* loaded from: classes2.dex */
public final class O0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9551a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f9552b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f9553c;

    private O0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2) {
        this.f9551a = constraintLayout;
        this.f9552b = appCompatImageView;
        this.f9553c = constraintLayout2;
    }

    public static O0 a(View view) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.offerPreview);
        if (appCompatImageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.offerPreview)));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        return new O0(constraintLayout, appCompatImageView, constraintLayout);
    }

    public static O0 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.news_offers_list_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
