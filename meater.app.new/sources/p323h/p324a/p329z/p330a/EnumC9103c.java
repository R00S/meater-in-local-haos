package p323h.p324a.p329z.p330a;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p329z.p331b.C9108b;

/* compiled from: DisposableHelper.java */
/* renamed from: h.a.z.a.c */
/* loaded from: classes2.dex */
public enum EnumC9103c implements InterfaceC9089c {
    DISPOSED;

    /* renamed from: A */
    public static boolean m29248A(AtomicReference<InterfaceC9089c> atomicReference, InterfaceC9089c interfaceC9089c) {
        C9108b.m29271c(interfaceC9089c, "d is null");
        if (atomicReference.compareAndSet(null, interfaceC9089c)) {
            return true;
        }
        interfaceC9089c.mo29115k();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        m29253x();
        return false;
    }

    /* renamed from: D */
    public static boolean m29249D(InterfaceC9089c interfaceC9089c, InterfaceC9089c interfaceC9089c2) {
        if (interfaceC9089c2 == null) {
            C9063a.m29147o(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC9089c == null) {
            return true;
        }
        interfaceC9089c2.mo29115k();
        m29253x();
        return false;
    }

    /* renamed from: g */
    public static boolean m29250g(AtomicReference<InterfaceC9089c> atomicReference) {
        InterfaceC9089c andSet;
        InterfaceC9089c interfaceC9089c = atomicReference.get();
        EnumC9103c enumC9103c = DISPOSED;
        if (interfaceC9089c == enumC9103c || (andSet = atomicReference.getAndSet(enumC9103c)) == enumC9103c) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.mo29115k();
        return true;
    }

    /* renamed from: u */
    public static boolean m29251u(InterfaceC9089c interfaceC9089c) {
        return interfaceC9089c == DISPOSED;
    }

    /* renamed from: v */
    public static boolean m29252v(AtomicReference<InterfaceC9089c> atomicReference, InterfaceC9089c interfaceC9089c) {
        InterfaceC9089c interfaceC9089c2;
        do {
            interfaceC9089c2 = atomicReference.get();
            if (interfaceC9089c2 == DISPOSED) {
                if (interfaceC9089c == null) {
                    return false;
                }
                interfaceC9089c.mo29115k();
                return false;
            }
        } while (!atomicReference.compareAndSet(interfaceC9089c2, interfaceC9089c));
        return true;
    }

    /* renamed from: x */
    public static void m29253x() {
        C9063a.m29147o(new ProtocolViolationException("Disposable already set!"));
    }

    /* renamed from: y */
    public static boolean m29254y(AtomicReference<InterfaceC9089c> atomicReference, InterfaceC9089c interfaceC9089c) {
        InterfaceC9089c interfaceC9089c2;
        do {
            interfaceC9089c2 = atomicReference.get();
            if (interfaceC9089c2 == DISPOSED) {
                if (interfaceC9089c == null) {
                    return false;
                }
                interfaceC9089c.mo29115k();
                return false;
            }
        } while (!atomicReference.compareAndSet(interfaceC9089c2, interfaceC9089c));
        if (interfaceC9089c2 == null) {
            return true;
        }
        interfaceC9089c2.mo29115k();
        return true;
    }

    @Override // p323h.p324a.p327x.InterfaceC9089c
    /* renamed from: k */
    public void mo29115k() {
    }

    @Override // p323h.p324a.p327x.InterfaceC9089c
    /* renamed from: q */
    public boolean mo29116q() {
        return true;
    }
}
