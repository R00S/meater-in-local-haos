package z7;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class H<TResult, TContinuationResult> implements InterfaceC5205g<TContinuationResult>, InterfaceC5204f, InterfaceC5202d, I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f53802a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5207i f53803b;

    /* renamed from: c, reason: collision with root package name */
    private final N f53804c;

    public H(Executor executor, InterfaceC5207i interfaceC5207i, N n10) {
        this.f53802a = executor;
        this.f53803b = interfaceC5207i;
        this.f53804c = n10;
    }

    @Override // z7.InterfaceC5205g
    public final void a(TContinuationResult tcontinuationresult) {
        this.f53804c.s(tcontinuationresult);
    }

    @Override // z7.InterfaceC5202d
    public final void b() {
        this.f53804c.t();
    }

    @Override // z7.I
    public final void c(AbstractC5208j abstractC5208j) {
        this.f53802a.execute(new G(this, abstractC5208j));
    }

    @Override // z7.InterfaceC5204f
    public final void d(Exception exc) {
        this.f53804c.r(exc);
    }
}
