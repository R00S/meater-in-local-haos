package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.i;
import s1.X;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes2.dex */
class p extends RecyclerView.h<b> {

    /* renamed from: E, reason: collision with root package name */
    private final com.google.android.material.datepicker.a f36505E;

    /* renamed from: F, reason: collision with root package name */
    private final d<?> f36506F;

    /* renamed from: G, reason: collision with root package name */
    private final g f36507G;

    /* renamed from: H, reason: collision with root package name */
    private final i.m f36508H;

    /* renamed from: I, reason: collision with root package name */
    private final int f36509I;

    /* compiled from: MonthsPagerAdapter.java */
    class a implements AdapterView.OnItemClickListener {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f36510B;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f36510B = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.f36510B.getAdapter().r(i10)) {
                p.this.f36508H.a(this.f36510B.getAdapter().getItem(i10).longValue());
            }
        }
    }

    /* compiled from: MonthsPagerAdapter.java */
    public static class b extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name */
        final TextView f36512B;

        /* renamed from: C, reason: collision with root package name */
        final MaterialCalendarGridView f36513C;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C7.g.f2496w);
            this.f36512B = textView;
            X.o0(textView, true);
            this.f36513C = (MaterialCalendarGridView) linearLayout.findViewById(C7.g.f2492s);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    p(Context context, d<?> dVar, com.google.android.material.datepicker.a aVar, g gVar, i.m mVar) {
        n nVarL = aVar.l();
        n nVarH = aVar.h();
        n nVarK = aVar.k();
        if (nVarL.compareTo(nVarK) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (nVarK.compareTo(nVarH) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f36509I = (o.f36497H * i.M2(context)) + (k.d3(context) ? i.M2(context) : 0);
        this.f36505E = aVar;
        this.f36506F = dVar;
        this.f36507G = gVar;
        this.f36508H = mVar;
        F(true);
    }

    n J(int i10) {
        return this.f36505E.l().x(i10);
    }

    CharSequence K(int i10) {
        return J(i10).v();
    }

    int L(n nVar) {
        return this.f36505E.l().y(nVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void w(b bVar, int i10) {
        n nVarX = this.f36505E.l().x(i10);
        bVar.f36512B.setText(nVarX.v());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f36513C.findViewById(C7.g.f2492s);
        if (materialCalendarGridView.getAdapter() == null || !nVarX.equals(materialCalendarGridView.getAdapter().f36499B)) {
            o oVar = new o(nVarX, this.f36506F, this.f36505E, this.f36507G);
            materialCalendarGridView.setNumColumns(nVarX.f36493E);
            materialCalendarGridView.setAdapter((ListAdapter) oVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().q(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public b y(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C7.i.f2522t, viewGroup, false);
        if (!k.d3(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.r(-1, this.f36509I));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.f36505E.j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long i(int i10) {
        return this.f36505E.l().x(i10).w();
    }
}
