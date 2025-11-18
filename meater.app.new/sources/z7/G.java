package z7;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class G implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ AbstractC5208j f53800B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ H f53801C;

    G(H h10, AbstractC5208j abstractC5208j) {
        this.f53801C = h10;
        this.f53800B = abstractC5208j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC5208j abstractC5208jA = this.f53801C.f53803b.a(this.f53800B.k());
            if (abstractC5208jA == null) {
                this.f53801C.d(new NullPointerException("Continuation returned null"));
                return;
            }
            H h10 = this.f53801C;
            Executor executor = C5210l.f53821b;
            abstractC5208jA.f(executor, h10);
            abstractC5208jA.d(executor, this.f53801C);
            abstractC5208jA.a(executor, this.f53801C);
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                this.f53801C.d((Exception) e10.getCause());
            } else {
                this.f53801C.d(e10);
            }
        } catch (CancellationException unused) {
            this.f53801C.b();
        } catch (Exception e11) {
            this.f53801C.d(e11);
        }
    }
}
