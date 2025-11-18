package p323h.p324a.p329z.p343i;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p329z.p331b.C9108b;
import p323h.p324a.p329z.p344j.C9177b;
import p355k.p356a.InterfaceC9730c;

/* compiled from: SubscriptionHelper.java */
/* renamed from: h.a.z.i.b */
/* loaded from: classes2.dex */
public enum EnumC9175b implements InterfaceC9730c {
    CANCELLED;

    /* renamed from: g */
    public static boolean m29377g(AtomicReference<InterfaceC9730c> atomicReference) {
        InterfaceC9730c andSet;
        InterfaceC9730c interfaceC9730c = atomicReference.get();
        EnumC9175b enumC9175b = CANCELLED;
        if (interfaceC9730c == enumC9175b || (andSet = atomicReference.getAndSet(enumC9175b)) == enumC9175b) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    /* renamed from: k */
    public static void m29378k(AtomicReference<InterfaceC9730c> atomicReference, AtomicLong atomicLong, long j2) {
        InterfaceC9730c interfaceC9730c = atomicReference.get();
        if (interfaceC9730c != null) {
            interfaceC9730c.request(j2);
            return;
        }
        if (m29382x(j2)) {
            C9177b.m29386a(atomicLong, j2);
            InterfaceC9730c interfaceC9730c2 = atomicReference.get();
            if (interfaceC9730c2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    interfaceC9730c2.request(andSet);
                }
            }
        }
    }

    /* renamed from: q */
    public static boolean m29379q(AtomicReference<InterfaceC9730c> atomicReference, AtomicLong atomicLong, InterfaceC9730c interfaceC9730c) {
        if (!m29381v(atomicReference, interfaceC9730c)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        interfaceC9730c.request(andSet);
        return true;
    }

    /* renamed from: u */
    public static void m29380u() {
        C9063a.m29147o(new ProtocolViolationException("Subscription already set!"));
    }

    /* renamed from: v */
    public static boolean m29381v(AtomicReference<InterfaceC9730c> atomicReference, InterfaceC9730c interfaceC9730c) {
        C9108b.m29271c(interfaceC9730c, "s is null");
        if (atomicReference.compareAndSet(null, interfaceC9730c)) {
            return true;
        }
        interfaceC9730c.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        m29380u();
        return false;
    }

    /* renamed from: x */
    public static boolean m29382x(long j2) {
        if (j2 > 0) {
            return true;
        }
        C9063a.m29147o(new IllegalArgumentException("n > 0 required but it was " + j2));
        return false;
    }

    /* renamed from: y */
    public static boolean m29383y(InterfaceC9730c interfaceC9730c, InterfaceC9730c interfaceC9730c2) {
        if (interfaceC9730c2 == null) {
            C9063a.m29147o(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC9730c == null) {
            return true;
        }
        interfaceC9730c2.cancel();
        m29380u();
        return false;
    }

    @Override // p355k.p356a.InterfaceC9730c
    public void cancel() {
    }

    @Override // p355k.p356a.InterfaceC9730c
    public void request(long j2) {
    }
}
