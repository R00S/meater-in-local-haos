package z7;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* renamed from: z7.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5198A implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ AbstractC5208j f53785B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ B f53786C;

    RunnableC5198A(B b10, AbstractC5208j abstractC5208j) {
        this.f53786C = b10;
        this.f53785B = abstractC5208j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f53786C.f53788b) {
            try {
                B b10 = this.f53786C;
                if (b10.f53789c != null) {
                    b10.f53789c.a(this.f53785B);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
