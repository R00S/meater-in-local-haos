package A7;

import B7.H1;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class B implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ H1 f949B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ D f950C;

    B(D d10, H1 h12) {
        this.f949B = h12;
        this.f950C = d10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f950C.f954C.n(this.f949B);
    }
}
