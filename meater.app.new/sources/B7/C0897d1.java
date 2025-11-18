package B7;

import A7.InterfaceC0862p;
import A7.InterfaceC0863q;
import android.content.Context;
import com.google.android.gms.common.api.b;
import d7.InterfaceC3051e;
import g7.C3444o;
import java.util.List;
import z7.AbstractC5208j;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0897d1 extends A7.r {

    /* renamed from: k, reason: collision with root package name */
    final InterfaceC0863q f1821k;

    public C0897d1(Context context, b.a aVar) {
        super(context, aVar);
        this.f1821k = new C0888a1();
    }

    @Override // A7.r
    public final AbstractC5208j<List<InterfaceC0862p>> o() {
        com.google.android.gms.common.api.c cVarB = b();
        return C3444o.a(cVarB.a(new Y0((C0888a1) this.f1821k, cVarB)), new C3444o.a() { // from class: B7.b1
            @Override // g7.C3444o.a
            public final Object a(InterfaceC3051e interfaceC3051e) {
                return ((InterfaceC0863q.a) interfaceC3051e).j();
            }
        });
    }
}
