package com.airbnb.epoxy;

import android.os.Handler;
import androidx.recyclerview.widget.C0625f;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.C5131c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: EpoxyControllerAdapter.java */
/* renamed from: com.airbnb.epoxy.o */
/* loaded from: classes.dex */
public final class C5154o extends AbstractC5133d implements C5131c.e {

    /* renamed from: k */
    private static final C0625f.d<AbstractC5166s<?>> f12255k = new a();

    /* renamed from: l */
    private final C5136e0 f12256l;

    /* renamed from: m */
    private final C5131c f12257m;

    /* renamed from: n */
    private final AbstractC5153n f12258n;

    /* renamed from: o */
    private int f12259o;

    /* renamed from: p */
    private final List<InterfaceC5140g0> f12260p;

    /* compiled from: EpoxyControllerAdapter.java */
    /* renamed from: com.airbnb.epoxy.o$a */
    static class a extends C0625f.d<AbstractC5166s<?>> {
        a() {
        }

        @Override // androidx.recyclerview.widget.C0625f.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo4483a(AbstractC5166s<?> abstractC5166s, AbstractC5166s<?> abstractC5166s2) {
            return abstractC5166s.equals(abstractC5166s2);
        }

        @Override // androidx.recyclerview.widget.C0625f.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean mo4484b(AbstractC5166s<?> abstractC5166s, AbstractC5166s<?> abstractC5166s2) {
            return abstractC5166s.m9359id() == abstractC5166s2.m9359id();
        }

        @Override // androidx.recyclerview.widget.C0625f.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object mo4485c(AbstractC5166s<?> abstractC5166s, AbstractC5166s<?> abstractC5166s2) {
            return new C5145j(abstractC5166s);
        }
    }

    C5154o(AbstractC5153n abstractC5153n, Handler handler) {
        C5136e0 c5136e0 = new C5136e0();
        this.f12256l = c5136e0;
        this.f12260p = new ArrayList();
        this.f12258n = abstractC5153n;
        this.f12257m = new C5131c(handler, this, f12255k);
        registerAdapterDataObserver(c5136e0);
    }

    /* renamed from: C */
    public void m9318C(InterfaceC5140g0 interfaceC5140g0) {
        this.f12260p.add(interfaceC5140g0);
    }

    /* renamed from: D */
    public List<AbstractC5166s<?>> m9319D() {
        return mo9267j();
    }

    /* renamed from: E */
    public int m9320E(AbstractC5166s<?> abstractC5166s) {
        int size = mo9267j().size();
        for (int i2 = 0; i2 < size; i2++) {
            if (mo9267j().get(i2).m9359id() == abstractC5166s.m9359id()) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: F */
    public boolean m9321F() {
        return this.f12257m.m9210g();
    }

    /* renamed from: G */
    void m9322G(int i2, int i3) {
        ArrayList arrayList = new ArrayList(mo9267j());
        arrayList.add(i3, arrayList.remove(i2));
        this.f12256l.m9289a();
        notifyItemMoved(i2, i3);
        this.f12256l.m9290b();
        if (this.f12257m.m9208e(arrayList)) {
            this.f12258n.requestModelBuild();
        }
    }

    /* renamed from: H */
    public void m9323H(InterfaceC5140g0 interfaceC5140g0) {
        this.f12260p.remove(interfaceC5140g0);
    }

    /* renamed from: I */
    void m9324I(C5141h c5141h) {
        List<? extends AbstractC5166s<?>> listMo9267j = mo9267j();
        if (!listMo9267j.isEmpty()) {
            if (listMo9267j.get(0).isDebugValidationEnabled()) {
                for (int i2 = 0; i2 < listMo9267j.size(); i2++) {
                    listMo9267j.get(i2).validateStateHasNotChangedSinceAdded("The model was changed between being bound and when models were rebuilt", i2);
                }
            }
        }
        this.f12257m.m9211i(c5141h);
    }

    @Override // com.airbnb.epoxy.C5131c.e
    /* renamed from: d */
    public void mo9216d(C5147k c5147k) {
        this.f12259o = c5147k.f12243b.size();
        this.f12256l.m9289a();
        c5147k.m9306d(this);
        this.f12256l.m9290b();
        for (int size = this.f12260p.size() - 1; size >= 0; size--) {
            this.f12260p.get(size).m9294a(c5147k);
        }
    }

    @Override // com.airbnb.epoxy.AbstractC5133d, androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.f12259o;
    }

    @Override // com.airbnb.epoxy.AbstractC5133d
    /* renamed from: h */
    boolean mo9265h() {
        return true;
    }

    @Override // com.airbnb.epoxy.AbstractC5133d
    /* renamed from: i */
    public C5135e mo9266i() {
        return super.mo9266i();
    }

    @Override // com.airbnb.epoxy.AbstractC5133d
    /* renamed from: j */
    List<? extends AbstractC5166s<?>> mo9267j() {
        return this.f12257m.m9209f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f12258n.onAttachedToRecyclerViewInternal(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f12258n.onDetachedFromRecyclerViewInternal(recyclerView);
    }

    @Override // com.airbnb.epoxy.AbstractC5133d
    /* renamed from: r */
    protected void mo9275r(RuntimeException runtimeException) {
        this.f12258n.onExceptionSwallowed(runtimeException);
    }

    @Override // com.airbnb.epoxy.AbstractC5133d
    /* renamed from: u */
    protected void mo9278u(C5168u c5168u, AbstractC5166s<?> abstractC5166s, int i2, AbstractC5166s<?> abstractC5166s2) {
        this.f12258n.onModelBound(c5168u, abstractC5166s, i2, abstractC5166s2);
    }

    @Override // com.airbnb.epoxy.AbstractC5133d
    /* renamed from: w */
    protected void mo9280w(C5168u c5168u, AbstractC5166s<?> abstractC5166s) {
        this.f12258n.onModelUnbound(c5168u, abstractC5166s);
    }

    @Override // com.airbnb.epoxy.AbstractC5133d, androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(C5168u c5168u) {
        super.onViewAttachedToWindow(c5168u);
        this.f12258n.onViewAttachedToWindow(c5168u, c5168u.m9364c());
    }

    @Override // com.airbnb.epoxy.AbstractC5133d, androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(C5168u c5168u) {
        super.onViewDetachedFromWindow(c5168u);
        this.f12258n.onViewDetachedFromWindow(c5168u, c5168u.m9364c());
    }
}
