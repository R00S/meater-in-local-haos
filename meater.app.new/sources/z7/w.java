package z7;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class w implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ AbstractC5208j f53839B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ x f53840C;

    w(x xVar, AbstractC5208j abstractC5208j) {
        this.f53840C = xVar;
        this.f53839B = abstractC5208j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC5208j abstractC5208j = (AbstractC5208j) this.f53840C.f53842b.a(this.f53839B);
            if (abstractC5208j == null) {
                this.f53840C.d(new NullPointerException("Continuation returned null"));
                return;
            }
            x xVar = this.f53840C;
            Executor executor = C5210l.f53821b;
            abstractC5208j.f(executor, xVar);
            abstractC5208j.d(executor, this.f53840C);
            abstractC5208j.a(executor, this.f53840C);
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                this.f53840C.f53843c.r((Exception) e10.getCause());
            } else {
                this.f53840C.f53843c.r(e10);
            }
        } catch (Exception e11) {
            this.f53840C.f53843c.r(e11);
        }
    }
}
