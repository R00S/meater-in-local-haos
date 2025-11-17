package com.apptionlabs.meater_app.model;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.apptionlabs.meater_app.views.MEATERRoundedLayout;

/* loaded from: /tmp/meat/meat/classes.dex */
public class RoundedTab {
    private static final int SELECTED_TINT = 2131099784;
    private static final int UNSELECTED_TINT = 2131099783;
    public ImageView imageView;
    public MEATERRoundedLayout roundedLayout;
    public boolean selected = false;
    public TextView textView;

    public RoundedTab(MEATERRoundedLayout mEATERRoundedLayout, ImageView imageView, TextView textView) {
        this.roundedLayout = mEATERRoundedLayout;
        this.imageView = imageView;
        this.textView = textView;
    }

    public void setClickListener(View.OnClickListener onClickListener) {
        this.roundedLayout.setOnClickListener(onClickListener);
        this.imageView.setOnClickListener(onClickListener);
        this.textView.setOnClickListener(onClickListener);
    }

    public void setTag(int i10) {
        this.roundedLayout.setTag(Integer.valueOf(i10));
        this.imageView.setTag(Integer.valueOf(i10));
        this.textView.setTag(Integer.valueOf(i10));
    }

    public void setView(String str, int i10, String str2) {
        this.roundedLayout.setColor(str);
        this.imageView.setImageResource(i10);
        this.textView.setText(str2);
    }

    public void setVisible(boolean z10) {
        int i10;
        int i11;
        MEATERRoundedLayout mEATERRoundedLayout = this.roundedLayout;
        int i12 = 4;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        mEATERRoundedLayout.setVisibility(i10);
        ImageView imageView = this.imageView;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView.setVisibility(i11);
        TextView textView = this.textView;
        if (z10) {
            i12 = 0;
        }
        textView.setVisibility(i12);
    }

    public void update(boolean z10) {
        int i10;
        this.selected = z10;
        MEATERRoundedLayout mEATERRoundedLayout = this.roundedLayout;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        mEATERRoundedLayout.setVisibility(i10);
        updateTabIcon(z10);
    }

    public void updateTabIcon(boolean z10) {
        int i10;
        ImageView imageView = this.imageView;
        Context context = imageView.getContext();
        if (z10) {
            i10 = SELECTED_TINT;
        } else {
            i10 = UNSELECTED_TINT;
        }
        imageView.setColorFilter(androidx.core.content.a.c(context, i10));
    }
}
