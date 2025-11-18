package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* compiled from: FragmentDynamicNewsCardBinding.java */
/* loaded from: classes2.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9782a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f9783b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialButton f9784c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f9785d;

    /* renamed from: e, reason: collision with root package name */
    public final ProgressBar f9786e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatTextView f9787f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialCardView f9788g;

    /* renamed from: h, reason: collision with root package name */
    public final RecyclerView f9789h;

    /* renamed from: i, reason: collision with root package name */
    public final ConstraintLayout f9790i;

    private Z(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, MaterialButton materialButton, AppCompatImageView appCompatImageView2, ProgressBar progressBar, AppCompatTextView appCompatTextView, MaterialCardView materialCardView, RecyclerView recyclerView, ConstraintLayout constraintLayout2) {
        this.f9782a = constraintLayout;
        this.f9783b = appCompatImageView;
        this.f9784c = materialButton;
        this.f9785d = appCompatImageView2;
        this.f9786e = progressBar;
        this.f9787f = appCompatTextView;
        this.f9788g = materialCardView;
        this.f9789h = recyclerView;
        this.f9790i = constraintLayout2;
    }

    public static Z a(View view) {
        int i10 = R.id.backgroundImage;
        AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.backgroundImage);
        if (appCompatImageView != null) {
            i10 = R.id.buttonNext;
            MaterialButton materialButton = (MaterialButton) A3.a.a(view, R.id.buttonNext);
            if (materialButton != null) {
                i10 = R.id.foregroundImage;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) A3.a.a(view, R.id.foregroundImage);
                if (appCompatImageView2 != null) {
                    i10 = R.id.loading;
                    ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.loading);
                    if (progressBar != null) {
                        i10 = R.id.messageText;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.messageText);
                        if (appCompatTextView != null) {
                            i10 = R.id.notLoggedInHolder;
                            MaterialCardView materialCardView = (MaterialCardView) A3.a.a(view, R.id.notLoggedInHolder);
                            if (materialCardView != null) {
                                i10 = R.id.offerList;
                                RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.offerList);
                                if (recyclerView != null) {
                                    i10 = R.id.offersHolder;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.offersHolder);
                                    if (constraintLayout != null) {
                                        return new Z((ConstraintLayout) view, appCompatImageView, materialButton, appCompatImageView2, progressBar, appCompatTextView, materialCardView, recyclerView, constraintLayout);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static Z c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dynamic_news_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9782a;
    }
}
