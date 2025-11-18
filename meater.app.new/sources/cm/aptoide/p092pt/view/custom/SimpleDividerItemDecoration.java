package cm.aptoide.p092pt.view.custom;

import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class SimpleDividerItemDecoration extends RecyclerView.AbstractC0601n {
    private final int space;

    public SimpleDividerItemDecoration(Context context, int i2) {
        this.space = getPixelsFromDips(context, i2);
    }

    private int getPixelsFromDips(Context context, int i2) {
        return (int) TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0601n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0613z c0613z) {
        int i2 = this.space;
        rect.right = i2;
        rect.left = i2;
        rect.bottom = i2;
        rect.top = i2;
    }
}
