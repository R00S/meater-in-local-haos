package B7;

import e7.InterfaceC3214d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class F1 extends C1 {

    /* renamed from: C, reason: collision with root package name */
    private final List f1725C;

    F1(InterfaceC3214d interfaceC3214d, List list) {
        super(interfaceC3214d);
        this.f1725C = list;
    }

    @Override // B7.BinderC0886a, B7.J0
    public final void B(C0930o1 c0930o1) {
        g(new C0957y(C0959y1.a(c0930o1.f1859B), c0930o1.f1860C));
        if (c0930o1.f1859B != 0) {
            Iterator it = this.f1725C.iterator();
            while (it.hasNext()) {
                ((FutureTask) it.next()).cancel(true);
            }
        }
    }
}
