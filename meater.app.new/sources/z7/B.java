package z7;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class B implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f53787a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f53788b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5203e f53789c;

    public B(Executor executor, InterfaceC5203e interfaceC5203e) {
        this.f53787a = executor;
        this.f53789c = interfaceC5203e;
    }

    @Override // z7.I
    public final void c(AbstractC5208j abstractC5208j) {
        synchronized (this.f53788b) {
            try {
                if (this.f53789c == null) {
                    return;
                }
                this.f53787a.execute(new RunnableC5198A(this, abstractC5208j));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
