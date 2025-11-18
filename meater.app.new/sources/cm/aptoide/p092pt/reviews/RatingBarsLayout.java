package cm.aptoide.p092pt.reviews;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetAppMeta;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public class RatingBarsLayout {
    private ProgressAndTextLayout[] progressAndTextLayouts;

    private static class ProgressAndTextLayout {
        private ProgressBar progressBar;
        private TextView text;

        public ProgressAndTextLayout(int i2, int i3, View view) {
            this.progressBar = (ProgressBar) view.findViewById(i2);
            this.text = (TextView) view.findViewById(i3);
        }

        public void setup(int i2, int i3) {
            this.progressBar.setMax(i2);
            this.progressBar.setProgress(i3);
            this.text.setText(AptoideUtils.StringU.withSuffix(i3));
        }
    }

    public RatingBarsLayout(View view) {
        ProgressAndTextLayout[] progressAndTextLayoutArr = new ProgressAndTextLayout[5];
        this.progressAndTextLayouts = progressAndTextLayoutArr;
        progressAndTextLayoutArr[0] = new ProgressAndTextLayout(C1146R.id.one_rate_star_progress, C1146R.id.one_rate_star_count, view);
        this.progressAndTextLayouts[1] = new ProgressAndTextLayout(C1146R.id.two_rate_star_progress, C1146R.id.two_rate_star_count, view);
        this.progressAndTextLayouts[2] = new ProgressAndTextLayout(C1146R.id.three_rate_star_progress, C1146R.id.three_rate_star_count, view);
        this.progressAndTextLayouts[3] = new ProgressAndTextLayout(C1146R.id.four_rate_star_progress, C1146R.id.four_rate_star_count, view);
        this.progressAndTextLayouts[4] = new ProgressAndTextLayout(C1146R.id.five_rate_star_progress, C1146R.id.five_rate_star_count, view);
    }

    public void setup(GetAppMeta.Stats.Rating rating) {
        int total = rating.getTotal();
        Iterator<GetAppMeta.Stats.Rating.Vote> it = rating.getVotes().iterator();
        while (it.hasNext()) {
            this.progressAndTextLayouts[r1.getValue() - 1].setup(total, it.next().getCount());
        }
    }
}
