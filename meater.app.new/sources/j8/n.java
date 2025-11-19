package j8;

/* compiled from: com.google.android.play:review@@2.0.2 */
/* loaded from: classes2.dex */
final class n extends j {

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ t f43548C;

    n(t tVar) {
        this.f43548C = tVar;
    }

    @Override // j8.j
    public final void a() {
        synchronized (this.f43548C.f43559f) {
            try {
                if (this.f43548C.f43564k.get() > 0 && this.f43548C.f43564k.decrementAndGet() > 0) {
                    this.f43548C.f43555b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                t tVar = this.f43548C;
                if (tVar.f43566m != null) {
                    tVar.f43555b.c("Unbind from service.", new Object[0]);
                    t tVar2 = this.f43548C;
                    tVar2.f43554a.unbindService(tVar2.f43565l);
                    this.f43548C.f43560g = false;
                    this.f43548C.f43566m = null;
                    this.f43548C.f43565l = null;
                }
                this.f43548C.w();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
