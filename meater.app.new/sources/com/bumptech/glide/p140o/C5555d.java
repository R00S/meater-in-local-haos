package com.bumptech.glide.p140o;

import com.bumptech.glide.p145r.C5595i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p024c.p041e.C0867a;

/* compiled from: ModelToResourceClassCache.java */
/* renamed from: com.bumptech.glide.o.d */
/* loaded from: classes.dex */
public class C5555d {

    /* renamed from: a */
    private final AtomicReference<C5595i> f13899a = new AtomicReference<>();

    /* renamed from: b */
    private final C0867a<C5595i, List<Class<?>>> f13900b = new C0867a<>();

    /* renamed from: a */
    public List<Class<?>> m10852a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        C5595i andSet = this.f13899a.getAndSet(null);
        if (andSet == null) {
            andSet = new C5595i(cls, cls2, cls3);
        } else {
            andSet.m11038a(cls, cls2, cls3);
        }
        synchronized (this.f13900b) {
            list = this.f13900b.get(andSet);
        }
        this.f13899a.set(andSet);
        return list;
    }

    /* renamed from: b */
    public void m10853b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f13900b) {
            this.f13900b.put(new C5595i(cls, cls2, cls3), list);
        }
    }
}
