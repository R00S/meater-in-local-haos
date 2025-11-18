package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
import r1.C4338e;

/* compiled from: MonthAdapter.java */
/* loaded from: classes2.dex */
class o extends BaseAdapter {

    /* renamed from: H, reason: collision with root package name */
    static final int f36497H = u.i().getMaximum(4);

    /* renamed from: I, reason: collision with root package name */
    private static final int f36498I = (u.i().getMaximum(5) + u.i().getMaximum(7)) - 1;

    /* renamed from: B, reason: collision with root package name */
    final n f36499B;

    /* renamed from: C, reason: collision with root package name */
    final d<?> f36500C;

    /* renamed from: D, reason: collision with root package name */
    private Collection<Long> f36501D;

    /* renamed from: E, reason: collision with root package name */
    c f36502E;

    /* renamed from: F, reason: collision with root package name */
    final a f36503F;

    /* renamed from: G, reason: collision with root package name */
    final g f36504G;

    o(n nVar, d<?> dVar, a aVar, g gVar) {
        this.f36499B = nVar;
        this.f36500C = dVar;
        this.f36503F = aVar;
        this.f36504G = gVar;
        this.f36501D = dVar.h1();
    }

    private String c(Context context, long j10) {
        return e.a(context, j10, l(j10), k(j10), g(j10));
    }

    private void f(Context context) {
        if (this.f36502E == null) {
            this.f36502E = new c(context);
        }
    }

    private boolean j(long j10) {
        Iterator<Long> it = this.f36500C.h1().iterator();
        while (it.hasNext()) {
            if (u.a(j10) == u.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean l(long j10) {
        return u.g().getTimeInMillis() == j10;
    }

    private void o(TextView textView, long j10, int i10) {
        boolean z10;
        b bVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String strC = c(context, j10);
        textView.setContentDescription(strC);
        boolean zS0 = this.f36503F.g().S0(j10);
        if (zS0) {
            textView.setEnabled(true);
            boolean zJ = j(j10);
            textView.setSelected(zJ);
            bVar = zJ ? this.f36502E.f36394b : l(j10) ? this.f36502E.f36395c : this.f36502E.f36393a;
            z10 = zJ;
        } else {
            textView.setEnabled(false);
            z10 = false;
            bVar = this.f36502E.f36399g;
        }
        g gVar = this.f36504G;
        if (gVar == null || i10 == -1) {
            bVar.d(textView);
            return;
        }
        n nVar = this.f36499B;
        int i11 = nVar.f36492D;
        int i12 = nVar.f36491C;
        ColorStateList colorStateListA = gVar.a(context, i11, i12, i10, zS0, z10);
        boolean z11 = z10;
        bVar.e(textView, colorStateListA, this.f36504G.g(context, i11, i12, i10, zS0, z11));
        Drawable drawableC = this.f36504G.c(context, i11, i12, i10, zS0, z11);
        Drawable drawableE = this.f36504G.e(context, i11, i12, i10, zS0, z11);
        Drawable drawableD = this.f36504G.d(context, i11, i12, i10, zS0, z11);
        boolean z12 = z10;
        textView.setCompoundDrawables(drawableC, drawableE, drawableD, this.f36504G.b(context, i11, i12, i10, zS0, z12));
        textView.setContentDescription(this.f36504G.f(context, i11, i12, i10, zS0, z12, strC));
    }

    private void p(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (n.n(j10).equals(this.f36499B)) {
            int iU = this.f36499B.u(j10);
            o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(iU) - materialCalendarGridView.getFirstVisiblePosition()), j10, iU);
        }
    }

    int a(int i10) {
        return b() + (i10 - 1);
    }

    int b() {
        return this.f36499B.s(this.f36503F.i());
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 < b() || i10 > m()) {
            return null;
        }
        return Long.valueOf(this.f36499B.t(n(i10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.f(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = C7.i.f2519q
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.n r8 = r5.f36499B
            int r2 = r8.f36494F
            if (r7 < r2) goto L2d
            goto L54
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L5d
        L54:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r0
        L64:
            long r1 = r6.longValue()
            r5.o(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.o.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    boolean g(long j10) {
        Iterator<C4338e<Long, Long>> it = this.f36500C.Q().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().f48340b;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f36498I;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f36499B.f36493E;
    }

    boolean h(int i10) {
        return i10 % this.f36499B.f36493E == 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(int i10) {
        return (i10 + 1) % this.f36499B.f36493E == 0;
    }

    boolean k(long j10) {
        Iterator<C4338e<Long, Long>> it = this.f36500C.Q().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().f48339a;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    int m() {
        return (b() + this.f36499B.f36494F) - 1;
    }

    int n(int i10) {
        return (i10 - b()) + 1;
    }

    public void q(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f36501D.iterator();
        while (it.hasNext()) {
            p(materialCalendarGridView, it.next().longValue());
        }
        d<?> dVar = this.f36500C;
        if (dVar != null) {
            Iterator<Long> it2 = dVar.h1().iterator();
            while (it2.hasNext()) {
                p(materialCalendarGridView, it2.next().longValue());
            }
            this.f36501D = this.f36500C.h1();
        }
    }

    boolean r(int i10) {
        return i10 >= b() && i10 <= m();
    }
}
