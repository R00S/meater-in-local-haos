package cm.aptoide.p092pt.editorial;

import android.content.res.Resources;
import android.graphics.Color;
import androidx.cardview.widget.CardView;
import cm.aptoide.p092pt.C1146R;

/* loaded from: classes.dex */
public class CaptionBackgroundPainter {
    private final Resources resources;

    public CaptionBackgroundPainter(Resources resources) {
        this.resources = resources;
    }

    private void setDefaultBackgroundColor(CardView cardView) {
        cardView.setCardBackgroundColor(this.resources.getColor(C1146R.color.curation_default));
    }

    public void addColorBackgroundToCaption(CardView cardView, String str) {
        if (str == null || str.isEmpty()) {
            setDefaultBackgroundColor(cardView);
            return;
        }
        try {
            cardView.setCardBackgroundColor(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
            setDefaultBackgroundColor(cardView);
        }
    }
}
