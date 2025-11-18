package androidx.core.widget;

import android.widget.ListView;

/* compiled from: ListViewAutoScrollHelper.java */
/* renamed from: androidx.core.widget.h */
/* loaded from: classes.dex */
public class C0327h extends AbstractViewOnTouchListenerC0322c {

    /* renamed from: x */
    private final ListView f2511x;

    public C0327h(ListView listView) {
        super(listView);
        this.f2511x = listView;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0322c
    /* renamed from: a */
    public boolean mo2278a(int i2) {
        return false;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0322c
    /* renamed from: b */
    public boolean mo2279b(int i2) {
        ListView listView = this.f2511x;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i3 = firstVisiblePosition + childCount;
        if (i2 > 0) {
            if (i3 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i2 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0322c
    /* renamed from: j */
    public void mo2281j(int i2, int i3) {
        C0328i.m2316b(this.f2511x, i3);
    }
}
