package e8;

import z7.C5209k;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
final class t extends AbstractRunnableC3254q {

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ C5209k f40779C;

    /* renamed from: D, reason: collision with root package name */
    final /* synthetic */ AbstractRunnableC3254q f40780D;

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C3236A f40781E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(C3236A c3236a, C5209k c5209k, C5209k c5209k2, AbstractRunnableC3254q abstractRunnableC3254q) {
        super(c5209k);
        this.f40781E = c3236a;
        this.f40779C = c5209k2;
        this.f40780D = abstractRunnableC3254q;
    }

    @Override // e8.AbstractRunnableC3254q
    public final void a() {
        synchronized (this.f40781E.f40749f) {
            try {
                C3236A.n(this.f40781E, this.f40779C);
                if (this.f40781E.f40754k.getAndIncrement() > 0) {
                    this.f40781E.f40745b.c("Already connected to the service.", new Object[0]);
                }
                C3236A.p(this.f40781E, this.f40780D);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
