package com.bumptech.glide.load.p131o.p137h;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: TranscoderRegistry.java */
/* renamed from: com.bumptech.glide.load.o.h.f */
/* loaded from: classes.dex */
public class C5530f {

    /* renamed from: a */
    private final List<a<?, ?>> f13850a = new ArrayList();

    /* compiled from: TranscoderRegistry.java */
    /* renamed from: com.bumptech.glide.load.o.h.f$a */
    private static final class a<Z, R> {

        /* renamed from: a */
        private final Class<Z> f13851a;

        /* renamed from: b */
        private final Class<R> f13852b;

        /* renamed from: c */
        final InterfaceC5529e<Z, R> f13853c;

        a(Class<Z> cls, Class<R> cls2, InterfaceC5529e<Z, R> interfaceC5529e) {
            this.f13851a = cls;
            this.f13852b = cls2;
            this.f13853c = interfaceC5529e;
        }

        /* renamed from: a */
        public boolean m10781a(Class<?> cls, Class<?> cls2) {
            return this.f13851a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f13852b);
        }
    }

    /* renamed from: a */
    public synchronized <Z, R> InterfaceC5529e<Z, R> m10778a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C5531g.m10782b();
        }
        for (a<?, ?> aVar : this.f13850a) {
            if (aVar.m10781a(cls, cls2)) {
                return (InterfaceC5529e<Z, R>) aVar.f13853c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> m10779b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator<a<?, ?>> it = this.f13850a.iterator();
        while (it.hasNext()) {
            if (it.next().m10781a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized <Z, R> void m10780c(Class<Z> cls, Class<R> cls2, InterfaceC5529e<Z, R> interfaceC5529e) {
        this.f13850a.add(new a<>(cls, cls2, interfaceC5529e));
    }
}
