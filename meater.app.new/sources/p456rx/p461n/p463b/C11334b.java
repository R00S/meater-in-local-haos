package p456rx.p461n.p463b;

import java.util.concurrent.atomic.AtomicInteger;
import p456rx.AbstractC11245j;
import p456rx.InterfaceC11242g;
import p456rx.exceptions.C11240a;

/* compiled from: SingleDelayedProducer.java */
/* renamed from: rx.n.b.b */
/* loaded from: classes3.dex */
public final class C11334b<T> extends AtomicInteger implements InterfaceC11242g {

    /* renamed from: f */
    final AbstractC11245j<? super T> f42734f;

    /* renamed from: g */
    T f42735g;

    public C11334b(AbstractC11245j<? super T> abstractC11245j) {
        this.f42734f = abstractC11245j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static <T> void m40376a(AbstractC11245j<? super T> abstractC11245j, T t) {
        if (abstractC11245j.isUnsubscribed()) {
            return;
        }
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

    /* renamed from: b */
    public void m40377b(T t) {
        do {
            int i2 = get();
            if (i2 != 0) {
                if (i2 == 2 && compareAndSet(2, 3)) {
                    m40376a(this.f42734f, t);
                    return;
                }
                return;
            }
            this.f42735g = t;
        } while (!compareAndSet(0, 1));
    }

    @Override // p456rx.InterfaceC11242g
    public void request(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j2 == 0) {
            return;
        }
        do {
            int i2 = get();
            if (i2 != 0) {
                if (i2 == 1 && compareAndSet(1, 3)) {
                    m40376a(this.f42734f, this.f42735g);
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 2));
    }
}
