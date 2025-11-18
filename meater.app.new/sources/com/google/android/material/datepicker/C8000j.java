package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.C0311u;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C7995e;
import p241e.p254e.p256b.p271c.C8912f;
import p241e.p254e.p256b.p271c.C8914h;

/* compiled from: MonthsPagerAdapter.java */
/* renamed from: com.google.android.material.datepicker.j */
/* loaded from: classes2.dex */
class C8000j extends RecyclerView.AbstractC0594g<b> {

    /* renamed from: a */
    private final CalendarConstraints f30171a;

    /* renamed from: b */
    private final DateSelector<?> f30172b;

    /* renamed from: c */
    private final C7995e.l f30173c;

    /* renamed from: d */
    private final int f30174d;

    /* compiled from: MonthsPagerAdapter.java */
    /* renamed from: com.google.android.material.datepicker.j$a */
    class a implements AdapterView.OnItemClickListener {

        /* renamed from: f */
        final /* synthetic */ MaterialCalendarGridView f30175f;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f30175f = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            if (this.f30175f.getAdapter().m24411j(i2)) {
                C8000j.this.f30173c.mo24378a(this.f30175f.getAdapter().getItem(i2).longValue());
            }
        }
    }

    /* compiled from: MonthsPagerAdapter.java */
    /* renamed from: com.google.android.material.datepicker.j$b */
    public static class b extends RecyclerView.AbstractC0590c0 {

        /* renamed from: a */
        final TextView f30177a;

        /* renamed from: b */
        final MaterialCalendarGridView f30178b;

        b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C8912f.f33923m);
            this.f30177a = textView;
            C0311u.m2133j0(textView, true);
            this.f30178b = (MaterialCalendarGridView) linearLayout.findViewById(C8912f.f33919i);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    C8000j(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, C7995e.l lVar) {
        Month monthM24314j = calendarConstraints.m24314j();
        Month monthM24311g = calendarConstraints.m24311g();
        Month monthM24313i = calendarConstraints.m24313i();
        if (monthM24314j.compareTo(monthM24313i) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (monthM24313i.compareTo(monthM24311g) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f30174d = (C7999i.f30166f * C7995e.m24367s(context)) + (C7996f.m24392s(context) ? C7995e.m24367s(context) : 0);
        this.f30171a = calendarConstraints;
        this.f30172b = dateSelector;
        this.f30173c = lVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.f30171a.m24312h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public long getItemId(int i2) {
        return this.f30171a.m24314j().m24340F(i2).m24339E();
    }

    /* renamed from: h */
    Month m24413h(int i2) {
        return this.f30171a.m24314j().m24340F(i2);
    }

    /* renamed from: i */
    CharSequence m24414i(int i2) {
        return m24413h(i2).m24345y();
    }

    /* renamed from: j */
    int m24415j(Month month) {
        return this.f30171a.m24314j().m24341G(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i2) {
        Month monthM24340F = this.f30171a.m24314j().m24340F(i2);
        bVar.f30177a.setText(monthM24340F.m24345y());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f30178b.findViewById(C8912f.f33919i);
        if (materialCalendarGridView.getAdapter() == null || !monthM24340F.equals(materialCalendarGridView.getAdapter().f30167g)) {
            C7999i c7999i = new C7999i(monthM24340F, this.f30172b, this.f30171a);
            materialCalendarGridView.setNumColumns(monthM24340F.f30083j);
            materialCalendarGridView.setAdapter((ListAdapter) c7999i);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C8914h.f33949k, viewGroup, false);
        if (!C7996f.m24392s(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C0603p(-1, this.f30174d));
        return new b(linearLayout, true);
    }
}
