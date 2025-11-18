package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;

/* compiled from: MonthAdapter.java */
/* renamed from: com.google.android.material.datepicker.i */
/* loaded from: classes2.dex */
class C7999i extends BaseAdapter {

    /* renamed from: f */
    static final int f30166f = C8005o.m24434l().getMaximum(4);

    /* renamed from: g */
    final Month f30167g;

    /* renamed from: h */
    final DateSelector<?> f30168h;

    /* renamed from: i */
    C7992b f30169i;

    /* renamed from: j */
    final CalendarConstraints f30170j;

    C7999i(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f30167g = month;
        this.f30168h = dateSelector;
        this.f30170j = calendarConstraints;
    }

    /* renamed from: e */
    private void m24402e(Context context) {
        if (this.f30169i == null) {
            this.f30169i = new C7992b(context);
        }
    }

    /* renamed from: a */
    int m24403a(int i2) {
        return m24404b() + (i2 - 1);
    }

    /* renamed from: b */
    int m24404b() {
        return this.f30167g.m24343v();
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i2) {
        if (i2 < this.f30167g.m24343v() || i2 > m24409h()) {
            return null;
        }
        return Long.valueOf(this.f30167g.m24344x(m24410i(i2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m24402e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p241e.p254e.p256b.p271c.C8914h.f33946h
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.m24404b()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L61
            com.google.android.material.datepicker.Month r2 = r5.f30167g
            int r3 = r2.f30084k
            if (r7 < r3) goto L2e
            goto L61
        L2e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.Month r2 = r5.f30167g
            long r2 = r2.m24344x(r7)
            com.google.android.material.datepicker.Month r7 = r5.f30167g
            int r7 = r7.f30082i
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.m24338u()
            int r4 = r4.f30082i
            if (r7 != r4) goto L53
            java.lang.String r7 = com.google.android.material.datepicker.C7993c.m24352a(r2)
            r0.setContentDescription(r7)
            goto L5a
        L53:
            java.lang.String r7 = com.google.android.material.datepicker.C7993c.m24354c(r2)
            r0.setContentDescription(r7)
        L5a:
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L69
        L61:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L69:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L70
            return r0
        L70:
            com.google.android.material.datepicker.CalendarConstraints r7 = r5.f30170j
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r7 = r7.m24310f()
            long r2 = r6.longValue()
            boolean r7 = r7.mo24316F0(r2)
            if (r7 == 0) goto Ld5
            r0.setEnabled(r8)
            com.google.android.material.datepicker.DateSelector<?> r7 = r5.f30168h
            java.util.Collection r7 = r7.m24325Q0()
            java.util.Iterator r7 = r7.iterator()
        L8d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb5
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            long r3 = r6.longValue()
            long r3 = com.google.android.material.datepicker.C8005o.m24423a(r3)
            long r1 = com.google.android.material.datepicker.C8005o.m24423a(r1)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L8d
            com.google.android.material.datepicker.b r6 = r5.f30169i
            com.google.android.material.datepicker.a r6 = r6.f30093b
            r6.m24351d(r0)
            return r0
        Lb5:
            java.util.Calendar r7 = com.google.android.material.datepicker.C8005o.m24432j()
            long r7 = r7.getTimeInMillis()
            long r1 = r6.longValue()
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto Lcd
            com.google.android.material.datepicker.b r6 = r5.f30169i
            com.google.android.material.datepicker.a r6 = r6.f30094c
            r6.m24351d(r0)
            return r0
        Lcd:
            com.google.android.material.datepicker.b r6 = r5.f30169i
            com.google.android.material.datepicker.a r6 = r6.f30092a
            r6.m24351d(r0)
            return r0
        Ld5:
            r0.setEnabled(r1)
            com.google.android.material.datepicker.b r6 = r5.f30169i
            com.google.android.material.datepicker.a r6 = r6.f30098g
            r6.m24351d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C7999i.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* renamed from: f */
    boolean m24407f(int i2) {
        return i2 % this.f30167g.f30083j == 0;
    }

    /* renamed from: g */
    boolean m24408g(int i2) {
        return (i2 + 1) % this.f30167g.f30083j == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f30167g.f30084k + m24404b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2 / this.f30167g.f30083j;
    }

    /* renamed from: h */
    int m24409h() {
        return (this.f30167g.m24343v() + this.f30167g.f30084k) - 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* renamed from: i */
    int m24410i(int i2) {
        return (i2 - this.f30167g.m24343v()) + 1;
    }

    /* renamed from: j */
    boolean m24411j(int i2) {
        return i2 >= m24404b() && i2 <= m24409h();
    }
}
