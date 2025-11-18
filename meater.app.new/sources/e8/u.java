package e8;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
final class u extends AbstractRunnableC3254q {

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ C3236A f40782C;

    u(C3236A c3236a) {
        this.f40782C = c3236a;
    }

    @Override // e8.AbstractRunnableC3254q
    public final void a() {
        synchronized (this.f40782C.f40749f) {
            try {
                if (this.f40782C.f40754k.get() > 0 && this.f40782C.f40754k.decrementAndGet() > 0) {
                    this.f40782C.f40745b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                C3236A c3236a = this.f40782C;
                if (c3236a.f40756m != null) {
                    c3236a.f40745b.c("Unbind from service.", new Object[0]);
                    C3236A c3236a2 = this.f40782C;
                    c3236a2.f40744a.unbindService(c3236a2.f40755l);
                    this.f40782C.f40750g = false;
                    this.f40782C.f40756m = null;
                    this.f40782C.f40755l = null;
                }
                this.f40782C.w();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
