package z7;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class q<T> implements r<T> {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f53824a = new CountDownLatch(1);

    /* synthetic */ q(p pVar) {
    }

    @Override // z7.InterfaceC5205g
    public final void a(T t10) {
        this.f53824a.countDown();
    }

    @Override // z7.InterfaceC5202d
    public final void b() {
        this.f53824a.countDown();
    }

    public final void c() throws InterruptedException {
        this.f53824a.await();
    }

    @Override // z7.InterfaceC5204f
    public final void d(Exception exc) {
        this.f53824a.countDown();
    }

    public final boolean e(long j10, TimeUnit timeUnit) {
        return this.f53824a.await(j10, timeUnit);
    }
}
