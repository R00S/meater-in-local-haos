package A7;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class Y implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ DataHolder f1001B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ D f1002C;

    Y(D d10, DataHolder dataHolder) {
        this.f1001B = dataHolder;
        this.f1002C = d10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0854h c0854h = new C0854h(this.f1001B);
        try {
            this.f1002C.f954C.m(c0854h);
        } finally {
            c0854h.c();
        }
    }
}
