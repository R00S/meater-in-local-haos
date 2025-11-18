package cm.aptoide.p092pt.reviews;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetAppMeta;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public class RatingTotalsLayout {
    private AppCompatRatingBar ratingBar;
    private TextView ratingValue;
    private TextView usersVoted;

    public RatingTotalsLayout(View view) {
        this.usersVoted = (TextView) view.findViewById(C1146R.id.users_voted);
        this.ratingValue = (TextView) view.findViewById(C1146R.id.rating_value);
        this.ratingBar = (AppCompatRatingBar) view.findViewById(C1146R.id.rating_bar);
    }

    public void setup(GetAppMeta.Stats.Rating rating) {
        this.usersVoted.setText(AptoideUtils.StringU.withSuffix(rating.getTotal()));
        this.ratingValue.setText(String.format(Locale.getDefault(), "%.1f", Float.valueOf(rating.getAvg())));
        this.ratingBar.setRating(rating.getAvg());
    }
}
