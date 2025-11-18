package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.a0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {

    /* renamed from: D, reason: collision with root package name */
    private static final int[] f20928D = {R.attr.background, R.attr.divider};

    /* renamed from: B, reason: collision with root package name */
    private e f20929B;

    /* renamed from: C, reason: collision with root package name */
    private int f20930C;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(g gVar) {
        return this.f20929B.O(gVar, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(e eVar) {
        this.f20929B = eVar;
    }

    public int getWindowAnimations() {
        return this.f20930C;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        a((g) getAdapter().getItem(i10));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        a0 a0VarV = a0.v(context, attributeSet, f20928D, i10, 0);
        if (a0VarV.s(0)) {
            setBackgroundDrawable(a0VarV.g(0));
        }
        if (a0VarV.s(1)) {
            setDivider(a0VarV.g(1));
        }
        a0VarV.x();
    }
}
