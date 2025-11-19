package z7;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class v implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f53836a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5201c f53837b;

    /* renamed from: c, reason: collision with root package name */
    private final N f53838c;

    public v(Executor executor, InterfaceC5201c interfaceC5201c, N n10) {
        this.f53836a = executor;
        this.f53837b = interfaceC5201c;
        this.f53838c = n10;
    }

    @Override // z7.I
    public final void c(AbstractC5208j abstractC5208j) {
        this.f53836a.execute(new u(this, abstractC5208j));
    }
}
