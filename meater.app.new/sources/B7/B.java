package B7;

import A7.AbstractC0853g;
import A7.C0865t;
import A7.InterfaceC0852f;
import A7.InterfaceC0855i;
import android.content.Context;
import com.google.android.gms.common.api.b;
import d7.InterfaceC3051e;
import g7.C3444o;
import z7.AbstractC5208j;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class B extends AbstractC0853g {

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC0852f f1712k;

    public B(Context context, b.a aVar) {
        super(context, aVar);
        this.f1712k = new C0960z();
    }

    @Override // A7.AbstractC0853g
    public final AbstractC5208j<InterfaceC0855i> o(C0865t c0865t) {
        com.google.android.gms.common.api.c cVarB = b();
        return C3444o.a(cVarB.a(new C0954x((C0960z) this.f1712k, cVarB, c0865t)), new C3444o.a() { // from class: B7.A
            @Override // g7.C3444o.a
            public final Object a(InterfaceC3051e interfaceC3051e) {
                return ((InterfaceC0852f.a) interfaceC3051e).y();
            }
        });
    }
}
