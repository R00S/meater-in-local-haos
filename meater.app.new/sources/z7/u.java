package z7;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class u implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ AbstractC5208j f53834B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ v f53835C;

    u(v vVar, AbstractC5208j abstractC5208j) {
        this.f53835C = vVar;
        this.f53834B = abstractC5208j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f53834B.m()) {
            this.f53835C.f53838c.t();
            return;
        }
        try {
            this.f53835C.f53838c.s(this.f53835C.f53837b.a(this.f53834B));
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                this.f53835C.f53838c.r((Exception) e10.getCause());
            } else {
                this.f53835C.f53838c.r(e10);
            }
        } catch (Exception e11) {
            this.f53835C.f53838c.r(e11);
        }
    }
}
