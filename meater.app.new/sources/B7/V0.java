package B7;

import A7.AbstractC0860n;
import A7.InterfaceC0859m;
import android.content.Context;
import com.google.android.gms.common.api.b;
import d7.InterfaceC3051e;
import g7.C3444o;
import z7.AbstractC5208j;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class V0 extends AbstractC0860n {

    /* renamed from: k, reason: collision with root package name */
    final T0 f1796k;

    public V0(Context context, b.a aVar) {
        super(context, aVar);
        this.f1796k = new T0();
    }

    @Override // A7.AbstractC0860n
    public final AbstractC5208j<Integer> o(String str, String str2, byte[] bArr) {
        T0 t02 = this.f1796k;
        com.google.android.gms.common.api.c cVarB = b();
        return C3444o.a(cVarB.a(new Q0(t02, cVarB, str, str2, bArr)), new C3444o.a() { // from class: B7.U0
            @Override // g7.C3444o.a
            public final Object a(InterfaceC3051e interfaceC3051e) {
                return Integer.valueOf(((InterfaceC0859m.a) interfaceC3051e).z());
            }
        });
    }
}
