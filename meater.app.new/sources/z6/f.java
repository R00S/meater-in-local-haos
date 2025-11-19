package z6;

import java.util.ArrayList;
import java.util.List;

/* compiled from: TranscoderRegistry.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final List<a<?, ?>> f53780a = new ArrayList();

    /* compiled from: TranscoderRegistry.java */
    private static final class a<Z, R> {

        /* renamed from: a, reason: collision with root package name */
        final Class<Z> f53781a;

        /* renamed from: b, reason: collision with root package name */
        final Class<R> f53782b;

        /* renamed from: c, reason: collision with root package name */
        final e<Z, R> f53783c;

        a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
            this.f53781a = cls;
            this.f53782b = cls2;
            this.f53783c = eVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f53781a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f53782b);
        }
    }

    public synchronized <Z, R> e<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a<?, ?> aVar : this.f53780a) {
            if (aVar.a(cls, cls2)) {
                return (e<Z, R>) aVar.f53783c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> List<Class<R>> b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.f53780a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f53782b)) {
                arrayList.add(aVar.f53782b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
        this.f53780a.add(new a<>(cls, cls2, eVar));
    }
}
