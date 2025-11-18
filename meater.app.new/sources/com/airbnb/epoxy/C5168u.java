package com.airbnb.epoxy;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.ViewHolderState;
import java.util.List;

/* compiled from: EpoxyViewHolder.java */
/* renamed from: com.airbnb.epoxy.u */
/* loaded from: classes.dex */
public class C5168u extends RecyclerView.AbstractC0590c0 {

    /* renamed from: a */
    private AbstractC5166s f12299a;

    /* renamed from: b */
    private List<Object> f12300b;

    /* renamed from: c */
    private AbstractC5164q f12301c;

    /* renamed from: d */
    ViewHolderState.ViewState f12302d;

    public C5168u(View view, boolean z) {
        super(view);
        if (z) {
            ViewHolderState.ViewState viewState = new ViewHolderState.ViewState();
            this.f12302d = viewState;
            viewState.m9189d(this.itemView);
        }
    }

    /* renamed from: a */
    private void m9362a() {
        if (this.f12299a == null) {
            throw new IllegalStateException("This holder is not currently bound.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public void m9363b(AbstractC5166s abstractC5166s, AbstractC5166s<?> abstractC5166s2, List<Object> list, int i2) {
        this.f12300b = list;
        if (this.f12301c == null && (abstractC5166s instanceof AbstractC5167t)) {
            AbstractC5164q abstractC5164qCreateNewHolder = ((AbstractC5167t) abstractC5166s).createNewHolder();
            this.f12301c = abstractC5164qCreateNewHolder;
            abstractC5164qCreateNewHolder.bindView(this.itemView);
        }
        boolean z = abstractC5166s instanceof InterfaceC5169v;
        if (z) {
            ((InterfaceC5169v) abstractC5166s).handlePreBind(this, m9365d(), i2);
        }
        if (abstractC5166s2 != null) {
            abstractC5166s.bind((AbstractC5166s) m9365d(), abstractC5166s2);
        } else if (list.isEmpty()) {
            abstractC5166s.bind(m9365d());
        } else {
            abstractC5166s.bind((AbstractC5166s) m9365d(), list);
        }
        if (z) {
            ((InterfaceC5169v) abstractC5166s).handlePostBind(m9365d(), i2);
        }
        this.f12299a = abstractC5166s;
    }

    /* renamed from: c */
    public AbstractC5166s<?> m9364c() {
        m9362a();
        return this.f12299a;
    }

    /* renamed from: d */
    Object m9365d() {
        AbstractC5164q abstractC5164q = this.f12301c;
        return abstractC5164q != null ? abstractC5164q : this.itemView;
    }

    /* renamed from: e */
    void m9366e() {
        ViewHolderState.ViewState viewState = this.f12302d;
        if (viewState != null) {
            viewState.m9188b(this.itemView);
        }
    }

    /* renamed from: f */
    public void m9367f() {
        m9362a();
        this.f12299a.unbind(m9365d());
        this.f12299a = null;
        this.f12300b = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0590c0
    public String toString() {
        return "EpoxyViewHolder{epoxyModel=" + this.f12299a + ", view=" + this.itemView + ", super=" + super.toString() + '}';
    }
}
