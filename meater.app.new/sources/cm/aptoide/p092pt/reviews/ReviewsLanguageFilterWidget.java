package cm.aptoide.p092pt.reviews;

import android.view.View;
import android.widget.Spinner;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.view.recycler.widget.Widget;

/* loaded from: classes.dex */
public class ReviewsLanguageFilterWidget extends Widget<ReviewsLanguageFilterDisplayable> {
    private Spinner spinner;

    public ReviewsLanguageFilterWidget(View view) {
        super(view);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.spinner = (Spinner) view.findViewById(C1146R.id.comments_filter_language_spinner);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(ReviewsLanguageFilterDisplayable reviewsLanguageFilterDisplayable, int i2) {
        reviewsLanguageFilterDisplayable.setup(this.spinner);
    }
}
