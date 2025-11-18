package p323h.p324a.p329z.p344j;

import java.util.concurrent.atomic.AtomicInteger;
import p323h.p324a.p325a0.C9063a;
import p355k.p356a.InterfaceC9729b;

/* compiled from: HalfSerializer.java */
/* renamed from: h.a.z.j.d */
/* loaded from: classes2.dex */
public final class C9179d {
    /* renamed from: a */
    public static void m29392a(InterfaceC9729b<?> interfaceC9729b, AtomicInteger atomicInteger, C9176a c9176a) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thM29385b = c9176a.m29385b();
            if (thM29385b != null) {
                interfaceC9729b.onError(thM29385b);
            } else {
                interfaceC9729b.mo29121a();
            }
        }
    }

    /* renamed from: b */
    public static void m29393b(InterfaceC9729b<?> interfaceC9729b, Throwable th, AtomicInteger atomicInteger, C9176a c9176a) {
        if (!c9176a.m29384a(th)) {
            C9063a.m29147o(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            interfaceC9729b.onError(c9176a.m29385b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static <T> void m29394c(InterfaceC9729b<? super T> interfaceC9729b, T t, AtomicInteger atomicInteger, C9176a c9176a) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            interfaceC9729b.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thM29385b = c9176a.m29385b();
                if (thM29385b != null) {
                    interfaceC9729b.onError(thM29385b);
                } else {
                    interfaceC9729b.mo29121a();
                }
            }
        }
    }
}
