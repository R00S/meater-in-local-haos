package Q8;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: OnDemandCounter.java */
/* loaded from: classes2.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f14419a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f14420b = new AtomicInteger();

    public void a() {
        this.f14420b.getAndIncrement();
    }

    public void b() {
        this.f14419a.getAndIncrement();
    }

    public void c() {
        this.f14420b.set(0);
    }
}
