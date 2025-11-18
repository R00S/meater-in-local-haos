package z7;

import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class C implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ AbstractC5208j f53790B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ D f53791C;

    C(D d10, AbstractC5208j abstractC5208j) {
        this.f53791C = d10;
        this.f53790B = abstractC5208j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f53791C.f53793b) {
            try {
                D d10 = this.f53791C;
                if (d10.f53794c != null) {
                    d10.f53794c.d((Exception) C3445p.k(this.f53790B.j()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
