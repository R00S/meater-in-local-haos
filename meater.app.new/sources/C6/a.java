package C6;

import java.util.ArrayList;
import java.util.List;
import m6.InterfaceC3969d;

/* compiled from: EncoderRegistry.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final List<C0046a<?>> f2252a = new ArrayList();

    /* compiled from: EncoderRegistry.java */
    /* renamed from: C6.a$a, reason: collision with other inner class name */
    private static final class C0046a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f2253a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC3969d<T> f2254b;

        C0046a(Class<T> cls, InterfaceC3969d<T> interfaceC3969d) {
            this.f2253a = cls;
            this.f2254b = interfaceC3969d;
        }

        boolean a(Class<?> cls) {
            return this.f2253a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(Class<T> cls, InterfaceC3969d<T> interfaceC3969d) {
        this.f2252a.add(new C0046a<>(cls, interfaceC3969d));
    }

    public synchronized <T> InterfaceC3969d<T> b(Class<T> cls) {
        for (C0046a<?> c0046a : this.f2252a) {
            if (c0046a.a(cls)) {
                return (InterfaceC3969d<T>) c0046a.f2254b;
            }
        }
        return null;
    }
}
