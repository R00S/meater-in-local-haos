package kotlin.reflect.p371y.internal.p374j0.p414k;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: locks.kt */
/* renamed from: kotlin.f0.y.e.j0.k.d */
/* loaded from: classes3.dex */
public class C10320d implements InterfaceC10327k {

    /* renamed from: b */
    private final Lock f40005b;

    public C10320d(Lock lock) {
        C9801m.m32346f(lock, "lock");
        this.f40005b = lock;
    }

    /* renamed from: a */
    protected final Lock m36507a() {
        return this.f40005b;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10327k
    public void lock() {
        this.f40005b.lock();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10327k
    public void unlock() {
        this.f40005b.unlock();
    }

    public /* synthetic */ C10320d(Lock lock, int i2, C9789g c9789g) {
        this((i2 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
