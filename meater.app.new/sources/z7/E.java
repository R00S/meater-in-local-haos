package z7;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class E implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ AbstractC5208j f53795B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ F f53796C;

    E(F f10, AbstractC5208j abstractC5208j) {
        this.f53796C = f10;
        this.f53795B = abstractC5208j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f53796C.f53798b) {
            try {
                F f10 = this.f53796C;
                if (f10.f53799c != null) {
                    f10.f53799c.a(this.f53795B.k());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
