package p456rx.p461n.p463b;

import java.util.concurrent.atomic.AtomicBoolean;
import p456rx.AbstractC11245j;
import p456rx.InterfaceC11242g;
import p456rx.exceptions.C11240a;

/* compiled from: SingleProducer.java */
/* renamed from: rx.n.b.c */
/* loaded from: classes3.dex */
public final class C11335c<T> extends AtomicBoolean implements InterfaceC11242g {

    /* renamed from: f */
    final AbstractC11245j<? super T> f42736f;

    /* renamed from: g */
    final T f42737g;

    public C11335c(AbstractC11245j<? super T> abstractC11245j, T t) {
        this.f42736f = abstractC11245j;
        this.f42737g = t;
    }

    @Override // p456rx.InterfaceC11242g
    public void request(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j2 != 0 && compareAndSet(false, true)) {
            AbstractC11245j<? super T> abstractC11245j = this.f42736f;
            if (abstractC11245j.isUnsubscribed()) {
                return;
            }
            T t = this.f42737g;
            try {
                abstractC11245j.onNext(t);
                if (abstractC11245j.isUnsubscribed()) {
                    return;
                }
                abstractC11245j.onCompleted();
            } catch (Throwable th) {
                C11240a.m40142g(th, abstractC11245j, t);
            }
        }
    }
}
