package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import p241e.p254e.p256b.p271c.C8914h;
import p241e.p254e.p256b.p271c.C8916j;

/* compiled from: DaysOfWeekAdapter.java */
/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes2.dex */
class C7994d extends BaseAdapter {

    /* renamed from: f */
    private static final int f30100f;

    /* renamed from: g */
    private final Calendar f30101g;

    /* renamed from: h */
    private final int f30102h;

    /* renamed from: i */
    private final int f30103i;

    static {
        f30100f = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C7994d() {
        Calendar calendarM24434l = C8005o.m24434l();
        this.f30101g = calendarM24434l;
        this.f30102h = calendarM24434l.getMaximum(7);
        this.f30103i = calendarM24434l.getFirstDayOfWeek();
    }

    /* renamed from: b */
    private int m24356b(int i2) {
        int i3 = i2 + this.f30103i;
        int i4 = this.f30102h;
        return i3 > i4 ? i3 - i4 : i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i2) {
        if (i2 >= this.f30102h) {
            return null;
        }
        return Integer.valueOf(m24356b(i2));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f30102h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i2, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C8914h.f33947i, viewGroup, false);
        }
        this.f30101g.set(7, m24356b(i2));
        textView.setText(this.f30101g.getDisplayName(7, f30100f, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C8916j.f33969m), this.f30101g.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
