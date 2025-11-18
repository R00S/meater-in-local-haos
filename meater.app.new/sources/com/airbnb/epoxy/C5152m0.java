package com.airbnb.epoxy;

import java.util.HashMap;
import java.util.Map;

/* compiled from: ViewTypeManager.java */
/* renamed from: com.airbnb.epoxy.m0 */
/* loaded from: classes.dex */
class C5152m0 {

    /* renamed from: a */
    private static final Map<Class, Integer> f12251a = new HashMap();

    /* renamed from: b */
    private AbstractC5166s<?> f12252b;

    C5152m0() {
    }

    /* renamed from: b */
    static int m9311b(AbstractC5166s<?> abstractC5166s) {
        int viewType = abstractC5166s.getViewType();
        if (viewType != 0) {
            return viewType;
        }
        Class<?> cls = abstractC5166s.getClass();
        Map<Class, Integer> map = f12251a;
        Integer numValueOf = map.get(cls);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf((-map.size()) - 1);
            map.put(cls, numValueOf);
        }
        return numValueOf.intValue();
    }

    /* renamed from: a */
    AbstractC5166s<?> m9312a(AbstractC5133d abstractC5133d, int i2) {
        AbstractC5166s<?> abstractC5166s = this.f12252b;
        if (abstractC5166s != null && m9311b(abstractC5166s) == i2) {
            return this.f12252b;
        }
        abstractC5133d.mo9275r(new IllegalStateException("Last model did not match expected view type"));
        for (AbstractC5166s<?> abstractC5166s2 : abstractC5133d.mo9267j()) {
            if (m9311b(abstractC5166s2) == i2) {
                return abstractC5166s2;
            }
        }
        C5171x c5171x = new C5171x();
        if (i2 == c5171x.getViewType()) {
            return c5171x;
        }
        throw new IllegalStateException("Could not find model for view type: " + i2);
    }

    /* renamed from: c */
    int m9313c(AbstractC5166s<?> abstractC5166s) {
        this.f12252b = abstractC5166s;
        return m9311b(abstractC5166s);
    }
}
