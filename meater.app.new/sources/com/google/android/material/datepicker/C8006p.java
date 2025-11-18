package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C7995e;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import p241e.p254e.p256b.p271c.C8914h;
import p241e.p254e.p256b.p271c.C8916j;

/* compiled from: YearGridAdapter.java */
/* renamed from: com.google.android.material.datepicker.p */
/* loaded from: classes2.dex */
class C8006p extends RecyclerView.AbstractC0594g<b> {

    /* renamed from: a */
    private final C7995e<?> f30185a;

    /* compiled from: YearGridAdapter.java */
    /* renamed from: com.google.android.material.datepicker.p$a */
    class a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ int f30186f;

        a(int i2) {
            this.f30186f = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C8006p.this.f30185a.m24375w(C8006p.this.f30185a.m24370o().m24309e(Month.m24336k(this.f30186f, C8006p.this.f30185a.m24372q().f30081h)));
            C8006p.this.f30185a.m24376x(C7995e.k.DAY);
        }
    }

    /* compiled from: YearGridAdapter.java */
    /* renamed from: com.google.android.material.datepicker.p$b */
    public static class b extends RecyclerView.AbstractC0590c0 {

        /* renamed from: a */
        final TextView f30188a;

        b(TextView textView) {
            super(textView);
            this.f30188a = textView;
        }
    }

    C8006p(C7995e<?> c7995e) {
        this.f30185a = c7995e;
    }

    /* renamed from: h */
    private View.OnClickListener m24440h(int i2) {
        return new a(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.f30185a.m24370o().m24315k();
    }

    /* renamed from: i */
    int m24441i(int i2) {
        return i2 - this.f30185a.m24370o().m24314j().f30082i;
    }

    /* renamed from: j */
    int m24442j(int i2) {
        return this.f30185a.m24370o().m24314j().f30082i + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i2) {
        int iM24442j = m24442j(i2);
        String string = bVar.f30188a.getContext().getString(C8916j.f33970n);
        bVar.f30188a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iM24442j)));
        bVar.f30188a.setContentDescription(String.format(string, Integer.valueOf(iM24442j)));
        C7992b c7992bM24371p = this.f30185a.m24371p();
        Calendar calendarM24432j = C8005o.m24432j();
        C7991a c7991a = calendarM24432j.get(1) == iM24442j ? c7992bM24371p.f30097f : c7992bM24371p.f30095d;
        Iterator<Long> it = this.f30185a.m24373r().m24325Q0().iterator();
        while (it.hasNext()) {
            calendarM24432j.setTimeInMillis(it.next().longValue());
            if (calendarM24432j.get(1) == iM24442j) {
                c7991a = c7992bM24371p.f30096e;
            }
        }
        c7991a.m24351d(bVar.f30188a);
        bVar.f30188a.setOnClickListener(m24440h(iM24442j));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C8914h.f33951m, viewGroup, false));
    }
}
