package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.C0280a;
import androidx.core.view.C0311u;
import androidx.core.view.p004d0.C0289c;
import java.util.Calendar;
import p024c.p052i.p059j.C0955e;
import p241e.p254e.p256b.p271c.C8912f;

/* loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: f */
    private final Calendar f30077f;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    class C7989a extends C0280a {
        C7989a() {
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: g */
        public void mo1858g(View view, C0289c c0289c) {
            super.mo1858g(view, c0289c);
            c0289c.m1973a0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m24332a(int i2, Rect rect) {
        if (i2 == 33) {
            setSelection(getAdapter().m24409h());
        } else if (i2 == 130) {
            setSelection(getAdapter().m24404b());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    /* renamed from: c */
    private static int m24333c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: d */
    private static boolean m24334d(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7999i getAdapter() {
        return (C7999i) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int iM24403a;
        int iM24333c;
        int iM24403a2;
        int iM24333c2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C7999i adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f30168h;
        C7992b c7992b = adapter.f30169i;
        Long item = adapter.getItem(adapter.m24404b());
        Long item2 = adapter.getItem(adapter.m24409h());
        for (C0955e<Long, Long> c0955e : dateSelector.m24322D()) {
            Long l = c0955e.f6405a;
            if (l != null) {
                if (c0955e.f6406b == null) {
                    continue;
                } else {
                    long jLongValue = l.longValue();
                    long jLongValue2 = c0955e.f6406b.longValue();
                    if (m24334d(item, item2, Long.valueOf(jLongValue), Long.valueOf(jLongValue2))) {
                        return;
                    }
                    if (jLongValue < item.longValue()) {
                        iM24403a = adapter.m24404b();
                        iM24333c = adapter.m24407f(iM24403a) ? 0 : materialCalendarGridView.getChildAt(iM24403a - 1).getRight();
                    } else {
                        materialCalendarGridView.f30077f.setTimeInMillis(jLongValue);
                        iM24403a = adapter.m24403a(materialCalendarGridView.f30077f.get(5));
                        iM24333c = m24333c(materialCalendarGridView.getChildAt(iM24403a));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        iM24403a2 = adapter.m24409h();
                        iM24333c2 = adapter.m24408g(iM24403a2) ? getWidth() : materialCalendarGridView.getChildAt(iM24403a2).getRight();
                    } else {
                        materialCalendarGridView.f30077f.setTimeInMillis(jLongValue2);
                        iM24403a2 = adapter.m24403a(materialCalendarGridView.f30077f.get(5));
                        iM24333c2 = m24333c(materialCalendarGridView.getChildAt(iM24403a2));
                    }
                    int itemId = (int) adapter.getItemId(iM24403a);
                    int itemId2 = (int) adapter.getItemId(iM24403a2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View childAt = materialCalendarGridView.getChildAt(numColumns);
                        canvas.drawRect(numColumns > iM24403a ? 0 : iM24333c, childAt.getTop() + c7992b.f30092a.m24350c(), iM24403a2 > numColumns2 ? getWidth() : iM24333c2, childAt.getBottom() - c7992b.f30092a.m24349b(), c7992b.f30099h);
                        itemId++;
                        materialCalendarGridView = this;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z, int i2, Rect rect) {
        if (z) {
            m24332a(i2, rect);
        } else {
            super.onFocusChanged(false, i2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().m24404b()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(getAdapter().m24404b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i2) {
        if (i2 < getAdapter().m24404b()) {
            super.setSelection(getAdapter().m24404b());
        } else {
            super.setSelection(i2);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f30077f = C8005o.m24434l();
        if (C7996f.m24392s(getContext())) {
            setNextFocusLeftId(C8912f.f33911a);
            setNextFocusRightId(C8912f.f33912b);
        }
        C0311u.m2131i0(this, new C7989a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C7999i)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C7999i.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
