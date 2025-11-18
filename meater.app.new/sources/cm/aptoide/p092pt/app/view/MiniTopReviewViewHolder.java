package cm.aptoide.p092pt.app.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.app.AppReview;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.utils.AptoideUtils;
import com.bumptech.glide.p141p.p142l.InterfaceC5577i;

/* loaded from: classes.dex */
public class MiniTopReviewViewHolder extends RecyclerView.AbstractC0590c0 {
    public static final int LAYOUT_ID = 2131493066;
    private TextView addedDate;
    private TextView commentText;
    private TextView commentTitle;
    private InterfaceC5577i<Drawable> imageLoadingTarget;
    private RatingBar ratingBar;
    private ImageView userIconImageView;
    private TextView userName;

    public MiniTopReviewViewHolder(View view) {
        super(view);
        bindViews(view);
    }

    private void bindViews(View view) {
        this.userIconImageView = (ImageView) view.findViewById(C1146R.id.user_icon);
        this.ratingBar = (RatingBar) view.findViewById(C1146R.id.rating_bar);
        this.commentTitle = (TextView) view.findViewById(C1146R.id.comment_title);
        this.userName = (TextView) view.findViewById(C1146R.id.user_name);
        this.addedDate = (TextView) view.findViewById(C1146R.id.added_date);
        this.commentText = (TextView) view.findViewById(C1146R.id.comment);
    }

    public void cancelImageLoad() {
        if (this.imageLoadingTarget != null) {
            ImageLoader.cancel(this.itemView.getContext().getApplicationContext(), this.imageLoadingTarget);
        }
    }

    public void setup(AppReview appReview) {
        String avatar = appReview.getReviewUser().getAvatar();
        Context context = this.itemView.getContext();
        this.imageLoadingTarget = ImageLoader.with(context).loadWithCircleTransformAndPlaceHolderAvatarSize(avatar, this.userIconImageView, C1146R.drawable.layer_1);
        this.userName.setText(appReview.getReviewUser().getName());
        this.ratingBar.setRating(appReview.getReviewStats().getRating());
        this.commentTitle.setText(appReview.getTitle());
        this.commentText.setText(appReview.getBody());
        this.addedDate.setText(AptoideUtils.DateTimeU.getInstance(context).getTimeDiffString(appReview.getAdded().getTime(), context, context.getResources()));
    }
}
