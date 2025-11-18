package cm.aptoide.p092pt.view.custom;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class DrawableItemDecoration extends RecyclerView.AbstractC0601n {
    private final int customHorizontalPadding;
    private final Drawable dividerDrawable;

    DrawableItemDecoration(Drawable drawable, int i2) {
        this.dividerDrawable = drawable;
        this.customHorizontalPadding = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0601n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0613z c0613z) {
        int i2 = this.customHorizontalPadding;
        int width = recyclerView.getWidth() - this.customHorizontalPadding;
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount - 1; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0603p) childAt.getLayoutParams())).bottomMargin;
            this.dividerDrawable.setBounds(i2, bottom, width, this.dividerDrawable.getIntrinsicHeight() + bottom);
            this.dividerDrawable.draw(canvas);
        }
    }
}
