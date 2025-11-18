package com.airbnb.epoxy;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: EpoxyItemSpacingDecorator.java */
/* renamed from: com.airbnb.epoxy.r */
/* loaded from: classes.dex */
public class C5165r extends RecyclerView.AbstractC0601n {

    /* renamed from: a */
    private int f12287a;

    /* renamed from: b */
    private boolean f12288b;

    /* renamed from: c */
    private boolean f12289c;

    /* renamed from: d */
    private boolean f12290d;

    /* renamed from: e */
    private boolean f12291e;

    /* renamed from: f */
    private boolean f12292f;

    /* renamed from: g */
    private boolean f12293g;

    /* renamed from: h */
    private boolean f12294h;

    /* renamed from: i */
    private boolean f12295i;

    /* renamed from: j */
    private boolean f12296j;

    public C5165r() {
        this(0);
    }

    /* renamed from: d */
    private void m9350d(RecyclerView recyclerView, int i2, RecyclerView.AbstractC0602o abstractC0602o) {
        int itemCount = recyclerView.getAdapter().getItemCount();
        boolean z = false;
        this.f12290d = i2 == 0;
        this.f12291e = i2 == itemCount + (-1);
        this.f12289c = abstractC0602o.canScrollHorizontally();
        this.f12288b = abstractC0602o.canScrollVertically();
        boolean z2 = abstractC0602o instanceof GridLayoutManager;
        this.f12292f = z2;
        if (z2) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) abstractC0602o;
            GridLayoutManager.AbstractC0579c spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
            int spanSize = spanSizeLookup.getSpanSize(i2);
            int spanCount = gridLayoutManager.getSpanCount();
            int spanIndex = spanSizeLookup.getSpanIndex(i2, spanCount);
            this.f12293g = spanIndex == 0;
            this.f12294h = spanIndex + spanSize == spanCount;
            boolean zM9351e = m9351e(i2, spanSizeLookup, spanCount);
            this.f12295i = zM9351e;
            if (!zM9351e && m9352f(i2, itemCount, spanSizeLookup, spanCount)) {
                z = true;
            }
            this.f12296j = z;
        }
    }

    /* renamed from: e */
    private static boolean m9351e(int i2, GridLayoutManager.AbstractC0579c abstractC0579c, int i3) {
        int spanSize = 0;
        for (int i4 = 0; i4 <= i2; i4++) {
            spanSize += abstractC0579c.getSpanSize(i4);
            if (spanSize > i3) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m9352f(int i2, int i3, GridLayoutManager.AbstractC0579c abstractC0579c, int i4) {
        int spanSize = 0;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            spanSize += abstractC0579c.getSpanSize(i5);
            if (spanSize > i4) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m9353h(RecyclerView.AbstractC0602o abstractC0602o, boolean z) {
        boolean z2 = (abstractC0602o instanceof LinearLayoutManager) && ((LinearLayoutManager) abstractC0602o).getReverseLayout();
        return (z && (abstractC0602o.getLayoutDirection() == 1)) ? !z2 : z2;
    }

    /* renamed from: i */
    private boolean m9354i() {
        if (!this.f12292f) {
            return this.f12288b && !this.f12291e;
        }
        if (!this.f12289c || this.f12294h) {
            return this.f12288b && !this.f12296j;
        }
        return true;
    }

    /* renamed from: j */
    private boolean m9355j() {
        if (!this.f12292f) {
            return this.f12289c && !this.f12290d;
        }
        if (!this.f12289c || this.f12295i) {
            return this.f12288b && !this.f12293g;
        }
        return true;
    }

    /* renamed from: k */
    private boolean m9356k() {
        if (!this.f12292f) {
            return this.f12289c && !this.f12291e;
        }
        if (!this.f12289c || this.f12296j) {
            return this.f12288b && !this.f12294h;
        }
        return true;
    }

    /* renamed from: l */
    private boolean m9357l() {
        if (!this.f12292f) {
            return this.f12288b && !this.f12290d;
        }
        if (!this.f12289c || this.f12293g) {
            return this.f12288b && !this.f12295i;
        }
        return true;
    }

    /* renamed from: g */
    public void m9358g(int i2) {
        this.f12287a = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0601n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0613z c0613z) {
        rect.setEmpty();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        RecyclerView.AbstractC0602o layoutManager = recyclerView.getLayoutManager();
        m9350d(recyclerView, childAdapterPosition, layoutManager);
        boolean zM9355j = m9355j();
        boolean zM9356k = m9356k();
        boolean zM9357l = m9357l();
        boolean zM9354i = m9354i();
        if (!m9353h(layoutManager, this.f12289c)) {
            zM9356k = zM9355j;
            zM9355j = zM9356k;
        } else if (!this.f12289c) {
            zM9356k = zM9355j;
            zM9355j = zM9356k;
            zM9354i = zM9357l;
            zM9357l = zM9354i;
        }
        int i2 = this.f12287a / 2;
        rect.right = zM9355j ? i2 : 0;
        rect.left = zM9356k ? i2 : 0;
        rect.top = zM9357l ? i2 : 0;
        if (!zM9354i) {
            i2 = 0;
        }
        rect.bottom = i2;
    }

    public C5165r(int i2) {
        m9358g(i2);
    }
}
