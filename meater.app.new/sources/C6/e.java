package C6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m6.InterfaceC3974i;

/* compiled from: ResourceDecoderRegistry.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f2261a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, List<a<?, ?>>> f2262b = new HashMap();

    /* compiled from: ResourceDecoderRegistry.java */
    private static class a<T, R> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f2263a;

        /* renamed from: b, reason: collision with root package name */
        final Class<R> f2264b;

        /* renamed from: c, reason: collision with root package name */
        final InterfaceC3974i<T, R> f2265c;

        public a(Class<T> cls, Class<R> cls2, InterfaceC3974i<T, R> interfaceC3974i) {
            this.f2263a = cls;
            this.f2264b = cls2;
            this.f2265c = interfaceC3974i;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f2263a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f2264b);
        }
    }

    private synchronized List<a<?, ?>> c(String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.f2261a.contains(str)) {
                this.f2261a.add(str);
            }
            arrayList = this.f2262b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f2262b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized <T, R> void a(String str, InterfaceC3974i<T, R> interfaceC3974i, Class<T> cls, Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, interfaceC3974i));
    }

    public synchronized <T, R> List<InterfaceC3974i<T, R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f2261a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f2262b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f2265c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f2261a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f2262b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f2264b)) {
                        arrayList.add(aVar.f2264b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f2261a);
            this.f2261a.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f2261a.add(it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f2261a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
