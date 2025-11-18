package com.airbnb.epoxy;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: BaseEpoxyAdapter.java */
/* renamed from: com.airbnb.epoxy.d */
/* loaded from: classes.dex */
public abstract class AbstractC5133d extends RecyclerView.AbstractC0594g<C5168u> {

    /* renamed from: f */
    private int f12224f = 1;

    /* renamed from: g */
    private final C5152m0 f12225g = new C5152m0();

    /* renamed from: h */
    private final C5135e f12226h = new C5135e();

    /* renamed from: i */
    private ViewHolderState f12227i = new ViewHolderState();

    /* renamed from: j */
    private final GridLayoutManager.AbstractC0579c f12228j;

    /* compiled from: BaseEpoxyAdapter.java */
    /* renamed from: com.airbnb.epoxy.d$a */
    class a extends GridLayoutManager.AbstractC0579c {
        a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0579c
        public int getSpanSize(int i2) {
            try {
                return AbstractC5133d.this.mo9268k(i2).spanSize(AbstractC5133d.this.f12224f, i2, AbstractC5133d.this.getItemCount());
            } catch (IndexOutOfBoundsException e2) {
                AbstractC5133d.this.mo9275r(e2);
                return 1;
            }
        }
    }

    public AbstractC5133d() {
        a aVar = new a();
        this.f12228j = aVar;
        setHasStableIds(true);
        aVar.setSpanIndexCacheEnabled(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(C5168u c5168u) {
        this.f12227i.m9186q(c5168u);
        this.f12226h.m9287g(c5168u);
        AbstractC5166s<?> abstractC5166sM9364c = c5168u.m9364c();
        c5168u.m9367f();
        mo9280w(c5168u, abstractC5166sM9364c);
    }

    /* renamed from: B */
    public void m9264B(int i2) {
        this.f12224f = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return mo9267j().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public long getItemId(int i2) {
        return mo9267j().get(i2).m9359id();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemViewType(int i2) {
        return this.f12225g.m9313c(mo9268k(i2));
    }

    /* renamed from: h */
    boolean mo9265h() {
        return false;
    }

    /* renamed from: i */
    protected C5135e mo9266i() {
        return this.f12226h;
    }

    /* renamed from: j */
    abstract List<? extends AbstractC5166s<?>> mo9267j();

    /* renamed from: k */
    AbstractC5166s<?> mo9268k(int i2) {
        return mo9267j().get(i2);
    }

    /* renamed from: l */
    public int m9269l() {
        return this.f12224f;
    }

    /* renamed from: m */
    public GridLayoutManager.AbstractC0579c m9270m() {
        return this.f12228j;
    }

    /* renamed from: n */
    public boolean m9271n() {
        return this.f12224f > 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C5168u c5168u, int i2) {
        onBindViewHolder(c5168u, i2, Collections.emptyList());
    }

    public void onSaveInstanceState(Bundle bundle) {
        Iterator<C5168u> it = this.f12226h.iterator();
        while (it.hasNext()) {
            this.f12227i.m9186q(it.next());
        }
        if (this.f12227i.m5445n() > 0 && !hasStableIds()) {
            throw new IllegalStateException("Must have stable ids when saving view holder state");
        }
        bundle.putParcelable("saved_state_view_holders", this.f12227i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C5168u c5168u, int i2, List<Object> list) {
        AbstractC5166s<?> abstractC5166sMo9268k = mo9268k(i2);
        AbstractC5166s<?> abstractC5166sM9299a = mo9265h() ? C5145j.m9299a(list, getItemId(i2)) : null;
        c5168u.m9363b(abstractC5166sMo9268k, abstractC5166sM9299a, list, i2);
        if (list.isEmpty()) {
            this.f12227i.m9185p(c5168u);
        }
        this.f12226h.m9286f(c5168u);
        if (mo9265h()) {
            mo9278u(c5168u, abstractC5166sMo9268k, i2, abstractC5166sM9299a);
        } else {
            m9279v(c5168u, abstractC5166sMo9268k, i2, list);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public C5168u onCreateViewHolder(ViewGroup viewGroup, int i2) {
        AbstractC5166s<?> abstractC5166sM9312a = this.f12225g.m9312a(this, i2);
        return new C5168u(abstractC5166sM9312a.buildView(viewGroup), abstractC5166sM9312a.shouldSaveViewState());
    }

    /* renamed from: r */
    protected void mo9275r(RuntimeException runtimeException) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean onFailedToRecycleView(C5168u c5168u) {
        return c5168u.m9364c().onFailedToRecycleView(c5168u.m9365d());
    }

    /* renamed from: t */
    protected void m9277t(C5168u c5168u, AbstractC5166s<?> abstractC5166s, int i2) {
    }

    /* renamed from: u */
    void mo9278u(C5168u c5168u, AbstractC5166s<?> abstractC5166s, int i2, AbstractC5166s<?> abstractC5166s2) {
        m9277t(c5168u, abstractC5166s, i2);
    }

    /* renamed from: v */
    protected void m9279v(C5168u c5168u, AbstractC5166s<?> abstractC5166s, int i2, List<Object> list) {
        m9277t(c5168u, abstractC5166s, i2);
    }

    /* renamed from: w */
    protected void mo9280w(C5168u c5168u, AbstractC5166s<?> abstractC5166s) {
    }

    /* renamed from: x */
    public void m9281x(Bundle bundle) {
        if (this.f12226h.size() > 0) {
            throw new IllegalStateException("State cannot be restored once views have been bound. It should be done before adding the adapter to the recycler view.");
        }
        if (bundle != null) {
            ViewHolderState viewHolderState = (ViewHolderState) bundle.getParcelable("saved_state_view_holders");
            this.f12227i = viewHolderState;
            if (viewHolderState == null) {
                throw new IllegalStateException("Tried to restore instance state, but onSaveInstanceState was never called.");
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    /* renamed from: y */
    public void onViewAttachedToWindow(C5168u c5168u) {
        c5168u.m9364c().onViewAttachedToWindow(c5168u.m9365d());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    /* renamed from: z */
    public void onViewDetachedFromWindow(C5168u c5168u) {
        c5168u.m9364c().onViewDetachedFromWindow(c5168u.m9365d());
    }
}
