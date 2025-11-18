package com.airbnb.epoxy;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p024c.p041e.C0870d;

/* compiled from: DiffPayload.java */
/* renamed from: com.airbnb.epoxy.j */
/* loaded from: classes.dex */
public class C5145j {

    /* renamed from: a */
    private final AbstractC5166s<?> f12240a;

    /* renamed from: b */
    private final C0870d<AbstractC5166s<?>> f12241b;

    C5145j(List<? extends AbstractC5166s<?>> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Models must not be empty");
        }
        int size = list.size();
        if (size == 1) {
            this.f12240a = list.get(0);
            this.f12241b = null;
            return;
        }
        this.f12240a = null;
        this.f12241b = new C0870d<>(size);
        for (AbstractC5166s<?> abstractC5166s : list) {
            this.f12241b.m5442k(abstractC5166s.m9359id(), abstractC5166s);
        }
    }

    /* renamed from: a */
    public static AbstractC5166s<?> m9299a(List<Object> list, long j2) {
        if (list.isEmpty()) {
            return null;
        }
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            C5145j c5145j = (C5145j) it.next();
            AbstractC5166s<?> abstractC5166s = c5145j.f12240a;
            if (abstractC5166s == null) {
                AbstractC5166s<?> abstractC5166sM5438g = c5145j.f12241b.m5438g(j2);
                if (abstractC5166sM5438g != null) {
                    return abstractC5166sM5438g;
                }
            } else if (abstractC5166s.m9359id() == j2) {
                return c5145j.f12240a;
            }
        }
        return null;
    }

    public C5145j(AbstractC5166s<?> abstractC5166s) {
        this((List<? extends AbstractC5166s<?>>) Collections.singletonList(abstractC5166s));
    }
}
