package A7;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: A7.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC0870y implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ List f1039B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ D f1040C;

    RunnableC0870y(D d10, List list) {
        this.f1039B = list;
        this.f1040C = d10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1040C.f954C.l(this.f1039B);
    }
}
