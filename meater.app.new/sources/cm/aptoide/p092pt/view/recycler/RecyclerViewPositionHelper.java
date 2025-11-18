package cm.aptoide.p092pt.view.recycler;

import android.view.View;
import androidx.recyclerview.widget.AbstractC0633n;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class RecyclerViewPositionHelper {
    final RecyclerView.AbstractC0602o layoutManager;
    final RecyclerView recyclerView;

    RecyclerViewPositionHelper(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
        this.layoutManager = recyclerView.getLayoutManager();
    }

    public static RecyclerViewPositionHelper createHelper(RecyclerView recyclerView) {
        if (recyclerView != null) {
            return new RecyclerViewPositionHelper(recyclerView);
        }
        throw new NullPointerException("Recycler View is null");
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, this.layoutManager.getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return this.recyclerView.getChildAdapterPosition(viewFindOneVisibleChild);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, this.layoutManager.getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return this.recyclerView.getChildAdapterPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(this.layoutManager.getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return this.recyclerView.getChildAdapterPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(this.layoutManager.getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return this.recyclerView.getChildAdapterPosition(viewFindOneVisibleChild);
    }

    View findOneVisibleChild(int i2, int i3, boolean z, boolean z2) {
        AbstractC0633n abstractC0633nM4532c = this.layoutManager.canScrollVertically() ? AbstractC0633n.m4532c(this.layoutManager) : AbstractC0633n.m4530a(this.layoutManager);
        int iMo4542m = abstractC0633nM4532c.mo4542m();
        int iMo4538i = abstractC0633nM4532c.mo4538i();
        int i4 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View childAt = this.layoutManager.getChildAt(i2);
            int iMo4536g = abstractC0633nM4532c.mo4536g(childAt);
            int iMo4533d = abstractC0633nM4532c.mo4533d(childAt);
            if (iMo4536g < iMo4538i && iMo4533d > iMo4542m) {
                if (!z) {
                    return childAt;
                }
                if (iMo4536g >= iMo4542m && iMo4533d <= iMo4538i) {
                    return childAt;
                }
                if (z2 && view == null) {
                    view = childAt;
                }
            }
            i2 += i4;
        }
        return view;
    }

    public int getChildCount() {
        RecyclerView.AbstractC0602o abstractC0602o = this.layoutManager;
        if (abstractC0602o == null) {
            return 0;
        }
        return abstractC0602o.getChildCount();
    }

    public int getItemCount() {
        RecyclerView.AbstractC0602o abstractC0602o = this.layoutManager;
        if (abstractC0602o == null) {
            return 0;
        }
        return abstractC0602o.getItemCount();
    }
}
