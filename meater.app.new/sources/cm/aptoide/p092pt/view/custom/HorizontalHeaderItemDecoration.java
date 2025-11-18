package cm.aptoide.p092pt.view.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class HorizontalHeaderItemDecoration extends RecyclerView.AbstractC0601n {
    private static final float PARALLAX_RATIO = 0.3f;
    private static final int VERTICAL_OFFSET = 20;
    private int headerSize;
    private View layout;
    private int margin;

    public HorizontalHeaderItemDecoration(Context context, RecyclerView recyclerView, int i2, int i3, int i4) {
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        View viewInflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) recyclerView, false);
        this.layout = viewInflate;
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.headerSize = i3;
        this.margin = i4;
        View view = this.layout;
        view.layout(0, 0, view.getMeasuredWidth(), this.layout.getMeasuredHeight());
    }

    private float getPercentage(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0601n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0613z c0613z) {
        int i2 = this.margin;
        rect.set(i2, i2, 0, i2);
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.left = this.headerSize;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0601n
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0613z c0613z) {
        float left;
        super.onDraw(canvas, recyclerView, c0613z);
        float f2 = -(this.layout.getMeasuredWidth() / 2.0f);
        float measuredWidth = (((this.headerSize / 2.0f) - (this.layout.getMeasuredWidth() / 2.0f)) - (this.margin / 2.0f)) * PARALLAX_RATIO;
        boolean z = false;
        int i2 = 0;
        float top = 0.0f;
        while (true) {
            if (i2 >= recyclerView.getChildCount()) {
                left = 0.0f;
                break;
            }
            View childAt = recyclerView.getChildAt(i2);
            if (top == 0.0f) {
                top = (childAt.getTop() + (childAt.getMeasuredHeight() / 2.0f)) - (this.layout.getMeasuredWidth() / 2.0f);
            }
            if (recyclerView.getChildAdapterPosition(childAt) == 0) {
                left = (((childAt.getLeft() - (this.headerSize / 2.0f)) - (this.layout.getMeasuredWidth() / 2.0f)) - (this.margin / 2.0f)) * PARALLAX_RATIO;
                if (left < f2) {
                    left = f2;
                }
                z = true;
            } else {
                i2++;
            }
        }
        if (!z) {
            left = f2;
        }
        int iMax = Math.max((int) (getPercentage(f2, measuredWidth, left) * 255.0f), 1);
        canvas.save();
        canvas.saveLayerAlpha(new RectF(0.0f, 0.0f, this.headerSize - 2, canvas.getHeight()), iMax, 31);
        canvas.translate(left, top - 20.0f);
        this.layout.draw(canvas);
        canvas.restore();
    }
}
