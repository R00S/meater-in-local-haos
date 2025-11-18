package cm.aptoide.p092pt.home;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import cm.aptoide.p092pt.C1146R;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public class AppSecondaryInfoViewHolder {
    private final LinearLayout appcLayout;
    private final TextView appcText;
    private final DecimalFormat oneDecimalFormatter;
    private final TextView rating;
    private final LinearLayout ratingLayout;

    public AppSecondaryInfoViewHolder(View view, DecimalFormat decimalFormat) {
        this.oneDecimalFormatter = decimalFormat;
        this.appcLayout = (LinearLayout) view.findViewById(C1146R.id.appc_info_layout);
        this.appcText = (TextView) view.findViewById(C1146R.id.appc_text);
        this.ratingLayout = (LinearLayout) view.findViewById(C1146R.id.rating_info_layout);
        this.rating = (TextView) view.findViewById(C1146R.id.rating_label);
    }

    private void setAppcVisibility(int i2) {
        LinearLayout linearLayout = this.appcLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(i2);
        }
    }

    private void setRating(float f2) {
        TextView textView = this.rating;
        if (textView != null) {
            if (f2 == 0.0f) {
                textView.setText(C1146R.string.appcardview_title_no_stars);
            } else {
                textView.setText(this.oneDecimalFormatter.format(f2));
            }
        }
    }

    private void setRatingVisibility(int i2) {
        LinearLayout linearLayout = this.ratingLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(i2);
        }
    }

    public void setInfo(boolean z, float f2, boolean z2, boolean z3) {
        TextView textView = this.appcText;
        if (textView != null) {
            textView.setText(C1146R.string.appc_card_short);
        }
        setRating(f2);
        if (z3) {
            if (z) {
                setAppcVisibility(0);
            } else {
                setAppcVisibility(4);
            }
            setRatingVisibility(0);
            return;
        }
        if (z) {
            setAppcVisibility(0);
            setRatingVisibility(4);
        } else if (!z2) {
            setAppcVisibility(4);
        } else {
            setAppcVisibility(4);
            setRatingVisibility(0);
        }
    }
}
