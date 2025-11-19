package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: DaysOfWeekAdapter.java */
/* loaded from: classes2.dex */
class h extends BaseAdapter {

    /* renamed from: E, reason: collision with root package name */
    private static final int f36402E = 4;

    /* renamed from: B, reason: collision with root package name */
    private final Calendar f36403B;

    /* renamed from: C, reason: collision with root package name */
    private final int f36404C;

    /* renamed from: D, reason: collision with root package name */
    private final int f36405D;

    public h() {
        Calendar calendarI = u.i();
        this.f36403B = calendarI;
        this.f36404C = calendarI.getMaximum(7);
        this.f36405D = calendarI.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f36405D;
        int i12 = this.f36404C;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f36404C) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f36404C;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C7.i.f2520r, viewGroup, false);
        }
        this.f36403B.set(7, b(i10));
        textView.setText(this.f36403B.getDisplayName(7, f36402E, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C7.k.f2548q), this.f36403B.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public h(int i10) {
        Calendar calendarI = u.i();
        this.f36403B = calendarI;
        this.f36404C = calendarI.getMaximum(7);
        this.f36405D = i10;
    }
}
