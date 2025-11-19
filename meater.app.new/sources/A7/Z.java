package A7;

import B7.W0;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class Z implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ W0 f1003B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ D f1004C;

    Z(D d10, W0 w02) {
        this.f1003B = w02;
        this.f1004C = d10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1004C.f954C.p(this.f1003B);
    }
}
