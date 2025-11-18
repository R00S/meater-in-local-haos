package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MenuPopup.java */
/* renamed from: androidx.appcompat.view.menu.k */
/* loaded from: classes.dex */
public abstract class AbstractC0091k implements InterfaceC0096p, InterfaceC0093m, AdapterView.OnItemClickListener {

    /* renamed from: f */
    private Rect f650f;

    AbstractC0091k() {
    }

    /* renamed from: p */
    protected static int m646p(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = listAdapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i5, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    /* renamed from: y */
    protected static boolean m647y(C0087g c0087g) {
        int size = c0087g.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = c0087g.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    protected static C0086f m648z(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0086f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0086f) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: e */
    public boolean mo494e(C0087g c0087g, C0089i c0089i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: f */
    public boolean mo495f(C0087g c0087g, C0089i c0089i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: h */
    public void mo497h(Context context, C0087g c0087g) {
    }

    /* renamed from: m */
    public abstract void mo524m(C0087g c0087g);

    /* renamed from: n */
    protected boolean mo525n() {
        return true;
    }

    /* renamed from: o */
    public Rect m649o() {
        return this.f650f;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m648z(listAdapter).f570f.m569O((MenuItem) listAdapter.getItem(i2), this, mo525n() ? 0 : 4);
    }

    /* renamed from: q */
    public abstract void mo526q(View view);

    /* renamed from: r */
    public void m650r(Rect rect) {
        this.f650f = rect;
    }

    /* renamed from: s */
    public abstract void mo527s(boolean z);

    /* renamed from: t */
    public abstract void mo528t(int i2);

    /* renamed from: u */
    public abstract void mo529u(int i2);

    /* renamed from: v */
    public abstract void mo530v(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: w */
    public abstract void mo531w(boolean z);

    /* renamed from: x */
    public abstract void mo532x(int i2);
}
