package j8;

import z7.C5209k;

/* compiled from: com.google.android.play:review@@2.0.2 */
/* loaded from: classes2.dex */
final class m extends j {

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ C5209k f43545C;

    /* renamed from: D, reason: collision with root package name */
    final /* synthetic */ j f43546D;

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ t f43547E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(t tVar, C5209k c5209k, C5209k c5209k2, j jVar) {
        super(c5209k);
        this.f43545C = c5209k2;
        this.f43546D = jVar;
        this.f43547E = tVar;
    }

    @Override // j8.j
    public final void a() {
        synchronized (this.f43547E.f43559f) {
            try {
                t.n(this.f43547E, this.f43545C);
                if (this.f43547E.f43564k.getAndIncrement() > 0) {
                    this.f43547E.f43555b.c("Already connected to the service.", new Object[0]);
                }
                t.p(this.f43547E, this.f43546D);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
