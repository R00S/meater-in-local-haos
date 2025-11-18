package K8;

import j9.InterfaceC3754a;
import j9.InterfaceC3755b;
import java.util.Set;

/* compiled from: ComponentContainer.java */
/* loaded from: classes2.dex */
public interface d {
    default <T> T a(Class<T> cls) {
        return (T) g(A.b(cls));
    }

    <T> InterfaceC3754a<T> b(A<T> a10);

    <T> InterfaceC3755b<Set<T>> c(A<T> a10);

    default <T> InterfaceC3755b<T> d(Class<T> cls) {
        return f(A.b(cls));
    }

    default <T> Set<T> e(Class<T> cls) {
        return h(A.b(cls));
    }

    <T> InterfaceC3755b<T> f(A<T> a10);

    default <T> T g(A<T> a10) {
        InterfaceC3755b<T> interfaceC3755bF = f(a10);
        if (interfaceC3755bF == null) {
            return null;
        }
        return interfaceC3755bF.get();
    }

    default <T> Set<T> h(A<T> a10) {
        return c(a10).get();
    }

    default <T> InterfaceC3754a<T> i(Class<T> cls) {
        return b(A.b(cls));
    }
}
