package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0087g;
import androidx.appcompat.widget.C0185q0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0087g.b, InterfaceC0094n, AdapterView.OnItemClickListener {

    /* renamed from: f */
    private static final int[] f468f = {R.attr.background, R.attr.divider};

    /* renamed from: g */
    private C0087g f469g;

    /* renamed from: h */
    private int f470h;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.C0087g.b
    /* renamed from: a */
    public boolean mo477a(C0089i c0089i) {
        return this.f469g.m568N(c0089i, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0094n
    /* renamed from: b */
    public void mo478b(C0087g c0087g) {
        this.f469g = c0087g;
    }

    public int getWindowAnimations() {
        return this.f470h;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        mo477a((C0089i) getAdapter().getItem(i2));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0185q0 c0185q0M1091v = C0185q0.m1091v(context, attributeSet, f468f, i2, 0);
        if (c0185q0M1091v.m1110s(0)) {
            setBackgroundDrawable(c0185q0M1091v.m1098g(0));
        }
        if (c0185q0M1091v.m1110s(1)) {
            setDivider(c0185q0M1091v.m1098g(1));
        }
        c0185q0M1091v.m1111w();
    }
}
