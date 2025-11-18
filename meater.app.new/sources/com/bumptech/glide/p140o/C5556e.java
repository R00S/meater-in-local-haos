package com.bumptech.glide.p140o;

import com.bumptech.glide.load.InterfaceC5427j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: ResourceDecoderRegistry.java */
/* renamed from: com.bumptech.glide.o.e */
/* loaded from: classes.dex */
public class C5556e {

    /* renamed from: a */
    private final List<String> f13901a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<a<?, ?>>> f13902b = new HashMap();

    /* compiled from: ResourceDecoderRegistry.java */
    /* renamed from: com.bumptech.glide.o.e$a */
    private static class a<T, R> {

        /* renamed from: a */
        private final Class<T> f13903a;

        /* renamed from: b */
        final Class<R> f13904b;

        /* renamed from: c */
        final InterfaceC5427j<T, R> f13905c;

        public a(Class<T> cls, Class<R> cls2, InterfaceC5427j<T, R> interfaceC5427j) {
            this.f13903a = cls;
            this.f13904b = cls2;
            this.f13905c = interfaceC5427j;
        }

        /* renamed from: a */
        public boolean m10859a(Class<?> cls, Class<?> cls2) {
            return this.f13903a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f13904b);
        }
    }

    /* renamed from: c */
    private synchronized List<a<?, ?>> m10854c(String str) {
        List<a<?, ?>> arrayList;
        if (!this.f13901a.contains(str)) {
            this.f13901a.add(str);
        }
        arrayList = this.f13902b.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f13902b.put(str, arrayList);
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <T, R> void m10855a(String str, InterfaceC5427j<T, R> interfaceC5427j, Class<T> cls, Class<R> cls2) {
        m10854c(str).add(new a<>(cls, cls2, interfaceC5427j));
    }

    /* renamed from: b */
    public synchronized <T, R> List<InterfaceC5427j<T, R>> m10856b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f13901a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f13902b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.m10859a(cls, cls2)) {
                        arrayList.add(aVar.f13905c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized <T, R> List<Class<R>> m10857d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f13901a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f13902b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.m10859a(cls, cls2) && !arrayList.contains(aVar.f13904b)) {
                        arrayList.add(aVar.f13904b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void m10858e(List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.f13901a);
        this.f13901a.clear();
        this.f13901a.addAll(list);
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f13901a.add(str);
            }
        }
    }
}
