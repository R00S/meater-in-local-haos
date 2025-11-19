package Gb;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: locks.kt */
/* loaded from: classes3.dex */
public class d implements k {

    /* renamed from: b, reason: collision with root package name */
    private final Lock f4995b;

    public d(Lock lock) {
        C3862t.g(lock, "lock");
        this.f4995b = lock;
    }

    protected final Lock a() {
        return this.f4995b;
    }

    @Override // Gb.k
    public void lock() {
        this.f4995b.lock();
    }

    @Override // Gb.k
    public void unlock() {
        this.f4995b.unlock();
    }

    public /* synthetic */ d(Lock lock, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
