package z7;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class F implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f53797a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f53798b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5205g f53799c;

    public F(Executor executor, InterfaceC5205g interfaceC5205g) {
        this.f53797a = executor;
        this.f53799c = interfaceC5205g;
    }

    @Override // z7.I
    public final void c(AbstractC5208j abstractC5208j) {
        if (abstractC5208j.o()) {
            synchronized (this.f53798b) {
                try {
                    if (this.f53799c == null) {
                        return;
                    }
                    this.f53797a.execute(new E(this, abstractC5208j));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
