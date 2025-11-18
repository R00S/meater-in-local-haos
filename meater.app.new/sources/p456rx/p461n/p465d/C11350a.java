package p456rx.p461n.p465d;

import java.util.concurrent.atomic.AtomicReference;
import p456rx.InterfaceC11246k;
import p456rx.p474t.C11429e;

/* compiled from: SequentialSubscription.java */
/* renamed from: rx.n.d.a */
/* loaded from: classes3.dex */
public final class C11350a extends AtomicReference<InterfaceC11246k> implements InterfaceC11246k {
    public C11350a() {
    }

    /* renamed from: a */
    public InterfaceC11246k m40414a() {
        InterfaceC11246k interfaceC11246k = (InterfaceC11246k) super.get();
        return interfaceC11246k == EnumC11351b.INSTANCE ? C11429e.m40676c() : interfaceC11246k;
    }

    /* renamed from: b */
    public boolean m40415b(InterfaceC11246k interfaceC11246k) {
        InterfaceC11246k interfaceC11246k2;
        do {
            interfaceC11246k2 = get();
            if (interfaceC11246k2 == EnumC11351b.INSTANCE) {
                if (interfaceC11246k == null) {
                    return false;
                }
                interfaceC11246k.unsubscribe();
                return false;
            }
        } while (!compareAndSet(interfaceC11246k2, interfaceC11246k));
        return true;
    }

    /* renamed from: c */
    public boolean m40416c(InterfaceC11246k interfaceC11246k) {
        InterfaceC11246k interfaceC11246k2;
        do {
            interfaceC11246k2 = get();
            if (interfaceC11246k2 == EnumC11351b.INSTANCE) {
                if (interfaceC11246k == null) {
                    return false;
                }
                interfaceC11246k.unsubscribe();
                return false;
            }
        } while (!compareAndSet(interfaceC11246k2, interfaceC11246k));
        if (interfaceC11246k2 == null) {
            return true;
        }
        interfaceC11246k2.unsubscribe();
        return true;
    }

    @Override // p456rx.InterfaceC11246k
    public boolean isUnsubscribed() {
        return get() == EnumC11351b.INSTANCE;
    }

    @Override // p456rx.InterfaceC11246k
    public void unsubscribe() {
        InterfaceC11246k andSet;
        InterfaceC11246k interfaceC11246k = get();
        EnumC11351b enumC11351b = EnumC11351b.INSTANCE;
        if (interfaceC11246k == enumC11351b || (andSet = getAndSet(enumC11351b)) == null || andSet == enumC11351b) {
            return;
        }
        andSet.unsubscribe();
    }

    public C11350a(InterfaceC11246k interfaceC11246k) {
        lazySet(interfaceC11246k);
    }
}
