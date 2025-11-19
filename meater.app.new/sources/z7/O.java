package z7;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class O implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ N f53816B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ Callable f53817C;

    O(N n10, Callable callable) {
        this.f53816B = n10;
        this.f53817C = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f53816B.s(this.f53817C.call());
        } catch (Exception e10) {
            this.f53816B.r(e10);
        } catch (Throwable th) {
            this.f53816B.r(new RuntimeException(th));
        }
    }
}
