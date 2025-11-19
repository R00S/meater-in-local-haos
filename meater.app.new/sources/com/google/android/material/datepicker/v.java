package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.i;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes2.dex */
class v extends RecyclerView.h<b> {

    /* renamed from: E, reason: collision with root package name */
    private final i<?> f36520E;

    /* compiled from: YearGridAdapter.java */
    class a implements View.OnClickListener {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f36521B;

        a(int i10) {
            this.f36521B = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v.this.f36520E.R2(v.this.f36520E.I2().f(n.j(this.f36521B, v.this.f36520E.K2().f36491C)));
            v.this.f36520E.S2(i.l.DAY);
        }
    }

    /* compiled from: YearGridAdapter.java */
    public static class b extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name */
        final TextView f36523B;

        b(TextView textView) {
            super(textView);
            this.f36523B = textView;
        }
    }

    v(i<?> iVar) {
        this.f36520E = iVar;
    }

    private View.OnClickListener J(int i10) {
        return new a(i10);
    }

    int K(int i10) {
        return i10 - this.f36520E.I2().l().f36492D;
    }

    int L(int i10) {
        return this.f36520E.I2().l().f36492D + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void w(b bVar, int i10) {
        int iL = L(i10);
        bVar.f36523B.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iL)));
        TextView textView = bVar.f36523B;
        textView.setContentDescription(e.e(textView.getContext(), iL));
        c cVarJ2 = this.f36520E.J2();
        Calendar calendarG = u.g();
        com.google.android.material.datepicker.b bVar2 = calendarG.get(1) == iL ? cVarJ2.f36398f : cVarJ2.f36396d;
        Iterator<Long> it = this.f36520E.L2().h1().iterator();
        while (it.hasNext()) {
            calendarG.setTimeInMillis(it.next().longValue());
            if (calendarG.get(1) == iL) {
                bVar2 = cVarJ2.f36397e;
            }
        }
        bVar2.d(bVar.f36523B);
        bVar.f36523B.setOnClickListener(J(iL));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public b y(ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C7.i.f2524v, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.f36520E.I2().m();
    }
}
