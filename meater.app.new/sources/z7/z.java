package z7;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class z implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f53845a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f53846b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5202d f53847c;

    public z(Executor executor, InterfaceC5202d interfaceC5202d) {
        this.f53845a = executor;
        this.f53847c = interfaceC5202d;
    }

    @Override // z7.I
    public final void c(AbstractC5208j abstractC5208j) {
        if (abstractC5208j.m()) {
            synchronized (this.f53846b) {
                try {
                    if (this.f53847c == null) {
                        return;
                    }
                    this.f53845a.execute(new y(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
