package cm.aptoide.p092pt.view.recycler;

import android.content.Context;
import android.graphics.PointF;
import androidx.recyclerview.widget.C0629j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class LinearLayoutManagerWithSmoothScroller extends LinearLayoutManager {

    private class TopSnappedSmoothScroller extends C0629j {
        TopSnappedSmoothScroller(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0612y
        public PointF computeScrollVectorForPosition(int i2) {
            return LinearLayoutManagerWithSmoothScroller.this.computeScrollVectorForPosition(i2);
        }

        @Override // androidx.recyclerview.widget.C0629j
        protected int getVerticalSnapPreference() {
            return -1;
        }
    }

    public LinearLayoutManagerWithSmoothScroller(Context context) {
        super(context, 1, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0613z c0613z, int i2) {
        TopSnappedSmoothScroller topSnappedSmoothScroller = new TopSnappedSmoothScroller(recyclerView.getContext());
        topSnappedSmoothScroller.setTargetPosition(i2);
        startSmoothScroll(topSnappedSmoothScroller);
    }

    public LinearLayoutManagerWithSmoothScroller(Context context, int i2, boolean z) {
        super(context, i2, z);
    }
}
