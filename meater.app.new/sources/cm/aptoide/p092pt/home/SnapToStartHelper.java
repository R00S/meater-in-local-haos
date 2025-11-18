package cm.aptoide.p092pt.home;

import android.view.View;
import androidx.recyclerview.widget.AbstractC0633n;
import androidx.recyclerview.widget.C0630k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class SnapToStartHelper extends C0630k {
    private AbstractC0633n horizontalHelper;
    private AbstractC0633n verticalHelper;

    private int distanceToStart(View view, AbstractC0633n abstractC0633n) {
        return abstractC0633n.mo4536g(view) - abstractC0633n.mo4542m();
    }

    private AbstractC0633n getHorizontalHelper(RecyclerView.AbstractC0602o abstractC0602o) {
        if (this.horizontalHelper == null) {
            this.horizontalHelper = AbstractC0633n.m4530a(abstractC0602o);
        }
        return this.horizontalHelper;
    }

    private View getStartView(RecyclerView.AbstractC0602o abstractC0602o, AbstractC0633n abstractC0633n) {
        if (!(abstractC0602o instanceof LinearLayoutManager)) {
            return super.findSnapView(abstractC0602o);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC0602o;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        boolean z = linearLayoutManager.findLastCompletelyVisibleItemPosition() == abstractC0602o.getItemCount() - 1;
        if (iFindFirstVisibleItemPosition == -1 || z) {
            return null;
        }
        View viewFindViewByPosition = abstractC0602o.findViewByPosition(iFindFirstVisibleItemPosition);
        if (abstractC0633n.mo4533d(viewFindViewByPosition) >= abstractC0633n.mo4534e(viewFindViewByPosition) / 2 && abstractC0633n.mo4533d(viewFindViewByPosition) > 0) {
            return viewFindViewByPosition;
        }
        if (((LinearLayoutManager) abstractC0602o).findLastCompletelyVisibleItemPosition() == abstractC0602o.getItemCount() - 1) {
            return null;
        }
        return abstractC0602o.findViewByPosition(iFindFirstVisibleItemPosition + 1);
    }

    private AbstractC0633n getVerticalHelper(RecyclerView.AbstractC0602o abstractC0602o) {
        if (this.verticalHelper == null) {
            this.verticalHelper = AbstractC0633n.m4532c(abstractC0602o);
        }
        return this.verticalHelper;
    }

    @Override // androidx.recyclerview.widget.AbstractC0637r
    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.C0630k, androidx.recyclerview.widget.AbstractC0637r
    public int[] calculateDistanceToFinalSnap(RecyclerView.AbstractC0602o abstractC0602o, View view) {
        int[] iArr = new int[2];
        if (abstractC0602o.canScrollHorizontally()) {
            iArr[0] = distanceToStart(view, getHorizontalHelper(abstractC0602o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0602o.canScrollVertically()) {
            iArr[1] = distanceToStart(view, getVerticalHelper(abstractC0602o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.C0630k, androidx.recyclerview.widget.AbstractC0637r
    public View findSnapView(RecyclerView.AbstractC0602o abstractC0602o) {
        return abstractC0602o instanceof LinearLayoutManager ? abstractC0602o.canScrollHorizontally() ? getStartView(abstractC0602o, getHorizontalHelper(abstractC0602o)) : getStartView(abstractC0602o, getVerticalHelper(abstractC0602o)) : super.findSnapView(abstractC0602o);
    }
}
