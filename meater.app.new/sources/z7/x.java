package z7;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class x<TResult, TContinuationResult> implements InterfaceC5205g<TContinuationResult>, InterfaceC5204f, InterfaceC5202d, I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f53841a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5201c f53842b;

    /* renamed from: c, reason: collision with root package name */
    private final N f53843c;

    public x(Executor executor, InterfaceC5201c interfaceC5201c, N n10) {
        this.f53841a = executor;
        this.f53842b = interfaceC5201c;
        this.f53843c = n10;
    }

    @Override // z7.InterfaceC5205g
    public final void a(TContinuationResult tcontinuationresult) {
        this.f53843c.s(tcontinuationresult);
    }

    @Override // z7.InterfaceC5202d
    public final void b() {
        this.f53843c.t();
    }

    @Override // z7.I
    public final void c(AbstractC5208j abstractC5208j) {
        this.f53841a.execute(new w(this, abstractC5208j));
    }

    @Override // z7.InterfaceC5204f
    public final void d(Exception exc) {
        this.f53843c.r(exc);
    }
}
