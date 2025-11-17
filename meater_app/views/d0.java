package com.apptionlabs.meater_app.views;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.f0;
import java.util.Collections;
import java.util.List;

/* compiled from: ItemAdapter.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public abstract class d0<T, VH extends RecyclerView.f0> extends RecyclerView.h<VH> implements View.OnClickListener {

    /* renamed from: t, reason: collision with root package name */
    private List<T> f10513t = Collections.emptyList();

    /* renamed from: u, reason: collision with root package name */
    private a<T, VH> f10514u;

    /* compiled from: ItemAdapter.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface a<T, VH extends RecyclerView.f0> {
        void h(VH vh, T t10, int i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<T> I() {
        return this.f10513t;
    }

    protected abstract void J(VH vh, T t10, int i10);

    public void K(List<T> list) {
        this.f10513t.clear();
        this.f10513t = list;
        n();
    }

    public void L(a<T, VH> aVar) {
        this.f10514u = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.f10513t.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f10514u != null) {
            RecyclerView.f0 f0Var = (RecyclerView.f0) view.getTag(2131362717);
            this.f10514u.h(f0Var, this.f10513t.get(f0Var.getBindingAdapterPosition()), f0Var.getBindingAdapterPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void w(VH vh, int i10) {
        vh.itemView.setOnClickListener(this);
        vh.itemView.setTag(2131362717, vh);
        J(vh, this.f10513t.get(i10), i10);
    }
}
