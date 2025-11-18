package com.google.android.material.timepicker;

import C7.m;
import X7.g;
import X7.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s1.X;

/* compiled from: RadialViewGroup.java */
/* loaded from: classes2.dex */
class d extends ConstraintLayout {

    /* renamed from: d0, reason: collision with root package name */
    private final Runnable f37521d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f37522e0;

    /* renamed from: f0, reason: collision with root package name */
    private g f37523f0;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void D(List<View> list, androidx.constraintlayout.widget.d dVar, int i10) {
        Iterator<View> it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            dVar.i(it.next().getId(), C7.g.f2474c, i10, size);
            size += 360.0f / list.size();
        }
    }

    private Drawable E() {
        g gVar = new g();
        this.f37523f0 = gVar;
        gVar.Z(new i(0.5f));
        this.f37523f0.b0(ColorStateList.valueOf(-1));
        return this.f37523f0;
    }

    private static boolean I(View view) {
        return "skip".equals(view.getTag());
    }

    private void K() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f37521d0);
            handler.post(this.f37521d0);
        }
    }

    int F(int i10) {
        return i10 == 2 ? Math.round(this.f37522e0 * 0.66f) : this.f37522e0;
    }

    public int G() {
        return this.f37522e0;
    }

    public void H(int i10) {
        this.f37522e0 = i10;
        J();
    }

    protected void J() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != C7.g.f2474c && !I(childAt)) {
                int i11 = (Integer) childAt.getTag(C7.g.f2486m);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            D((List) entry.getValue(), dVar, F(((Integer) entry.getKey()).intValue()));
        }
        dVar.c(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(X.k());
        }
        K();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        J();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        K();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f37523f0.b0(ColorStateList.valueOf(i10));
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(C7.i.f2514l, this);
        X.r0(this, E());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f2796U5, i10, 0);
        this.f37522e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f2806V5, 0);
        this.f37521d0 = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f37520B.J();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }
}
