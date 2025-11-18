package cm.aptoide.p092pt.app.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.app.AppReview;

/* loaded from: classes.dex */
public class TopReviewsAdapter extends RecyclerView.AbstractC0594g<MiniTopReviewViewHolder> {
    private final AppReview[] reviews;

    public TopReviewsAdapter() {
        this(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        AppReview[] appReviewArr = this.reviews;
        if (appReviewArr == null) {
            return 0;
        }
        return appReviewArr.length;
    }

    public TopReviewsAdapter(AppReview[] appReviewArr) {
        this.reviews = appReviewArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(MiniTopReviewViewHolder miniTopReviewViewHolder, int i2) {
        miniTopReviewViewHolder.setup(this.reviews[i2]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public MiniTopReviewViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new MiniTopReviewViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.mini_top_comment, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onViewRecycled(MiniTopReviewViewHolder miniTopReviewViewHolder) {
        miniTopReviewViewHolder.cancelImageLoad();
        super.onViewRecycled((TopReviewsAdapter) miniTopReviewViewHolder);
    }
}
