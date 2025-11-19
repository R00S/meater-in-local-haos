package C6;

import java.util.ArrayList;
import java.util.List;
import m6.InterfaceC3975j;

/* compiled from: ResourceEncoderRegistry.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final List<a<?>> f2266a = new ArrayList();

    /* compiled from: ResourceEncoderRegistry.java */
    private static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f2267a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC3975j<T> f2268b;

        a(Class<T> cls, InterfaceC3975j<T> interfaceC3975j) {
            this.f2267a = cls;
            this.f2268b = interfaceC3975j;
        }

        boolean a(Class<?> cls) {
            return this.f2267a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(Class<Z> cls, InterfaceC3975j<Z> interfaceC3975j) {
        this.f2266a.add(new a<>(cls, interfaceC3975j));
    }

    public synchronized <Z> InterfaceC3975j<Z> b(Class<Z> cls) {
        int size = this.f2266a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a<?> aVar = this.f2266a.get(i10);
            if (aVar.a(cls)) {
                return (InterfaceC3975j<Z>) aVar.f2268b;
            }
        }
        return null;
    }
}
