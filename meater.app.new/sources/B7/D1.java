package B7;

import e7.InterfaceC3214d;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class D1 extends C1 {
    public D1(InterfaceC3214d interfaceC3214d) {
        super(interfaceC3214d);
    }

    @Override // B7.BinderC0886a, B7.J0
    public final void W(C0917k0 c0917k0) {
        ArrayList arrayList = new ArrayList();
        List list = c0917k0.f1847C;
        if (list != null) {
            arrayList.addAll(list);
        }
        g(new Z0(C0959y1.a(c0917k0.f1846B), arrayList));
    }
}
