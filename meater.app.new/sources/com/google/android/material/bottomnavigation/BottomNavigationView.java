package com.google.android.material.bottomnavigation;

import C7.d;
import C7.l;
import C7.m;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.a0;
import com.google.android.material.internal.r;
import com.google.android.material.internal.u;
import com.google.android.material.navigation.e;
import g1.C3377a;
import s1.C4469y0;
import s1.X;

/* loaded from: classes2.dex */
public class BottomNavigationView extends e {

    class a implements u.c {
        a() {
        }

        @Override // com.google.android.material.internal.u.c
        public C4469y0 a(View view, C4469y0 c4469y0, u.d dVar) {
            dVar.f36804d += c4469y0.i();
            boolean z10 = X.z(view) == 1;
            int iJ = c4469y0.j();
            int iK = c4469y0.k();
            dVar.f36801a += z10 ? iK : iJ;
            int i10 = dVar.f36803c;
            if (!z10) {
                iJ = iK;
            }
            dVar.f36803c = i10 + iJ;
            dVar.a(view);
            return c4469y0;
        }
    }

    @Deprecated
    public interface b extends e.b {
    }

    @Deprecated
    public interface c extends e.c {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7.c.f2309d);
    }

    private void g(Context context) {
        View view = new View(context);
        view.setBackgroundColor(C3377a.c(context, d.f2342a));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C7.e.f2391g)));
        addView(view);
    }

    private void h() {
        u.b(this, new a());
    }

    private int i(int i10) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i10) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
    }

    private boolean j() {
        return false;
    }

    @Override // com.google.android.material.navigation.e
    protected com.google.android.material.navigation.c c(Context context) {
        return new com.google.android.material.bottomnavigation.b(context);
    }

    @Override // com.google.android.material.navigation.e
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i(i11));
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) throws Resources.NotFoundException {
        com.google.android.material.bottomnavigation.b bVar = (com.google.android.material.bottomnavigation.b) getMenuView();
        if (bVar.r() != z10) {
            bVar.setItemHorizontalTranslationEnabled(z10);
            getPresenter().e(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(c cVar) {
        setOnItemSelectedListener(cVar);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, l.f2572i);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i10, int i11) throws Resources.NotFoundException {
        super(context, attributeSet, i10, i11);
        Context context2 = getContext();
        a0 a0VarJ = r.j(context2, attributeSet, m.f3049s0, i10, i11, new int[0]);
        setItemHorizontalTranslationEnabled(a0VarJ.a(m.f3082v0, true));
        int i12 = m.f3060t0;
        if (a0VarJ.s(i12)) {
            setMinimumHeight(a0VarJ.f(i12, 0));
        }
        if (a0VarJ.a(m.f3071u0, true) && j()) {
            g(context2);
        }
        a0VarJ.x();
        h();
    }
}
