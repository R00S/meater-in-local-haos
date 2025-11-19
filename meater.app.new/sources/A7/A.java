package A7;

import B7.P1;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class A implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ P1 f947B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ D f948C;

    A(D d10, P1 p12) {
        this.f947B = p12;
        this.f948C = d10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f948C.f954C.r(this.f947B);
    }
}
