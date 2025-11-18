package com.airbnb.epoxy;

import java.util.List;

/* compiled from: EpoxyAdapter.java */
/* renamed from: com.airbnb.epoxy.l */
/* loaded from: classes.dex */
public abstract class AbstractC5149l extends AbstractC5133d {

    /* renamed from: k */
    private final C5171x f12245k = new C5171x();

    /* renamed from: l */
    protected final List<AbstractC5166s<?>> f12246l = new C5132c0();

    @Override // com.airbnb.epoxy.AbstractC5133d
    /* renamed from: j */
    List<AbstractC5166s<?>> mo9267j() {
        return this.f12246l;
    }

    @Override // com.airbnb.epoxy.AbstractC5133d
    /* renamed from: k */
    AbstractC5166s<?> mo9268k(int i2) {
        AbstractC5166s<?> abstractC5166s = this.f12246l.get(i2);
        return abstractC5166s.isShown() ? abstractC5166s : this.f12245k;
    }
}
