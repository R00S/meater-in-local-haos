package androidx.core.widget;

import android.widget.ListView;

/* compiled from: ListViewAutoScrollHelper.java */
/* loaded from: classes.dex */
public class g extends a {

    /* renamed from: T, reason: collision with root package name */
    private final ListView f24803T;

    public g(ListView listView) {
        super(listView);
        this.f24803T = listView;
    }

    @Override // androidx.core.widget.a
    public boolean a(int i10) {
        return false;
    }

    @Override // androidx.core.widget.a
    public boolean b(int i10) {
        ListView listView = this.f24803T;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i11 = firstVisiblePosition + childCount;
        if (i10 > 0) {
            if (i11 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i10 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.a
    public void j(int i10, int i11) {
        this.f24803T.scrollListBy(i11);
    }
}
