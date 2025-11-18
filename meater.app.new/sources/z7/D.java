package z7;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class D implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f53792a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f53793b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5204f f53794c;

    public D(Executor executor, InterfaceC5204f interfaceC5204f) {
        this.f53792a = executor;
        this.f53794c = interfaceC5204f;
    }

    @Override // z7.I
    public final void c(AbstractC5208j abstractC5208j) {
        if (abstractC5208j.o() || abstractC5208j.m()) {
            return;
        }
        synchronized (this.f53793b) {
            try {
                if (this.f53794c == null) {
                    return;
                }
                this.f53792a.execute(new C(this, abstractC5208j));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
