package com.bumptech.glide.p140o;

import com.bumptech.glide.load.engine.C5392i;
import com.bumptech.glide.load.engine.C5402s;
import com.bumptech.glide.load.p131o.p137h.C5531g;
import com.bumptech.glide.p145r.C5595i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p024c.p041e.C0867a;

/* compiled from: LoadPathCache.java */
/* renamed from: com.bumptech.glide.o.c */
/* loaded from: classes.dex */
public class C5554c {

    /* renamed from: a */
    private static final C5402s<?, ?, ?> f13896a = new C5402s<>(Object.class, Object.class, Object.class, Collections.singletonList(new C5392i(Object.class, Object.class, Object.class, Collections.emptyList(), new C5531g(), null)), null);

    /* renamed from: b */
    private final C0867a<C5595i, C5402s<?, ?, ?>> f13897b = new C0867a<>();

    /* renamed from: c */
    private final AtomicReference<C5595i> f13898c = new AtomicReference<>();

    /* renamed from: b */
    private C5595i m10848b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C5595i andSet = this.f13898c.getAndSet(null);
        if (andSet == null) {
            andSet = new C5595i();
        }
        andSet.m11038a(cls, cls2, cls3);
        return andSet;
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C5402s<Data, TResource, Transcode> m10849a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C5402s<Data, TResource, Transcode> c5402s;
        C5595i c5595iM10848b = m10848b(cls, cls2, cls3);
        synchronized (this.f13897b) {
            c5402s = (C5402s) this.f13897b.get(c5595iM10848b);
        }
        this.f13898c.set(c5595iM10848b);
        return c5402s;
    }

    /* renamed from: c */
    public boolean m10850c(C5402s<?, ?, ?> c5402s) {
        return f13896a.equals(c5402s);
    }

    /* renamed from: d */
    public void m10851d(Class<?> cls, Class<?> cls2, Class<?> cls3, C5402s<?, ?, ?> c5402s) {
        synchronized (this.f13897b) {
            C0867a<C5595i, C5402s<?, ?, ?>> c0867a = this.f13897b;
            C5595i c5595i = new C5595i(cls, cls2, cls3);
            if (c5402s == null) {
                c5402s = f13896a;
            }
            c0867a.put(c5595i, c5402s);
        }
    }
}
