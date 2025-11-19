package A7;

import B7.C0906g1;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class b0 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ C0906g1 f1007B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ D f1008C;

    b0(D d10, C0906g1 c0906g1) {
        this.f1007B = c0906g1;
        this.f1008C = d10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1008C.f954C.u(this.f1007B);
    }
}
