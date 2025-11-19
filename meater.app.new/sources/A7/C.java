package A7;

import B7.C0910i;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class C implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ C0910i f951B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ D f952C;

    C(D d10, C0910i c0910i) {
        this.f951B = c0910i;
        this.f952C = d10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f951B.f0(this.f952C.f954C);
        this.f951B.f0(this.f952C.f954C.f1038I);
    }
}
